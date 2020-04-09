#-------------------------------------------------------------------------------
# Name:        pipeWorkFlowInput.py
# Purpose:      generates input data for workflow generator (APE) from a given OWL
#                data ontology by projecting classes in tool annotation file to ontology dimensions.
#
# Author:      Schei008
#
# Created:     08-04-2020
# Copyright:   (c) Schei008 2020
# Licence:     MIT
#-------------------------------------------------------------------------------


import cleanWfTaxonomy, toolannotator, projectSemDimensions
import rdflib

CCD= rdflib.Namespace("http://geographicknowledge.de/vocab/CoreConceptData.rdf#")

def pipe(tooldescfile = 'ToolDescription.ttl', ontologyfile = 'CoreConceptData.ttl'):
    
    dimnodes=[CCD.CoreConceptQ,CCD.LayerA,CCD.NominalA]    
    #Generates a taxonomy (_tax) version of the ontology as well as of the given tool hierarchy (=subClassOf), by applying reasoning and removing all other statements
    cleanWfTaxonomy.main(ontologyfile=ontologyfile, tooldesc=tooldescfile)
    #Computes a projection of classes to any of a given set of dimensions given by superconcepts in the type taxonomy file
    project = projectSemDimensions.main(taxonomy='CoreConceptData_tax.ttl',dimnodes=dimnodes)
    #print(project)    
    
    final = rdflib.Graph()
    final.parse('CoreConceptData_tax.ttl', format='turtle')
    final.parse('ToolDescription_tax.ttl', format='turtle')
    final.serialize(destination='GISTaxonomy.rdf', format = "application/rdf+xml")
    #Then generates a JSON version of the tooldescription for the full taxonomy (to be used with GISTaxonomy.rdf)
    toolannotator.main(tooldescfile, project, dimnodes)
   
   
def main():
    pipe()




if __name__ == '__main__':
    main()
