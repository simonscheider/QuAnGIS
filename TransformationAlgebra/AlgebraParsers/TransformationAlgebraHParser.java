// Generated from TransformationAlgebraH.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransformationAlgebraHParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RATIO=1, EQUAL=2, LEQ=3, AVG=4, MIN=5, MAX=6, COUNT=7, SIZE=8, MERGE=9, 
		REIFY=10, DEIFY=11, GET=12, INVERT=13, REVERT=14, FCONT=15, OCONT=16, 
		PI1=17, PI2=18, PI3=19, SIGMAE=20, SIGMASE=21, BOWTIE=22, BOWTIESTAR=23, 
		BOWTIERATIO=24, GROUPBYAVG=25, GROUPBYSUM=26, GROUPBYMIN=27, GROUPBYMAX=28, 
		GROUPBYSIZE=29, GROUPBYCOUNT=30, INTERPOL=31, ODIST=32, LDIST=33, LODIST=34, 
		OTOPO=35, LOTOPO=36, NDIST=37, LVIS=38, DATAPM=39, DATAAMOUNT=40, DATACONTOUR=41, 
		DATAOBJQ=42, DATAOBJS=43, DATAOBJV=44, DATACONTOURLINE=45, DATAOBJCOUNT=46, 
		DATAFIELD=47, TOPOV=48, SV=49, COUNTV=50, RATIOV=51, INTV=52, ORDV=53, 
		BOOLV=54, NOMV=55, DATAV=56, WHITESPACE=57, KEYWORD=58, WS=59;
	public static final int
		RULE_start = 0, RULE_r = 1, RULE_rr = 2, RULE_v = 3, RULE_f = 4, RULE_bf = 5, 
		RULE_countv = 6, RULE_ratiov = 7, RULE_intv = 8, RULE_ordv = 9, RULE_nomv = 10, 
		RULE_qv = 11, RULE_sv = 12, RULE_lv = 13, RULE_ov = 14, RULE_l = 15, RULE_s = 16, 
		RULE_o = 17, RULE_count = 18, RULE_ratio = 19, RULE_intt = 20, RULE_ordinal = 21, 
		RULE_nom = 22, RULE_q = 23, RULE_lratio = 24, RULE_lint = 25, RULE_lord = 26, 
		RULE_lnom = 27, RULE_lq = 28, RULE_ords = 29, RULE_ints = 30, RULE_noms = 31, 
		RULE_qs = 32, RULE_sint = 33, RULE_sord = 34, RULE_snom = 35, RULE_sq = 36, 
		RULE_os = 37, RULE_ocount = 38, RULE_oratio = 39, RULE_oint = 40, RULE_oord = 41, 
		RULE_onom = 42, RULE_oq = 43, RULE_ocounto = 44, RULE_oratioo = 45, RULE_ointo = 46, 
		RULE_oordo = 47, RULE_onomo = 48, RULE_lratioo = 49, RULE_linto = 50, 
		RULE_lnomo = 51, RULE_lratiol = 52, RULE_lintl = 53, RULE_lordl = 54, 
		RULE_lnoml = 55, RULE_lbooll = 56, RULE_groupbyaggord = 57, RULE_ratiovTratiov2ratiov = 58, 
		RULE_vTv2boolv = 59, RULE_ordvTordv2boolv = 60, RULE_vTv2v = 61;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "r", "rr", "v", "f", "bf", "countv", "ratiov", "intv", "ordv", 
			"nomv", "qv", "sv", "lv", "ov", "l", "s", "o", "count", "ratio", "intt", 
			"ordinal", "nom", "q", "lratio", "lint", "lord", "lnom", "lq", "ords", 
			"ints", "noms", "qs", "sint", "sord", "snom", "sq", "os", "ocount", "oratio", 
			"oint", "oord", "onom", "oq", "ocounto", "oratioo", "ointo", "oordo", 
			"onomo", "lratioo", "linto", "lnomo", "lratiol", "lintl", "lordl", "lnoml", 
			"lbooll", "groupbyaggord", "ratiovTratiov2ratiov", "vTv2boolv", "ordvTordv2boolv", 
			"vTv2v"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ratio '", "'='", "'<='", "'avg '", "'min '", "'max '", "'count '", 
			"'size '", "'merge '", "'reify '", "'deify '", "'get '", "'invert '", 
			"'revert '", "'fcont '", "'ocont '", "'pi1 '", "'pi2 '", "'pi3 '", "'sigmae '", 
			"'sigmale '", "'bowtie '", "'bowtie* '", "'bowtie_ratio '", "'groupby_avg '", 
			"'groupby_sum '", "'groupby_min '", "'groupby_max '", "'groupby_size '", 
			"'groupby_count '", "'interpol '", "'odist '", "'ldist '", "'lodist '", 
			"'otopo '", "'lotopo '", "'ndist '", "'lvis '", null, null, null, null, 
			null, null, null, null, null, "'in'", null, null, null, null, null, null, 
			null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RATIO", "EQUAL", "LEQ", "AVG", "MIN", "MAX", "COUNT", "SIZE", 
			"MERGE", "REIFY", "DEIFY", "GET", "INVERT", "REVERT", "FCONT", "OCONT", 
			"PI1", "PI2", "PI3", "SIGMAE", "SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", 
			"GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", 
			"GROUPBYCOUNT", "INTERPOL", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", 
			"NDIST", "LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
			"DATAOBJV", "DATACONTOURLINE", "DATAOBJCOUNT", "DATAFIELD", "TOPOV", 
			"SV", "COUNTV", "RATIOV", "INTV", "ORDV", "BOOLV", "NOMV", "DATAV", "WHITESPACE", 
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
	public String getGrammarFileName() { return "TransformationAlgebraH.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TransformationAlgebraHParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public RrContext rr() {
			return getRuleContext(RrContext.class,0);
		}
		public VContext v() {
			return getRuleContext(VContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(124);
				r();
				}
				break;
			case 2:
				{
				setState(125);
				rr();
				}
				break;
			case 3:
				{
				setState(126);
				v();
				}
				break;
			case 4:
				{
				setState(127);
				f();
				}
				break;
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
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(130);
				l();
				}
				break;
			case 2:
				{
				setState(131);
				s();
				}
				break;
			case 3:
				{
				setState(132);
				q();
				}
				break;
			case 4:
				{
				setState(133);
				o();
				}
				break;
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
		public LqContext lq() {
			return getRuleContext(LqContext.class,0);
		}
		public SqContext sq() {
			return getRuleContext(SqContext.class,0);
		}
		public QsContext qs() {
			return getRuleContext(QsContext.class,0);
		}
		public OqContext oq() {
			return getRuleContext(OqContext.class,0);
		}
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public RrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterRr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitRr(this);
		}
	}

	public final RrContext rr() throws RecognitionException {
		RrContext _localctx = new RrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(136);
				lq();
				}
				break;
			case 2:
				{
				setState(137);
				sq();
				}
				break;
			case 3:
				{
				setState(138);
				qs();
				}
				break;
			case 4:
				{
				setState(139);
				oq();
				}
				break;
			case 5:
				{
				setState(140);
				os();
				}
				break;
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

	public static class VContext extends ParserRuleContext {
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
		}
		public LvContext lv() {
			return getRuleContext(LvContext.class,0);
		}
		public SvContext sv() {
			return getRuleContext(SvContext.class,0);
		}
		public QvContext qv() {
			return getRuleContext(QvContext.class,0);
		}
		public VContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(143);
				ov();
				}
				break;
			case 2:
				{
				setState(144);
				lv();
				}
				break;
			case 3:
				{
				setState(145);
				sv();
				}
				break;
			case 4:
				{
				setState(146);
				qv();
				}
				break;
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

	public static class FContext extends ParserRuleContext {
		public BfContext bf() {
			return getRuleContext(BfContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149);
			bf();
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

	public static class BfContext extends ParserRuleContext {
		public VTv2vContext vTv2v() {
			return getRuleContext(VTv2vContext.class,0);
		}
		public BfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterBf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitBf(this);
		}
	}

	public final BfContext bf() throws RecognitionException {
		BfContext _localctx = new BfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(151);
			vTv2v();
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

	public static class CountvContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(TransformationAlgebraHParser.COUNT, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode COUNTV() { return getToken(TransformationAlgebraHParser.COUNTV, 0); }
		public CountvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterCountv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitCountv(this);
		}
	}

	public final CountvContext countv() throws RecognitionException {
		CountvContext _localctx = new CountvContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_countv);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(COUNT);
				setState(154);
				o();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(GET);
				setState(156);
				count();
				}
				break;
			case COUNTV:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(COUNTV);
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

	public static class RatiovContext extends ParserRuleContext {
		public TerminalNode FCONT() { return getToken(TransformationAlgebraHParser.FCONT, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(TransformationAlgebraHParser.SIZE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode RATIO() { return getToken(TransformationAlgebraHParser.RATIO, 0); }
		public List<RatiovContext> ratiov() {
			return getRuleContexts(RatiovContext.class);
		}
		public RatiovContext ratiov(int i) {
			return getRuleContext(RatiovContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public TerminalNode OCONT() { return getToken(TransformationAlgebraHParser.OCONT, 0); }
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public CountvContext countv() {
			return getRuleContext(CountvContext.class,0);
		}
		public TerminalNode RATIOV() { return getToken(TransformationAlgebraHParser.RATIOV, 0); }
		public RatiovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratiov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterRatiov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitRatiov(this);
		}
	}

	public final RatiovContext ratiov() throws RecognitionException {
		RatiovContext _localctx = new RatiovContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ratiov);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(FCONT);
				setState(161);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(SIZE);
				setState(163);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(RATIO);
				setState(165);
				ratiov();
				setState(166);
				match(WHITESPACE);
				setState(167);
				ratiov();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(OCONT);
				setState(170);
				oratio();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
				match(GET);
				setState(172);
				ratio();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				countv();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				match(RATIOV);
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

	public static class IntvContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(TransformationAlgebraHParser.AVG, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public RatiovContext ratiov() {
			return getRuleContext(RatiovContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public InttContext intt() {
			return getRuleContext(InttContext.class,0);
		}
		public TerminalNode INTV() { return getToken(TransformationAlgebraHParser.INTV, 0); }
		public IntvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterIntv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitIntv(this);
		}
	}

	public final IntvContext intv() throws RecognitionException {
		IntvContext _localctx = new IntvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intv);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(AVG);
				setState(178);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(AVG);
				setState(180);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				ratiov();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(GET);
				setState(183);
				intt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(INTV);
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

	public static class OrdvContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(TransformationAlgebraHParser.MAX, 0); }
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public TerminalNode MIN() { return getToken(TransformationAlgebraHParser.MIN, 0); }
		public OordContext oord() {
			return getRuleContext(OordContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public OrdinalContext ordinal() {
			return getRuleContext(OrdinalContext.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode ORDV() { return getToken(TransformationAlgebraHParser.ORDV, 0); }
		public OrdvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOrdv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOrdv(this);
		}
	}

	public final OrdvContext ordv() throws RecognitionException {
		OrdvContext _localctx = new OrdvContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ordv);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(MAX);
				setState(188);
				lord();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(MIN);
				setState(190);
				lord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(MAX);
				setState(192);
				oord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(MIN);
				setState(194);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(GET);
				setState(196);
				ordinal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				intv();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(ORDV);
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

	public static class NomvContext extends ParserRuleContext {
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public TerminalNode TOPOV() { return getToken(TransformationAlgebraHParser.TOPOV, 0); }
		public TerminalNode NOMV() { return getToken(TransformationAlgebraHParser.NOMV, 0); }
		public NomvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterNomv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitNomv(this);
		}
	}

	public final NomvContext nomv() throws RecognitionException {
		NomvContext _localctx = new NomvContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nomv);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(GET);
				setState(203);
				nom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(TOPOV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(NOMV);
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

	public static class QvContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public RatiovContext ratiov() {
			return getRuleContext(RatiovContext.class,0);
		}
		public CountvContext countv() {
			return getRuleContext(CountvContext.class,0);
		}
		public QvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterQv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitQv(this);
		}
	}

	public final QvContext qv() throws RecognitionException {
		QvContext _localctx = new QvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_qv);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(GET);
				setState(209);
				q();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				nomv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				ordv();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				intv();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				ratiov();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				countv();
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

	public static class SvContext extends ParserRuleContext {
		public TerminalNode REIFY() { return getToken(TransformationAlgebraHParser.REIFY, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode MERGE() { return getToken(TransformationAlgebraHParser.MERGE, 0); }
		public TerminalNode SV() { return getToken(TransformationAlgebraHParser.SV, 0); }
		public SvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterSv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitSv(this);
		}
	}

	public final SvContext sv() throws RecognitionException {
		SvContext _localctx = new SvContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sv);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(REIFY);
				setState(218);
				l();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(GET);
				setState(220);
				s();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(MERGE);
				setState(222);
				s();
				}
				break;
			case SV:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
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

	public static class LvContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public LvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLv(this);
		}
	}

	public final LvContext lv() throws RecognitionException {
		LvContext _localctx = new LvContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(GET);
			setState(227);
			l();
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

	public static class OvContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(TransformationAlgebraHParser.GET, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode DATAOBJV() { return getToken(TransformationAlgebraHParser.DATAOBJV, 0); }
		public OvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOv(this);
		}
	}

	public final OvContext ov() throws RecognitionException {
		OvContext _localctx = new OvContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ov);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(GET);
				setState(230);
				o();
				}
				break;
			case DATAOBJV:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(DATAOBJV);
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

	public static class LContext extends ParserRuleContext {
		public TerminalNode DEIFY() { return getToken(TransformationAlgebraHParser.DEIFY, 0); }
		public SvContext sv() {
			return getRuleContext(SvContext.class,0);
		}
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public LnomContext lnom() {
			return getRuleContext(LnomContext.class,0);
		}
		public LqContext lq() {
			return getRuleContext(LqContext.class,0);
		}
		public LratioContext lratio() {
			return getRuleContext(LratioContext.class,0);
		}
		public LintoContext linto() {
			return getRuleContext(LintoContext.class,0);
		}
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_l);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(DEIFY);
				setState(235);
				sv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(PI1);
				setState(237);
				lint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(PI1);
				setState(239);
				lord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(PI1);
				setState(241);
				lnom();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(PI1);
				setState(243);
				lq();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(PI1);
				setState(245);
				lratio();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(PI1);
				setState(247);
				linto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				match(PI1);
				setState(249);
				lnomo();
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

	public static class SContext extends ParserRuleContext {
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public SintContext sint() {
			return getRuleContext(SintContext.class,0);
		}
		public SordContext sord() {
			return getRuleContext(SordContext.class,0);
		}
		public SnomContext snom() {
			return getRuleContext(SnomContext.class,0);
		}
		public LqContext lq() {
			return getRuleContext(LqContext.class,0);
		}
		public TerminalNode PI2() { return getToken(TransformationAlgebraHParser.PI2, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_s);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(PI1);
				setState(253);
				sint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(PI1);
				setState(255);
				sord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(PI1);
				setState(257);
				snom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(PI1);
				setState(259);
				lq();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(PI2);
				setState(261);
				os();
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

	public static class OContext extends ParserRuleContext {
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public OordContext oord() {
			return getRuleContext(OordContext.class,0);
		}
		public OnomContext onom() {
			return getRuleContext(OnomContext.class,0);
		}
		public OqContext oq() {
			return getRuleContext(OqContext.class,0);
		}
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode PI2() { return getToken(TransformationAlgebraHParser.PI2, 0); }
		public TerminalNode PI3() { return getToken(TransformationAlgebraHParser.PI3, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitO(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_o);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(PI1);
				setState(265);
				os();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(PI1);
				setState(267);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(PI1);
				setState(269);
				oint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				match(PI1);
				setState(271);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(PI1);
				setState(273);
				onom();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(PI1);
				setState(275);
				oq();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(PI1);
				setState(277);
				onomo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				match(PI2);
				setState(279);
				onomo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(280);
				match(PI3);
				setState(281);
				lnomo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				match(PI3);
				setState(283);
				onomo();
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

	public static class CountContext extends ParserRuleContext {
		public TerminalNode PI2() { return getToken(TransformationAlgebraHParser.PI2, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitCount(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PI2);
			setState(287);
			ocount();
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

	public static class RatioContext extends ParserRuleContext {
		public TerminalNode PI2() { return getToken(TransformationAlgebraHParser.PI2, 0); }
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public LratioContext lratio() {
			return getRuleContext(LratioContext.class,0);
		}
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public RatioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterRatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitRatio(this);
		}
	}

	public final RatioContext ratio() throws RecognitionException {
		RatioContext _localctx = new RatioContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ratio);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(PI2);
				setState(290);
				oratio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(PI2);
				setState(292);
				lratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				count();
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

	public static class InttContext extends ParserRuleContext {
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public IntsContext ints() {
			return getRuleContext(IntsContext.class,0);
		}
		public TerminalNode PI2() { return getToken(TransformationAlgebraHParser.PI2, 0); }
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public InttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterIntt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitIntt(this);
		}
	}

	public final InttContext intt() throws RecognitionException {
		InttContext _localctx = new InttContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intt);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(PI1);
				setState(297);
				ints();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(PI2);
				setState(299);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(PI2);
				setState(301);
				lint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				ratio();
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

	public static class OrdinalContext extends ParserRuleContext {
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public OrdsContext ords() {
			return getRuleContext(OrdsContext.class,0);
		}
		public InttContext intt() {
			return getRuleContext(InttContext.class,0);
		}
		public OrdinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOrdinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOrdinal(this);
		}
	}

	public final OrdinalContext ordinal() throws RecognitionException {
		OrdinalContext _localctx = new OrdinalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ordinal);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(PI1);
				setState(306);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				intt();
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

	public static class NomContext extends ParserRuleContext {
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public NomsContext noms() {
			return getRuleContext(NomsContext.class,0);
		}
		public OrdinalContext ordinal() {
			return getRuleContext(OrdinalContext.class,0);
		}
		public NomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterNom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitNom(this);
		}
	}

	public final NomContext nom() throws RecognitionException {
		NomContext _localctx = new NomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nom);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(PI1);
				setState(311);
				noms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				ordinal();
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

	public static class QContext extends ParserRuleContext {
		public TerminalNode PI1() { return getToken(TransformationAlgebraHParser.PI1, 0); }
		public QsContext qs() {
			return getRuleContext(QsContext.class,0);
		}
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitQ(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_q);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(PI1);
				setState(316);
				qs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				nom();
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

	public static class LratioContext extends ParserRuleContext {
		public TerminalNode DATAFIELD() { return getToken(TransformationAlgebraHParser.DATAFIELD, 0); }
		public LratioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLratio(this);
		}
	}

	public final LratioContext lratio() throws RecognitionException {
		LratioContext _localctx = new LratioContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lratio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(DATAFIELD);
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

	public static class LintContext extends ParserRuleContext {
		public TerminalNode INTERPOL() { return getToken(TransformationAlgebraHParser.INTERPOL, 0); }
		public SintContext sint() {
			return getRuleContext(SintContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraHParser.GROUPBYAVG, 0); }
		public LintlContext lintl() {
			return getRuleContext(LintlContext.class,0);
		}
		public LratioContext lratio() {
			return getRuleContext(LratioContext.class,0);
		}
		public LintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLint(this);
		}
	}

	public final LintContext lint() throws RecognitionException {
		LintContext _localctx = new LintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lint);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(INTERPOL);
				setState(323);
				sint();
				setState(324);
				match(WHITESPACE);
				setState(325);
				l();
				}
				break;
			case SIGMASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(SIGMASE);
				setState(328);
				lint();
				setState(329);
				match(WHITESPACE);
				setState(330);
				intv();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(BOWTIE);
				setState(333);
				lint();
				setState(334);
				match(WHITESPACE);
				setState(335);
				l();
				}
				break;
			case GROUPBYAVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(GROUPBYAVG);
				setState(338);
				lintl();
				}
				break;
			case DATAFIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				lratio();
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

	public static class LordContext extends ParserRuleContext {
		public TerminalNode REVERT() { return getToken(TransformationAlgebraHParser.REVERT, 0); }
		public OrdsContext ords() {
			return getRuleContext(OrdsContext.class,0);
		}
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public GroupbyaggordContext groupbyaggord() {
			return getRuleContext(GroupbyaggordContext.class,0);
		}
		public LordlContext lordl() {
			return getRuleContext(LordlContext.class,0);
		}
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public LordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLord(this);
		}
	}

	public final LordContext lord() throws RecognitionException {
		LordContext _localctx = new LordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lord);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(REVERT);
				setState(343);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(SIGMASE);
				setState(345);
				lord();
				setState(346);
				match(WHITESPACE);
				setState(347);
				ordv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(BOWTIE);
				setState(350);
				lord();
				setState(351);
				match(WHITESPACE);
				setState(352);
				l();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				groupbyaggord();
				setState(355);
				lordl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				lint();
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

	public static class LnomContext extends ParserRuleContext {
		public TerminalNode REVERT() { return getToken(TransformationAlgebraHParser.REVERT, 0); }
		public SnomContext snom() {
			return getRuleContext(SnomContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public LnomContext lnom() {
			return getRuleContext(LnomContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public LnomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lnom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLnom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLnom(this);
		}
	}

	public final LnomContext lnom() throws RecognitionException {
		LnomContext _localctx = new LnomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lnom);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(REVERT);
				setState(361);
				snom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(SIGMAE);
				setState(363);
				lnom();
				setState(364);
				match(WHITESPACE);
				setState(365);
				nomv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				lord();
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

	public static class LqContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public LqContext lq() {
			return getRuleContext(LqContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public QvContext qv() {
			return getRuleContext(QvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public LnomContext lnom() {
			return getRuleContext(LnomContext.class,0);
		}
		public LqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLq(this);
		}
	}

	public final LqContext lq() throws RecognitionException {
		LqContext _localctx = new LqContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lq);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(SIGMAE);
				setState(371);
				lq();
				setState(372);
				match(WHITESPACE);
				setState(373);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(BOWTIE);
				setState(376);
				lq();
				setState(377);
				match(WHITESPACE);
				setState(378);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				lnom();
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

	public static class OrdsContext extends ParserRuleContext {
		public TerminalNode INVERT() { return getToken(TransformationAlgebraHParser.INVERT, 0); }
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public OrdsContext ords() {
			return getRuleContext(OrdsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode DATACONTOUR() { return getToken(TransformationAlgebraHParser.DATACONTOUR, 0); }
		public OrdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOrds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOrds(this);
		}
	}

	public final OrdsContext ords() throws RecognitionException {
		OrdsContext _localctx = new OrdsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ords);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				match(INVERT);
				setState(384);
				lord();
				}
				break;
			case SIGMASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(SIGMASE);
				setState(386);
				ords();
				setState(387);
				match(WHITESPACE);
				setState(388);
				ordv();
				}
				break;
			case DATACONTOUR:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(DATACONTOUR);
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

	public static class IntsContext extends ParserRuleContext {
		public TerminalNode DATACONTOURLINE() { return getToken(TransformationAlgebraHParser.DATACONTOURLINE, 0); }
		public IntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitInts(this);
		}
	}

	public final IntsContext ints() throws RecognitionException {
		IntsContext _localctx = new IntsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(DATACONTOURLINE);
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

	public static class NomsContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public NomsContext noms() {
			return getRuleContext(NomsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public OrdsContext ords() {
			return getRuleContext(OrdsContext.class,0);
		}
		public NomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterNoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitNoms(this);
		}
	}

	public final NomsContext noms() throws RecognitionException {
		NomsContext _localctx = new NomsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_noms);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(SIGMAE);
				setState(396);
				noms();
				setState(397);
				match(WHITESPACE);
				setState(398);
				nomv();
				}
				break;
			case INVERT:
			case SIGMASE:
			case DATACONTOUR:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				ords();
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

	public static class QsContext extends ParserRuleContext {
		public NomsContext noms() {
			return getRuleContext(NomsContext.class,0);
		}
		public QsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterQs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitQs(this);
		}
	}

	public final QsContext qs() throws RecognitionException {
		QsContext _localctx = new QsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			noms();
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

	public static class SintContext extends ParserRuleContext {
		public TerminalNode DATAPM() { return getToken(TransformationAlgebraHParser.DATAPM, 0); }
		public SintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterSint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitSint(this);
		}
	}

	public final SintContext sint() throws RecognitionException {
		SintContext _localctx = new SintContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(DATAPM);
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

	public static class SordContext extends ParserRuleContext {
		public SintContext sint() {
			return getRuleContext(SintContext.class,0);
		}
		public SordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterSord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitSord(this);
		}
	}

	public final SordContext sord() throws RecognitionException {
		SordContext _localctx = new SordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			sint();
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

	public static class SnomContext extends ParserRuleContext {
		public TerminalNode DATAAMOUNT() { return getToken(TransformationAlgebraHParser.DATAAMOUNT, 0); }
		public TerminalNode INVERT() { return getToken(TransformationAlgebraHParser.INVERT, 0); }
		public LnomContext lnom() {
			return getRuleContext(LnomContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public SnomContext snom() {
			return getRuleContext(SnomContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public SordContext sord() {
			return getRuleContext(SordContext.class,0);
		}
		public SnomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterSnom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitSnom(this);
		}
	}

	public final SnomContext snom() throws RecognitionException {
		SnomContext _localctx = new SnomContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_snom);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATAAMOUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(DATAAMOUNT);
				}
				break;
			case INVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(INVERT);
				setState(411);
				lnom();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				match(SIGMAE);
				setState(413);
				snom();
				setState(414);
				match(WHITESPACE);
				setState(415);
				nomv();
				}
				break;
			case DATAPM:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				sord();
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

	public static class SqContext extends ParserRuleContext {
		public SnomContext snom() {
			return getRuleContext(SnomContext.class,0);
		}
		public SqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterSq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitSq(this);
		}
	}

	public final SqContext sq() throws RecognitionException {
		SqContext _localctx = new SqContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			snom();
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

	public static class OsContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode DATAOBJS() { return getToken(TransformationAlgebraHParser.DATAOBJS, 0); }
		public OsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_os; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOs(this);
		}
	}

	public final OsContext os() throws RecognitionException {
		OsContext _localctx = new OsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_os);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(SIGMAE);
				setState(423);
				os();
				setState(424);
				match(WHITESPACE);
				setState(425);
				ov();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(BOWTIE);
				setState(428);
				os();
				setState(429);
				match(WHITESPACE);
				setState(430);
				o();
				}
				break;
			case DATAOBJS:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(DATAOBJS);
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

	public static class OcountContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GROUPBYCOUNT() { return getToken(TransformationAlgebraHParser.GROUPBYCOUNT, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraHParser.GROUPBYAVG, 0); }
		public OcountoContext ocounto() {
			return getRuleContext(OcountoContext.class,0);
		}
		public TerminalNode GROUPBYSUM() { return getToken(TransformationAlgebraHParser.GROUPBYSUM, 0); }
		public TerminalNode DATAOBJCOUNT() { return getToken(TransformationAlgebraHParser.DATAOBJCOUNT, 0); }
		public OcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOcount(this);
		}
	}

	public final OcountContext ocount() throws RecognitionException {
		OcountContext _localctx = new OcountContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ocount);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(SIGMAE);
				setState(436);
				ocount();
				setState(437);
				match(WHITESPACE);
				setState(438);
				ov();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(BOWTIE);
				setState(441);
				ocount();
				setState(442);
				match(WHITESPACE);
				setState(443);
				o();
				}
				break;
			case GROUPBYCOUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(GROUPBYCOUNT);
				setState(446);
				onomo();
				}
				break;
			case GROUPBYAVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(GROUPBYAVG);
				setState(448);
				ocounto();
				}
				break;
			case GROUPBYSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(GROUPBYSUM);
				setState(450);
				ocounto();
				}
				break;
			case DATAOBJCOUNT:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				match(DATAOBJCOUNT);
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

	public static class OratioContext extends ParserRuleContext {
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public List<OratioContext> oratio() {
			return getRuleContexts(OratioContext.class);
		}
		public OratioContext oratio(int i) {
			return getRuleContext(OratioContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode BOWTIERATIO() { return getToken(TransformationAlgebraHParser.BOWTIERATIO, 0); }
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraHParser.GROUPBYAVG, 0); }
		public OratiooContext oratioo() {
			return getRuleContext(OratiooContext.class,0);
		}
		public TerminalNode GROUPBYSUM() { return getToken(TransformationAlgebraHParser.GROUPBYSUM, 0); }
		public LratiooContext lratioo() {
			return getRuleContext(LratiooContext.class,0);
		}
		public TerminalNode GROUPBYSIZE() { return getToken(TransformationAlgebraHParser.GROUPBYSIZE, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public TerminalNode DATAOBJQ() { return getToken(TransformationAlgebraHParser.DATAOBJQ, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public OratioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOratio(this);
		}
	}

	public final OratioContext oratio() throws RecognitionException {
		OratioContext _localctx = new OratioContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_oratio);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(BOWTIE);
				setState(455);
				oratio();
				setState(456);
				match(WHITESPACE);
				setState(457);
				o();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(BOWTIERATIO);
				setState(460);
				oratio();
				setState(461);
				match(WHITESPACE);
				setState(462);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(GROUPBYAVG);
				setState(465);
				oratioo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(GROUPBYSUM);
				setState(467);
				oratioo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				match(GROUPBYAVG);
				setState(469);
				lratioo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				match(GROUPBYSIZE);
				setState(471);
				lnomo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(472);
				match(DATAOBJQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(473);
				ocount();
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

	public static class OintContext extends ParserRuleContext {
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraHParser.GROUPBYAVG, 0); }
		public OintoContext ointo() {
			return getRuleContext(OintoContext.class,0);
		}
		public LintoContext linto() {
			return getRuleContext(LintoContext.class,0);
		}
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public OintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOint(this);
		}
	}

	public final OintContext oint() throws RecognitionException {
		OintContext _localctx = new OintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_oint);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(SIGMASE);
				setState(477);
				oint();
				setState(478);
				match(WHITESPACE);
				setState(479);
				intv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(BOWTIE);
				setState(482);
				oint();
				setState(483);
				match(WHITESPACE);
				setState(484);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(GROUPBYAVG);
				setState(487);
				ointo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(GROUPBYAVG);
				setState(489);
				linto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				oratio();
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

	public static class OordContext extends ParserRuleContext {
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public OordContext oord() {
			return getRuleContext(OordContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public GroupbyaggordContext groupbyaggord() {
			return getRuleContext(GroupbyaggordContext.class,0);
		}
		public OordoContext oordo() {
			return getRuleContext(OordoContext.class,0);
		}
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public OordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOord(this);
		}
	}

	public final OordContext oord() throws RecognitionException {
		OordContext _localctx = new OordContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oord);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(SIGMASE);
				setState(494);
				oord();
				setState(495);
				match(WHITESPACE);
				setState(496);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(BOWTIE);
				setState(499);
				oord();
				setState(500);
				match(WHITESPACE);
				setState(501);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				groupbyaggord();
				setState(504);
				oordo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(506);
				oint();
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

	public static class OnomContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public OnomContext onom() {
			return getRuleContext(OnomContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public OordContext oord() {
			return getRuleContext(OordContext.class,0);
		}
		public OnomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOnom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOnom(this);
		}
	}

	public final OnomContext onom() throws RecognitionException {
		OnomContext _localctx = new OnomContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_onom);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(SIGMAE);
				setState(510);
				onom();
				setState(511);
				match(WHITESPACE);
				setState(512);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				oord();
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

	public static class OqContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public OqContext oq() {
			return getRuleContext(OqContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public QvContext qv() {
			return getRuleContext(QvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraHParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public OnomContext onom() {
			return getRuleContext(OnomContext.class,0);
		}
		public OqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOq(this);
		}
	}

	public final OqContext oq() throws RecognitionException {
		OqContext _localctx = new OqContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_oq);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(SIGMAE);
				setState(518);
				oq();
				setState(519);
				match(WHITESPACE);
				setState(520);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(BOWTIE);
				setState(523);
				oq();
				setState(524);
				match(WHITESPACE);
				setState(525);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				onom();
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

	public static class OcountoContext extends ParserRuleContext {
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public OcountoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocounto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOcounto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOcounto(this);
		}
	}

	public final OcountoContext ocounto() throws RecognitionException {
		OcountoContext _localctx = new OcountoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ocounto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(BOWTIESTAR);
			setState(531);
			onomo();
			setState(532);
			match(WHITESPACE);
			setState(533);
			ocount();
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

	public static class OratiooContext extends ParserRuleContext {
		public TerminalNode ODIST() { return getToken(TransformationAlgebraHParser.ODIST, 0); }
		public List<OsContext> os() {
			return getRuleContexts(OsContext.class);
		}
		public OsContext os(int i) {
			return getRuleContext(OsContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraHParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraHParser.WHITESPACE, i);
		}
		public TerminalNode NDIST() { return getToken(TransformationAlgebraHParser.NDIST, 0); }
		public List<OContext> o() {
			return getRuleContexts(OContext.class);
		}
		public OContext o(int i) {
			return getRuleContext(OContext.class,i);
		}
		public OratiooContext oratioo() {
			return getRuleContext(OratiooContext.class,0);
		}
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public OratiooContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oratioo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOratioo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOratioo(this);
		}
	}

	public final OratiooContext oratioo() throws RecognitionException {
		OratiooContext _localctx = new OratiooContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oratioo);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(ODIST);
				setState(536);
				os();
				setState(537);
				match(WHITESPACE);
				setState(538);
				os();
				}
				break;
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(NDIST);
				setState(541);
				o();
				setState(542);
				match(WHITESPACE);
				setState(543);
				o();
				setState(544);
				match(WHITESPACE);
				setState(545);
				oratioo();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				match(BOWTIESTAR);
				setState(548);
				onomo();
				setState(549);
				match(WHITESPACE);
				setState(550);
				oratio();
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

	public static class OintoContext extends ParserRuleContext {
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public OratiooContext oratioo() {
			return getRuleContext(OratiooContext.class,0);
		}
		public OintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ointo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOinto(this);
		}
	}

	public final OintoContext ointo() throws RecognitionException {
		OintoContext _localctx = new OintoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ointo);
		try {
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(BOWTIESTAR);
				setState(555);
				onomo();
				setState(556);
				match(WHITESPACE);
				setState(557);
				oint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				oratioo();
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

	public static class OordoContext extends ParserRuleContext {
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public OordoContext oordo() {
			return getRuleContext(OordoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public OintoContext ointo() {
			return getRuleContext(OintoContext.class,0);
		}
		public OordoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oordo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOordo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOordo(this);
		}
	}

	public final OordoContext oordo() throws RecognitionException {
		OordoContext _localctx = new OordoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_oordo);
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(SIGMASE);
				setState(563);
				oordo();
				setState(564);
				match(WHITESPACE);
				setState(565);
				ordv();
				}
				break;
			case BOWTIESTAR:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				ointo();
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

	public static class OnomoContext extends ParserRuleContext {
		public TerminalNode OTOPO() { return getToken(TransformationAlgebraHParser.OTOPO, 0); }
		public List<OsContext> os() {
			return getRuleContexts(OsContext.class);
		}
		public OsContext os(int i) {
			return getRuleContext(OsContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public OordoContext oordo() {
			return getRuleContext(OordoContext.class,0);
		}
		public OnomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOnomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOnomo(this);
		}
	}

	public final OnomoContext onomo() throws RecognitionException {
		OnomoContext _localctx = new OnomoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_onomo);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(OTOPO);
				setState(571);
				os();
				setState(572);
				match(WHITESPACE);
				setState(573);
				os();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(SIGMAE);
				setState(576);
				onomo();
				setState(577);
				match(WHITESPACE);
				setState(578);
				nomv();
				}
				break;
			case SIGMASE:
			case BOWTIESTAR:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				oordo();
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

	public static class LratiooContext extends ParserRuleContext {
		public TerminalNode LODIST() { return getToken(TransformationAlgebraHParser.LODIST, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public LratioContext lratio() {
			return getRuleContext(LratioContext.class,0);
		}
		public LratiooContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lratioo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLratioo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLratioo(this);
		}
	}

	public final LratiooContext lratioo() throws RecognitionException {
		LratiooContext _localctx = new LratiooContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lratioo);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(LODIST);
				setState(584);
				l();
				setState(585);
				match(WHITESPACE);
				setState(586);
				o();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(BOWTIESTAR);
				setState(589);
				lnomo();
				setState(590);
				match(WHITESPACE);
				setState(591);
				lratio();
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

	public static class LintoContext extends ParserRuleContext {
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public LratiooContext lratioo() {
			return getRuleContext(LratiooContext.class,0);
		}
		public LintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLinto(this);
		}
	}

	public final LintoContext linto() throws RecognitionException {
		LintoContext _localctx = new LintoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_linto);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(BOWTIESTAR);
				setState(596);
				lnomo();
				setState(597);
				match(WHITESPACE);
				setState(598);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				lratioo();
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

	public static class LnomoContext extends ParserRuleContext {
		public TerminalNode LOTOPO() { return getToken(TransformationAlgebraHParser.LOTOPO, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public LnomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lnomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLnomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLnomo(this);
		}
	}

	public final LnomoContext lnomo() throws RecognitionException {
		LnomoContext _localctx = new LnomoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lnomo);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(LOTOPO);
				setState(604);
				l();
				setState(605);
				match(WHITESPACE);
				setState(606);
				os();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				match(SIGMAE);
				setState(609);
				lnomo();
				setState(610);
				match(WHITESPACE);
				setState(611);
				nomv();
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

	public static class LratiolContext extends ParserRuleContext {
		public TerminalNode LDIST() { return getToken(TransformationAlgebraHParser.LDIST, 0); }
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public LnomlContext lnoml() {
			return getRuleContext(LnomlContext.class,0);
		}
		public LratioContext lratio() {
			return getRuleContext(LratioContext.class,0);
		}
		public LratiolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lratiol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLratiol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLratiol(this);
		}
	}

	public final LratiolContext lratiol() throws RecognitionException {
		LratiolContext _localctx = new LratiolContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lratiol);
		try {
			setState(625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LDIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				match(LDIST);
				setState(616);
				l();
				setState(617);
				match(WHITESPACE);
				setState(618);
				l();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(BOWTIESTAR);
				setState(621);
				lnoml();
				setState(622);
				match(WHITESPACE);
				setState(623);
				lratio();
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

	public static class LintlContext extends ParserRuleContext {
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraHParser.BOWTIESTAR, 0); }
		public LnomlContext lnoml() {
			return getRuleContext(LnomlContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public LratiolContext lratiol() {
			return getRuleContext(LratiolContext.class,0);
		}
		public LintlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lintl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLintl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLintl(this);
		}
	}

	public final LintlContext lintl() throws RecognitionException {
		LintlContext _localctx = new LintlContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lintl);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				match(BOWTIESTAR);
				setState(628);
				lnoml();
				setState(629);
				match(WHITESPACE);
				setState(630);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				lratiol();
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

	public static class LordlContext extends ParserRuleContext {
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraHParser.SIGMASE, 0); }
		public LordlContext lordl() {
			return getRuleContext(LordlContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public LintlContext lintl() {
			return getRuleContext(LintlContext.class,0);
		}
		public LordlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lordl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLordl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLordl(this);
		}
	}

	public final LordlContext lordl() throws RecognitionException {
		LordlContext _localctx = new LordlContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lordl);
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(SIGMASE);
				setState(636);
				lordl();
				setState(637);
				match(WHITESPACE);
				setState(638);
				ordv();
				}
				break;
			case BOWTIESTAR:
			case LDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				lintl();
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

	public static class LnomlContext extends ParserRuleContext {
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public LnomlContext lnoml() {
			return getRuleContext(LnomlContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraHParser.WHITESPACE, 0); }
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public LboollContext lbooll() {
			return getRuleContext(LboollContext.class,0);
		}
		public LordlContext lordl() {
			return getRuleContext(LordlContext.class,0);
		}
		public LnomlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lnoml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLnoml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLnoml(this);
		}
	}

	public final LnomlContext lnoml() throws RecognitionException {
		LnomlContext _localctx = new LnomlContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_lnoml);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(SIGMAE);
				setState(644);
				lnoml();
				setState(645);
				match(WHITESPACE);
				setState(646);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				lbooll();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				lordl();
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

	public static class LboollContext extends ParserRuleContext {
		public TerminalNode LVIS() { return getToken(TransformationAlgebraHParser.LVIS, 0); }
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraHParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraHParser.WHITESPACE, i);
		}
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraHParser.SIGMAE, 0); }
		public LboollContext lbooll() {
			return getRuleContext(LboollContext.class,0);
		}
		public TerminalNode BOOLV() { return getToken(TransformationAlgebraHParser.BOOLV, 0); }
		public LboollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbooll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterLbooll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitLbooll(this);
		}
	}

	public final LboollContext lbooll() throws RecognitionException {
		LboollContext _localctx = new LboollContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_lbooll);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LVIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(LVIS);
				setState(653);
				l();
				setState(654);
				match(WHITESPACE);
				setState(655);
				l();
				setState(656);
				match(WHITESPACE);
				setState(657);
				oint();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(SIGMAE);
				setState(660);
				lbooll();
				setState(661);
				match(WHITESPACE);
				setState(662);
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

	public static class GroupbyaggordContext extends ParserRuleContext {
		public TerminalNode GROUPBYMIN() { return getToken(TransformationAlgebraHParser.GROUPBYMIN, 0); }
		public TerminalNode GROUPBYMAX() { return getToken(TransformationAlgebraHParser.GROUPBYMAX, 0); }
		public GroupbyaggordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupbyaggord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterGroupbyaggord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitGroupbyaggord(this);
		}
	}

	public final GroupbyaggordContext groupbyaggord() throws RecognitionException {
		GroupbyaggordContext _localctx = new GroupbyaggordContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_groupbyaggord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !(_la==GROUPBYMIN || _la==GROUPBYMAX) ) {
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

	public static class RatiovTratiov2ratiovContext extends ParserRuleContext {
		public TerminalNode RATIO() { return getToken(TransformationAlgebraHParser.RATIO, 0); }
		public RatiovTratiov2ratiovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratiovTratiov2ratiov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterRatiovTratiov2ratiov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitRatiovTratiov2ratiov(this);
		}
	}

	public final RatiovTratiov2ratiovContext ratiovTratiov2ratiov() throws RecognitionException {
		RatiovTratiov2ratiovContext _localctx = new RatiovTratiov2ratiovContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ratiovTratiov2ratiov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(RATIO);
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

	public static class VTv2boolvContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(TransformationAlgebraHParser.EQUAL, 0); }
		public VTv2boolvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vTv2boolv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterVTv2boolv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitVTv2boolv(this);
		}
	}

	public final VTv2boolvContext vTv2boolv() throws RecognitionException {
		VTv2boolvContext _localctx = new VTv2boolvContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_vTv2boolv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(EQUAL);
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

	public static class OrdvTordv2boolvContext extends ParserRuleContext {
		public TerminalNode LEQ() { return getToken(TransformationAlgebraHParser.LEQ, 0); }
		public OrdvTordv2boolvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordvTordv2boolv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterOrdvTordv2boolv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitOrdvTordv2boolv(this);
		}
	}

	public final OrdvTordv2boolvContext ordvTordv2boolv() throws RecognitionException {
		OrdvTordv2boolvContext _localctx = new OrdvTordv2boolvContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ordvTordv2boolv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(LEQ);
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

	public static class VTv2vContext extends ParserRuleContext {
		public RatiovTratiov2ratiovContext ratiovTratiov2ratiov() {
			return getRuleContext(RatiovTratiov2ratiovContext.class,0);
		}
		public OrdvTordv2boolvContext ordvTordv2boolv() {
			return getRuleContext(OrdvTordv2boolvContext.class,0);
		}
		public VTv2boolvContext vTv2boolv() {
			return getRuleContext(VTv2boolvContext.class,0);
		}
		public VTv2vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vTv2v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).enterVTv2v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraHListener ) ((TransformationAlgebraHListener)listener).exitVTv2v(this);
		}
	}

	public final VTv2vContext vTv2v() throws RecognitionException {
		VTv2vContext _localctx = new VTv2vContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_vTv2v);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RATIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				ratiovTratiov2ratiov();
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				ordvTordv2boolv();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				vTv2boolv();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u02aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\5\2\u0083\n\2\3\3\3\3\3\3\3\3\5\3\u0089\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\5\5\5\u0096\n\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b2\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00bc\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00ca\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00d1\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00e3\n\16\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00eb\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00fd\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0109\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0132\n\26\3\27\3\27\3\27\5\27\u0137\n\27\3\30\3\30\3"+
		"\30\5\30\u013c\n\30\3\31\3\31\3\31\5\31\u0141\n\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0157\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0169\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u0173\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0180\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u018a\n\37\3 \3 \3!\3!\3!\3!\3!\3!\5!\u0194\n!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01a5\n%\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b4\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u01c7\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01dd\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u01ee\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5"+
		"+\u01fe\n+\3,\3,\3,\3,\3,\3,\5,\u0206\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u0213\n-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\5/\u022b\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0233\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u023b\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0248\n\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0254\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u025c\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0268\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0274"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u027c\n\67\38\38\38\38\38\38"+
		"\58\u0284\n8\39\39\39\39\39\39\39\59\u028d\n9\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\5:\u029b\n:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\5?\u02a8\n?"+
		"\3?\2\2@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\3\3\2\35\36\2\u02ed\2\u0082\3\2"+
		"\2\2\4\u0088\3\2\2\2\6\u008f\3\2\2\2\b\u0095\3\2\2\2\n\u0097\3\2\2\2\f"+
		"\u0099\3\2\2\2\16\u00a0\3\2\2\2\20\u00b1\3\2\2\2\22\u00bb\3\2\2\2\24\u00c9"+
		"\3\2\2\2\26\u00d0\3\2\2\2\30\u00d9\3\2\2\2\32\u00e2\3\2\2\2\34\u00e4\3"+
		"\2\2\2\36\u00ea\3\2\2\2 \u00fc\3\2\2\2\"\u0108\3\2\2\2$\u011e\3\2\2\2"+
		"&\u0120\3\2\2\2(\u0128\3\2\2\2*\u0131\3\2\2\2,\u0136\3\2\2\2.\u013b\3"+
		"\2\2\2\60\u0140\3\2\2\2\62\u0142\3\2\2\2\64\u0156\3\2\2\2\66\u0168\3\2"+
		"\2\28\u0172\3\2\2\2:\u017f\3\2\2\2<\u0189\3\2\2\2>\u018b\3\2\2\2@\u0193"+
		"\3\2\2\2B\u0195\3\2\2\2D\u0197\3\2\2\2F\u0199\3\2\2\2H\u01a4\3\2\2\2J"+
		"\u01a6\3\2\2\2L\u01b3\3\2\2\2N\u01c6\3\2\2\2P\u01dc\3\2\2\2R\u01ed\3\2"+
		"\2\2T\u01fd\3\2\2\2V\u0205\3\2\2\2X\u0212\3\2\2\2Z\u0214\3\2\2\2\\\u022a"+
		"\3\2\2\2^\u0232\3\2\2\2`\u023a\3\2\2\2b\u0247\3\2\2\2d\u0253\3\2\2\2f"+
		"\u025b\3\2\2\2h\u0267\3\2\2\2j\u0273\3\2\2\2l\u027b\3\2\2\2n\u0283\3\2"+
		"\2\2p\u028c\3\2\2\2r\u029a\3\2\2\2t\u029c\3\2\2\2v\u029e\3\2\2\2x\u02a0"+
		"\3\2\2\2z\u02a2\3\2\2\2|\u02a7\3\2\2\2~\u0083\5\4\3\2\177\u0083\5\6\4"+
		"\2\u0080\u0083\5\b\5\2\u0081\u0083\5\n\6\2\u0082~\3\2\2\2\u0082\177\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\3\3\2\2\2\u0084\u0089"+
		"\5 \21\2\u0085\u0089\5\"\22\2\u0086\u0089\5\60\31\2\u0087\u0089\5$\23"+
		"\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\5\3\2\2\2\u008a\u0090\5:\36\2\u008b\u0090\5J&\2\u008c\u0090"+
		"\5B\"\2\u008d\u0090\5X-\2\u008e\u0090\5L\'\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\7\3\2\2\2\u0091\u0096\5\36\20\2\u0092\u0096\5\34\17\2\u0093"+
		"\u0096\5\32\16\2\u0094\u0096\5\30\r\2\u0095\u0091\3\2\2\2\u0095\u0092"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\t\3\2\2\2\u0097"+
		"\u0098\5\f\7\2\u0098\13\3\2\2\2\u0099\u009a\5|?\2\u009a\r\3\2\2\2\u009b"+
		"\u009c\7\t\2\2\u009c\u00a1\5$\23\2\u009d\u009e\7\16\2\2\u009e\u00a1\5"+
		"&\24\2\u009f\u00a1\7\64\2\2\u00a0\u009b\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00b2\5\64"+
		"\33\2\u00a4\u00a5\7\n\2\2\u00a5\u00b2\5 \21\2\u00a6\u00a7\7\3\2\2\u00a7"+
		"\u00a8\5\20\t\2\u00a8\u00a9\7;\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00b2\3"+
		"\2\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00b2\5P)\2\u00ad\u00ae\7\16\2\2\u00ae"+
		"\u00b2\5(\25\2\u00af\u00b2\5\16\b\2\u00b0\u00b2\7\65\2\2\u00b1\u00a2\3"+
		"\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\21\3\2\2"+
		"\2\u00b3\u00b4\7\6\2\2\u00b4\u00bc\5\64\33\2\u00b5\u00b6\7\6\2\2\u00b6"+
		"\u00bc\5R*\2\u00b7\u00bc\5\20\t\2\u00b8\u00b9\7\16\2\2\u00b9\u00bc\5*"+
		"\26\2\u00ba\u00bc\7\66\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\23\3\2\2"+
		"\2\u00bd\u00be\7\b\2\2\u00be\u00ca\5\66\34\2\u00bf\u00c0\7\7\2\2\u00c0"+
		"\u00ca\5\66\34\2\u00c1\u00c2\7\b\2\2\u00c2\u00ca\5T+\2\u00c3\u00c4\7\7"+
		"\2\2\u00c4\u00ca\5T+\2\u00c5\u00c6\7\16\2\2\u00c6\u00ca\5,\27\2\u00c7"+
		"\u00ca\5\22\n\2\u00c8\u00ca\7\67\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00bf\3"+
		"\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\25\3\2\2\2\u00cb\u00d1\5\24\13"+
		"\2\u00cc\u00cd\7\16\2\2\u00cd\u00d1\5.\30\2\u00ce\u00d1\7\62\2\2\u00cf"+
		"\u00d1\79\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00da"+
		"\5\60\31\2\u00d4\u00da\5\26\f\2\u00d5\u00da\5\24\13\2\u00d6\u00da\5\22"+
		"\n\2\u00d7\u00da\5\20\t\2\u00d8\u00da\5\16\b\2\u00d9\u00d2\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\31\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00e3"+
		"\5 \21\2\u00dd\u00de\7\16\2\2\u00de\u00e3\5\"\22\2\u00df\u00e0\7\13\2"+
		"\2\u00e0\u00e3\5\"\22\2\u00e1\u00e3\7\63\2\2\u00e2\u00db\3\2\2\2\u00e2"+
		"\u00dd\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\33\3\2\2"+
		"\2\u00e4\u00e5\7\16\2\2\u00e5\u00e6\5 \21\2\u00e6\35\3\2\2\2\u00e7\u00e8"+
		"\7\16\2\2\u00e8\u00eb\5$\23\2\u00e9\u00eb\7.\2\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\r\2\2\u00ed\u00fd\5\32\16"+
		"\2\u00ee\u00ef\7\23\2\2\u00ef\u00fd\5\64\33\2\u00f0\u00f1\7\23\2\2\u00f1"+
		"\u00fd\5\66\34\2\u00f2\u00f3\7\23\2\2\u00f3\u00fd\58\35\2\u00f4\u00f5"+
		"\7\23\2\2\u00f5\u00fd\5:\36\2\u00f6\u00f7\7\23\2\2\u00f7\u00fd\5\62\32"+
		"\2\u00f8\u00f9\7\23\2\2\u00f9\u00fd\5f\64\2\u00fa\u00fb\7\23\2\2\u00fb"+
		"\u00fd\5h\65\2\u00fc\u00ec\3\2\2\2\u00fc\u00ee\3\2\2\2\u00fc\u00f0\3\2"+
		"\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc"+
		"\u00f8\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd!\3\2\2\2\u00fe\u00ff\7\23\2\2"+
		"\u00ff\u0109\5D#\2\u0100\u0101\7\23\2\2\u0101\u0109\5F$\2\u0102\u0103"+
		"\7\23\2\2\u0103\u0109\5H%\2\u0104\u0105\7\23\2\2\u0105\u0109\5:\36\2\u0106"+
		"\u0107\7\24\2\2\u0107\u0109\5L\'\2\u0108\u00fe\3\2\2\2\u0108\u0100\3\2"+
		"\2\2\u0108\u0102\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"#\3\2\2\2\u010a\u010b\7\23\2\2\u010b\u011f\5L\'\2\u010c\u010d\7\23\2\2"+
		"\u010d\u011f\5P)\2\u010e\u010f\7\23\2\2\u010f\u011f\5R*\2\u0110\u0111"+
		"\7\23\2\2\u0111\u011f\5T+\2\u0112\u0113\7\23\2\2\u0113\u011f\5V,\2\u0114"+
		"\u0115\7\23\2\2\u0115\u011f\5X-\2\u0116\u0117\7\23\2\2\u0117\u011f\5b"+
		"\62\2\u0118\u0119\7\24\2\2\u0119\u011f\5b\62\2\u011a\u011b\7\25\2\2\u011b"+
		"\u011f\5h\65\2\u011c\u011d\7\25\2\2\u011d\u011f\5b\62\2\u011e\u010a\3"+
		"\2\2\2\u011e\u010c\3\2\2\2\u011e\u010e\3\2\2\2\u011e\u0110\3\2\2\2\u011e"+
		"\u0112\3\2\2\2\u011e\u0114\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0118\3\2"+
		"\2\2\u011e\u011a\3\2\2\2\u011e\u011c\3\2\2\2\u011f%\3\2\2\2\u0120\u0121"+
		"\7\24\2\2\u0121\u0122\5N(\2\u0122\'\3\2\2\2\u0123\u0124\7\24\2\2\u0124"+
		"\u0129\5P)\2\u0125\u0126\7\24\2\2\u0126\u0129\5\62\32\2\u0127\u0129\5"+
		"&\24\2\u0128\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		")\3\2\2\2\u012a\u012b\7\23\2\2\u012b\u0132\5> \2\u012c\u012d\7\24\2\2"+
		"\u012d\u0132\5R*\2\u012e\u012f\7\24\2\2\u012f\u0132\5\64\33\2\u0130\u0132"+
		"\5(\25\2\u0131\u012a\3\2\2\2\u0131\u012c\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u0130\3\2\2\2\u0132+\3\2\2\2\u0133\u0134\7\23\2\2\u0134\u0137\5<\37\2"+
		"\u0135\u0137\5*\26\2\u0136\u0133\3\2\2\2\u0136\u0135\3\2\2\2\u0137-\3"+
		"\2\2\2\u0138\u0139\7\23\2\2\u0139\u013c\5@!\2\u013a\u013c\5,\27\2\u013b"+
		"\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013c/\3\2\2\2\u013d\u013e\7\23\2\2"+
		"\u013e\u0141\5B\"\2\u013f\u0141\5.\30\2\u0140\u013d\3\2\2\2\u0140\u013f"+
		"\3\2\2\2\u0141\61\3\2\2\2\u0142\u0143\7\61\2\2\u0143\63\3\2\2\2\u0144"+
		"\u0145\7!\2\2\u0145\u0146\5D#\2\u0146\u0147\7;\2\2\u0147\u0148\5 \21\2"+
		"\u0148\u0157\3\2\2\2\u0149\u014a\7\27\2\2\u014a\u014b\5\64\33\2\u014b"+
		"\u014c\7;\2\2\u014c\u014d\5\22\n\2\u014d\u0157\3\2\2\2\u014e\u014f\7\30"+
		"\2\2\u014f\u0150\5\64\33\2\u0150\u0151\7;\2\2\u0151\u0152\5 \21\2\u0152"+
		"\u0157\3\2\2\2\u0153\u0154\7\33\2\2\u0154\u0157\5l\67\2\u0155\u0157\5"+
		"\62\32\2\u0156\u0144\3\2\2\2\u0156\u0149\3\2\2\2\u0156\u014e\3\2\2\2\u0156"+
		"\u0153\3\2\2\2\u0156\u0155\3\2\2\2\u0157\65\3\2\2\2\u0158\u0159\7\20\2"+
		"\2\u0159\u0169\5<\37\2\u015a\u015b\7\27\2\2\u015b\u015c\5\66\34\2\u015c"+
		"\u015d\7;\2\2\u015d\u015e\5\24\13\2\u015e\u0169\3\2\2\2\u015f\u0160\7"+
		"\30\2\2\u0160\u0161\5\66\34\2\u0161\u0162\7;\2\2\u0162\u0163\5 \21\2\u0163"+
		"\u0169\3\2\2\2\u0164\u0165\5t;\2\u0165\u0166\5n8\2\u0166\u0169\3\2\2\2"+
		"\u0167\u0169\5\64\33\2\u0168\u0158\3\2\2\2\u0168\u015a\3\2\2\2\u0168\u015f"+
		"\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0167\3\2\2\2\u0169\67\3\2\2\2\u016a"+
		"\u016b\7\20\2\2\u016b\u0173\5H%\2\u016c\u016d\7\26\2\2\u016d\u016e\58"+
		"\35\2\u016e\u016f\7;\2\2\u016f\u0170\5\26\f\2\u0170\u0173\3\2\2\2\u0171"+
		"\u0173\5\66\34\2\u0172\u016a\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u0171\3"+
		"\2\2\2\u01739\3\2\2\2\u0174\u0175\7\26\2\2\u0175\u0176\5:\36\2\u0176\u0177"+
		"\7;\2\2\u0177\u0178\5\30\r\2\u0178\u0180\3\2\2\2\u0179\u017a\7\30\2\2"+
		"\u017a\u017b\5:\36\2\u017b\u017c\7;\2\2\u017c\u017d\5 \21\2\u017d\u0180"+
		"\3\2\2\2\u017e\u0180\58\35\2\u017f\u0174\3\2\2\2\u017f\u0179\3\2\2\2\u017f"+
		"\u017e\3\2\2\2\u0180;\3\2\2\2\u0181\u0182\7\17\2\2\u0182\u018a\5\66\34"+
		"\2\u0183\u0184\7\27\2\2\u0184\u0185\5<\37\2\u0185\u0186\7;\2\2\u0186\u0187"+
		"\5\24\13\2\u0187\u018a\3\2\2\2\u0188\u018a\7+\2\2\u0189\u0181\3\2\2\2"+
		"\u0189\u0183\3\2\2\2\u0189\u0188\3\2\2\2\u018a=\3\2\2\2\u018b\u018c\7"+
		"/\2\2\u018c?\3\2\2\2\u018d\u018e\7\26\2\2\u018e\u018f\5@!\2\u018f\u0190"+
		"\7;\2\2\u0190\u0191\5\26\f\2\u0191\u0194\3\2\2\2\u0192\u0194\5<\37\2\u0193"+
		"\u018d\3\2\2\2\u0193\u0192\3\2\2\2\u0194A\3\2\2\2\u0195\u0196\5@!\2\u0196"+
		"C\3\2\2\2\u0197\u0198\7)\2\2\u0198E\3\2\2\2\u0199\u019a\5D#\2\u019aG\3"+
		"\2\2\2\u019b\u01a5\7*\2\2\u019c\u019d\7\17\2\2\u019d\u01a5\58\35\2\u019e"+
		"\u019f\7\26\2\2\u019f\u01a0\5H%\2\u01a0\u01a1\7;\2\2\u01a1\u01a2\5\26"+
		"\f\2\u01a2\u01a5\3\2\2\2\u01a3\u01a5\5F$\2\u01a4\u019b\3\2\2\2\u01a4\u019c"+
		"\3\2\2\2\u01a4\u019e\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5I\3\2\2\2\u01a6"+
		"\u01a7\5H%\2\u01a7K\3\2\2\2\u01a8\u01a9\7\26\2\2\u01a9\u01aa\5L\'\2\u01aa"+
		"\u01ab\7;\2\2\u01ab\u01ac\5\36\20\2\u01ac\u01b4\3\2\2\2\u01ad\u01ae\7"+
		"\30\2\2\u01ae\u01af\5L\'\2\u01af\u01b0\7;\2\2\u01b0\u01b1\5$\23\2\u01b1"+
		"\u01b4\3\2\2\2\u01b2\u01b4\7-\2\2\u01b3\u01a8\3\2\2\2\u01b3\u01ad\3\2"+
		"\2\2\u01b3\u01b2\3\2\2\2\u01b4M\3\2\2\2\u01b5\u01b6\7\26\2\2\u01b6\u01b7"+
		"\5N(\2\u01b7\u01b8\7;\2\2\u01b8\u01b9\5\36\20\2\u01b9\u01c7\3\2\2\2\u01ba"+
		"\u01bb\7\30\2\2\u01bb\u01bc\5N(\2\u01bc\u01bd\7;\2\2\u01bd\u01be\5$\23"+
		"\2\u01be\u01c7\3\2\2\2\u01bf\u01c0\7 \2\2\u01c0\u01c7\5b\62\2\u01c1\u01c2"+
		"\7\33\2\2\u01c2\u01c7\5Z.\2\u01c3\u01c4\7\34\2\2\u01c4\u01c7\5Z.\2\u01c5"+
		"\u01c7\7\60\2\2\u01c6\u01b5\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01bf\3"+
		"\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"O\3\2\2\2\u01c8\u01c9\7\30\2\2\u01c9\u01ca\5P)\2\u01ca\u01cb\7;\2\2\u01cb"+
		"\u01cc\5$\23\2\u01cc\u01dd\3\2\2\2\u01cd\u01ce\7\32\2\2\u01ce\u01cf\5"+
		"P)\2\u01cf\u01d0\7;\2\2\u01d0\u01d1\5P)\2\u01d1\u01dd\3\2\2\2\u01d2\u01d3"+
		"\7\33\2\2\u01d3\u01dd\5\\/\2\u01d4\u01d5\7\34\2\2\u01d5\u01dd\5\\/\2\u01d6"+
		"\u01d7\7\33\2\2\u01d7\u01dd\5d\63\2\u01d8\u01d9\7\37\2\2\u01d9\u01dd\5"+
		"h\65\2\u01da\u01dd\7,\2\2\u01db\u01dd\5N(\2\u01dc\u01c8\3\2\2\2\u01dc"+
		"\u01cd\3\2\2\2\u01dc\u01d2\3\2\2\2\u01dc\u01d4\3\2\2\2\u01dc\u01d6\3\2"+
		"\2\2\u01dc\u01d8\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"Q\3\2\2\2\u01de\u01df\7\27\2\2\u01df\u01e0\5R*\2\u01e0\u01e1\7;\2\2\u01e1"+
		"\u01e2\5\22\n\2\u01e2\u01ee\3\2\2\2\u01e3\u01e4\7\30\2\2\u01e4\u01e5\5"+
		"R*\2\u01e5\u01e6\7;\2\2\u01e6\u01e7\5$\23\2\u01e7\u01ee\3\2\2\2\u01e8"+
		"\u01e9\7\33\2\2\u01e9\u01ee\5^\60\2\u01ea\u01eb\7\33\2\2\u01eb\u01ee\5"+
		"f\64\2\u01ec\u01ee\5P)\2\u01ed\u01de\3\2\2\2\u01ed\u01e3\3\2\2\2\u01ed"+
		"\u01e8\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ec\3\2\2\2\u01eeS\3\2\2\2"+
		"\u01ef\u01f0\7\27\2\2\u01f0\u01f1\5T+\2\u01f1\u01f2\7;\2\2\u01f2\u01f3"+
		"\5\24\13\2\u01f3\u01fe\3\2\2\2\u01f4\u01f5\7\30\2\2\u01f5\u01f6\5T+\2"+
		"\u01f6\u01f7\7;\2\2\u01f7\u01f8\5$\23\2\u01f8\u01fe\3\2\2\2\u01f9\u01fa"+
		"\5t;\2\u01fa\u01fb\5`\61\2\u01fb\u01fe\3\2\2\2\u01fc\u01fe\5R*\2\u01fd"+
		"\u01ef\3\2\2\2\u01fd\u01f4\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fc\3\2"+
		"\2\2\u01feU\3\2\2\2\u01ff\u0200\7\26\2\2\u0200\u0201\5V,\2\u0201\u0202"+
		"\7;\2\2\u0202\u0203\5\26\f\2\u0203\u0206\3\2\2\2\u0204\u0206\5T+\2\u0205"+
		"\u01ff\3\2\2\2\u0205\u0204\3\2\2\2\u0206W\3\2\2\2\u0207\u0208\7\26\2\2"+
		"\u0208\u0209\5X-\2\u0209\u020a\7;\2\2\u020a\u020b\5\30\r\2\u020b\u0213"+
		"\3\2\2\2\u020c\u020d\7\30\2\2\u020d\u020e\5X-\2\u020e\u020f\7;\2\2\u020f"+
		"\u0210\5$\23\2\u0210\u0213\3\2\2\2\u0211\u0213\5V,\2\u0212\u0207\3\2\2"+
		"\2\u0212\u020c\3\2\2\2\u0212\u0211\3\2\2\2\u0213Y\3\2\2\2\u0214\u0215"+
		"\7\31\2\2\u0215\u0216\5b\62\2\u0216\u0217\7;\2\2\u0217\u0218\5N(\2\u0218"+
		"[\3\2\2\2\u0219\u021a\7\"\2\2\u021a\u021b\5L\'\2\u021b\u021c\7;\2\2\u021c"+
		"\u021d\5L\'\2\u021d\u022b\3\2\2\2\u021e\u021f\7\'\2\2\u021f\u0220\5$\23"+
		"\2\u0220\u0221\7;\2\2\u0221\u0222\5$\23\2\u0222\u0223\7;\2\2\u0223\u0224"+
		"\5\\/\2\u0224\u022b\3\2\2\2\u0225\u0226\7\31\2\2\u0226\u0227\5b\62\2\u0227"+
		"\u0228\7;\2\2\u0228\u0229\5P)\2\u0229\u022b\3\2\2\2\u022a\u0219\3\2\2"+
		"\2\u022a\u021e\3\2\2\2\u022a\u0225\3\2\2\2\u022b]\3\2\2\2\u022c\u022d"+
		"\7\31\2\2\u022d\u022e\5b\62\2\u022e\u022f\7;\2\2\u022f\u0230\5R*\2\u0230"+
		"\u0233\3\2\2\2\u0231\u0233\5\\/\2\u0232\u022c\3\2\2\2\u0232\u0231\3\2"+
		"\2\2\u0233_\3\2\2\2\u0234\u0235\7\27\2\2\u0235\u0236\5`\61\2\u0236\u0237"+
		"\7;\2\2\u0237\u0238\5\24\13\2\u0238\u023b\3\2\2\2\u0239\u023b\5^\60\2"+
		"\u023a\u0234\3\2\2\2\u023a\u0239\3\2\2\2\u023ba\3\2\2\2\u023c\u023d\7"+
		"%\2\2\u023d\u023e\5L\'\2\u023e\u023f\7;\2\2\u023f\u0240\5L\'\2\u0240\u0248"+
		"\3\2\2\2\u0241\u0242\7\26\2\2\u0242\u0243\5b\62\2\u0243\u0244\7;\2\2\u0244"+
		"\u0245\5\26\f\2\u0245\u0248\3\2\2\2\u0246\u0248\5`\61\2\u0247\u023c\3"+
		"\2\2\2\u0247\u0241\3\2\2\2\u0247\u0246\3\2\2\2\u0248c\3\2\2\2\u0249\u024a"+
		"\7$\2\2\u024a\u024b\5 \21\2\u024b\u024c\7;\2\2\u024c\u024d\5$\23\2\u024d"+
		"\u0254\3\2\2\2\u024e\u024f\7\31\2\2\u024f\u0250\5h\65\2\u0250\u0251\7"+
		";\2\2\u0251\u0252\5\62\32\2\u0252\u0254\3\2\2\2\u0253\u0249\3\2\2\2\u0253"+
		"\u024e\3\2\2\2\u0254e\3\2\2\2\u0255\u0256\7\31\2\2\u0256\u0257\5h\65\2"+
		"\u0257\u0258\7;\2\2\u0258\u0259\5\64\33\2\u0259\u025c\3\2\2\2\u025a\u025c"+
		"\5d\63\2\u025b\u0255\3\2\2\2\u025b\u025a\3\2\2\2\u025cg\3\2\2\2\u025d"+
		"\u025e\7&\2\2\u025e\u025f\5 \21\2\u025f\u0260\7;\2\2\u0260\u0261\5L\'"+
		"\2\u0261\u0268\3\2\2\2\u0262\u0263\7\26\2\2\u0263\u0264\5h\65\2\u0264"+
		"\u0265\7;\2\2\u0265\u0266\5\26\f\2\u0266\u0268\3\2\2\2\u0267\u025d\3\2"+
		"\2\2\u0267\u0262\3\2\2\2\u0268i\3\2\2\2\u0269\u026a\7#\2\2\u026a\u026b"+
		"\5 \21\2\u026b\u026c\7;\2\2\u026c\u026d\5 \21\2\u026d\u0274\3\2\2\2\u026e"+
		"\u026f\7\31\2\2\u026f\u0270\5p9\2\u0270\u0271\7;\2\2\u0271\u0272\5\62"+
		"\32\2\u0272\u0274\3\2\2\2\u0273\u0269\3\2\2\2\u0273\u026e\3\2\2\2\u0274"+
		"k\3\2\2\2\u0275\u0276\7\31\2\2\u0276\u0277\5p9\2\u0277\u0278\7;\2\2\u0278"+
		"\u0279\5\64\33\2\u0279\u027c\3\2\2\2\u027a\u027c\5j\66\2\u027b\u0275\3"+
		"\2\2\2\u027b\u027a\3\2\2\2\u027cm\3\2\2\2\u027d\u027e\7\27\2\2\u027e\u027f"+
		"\5n8\2\u027f\u0280\7;\2\2\u0280\u0281\5\24\13\2\u0281\u0284\3\2\2\2\u0282"+
		"\u0284\5l\67\2\u0283\u027d\3\2\2\2\u0283\u0282\3\2\2\2\u0284o\3\2\2\2"+
		"\u0285\u0286\7\26\2\2\u0286\u0287\5p9\2\u0287\u0288\7;\2\2\u0288\u0289"+
		"\5\26\f\2\u0289\u028d\3\2\2\2\u028a\u028d\5r:\2\u028b\u028d\5n8\2\u028c"+
		"\u0285\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028dq\3\2\2\2"+
		"\u028e\u028f\7(\2\2\u028f\u0290\5 \21\2\u0290\u0291\7;\2\2\u0291\u0292"+
		"\5 \21\2\u0292\u0293\7;\2\2\u0293\u0294\5R*\2\u0294\u029b\3\2\2\2\u0295"+
		"\u0296\7\26\2\2\u0296\u0297\5r:\2\u0297\u0298\7;\2\2\u0298\u0299\78\2"+
		"\2\u0299\u029b\3\2\2\2\u029a\u028e\3\2\2\2\u029a\u0295\3\2\2\2\u029bs"+
		"\3\2\2\2\u029c\u029d\t\2\2\2\u029du\3\2\2\2\u029e\u029f\7\3\2\2\u029f"+
		"w\3\2\2\2\u02a0\u02a1\7\4\2\2\u02a1y\3\2\2\2\u02a2\u02a3\7\5\2\2\u02a3"+
		"{\3\2\2\2\u02a4\u02a8\5v<\2\u02a5\u02a8\5z>\2\u02a6\u02a8\5x=\2\u02a7"+
		"\u02a4\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8}\3\2\2\2"+
		"\61\u0082\u0088\u008f\u0095\u00a0\u00b1\u00bb\u00c9\u00d0\u00d9\u00e2"+
		"\u00ea\u00fc\u0108\u011e\u0128\u0131\u0136\u013b\u0140\u0156\u0168\u0172"+
		"\u017f\u0189\u0193\u01a4\u01b3\u01c6\u01dc\u01ed\u01fd\u0205\u0212\u022a"+
		"\u0232\u023a\u0247\u0253\u025b\u0267\u0273\u027b\u0283\u028c\u029a\u02a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}