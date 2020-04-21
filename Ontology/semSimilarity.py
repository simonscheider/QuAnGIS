# -*- coding: utf-8 -*-
"""
Created on Tue Apr 21 08:15:51 2020
Script to compute semantic similarity in an OWL ontology. Reads the ontology, extracts rdfs:subClassOf statements, 
turns it into a tree defined by a root node (note: not unique, so changes randomly), and computes similarity measures based on least-common subsumer (LCS)

@author: Schei008
"""

import rdflib
from rdflib.namespace import RDFS, RDF, OWL
from rdflib import BNode
import os


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

CCD= rdflib.Namespace("http://geographicknowledge.de/vocab/CoreConceptData.rdf#")
def shortURInames(URI):
    if URI is None:
        return None
    elif "#" in URI:
        return URI.split('#')[1]
    else:
        return os.path.basename(os.path.splitext(URI)[0])
                      
"""This method takes some ontology in Turtle and returns a taxonomy (consisting only of rdfs:subClassOf statements)"""
def cleanOWLOntology(ontologyfile= 'CoreConceptData.ttl'): #This takes the combined types version as input
    print('Clean OWL ontology!')
    ccdontology = load_rdf(rdflib.Graph(),ontologyfile)   
    taxonomy = rdflib.Graph()
    print('Extracting subClassOf triples:')
    taxonomy += ccdontology.triples( (None, RDFS.subClassOf, None) ) #Keeping only subClassOf statements and classes
    taxonomy += ccdontology.triples( (None, RDF.type, OWL.Class) )
    n_triples(taxonomy)
    print('Cleaning blank node triples and loops, as well as nodes intersecting more than 1 dimenion')
    taxonomyclean = rdflib.Graph()
    for (s,p,o) in taxonomy: #Removing triples that stem from blanknodes as well as loops        
        if type(s) != BNode and type(o) != BNode:
            if s != o and  s!= OWL.Nothing:                 
                #if p==RDFS.subClassOf: #Removing nodes intersecting with more or less than one of the given dimensions
                #   if testDimensionality(s,dimnodes,taxonomy)==1:
                taxonomyclean.add((s,p,o))             
            
    n_triples(taxonomyclean) 
    return taxonomyclean


"""Measures the size of a taxonomy's set of nodes and detects leaf nodes"""        
def measureTaxonomy(g):
    leafnodes = set()
    nodes = list(g.subjects(predicate=RDFS.subClassOf,object=None) )   
    count= 0                            
    for node in nodes:
        count +=1                     
        if not (None,RDFS.subClassOf,node) in g:
            leafnodes.add(node)            
    print("size of taxonomy without roots: "+str(count))
    print("leafnodes: "+str([shortURInames(l) for l in leafnodes])) 
    return (nodes,leafnodes)  

"""This method takes a taxonomy (a graph of raw subsumption relations) and an arbitrary root and generates 
a tree with unique parent relations towards the root for each node. Uses rdflib's built in get_tree. Note: not unique!"""        
def getSubsumptionTree(g,root, leafnodes):
    print("Root node: "+root)
    tuplelisttree =  rdflib.util.get_tree(g,root, RDFS.subClassOf)
    nodedepth = {}
    parent= {}     
    visitednodes = set()  
    
    depth = 1 #Root node has depth 1
    tuple = tuplelisttree
    #print(tuplelisttree)
    #This traverses the tree to generate depth and parent dictionaries
    traverse(tuple, depth, nodedepth, parent, visitednodes)   
    
    print("size of tree: " +str(len(nodedepth.keys())))
    depth = max(nodedepth.values())
    print("depth of tree: "+str(depth))
    #This prints out the path to the root for each visited leafnode, just to test the method
    for n in leafnodes.intersection(visitednodes):
        print(nodedepth[n])
        print(n)
        backtrack(parent,n)  
    return (nodedepth,parent)
       
def traverse(tuple, depth, nodedepth, parent, visitednodes):
    current =tuple[0]
    nodedepth[current] = depth   
    visitednodes.add(current)    
    for child in tuple[1]:        
            parent[child[0]]=current
            traverse(child,depth+1,nodedepth, parent,visitednodes)
                     
def backtrack(parent,leaf):
    node = leaf
    while node in parent.keys() and node is not None :        
        node = parent[node]
        print(shortURInames(node))
        
"""Computes the least common subsumer  for two concepts in a given taxonomy tree"""   
def LCS(parent, c1, c2):
    print("Getting LCS of "+shortURInames(c1) +" and "+shortURInames(c2) +"... ")
    node1 = c1
    while node1 in parent.keys() and node1 is not None :  
        node2 = c2
        while node2 in parent.keys() and node2 is not None :
            if node1 == node2:
                return node1
                break
            node2 = parent[node2]
        node1 = parent[node1]
    return None

"""Simple path-based similarity measure"""
def pathSim(nodedepth, parent, c1, c2):
    print("\n Measuring path distance between "+shortURInames(c1) +" and "+ shortURInames(c2))
    lcs = LCS(parent, c1, c2)
    print(shortURInames(lcs))
    dc1 = nodedepth[c1]
    print("Depth of "+shortURInames(c1)+": "+str(dc1))
    dc2= nodedepth[c2]
    print("Depth of "+shortURInames(c2)+": "+str(dc2))
    print("Depth of "+shortURInames(lcs)+": "+str(nodedepth[lcs]))
    return (dc1-nodedepth[lcs])+(dc2-nodedepth[lcs])   
    
    
            

def main(ontologyfile= 'CoreConceptData.ttl',c1=CCD.Lattice, c2=CCD.Coverage):
    #First get a taxonomy of subsumption relations
    taxonomy= cleanOWLOntology(ontologyfile)
    #Get leafnodes
    (nodes,leafnodes) = measureTaxonomy(taxonomy)
    #Turn taxonomy into a tree
    (nodedepth,parent) = getSubsumptionTree(taxonomy, CCD.Attribute, leafnodes)  
    #measure similarity  between nodes in tree    
    print(pathSim(nodedepth, parent, c1, c2))
    
    
    
    
        
                    

if __name__ == '__main__':
    main()            
     
         