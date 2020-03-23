# Grammar of the Geo-analytical Transformation Algebra.

The algebra can be used for describing and formalizing transformations of spatial information with GIS functions. 

* *TransformationAlgebra.g4* contains the antlr4 grammar (under development).
* *ParseTA.py* contains a parse script that parses the lines written in *test.txt* in terms of the algebra, and turns workflows into a typed form.

## Usage of grammar witrh antlr4 to compile parser
* given: grammar.g4

### with python:

* pip install antlr4-python2-runtime (or python3)
* antlr4 -Dlanguage=Python2 grammar.g4

### with java (to test with arbitrary input):

* antlr4 grammar.g4
* javac grammar*.java
* grun grammar startrule -tree (or -gui, -tokens) "Test to be parsed"

