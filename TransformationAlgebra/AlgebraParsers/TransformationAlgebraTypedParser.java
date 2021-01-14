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
		RULE_start = 0, RULE_fb = 1, RULE_fc1 = 2, RULE_fc2 = 3, RULE_fc3 = 4, 
		RULE_fc = 5, RULE_fa = 6, RULE_a1 = 7, RULE_a2 = 8, RULE_a3 = 9, RULE_fa0 = 10, 
		RULE_fa1 = 11, RULE_fa2 = 12, RULE_fa3 = 13, RULE_c = 14, RULE_bfc = 15, 
		RULE_v = 16, RULE_nomv = 17, RULE_ordv = 18, RULE_itvv = 19, RULE_ratv = 20, 
		RULE_countv = 21, RULE_r = 22, RULE_nom = 23, RULE_ord = 24, RULE_itv = 25, 
		RULE_rat = 26, RULE_count = 27, RULE_rr = 28, RULE_rrr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "fb", "fc1", "fc2", "fc3", "fc", "fa", "a1", "a2", "a3", "fa0", 
			"fa1", "fa2", "fa3", "c", "bfc", "v", "nomv", "ordv", "itvv", "ratv", 
			"countv", "r", "nom", "ord", "itv", "rat", "count", "rr", "rrr"
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
		public FaContext fa() {
			return getRuleContext(FaContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
			setState(62);
			match(IMPLIED);
			setState(63);
			match(WHITESPACE);
			setState(64);
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
			setState(66);
			fb();
			setState(67);
			match(WHITESPACE);
			setState(68);
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
			setState(70);
			fb();
			setState(71);
			match(WHITESPACE);
			setState(72);
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
			setState(74);
			fb();
			setState(75);
			match(WHITESPACE);
			setState(76);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				fc1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				fc2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				fa0();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				fa1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				fa2();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
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
			setState(89);
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
			setState(91);
			fa();
			setState(92);
			match(WHITESPACE);
			setState(93);
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
			setState(95);
			fa();
			setState(96);
			match(WHITESPACE);
			setState(97);
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
			setState(99);
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
			setState(101);
			fc1();
			setState(102);
			match(WHITESPACE);
			setState(103);
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
			setState(105);
			fc2();
			setState(106);
			match(WHITESPACE);
			setState(107);
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
			setState(109);
			fc3();
			setState(110);
			match(WHITESPACE);
			setState(111);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				v();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				r();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				rr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				rrr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
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
			setState(120);
			match(T__0);
			setState(121);
			fc();
			setState(122);
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
			setState(128);
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
				setState(124);
				nomv();
				}
				break;
			case OV:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(OV);
				}
				break;
			case LV:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(LV);
				}
				break;
			case SV:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
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

	public static class NomvContext extends ParserRuleContext {
		public TerminalNode NOMV() { return getToken(TransformationAlgebraTypedParser.NOMV, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode BOOLV() { return getToken(TransformationAlgebraTypedParser.BOOLV, 0); }
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
		enterRule(_localctx, 34, RULE_nomv);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMV:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
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
				setState(131);
				ordv();
				}
				break;
			case BOOLV:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(BOOLV);
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
		enterRule(_localctx, 36, RULE_ordv);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDV:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
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
				setState(136);
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
		enterRule(_localctx, 38, RULE_itvv);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITVV:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ITVV);
				}
				break;
			case RATV:
			case COUNTV:
			case EV:
			case IV:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
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
		public TerminalNode EV() { return getToken(TransformationAlgebraTypedParser.EV, 0); }
		public TerminalNode IV() { return getToken(TransformationAlgebraTypedParser.IV, 0); }
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
		enterRule(_localctx, 40, RULE_ratv);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATV:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(RATV);
				}
				break;
			case EV:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(EV);
				}
				break;
			case IV:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(IV);
				}
				break;
			case COUNTV:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
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
		enterRule(_localctx, 42, RULE_countv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public TerminalNode O() { return getToken(TransformationAlgebraTypedParser.O, 0); }
		public TerminalNode L() { return getToken(TransformationAlgebraTypedParser.L, 0); }
		public TerminalNode S() { return getToken(TransformationAlgebraTypedParser.S, 0); }
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
		enterRule(_localctx, 44, RULE_r);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOM:
			case ORD:
			case ITV:
			case RAT:
			case COUNT:
			case E:
			case I:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				nom();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(O);
				}
				break;
			case L:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(L);
				}
				break;
			case S:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(S);
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

	public static class NomContext extends ParserRuleContext {
		public TerminalNode NOM() { return getToken(TransformationAlgebraTypedParser.NOM, 0); }
		public OrdContext ord() {
			return getRuleContext(OrdContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(TransformationAlgebraTypedParser.BOOL, 0); }
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
		enterRule(_localctx, 46, RULE_nom);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
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
				setState(158);
				ord();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(BOOL);
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

	public static class OrdContext extends ParserRuleContext {
		public TerminalNode ORD() { return getToken(TransformationAlgebraTypedParser.ORD, 0); }
		public ItvContext itv() {
			return getRuleContext(ItvContext.class,0);
		}
		public OrdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterOrd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitOrd(this);
		}
	}

	public final OrdContext ord() throws RecognitionException {
		OrdContext _localctx = new OrdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ord);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
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
				setState(163);
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
		enterRule(_localctx, 50, RULE_itv);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITV:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(ITV);
				}
				break;
			case RAT:
			case COUNT:
			case E:
			case I:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
		public TerminalNode E() { return getToken(TransformationAlgebraTypedParser.E, 0); }
		public TerminalNode I() { return getToken(TransformationAlgebraTypedParser.I, 0); }
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
		enterRule(_localctx, 52, RULE_rat);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(RAT);
				}
				break;
			case E:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(E);
				}
				break;
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(I);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
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
		enterRule(_localctx, 54, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 56, RULE_rr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(REL);
			setState(179);
			match(WHITESPACE);
			setState(180);
			r();
			setState(181);
			match(WHITESPACE);
			setState(182);
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
		enterRule(_localctx, 58, RULE_rrr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(REL);
			setState(185);
			match(WHITESPACE);
			setState(186);
			r();
			setState(187);
			match(WHITESPACE);
			setState(188);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\5\7T\n\7\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20y\n\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\5\22\u0083\n\22\3\23\3\23\3\23\5\23\u0088\n\23\3\24\3"+
		"\24\5\24\u008c\n\24\3\25\3\25\5\25\u0090\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u0096\n\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u009e\n\30\3\31\3\31\3"+
		"\31\5\31\u00a3\n\31\3\32\3\32\5\32\u00a7\n\32\3\33\3\33\5\33\u00ab\n\33"+
		"\3\34\3\34\3\34\3\34\5\34\u00b1\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u00bf\2>\3\2\2\2\4@\3\2"+
		"\2\2\6D\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fS\3\2\2\2\16Y\3\2\2\2\20[\3\2\2"+
		"\2\22]\3\2\2\2\24a\3\2\2\2\26e\3\2\2\2\30g\3\2\2\2\32k\3\2\2\2\34o\3\2"+
		"\2\2\36x\3\2\2\2 z\3\2\2\2\"\u0082\3\2\2\2$\u0087\3\2\2\2&\u008b\3\2\2"+
		"\2(\u008f\3\2\2\2*\u0095\3\2\2\2,\u0097\3\2\2\2.\u009d\3\2\2\2\60\u00a2"+
		"\3\2\2\2\62\u00a6\3\2\2\2\64\u00aa\3\2\2\2\66\u00b0\3\2\2\28\u00b2\3\2"+
		"\2\2:\u00b4\3\2\2\2<\u00ba\3\2\2\2>?\5\16\b\2?\3\3\2\2\2@A\7\34\2\2AB"+
		"\7\36\2\2BC\5\36\20\2C\5\3\2\2\2DE\5\4\3\2EF\7\36\2\2FG\5\36\20\2G\7\3"+
		"\2\2\2HI\5\4\3\2IJ\7\36\2\2JK\5\6\4\2K\t\3\2\2\2LM\5\4\3\2MN\7\36\2\2"+
		"NO\5\b\5\2O\13\3\2\2\2PT\5\6\4\2QT\5\b\5\2RT\5\n\6\2SP\3\2\2\2SQ\3\2\2"+
		"\2SR\3\2\2\2T\r\3\2\2\2UZ\5\26\f\2VZ\5\30\r\2WZ\5\32\16\2XZ\5\34\17\2"+
		"YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\5\16\b\2\\\21"+
		"\3\2\2\2]^\5\16\b\2^_\7\36\2\2_`\5\20\t\2`\23\3\2\2\2ab\5\16\b\2bc\7\36"+
		"\2\2cd\5\22\n\2d\25\3\2\2\2ef\5\36\20\2f\27\3\2\2\2gh\5\6\4\2hi\7\36\2"+
		"\2ij\5\20\t\2j\31\3\2\2\2kl\5\b\5\2lm\7\36\2\2mn\5\22\n\2n\33\3\2\2\2"+
		"op\5\n\6\2pq\7\36\2\2qr\5\24\13\2r\35\3\2\2\2sy\5\"\22\2ty\5.\30\2uy\5"+
		":\36\2vy\5<\37\2wy\5 \21\2xs\3\2\2\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw\3"+
		"\2\2\2y\37\3\2\2\2z{\7\3\2\2{|\5\f\7\2|}\7\4\2\2}!\3\2\2\2~\u0083\5$\23"+
		"\2\177\u0083\7\27\2\2\u0080\u0083\7\30\2\2\u0081\u0083\7\31\2\2\u0082"+
		"~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"#\3\2\2\2\u0084\u0088\7\20\2\2\u0085\u0088\5&\24\2\u0086\u0088\7\32\2"+
		"\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088%"+
		"\3\2\2\2\u0089\u008c\7\21\2\2\u008a\u008c\5(\25\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\'\3\2\2\2\u008d\u0090\7\22\2\2\u008e\u0090"+
		"\5*\26\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090)\3\2\2\2\u0091"+
		"\u0096\7\23\2\2\u0092\u0096\7\25\2\2\u0093\u0096\7\26\2\2\u0094\u0096"+
		"\5,\27\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096+\3\2\2\2\u0097\u0098\7\24\2\2\u0098-\3\2\2\2\u0099"+
		"\u009e\5\60\31\2\u009a\u009e\7\f\2\2\u009b\u009e\7\r\2\2\u009c\u009e\7"+
		"\16\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e/\3\2\2\2\u009f\u00a3\7\5\2\2\u00a0\u00a3\5\62\32"+
		"\2\u00a1\u00a3\7\17\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\61\3\2\2\2\u00a4\u00a7\7\6\2\2\u00a5\u00a7\5\64\33"+
		"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\63\3\2\2\2\u00a8\u00ab"+
		"\7\7\2\2\u00a9\u00ab\5\66\34\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\65\3\2\2\2\u00ac\u00b1\7\b\2\2\u00ad\u00b1\7\n\2\2\u00ae\u00b1"+
		"\7\13\2\2\u00af\u00b1\58\35\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\67\3\2\2\2\u00b2\u00b3"+
		"\7\t\2\2\u00b39\3\2\2\2\u00b4\u00b5\7\33\2\2\u00b5\u00b6\7\36\2\2\u00b6"+
		"\u00b7\5.\30\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\5.\30\2\u00b9;\3\2\2\2"+
		"\u00ba\u00bb\7\33\2\2\u00bb\u00bc\7\36\2\2\u00bc\u00bd\5.\30\2\u00bd\u00be"+
		"\7\36\2\2\u00be\u00bf\5:\36\2\u00bf=\3\2\2\2\17SYx\u0082\u0087\u008b\u008f"+
		"\u0095\u009d\u00a2\u00a6\u00aa\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}