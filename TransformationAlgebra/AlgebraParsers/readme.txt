# This folder contains a grammar of the Geo-analytical Transformation Algebra.

The algebra can be used for describing and formalizing transformations of spatial information with GIS functions. 

## Usage of grammar witrh antlr4 (to generate parser)
given: grammar.g4

with python:

pip install antlr4-python2-runtime (or python3)
antlr4 -Dlanguage=Python2 grammar.g4

with java (to test):

antlr4 grammar.g4
javac grammar*.java
grun grammar startrule -tree (or -gui, -tokens) "Test to be parsed"

