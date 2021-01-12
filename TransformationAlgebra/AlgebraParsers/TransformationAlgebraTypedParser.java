// Generated from TransformationAlgebraTyped.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransformationAlgebraTypedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NOM=3, ORD=4, ITV=5, RAT=6, COUNT=7, E=8, I=9, O=10, L=11, 
		S=12, BOOL=13, NOMV=14, ORDV=15, ITVV=16, RATV=17, COUNTV=18, EV=19, IV=20, 
		OV=21, LV=22, SV=23, BOOLV=24, REL=25, IMPLIED=26, DATAV=27, WHITESPACE=28, 
		KEYWORD=29, WS=30;
	public static final int
		RULE_start = 0, RULE_t = 1, RULE_ft = 2, RULE_fc = 3, RULE_bfc = 4, RULE_c = 5, 
		RULE_v = 6, RULE_r = 7, RULE_rr = 8, RULE_rrr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "t", "ft", "fc", "bfc", "c", "v", "r", "rr", "rrr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'Nom'", "'Ord'", "'Itv'", "'Ratio'", "'Count'", 
			"'Ext'", "'Int'", "'O'", "'L'", "'S'", "'Bool'", "'NomV'", "'OrdV'", 
			"'ItvV'", "'RatioV'", "'CountV'", "'ExtV'", "'IntV'", "'OV'", "'LV'", 
			"'SV'", "'BoolV'", "'*'", "'-:'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NOM", "ORD", "ITV", "RAT", "COUNT", "E", "I", "O", 
			"L", "S", "BOOL", "NOMV", "ORDV", "ITVV", "RATV", "COUNTV", "EV", "IV", 
			"OV", "LV", "SV", "BOOLV", "REL", "IMPLIED", "DATAV", "WHITESPACE", "KEYWORD", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TransformationAlgebraTyped.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TransformationAlgebraTypedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<TContext> t() {
			return getRuleContexts(TContext.class);
		}
		public TContext t(int i) {
			return getRuleContext(TContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraTypedParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraTypedParser.WHITESPACE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			int _alt;
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(21);
						t();
						setState(22);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(26); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(28);
				t();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_t);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLIED:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				fc();
				}
				break;
			case T__0:
			case NOM:
			case ORD:
			case ITV:
			case RAT:
			case COUNT:
			case O:
			case L:
			case S:
			case BOOL:
			case NOMV:
			case ORDV:
			case ITVV:
			case RATV:
			case COUNTV:
			case OV:
			case LV:
			case SV:
			case BOOLV:
			case REL:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				c();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FtContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public FtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFt(this);
		}
	}

	public final FtContext ft() throws RecognitionException {
		FtContext _localctx = new FtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			t();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FcContext extends ParserRuleContext {
		public TerminalNode IMPLIED() { return getToken(TransformationAlgebraTypedParser.IMPLIED, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraTypedParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraTypedParser.WHITESPACE, i);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public FtContext ft() {
			return getRuleContext(FtContext.class,0);
		}
		public FcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFc(this);
		}
	}

	public final FcContext fc() throws RecognitionException {
		FcContext _localctx = new FcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(IMPLIED);
			setState(39);
			match(WHITESPACE);
			setState(40);
			c();
			setState(41);
			match(WHITESPACE);
			setState(42);
			ft();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BfcContext extends ParserRuleContext {
		public FcContext fc() {
			return getRuleContext(FcContext.class,0);
		}
		public BfcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterBfc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitBfc(this);
		}
	}

	public final BfcContext bfc() throws RecognitionException {
		BfcContext _localctx = new BfcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bfc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			fc();
			setState(46);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CContext extends ParserRuleContext {
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public RrContext rr() {
			return getRuleContext(RrContext.class,0);
		}
		public RrrContext rrr() {
			return getRuleContext(RrrContext.class,0);
		}
		public BfcContext bfc() {
			return getRuleContext(BfcContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitC(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_c);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				v();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				r();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				rr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				rrr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				bfc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VContext extends ParserRuleContext {
		public TerminalNode NOMV() { return getToken(TransformationAlgebraTypedParser.NOMV, 0); }
		public TerminalNode ORDV() { return getToken(TransformationAlgebraTypedParser.ORDV, 0); }
		public TerminalNode ITVV() { return getToken(TransformationAlgebraTypedParser.ITVV, 0); }
		public TerminalNode RATV() { return getToken(TransformationAlgebraTypedParser.RATV, 0); }
		public TerminalNode COUNTV() { return getToken(TransformationAlgebraTypedParser.COUNTV, 0); }
		public TerminalNode OV() { return getToken(TransformationAlgebraTypedParser.OV, 0); }
		public TerminalNode LV() { return getToken(TransformationAlgebraTypedParser.LV, 0); }
		public TerminalNode SV() { return getToken(TransformationAlgebraTypedParser.SV, 0); }
		public TerminalNode BOOLV() { return getToken(TransformationAlgebraTypedParser.BOOLV, 0); }
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOMV) | (1L << ORDV) | (1L << ITVV) | (1L << RATV) | (1L << COUNTV) | (1L << OV) | (1L << LV) | (1L << SV) | (1L << BOOLV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RContext extends ParserRuleContext {
		public TerminalNode NOM() { return getToken(TransformationAlgebraTypedParser.NOM, 0); }
		public TerminalNode ORD() { return getToken(TransformationAlgebraTypedParser.ORD, 0); }
		public TerminalNode ITV() { return getToken(TransformationAlgebraTypedParser.ITV, 0); }
		public TerminalNode RAT() { return getToken(TransformationAlgebraTypedParser.RAT, 0); }
		public TerminalNode COUNT() { return getToken(TransformationAlgebraTypedParser.COUNT, 0); }
		public TerminalNode O() { return getToken(TransformationAlgebraTypedParser.O, 0); }
		public TerminalNode L() { return getToken(TransformationAlgebraTypedParser.L, 0); }
		public TerminalNode S() { return getToken(TransformationAlgebraTypedParser.S, 0); }
		public TerminalNode BOOL() { return getToken(TransformationAlgebraTypedParser.BOOL, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOM) | (1L << ORD) | (1L << ITV) | (1L << RAT) | (1L << COUNT) | (1L << O) | (1L << L) | (1L << S) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RrContext extends ParserRuleContext {
		public TerminalNode REL() { return getToken(TransformationAlgebraTypedParser.REL, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraTypedParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraTypedParser.WHITESPACE, i);
		}
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public RrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterRr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitRr(this);
		}
	}

	public final RrContext rr() throws RecognitionException {
		RrContext _localctx = new RrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(REL);
			setState(60);
			match(WHITESPACE);
			setState(61);
			r();
			setState(62);
			match(WHITESPACE);
			setState(63);
			r();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RrrContext extends ParserRuleContext {
		public TerminalNode REL() { return getToken(TransformationAlgebraTypedParser.REL, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraTypedParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraTypedParser.WHITESPACE, i);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public RrContext rr() {
			return getRuleContext(RrContext.class,0);
		}
		public RrrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rrr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterRrr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitRrr(this);
		}
	}

	public final RrrContext rrr() throws RecognitionException {
		RrrContext _localctx = new RrrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rrr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(REL);
			setState(66);
			match(WHITESPACE);
			setState(67);
			r();
			setState(68);
			match(WHITESPACE);
			setState(69);
			rr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 J\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\5\2!\n\2\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5"+
		"\78\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\4\2\20\24\27\32\4\2\5"+
		"\t\f\17\2F\2 \3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n.\3\2\2\2\f\67"+
		"\3\2\2\2\169\3\2\2\2\20;\3\2\2\2\22=\3\2\2\2\24C\3\2\2\2\26!\5\4\3\2\27"+
		"\30\5\4\3\2\30\31\7\36\2\2\31\33\3\2\2\2\32\27\3\2\2\2\33\34\3\2\2\2\34"+
		"\32\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\5\4\3\2\37!\3\2\2\2 \26"+
		"\3\2\2\2 \32\3\2\2\2!\3\3\2\2\2\"%\5\b\5\2#%\5\f\7\2$\"\3\2\2\2$#\3\2"+
		"\2\2%\5\3\2\2\2&\'\5\4\3\2\'\7\3\2\2\2()\7\34\2\2)*\7\36\2\2*+\5\f\7\2"+
		"+,\7\36\2\2,-\5\6\4\2-\t\3\2\2\2./\7\3\2\2/\60\5\b\5\2\60\61\7\4\2\2\61"+
		"\13\3\2\2\2\628\5\16\b\2\638\5\20\t\2\648\5\22\n\2\658\5\24\13\2\668\5"+
		"\n\6\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3"+
		"\2\2\28\r\3\2\2\29:\t\2\2\2:\17\3\2\2\2;<\t\3\2\2<\21\3\2\2\2=>\7\33\2"+
		"\2>?\7\36\2\2?@\5\20\t\2@A\7\36\2\2AB\5\20\t\2B\23\3\2\2\2CD\7\33\2\2"+
		"DE\7\36\2\2EF\5\20\t\2FG\7\36\2\2GH\5\22\n\2H\25\3\2\2\2\6\34 $\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}