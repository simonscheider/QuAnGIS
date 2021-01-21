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
import unicodedata

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
def typeInference(treeasNestedArray=test):
    print("infer types")
    if treeasNestedArray[0][0] == 'start':
        tree = treeasNestedArray[0][1]
        (cons,newtree) =typeappl(tree)
        print("inconsistent: " + str(cons))
        print("inferred type tree: "+str(newtree))
        return cons

'''This method infers the type of a function application (fa). To this end, it checks recursively 
whether the function body types correspond to the types inferred from the applicants.
If yes, it outputs the function head type.'''
def typeappl(tree):
    assert tree[0]== 'fa'
    bodies = []
    head = []
    cons= 0
    applicants = []
    c = tree[1][1]  #concept: '[fc]' function concept or simple [c] concept
    (head, bodies) = getfunctiontypes(c, bodies, head)
    inftype = head
    newtree = [inftype]
    if c[0].__contains__('fc'):  # thus the function is at least unary, then it needs to have also applicants
        a = tree[1][2]  # '[a]' applicant
        assert a[0].__contains__('a')
        (applicants,newtree, cons) = getfunctionapplicants(a, applicants, newtree, cons)
        if not checkconsistency(bodies, applicants):
            cons+= 1
        #print("consistent? "+str(cons))
    #print("inferred type of "+str(tree[1][0])+": "+ str(inftype))
    return (cons,newtree)

'''This method checks whether two lists of nested arrays are equal'''
def checkconsistency(bodies, applicants):
    print("compare applicants: " + str(applicants))
    print("to function bodies: " + str(bodies))
    out = True
    for idx,i in enumerate(bodies):
        if not recomp(i,applicants[idx]):
            out = False
    print("consistent!") if out else print("inconsistent!")
    return out

#This needs to be generalized. Grammar needs to be
def recomp(body,applicant, parent = ''):
    out = True
    if isinstance(body,str):
        #This checks whether the type is equal (disregarding case (lexer)) to the parent type. If yes, equivalence was already checked.
        if body == 'R':
            out = True
        else:
            out = applicant == body
    elif isinstance(body, list) and isinstance(applicant, list):
        parent = body[0]
        for idx, i in enumerate(body):
            if idx >= len(applicant) or not recomp(i, applicant[idx], parent) :
                out = False
    else:
        return False
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
def getfunctionapplicants(a, applicants,newtree, cons):
    assert a[1][0] == 'fa'
    fa = a[1]
    (consl,tree) = typeappl(fa)
    cons += consl
    #print("function application: "+str(tree))
    inftype = tree[0]
    applicants.append(inftype)
    newtree.append(tree)
    if a[0] != "a1":
        (applicants,newtree, cons) = getfunctionapplicants(a[2], applicants,newtree, cons)
    return (applicants,newtree, cons)



'''Parse typed expression with Antlr4 grammar'''
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

'''This method takes an algebra expression and a list of function names with their algebra types, 
and substitutes function calls with their types, parses athem and checks type correctness.
It also takes into account overloading: Building the typed version from the end, it substitutes function types and 
keeps only correct types.'''
def typeFunctions(line, datatypes,functiontypes):
    sline = line.split()
    newline = ''
    print(sline)
    lastkeyword = ''
    for i, e in reversed(list(enumerate(sline))):
        cons = 0
        if e in datatypes.keys():
            print( e+': '+datatypes[e])
            newline = ' ' + datatypes[e] + newline
        elif e+' KEYWORD' in datatypes.keys():
            print(e + ': ' + datatypes[e+' KEYWORD'])
            newline = ' ' + datatypes[e+' KEYWORD'] + newline
        elif e+' DATAV' in datatypes.keys():
            print(e + ': ' + datatypes[e+' DATAV'])
            newline = ' ' + datatypes[e+' DATAV'] + newline
        elif e in functiontypes.keys():
            #lines = newline
            #newline = []
            for t in functiontypes[e]: #Because of function overloading, we have to test through all possible function types
                print(e + ': ' + t)
                testline=t + newline
                print(testline)
                treearray = parsewithTypeGrammar(testline)
                cons = typeInference(treearray)
                if cons == 0: #if tree is consistent, continue
                    newline = testline
                    break
            newline = ' ' + newline #add whitespace
            if cons > 0:
                print("expression is not type correct!")
                break

    #print(i)






'''This method reads a list of function types (given in a typefile) into dictionaries. Each line is a type declaration of some function. 
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
    #typeInference(treearray)

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
            break
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