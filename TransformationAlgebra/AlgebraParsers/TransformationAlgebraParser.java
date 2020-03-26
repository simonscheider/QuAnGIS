// Generated from TransformationAlgebra.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransformationAlgebraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AVG=1, MIN=2, MAX=3, SUM=4, COUNT=5, REIFY=6, DEIFY=7, GET=8, INVERT=9, 
		REVERT=10, MERGE=11, FCONT=12, OCONT=13, SIZE=14, RATIO=15, INTERPOL=16, 
		PI1=17, PI2=18, SIGMAE=19, SIGMASE=20, BOWTIE=21, BOWTIESTAR=22, BOWTIERATIO=23, 
		GROUPBYAVG=24, GROUPBYSUM=25, GROUPBYMIN=26, GROUPBYMAX=27, GROUPBYSIZE=28, 
		GROUPBYCOUNT=29, ODIST=30, LDIST=31, LODIST=32, OTOPO=33, LOTOPO=34, NDIST=35, 
		LVIS=36, DATAPM=37, DATAAMOUNT=38, DATACONTOUR=39, DATAOBJQ=40, DATAOBJS=41, 
		DATAOBJV=42, DATACONTOURLINE=43, DATAOBJCOUNT=44, DATAFIELD=45, TOPOV=46, 
		COUNTV=47, RATIOV=48, INTV=49, ORDV=50, BOOLV=51, NOMV=52, DATAV=53, WHITESPACE=54, 
		KEYWORD=55, WS=56;
	public static final int
		RULE_start = 0, RULE_r = 1, RULE_rr = 2, RULE_v = 3, RULE_countv = 4, 
		RULE_ratiov = 5, RULE_intv = 6, RULE_ordv = 7, RULE_nomv = 8, RULE_qv = 9, 
		RULE_sv = 10, RULE_lv = 11, RULE_ov = 12, RULE_l = 13, RULE_s = 14, RULE_o = 15, 
		RULE_count = 16, RULE_ratio = 17, RULE_intt = 18, RULE_ordinal = 19, RULE_nom = 20, 
		RULE_q = 21, RULE_ords = 22, RULE_ints = 23, RULE_noms = 24, RULE_qs = 25, 
		RULE_sint = 26, RULE_snom = 27, RULE_sord = 28, RULE_sq = 29, RULE_os = 30, 
		RULE_ocount = 31, RULE_oratio = 32, RULE_oint = 33, RULE_oord = 34, RULE_onom = 35, 
		RULE_oq = 36, RULE_lratio = 37, RULE_lint = 38, RULE_lord = 39, RULE_lnom = 40, 
		RULE_lq = 41, RULE_ocounto = 42, RULE_oratioo = 43, RULE_ointo = 44, RULE_oordo = 45, 
		RULE_onomo = 46, RULE_lratioo = 47, RULE_linto = 48, RULE_lnomo = 49, 
		RULE_lratiol = 50, RULE_lintl = 51, RULE_lordl = 52, RULE_lnoml = 53, 
		RULE_lbooll = 54, RULE_groupbyaggord = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "r", "rr", "v", "countv", "ratiov", "intv", "ordv", "nomv", 
			"qv", "sv", "lv", "ov", "l", "s", "o", "count", "ratio", "intt", "ordinal", 
			"nom", "q", "ords", "ints", "noms", "qs", "sint", "snom", "sord", "sq", 
			"os", "ocount", "oratio", "oint", "oord", "onom", "oq", "lratio", "lint", 
			"lord", "lnom", "lq", "ocounto", "oratioo", "ointo", "oordo", "onomo", 
			"lratioo", "linto", "lnomo", "lratiol", "lintl", "lordl", "lnoml", "lbooll", 
			"groupbyaggord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'avg '", "'min '", "'max '", "'sum '", "'count '", "'reify '", 
			"'deify '", "'get '", "'invert '", "'revert '", "'merge '", "'fcont '", 
			"'ocont '", "'size '", "'ratio '", "'interpol '", "'pi1 '", "'pi2 '", 
			"'sigmae '", "'sigmale '", "'bowtie '", "'bowtie* '", "'bowtie_ratio '", 
			"'groupby_avg '", "'groupby_sum '", "'groupby_min '", "'groupby_max '", 
			"'groupby_size '", "'groupby_count '", "'odist '", "'ldist '", "'lodist '", 
			"'otopo '", "'lotopo '", "'ndist '", "'lvis '", null, null, null, null, 
			null, null, null, null, null, "'in'", null, null, null, null, null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "INVERT", 
			"REVERT", "MERGE", "FCONT", "OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", 
			"PI2", "SIGMAE", "SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", "GROUPBYAVG", 
			"GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", "GROUPBYCOUNT", 
			"ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", "DATAPM", 
			"DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATAOBJV", "DATACONTOURLINE", 
			"DATAOBJCOUNT", "DATAFIELD", "TOPOV", "COUNTV", "RATIOV", "INTV", "ORDV", 
			"BOOLV", "NOMV", "DATAV", "WHITESPACE", "KEYWORD", "WS"
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
	public String getGrammarFileName() { return "TransformationAlgebra.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TransformationAlgebraParser(TokenStream input) {
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
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEIFY:
			case PI1:
			case PI2:
				{
				setState(112);
				r();
				}
				break;
			case INVERT:
			case REVERT:
			case INTERPOL:
			case SIGMAE:
			case SIGMASE:
			case BOWTIE:
			case BOWTIERATIO:
			case GROUPBYAVG:
			case GROUPBYSUM:
			case GROUPBYMIN:
			case GROUPBYMAX:
			case GROUPBYSIZE:
			case GROUPBYCOUNT:
			case DATAPM:
			case DATAAMOUNT:
			case DATACONTOUR:
			case DATAOBJQ:
			case DATAOBJS:
			case DATAOBJCOUNT:
			case DATAFIELD:
				{
				setState(113);
				rr();
				}
				break;
			case AVG:
			case MIN:
			case MAX:
			case COUNT:
			case REIFY:
			case GET:
			case MERGE:
			case FCONT:
			case OCONT:
			case SIZE:
			case RATIO:
			case DATAOBJV:
			case TOPOV:
			case COUNTV:
			case RATIOV:
			case INTV:
			case ORDV:
			case NOMV:
				{
				setState(114);
				v();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(117);
				l();
				}
				break;
			case 2:
				{
				setState(118);
				s();
				}
				break;
			case 3:
				{
				setState(119);
				q();
				}
				break;
			case 4:
				{
				setState(120);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterRr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitRr(this);
		}
	}

	public final RrContext rr() throws RecognitionException {
		RrContext _localctx = new RrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(123);
				lq();
				}
				break;
			case 2:
				{
				setState(124);
				sq();
				}
				break;
			case 3:
				{
				setState(125);
				qs();
				}
				break;
			case 4:
				{
				setState(126);
				oq();
				}
				break;
			case 5:
				{
				setState(127);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitV(this);
		}
	}

	public final VContext v() throws RecognitionException {
		VContext _localctx = new VContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_v);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(130);
				ov();
				}
				break;
			case 2:
				{
				setState(131);
				lv();
				}
				break;
			case 3:
				{
				setState(132);
				sv();
				}
				break;
			case 4:
				{
				setState(133);
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

	public static class CountvContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(TransformationAlgebraParser.COUNT, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode COUNTV() { return getToken(TransformationAlgebraParser.COUNTV, 0); }
		public CountvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterCountv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitCountv(this);
		}
	}

	public final CountvContext countv() throws RecognitionException {
		CountvContext _localctx = new CountvContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_countv);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(COUNT);
				setState(137);
				o();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(GET);
				setState(139);
				count();
				}
				break;
			case COUNTV:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
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
		public TerminalNode FCONT() { return getToken(TransformationAlgebraParser.FCONT, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(TransformationAlgebraParser.SIZE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode RATIO() { return getToken(TransformationAlgebraParser.RATIO, 0); }
		public List<RatiovContext> ratiov() {
			return getRuleContexts(RatiovContext.class);
		}
		public RatiovContext ratiov(int i) {
			return getRuleContext(RatiovContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public TerminalNode OCONT() { return getToken(TransformationAlgebraParser.OCONT, 0); }
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public CountvContext countv() {
			return getRuleContext(CountvContext.class,0);
		}
		public TerminalNode RATIOV() { return getToken(TransformationAlgebraParser.RATIOV, 0); }
		public RatiovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratiov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterRatiov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitRatiov(this);
		}
	}

	public final RatiovContext ratiov() throws RecognitionException {
		RatiovContext _localctx = new RatiovContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ratiov);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(FCONT);
				setState(144);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(SIZE);
				setState(146);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(RATIO);
				setState(148);
				ratiov();
				setState(149);
				match(WHITESPACE);
				setState(150);
				ratiov();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(OCONT);
				setState(153);
				oratio();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				match(GET);
				setState(155);
				ratio();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				countv();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
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
		public TerminalNode AVG() { return getToken(TransformationAlgebraParser.AVG, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public RatiovContext ratiov() {
			return getRuleContext(RatiovContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public InttContext intt() {
			return getRuleContext(InttContext.class,0);
		}
		public TerminalNode INTV() { return getToken(TransformationAlgebraParser.INTV, 0); }
		public IntvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterIntv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitIntv(this);
		}
	}

	public final IntvContext intv() throws RecognitionException {
		IntvContext _localctx = new IntvContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intv);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(AVG);
				setState(161);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(AVG);
				setState(163);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				ratiov();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(GET);
				setState(166);
				intt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
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
		public TerminalNode MAX() { return getToken(TransformationAlgebraParser.MAX, 0); }
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public TerminalNode MIN() { return getToken(TransformationAlgebraParser.MIN, 0); }
		public OordContext oord() {
			return getRuleContext(OordContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public OrdinalContext ordinal() {
			return getRuleContext(OrdinalContext.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode ORDV() { return getToken(TransformationAlgebraParser.ORDV, 0); }
		public OrdvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOrdv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOrdv(this);
		}
	}

	public final OrdvContext ordv() throws RecognitionException {
		OrdvContext _localctx = new OrdvContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ordv);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(MAX);
				setState(171);
				lord();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(MIN);
				setState(173);
				lord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(MAX);
				setState(175);
				oord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(MIN);
				setState(177);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(GET);
				setState(179);
				ordinal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				intv();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
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
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public NomContext nom() {
			return getRuleContext(NomContext.class,0);
		}
		public TerminalNode TOPOV() { return getToken(TransformationAlgebraParser.TOPOV, 0); }
		public TerminalNode NOMV() { return getToken(TransformationAlgebraParser.NOMV, 0); }
		public NomvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterNomv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitNomv(this);
		}
	}

	public final NomvContext nomv() throws RecognitionException {
		NomvContext _localctx = new NomvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nomv);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(GET);
				setState(186);
				nom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(TOPOV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
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
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterQv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitQv(this);
		}
	}

	public final QvContext qv() throws RecognitionException {
		QvContext _localctx = new QvContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_qv);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(GET);
				setState(192);
				q();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				nomv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				ordv();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				intv();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				ratiov();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
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
		public TerminalNode REIFY() { return getToken(TransformationAlgebraParser.REIFY, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode MERGE() { return getToken(TransformationAlgebraParser.MERGE, 0); }
		public SvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSv(this);
		}
	}

	public final SvContext sv() throws RecognitionException {
		SvContext _localctx = new SvContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sv);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(REIFY);
				setState(201);
				l();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(GET);
				setState(203);
				s();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(MERGE);
				setState(205);
				s();
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
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public LvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLv(this);
		}
	}

	public final LvContext lv() throws RecognitionException {
		LvContext _localctx = new LvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(GET);
			setState(209);
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
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode DATAOBJV() { return getToken(TransformationAlgebraParser.DATAOBJV, 0); }
		public OvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOv(this);
		}
	}

	public final OvContext ov() throws RecognitionException {
		OvContext _localctx = new OvContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ov);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(GET);
				setState(212);
				o();
				}
				break;
			case DATAOBJV:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
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
		public TerminalNode DEIFY() { return getToken(TransformationAlgebraParser.DEIFY, 0); }
		public SvContext sv() {
			return getRuleContext(SvContext.class,0);
		}
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitL(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_l);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(DEIFY);
				setState(217);
				sv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(PI1);
				setState(219);
				lint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(PI1);
				setState(221);
				lord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(PI1);
				setState(223);
				lnom();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(PI1);
				setState(225);
				lq();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(PI1);
				setState(227);
				lratio();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(PI1);
				setState(229);
				linto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(230);
				match(PI1);
				setState(231);
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
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
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
		public TerminalNode PI2() { return getToken(TransformationAlgebraParser.PI2, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_s);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(PI1);
				setState(235);
				sint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(PI1);
				setState(237);
				sord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(PI1);
				setState(239);
				snom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(PI1);
				setState(241);
				lq();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(PI2);
				setState(243);
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
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
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
		public TerminalNode PI2() { return getToken(TransformationAlgebraParser.PI2, 0); }
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitO(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_o);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(PI1);
				setState(247);
				os();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(PI1);
				setState(249);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(PI1);
				setState(251);
				oint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(PI1);
				setState(253);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(PI1);
				setState(255);
				onom();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(PI1);
				setState(257);
				oq();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				match(PI1);
				setState(259);
				onomo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				match(PI2);
				setState(261);
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
		public TerminalNode PI2() { return getToken(TransformationAlgebraParser.PI2, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public CountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitCount(this);
		}
	}

	public final CountContext count() throws RecognitionException {
		CountContext _localctx = new CountContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(PI2);
			setState(265);
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
		public TerminalNode PI2() { return getToken(TransformationAlgebraParser.PI2, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterRatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitRatio(this);
		}
	}

	public final RatioContext ratio() throws RecognitionException {
		RatioContext _localctx = new RatioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ratio);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(PI2);
				setState(268);
				oratio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(PI2);
				setState(270);
				lratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
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
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
		public IntsContext ints() {
			return getRuleContext(IntsContext.class,0);
		}
		public TerminalNode PI2() { return getToken(TransformationAlgebraParser.PI2, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterIntt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitIntt(this);
		}
	}

	public final InttContext intt() throws RecognitionException {
		InttContext _localctx = new InttContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intt);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(PI1);
				setState(275);
				ints();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(PI2);
				setState(277);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(PI2);
				setState(279);
				lint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
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
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOrdinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOrdinal(this);
		}
	}

	public final OrdinalContext ordinal() throws RecognitionException {
		OrdinalContext _localctx = new OrdinalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ordinal);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(PI1);
				setState(284);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterNom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitNom(this);
		}
	}

	public final NomContext nom() throws RecognitionException {
		NomContext _localctx = new NomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nom);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(PI1);
				setState(289);
				noms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
		public TerminalNode PI1() { return getToken(TransformationAlgebraParser.PI1, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitQ(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_q);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(PI1);
				setState(294);
				qs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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

	public static class OrdsContext extends ParserRuleContext {
		public TerminalNode INVERT() { return getToken(TransformationAlgebraParser.INVERT, 0); }
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public OrdsContext ords() {
			return getRuleContext(OrdsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode DATACONTOUR() { return getToken(TransformationAlgebraParser.DATACONTOUR, 0); }
		public OrdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOrds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOrds(this);
		}
	}

	public final OrdsContext ords() throws RecognitionException {
		OrdsContext _localctx = new OrdsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ords);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(INVERT);
				setState(299);
				lord();
				}
				break;
			case SIGMASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(SIGMASE);
				setState(301);
				ords();
				setState(302);
				match(WHITESPACE);
				setState(303);
				ordv();
				}
				break;
			case DATACONTOUR:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
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
		public TerminalNode DATACONTOURLINE() { return getToken(TransformationAlgebraParser.DATACONTOURLINE, 0); }
		public IntsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitInts(this);
		}
	}

	public final IntsContext ints() throws RecognitionException {
		IntsContext _localctx = new IntsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public NomsContext noms() {
			return getRuleContext(NomsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterNoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitNoms(this);
		}
	}

	public final NomsContext noms() throws RecognitionException {
		NomsContext _localctx = new NomsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_noms);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(SIGMAE);
				setState(311);
				noms();
				setState(312);
				match(WHITESPACE);
				setState(313);
				nomv();
				}
				break;
			case INVERT:
			case SIGMASE:
			case DATACONTOUR:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterQs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitQs(this);
		}
	}

	public final QsContext qs() throws RecognitionException {
		QsContext _localctx = new QsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		public TerminalNode DATAPM() { return getToken(TransformationAlgebraParser.DATAPM, 0); }
		public SintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSint(this);
		}
	}

	public final SintContext sint() throws RecognitionException {
		SintContext _localctx = new SintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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

	public static class SnomContext extends ParserRuleContext {
		public TerminalNode DATAAMOUNT() { return getToken(TransformationAlgebraParser.DATAAMOUNT, 0); }
		public TerminalNode INVERT() { return getToken(TransformationAlgebraParser.INVERT, 0); }
		public LnomContext lnom() {
			return getRuleContext(LnomContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public SnomContext snom() {
			return getRuleContext(SnomContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
		}
		public SintContext sint() {
			return getRuleContext(SintContext.class,0);
		}
		public SnomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSnom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSnom(this);
		}
	}

	public final SnomContext snom() throws RecognitionException {
		SnomContext _localctx = new SnomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_snom);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATAAMOUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(DATAAMOUNT);
				}
				break;
			case INVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(INVERT);
				setState(324);
				lnom();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(SIGMAE);
				setState(326);
				snom();
				setState(327);
				match(WHITESPACE);
				setState(328);
				nomv();
				}
				break;
			case DATAPM:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				sint();
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSord(this);
		}
	}

	public final SordContext sord() throws RecognitionException {
		SordContext _localctx = new SordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSq(this);
		}
	}

	public final SqContext sq() throws RecognitionException {
		SqContext _localctx = new SqContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode DATAOBJS() { return getToken(TransformationAlgebraParser.DATAOBJS, 0); }
		public OsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_os; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOs(this);
		}
	}

	public final OsContext os() throws RecognitionException {
		OsContext _localctx = new OsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_os);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(SIGMAE);
				setState(338);
				os();
				setState(339);
				match(WHITESPACE);
				setState(340);
				ov();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(BOWTIE);
				setState(343);
				os();
				setState(344);
				match(WHITESPACE);
				setState(345);
				o();
				}
				break;
			case DATAOBJS:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GROUPBYCOUNT() { return getToken(TransformationAlgebraParser.GROUPBYCOUNT, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraParser.GROUPBYAVG, 0); }
		public OcountoContext ocounto() {
			return getRuleContext(OcountoContext.class,0);
		}
		public TerminalNode GROUPBYSUM() { return getToken(TransformationAlgebraParser.GROUPBYSUM, 0); }
		public TerminalNode DATAOBJCOUNT() { return getToken(TransformationAlgebraParser.DATAOBJCOUNT, 0); }
		public OcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOcount(this);
		}
	}

	public final OcountContext ocount() throws RecognitionException {
		OcountContext _localctx = new OcountContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ocount);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(SIGMAE);
				setState(351);
				ocount();
				setState(352);
				match(WHITESPACE);
				setState(353);
				ov();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(BOWTIE);
				setState(356);
				ocount();
				setState(357);
				match(WHITESPACE);
				setState(358);
				o();
				}
				break;
			case GROUPBYCOUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(GROUPBYCOUNT);
				setState(361);
				onomo();
				}
				break;
			case GROUPBYAVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(GROUPBYAVG);
				setState(363);
				ocounto();
				}
				break;
			case GROUPBYSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				match(GROUPBYSUM);
				setState(365);
				ocounto();
				}
				break;
			case DATAOBJCOUNT:
				enterOuterAlt(_localctx, 6);
				{
				setState(366);
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
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public List<OratioContext> oratio() {
			return getRuleContexts(OratioContext.class);
		}
		public OratioContext oratio(int i) {
			return getRuleContext(OratioContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode BOWTIERATIO() { return getToken(TransformationAlgebraParser.BOWTIERATIO, 0); }
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraParser.GROUPBYAVG, 0); }
		public OratiooContext oratioo() {
			return getRuleContext(OratiooContext.class,0);
		}
		public TerminalNode GROUPBYSUM() { return getToken(TransformationAlgebraParser.GROUPBYSUM, 0); }
		public LratiooContext lratioo() {
			return getRuleContext(LratiooContext.class,0);
		}
		public TerminalNode GROUPBYSIZE() { return getToken(TransformationAlgebraParser.GROUPBYSIZE, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public TerminalNode DATAOBJQ() { return getToken(TransformationAlgebraParser.DATAOBJQ, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public OratioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOratio(this);
		}
	}

	public final OratioContext oratio() throws RecognitionException {
		OratioContext _localctx = new OratioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_oratio);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(BOWTIE);
				setState(370);
				oratio();
				setState(371);
				match(WHITESPACE);
				setState(372);
				o();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(BOWTIERATIO);
				setState(375);
				oratio();
				setState(376);
				match(WHITESPACE);
				setState(377);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(GROUPBYAVG);
				setState(380);
				oratioo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				match(GROUPBYSUM);
				setState(382);
				oratioo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				match(GROUPBYAVG);
				setState(384);
				lratioo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(385);
				match(GROUPBYSIZE);
				setState(386);
				lnomo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(387);
				match(DATAOBJQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(388);
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
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraParser.GROUPBYAVG, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOint(this);
		}
	}

	public final OintContext oint() throws RecognitionException {
		OintContext _localctx = new OintContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oint);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(SIGMASE);
				setState(392);
				oint();
				setState(393);
				match(WHITESPACE);
				setState(394);
				intv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(BOWTIE);
				setState(397);
				oint();
				setState(398);
				match(WHITESPACE);
				setState(399);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(GROUPBYAVG);
				setState(402);
				ointo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(403);
				match(GROUPBYAVG);
				setState(404);
				linto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
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
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public OordContext oord() {
			return getRuleContext(OordContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOord(this);
		}
	}

	public final OordContext oord() throws RecognitionException {
		OordContext _localctx = new OordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oord);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				match(SIGMASE);
				setState(409);
				oord();
				setState(410);
				match(WHITESPACE);
				setState(411);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(BOWTIE);
				setState(414);
				oord();
				setState(415);
				match(WHITESPACE);
				setState(416);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				groupbyaggord();
				setState(419);
				oordo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public OnomContext onom() {
			return getRuleContext(OnomContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOnom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOnom(this);
		}
	}

	public final OnomContext onom() throws RecognitionException {
		OnomContext _localctx = new OnomContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_onom);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(SIGMAE);
				setState(425);
				onom();
				setState(426);
				match(WHITESPACE);
				setState(427);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public OqContext oq() {
			return getRuleContext(OqContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public QvContext qv() {
			return getRuleContext(QvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOq(this);
		}
	}

	public final OqContext oq() throws RecognitionException {
		OqContext _localctx = new OqContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oq);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(SIGMAE);
				setState(433);
				oq();
				setState(434);
				match(WHITESPACE);
				setState(435);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(BOWTIE);
				setState(438);
				oq();
				setState(439);
				match(WHITESPACE);
				setState(440);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
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

	public static class LratioContext extends ParserRuleContext {
		public TerminalNode DATAFIELD() { return getToken(TransformationAlgebraParser.DATAFIELD, 0); }
		public LratioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLratio(this);
		}
	}

	public final LratioContext lratio() throws RecognitionException {
		LratioContext _localctx = new LratioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lratio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
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
		public TerminalNode INTERPOL() { return getToken(TransformationAlgebraParser.INTERPOL, 0); }
		public SintContext sint() {
			return getRuleContext(SintContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public TerminalNode GROUPBYAVG() { return getToken(TransformationAlgebraParser.GROUPBYAVG, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLint(this);
		}
	}

	public final LintContext lint() throws RecognitionException {
		LintContext _localctx = new LintContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_lint);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(INTERPOL);
				setState(448);
				sint();
				setState(449);
				match(WHITESPACE);
				setState(450);
				l();
				}
				break;
			case SIGMASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(SIGMASE);
				setState(453);
				lint();
				setState(454);
				match(WHITESPACE);
				setState(455);
				intv();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(BOWTIE);
				setState(458);
				lint();
				setState(459);
				match(WHITESPACE);
				setState(460);
				l();
				}
				break;
			case GROUPBYAVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				match(GROUPBYAVG);
				setState(463);
				lintl();
				}
				break;
			case DATAFIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
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
		public TerminalNode REVERT() { return getToken(TransformationAlgebraParser.REVERT, 0); }
		public OrdsContext ords() {
			return getRuleContext(OrdsContext.class,0);
		}
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public LordContext lord() {
			return getRuleContext(LordContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OrdvContext ordv() {
			return getRuleContext(OrdvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLord(this);
		}
	}

	public final LordContext lord() throws RecognitionException {
		LordContext _localctx = new LordContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_lord);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(REVERT);
				setState(468);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(SIGMASE);
				setState(470);
				lord();
				setState(471);
				match(WHITESPACE);
				setState(472);
				ordv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(BOWTIE);
				setState(475);
				lord();
				setState(476);
				match(WHITESPACE);
				setState(477);
				l();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				groupbyaggord();
				setState(480);
				lordl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
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
		public TerminalNode REVERT() { return getToken(TransformationAlgebraParser.REVERT, 0); }
		public SnomContext snom() {
			return getRuleContext(SnomContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public LnomContext lnom() {
			return getRuleContext(LnomContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLnom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLnom(this);
		}
	}

	public final LnomContext lnom() throws RecognitionException {
		LnomContext _localctx = new LnomContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lnom);
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(REVERT);
				setState(486);
				snom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(SIGMAE);
				setState(488);
				lnom();
				setState(489);
				match(WHITESPACE);
				setState(490);
				nomv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public LqContext lq() {
			return getRuleContext(LqContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public QvContext qv() {
			return getRuleContext(QvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLq(this);
		}
	}

	public final LqContext lq() throws RecognitionException {
		LqContext _localctx = new LqContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lq);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(SIGMAE);
				setState(496);
				lq();
				setState(497);
				match(WHITESPACE);
				setState(498);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(BOWTIE);
				setState(501);
				lq();
				setState(502);
				match(WHITESPACE);
				setState(503);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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

	public static class OcountoContext extends ParserRuleContext {
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public OcountoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocounto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOcounto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOcounto(this);
		}
	}

	public final OcountoContext ocounto() throws RecognitionException {
		OcountoContext _localctx = new OcountoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ocounto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(BOWTIESTAR);
			setState(509);
			onomo();
			setState(510);
			match(WHITESPACE);
			setState(511);
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
		public TerminalNode ODIST() { return getToken(TransformationAlgebraParser.ODIST, 0); }
		public List<OsContext> os() {
			return getRuleContexts(OsContext.class);
		}
		public OsContext os(int i) {
			return getRuleContext(OsContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraParser.WHITESPACE, i);
		}
		public TerminalNode NDIST() { return getToken(TransformationAlgebraParser.NDIST, 0); }
		public List<OContext> o() {
			return getRuleContexts(OContext.class);
		}
		public OContext o(int i) {
			return getRuleContext(OContext.class,i);
		}
		public OratiooContext oratioo() {
			return getRuleContext(OratiooContext.class,0);
		}
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOratioo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOratioo(this);
		}
	}

	public final OratiooContext oratioo() throws RecognitionException {
		OratiooContext _localctx = new OratiooContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_oratioo);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(ODIST);
				setState(514);
				os();
				setState(515);
				match(WHITESPACE);
				setState(516);
				os();
				}
				break;
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(NDIST);
				setState(519);
				o();
				setState(520);
				match(WHITESPACE);
				setState(521);
				o();
				setState(522);
				match(WHITESPACE);
				setState(523);
				oratioo();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(BOWTIESTAR);
				setState(526);
				onomo();
				setState(527);
				match(WHITESPACE);
				setState(528);
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
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
		public OnomoContext onomo() {
			return getRuleContext(OnomoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOinto(this);
		}
	}

	public final OintoContext ointo() throws RecognitionException {
		OintoContext _localctx = new OintoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ointo);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(BOWTIESTAR);
				setState(533);
				onomo();
				setState(534);
				match(WHITESPACE);
				setState(535);
				oint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
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
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public OordoContext oordo() {
			return getRuleContext(OordoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOordo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOordo(this);
		}
	}

	public final OordoContext oordo() throws RecognitionException {
		OordoContext _localctx = new OordoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oordo);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(SIGMASE);
				setState(541);
				oordo();
				setState(542);
				match(WHITESPACE);
				setState(543);
				ordv();
				}
				break;
			case BOWTIESTAR:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
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
		public TerminalNode OTOPO() { return getToken(TransformationAlgebraParser.OTOPO, 0); }
		public List<OsContext> os() {
			return getRuleContexts(OsContext.class);
		}
		public OsContext os(int i) {
			return getRuleContext(OsContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterOnomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitOnomo(this);
		}
	}

	public final OnomoContext onomo() throws RecognitionException {
		OnomoContext _localctx = new OnomoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_onomo);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(OTOPO);
				setState(549);
				os();
				setState(550);
				match(WHITESPACE);
				setState(551);
				os();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(SIGMAE);
				setState(554);
				onomo();
				setState(555);
				match(WHITESPACE);
				setState(556);
				nomv();
				}
				break;
			case SIGMASE:
			case BOWTIESTAR:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
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
		public TerminalNode LODIST() { return getToken(TransformationAlgebraParser.LODIST, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLratioo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLratioo(this);
		}
	}

	public final LratiooContext lratioo() throws RecognitionException {
		LratiooContext _localctx = new LratiooContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lratioo);
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(LODIST);
				setState(562);
				l();
				setState(563);
				match(WHITESPACE);
				setState(564);
				o();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(BOWTIESTAR);
				setState(567);
				lnomo();
				setState(568);
				match(WHITESPACE);
				setState(569);
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
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLinto(this);
		}
	}

	public final LintoContext linto() throws RecognitionException {
		LintoContext _localctx = new LintoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_linto);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(BOWTIESTAR);
				setState(574);
				lnomo();
				setState(575);
				match(WHITESPACE);
				setState(576);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
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
		public TerminalNode LOTOPO() { return getToken(TransformationAlgebraParser.LOTOPO, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLnomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLnomo(this);
		}
	}

	public final LnomoContext lnomo() throws RecognitionException {
		LnomoContext _localctx = new LnomoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lnomo);
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(LOTOPO);
				setState(582);
				l();
				setState(583);
				match(WHITESPACE);
				setState(584);
				os();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(SIGMAE);
				setState(587);
				lnomo();
				setState(588);
				match(WHITESPACE);
				setState(589);
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
		public TerminalNode LDIST() { return getToken(TransformationAlgebraParser.LDIST, 0); }
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLratiol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLratiol(this);
		}
	}

	public final LratiolContext lratiol() throws RecognitionException {
		LratiolContext _localctx = new LratiolContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lratiol);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LDIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(LDIST);
				setState(594);
				l();
				setState(595);
				match(WHITESPACE);
				setState(596);
				l();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(BOWTIESTAR);
				setState(599);
				lnoml();
				setState(600);
				match(WHITESPACE);
				setState(601);
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
		public TerminalNode BOWTIESTAR() { return getToken(TransformationAlgebraParser.BOWTIESTAR, 0); }
		public LnomlContext lnoml() {
			return getRuleContext(LnomlContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLintl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLintl(this);
		}
	}

	public final LintlContext lintl() throws RecognitionException {
		LintlContext _localctx = new LintlContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lintl);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(BOWTIESTAR);
				setState(606);
				lnoml();
				setState(607);
				match(WHITESPACE);
				setState(608);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
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
		public TerminalNode SIGMASE() { return getToken(TransformationAlgebraParser.SIGMASE, 0); }
		public LordlContext lordl() {
			return getRuleContext(LordlContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLordl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLordl(this);
		}
	}

	public final LordlContext lordl() throws RecognitionException {
		LordlContext _localctx = new LordlContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_lordl);
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(SIGMASE);
				setState(614);
				lordl();
				setState(615);
				match(WHITESPACE);
				setState(616);
				ordv();
				}
				break;
			case BOWTIESTAR:
			case LDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
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
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public LnomlContext lnoml() {
			return getRuleContext(LnomlContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLnoml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLnoml(this);
		}
	}

	public final LnomlContext lnoml() throws RecognitionException {
		LnomlContext _localctx = new LnomlContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_lnoml);
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(SIGMAE);
				setState(622);
				lnoml();
				setState(623);
				match(WHITESPACE);
				setState(624);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				lbooll();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
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
		public TerminalNode LVIS() { return getToken(TransformationAlgebraParser.LVIS, 0); }
		public List<LContext> l() {
			return getRuleContexts(LContext.class);
		}
		public LContext l(int i) {
			return getRuleContext(LContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(TransformationAlgebraParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(TransformationAlgebraParser.WHITESPACE, i);
		}
		public OintContext oint() {
			return getRuleContext(OintContext.class,0);
		}
		public TerminalNode SIGMAE() { return getToken(TransformationAlgebraParser.SIGMAE, 0); }
		public LboollContext lbooll() {
			return getRuleContext(LboollContext.class,0);
		}
		public TerminalNode BOOLV() { return getToken(TransformationAlgebraParser.BOOLV, 0); }
		public LboollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbooll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterLbooll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitLbooll(this);
		}
	}

	public final LboollContext lbooll() throws RecognitionException {
		LboollContext _localctx = new LboollContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_lbooll);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LVIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(LVIS);
				setState(631);
				l();
				setState(632);
				match(WHITESPACE);
				setState(633);
				l();
				setState(634);
				match(WHITESPACE);
				setState(635);
				oint();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(SIGMAE);
				setState(638);
				lbooll();
				setState(639);
				match(WHITESPACE);
				setState(640);
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
		public TerminalNode GROUPBYMIN() { return getToken(TransformationAlgebraParser.GROUPBYMIN, 0); }
		public TerminalNode GROUPBYMAX() { return getToken(TransformationAlgebraParser.GROUPBYMAX, 0); }
		public GroupbyaggordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupbyaggord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterGroupbyaggord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitGroupbyaggord(this);
		}
	}

	public final GroupbyaggordContext groupbyaggord() throws RecognitionException {
		GroupbyaggordContext _localctx = new GroupbyaggordContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_groupbyaggord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0289\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\5\2v\n\2\3\3"+
		"\3\3\3\3\3\3\5\3|\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3\5\3\5\3"+
		"\5\5\5\u0089\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00b9\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d1"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d9\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00eb"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f7\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0109\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0113\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\25\3"+
		"\25\3\25\5\25\u0121\n\25\3\26\3\26\3\26\5\26\u0126\n\26\3\27\3\27\3\27"+
		"\5\27\u012b\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0135\n"+
		"\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013f\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u014e\n\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u015f\n \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0172\n!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0188\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0199\n#"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01a9\n$\3%\3%\3%\3%\3%"+
		"\3%\5%\u01b1\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01be\n&\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01d4\n(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01e6\n)\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u01f0\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01fd\n+\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0215"+
		"\n-\3.\3.\3.\3.\3.\3.\5.\u021d\n.\3/\3/\3/\3/\3/\3/\5/\u0225\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0232\n\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u023e\n\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u0246\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0252\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u025e\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0266\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u026e\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u0277\n\67\38\38\38\38\38\38\38\38\38\38\38\38\5"+
		"8\u0285\n8\39\39\39\2\2:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\3\3\2\34\35\2\u02cc\2"+
		"u\3\2\2\2\4{\3\2\2\2\6\u0082\3\2\2\2\b\u0088\3\2\2\2\n\u008f\3\2\2\2\f"+
		"\u00a0\3\2\2\2\16\u00aa\3\2\2\2\20\u00b8\3\2\2\2\22\u00bf\3\2\2\2\24\u00c8"+
		"\3\2\2\2\26\u00d0\3\2\2\2\30\u00d2\3\2\2\2\32\u00d8\3\2\2\2\34\u00ea\3"+
		"\2\2\2\36\u00f6\3\2\2\2 \u0108\3\2\2\2\"\u010a\3\2\2\2$\u0112\3\2\2\2"+
		"&\u011b\3\2\2\2(\u0120\3\2\2\2*\u0125\3\2\2\2,\u012a\3\2\2\2.\u0134\3"+
		"\2\2\2\60\u0136\3\2\2\2\62\u013e\3\2\2\2\64\u0140\3\2\2\2\66\u0142\3\2"+
		"\2\28\u014d\3\2\2\2:\u014f\3\2\2\2<\u0151\3\2\2\2>\u015e\3\2\2\2@\u0171"+
		"\3\2\2\2B\u0187\3\2\2\2D\u0198\3\2\2\2F\u01a8\3\2\2\2H\u01b0\3\2\2\2J"+
		"\u01bd\3\2\2\2L\u01bf\3\2\2\2N\u01d3\3\2\2\2P\u01e5\3\2\2\2R\u01ef\3\2"+
		"\2\2T\u01fc\3\2\2\2V\u01fe\3\2\2\2X\u0214\3\2\2\2Z\u021c\3\2\2\2\\\u0224"+
		"\3\2\2\2^\u0231\3\2\2\2`\u023d\3\2\2\2b\u0245\3\2\2\2d\u0251\3\2\2\2f"+
		"\u025d\3\2\2\2h\u0265\3\2\2\2j\u026d\3\2\2\2l\u0276\3\2\2\2n\u0284\3\2"+
		"\2\2p\u0286\3\2\2\2rv\5\4\3\2sv\5\6\4\2tv\5\b\5\2ur\3\2\2\2us\3\2\2\2"+
		"ut\3\2\2\2v\3\3\2\2\2w|\5\34\17\2x|\5\36\20\2y|\5,\27\2z|\5 \21\2{w\3"+
		"\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\5\3\2\2\2}\u0083\5T+\2~\u0083\5"+
		"<\37\2\177\u0083\5\64\33\2\u0080\u0083\5J&\2\u0081\u0083\5> \2\u0082}"+
		"\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\7\3\2\2\2\u0084\u0089\5\32\16\2\u0085\u0089\5\30\r\2\u0086"+
		"\u0089\5\26\f\2\u0087\u0089\5\24\13\2\u0088\u0084\3\2\2\2\u0088\u0085"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\t\3\2\2\2\u008a"+
		"\u008b\7\7\2\2\u008b\u0090\5 \21\2\u008c\u008d\7\n\2\2\u008d\u0090\5\""+
		"\22\2\u008e\u0090\7\61\2\2\u008f\u008a\3\2\2\2\u008f\u008c\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\13\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u00a1\5N(\2"+
		"\u0093\u0094\7\20\2\2\u0094\u00a1\5\34\17\2\u0095\u0096\7\21\2\2\u0096"+
		"\u0097\5\f\7\2\u0097\u0098\78\2\2\u0098\u0099\5\f\7\2\u0099\u00a1\3\2"+
		"\2\2\u009a\u009b\7\17\2\2\u009b\u00a1\5B\"\2\u009c\u009d\7\n\2\2\u009d"+
		"\u00a1\5$\23\2\u009e\u00a1\5\n\6\2\u009f\u00a1\7\62\2\2\u00a0\u0091\3"+
		"\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\r\3\2\2\2"+
		"\u00a2\u00a3\7\3\2\2\u00a3\u00ab\5N(\2\u00a4\u00a5\7\3\2\2\u00a5\u00ab"+
		"\5D#\2\u00a6\u00ab\5\f\7\2\u00a7\u00a8\7\n\2\2\u00a8\u00ab\5&\24\2\u00a9"+
		"\u00ab\7\63\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3"+
		"\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\17\3\2\2\2\u00ac"+
		"\u00ad\7\5\2\2\u00ad\u00b9\5P)\2\u00ae\u00af\7\4\2\2\u00af\u00b9\5P)\2"+
		"\u00b0\u00b1\7\5\2\2\u00b1\u00b9\5F$\2\u00b2\u00b3\7\4\2\2\u00b3\u00b9"+
		"\5F$\2\u00b4\u00b5\7\n\2\2\u00b5\u00b9\5(\25\2\u00b6\u00b9\5\16\b\2\u00b7"+
		"\u00b9\7\64\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b0\3"+
		"\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00c0\5\20\t\2\u00bb\u00bc\7\n\2"+
		"\2\u00bc\u00c0\5*\26\2\u00bd\u00c0\7\60\2\2\u00be\u00c0\7\66\2\2\u00bf"+
		"\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\7\n\2\2\u00c2\u00c9\5,\27\2\u00c3\u00c9"+
		"\5\22\n\2\u00c4\u00c9\5\20\t\2\u00c5\u00c9\5\16\b\2\u00c6\u00c9\5\f\7"+
		"\2\u00c7\u00c9\5\n\6\2\u00c8\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4"+
		"\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\25\3\2\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00d1\5\34\17\2\u00cc\u00cd\7\n"+
		"\2\2\u00cd\u00d1\5\36\20\2\u00ce\u00cf\7\r\2\2\u00cf\u00d1\5\36\20\2\u00d0"+
		"\u00ca\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\27\3\2\2"+
		"\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\5\34\17\2\u00d4\31\3\2\2\2\u00d5\u00d6"+
		"\7\n\2\2\u00d6\u00d9\5 \21\2\u00d7\u00d9\7,\2\2\u00d8\u00d5\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\33\3\2\2\2\u00da\u00db\7\t\2\2\u00db\u00eb\5\26\f"+
		"\2\u00dc\u00dd\7\23\2\2\u00dd\u00eb\5N(\2\u00de\u00df\7\23\2\2\u00df\u00eb"+
		"\5P)\2\u00e0\u00e1\7\23\2\2\u00e1\u00eb\5R*\2\u00e2\u00e3\7\23\2\2\u00e3"+
		"\u00eb\5T+\2\u00e4\u00e5\7\23\2\2\u00e5\u00eb\5L\'\2\u00e6\u00e7\7\23"+
		"\2\2\u00e7\u00eb\5b\62\2\u00e8\u00e9\7\23\2\2\u00e9\u00eb\5d\63\2\u00ea"+
		"\u00da\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00de\3\2\2\2\u00ea\u00e0\3\2"+
		"\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00f7\5\66"+
		"\34\2\u00ee\u00ef\7\23\2\2\u00ef\u00f7\5:\36\2\u00f0\u00f1\7\23\2\2\u00f1"+
		"\u00f7\58\35\2\u00f2\u00f3\7\23\2\2\u00f3\u00f7\5T+\2\u00f4\u00f5\7\24"+
		"\2\2\u00f5\u00f7\5> \2\u00f6\u00ec\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f0"+
		"\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\37\3\2\2\2\u00f8"+
		"\u00f9\7\23\2\2\u00f9\u0109\5> \2\u00fa\u00fb\7\23\2\2\u00fb\u0109\5B"+
		"\"\2\u00fc\u00fd\7\23\2\2\u00fd\u0109\5D#\2\u00fe\u00ff\7\23\2\2\u00ff"+
		"\u0109\5F$\2\u0100\u0101\7\23\2\2\u0101\u0109\5H%\2\u0102\u0103\7\23\2"+
		"\2\u0103\u0109\5J&\2\u0104\u0105\7\23\2\2\u0105\u0109\5^\60\2\u0106\u0107"+
		"\7\24\2\2\u0107\u0109\5^\60\2\u0108\u00f8\3\2\2\2\u0108\u00fa\3\2\2\2"+
		"\u0108\u00fc\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0102"+
		"\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109!\3\2\2\2\u010a"+
		"\u010b\7\24\2\2\u010b\u010c\5@!\2\u010c#\3\2\2\2\u010d\u010e\7\24\2\2"+
		"\u010e\u0113\5B\"\2\u010f\u0110\7\24\2\2\u0110\u0113\5L\'\2\u0111\u0113"+
		"\5\"\22\2\u0112\u010d\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0111\3\2\2\2"+
		"\u0113%\3\2\2\2\u0114\u0115\7\23\2\2\u0115\u011c\5\60\31\2\u0116\u0117"+
		"\7\24\2\2\u0117\u011c\5D#\2\u0118\u0119\7\24\2\2\u0119\u011c\5N(\2\u011a"+
		"\u011c\5$\23\2\u011b\u0114\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0118\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c\'\3\2\2\2\u011d\u011e\7\23\2\2\u011e\u0121"+
		"\5.\30\2\u011f\u0121\5&\24\2\u0120\u011d\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		")\3\2\2\2\u0122\u0123\7\23\2\2\u0123\u0126\5\62\32\2\u0124\u0126\5(\25"+
		"\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0126+\3\2\2\2\u0127\u0128"+
		"\7\23\2\2\u0128\u012b\5\64\33\2\u0129\u012b\5*\26\2\u012a\u0127\3\2\2"+
		"\2\u012a\u0129\3\2\2\2\u012b-\3\2\2\2\u012c\u012d\7\13\2\2\u012d\u0135"+
		"\5P)\2\u012e\u012f\7\26\2\2\u012f\u0130\5.\30\2\u0130\u0131\78\2\2\u0131"+
		"\u0132\5\20\t\2\u0132\u0135\3\2\2\2\u0133\u0135\7)\2\2\u0134\u012c\3\2"+
		"\2\2\u0134\u012e\3\2\2\2\u0134\u0133\3\2\2\2\u0135/\3\2\2\2\u0136\u0137"+
		"\7-\2\2\u0137\61\3\2\2\2\u0138\u0139\7\25\2\2\u0139\u013a\5\62\32\2\u013a"+
		"\u013b\78\2\2\u013b\u013c\5\22\n\2\u013c\u013f\3\2\2\2\u013d\u013f\5."+
		"\30\2\u013e\u0138\3\2\2\2\u013e\u013d\3\2\2\2\u013f\63\3\2\2\2\u0140\u0141"+
		"\5\62\32\2\u0141\65\3\2\2\2\u0142\u0143\7\'\2\2\u0143\67\3\2\2\2\u0144"+
		"\u014e\7(\2\2\u0145\u0146\7\13\2\2\u0146\u014e\5R*\2\u0147\u0148\7\25"+
		"\2\2\u0148\u0149\58\35\2\u0149\u014a\78\2\2\u014a\u014b\5\22\n\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014e\5\66\34\2\u014d\u0144\3\2\2\2\u014d\u0145\3"+
		"\2\2\2\u014d\u0147\3\2\2\2\u014d\u014c\3\2\2\2\u014e9\3\2\2\2\u014f\u0150"+
		"\5\66\34\2\u0150;\3\2\2\2\u0151\u0152\58\35\2\u0152=\3\2\2\2\u0153\u0154"+
		"\7\25\2\2\u0154\u0155\5> \2\u0155\u0156\78\2\2\u0156\u0157\5\32\16\2\u0157"+
		"\u015f\3\2\2\2\u0158\u0159\7\27\2\2\u0159\u015a\5> \2\u015a\u015b\78\2"+
		"\2\u015b\u015c\5 \21\2\u015c\u015f\3\2\2\2\u015d\u015f\7+\2\2\u015e\u0153"+
		"\3\2\2\2\u015e\u0158\3\2\2\2\u015e\u015d\3\2\2\2\u015f?\3\2\2\2\u0160"+
		"\u0161\7\25\2\2\u0161\u0162\5@!\2\u0162\u0163\78\2\2\u0163\u0164\5\32"+
		"\16\2\u0164\u0172\3\2\2\2\u0165\u0166\7\27\2\2\u0166\u0167\5@!\2\u0167"+
		"\u0168\78\2\2\u0168\u0169\5 \21\2\u0169\u0172\3\2\2\2\u016a\u016b\7\37"+
		"\2\2\u016b\u0172\5^\60\2\u016c\u016d\7\32\2\2\u016d\u0172\5V,\2\u016e"+
		"\u016f\7\33\2\2\u016f\u0172\5V,\2\u0170\u0172\7.\2\2\u0171\u0160\3\2\2"+
		"\2\u0171\u0165\3\2\2\2\u0171\u016a\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u016e"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172A\3\2\2\2\u0173\u0174\7\27\2\2\u0174"+
		"\u0175\5B\"\2\u0175\u0176\78\2\2\u0176\u0177\5 \21\2\u0177\u0188\3\2\2"+
		"\2\u0178\u0179\7\31\2\2\u0179\u017a\5B\"\2\u017a\u017b\78\2\2\u017b\u017c"+
		"\5B\"\2\u017c\u0188\3\2\2\2\u017d\u017e\7\32\2\2\u017e\u0188\5X-\2\u017f"+
		"\u0180\7\33\2\2\u0180\u0188\5X-\2\u0181\u0182\7\32\2\2\u0182\u0188\5`"+
		"\61\2\u0183\u0184\7\36\2\2\u0184\u0188\5d\63\2\u0185\u0188\7*\2\2\u0186"+
		"\u0188\5@!\2\u0187\u0173\3\2\2\2\u0187\u0178\3\2\2\2\u0187\u017d\3\2\2"+
		"\2\u0187\u017f\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0183\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0186\3\2\2\2\u0188C\3\2\2\2\u0189\u018a\7\26\2\2\u018a"+
		"\u018b\5D#\2\u018b\u018c\78\2\2\u018c\u018d\5\16\b\2\u018d\u0199\3\2\2"+
		"\2\u018e\u018f\7\27\2\2\u018f\u0190\5D#\2\u0190\u0191\78\2\2\u0191\u0192"+
		"\5 \21\2\u0192\u0199\3\2\2\2\u0193\u0194\7\32\2\2\u0194\u0199\5Z.\2\u0195"+
		"\u0196\7\32\2\2\u0196\u0199\5b\62\2\u0197\u0199\5B\"\2\u0198\u0189\3\2"+
		"\2\2\u0198\u018e\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0195\3\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199E\3\2\2\2\u019a\u019b\7\26\2\2\u019b\u019c\5F$\2\u019c"+
		"\u019d\78\2\2\u019d\u019e\5\20\t\2\u019e\u01a9\3\2\2\2\u019f\u01a0\7\27"+
		"\2\2\u01a0\u01a1\5F$\2\u01a1\u01a2\78\2\2\u01a2\u01a3\5 \21\2\u01a3\u01a9"+
		"\3\2\2\2\u01a4\u01a5\5p9\2\u01a5\u01a6\5\\/\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a9\5D#\2\u01a8\u019a\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8\u01a4\3\2\2"+
		"\2\u01a8\u01a7\3\2\2\2\u01a9G\3\2\2\2\u01aa\u01ab\7\25\2\2\u01ab\u01ac"+
		"\5H%\2\u01ac\u01ad\78\2\2\u01ad\u01ae\5\22\n\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01b1\5F$\2\u01b0\u01aa\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1I\3\2\2\2\u01b2"+
		"\u01b3\7\25\2\2\u01b3\u01b4\5J&\2\u01b4\u01b5\78\2\2\u01b5\u01b6\5\24"+
		"\13\2\u01b6\u01be\3\2\2\2\u01b7\u01b8\7\27\2\2\u01b8\u01b9\5J&\2\u01b9"+
		"\u01ba\78\2\2\u01ba\u01bb\5 \21\2\u01bb\u01be\3\2\2\2\u01bc\u01be\5H%"+
		"\2\u01bd\u01b2\3\2\2\2\u01bd\u01b7\3\2\2\2\u01bd\u01bc\3\2\2\2\u01beK"+
		"\3\2\2\2\u01bf\u01c0\7/\2\2\u01c0M\3\2\2\2\u01c1\u01c2\7\22\2\2\u01c2"+
		"\u01c3\5\66\34\2\u01c3\u01c4\78\2\2\u01c4\u01c5\5\34\17\2\u01c5\u01d4"+
		"\3\2\2\2\u01c6\u01c7\7\26\2\2\u01c7\u01c8\5N(\2\u01c8\u01c9\78\2\2\u01c9"+
		"\u01ca\5\16\b\2\u01ca\u01d4\3\2\2\2\u01cb\u01cc\7\27\2\2\u01cc\u01cd\5"+
		"N(\2\u01cd\u01ce\78\2\2\u01ce\u01cf\5\34\17\2\u01cf\u01d4\3\2\2\2\u01d0"+
		"\u01d1\7\32\2\2\u01d1\u01d4\5h\65\2\u01d2\u01d4\5L\'\2\u01d3\u01c1\3\2"+
		"\2\2\u01d3\u01c6\3\2\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4O\3\2\2\2\u01d5\u01d6\7\f\2\2\u01d6\u01e6\5.\30\2"+
		"\u01d7\u01d8\7\26\2\2\u01d8\u01d9\5P)\2\u01d9\u01da\78\2\2\u01da\u01db"+
		"\5\20\t\2\u01db\u01e6\3\2\2\2\u01dc\u01dd\7\27\2\2\u01dd\u01de\5P)\2\u01de"+
		"\u01df\78\2\2\u01df\u01e0\5\34\17\2\u01e0\u01e6\3\2\2\2\u01e1\u01e2\5"+
		"p9\2\u01e2\u01e3\5j\66\2\u01e3\u01e6\3\2\2\2\u01e4\u01e6\5N(\2\u01e5\u01d5"+
		"\3\2\2\2\u01e5\u01d7\3\2\2\2\u01e5\u01dc\3\2\2\2\u01e5\u01e1\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6Q\3\2\2\2\u01e7\u01e8\7\f\2\2\u01e8\u01f0\58\35\2"+
		"\u01e9\u01ea\7\25\2\2\u01ea\u01eb\5R*\2\u01eb\u01ec\78\2\2\u01ec\u01ed"+
		"\5\22\n\2\u01ed\u01f0\3\2\2\2\u01ee\u01f0\5P)\2\u01ef\u01e7\3\2\2\2\u01ef"+
		"\u01e9\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0S\3\2\2\2\u01f1\u01f2\7\25\2\2"+
		"\u01f2\u01f3\5T+\2\u01f3\u01f4\78\2\2\u01f4\u01f5\5\24\13\2\u01f5\u01fd"+
		"\3\2\2\2\u01f6\u01f7\7\27\2\2\u01f7\u01f8\5T+\2\u01f8\u01f9\78\2\2\u01f9"+
		"\u01fa\5\34\17\2\u01fa\u01fd\3\2\2\2\u01fb\u01fd\5R*\2\u01fc\u01f1\3\2"+
		"\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdU\3\2\2\2\u01fe\u01ff"+
		"\7\30\2\2\u01ff\u0200\5^\60\2\u0200\u0201\78\2\2\u0201\u0202\5@!\2\u0202"+
		"W\3\2\2\2\u0203\u0204\7 \2\2\u0204\u0205\5> \2\u0205\u0206\78\2\2\u0206"+
		"\u0207\5> \2\u0207\u0215\3\2\2\2\u0208\u0209\7%\2\2\u0209\u020a\5 \21"+
		"\2\u020a\u020b\78\2\2\u020b\u020c\5 \21\2\u020c\u020d\78\2\2\u020d\u020e"+
		"\5X-\2\u020e\u0215\3\2\2\2\u020f\u0210\7\30\2\2\u0210\u0211\5^\60\2\u0211"+
		"\u0212\78\2\2\u0212\u0213\5B\"\2\u0213\u0215\3\2\2\2\u0214\u0203\3\2\2"+
		"\2\u0214\u0208\3\2\2\2\u0214\u020f\3\2\2\2\u0215Y\3\2\2\2\u0216\u0217"+
		"\7\30\2\2\u0217\u0218\5^\60\2\u0218\u0219\78\2\2\u0219\u021a\5D#\2\u021a"+
		"\u021d\3\2\2\2\u021b\u021d\5X-\2\u021c\u0216\3\2\2\2\u021c\u021b\3\2\2"+
		"\2\u021d[\3\2\2\2\u021e\u021f\7\26\2\2\u021f\u0220\5\\/\2\u0220\u0221"+
		"\78\2\2\u0221\u0222\5\20\t\2\u0222\u0225\3\2\2\2\u0223\u0225\5Z.\2\u0224"+
		"\u021e\3\2\2\2\u0224\u0223\3\2\2\2\u0225]\3\2\2\2\u0226\u0227\7#\2\2\u0227"+
		"\u0228\5> \2\u0228\u0229\78\2\2\u0229\u022a\5> \2\u022a\u0232\3\2\2\2"+
		"\u022b\u022c\7\25\2\2\u022c\u022d\5^\60\2\u022d\u022e\78\2\2\u022e\u022f"+
		"\5\22\n\2\u022f\u0232\3\2\2\2\u0230\u0232\5\\/\2\u0231\u0226\3\2\2\2\u0231"+
		"\u022b\3\2\2\2\u0231\u0230\3\2\2\2\u0232_\3\2\2\2\u0233\u0234\7\"\2\2"+
		"\u0234\u0235\5\34\17\2\u0235\u0236\78\2\2\u0236\u0237\5 \21\2\u0237\u023e"+
		"\3\2\2\2\u0238\u0239\7\30\2\2\u0239\u023a\5d\63\2\u023a\u023b\78\2\2\u023b"+
		"\u023c\5L\'\2\u023c\u023e\3\2\2\2\u023d\u0233\3\2\2\2\u023d\u0238\3\2"+
		"\2\2\u023ea\3\2\2\2\u023f\u0240\7\30\2\2\u0240\u0241\5d\63\2\u0241\u0242"+
		"\78\2\2\u0242\u0243\5N(\2\u0243\u0246\3\2\2\2\u0244\u0246\5`\61\2\u0245"+
		"\u023f\3\2\2\2\u0245\u0244\3\2\2\2\u0246c\3\2\2\2\u0247\u0248\7$\2\2\u0248"+
		"\u0249\5\34\17\2\u0249\u024a\78\2\2\u024a\u024b\5> \2\u024b\u0252\3\2"+
		"\2\2\u024c\u024d\7\25\2\2\u024d\u024e\5d\63\2\u024e\u024f\78\2\2\u024f"+
		"\u0250\5\22\n\2\u0250\u0252\3\2\2\2\u0251\u0247\3\2\2\2\u0251\u024c\3"+
		"\2\2\2\u0252e\3\2\2\2\u0253\u0254\7!\2\2\u0254\u0255\5\34\17\2\u0255\u0256"+
		"\78\2\2\u0256\u0257\5\34\17\2\u0257\u025e\3\2\2\2\u0258\u0259\7\30\2\2"+
		"\u0259\u025a\5l\67\2\u025a\u025b\78\2\2\u025b\u025c\5L\'\2\u025c\u025e"+
		"\3\2\2\2\u025d\u0253\3\2\2\2\u025d\u0258\3\2\2\2\u025eg\3\2\2\2\u025f"+
		"\u0260\7\30\2\2\u0260\u0261\5l\67\2\u0261\u0262\78\2\2\u0262\u0263\5N"+
		"(\2\u0263\u0266\3\2\2\2\u0264\u0266\5f\64\2\u0265\u025f\3\2\2\2\u0265"+
		"\u0264\3\2\2\2\u0266i\3\2\2\2\u0267\u0268\7\26\2\2\u0268\u0269\5j\66\2"+
		"\u0269\u026a\78\2\2\u026a\u026b\5\20\t\2\u026b\u026e\3\2\2\2\u026c\u026e"+
		"\5h\65\2\u026d\u0267\3\2\2\2\u026d\u026c\3\2\2\2\u026ek\3\2\2\2\u026f"+
		"\u0270\7\25\2\2\u0270\u0271\5l\67\2\u0271\u0272\78\2\2\u0272\u0273\5\22"+
		"\n\2\u0273\u0277\3\2\2\2\u0274\u0277\5n8\2\u0275\u0277\5j\66\2\u0276\u026f"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277m\3\2\2\2\u0278"+
		"\u0279\7&\2\2\u0279\u027a\5\34\17\2\u027a\u027b\78\2\2\u027b\u027c\5\34"+
		"\17\2\u027c\u027d\78\2\2\u027d\u027e\5D#\2\u027e\u0285\3\2\2\2\u027f\u0280"+
		"\7\25\2\2\u0280\u0281\5n8\2\u0281\u0282\78\2\2\u0282\u0283\7\65\2\2\u0283"+
		"\u0285\3\2\2\2\u0284\u0278\3\2\2\2\u0284\u027f\3\2\2\2\u0285o\3\2\2\2"+
		"\u0286\u0287\t\2\2\2\u0287q\3\2\2\2\60u{\u0082\u0088\u008f\u00a0\u00aa"+
		"\u00b8\u00bf\u00c8\u00d0\u00d8\u00ea\u00f6\u0108\u0112\u011b\u0120\u0125"+
		"\u012a\u0134\u013e\u014d\u015e\u0171\u0187\u0198\u01a8\u01b0\u01bd\u01d3"+
		"\u01e5\u01ef\u01fc\u0214\u021c\u0224\u0231\u023d\u0245\u0251\u025d\u0265"+
		"\u026d\u0276\u0284";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}