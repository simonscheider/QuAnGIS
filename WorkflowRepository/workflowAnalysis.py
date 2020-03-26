#-------------------------------------------------------------------------------
# Name:        workflowAnalaysis
# Purpose:      Analyse workflows in RDF, linking toolnodes with tooldescriptions
#
# Author:      Schei008
#
# Created:     26-03-2020
# Copyright:   (c) Schei008 2020
# Licence:     <your licence>
#-------------------------------------------------------------------------------

import rdflib
import os
from pprint import pprint


def n_triples( g, n=None ):
    """ Prints the number of triples in graph g """
    if n is None:
        print( '  Triples: '+str(len(g)) )
    else:
        print( '  Triples: +'+str(len(g)-n) )
    return len(g)


def load_RDF( g, fn ):
    print("load_RDF: "+fn)
    g.parse( fn , format='turtle')
    n_triples(g)
    return g



def getWorkflowGraph(wffile):
    """Reads a separate workflow graph for a workflow file"""
    print("get workflow graph: "+wffile)
    g = rdflib.Graph()
    gout = rdflib.Graph()
    g = load_RDF(g, wffile)
    input  = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input")
    input1 = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input1")
    input2 = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input2")
    for s,p,o in g:
        if p == input1 or p == input2:
            gout.add((s,input,o))
        else:
            gout.add((s,p,o))
    return gout






    return g


def getNeighbours(wg, n, forward=True):
    """Gets neighbors of nodes in a workflow graph, either forward (in the direction of the output(root)) or backward (in the direction of inputs)"""
    objects = []
    output = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#output")
    input = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input")
    if forward:
        for i in (wg.objects(subject=n, predicate=output)):
                objects.append(i)
        for i in (wg.subjects(predicate=input,object=n)):
                objects.append(i)
    else:
        for i in (wg.subjects(predicate=output,object=n)):
                objects.append(i)
        for i in (wg.objects(subject=n,predicate=input)):
                objects.append(i)
    return objects



def getRoot(wg):
    """Gets the root in a (single) workflow graph"""
    start = ''
    output = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#output")
    for s,p,o in (wg.triples((None, output, None))):
        start = s
        break
    objects = getNeighbours(wg,start)
    while (len(objects)>0):
        start = objects[0]
        objects = getNeighbours(wg,start)
    print('Root: '+ start)
    return start

def traversetools(wg, root, toolgraph):
    implements = rdflib.URIRef("http://geographicknowledge.de/vocab/GISTools.rdf#implements")
    nodes = getNeighbours(wg,root,forward=False)
    if len(nodes) > 0:
        node = nodes[0]
        tool = wg.value(node, implements)
        print tool
        describeTool(tool, toolgraph)
        inputs = getNeighbours(wg,node,forward=False)
        for i in inputs:
            traversetools(wg, i, toolgraph)


def getlist(node,g):
    print node
    first = rdflib.URIRef("http://www.w3.org/1999/02/22-rdf-syntax-ns#first")
    rest = rdflib.URIRef("http://www.w3.org/1999/02/22-rdf-syntax-ns#rest")
    f = g.value(node, first)
    print f
    if g.value(node, rest):
        getlist(g.value(node, rest),g)



def describeTool(tool, toolgraph):
    first = rdflib.URIRef("http://www.w3.org/1999/02/22-rdf-syntax-ns#first")
    implements = rdflib.URIRef("http://geographicknowledge.de/vocab/GISTools.rdf#implements")
    algebraex = rdflib.URIRef("http://geographicknowledge.de/vocab/GISTools.rdf#algebraexpression")
    toolimplementations = toolgraph.objects(subject=tool, predicate=implements)
    #toolimplementations2 = toolgraph.triples((None, first, tool))
    for i in toolimplementations:
        print toolgraph.value(i, algebraex)





def graph_to_file( g, output_filepath = None ):
    """ Serializes graph g to an XML/RDF file """
    if not output_filepath:
        _outfn = 'output/workflows_output.rdf'
    else: _outfn = output_filepath
    g.serialize( _outfn )
    print("Written "+str(len(g))+" triples to " + _outfn)



path = r"C:\Users\schei008\.matplotlib\Documents\github\QuAnGIS"
def main():
    g = rdflib.Graph()
    toolgraph = load_RDF( g, os.path.join(path,"ToolRepository/ToolDescription_TransformationAlgebra.ttl") )
    wfg = getWorkflowGraph(os.path.join(path,"WorkflowRepository/amountNoiseAmsterdam/RDF/noiseProPortionAmsterdam.ttl"))
    root = getRoot(wfg)
    traversetools(wfg, root, toolgraph)
    first = rdflib.URIRef("http://www.w3.org/1999/02/22-rdf-syntax-ns#first")
    rest = rdflib.URIRef("http://www.w3.org/1999/02/22-rdf-syntax-ns#rest")
    print "nd now something completely different \n"
    for i in toolgraph.subjects(predicate= first, object=None):
        if (None, rest, i) not in toolgraph:
            getlist(i,toolgraph)






if __name__ == '__main__':
    main()
