given: grammar.g4

with python:

pip install antlr4-python2-runtime (or python3)
antlr4 -Dlanguage=Python2 grammar.g4

with java (to test):

antlr4 grammar.g4
javac grammar*.java
grun grammar startrule -tree (or -gui, -tokens) "Test to be parsed"

