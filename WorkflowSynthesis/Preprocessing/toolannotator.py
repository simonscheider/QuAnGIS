#-------------------------------------------------------------------------------
# Name:        Tool Annotator
# Purpose:      Takes an RDF based specification of tools with typed inputs and outputs
#               and turns it into an tool description in JSON according to the APE format
#
# Author:      Schei008
#
# Created:     22-03-2019
# Copyright:   (c) Schei008 2019
# Licence:     MIT
#-------------------------------------------------------------------------------


import rdflib
from rdflib.namespace import RDFS, RDF, OWL
import os



import json

TOOLS=rdflib.Namespace("http://geographicknowledge.de/vocab/GISTools.rdf#")
WF= rdflib.Namespace("http://geographicknowledge.de/vocab/Workflow.rdf#")
CCD= rdflib.Namespace("http://geographicknowledge.de/vocab/CoreConceptData.rdf#")

# def prettify(elem):
#     """Return a pretty-printed XML string for the Element.
#     """
#     rough_string = ElementTree.tostring(elem, 'utf-8')
#     reparsed = minidom.parseString(rough_string)
#     return reparsed.toprettyxml(indent="  ")


def setprefixes(g):
    g.bind('foaf', 'http://xmlns.com/foaf/0.1/')
    g.bind( 'ccd', 'http://geographicknowledge.de/vocab/CoreConceptData.rdf#')
    g.bind( 'owl', 'http://www.w3.org/2002/07/owl#')
    g.bind( 'rdf', 'http://www.w3.org/1999/02/22-rdf-syntax-ns#')
    g.bind( 'xml', 'http://www.w3.org/XML/1998/namespace')
    g.bind( 'xsd', 'http://www.w3.org/2001/XMLSchema#')
    g.bind( 'rdfs', 'http://www.w3.org/2000/01/rdf-schema#')
    g.bind('em', 'http://geographicknowledge.de/vocab/ExtensiveMeasures.rdf#')
    g.bind('ada', 'http://geographicknowledge.de/vocab/AnalysisData.rdf#')
    g.bind('wf', 'http://geographicknowledge.de/vocab/Workflow.rdf#')
    g.bind('gis', 'http://geographicknowledge.de/vocab/GISConcepts.rdf#')
    g.bind('tools', 'http://geographicknowledge.de/vocab/GISTools.rdf#')
    return g

"""Helper stuff"""
def load_rdf( g, rdffile, format='turtle' ):
    #print("load_ontologies")
        #print("  Load RDF file: "+fn)
    g.parse( rdffile, format = format )
    n_triples(g)
    return g


def n_triples( g, n=None ):
    """ Prints the number of triples in graph g """
    if n is None:
        print(( '  Triples: '+str(len(g)) ))
    else:
        print(( '  Triples: +'+str(len(g)-n) ))
    return len(g)


def shortURInames(URI):
    if shortenURIs:
        if "#" in URI:
            return URI.split('#')[1]
        else:
            return os.path.basename(os.path.splitext(URI)[0])
    else:
        return URI

"""Returns a list of types of some tool input/output which are all projected to given semantic dimension"""
def getinoutypes(g, predicate, subject, project, dimix, dim, mainprefix, dodowncast =False):    
    inoutput = g.value(predicate = predicate, subject = subject, any = False)
    if not inoutput:
        raise Exception(f'Could not find object with subject {subject} and predicate {predicate}!')
    outputtypes = []
    for outputtype in g.objects(inoutput, RDF.type):
        if outputtype is not None and outputtype in project:
            if project[outputtype][dimix] is not None:
                outputtypes.append(project[outputtype][dimix])      
    if dodowncast: #Downcast is used to enforce leaf nodes for types. Is used to make annotations as specific as possible, used only for output nodes
            outputtypes = [downcast(t) for t in outputtypes]    
    out = [shortURInames(t) if str(mainprefix) in t else t for t in outputtypes]
    if out == []: #In case there is no type, just use the highest level type of the corresponding dimension
        if dodowncast:
            out = [shortURInames(downcast(dim))]
        else:
            out = [shortURInames(dim)]
    return out

"""Read the tool annotations from the TTL file, project them to semantic dimensions and return a string
representation in JSON format that APE understands."""
def getToollistasDict(toolsinrdf, project, dimnodes, mainprefix):   
    toollist= {'functions': []}
    trdf = load_rdf(rdflib.Graph(), toolsinrdf)
    trdf = setprefixes(trdf)
    tools = [tool for tool in trdf.objects(None, TOOLS.implements)]
    for t in tools:
        inputs = []        
        for p in [WF.input1, WF.input2, WF.input3]:
            if trdf.value(subject=t, predicate=p, default=None) != None:
                d = {}
                for ix,dim in enumerate(dimnodes):      
                    d[shortURInames(dim)] = getinoutypes(trdf, p, t, project, ix, dim,mainprefix)                
                inputs += [d]
        outputs = []
        for p in [WF.output, WF.output2, WF.output3]:
            if trdf.value(subject=t, predicate=p, default=None) != None:
                d = {}
                for ix,dim in enumerate(dimnodes):
                    d[shortURInames(dim)] = getinoutypes(trdf, p, t, project, ix, dim,mainprefix, dodowncast =True)     #Tool outputs should always be downcasted
                outputs += [d]
        
        name = shortURInames(t)
        toolobj ={'id': t, 'label': name}
        toolobj['inputs']= inputs
        toolobj['outputs']= outputs
        toolobj['taxonomyOperations'] = [t]
        toollist['functions'].append(toolobj)
        print(toolobj)
    return toollist

def downcast(node):
    #A function that downcasts certain nodes to identifiable leafnodes. This is good practice to prevent APE from considering too many subnodes
    if node == CCD.NominalA:
        return CCD.PlainNominalA
    elif node == CCD.OrdinalA:
        return CCD.PlainOrdinalA
    elif node == CCD.IntervalA:
        return CCD.PlainIntervalA
    elif node == CCD.RatioA:
        return CCD.PlainRatioA
    else:
        return node
    
        
        

shortenURIs = True #Parameter should be set to true
def main(toolsinrdf, project, dimnodes, mainprefix=CCD, targetfolder='../test'):
    """Read tool annotations from TTL file, project them with the projection function, convert it to a dictionary that
    APE understands, and write it to a JSON file."""

    dict_form = getToollistasDict(toolsinrdf, project, dimnodes, mainprefix)
    outpath = os.path.join(targetfolder,os.path.splitext(os.path.basename(toolsinrdf))[0]+".json")
    #outpath = os.path.splitext(toolsinrdf)[0]+".json"
    with open(outpath, 'w') as f:
        json.dump(dict_form, f, sort_keys=True, indent=2)


if __name__ == '__main__':
    main()
