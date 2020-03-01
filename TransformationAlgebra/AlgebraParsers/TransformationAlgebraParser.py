# Generated from TransformationAlgebra.g4 by ANTLR 4.8
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3")
        buf.write(u"\13K\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write(u"\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3")
        buf.write(u"\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write(u"\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5")
        buf.write(u"\3\5\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3")
        buf.write(u"\n\3\n\3\13\3\13\3\f\3\f\5\fG\n\f\3\r\3\r\3\r\2\2\16")
        buf.write(u"\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2G\2\36\3\2\2\2\4")
        buf.write(u")\3\2\2\2\6+\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f:\3\2\2")
        buf.write(u"\2\16<\3\2\2\2\20>\3\2\2\2\22@\3\2\2\2\24B\3\2\2\2\26")
        buf.write(u"F\3\2\2\2\30H\3\2\2\2\32\37\5\b\5\2\33\37\5\4\3\2\34")
        buf.write(u"\37\5\16\b\2\35\37\5\24\13\2\36\32\3\2\2\2\36\33\3\2")
        buf.write(u"\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\3\3\2\2\2 !\7\3\2")
        buf.write(u"\2!*\5\6\4\2\"#\7\3\2\2#*\5\b\5\2$%\7\4\2\2%&\5\4\3\2")
        buf.write(u"&\'\7\t\2\2\'(\5\4\3\2(*\3\2\2\2) \3\2\2\2)\"\3\2\2\2")
        buf.write(u")$\3\2\2\2*\5\3\2\2\2+,\7\5\2\2,-\5\26\f\2-\7\3\2\2\2")
        buf.write(u"./\7\6\2\2/\67\5\6\4\2\60\61\7\6\2\2\61\67\5\n\6\2\62")
        buf.write(u"\63\7\6\2\2\63\67\5\f\7\2\64\65\7\6\2\2\65\67\5\16\b")
        buf.write(u"\2\66.\3\2\2\2\66\60\3\2\2\2\66\62\3\2\2\2\66\64\3\2")
        buf.write(u"\2\2\67\t\3\2\2\289\5\6\4\29\13\3\2\2\2:;\5\n\6\2;\r")
        buf.write(u"\3\2\2\2<=\5\f\7\2=\17\3\2\2\2>?\5\26\f\2?\21\3\2\2\2")
        buf.write(u"@A\5\20\t\2A\23\3\2\2\2BC\5\22\n\2C\25\3\2\2\2DG\7\7")
        buf.write(u"\2\2EG\5\30\r\2FD\3\2\2\2FE\3\2\2\2G\27\3\2\2\2HI\7\b")
        buf.write(u"\2\2I\31\3\2\2\2\6\36)\66F")
        return buf.getvalue()


class TransformationAlgebraParser ( Parser ):

    grammarFileName = "TransformationAlgebra.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'fcont '", u"'ratio '", u"'interpol '", 
                     u"'sigma1 '", u"<INVALID>", u"<INVALID>", u"' '" ]

    symbolicNames = [ u"<INVALID>", u"FCONT", u"RATIO", u"INTERPOL", u"SIGMA1", 
                      u"DATAPM", u"DATAPAMOUNT", u"WHITESPACE", u"KEYWORD", 
                      u"WS" ]

    RULE_start = 0
    RULE_ratiov = 1
    RULE_lint = 2
    RULE_l = 3
    RULE_lord = 4
    RULE_lnom = 5
    RULE_lq = 6
    RULE_sord = 7
    RULE_snom = 8
    RULE_sq = 9
    RULE_sint = 10
    RULE_sratio = 11

    ruleNames =  [ u"start", u"ratiov", u"lint", u"l", u"lord", u"lnom", 
                   u"lq", u"sord", u"snom", u"sq", u"sint", u"sratio" ]

    EOF = Token.EOF
    FCONT=1
    RATIO=2
    INTERPOL=3
    SIGMA1=4
    DATAPM=5
    DATAPAMOUNT=6
    WHITESPACE=7
    KEYWORD=8
    WS=9

    def __init__(self, input, output=sys.stdout):
        super(TransformationAlgebraParser, self).__init__(input, output=output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.StartContext, self).__init__(parent, invokingState)
            self.parser = parser

        def l(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LContext,0)


        def ratiov(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.RatiovContext,0)


        def lq(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LqContext,0)


        def sq(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.SqContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_start

        def enterRule(self, listener):
            if hasattr(listener, "enterStart"):
                listener.enterStart(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitStart"):
                listener.exitStart(self)




    def start(self):

        localctx = TransformationAlgebraParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [TransformationAlgebraParser.SIGMA1]:
                self.state = 24
                self.l()
                pass
            elif token in [TransformationAlgebraParser.FCONT, TransformationAlgebraParser.RATIO]:
                self.state = 25
                self.ratiov()
                pass
            elif token in [TransformationAlgebraParser.INTERPOL]:
                self.state = 26
                self.lq()
                pass
            elif token in [TransformationAlgebraParser.DATAPM, TransformationAlgebraParser.DATAPAMOUNT]:
                self.state = 27
                self.sq()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RatiovContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.RatiovContext, self).__init__(parent, invokingState)
            self.parser = parser

        def FCONT(self):
            return self.getToken(TransformationAlgebraParser.FCONT, 0)

        def lint(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LintContext,0)


        def l(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LContext,0)


        def RATIO(self):
            return self.getToken(TransformationAlgebraParser.RATIO, 0)

        def ratiov(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(TransformationAlgebraParser.RatiovContext)
            else:
                return self.getTypedRuleContext(TransformationAlgebraParser.RatiovContext,i)


        def WHITESPACE(self):
            return self.getToken(TransformationAlgebraParser.WHITESPACE, 0)

        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_ratiov

        def enterRule(self, listener):
            if hasattr(listener, "enterRatiov"):
                listener.enterRatiov(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitRatiov"):
                listener.exitRatiov(self)




    def ratiov(self):

        localctx = TransformationAlgebraParser.RatiovContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_ratiov)
        try:
            self.state = 39
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 30
                self.match(TransformationAlgebraParser.FCONT)
                self.state = 31
                self.lint()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 32
                self.match(TransformationAlgebraParser.FCONT)
                self.state = 33
                self.l()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 34
                self.match(TransformationAlgebraParser.RATIO)
                self.state = 35
                self.ratiov()
                self.state = 36
                self.match(TransformationAlgebraParser.WHITESPACE)
                self.state = 37
                self.ratiov()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LintContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.LintContext, self).__init__(parent, invokingState)
            self.parser = parser

        def INTERPOL(self):
            return self.getToken(TransformationAlgebraParser.INTERPOL, 0)

        def sint(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.SintContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_lint

        def enterRule(self, listener):
            if hasattr(listener, "enterLint"):
                listener.enterLint(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLint"):
                listener.exitLint(self)




    def lint(self):

        localctx = TransformationAlgebraParser.LintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_lint)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 41
            self.match(TransformationAlgebraParser.INTERPOL)
            self.state = 42
            self.sint()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.LContext, self).__init__(parent, invokingState)
            self.parser = parser

        def SIGMA1(self):
            return self.getToken(TransformationAlgebraParser.SIGMA1, 0)

        def lint(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LintContext,0)


        def lord(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LordContext,0)


        def lnom(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LnomContext,0)


        def lq(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LqContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_l

        def enterRule(self, listener):
            if hasattr(listener, "enterL"):
                listener.enterL(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitL"):
                listener.exitL(self)




    def l(self):

        localctx = TransformationAlgebraParser.LContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_l)
        try:
            self.state = 52
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 44
                self.match(TransformationAlgebraParser.SIGMA1)
                self.state = 45
                self.lint()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 46
                self.match(TransformationAlgebraParser.SIGMA1)
                self.state = 47
                self.lord()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 48
                self.match(TransformationAlgebraParser.SIGMA1)
                self.state = 49
                self.lnom()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 50
                self.match(TransformationAlgebraParser.SIGMA1)
                self.state = 51
                self.lq()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LordContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.LordContext, self).__init__(parent, invokingState)
            self.parser = parser

        def lint(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LintContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_lord

        def enterRule(self, listener):
            if hasattr(listener, "enterLord"):
                listener.enterLord(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLord"):
                listener.exitLord(self)




    def lord(self):

        localctx = TransformationAlgebraParser.LordContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_lord)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.lint()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LnomContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.LnomContext, self).__init__(parent, invokingState)
            self.parser = parser

        def lord(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LordContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_lnom

        def enterRule(self, listener):
            if hasattr(listener, "enterLnom"):
                listener.enterLnom(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLnom"):
                listener.exitLnom(self)




    def lnom(self):

        localctx = TransformationAlgebraParser.LnomContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_lnom)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.lord()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LqContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.LqContext, self).__init__(parent, invokingState)
            self.parser = parser

        def lnom(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.LnomContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_lq

        def enterRule(self, listener):
            if hasattr(listener, "enterLq"):
                listener.enterLq(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitLq"):
                listener.exitLq(self)




    def lq(self):

        localctx = TransformationAlgebraParser.LqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_lq)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.lnom()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SordContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.SordContext, self).__init__(parent, invokingState)
            self.parser = parser

        def sint(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.SintContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_sord

        def enterRule(self, listener):
            if hasattr(listener, "enterSord"):
                listener.enterSord(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSord"):
                listener.exitSord(self)




    def sord(self):

        localctx = TransformationAlgebraParser.SordContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_sord)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.sint()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SnomContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.SnomContext, self).__init__(parent, invokingState)
            self.parser = parser

        def sord(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.SordContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_snom

        def enterRule(self, listener):
            if hasattr(listener, "enterSnom"):
                listener.enterSnom(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSnom"):
                listener.exitSnom(self)




    def snom(self):

        localctx = TransformationAlgebraParser.SnomContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_snom)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self.sord()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SqContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.SqContext, self).__init__(parent, invokingState)
            self.parser = parser

        def snom(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.SnomContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_sq

        def enterRule(self, listener):
            if hasattr(listener, "enterSq"):
                listener.enterSq(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSq"):
                listener.exitSq(self)




    def sq(self):

        localctx = TransformationAlgebraParser.SqContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_sq)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.snom()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SintContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.SintContext, self).__init__(parent, invokingState)
            self.parser = parser

        def DATAPM(self):
            return self.getToken(TransformationAlgebraParser.DATAPM, 0)

        def sratio(self):
            return self.getTypedRuleContext(TransformationAlgebraParser.SratioContext,0)


        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_sint

        def enterRule(self, listener):
            if hasattr(listener, "enterSint"):
                listener.enterSint(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSint"):
                listener.exitSint(self)




    def sint(self):

        localctx = TransformationAlgebraParser.SintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_sint)
        try:
            self.state = 68
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [TransformationAlgebraParser.DATAPM]:
                self.enterOuterAlt(localctx, 1)
                self.state = 66
                self.match(TransformationAlgebraParser.DATAPM)
                pass
            elif token in [TransformationAlgebraParser.DATAPAMOUNT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 67
                self.sratio()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SratioContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(TransformationAlgebraParser.SratioContext, self).__init__(parent, invokingState)
            self.parser = parser

        def DATAPAMOUNT(self):
            return self.getToken(TransformationAlgebraParser.DATAPAMOUNT, 0)

        def getRuleIndex(self):
            return TransformationAlgebraParser.RULE_sratio

        def enterRule(self, listener):
            if hasattr(listener, "enterSratio"):
                listener.enterSratio(self)

        def exitRule(self, listener):
            if hasattr(listener, "exitSratio"):
                listener.exitSratio(self)




    def sratio(self):

        localctx = TransformationAlgebraParser.SratioContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_sratio)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(TransformationAlgebraParser.DATAPAMOUNT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





