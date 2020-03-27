#-------------------------------------------------------------------------------
# Name:        workflowAnalysis
# Purpose:     Analyse some workflow in RDF, linking toolnodes with tooldescriptions
#
# Author:      Schei008
#
# Created:     26-03-2020
# Copyright:   (c) Schei008 2020
# Licence:     MIT
#-------------------------------------------------------------------------------

import rdflib
import logging
#logging.basicConfig()
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

def getTooldescriptions(toolfile):
    print("load tool descriptions:")
    g = rdflib.Graph()
    load_RDF(g, toolfile)
    return g


def getWorkflowGraph(wffile):
    """Reads a separate workflow graph for a workflow file"""
    print("load workflow graph:")
    g = rdflib.Graph()
    gout = rdflib.Graph()
    g = load_RDF(g, wffile)
    #Here we substitute ordered inputs with a single input property to make search easier
    input  = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input")
    input1 = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input1")
    input2 = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input2")
    input3 = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#input3")
    for s,p,o in g:
        if p == input1 or p == input2 or p == input3:
            gout.add((s,input,o))
        else:
            gout.add((s,p,o))
    return gout


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
    print('Root of the workflow: '+ start)
    return start

def traversetools(wg, root, toolgraph):
    applicationOf = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#applicationOf")
    nodes = getNeighbours(wg,root,forward=False)
    if len(nodes) > 0:
        node = nodes[0]
        tool = wg.value(node, applicationOf)
        describeTool(tool, toolgraph)
        inputs = getNeighbours(wg,node,forward=False)
        for i in inputs:
            traversetools(wg, i, toolgraph)



def describeTool(tool, toolgraph):
    print "... Tool:"
    print tool
    first = rdflib.URIRef("http://www.w3.org/1999/02/22-rdf-syntax-ns#first")
    applicationOf = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#applicationOf")
    edge = rdflib.URIRef("http://geographicknowledge.de/vocab/Workflow.rdf#edge")
    implements = rdflib.URIRef("http://geographicknowledge.de/vocab/GISTools.rdf#implements")
    algebraex = rdflib.URIRef("http://geographicknowledge.de/vocab/GISTools.rdf#algebraexpression")

    toolimplementations = []
    print "Available tool descriptions:"
    toolworkflows = []
    #toolimplementations2 = toolgraph.triples((None, first, tool))
    for t in toolgraph.subjects(predicate=edge, object=None):
        if (t, edge/applicationOf, tool) in toolgraph:
            if t not in toolworkflows:
                print "... as part of larger workflow: " + t
                toolworkflows.append(t)
                for tt in toolgraph.objects(subject=t, predicate=implements):
                    print "(typed tool: "+tt +")"
                    print toolgraph.value(tt, algebraex)
    for i in toolgraph.objects(subject=tool, predicate=implements):
        print "... as single tool:"
        print toolgraph.value(i, algebraex)
        break


path = "../" #data needs to be accessed one folder up in QuAnGIS
def main():
    #First we load tool descriptions
    toolgraph =getTooldescriptions(os.path.join(path,"ToolRepository/ToolDescription_TransformationAlgebra.ttl"))
    #Now we load workflows
    #wfg = getWorkflowGraph(os.path.join(path,"WorkflowRepository/amountNoiseAmsterdam/RDF/noiseProPortionAmsterdam.ttl"))
    #wfg = getWorkflowGraph(os.path.join(path,"WorkflowRepository/amountNoiseAmsterdam/RDF/noisePortionAmsterdam.ttl"))
    #wfg = getWorkflowGraph(os.path.join(path,"WorkflowRepository/amountFieldUtrecht/RDF/amountFieldUtrecht.ttl"))
    wfg = getWorkflowGraph(os.path.join(path,"WorkflowRepository/amountObjectsUtrecht/RDF/amountObjectsUtrecht.ttl"))
    #getting the root node of the workflow
    root = getRoot(wfg)
    #Traversing tools in the workflow and deting their descriptions
    traversetools(wfg, root, toolgraph)



if __name__ == '__main__':
    main()
