# Grammar of the Core Concept Transformation (CTT) Algebra.

The algebra can be used for describing and formalizing transformations (abstract workflows) of spatial information with GIS functions. 

* *TransformationAlgebra.g4* contains a corresponding antlr4 grammar (under development).
* *test.txt* contains one algebra expression (abstract workflow) per line.
* *ParseTA.py* contains a parse script that parses each line written in *test.txt* in terms of the algebra, and turns each parse tree into a workflow into a typed form. The parsed and typed workflows are stored in json format into *test.json* in the same order.

The grammar is written in Antlr.

## Usage of grammar with antlr4 to compile parser
given: grammar.g4

### with python:
```
pip install antlr4-python2-runtime (or python3)
antlr4 -Dlanguage=Python2 grammar.g4
```

### with java (to test with arbitrary input):
```
antlr4 grammar.g4
javac grammar*.java
grun grammar startrule -tree (or -gui, -tokens) 
"Test string to be parsed"
Ctrl+Z
```

