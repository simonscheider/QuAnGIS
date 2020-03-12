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
import sys, os
import pprint
import json

from pyparsing import *


def toNestedArray(treeasString):
    enclosed = Forward()
    nestedParens = nestedExpr('(', ')', content=enclosed)
    enclosed << (Word(alphanums+'_'+'*') | ',' | nestedParens)
    tree =  enclosed.parseString(treeasString).asList()[0]
    #print tree
    return tree

def bracket(tree):
    out = ''
    function =False
    size = len(tree)
    for ix, node in enumerate(tree):
        comma = ', ' if function == True and ix >2 else ''
        if ix ==0:
            type = node
        else:
            if isinstance(node, list):
                inner = bracket(node)
                out+=comma+inner
            elif isinstance(node,basestring) :
                if ix == 1 and size > 2:
                    out+= node + '('
                    function = True
                else:
                    out+= comma+node
    if function:
        out+= ')'
        function = False
        out +=' :'+type #return type
    if ix == 1 and isinstance(node,basestring):
        out +=' :'+type #data type
    #print out
    return out


def todict(tree):
    out = {}
    function =False
    size = len(tree)
    for ix, node in enumerate(tree):
        comma = ', ' if function == True and ix >2 else ''
        if ix ==0:
            type = node
        else:
            if isinstance(node, list):
                inner = todict(node)
                if out != {}:
                    out['input'+str(ix-1)]=inner
                else:
                    out = inner
            elif isinstance(node,basestring) :
                if ix == 1 and size > 2:
                    out['function']= node
                    function = True
                else:
                    out['input'+str(ix-1)]=node
    if function:
        function = False
        out['type']=type #return type
    if ix == 1 and isinstance(node,basestring):
        out['type']=type #data type
    #print out
    return out



def parse(line, format=json):
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
    treearray = toNestedArray(treeasString)

    #pp = pprint.PrettyPrinter(indent=2)
    outjson = todict(treearray)
    outbracket = bracket(treearray)
    #print
    #pp.pprint()
    return (outjson if format==json else outbracket)



def main(file):
    base = os.path.basename(file).split('.')[0]
    outfile = base+'.json'
    lines = []
    with open(file) as fp:
        line = fp.readline()
        while line:
            lines.append(parse(line.rstrip()))
            line = fp.readline()
        fp.close()
    with open(outfile, 'w') as fout:
        json.dump(lines, fout)
        fout.close()



if __name__ == '__main__':
    #main(sys.argv)
    main('test.txt')