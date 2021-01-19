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
from TransformationAlgebraTypedLexer import TransformationAlgebraTypedLexer
from TransformationAlgebraTypedListener import TransformationAlgebraTypedListener
from TransformationAlgebraTypedParser import TransformationAlgebraTypedParser
from antlr4 import *
from antlr4.tree.Trees import Trees
import sys, os, re
import pprint
import json

from pyparsing import *

def toDict(treeasString):
    enclosed = Forward()
    nestedParens = nestedExpr('(', ')', content=enclosed)
    enclosed << (Word(alphanums+'_'+'*'+'-:') | ',' | nestedParens)
    tree =  enclosed.parseString(treeasString).asList()
    #print tree
    return tree

test=[['start', ['fa', ['fa2', ['fc2', ['fb', '-:', ['c', ['r', 'O']]], ['fc1', ['fb', '-:', ['c', ['r', 'O']]], ['c', ['rrr', '*', ['r', 'O'], ['rr', '*', ['r', ['nom', 'Nom']], ['r', 'O']]]]]], ['a2', ['fa', ['fa1', ['fc1', ['fb', '-:', ['c', ['r', ['nom', 'Nom']]]], ['c', ['r', 'O']]], ['a1', ['fa', ['fa0', ['c', ['r', ['nom', 'Nom']]]]]]]], ['a1', ['fa', ['fa0', ['c', ['r', 'O']]]]]]]]]]

#This method does type propagation and type checking within a typed workflow parse tree. It adds inferred types to the workflow nodes and checks for type clashes.
def typePropagation(treeasNestedArray=test):
    print("infer types")
    if treeasNestedArray[0][0] == 'start':
        tree = treeasNestedArray[0][1]
        (inftype, newtree) =typeappl(tree)
        print("inferred type tree: "+str(newtree))

'''This method infers the type of a function application (fa). To this end, it checks recursively 
whether the function body types correspond to the types inferred from the applicants.
If yes, it outputs the function head type.'''
def typeappl(tree):
    assert tree[0]== 'fa'
    bodies = []
    head = []
    applicants = []
    c = tree[1][1]  #concept: '[fc]' function concept or simple [c] concept
    (head, bodies) = getfunctiontypes(c, bodies, head)
    inftype = head
    newtree = [inftype]
    if c[0].__contains__('fc'):  # thus the function is at least unary, then it needs to have also applicants
        a = tree[1][2]  # '[a]' applicant
        assert a[0].__contains__('a')
        (applicants,newtree) = getfunctionapplicants(a, applicants, newtree)
        assert checkconsistency(bodies, applicants)
    print("inferred type of "+str(tree[1][0])+": "+ str(inftype))
    return (inftype, newtree)

'''This method checks whether two lists of nested arrays are equal'''
def checkconsistency(bodies, applicants):
    #print("compare applicants: " + str(applicants))
    #print("to function bodies: " + str(bodies))
    out = True
    for idx,i in enumerate(bodies):
        if i!=applicants[idx]:
            out = False
    print("consistent!") if out else print("inconsistent!")
    return out

'''This method takes a concept tree (function concept or simple concept) and returns the body and head types'''
def getfunctiontypes(ctree, bodies=[], head =[]):
        if ctree[1][1] == '-:': # is an n ary function concept
            bodyconcept = ctree[1][2]  # get function body concept '[c  ]'
            bodies.append(bodyconcept)
            c = ctree[2] # get head concept of the function
            (head, bodies) = getfunctiontypes(c,bodies,head)
        elif ctree[0]== 'c': # is a simple concept
            head = ctree
        return (head, bodies)

'''This method retrieves a list of applicant types from a nested array of applicants'''
def getfunctionapplicants(a, applicants,newtree):
    assert a[1][0] == 'fa'
    fa = a[1]
    (inftype, tree) = typeappl(fa)
    applicants.append(inftype)
    newtree.append(tree)
    if a[0] != "a1":
        (applicants,newtree) = getfunctionapplicants(a[2], applicants,newtree)
    return (applicants,newtree)






# def bracket(tree):
#     out = ''
#     function =False
#     size = len(tree)
#     for ix, node in enumerate(tree):
#         comma = ', ' if function == True and ix >2 else ''
#         if ix ==0:
#             type = node
#         else:
#             if isinstance(node, list):
#                 inner = bracket(node)
#                 out+=comma+inner
#             elif isinstance(node,basestring) :
#                 if ix == 1 and size > 2:
#                     out+= node + '('
#                     function = True
#                 else:
#                     out+= comma+node
#     if function:
#         out+= ')'
#         function = False
#         out +=' :'+type #return type
#     if ix == 1 and isinstance(node,basestring):
#         out +=' :'+type #data type
#     return out

# def latexfunction(string):
#     if '_' in string:
#         under =string.split('_')
#         string = under[0]+'_{'+under[1]+'}'
#     if 'bowtie' in string:
#         string = '$\it{\\bowtie'+string.split('bowtie')[1]+'}$'
#     if 'groupby' in string:
#         string = '$\it{\\beta'+string.split('groupby')[1]+'}$'
#     if 'pi' in string:
#         string = '$\it{\\pi'+string.split('pi')[1]+'}$'
#     string = string.replace('sigmae','$\sigma_{=}$')
#     string = string.replace('sigmale','$\sigma_\\leq$')
#     string = string.replace('sigmage','$\sigma_\\geq$')
#     string = string.replace('*','^*')
#     string = string.replace('1', '^1')
#     string = string.replace('2', '^2')
#     string = string.replace('topo', 'Topo')
#     string = string.replace('dist', 'Dist')
#     return string

# def latextype(string):
#     if 'ord' in string:
#         ord =string.split('ord')
#         if string.endswith('ord'):
#             string = ord[0].upper()+'Ord'
#         elif string.startswith('ord'):
#             string = 'Ord' + ord[1].upper()
#         else:
#             string = ord[0].upper()+'Ord'+ord[1].upper()
#     elif 'nom' in string:
#         ord =string.split('nom')
#         if string.endswith('nom'):
#             string = ord[0].upper()+'Nom'
#         elif string.startswith('nom'):
#             string = 'Nom' + ord[1].upper()
#         else:
#             string = ord[0].upper()+'Nom'+ord[1].upper()
#
#     elif 'int' in string:
#         ord =string.split('int')
#         if string.endswith('int'):
#             string = ord[0].upper()+'Int'
#         elif string.startswith('int'):
#             string = 'Int' + ord[1].upper()
#         else:
#             string = ord[0].upper()+'Int'+ord[1].upper()
#
#     elif 'ratio' in string:
#         ord =string.split('ratio')
#         if string.endswith('ratio'):
#             string = ord[0].upper()+'Ratio'
#         elif string.startswith('ratio'):
#             string = 'Ratio' + ord[1].upper()
#         else:
#             string = ord[0].upper()+'Ratio'+ord[1].upper()
#     elif 'count' in string:
#         ord =string.split('count')
#         if string.endswith('count'):
#             string = ord[0].upper()+'Count'
#         elif string.startswith('count'):
#             string = 'Count' + ord[1].upper()
#         else:
#             string = ord[0].upper()+'Count'+ord[1].upper()
#     elif 'q' in string:
#         ord =string.split('q')
#         if string.endswith('q'):
#             string = ord[0].upper()+'Q'
#         elif string.startswith('q'):
#             string = 'Q' + ord[1].upper()
#         else:
#             string = ord[0].upper()+'Q'+ord[1].upper()
#     else:
#         string = string.upper()
#     return string
#
#
# def latex(tree, level=0):
#     out = ''
#     function =False
#     size = len(tree)
#     indent =  ('$\\vert$\\>'*level) + ''
#     for ix, node in enumerate(tree):
#         comma = indent +', \\\ ' if function == True and ix >2 else ''
#         if ix ==0:
#             type = latextype(node)
#         else:
#             if isinstance(node, list):
#                 incr = 1
#                 if ix == 1:
#                     incr =0
#                 inner = latex(node,level+incr)
#                 out+=comma+inner
#             elif isinstance(node,basestring) :
#                 node = latexfunction(node)
#                 if ix == 1 and size > 2:
#                     out+= indent +node + '( \\\ '
#                     function = True
#                 else:
#
#                     out+= comma+indent +node +(' :'+type if ix == 1 else '') + ' \\\ '
#     if function:
#         out+= indent +')'
#         function = False
#         out +=' :'+type + ' \\\ ' #return type
#     if ix == 1 and isinstance(node,basestring):
#         pass
#         #out +=' :'+type + ' \\\ '#data type
#     return out


# def todict(tree):
#     out = {}
#     function =False
#     size = len(tree)
#     for ix, node in enumerate(tree):
#         comma = ', ' if function == True and ix >2 else ''
#         if ix ==0:
#             type = node
#         else:
#             if isinstance(node, list):
#                 inner = todict(node)
#                 if out != {}:
#                     out['input'+str(ix-1)]=inner
#                 else:
#                     out = inner
#             elif isinstance(node,basestring) :
#                 if ix == 1 and size > 2:
#                     out['function']= node
#                     function = True
#                 else:
#                     out['input'+str(ix-1)]=node
#     if function:
#         function = False
#         out['type']=type #return type
#     if ix == 1 and isinstance(node,basestring):
#         out['type']=type #data type
#     #print out
#     return out

def parsewithTypeGrammar(line):
    input = InputStream(line)
    # lexer = TransformationAlgebraLexer(input)
    lexer = TransformationAlgebraTypedLexer(input)
    stream = CommonTokenStream(lexer)
    # Parse all tokens until EOF
    stream.fill()
    # Print tokens as text (EOF is stripped from the end)
    # print([token.text for token in stream.tokens][:-1])
    # parser = TransformationAlgebraParser(stream)
    parser = TransformationAlgebraTypedParser(stream)
    tree = parser.start()
    # print tree.getChildCount()
    treeasString = Trees.toStringTree(tree, None, parser)
    # print(treeasString)
    treearray = toDict(treeasString)
    print(treearray)
    return treearray

'''This method takes a workflow in terms of an algebra expression and a list of function names with their algebra types, 
and substitutes function calls with their types. The typed expression can then be parsed by the algebra type grammar and the 
nodes in the tree can be typed by the type inference engine.'''
def typeFunctions(line, dataypes,functiontypes):
    sline = line.split()
    newline = ''
    print(sline)
    lastkeyword = ''
    for i, e in reversed(list(enumerate(sline))):
        if e in dataypes.keys():
            newline = ' ' + dataypes[e] + newline
        elif e+' KEYWORD' in dataypes.keys():
            newline = ' ' + dataypes[e+' KEYWORD'] + newline
        elif e+' DATAV' in dataypes.keys():
            newline = ' ' + dataypes[e+' DATAV'] + newline
        elif e in functiontypes.keys():
            for t in functiontypes[e]:
                print(t + newline)
        else:
            pass



'''This method reads a list of function types given in the typefile into dictionaries. Each line is a type declaration of some function. 
For example: 
//Value Derivations
'-: RatioV -: RatioV RatioV' : 'ratio'  ;'''
def readFunctionTypes(typefile):
    functiontypes = {}
    datatypes = {}
    with open(typefile) as fp:
        line = fp.readline()
        #print(line)
        while line:
            line = (line.partition('//')[0]).strip()
            if line is not None and line != '':
                #print(line.split(' : '))
                type = (line.split(' : ')[0]).strip().replace('\'', '')
                expr = (line.split(' : ')[1]).strip(';').strip().split()
                expr1 =  expr[0].replace('\'', '')
                if len(expr)== 2:
                    expr2 = expr[1].strip()
                    expr1 = expr1 + " " + expr2
                if type.startswith('-:'):
                    if expr1 not in functiontypes.keys():
                        functiontypes[expr1] = [type]
                    else:
                        functiontypes[expr1].append(type)
                else:
                    datatypes[expr1] = type
            line = fp.readline()
    fp.close()
    print(datatypes)
    print(functiontypes)
    return (datatypes, functiontypes)



def parse(line, datatypes,functiontypes, format=json):
    print("parse: " + line)
    typeFunctions(line,datatypes,functiontypes)
    #treearray = parsewithTypeGrammar(line)
    #typePropagation(treearray)

    #pp = pprint.PrettyPrinter(indent=2)
    #outjson = todict(treearray)
    #outbracket = bracket(treearray)
    #json.dumps(treearray, cls=PyParseEncoder, sort_keys=False, indent=2)

    #print(outbracket)
    #print outlatex
    return line #(outjson if format==json else outbracket)

def readwrite(file, datatypes,functiontypes):
    base = os.path.basename(file).split('.')[0]
    outfile = os.path.join(path,base+'.json')
    lines = []
    with open(file) as fp:
        line = fp.readline()
        while line:
            lines.append(parse(line.rstrip(), datatypes,functiontypes))
            line = fp.readline()
        fp.close()
    with open(outfile, 'w') as fout:
        json.dump(lines, fout)
        fout.close()

def main(file):
    (datatypes, functiontypes) = readFunctionTypes(os.path.join(path, 'TransformationAlgebraTypes.txt'))
    readwrite(file, datatypes,functiontypes)



path = r"C:\Users\schei008\.matplotlib\Documents\github\QuAnGIS\TransformationAlgebra\AlgebraParsers"
if __name__ == '__main__':
    #main(sys.argv)
    main(os.path.join(path,'test.txt'))
    #main(os.path.join(path,'testTyped.txt'))