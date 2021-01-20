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
		S=12, BOOL=13, R=14, NQ=15, NOMV=16, ORDV=17, ITVV=18, RATV=19, COUNTV=20, 
		EV=21, IV=22, OV=23, LV=24, SV=25, BOOLV=26, REL=27, IMPLIED=28, DATAV=29, 
		WHITESPACE=30, KEYWORD=31, WS=32;
	public static final int
		RULE_start = 0, RULE_fb = 1, RULE_fc1 = 2, RULE_fc2 = 3, RULE_fc3 = 4, 
		RULE_fc = 5, RULE_fa = 6, RULE_a1 = 7, RULE_a2 = 8, RULE_a3 = 9, RULE_fa0 = 10, 
		RULE_fa1 = 11, RULE_fa2 = 12, RULE_fa3 = 13, RULE_c = 14, RULE_bfc = 15, 
		RULE_v = 16, RULE_boolv = 17, RULE_nomv = 18, RULE_ordv = 19, RULE_itvv = 20, 
		RULE_ratv = 21, RULE_ev = 22, RULE_iv = 23, RULE_countv = 24, RULE_r = 25, 
		RULE_nq = 26, RULE_boolr = 27, RULE_nom = 28, RULE_ordr = 29, RULE_itv = 30, 
		RULE_rat = 31, RULE_e = 32, RULE_i = 33, RULE_count = 34, RULE_rr = 35, 
		RULE_rrr = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "fb", "fc1", "fc2", "fc3", "fc", "fa", "a1", "a2", "a3", "fa0", 
			"fa1", "fa2", "fa3", "c", "bfc", "v", "boolv", "nomv", "ordv", "itvv", 
			"ratv", "ev", "iv", "countv", "r", "nq", "boolr", "nom", "ordr", "itv", 
			"rat", "e", "i", "count", "rr", "rrr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'Nom'", "'Ord'", "'Itv'", "'Ratio'", "'Count'", 
			"'Ext'", "'Int'", "'O'", "'L'", "'S'", "'Bool'", "'R'", "'NQ'", "'NomV'", 
			"'OrdV'", "'ItvV'", "'RatioV'", "'CountV'", "'ExtV'", "'IntV'", "'OV'", 
			"'LV'", "'SV'", "'BoolV'", "'*'", "'-:'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NOM", "ORD", "ITV", "RAT", "COUNT", "E", "I", "O", 
			"L", "S", "BOOL", "R", "NQ", "NOMV", "ORDV", "ITVV", "RATV", "COUNTV", 
			"EV", "IV", "OV", "LV", "SV", "BOOLV", "REL", "IMPLIED", "DATAV", "WHITESPACE", 
			"KEYWORD", "WS"
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
		public List<FaContext> fa() {
			return getRuleContexts(FaContext.class);
		}
		public FaContext fa(int i) {
			return getRuleContext(FaContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraTypedParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraTypedParser.WHITESPACE, i);
		}
		public List<CContext> c() {
			return getRuleContexts(CContext.class);
		}
		public CContext c(int i) {
			return getRuleContext(CContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			fa();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(75);
					match(WHITESPACE);
					setState(76);
					fa();
					}
					break;
				case 2:
					{
					setState(77);
					match(WHITESPACE);
					setState(78);
					c();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FbContext extends ParserRuleContext {
		public TerminalNode IMPLIED() { return getToken(TransformationAlgebraTypedParser.IMPLIED, 0); }
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public FbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFb(this);
		}
	}

	public final FbContext fb() throws RecognitionException {
		FbContext _localctx = new FbContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IMPLIED);
			setState(85);
			match(WHITESPACE);
			setState(86);
			c();
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

	public static class Fc1Context extends ParserRuleContext {
		public FbContext fb() {
			return getRuleContext(FbContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public Fc1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fc1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFc1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFc1(this);
		}
	}

	public final Fc1Context fc1() throws RecognitionException {
		Fc1Context _localctx = new Fc1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_fc1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			fb();
			setState(89);
			match(WHITESPACE);
			setState(90);
			c();
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

	public static class Fc2Context extends ParserRuleContext {
		public FbContext fb() {
			return getRuleContext(FbContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public Fc1Context fc1() {
			return getRuleContext(Fc1Context.class,0);
		}
		public Fc2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fc2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFc2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFc2(this);
		}
	}

	public final Fc2Context fc2() throws RecognitionException {
		Fc2Context _localctx = new Fc2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_fc2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			fb();
			setState(93);
			match(WHITESPACE);
			setState(94);
			fc1();
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

	public static class Fc3Context extends ParserRuleContext {
		public FbContext fb() {
			return getRuleContext(FbContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public Fc2Context fc2() {
			return getRuleContext(Fc2Context.class,0);
		}
		public Fc3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fc3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFc3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFc3(this);
		}
	}

	public final Fc3Context fc3() throws RecognitionException {
		Fc3Context _localctx = new Fc3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_fc3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			fb();
			setState(97);
			match(WHITESPACE);
			setState(98);
			fc2();
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
		public Fc1Context fc1() {
			return getRuleContext(Fc1Context.class,0);
		}
		public Fc2Context fc2() {
			return getRuleContext(Fc2Context.class,0);
		}
		public Fc3Context fc3() {
			return getRuleContext(Fc3Context.class,0);
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
		enterRule(_localctx, 10, RULE_fc);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				fc1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				fc2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				fc3();
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

	public static class FaContext extends ParserRuleContext {
		public Fa0Context fa0() {
			return getRuleContext(Fa0Context.class,0);
		}
		public Fa1Context fa1() {
			return getRuleContext(Fa1Context.class,0);
		}
		public Fa2Context fa2() {
			return getRuleContext(Fa2Context.class,0);
		}
		public Fa3Context fa3() {
			return getRuleContext(Fa3Context.class,0);
		}
		public FaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFa(this);
		}
	}

	public final FaContext fa() throws RecognitionException {
		FaContext _localctx = new FaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fa);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				fa0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				fa1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				fa2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				fa3();
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

	public static class A1Context extends ParserRuleContext {
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public A1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterA1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitA1(this);
		}
	}

	public final A1Context a1() throws RecognitionException {
		A1Context _localctx = new A1Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_a1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			fa();
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

	public static class A2Context extends ParserRuleContext {
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public A2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterA2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitA2(this);
		}
	}

	public final A2Context a2() throws RecognitionException {
		A2Context _localctx = new A2Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_a2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			fa();
			setState(114);
			match(WHITESPACE);
			setState(115);
			a1();
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

	public static class A3Context extends ParserRuleContext {
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public A2Context a2() {
			return getRuleContext(A2Context.class,0);
		}
		public A3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterA3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitA3(this);
		}
	}

	public final A3Context a3() throws RecognitionException {
		A3Context _localctx = new A3Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_a3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			fa();
			setState(118);
			match(WHITESPACE);
			setState(119);
			a2();
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

	public static class Fa0Context extends ParserRuleContext {
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public Fa0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFa0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFa0(this);
		}
	}

	public final Fa0Context fa0() throws RecognitionException {
		Fa0Context _localctx = new Fa0Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_fa0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			c();
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

	public static class Fa1Context extends ParserRuleContext {
		public Fc1Context fc1() {
			return getRuleContext(Fc1Context.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public Fa1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFa1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFa1(this);
		}
	}

	public final Fa1Context fa1() throws RecognitionException {
		Fa1Context _localctx = new Fa1Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_fa1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			fc1();
			setState(124);
			match(WHITESPACE);
			setState(125);
			a1();
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

	public static class Fa2Context extends ParserRuleContext {
		public Fc2Context fc2() {
			return getRuleContext(Fc2Context.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public A2Context a2() {
			return getRuleContext(A2Context.class,0);
		}
		public Fa2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFa2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFa2(this);
		}
	}

	public final Fa2Context fa2() throws RecognitionException {
		Fa2Context _localctx = new Fa2Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_fa2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			fc2();
			setState(128);
			match(WHITESPACE);
			setState(129);
			a2();
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

	public static class Fa3Context extends ParserRuleContext {
		public Fc3Context fc3() {
			return getRuleContext(Fc3Context.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public A3Context a3() {
			return getRuleContext(A3Context.class,0);
		}
		public Fa3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fa3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFa3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFa3(this);
		}
	}

	public final Fa3Context fa3() throws RecognitionException {
		Fa3Context _localctx = new Fa3Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_fa3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			fc3();
			setState(132);
			match(WHITESPACE);
			setState(133);
			a3();
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
		enterRule(_localctx, 28, RULE_c);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				v();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				r();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				rr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				rrr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
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
		enterRule(_localctx, 30, RULE_bfc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__0);
			setState(143);
			fc();
			setState(144);
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

	public static class VContext extends ParserRuleContext {
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public TerminalNode OV() { return getToken(TransformationAlgebraTypedParser.OV, 0); }
		public TerminalNode LV() { return getToken(TransformationAlgebraTypedParser.LV, 0); }
		public TerminalNode SV() { return getToken(TransformationAlgebraTypedParser.SV, 0); }
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
		enterRule(_localctx, 32, RULE_v);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMV:
			case ORDV:
			case ITVV:
			case RATV:
			case COUNTV:
			case EV:
			case IV:
			case BOOLV:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				nomv();
				}
				break;
			case OV:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(OV);
				}
				break;
			case LV:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(LV);
				}
				break;
			case SV:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(SV);
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

	public static class BoolvContext extends ParserRuleContext {
		public TerminalNode BOOLV() { return getToken(TransformationAlgebraTypedParser.BOOLV, 0); }
		public BoolvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterBoolv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitBoolv(this);
		}
	}

	public final BoolvContext boolv() throws RecognitionException {
		BoolvContext _localctx = new BoolvContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(BOOLV);
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

	public static class NomvContext extends ParserRuleContext {
		public TerminalNode NOMV() { return getToken(TransformationAlgebraTypedParser.NOMV, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public BoolvContext boolv() {
			return getRuleContext(BoolvContext.class,0);
		}
		public NomvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterNomv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitNomv(this);
		}
	}

	public final NomvContext nomv() throws RecognitionException {
		NomvContext _localctx = new NomvContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nomv);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMV:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(NOMV);
				}
				break;
			case ORDV:
			case ITVV:
			case RATV:
			case COUNTV:
			case EV:
			case IV:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				ordv();
				}
				break;
			case BOOLV:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				boolv();
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

	public static class OrdvContext extends ParserRuleContext {
		public TerminalNode ORDV() { return getToken(TransformationAlgebraTypedParser.ORDV, 0); }
		public ItvvContext itvv() {
			return getRuleContext(ItvvContext.class,0);
		}
		public OrdvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterOrdv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitOrdv(this);
		}
	}

	public final OrdvContext ordv() throws RecognitionException {
		OrdvContext _localctx = new OrdvContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ordv);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDV:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(ORDV);
				}
				break;
			case ITVV:
			case RATV:
			case COUNTV:
			case EV:
			case IV:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				itvv();
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

	public static class ItvvContext extends ParserRuleContext {
		public TerminalNode ITVV() { return getToken(TransformationAlgebraTypedParser.ITVV, 0); }
		public RatvContext ratv() {
			return getRuleContext(RatvContext.class,0);
		}
		public ItvvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itvv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterItvv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitItvv(this);
		}
	}

	public final ItvvContext itvv() throws RecognitionException {
		ItvvContext _localctx = new ItvvContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_itvv);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITVV:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ITVV);
				}
				break;
			case RATV:
			case COUNTV:
			case EV:
			case IV:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				ratv();
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

	public static class RatvContext extends ParserRuleContext {
		public TerminalNode RATV() { return getToken(TransformationAlgebraTypedParser.RATV, 0); }
		public EvContext ev() {
			return getRuleContext(EvContext.class,0);
		}
		public IvContext iv() {
			return getRuleContext(IvContext.class,0);
		}
		public CountvContext countv() {
			return getRuleContext(CountvContext.class,0);
		}
		public RatvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterRatv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitRatv(this);
		}
	}

	public final RatvContext ratv() throws RecognitionException {
		RatvContext _localctx = new RatvContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ratv);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATV:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(RATV);
				}
				break;
			case EV:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				ev();
				}
				break;
			case IV:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				iv();
				}
				break;
			case COUNTV:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				countv();
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

	public static class EvContext extends ParserRuleContext {
		public TerminalNode EV() { return getToken(TransformationAlgebraTypedParser.EV, 0); }
		public EvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterEv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitEv(this);
		}
	}

	public final EvContext ev() throws RecognitionException {
		EvContext _localctx = new EvContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(EV);
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

	public static class IvContext extends ParserRuleContext {
		public TerminalNode IV() { return getToken(TransformationAlgebraTypedParser.IV, 0); }
		public IvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterIv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitIv(this);
		}
	}

	public final IvContext iv() throws RecognitionException {
		IvContext _localctx = new IvContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IV);
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

	public static class CountvContext extends ParserRuleContext {
		public TerminalNode COUNTV() { return getToken(TransformationAlgebraTypedParser.COUNTV, 0); }
		public CountvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterCountv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitCountv(this);
		}
	}

	public final CountvContext countv() throws RecognitionException {
		CountvContext _localctx = new CountvContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_countv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(COUNTV);
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
		public TerminalNode R() { return getToken(TransformationAlgebraTypedParser.R, 0); }
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public NqContext nq() {
			return getRuleContext(NqContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_r);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(R);
				}
				break;
			case NOM:
			case ORD:
			case ITV:
			case RAT:
			case COUNT:
			case E:
			case I:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				nom();
				}
				break;
			case O:
			case L:
			case S:
			case NQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				nq();
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

	public static class NqContext extends ParserRuleContext {
		public TerminalNode NQ() { return getToken(TransformationAlgebraTypedParser.NQ, 0); }
		public TerminalNode O() { return getToken(TransformationAlgebraTypedParser.O, 0); }
		public TerminalNode L() { return getToken(TransformationAlgebraTypedParser.L, 0); }
		public TerminalNode S() { return getToken(TransformationAlgebraTypedParser.S, 0); }
		public NqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterNq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitNq(this);
		}
	}

	public final NqContext nq() throws RecognitionException {
		NqContext _localctx = new NqContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << O) | (1L << L) | (1L << S) | (1L << NQ))) != 0)) ) {
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

	public static class BoolrContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(TransformationAlgebraTypedParser.BOOL, 0); }
		public BoolrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterBoolr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitBoolr(this);
		}
	}

	public final BoolrContext boolr() throws RecognitionException {
		BoolrContext _localctx = new BoolrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(BOOL);
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

	public static class NomContext extends ParserRuleContext {
		public TerminalNode NOM() { return getToken(TransformationAlgebraTypedParser.NOM, 0); }
		public OrdrContext ordr() {
			return getRuleContext(OrdrContext.class,0);
		}
		public BoolrContext boolr() {
			return getRuleContext(BoolrContext.class,0);
		}
		public NomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterNom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitNom(this);
		}
	}

	public final NomContext nom() throws RecognitionException {
		NomContext _localctx = new NomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nom);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(NOM);
				}
				break;
			case ORD:
			case ITV:
			case RAT:
			case COUNT:
			case E:
			case I:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				ordr();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				boolr();
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

	public static class OrdrContext extends ParserRuleContext {
		public TerminalNode ORD() { return getToken(TransformationAlgebraTypedParser.ORD, 0); }
		public ItvContext itv() {
			return getRuleContext(ItvContext.class,0);
		}
		public OrdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterOrdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitOrdr(this);
		}
	}

	public final OrdrContext ordr() throws RecognitionException {
		OrdrContext _localctx = new OrdrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ordr);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ORD);
				}
				break;
			case ITV:
			case RAT:
			case COUNT:
			case E:
			case I:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				itv();
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

	public static class ItvContext extends ParserRuleContext {
		public TerminalNode ITV() { return getToken(TransformationAlgebraTypedParser.ITV, 0); }
		public RatContext rat() {
			return getRuleContext(RatContext.class,0);
		}
		public ItvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterItv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitItv(this);
		}
	}

	public final ItvContext itv() throws RecognitionException {
		ItvContext _localctx = new ItvContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_itv);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITV:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ITV);
				}
				break;
			case RAT:
			case COUNT:
			case E:
			case I:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				rat();
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

	public static class RatContext extends ParserRuleContext {
		public TerminalNode RAT() { return getToken(TransformationAlgebraTypedParser.RAT, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public RatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterRat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitRat(this);
		}
	}

	public final RatContext rat() throws RecognitionException {
		RatContext _localctx = new RatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rat);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(RAT);
				}
				break;
			case E:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				e();
				}
				break;
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				i();
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				count();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(TransformationAlgebraTypedParser.E, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(E);
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

	public static class IContext extends ParserRuleContext {
		public TerminalNode I() { return getToken(TransformationAlgebraTypedParser.I, 0); }
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitI(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(I);
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

	public static class CountContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(TransformationAlgebraTypedParser.COUNT, 0); }
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitCount(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(COUNT);
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
		enterRule(_localctx, 70, RULE_rr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(REL);
			setState(214);
			match(WHITESPACE);
			setState(215);
			r();
			setState(216);
			match(WHITESPACE);
			setState(217);
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
		enterRule(_localctx, 72, RULE_rrr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(REL);
			setState(220);
			match(WHITESPACE);
			setState(221);
			r();
			setState(222);
			match(WHITESPACE);
			setState(223);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u008f\n\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22\u0099\n\22\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u00a0\n\24\3\25\3\25\5\25\u00a4\n\25\3\26\3\26\5\26\u00a8\n\26\3\27\3"+
		"\27\3\27\3\27\5\27\u00ae\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\5\33\u00b9\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u00c2\n"+
		"\36\3\37\3\37\5\37\u00c6\n\37\3 \3 \5 \u00ca\n \3!\3!\3!\3!\5!\u00d0\n"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\2\2\'\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\3"+
		"\4\2\f\16\21\21\2\u00dc\2L\3\2\2\2\4V\3\2\2\2\6Z\3\2\2\2\b^\3\2\2\2\n"+
		"b\3\2\2\2\fi\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24w\3\2\2\2\26"+
		"{\3\2\2\2\30}\3\2\2\2\32\u0081\3\2\2\2\34\u0085\3\2\2\2\36\u008e\3\2\2"+
		"\2 \u0090\3\2\2\2\"\u0098\3\2\2\2$\u009a\3\2\2\2&\u009f\3\2\2\2(\u00a3"+
		"\3\2\2\2*\u00a7\3\2\2\2,\u00ad\3\2\2\2.\u00af\3\2\2\2\60\u00b1\3\2\2\2"+
		"\62\u00b3\3\2\2\2\64\u00b8\3\2\2\2\66\u00ba\3\2\2\28\u00bc\3\2\2\2:\u00c1"+
		"\3\2\2\2<\u00c5\3\2\2\2>\u00c9\3\2\2\2@\u00cf\3\2\2\2B\u00d1\3\2\2\2D"+
		"\u00d3\3\2\2\2F\u00d5\3\2\2\2H\u00d7\3\2\2\2J\u00dd\3\2\2\2LS\5\16\b\2"+
		"MN\7 \2\2NR\5\16\b\2OP\7 \2\2PR\5\36\20\2QM\3\2\2\2QO\3\2\2\2RU\3\2\2"+
		"\2SQ\3\2\2\2ST\3\2\2\2T\3\3\2\2\2US\3\2\2\2VW\7\36\2\2WX\7 \2\2XY\5\36"+
		"\20\2Y\5\3\2\2\2Z[\5\4\3\2[\\\7 \2\2\\]\5\36\20\2]\7\3\2\2\2^_\5\4\3\2"+
		"_`\7 \2\2`a\5\6\4\2a\t\3\2\2\2bc\5\4\3\2cd\7 \2\2de\5\b\5\2e\13\3\2\2"+
		"\2fj\5\6\4\2gj\5\b\5\2hj\5\n\6\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\r\3\2"+
		"\2\2kp\5\26\f\2lp\5\30\r\2mp\5\32\16\2np\5\34\17\2ok\3\2\2\2ol\3\2\2\2"+
		"om\3\2\2\2on\3\2\2\2p\17\3\2\2\2qr\5\16\b\2r\21\3\2\2\2st\5\16\b\2tu\7"+
		" \2\2uv\5\20\t\2v\23\3\2\2\2wx\5\16\b\2xy\7 \2\2yz\5\22\n\2z\25\3\2\2"+
		"\2{|\5\36\20\2|\27\3\2\2\2}~\5\6\4\2~\177\7 \2\2\177\u0080\5\20\t\2\u0080"+
		"\31\3\2\2\2\u0081\u0082\5\b\5\2\u0082\u0083\7 \2\2\u0083\u0084\5\22\n"+
		"\2\u0084\33\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7 \2\2\u0087\u0088"+
		"\5\24\13\2\u0088\35\3\2\2\2\u0089\u008f\5\"\22\2\u008a\u008f\5\64\33\2"+
		"\u008b\u008f\5H%\2\u008c\u008f\5J&\2\u008d\u008f\5 \21\2\u008e\u0089\3"+
		"\2\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\37\3\2\2\2\u0090\u0091\7\3\2\2\u0091\u0092\5\f\7"+
		"\2\u0092\u0093\7\4\2\2\u0093!\3\2\2\2\u0094\u0099\5&\24\2\u0095\u0099"+
		"\7\31\2\2\u0096\u0099\7\32\2\2\u0097\u0099\7\33\2\2\u0098\u0094\3\2\2"+
		"\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099#"+
		"\3\2\2\2\u009a\u009b\7\34\2\2\u009b%\3\2\2\2\u009c\u00a0\7\22\2\2\u009d"+
		"\u00a0\5(\25\2\u009e\u00a0\5$\23\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u009e\3\2\2\2\u00a0\'\3\2\2\2\u00a1\u00a4\7\23\2\2\u00a2\u00a4"+
		"\5*\26\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4)\3\2\2\2\u00a5"+
		"\u00a8\7\24\2\2\u00a6\u00a8\5,\27\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8+\3\2\2\2\u00a9\u00ae\7\25\2\2\u00aa\u00ae\5.\30\2\u00ab\u00ae"+
		"\5\60\31\2\u00ac\u00ae\5\62\32\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae-\3\2\2\2\u00af\u00b0"+
		"\7\27\2\2\u00b0/\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\61\3\2\2\2\u00b3\u00b4"+
		"\7\26\2\2\u00b4\63\3\2\2\2\u00b5\u00b9\7\20\2\2\u00b6\u00b9\5:\36\2\u00b7"+
		"\u00b9\5\66\34\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\65\3\2\2\2\u00ba\u00bb\t\2\2\2\u00bb\67\3\2\2\2\u00bc\u00bd"+
		"\7\17\2\2\u00bd9\3\2\2\2\u00be\u00c2\7\5\2\2\u00bf\u00c2\5<\37\2\u00c0"+
		"\u00c2\58\35\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2;\3\2\2\2\u00c3\u00c6\7\6\2\2\u00c4\u00c6\5> \2\u00c5\u00c3"+
		"\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6=\3\2\2\2\u00c7\u00ca\7\7\2\2\u00c8"+
		"\u00ca\5@!\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca?\3\2\2\2\u00cb"+
		"\u00d0\7\b\2\2\u00cc\u00d0\5B\"\2\u00cd\u00d0\5D#\2\u00ce\u00d0\5F$\2"+
		"\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0A\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2C\3\2\2\2\u00d3\u00d4"+
		"\7\13\2\2\u00d4E\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6G\3\2\2\2\u00d7\u00d8"+
		"\7\35\2\2\u00d8\u00d9\7 \2\2\u00d9\u00da\5\64\33\2\u00da\u00db\7 \2\2"+
		"\u00db\u00dc\5\64\33\2\u00dcI\3\2\2\2\u00dd\u00de\7\35\2\2\u00de\u00df"+
		"\7 \2\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\5H%\2\u00e2"+
		"K\3\2\2\2\21QSio\u008e\u0098\u009f\u00a3\u00a7\u00ad\u00b8\u00c1\u00c5"+
		"\u00c9\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}