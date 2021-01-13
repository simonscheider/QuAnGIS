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
		RULE_start = 0, RULE_t = 1, RULE_fh = 2, RULE_fc1 = 3, RULE_fc2 = 4, RULE_fc3 = 5, 
		RULE_fc = 6, RULE_c = 7, RULE_bfc = 8, RULE_v = 9, RULE_nomv = 10, RULE_ordv = 11, 
		RULE_itvv = 12, RULE_ratv = 13, RULE_countv = 14, RULE_r = 15, RULE_nom = 16, 
		RULE_ord = 17, RULE_itv = 18, RULE_rat = 19, RULE_count = 20, RULE_rr = 21, 
		RULE_rrr = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "t", "fh", "fc1", "fc2", "fc3", "fc", "c", "bfc", "v", "nomv", 
			"ordv", "itvv", "ratv", "countv", "r", "nom", "ord", "itv", "rat", "count", 
			"rr", "rrr"
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(47);
						t();
						setState(48);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(52); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(54);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPLIED:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				fc();
				}
				break;
			case T__0:
			case NOM:
			case ORD:
			case ITV:
			case RAT:
			case COUNT:
			case E:
			case I:
			case O:
			case L:
			case S:
			case BOOL:
			case NOMV:
			case ORDV:
			case ITVV:
			case RATV:
			case COUNTV:
			case EV:
			case IV:
			case OV:
			case LV:
			case SV:
			case BOOLV:
			case REL:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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

	public static class FhContext extends ParserRuleContext {
		public TerminalNode IMPLIED() { return getToken(TransformationAlgebraTypedParser.IMPLIED, 0); }
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraTypedParser.WHITESPACE, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public FhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).enterFh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraTypedListener ) ((TransformationAlgebraTypedListener)listener).exitFh(this);
		}
	}

	public final FhContext fh() throws RecognitionException {
		FhContext _localctx = new FhContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fh);
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
		public FhContext fh() {
			return getRuleContext(FhContext.class,0);
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
		enterRule(_localctx, 6, RULE_fc1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			fh();
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
		public FhContext fh() {
			return getRuleContext(FhContext.class,0);
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
		enterRule(_localctx, 8, RULE_fc2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			fh();
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
		public FhContext fh() {
			return getRuleContext(FhContext.class,0);
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
		enterRule(_localctx, 10, RULE_fc3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			fh();
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
		enterRule(_localctx, 12, RULE_fc);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
		enterRule(_localctx, 14, RULE_c);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				v();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				r();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				rr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				rrr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
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
		enterRule(_localctx, 16, RULE_bfc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__0);
			setState(91);
			fc();
			setState(92);
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
		enterRule(_localctx, 18, RULE_v);
		try {
			setState(98);
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
				setState(94);
				nomv();
				}
				break;
			case OV:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(OV);
				}
				break;
			case LV:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(LV);
				}
				break;
			case SV:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
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
		enterRule(_localctx, 20, RULE_nomv);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMV:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
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
				setState(101);
				ordv();
				}
				break;
			case BOOLV:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
		enterRule(_localctx, 22, RULE_ordv);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDV:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
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
				setState(106);
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
		enterRule(_localctx, 24, RULE_itvv);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITVV:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(ITVV);
				}
				break;
			case RATV:
			case COUNTV:
			case EV:
			case IV:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
		enterRule(_localctx, 26, RULE_ratv);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATV:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(RATV);
				}
				break;
			case EV:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(EV);
				}
				break;
			case IV:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(IV);
				}
				break;
			case COUNTV:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
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
		enterRule(_localctx, 28, RULE_countv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 30, RULE_r);
		try {
			setState(125);
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
				setState(121);
				nom();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(O);
				}
				break;
			case L:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(L);
				}
				break;
			case S:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
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
		enterRule(_localctx, 32, RULE_nom);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
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
				setState(128);
				ord();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
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
		enterRule(_localctx, 34, RULE_ord);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
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
				setState(133);
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
		enterRule(_localctx, 36, RULE_itv);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ITV:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ITV);
				}
				break;
			case RAT:
			case COUNT:
			case E:
			case I:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
		enterRule(_localctx, 38, RULE_rat);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(RAT);
				}
				break;
			case E:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(E);
				}
				break;
			case I:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(I);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
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
		enterRule(_localctx, 40, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 42, RULE_rr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(REL);
			setState(149);
			match(WHITESPACE);
			setState(150);
			r();
			setState(151);
			match(WHITESPACE);
			setState(152);
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
		enterRule(_localctx, 44, RULE_rrr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(REL);
			setState(155);
			match(WHITESPACE);
			setState(156);
			r();
			setState(157);
			match(WHITESPACE);
			setState(158);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\5\2;\n\2\3\3\3\3\5\3?\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\5\bT\n\b\3\t\3\t\3\t\3\t\3\t\5\t[\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13e\n\13\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\5\rn\n\r\3\16\3\16\5\16"+
		"r\n\16\3\17\3\17\3\17\3\17\5\17x\n\17\3\20\3\20\3\21\3\21\3\21\3\21\5"+
		"\21\u0080\n\21\3\22\3\22\3\22\5\22\u0085\n\22\3\23\3\23\5\23\u0089\n\23"+
		"\3\24\3\24\5\24\u008d\n\24\3\25\3\25\3\25\3\25\5\25\u0093\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2"+
		"\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u00a8\2:\3"+
		"\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fL\3\2\2\2\16S\3\2"+
		"\2\2\20Z\3\2\2\2\22\\\3\2\2\2\24d\3\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32q"+
		"\3\2\2\2\34w\3\2\2\2\36y\3\2\2\2 \177\3\2\2\2\"\u0084\3\2\2\2$\u0088\3"+
		"\2\2\2&\u008c\3\2\2\2(\u0092\3\2\2\2*\u0094\3\2\2\2,\u0096\3\2\2\2.\u009c"+
		"\3\2\2\2\60;\5\4\3\2\61\62\5\4\3\2\62\63\7\36\2\2\63\65\3\2\2\2\64\61"+
		"\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\5\4\3"+
		"\29;\3\2\2\2:\60\3\2\2\2:\64\3\2\2\2;\3\3\2\2\2<?\5\16\b\2=?\5\20\t\2"+
		"><\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@A\7\34\2\2AB\7\36\2\2BC\5\20\t\2C\7\3"+
		"\2\2\2DE\5\6\4\2EF\7\36\2\2FG\5\20\t\2G\t\3\2\2\2HI\5\6\4\2IJ\7\36\2\2"+
		"JK\5\b\5\2K\13\3\2\2\2LM\5\6\4\2MN\7\36\2\2NO\5\n\6\2O\r\3\2\2\2PT\5\b"+
		"\5\2QT\5\n\6\2RT\5\f\7\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\17\3\2\2\2U[\5"+
		"\24\13\2V[\5 \21\2W[\5,\27\2X[\5.\30\2Y[\5\22\n\2ZU\3\2\2\2ZV\3\2\2\2"+
		"ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\21\3\2\2\2\\]\7\3\2\2]^\5\16\b\2^_\7\4"+
		"\2\2_\23\3\2\2\2`e\5\26\f\2ae\7\27\2\2be\7\30\2\2ce\7\31\2\2d`\3\2\2\2"+
		"da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\25\3\2\2\2fj\7\20\2\2gj\5\30\r\2hj\7\32"+
		"\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2j\27\3\2\2\2kn\7\21\2\2ln\5\32\16\2"+
		"mk\3\2\2\2ml\3\2\2\2n\31\3\2\2\2or\7\22\2\2pr\5\34\17\2qo\3\2\2\2qp\3"+
		"\2\2\2r\33\3\2\2\2sx\7\23\2\2tx\7\25\2\2ux\7\26\2\2vx\5\36\20\2ws\3\2"+
		"\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\35\3\2\2\2yz\7\24\2\2z\37\3\2\2\2"+
		"{\u0080\5\"\22\2|\u0080\7\f\2\2}\u0080\7\r\2\2~\u0080\7\16\2\2\177{\3"+
		"\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080!\3\2\2\2\u0081\u0085"+
		"\7\5\2\2\u0082\u0085\5$\23\2\u0083\u0085\7\17\2\2\u0084\u0081\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085#\3\2\2\2\u0086\u0089\7"+
		"\6\2\2\u0087\u0089\5&\24\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"%\3\2\2\2\u008a\u008d\7\7\2\2\u008b\u008d\5(\25\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\'\3\2\2\2\u008e\u0093\7\b\2\2\u008f\u0093\7"+
		"\n\2\2\u0090\u0093\7\13\2\2\u0091\u0093\5*\26\2\u0092\u008e\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093)\3\2\2\2"+
		"\u0094\u0095\7\t\2\2\u0095+\3\2\2\2\u0096\u0097\7\33\2\2\u0097\u0098\7"+
		"\36\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\36\2\2\u009a\u009b\5 \21\2\u009b"+
		"-\3\2\2\2\u009c\u009d\7\33\2\2\u009d\u009e\7\36\2\2\u009e\u009f\5 \21"+
		"\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\5,\27\2\u00a1/\3\2\2\2\21\66:>SZd"+
		"imqw\177\u0084\u0088\u008c\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}