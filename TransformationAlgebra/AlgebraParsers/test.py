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



from HelloLexer import HelloLexer
from HelloListener import HelloListener
from HelloParser import HelloParser
from antlr4 import *
import sys


def main():
    parser = HelloParser
    parser.parse(argv)

if __name__ == '__main__':
    main()
