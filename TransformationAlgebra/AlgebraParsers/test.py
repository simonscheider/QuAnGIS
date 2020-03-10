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
from antlr4.tree.Trees import Trees
import sys

from pyparsing import *


def toNestedArray(treeasString):
    enclosed = Forward()
    nestedParens = nestedExpr('(', ')', content=enclosed)
    enclosed << (Word(alphanums+'.'+'_') | ',' | nestedParens)
    tree =  enclosed.parseString(treeasString).asList()[0]
    #print tree
    return tree






def parse(line):
    input = InputStream(line)
    print
    print input
    lexer = TransformationAlgebraLexer(input)
    stream = CommonTokenStream(lexer)
    # Parse all tokens until EOF
    stream.fill()
    # Print tokens as text (EOF is stripped from the end)
    print([token.text for token in stream.tokens][:-1])
    parser = TransformationAlgebraParser(stream)
    tree = parser.start()
    #print tree.getChildCount()
    treeasString = Trees.toStringTree(tree, None, parser)
    print(treeasString)
    toNestedArray(treeasString)


def main(argv):
    with open(argv) as fp:
        line = fp.readline()
        while line:
            parse(line.rstrip())
            line = fp.readline()
        fp.close()


if __name__ == '__main__':
    #main(sys.argv)
    main('test.txt')