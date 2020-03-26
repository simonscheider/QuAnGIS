#-------------------------------------------------------------------------------
# Name:        parseTA
# Purpose:     Python script for parsing a textfile of lines written in "TransformationAlgebra.g4" to make use of the parse tree.
#              The parse tree is read and turned into different forms (typed workflow string, latex, json).
#
# Author:      Schei008
#
# Created:     29-02-2020
# Copyright:   (c) Schei008 2020
# Licence:     MIT
#-------------------------------------------------------------------------------


from TransformationAlgebraLexer import TransformationAlgebraLexer
from TransformationAlgebraListener import TransformationAlgebraListener
from TransformationAlgebraParser import TransformationAlgebraParser
from antlr4 import *
from antlr4.tree.Trees import Trees
import sys, os, re
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
    return out

def latexfunction(string):
    if '_' in string:
        under =string.split('_')
        string = under[0]+'_{'+under[1]+'}'
    if 'bowtie' in string:
        string = '$\it{\\bowtie'+string.split('bowtie')[1]+'}$'
    if 'groupby' in string:
        string = '$\it{\\beta'+string.split('groupby')[1]+'}$'
    if 'pi' in string:
        string = '$\it{\\pi'+string.split('pi')[1]+'}$'
    string = string.replace('sigmae','$\sigma_{=}$')
    string = string.replace('sigmale','$\sigma_\\leq$')
    string = string.replace('sigmage','$\sigma_\\geq$')
    string = string.replace('*','^*')
    string = string.replace('1', '^1')
    string = string.replace('2', '^2')
    string = string.replace('topo', 'Topo')
    string = string.replace('dist', 'Dist')
    return string

def latextype(string):
    if 'ord' in string:
        ord =string.split('ord')
        if string.endswith('ord'):
            string = ord[0].upper()+'Ord'
        elif string.startswith('ord'):
            string = 'Ord' + ord[1].upper()
        else:
            string = ord[0].upper()+'Ord'+ord[1].upper()
    elif 'nom' in string:
        ord =string.split('nom')
        if string.endswith('nom'):
            string = ord[0].upper()+'Nom'
        elif string.startswith('nom'):
            string = 'Nom' + ord[1].upper()
        else:
            string = ord[0].upper()+'Nom'+ord[1].upper()

    elif 'int' in string:
        ord =string.split('int')
        if string.endswith('int'):
            string = ord[0].upper()+'Int'
        elif string.startswith('int'):
            string = 'Int' + ord[1].upper()
        else:
            string = ord[0].upper()+'Int'+ord[1].upper()

    elif 'ratio' in string:
        ord =string.split('ratio')
        if string.endswith('ratio'):
            string = ord[0].upper()+'Ratio'
        elif string.startswith('ratio'):
            string = 'Ratio' + ord[1].upper()
        else:
            string = ord[0].upper()+'Ratio'+ord[1].upper()
    elif 'count' in string:
        ord =string.split('count')
        if string.endswith('count'):
            string = ord[0].upper()+'Count'
        elif string.startswith('count'):
            string = 'Count' + ord[1].upper()
        else:
            string = ord[0].upper()+'Count'+ord[1].upper()
    elif 'q' in string:
        ord =string.split('q')
        if string.endswith('q'):
            string = ord[0].upper()+'Q'
        elif string.startswith('q'):
            string = 'Q' + ord[1].upper()
        else:
            string = ord[0].upper()+'Q'+ord[1].upper()
    else:
        string = string.upper()
    return string


def latex(tree, level=0):
    out = ''
    function =False
    size = len(tree)
    indent =  ('$\\vert$\\>'*level) + ''
    for ix, node in enumerate(tree):
        comma = indent +', \\\ ' if function == True and ix >2 else ''
        if ix ==0:
            type = latextype(node)
        else:
            if isinstance(node, list):
                incr = 1
                if ix == 1:
                    incr =0
                inner = latex(node,level+incr)
                out+=comma+inner
            elif isinstance(node,basestring) :
                node = latexfunction(node)
                if ix == 1 and size > 2:
                    out+= indent +node + '( \\\ '
                    function = True
                else:

                    out+= comma+indent +node +(' :'+type if ix == 1 else '') + ' \\\ '
    if function:
        out+= indent +')'
        function = False
        out +=' :'+type + ' \\\ ' #return type
    if ix == 1 and isinstance(node,basestring):
        pass
        #out +=' :'+type + ' \\\ '#data type
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
    #print([token.text for token in stream.tokens][:-1])
    parser = TransformationAlgebraParser(stream)
    tree = parser.start()
    #print tree.getChildCount()
    treeasString = Trees.toStringTree(tree, None, parser)
    #print(treeasString)
    treearray = toNestedArray(treeasString)

    #pp = pprint.PrettyPrinter(indent=2)
    outjson = todict(treearray)
    outbracket = bracket(treearray)
    outlatex = latex(treearray)
    print outbracket
    #print outlatex
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