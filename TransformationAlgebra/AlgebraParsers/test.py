#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Schei008
#
# Created:     29-02-2020
# Copyright:   (c) Schei008 2020
# Licence:     <your licence>
#-------------------------------------------------------------------------------


from TransformationAlgebraLexer import TransformationAlgebraLexer
from TransformationAlgebraListener import TransformationAlgebraListener
from TransformationAlgebraParser import TransformationAlgebraParser
from antlr4 import *
import sys

class TransformationAlgebraParser(object):
    """
    Debugger class - accepts a single input script and processes
    all subsequent requirements
    """
def __init__(self): # this method creates the class object.
    pass


#function used to parse an input file
def parse(argv):
    if len(argv) > 1:
        input = FileStream(argv) #read the first argument as a filestream
        lexer = TransformationAlgebraLexer(input) #call your lexer
        stream = CommonTokenStream(lexer)
        parser = TransformationAlgebraParser(stream)
        tree = parser.start() #start from the parser rule, however should be changed to your entry rule for your specific grammar.
        printer = TransformationAlgebraListener(tree,input)
        walker = ParseTreeWalker()
        walker.walk(printer, tree)
    else:
        print('Error : Expected a valid file')

def main():
    parse(r'C:\Users\schei008\.matplotlib\Documents\github\QuAnGIS\TransformationAlgebra\AlgebraParsers\test.txt')




if __name__ == '__main__':
    main()
