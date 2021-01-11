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
		RATIO=1, AVG=2, MIN=3, MAX=4, COUNT=5, SIZE=6, MERGE=7, REIFY=8, DEIFY=9, 
		GET=10, INVERT=11, REVERT=12, FCONT=13, OCONT=14, PI1=15, PI2=16, PI3=17, 
		SIGMAE=18, SIGMASE=19, BOWTIE=20, BOWTIESTAR=21, BOWTIERATIO=22, GROUPBYAVG=23, 
		GROUPBYSUM=24, GROUPBYMIN=25, GROUPBYMAX=26, GROUPBYSIZE=27, GROUPBYCOUNT=28, 
		INTERPOL=29, ODIST=30, LDIST=31, LODIST=32, OTOPO=33, LOTOPO=34, NDIST=35, 
		LVIS=36, DATAPM=37, DATAAMOUNT=38, DATACONTOUR=39, DATAOBJQ=40, DATAOBJS=41, 
		DATAOBJV=42, DATACONTOURLINE=43, DATAOBJCOUNT=44, DATAFIELD=45, TOPOV=46, 
		SV=47, COUNTV=48, RATIOV=49, INTV=50, ORDV=51, BOOLV=52, NOMV=53, DATAV=54, 
		WHITESPACE=55, KEYWORD=56, WS=57;
	public static final int
		RULE_start = 0, RULE_r = 1, RULE_rr = 2, RULE_v = 3, RULE_countv = 4, 
		RULE_ratiov = 5, RULE_intv = 6, RULE_ordv = 7, RULE_nomv = 8, RULE_qv = 9, 
		RULE_sv = 10, RULE_lv = 11, RULE_ov = 12, RULE_l = 13, RULE_s = 14, RULE_o = 15, 
		RULE_count = 16, RULE_ratio = 17, RULE_intt = 18, RULE_ordinal = 19, RULE_nom = 20, 
		RULE_q = 21, RULE_lratio = 22, RULE_lint = 23, RULE_lord = 24, RULE_lnom = 25, 
		RULE_lq = 26, RULE_ords = 27, RULE_ints = 28, RULE_noms = 29, RULE_qs = 30, 
		RULE_sint = 31, RULE_sord = 32, RULE_snom = 33, RULE_sq = 34, RULE_os = 35, 
		RULE_ocount = 36, RULE_oratio = 37, RULE_oint = 38, RULE_oord = 39, RULE_onom = 40, 
		RULE_oq = 41, RULE_ocounto = 42, RULE_oratioo = 43, RULE_ointo = 44, RULE_oordo = 45, 
		RULE_onomo = 46, RULE_lratioo = 47, RULE_linto = 48, RULE_lnomo = 49, 
		RULE_lratiol = 50, RULE_lintl = 51, RULE_lordl = 52, RULE_lnoml = 53, 
		RULE_lbooll = 54, RULE_groupbyaggord = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "r", "rr", "v", "countv", "ratiov", "intv", "ordv", "nomv", 
			"qv", "sv", "lv", "ov", "l", "s", "o", "count", "ratio", "intt", "ordinal", 
			"nom", "q", "lratio", "lint", "lord", "lnom", "lq", "ords", "ints", "noms", 
			"qs", "sint", "sord", "snom", "sq", "os", "ocount", "oratio", "oint", 
			"oord", "onom", "oq", "ocounto", "oratioo", "ointo", "oordo", "onomo", 
			"lratioo", "linto", "lnomo", "lratiol", "lintl", "lordl", "lnoml", "lbooll", 
			"groupbyaggord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ratio '", "'avg '", "'min '", "'max '", "'count '", "'size '", 
			"'merge '", "'reify '", "'deify '", "'get '", "'invert '", "'revert '", 
			"'fcont '", "'ocont '", "'pi1 '", "'pi2 '", "'pi3 '", "'sigmae '", "'sigmale '", 
			"'bowtie '", "'bowtie* '", "'bowtie_ratio '", "'groupby_avg '", "'groupby_sum '", 
			"'groupby_min '", "'groupby_max '", "'groupby_size '", "'groupby_count '", 
			"'interpol '", "'odist '", "'ldist '", "'lodist '", "'otopo '", "'lotopo '", 
			"'ndist '", "'lvis '", null, null, null, null, null, null, null, null, 
			null, "'in'", null, null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RATIO", "AVG", "MIN", "MAX", "COUNT", "SIZE", "MERGE", "REIFY", 
			"DEIFY", "GET", "INVERT", "REVERT", "FCONT", "OCONT", "PI1", "PI2", "PI3", 
			"SIGMAE", "SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", "GROUPBYAVG", 
			"GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", "GROUPBYCOUNT", 
			"INTERPOL", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", 
			"DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATAOBJV", 
			"DATACONTOURLINE", "DATAOBJCOUNT", "DATAFIELD", "TOPOV", "SV", "COUNTV", 
			"RATIOV", "INTV", "ORDV", "BOOLV", "NOMV", "DATAV", "WHITESPACE", "KEYWORD", 
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
			case PI3:
				{
				setState(112);
				r();
				}
				break;
			case INVERT:
			case REVERT:
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
			case INTERPOL:
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
			case RATIO:
			case AVG:
			case MIN:
			case MAX:
			case COUNT:
			case SIZE:
			case MERGE:
			case REIFY:
			case GET:
			case FCONT:
			case OCONT:
			case DATAOBJV:
			case TOPOV:
			case SV:
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
		public TerminalNode SV() { return getToken(TransformationAlgebraParser.SV, 0); }
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
			setState(207);
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
			case SV:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
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
			setState(209);
			match(GET);
			setState(210);
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
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(GET);
				setState(213);
				o();
				}
				break;
			case DATAOBJV:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(DEIFY);
				setState(218);
				sv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(PI1);
				setState(220);
				lint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(PI1);
				setState(222);
				lord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(PI1);
				setState(224);
				lnom();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(PI1);
				setState(226);
				lq();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				match(PI1);
				setState(228);
				lratio();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				match(PI1);
				setState(230);
				linto();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				match(PI1);
				setState(232);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(PI1);
				setState(236);
				sint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(PI1);
				setState(238);
				sord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(PI1);
				setState(240);
				snom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(PI1);
				setState(242);
				lq();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(PI2);
				setState(244);
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
		public TerminalNode PI3() { return getToken(TransformationAlgebraParser.PI3, 0); }
		public LnomoContext lnomo() {
			return getRuleContext(LnomoContext.class,0);
		}
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(PI1);
				setState(248);
				os();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(PI1);
				setState(250);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(PI1);
				setState(252);
				oint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(PI1);
				setState(254);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(PI1);
				setState(256);
				onom();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				match(PI1);
				setState(258);
				oq();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(259);
				match(PI1);
				setState(260);
				onomo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				match(PI2);
				setState(262);
				onomo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(263);
				match(PI3);
				setState(264);
				lnomo();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(265);
				match(PI3);
				setState(266);
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
			setState(269);
			match(PI2);
			setState(270);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(PI2);
				setState(273);
				oratio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(PI2);
				setState(275);
				lratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(PI1);
				setState(280);
				ints();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(PI2);
				setState(282);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(PI2);
				setState(284);
				lint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
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
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(PI1);
				setState(289);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(PI1);
				setState(294);
				noms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(PI1);
				setState(299);
				qs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		enterRule(_localctx, 44, RULE_lratio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		enterRule(_localctx, 46, RULE_lint);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(INTERPOL);
				setState(306);
				sint();
				setState(307);
				match(WHITESPACE);
				setState(308);
				l();
				}
				break;
			case SIGMASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(SIGMASE);
				setState(311);
				lint();
				setState(312);
				match(WHITESPACE);
				setState(313);
				intv();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(BOWTIE);
				setState(316);
				lint();
				setState(317);
				match(WHITESPACE);
				setState(318);
				l();
				}
				break;
			case GROUPBYAVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(GROUPBYAVG);
				setState(321);
				lintl();
				}
				break;
			case DATAFIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
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
		enterRule(_localctx, 48, RULE_lord);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(REVERT);
				setState(326);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(SIGMASE);
				setState(328);
				lord();
				setState(329);
				match(WHITESPACE);
				setState(330);
				ordv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(BOWTIE);
				setState(333);
				lord();
				setState(334);
				match(WHITESPACE);
				setState(335);
				l();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				groupbyaggord();
				setState(338);
				lordl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
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
		enterRule(_localctx, 50, RULE_lnom);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(REVERT);
				setState(344);
				snom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(SIGMAE);
				setState(346);
				lnom();
				setState(347);
				match(WHITESPACE);
				setState(348);
				nomv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
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
		enterRule(_localctx, 52, RULE_lq);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(SIGMAE);
				setState(354);
				lq();
				setState(355);
				match(WHITESPACE);
				setState(356);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(BOWTIE);
				setState(359);
				lq();
				setState(360);
				match(WHITESPACE);
				setState(361);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
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
		enterRule(_localctx, 54, RULE_ords);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INVERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(INVERT);
				setState(367);
				lord();
				}
				break;
			case SIGMASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(SIGMASE);
				setState(369);
				ords();
				setState(370);
				match(WHITESPACE);
				setState(371);
				ordv();
				}
				break;
			case DATACONTOUR:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
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
		enterRule(_localctx, 56, RULE_ints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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
		enterRule(_localctx, 58, RULE_noms);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(SIGMAE);
				setState(379);
				noms();
				setState(380);
				match(WHITESPACE);
				setState(381);
				nomv();
				}
				break;
			case INVERT:
			case SIGMASE:
			case DATACONTOUR:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
		enterRule(_localctx, 60, RULE_qs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
		enterRule(_localctx, 62, RULE_sint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSord(this);
		}
	}

	public final SordContext sord() throws RecognitionException {
		SordContext _localctx = new SordContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		public SordContext sord() {
			return getRuleContext(SordContext.class,0);
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
		enterRule(_localctx, 66, RULE_snom);
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATAAMOUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(DATAAMOUNT);
				}
				break;
			case INVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(INVERT);
				setState(394);
				lnom();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(SIGMAE);
				setState(396);
				snom();
				setState(397);
				match(WHITESPACE);
				setState(398);
				nomv();
				}
				break;
			case DATAPM:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
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
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterSq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitSq(this);
		}
	}

	public final SqContext sq() throws RecognitionException {
		SqContext _localctx = new SqContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 70, RULE_os);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(SIGMAE);
				setState(406);
				os();
				setState(407);
				match(WHITESPACE);
				setState(408);
				ov();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(BOWTIE);
				setState(411);
				os();
				setState(412);
				match(WHITESPACE);
				setState(413);
				o();
				}
				break;
			case DATAOBJS:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
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
		enterRule(_localctx, 72, RULE_ocount);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(SIGMAE);
				setState(419);
				ocount();
				setState(420);
				match(WHITESPACE);
				setState(421);
				ov();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(BOWTIE);
				setState(424);
				ocount();
				setState(425);
				match(WHITESPACE);
				setState(426);
				o();
				}
				break;
			case GROUPBYCOUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(GROUPBYCOUNT);
				setState(429);
				onomo();
				}
				break;
			case GROUPBYAVG:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				match(GROUPBYAVG);
				setState(431);
				ocounto();
				}
				break;
			case GROUPBYSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(GROUPBYSUM);
				setState(433);
				ocounto();
				}
				break;
			case DATAOBJCOUNT:
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
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
		enterRule(_localctx, 74, RULE_oratio);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(BOWTIE);
				setState(438);
				oratio();
				setState(439);
				match(WHITESPACE);
				setState(440);
				o();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(BOWTIERATIO);
				setState(443);
				oratio();
				setState(444);
				match(WHITESPACE);
				setState(445);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(GROUPBYAVG);
				setState(448);
				oratioo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(GROUPBYSUM);
				setState(450);
				oratioo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(GROUPBYAVG);
				setState(452);
				lratioo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(453);
				match(GROUPBYSIZE);
				setState(454);
				lnomo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(455);
				match(DATAOBJQ);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(456);
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
		enterRule(_localctx, 76, RULE_oint);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(SIGMASE);
				setState(460);
				oint();
				setState(461);
				match(WHITESPACE);
				setState(462);
				intv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(BOWTIE);
				setState(465);
				oint();
				setState(466);
				match(WHITESPACE);
				setState(467);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(GROUPBYAVG);
				setState(470);
				ointo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(GROUPBYAVG);
				setState(472);
				linto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
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
		enterRule(_localctx, 78, RULE_oord);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(SIGMASE);
				setState(477);
				oord();
				setState(478);
				match(WHITESPACE);
				setState(479);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(BOWTIE);
				setState(482);
				oord();
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
				groupbyaggord();
				setState(487);
				oordo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
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
		enterRule(_localctx, 80, RULE_onom);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				match(SIGMAE);
				setState(493);
				onom();
				setState(494);
				match(WHITESPACE);
				setState(495);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
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
		enterRule(_localctx, 82, RULE_oq);
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(SIGMAE);
				setState(501);
				oq();
				setState(502);
				match(WHITESPACE);
				setState(503);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(BOWTIE);
				setState(506);
				oq();
				setState(507);
				match(WHITESPACE);
				setState(508);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
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
			setState(513);
			match(BOWTIESTAR);
			setState(514);
			onomo();
			setState(515);
			match(WHITESPACE);
			setState(516);
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
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(ODIST);
				setState(519);
				os();
				setState(520);
				match(WHITESPACE);
				setState(521);
				os();
				}
				break;
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(NDIST);
				setState(524);
				o();
				setState(525);
				match(WHITESPACE);
				setState(526);
				o();
				setState(527);
				match(WHITESPACE);
				setState(528);
				oratioo();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(BOWTIESTAR);
				setState(531);
				onomo();
				setState(532);
				match(WHITESPACE);
				setState(533);
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
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(BOWTIESTAR);
				setState(538);
				onomo();
				setState(539);
				match(WHITESPACE);
				setState(540);
				oint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
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
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(SIGMASE);
				setState(546);
				oordo();
				setState(547);
				match(WHITESPACE);
				setState(548);
				ordv();
				}
				break;
			case BOWTIESTAR:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
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
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(OTOPO);
				setState(554);
				os();
				setState(555);
				match(WHITESPACE);
				setState(556);
				os();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(SIGMAE);
				setState(559);
				onomo();
				setState(560);
				match(WHITESPACE);
				setState(561);
				nomv();
				}
				break;
			case SIGMASE:
			case BOWTIESTAR:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
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
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(LODIST);
				setState(567);
				l();
				setState(568);
				match(WHITESPACE);
				setState(569);
				o();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(BOWTIESTAR);
				setState(572);
				lnomo();
				setState(573);
				match(WHITESPACE);
				setState(574);
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
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(BOWTIESTAR);
				setState(579);
				lnomo();
				setState(580);
				match(WHITESPACE);
				setState(581);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
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
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				match(LOTOPO);
				setState(587);
				l();
				setState(588);
				match(WHITESPACE);
				setState(589);
				os();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(SIGMAE);
				setState(592);
				lnomo();
				setState(593);
				match(WHITESPACE);
				setState(594);
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
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LDIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(LDIST);
				setState(599);
				l();
				setState(600);
				match(WHITESPACE);
				setState(601);
				l();
				}
				break;
			case BOWTIESTAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				match(BOWTIESTAR);
				setState(604);
				lnoml();
				setState(605);
				match(WHITESPACE);
				setState(606);
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
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(BOWTIESTAR);
				setState(611);
				lnoml();
				setState(612);
				match(WHITESPACE);
				setState(613);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
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
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(SIGMASE);
				setState(619);
				lordl();
				setState(620);
				match(WHITESPACE);
				setState(621);
				ordv();
				}
				break;
			case BOWTIESTAR:
			case LDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
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
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(SIGMAE);
				setState(627);
				lnoml();
				setState(628);
				match(WHITESPACE);
				setState(629);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				lbooll();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
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
			setState(647);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LVIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				match(LVIS);
				setState(636);
				l();
				setState(637);
				match(WHITESPACE);
				setState(638);
				l();
				setState(639);
				match(WHITESPACE);
				setState(640);
				oint();
				}
				break;
			case SIGMAE:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(SIGMAE);
				setState(643);
				lbooll();
				setState(644);
				match(WHITESPACE);
				setState(645);
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
			setState(649);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u028e\4\2\t\2\4"+
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
		"\3\13\3\13\3\13\3\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d2"+
		"\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ec"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f8\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010e\n\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0118\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0121\n\24\3\25\3\25\3\25\5\25\u0126\n\25\3\26\3\26\3\26\5\26\u012b\n"+
		"\26\3\27\3\27\3\27\5\27\u0130\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0146\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u0158\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0162\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u016f\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0179"+
		"\n\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0183\n\37\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0194\n#\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\5%\u01a3\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\5&\u01b6\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01cc\n\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01dd\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u01ed\n)\3*\3*\3*\3*\3*\3*\5*\u01f5\n*\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u0202\n+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u021a\n-\3.\3.\3.\3.\3.\3.\5.\u0222\n"+
		".\3/\3/\3/\3/\3/\3/\5/\u022a\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0237\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0243\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u024b\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0257\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0263\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u026b\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\5\66\u0273\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u027c\n\67\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\58\u028a\n8\39\39\39\2\2:\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnp\2\3\3\2\33\34\2\u02d4\2u\3\2\2\2\4{\3\2\2\2\6\u0082\3\2\2\2"+
		"\b\u0088\3\2\2\2\n\u008f\3\2\2\2\f\u00a0\3\2\2\2\16\u00aa\3\2\2\2\20\u00b8"+
		"\3\2\2\2\22\u00bf\3\2\2\2\24\u00c8\3\2\2\2\26\u00d1\3\2\2\2\30\u00d3\3"+
		"\2\2\2\32\u00d9\3\2\2\2\34\u00eb\3\2\2\2\36\u00f7\3\2\2\2 \u010d\3\2\2"+
		"\2\"\u010f\3\2\2\2$\u0117\3\2\2\2&\u0120\3\2\2\2(\u0125\3\2\2\2*\u012a"+
		"\3\2\2\2,\u012f\3\2\2\2.\u0131\3\2\2\2\60\u0145\3\2\2\2\62\u0157\3\2\2"+
		"\2\64\u0161\3\2\2\2\66\u016e\3\2\2\28\u0178\3\2\2\2:\u017a\3\2\2\2<\u0182"+
		"\3\2\2\2>\u0184\3\2\2\2@\u0186\3\2\2\2B\u0188\3\2\2\2D\u0193\3\2\2\2F"+
		"\u0195\3\2\2\2H\u01a2\3\2\2\2J\u01b5\3\2\2\2L\u01cb\3\2\2\2N\u01dc\3\2"+
		"\2\2P\u01ec\3\2\2\2R\u01f4\3\2\2\2T\u0201\3\2\2\2V\u0203\3\2\2\2X\u0219"+
		"\3\2\2\2Z\u0221\3\2\2\2\\\u0229\3\2\2\2^\u0236\3\2\2\2`\u0242\3\2\2\2"+
		"b\u024a\3\2\2\2d\u0256\3\2\2\2f\u0262\3\2\2\2h\u026a\3\2\2\2j\u0272\3"+
		"\2\2\2l\u027b\3\2\2\2n\u0289\3\2\2\2p\u028b\3\2\2\2rv\5\4\3\2sv\5\6\4"+
		"\2tv\5\b\5\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\3\3\2\2\2w|\5\34\17\2x|\5"+
		"\36\20\2y|\5,\27\2z|\5 \21\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|"+
		"\5\3\2\2\2}\u0083\5\66\34\2~\u0083\5F$\2\177\u0083\5> \2\u0080\u0083\5"+
		"T+\2\u0081\u0083\5H%\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\7\3\2\2\2\u0084\u0089\5"+
		"\32\16\2\u0085\u0089\5\30\r\2\u0086\u0089\5\26\f\2\u0087\u0089\5\24\13"+
		"\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b\7\7\2\2\u008b\u0090\5 \21\2\u008c"+
		"\u008d\7\f\2\2\u008d\u0090\5\"\22\2\u008e\u0090\7\62\2\2\u008f\u008a\3"+
		"\2\2\2\u008f\u008c\3\2\2\2\u008f\u008e\3\2\2\2\u0090\13\3\2\2\2\u0091"+
		"\u0092\7\17\2\2\u0092\u00a1\5\60\31\2\u0093\u0094\7\b\2\2\u0094\u00a1"+
		"\5\34\17\2\u0095\u0096\7\3\2\2\u0096\u0097\5\f\7\2\u0097\u0098\79\2\2"+
		"\u0098\u0099\5\f\7\2\u0099\u00a1\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u00a1"+
		"\5L\'\2\u009c\u009d\7\f\2\2\u009d\u00a1\5$\23\2\u009e\u00a1\5\n\6\2\u009f"+
		"\u00a1\7\63\2\2\u00a0\u0091\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u0095\3"+
		"\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00ab\5\60\31"+
		"\2\u00a4\u00a5\7\4\2\2\u00a5\u00ab\5N(\2\u00a6\u00ab\5\f\7\2\u00a7\u00a8"+
		"\7\f\2\2\u00a8\u00ab\5&\24\2\u00a9\u00ab\7\64\2\2\u00aa\u00a2\3\2\2\2"+
		"\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\17\3\2\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00b9\5\62\32\2\u00ae"+
		"\u00af\7\5\2\2\u00af\u00b9\5\62\32\2\u00b0\u00b1\7\6\2\2\u00b1\u00b9\5"+
		"P)\2\u00b2\u00b3\7\5\2\2\u00b3\u00b9\5P)\2\u00b4\u00b5\7\f\2\2\u00b5\u00b9"+
		"\5(\25\2\u00b6\u00b9\5\16\b\2\u00b7\u00b9\7\65\2\2\u00b8\u00ac\3\2\2\2"+
		"\u00b8\u00ae\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b4"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\21\3\2\2\2\u00ba"+
		"\u00c0\5\20\t\2\u00bb\u00bc\7\f\2\2\u00bc\u00c0\5*\26\2\u00bd\u00c0\7"+
		"\60\2\2\u00be\u00c0\7\67\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\7\f\2"+
		"\2\u00c2\u00c9\5,\27\2\u00c3\u00c9\5\22\n\2\u00c4\u00c9\5\20\t\2\u00c5"+
		"\u00c9\5\16\b\2\u00c6\u00c9\5\f\7\2\u00c7\u00c9\5\n\6\2\u00c8\u00c1\3"+
		"\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\7\n\2"+
		"\2\u00cb\u00d2\5\34\17\2\u00cc\u00cd\7\f\2\2\u00cd\u00d2\5\36\20\2\u00ce"+
		"\u00cf\7\t\2\2\u00cf\u00d2\5\36\20\2\u00d0\u00d2\7\61\2\2\u00d1\u00ca"+
		"\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\27\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\5\34\17\2\u00d5\31\3\2\2\2"+
		"\u00d6\u00d7\7\f\2\2\u00d7\u00da\5 \21\2\u00d8\u00da\7,\2\2\u00d9\u00d6"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\33\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc"+
		"\u00ec\5\26\f\2\u00dd\u00de\7\21\2\2\u00de\u00ec\5\60\31\2\u00df\u00e0"+
		"\7\21\2\2\u00e0\u00ec\5\62\32\2\u00e1\u00e2\7\21\2\2\u00e2\u00ec\5\64"+
		"\33\2\u00e3\u00e4\7\21\2\2\u00e4\u00ec\5\66\34\2\u00e5\u00e6\7\21\2\2"+
		"\u00e6\u00ec\5.\30\2\u00e7\u00e8\7\21\2\2\u00e8\u00ec\5b\62\2\u00e9\u00ea"+
		"\7\21\2\2\u00ea\u00ec\5d\63\2\u00eb\u00db\3\2\2\2\u00eb\u00dd\3\2\2\2"+
		"\u00eb\u00df\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e5"+
		"\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\35\3\2\2\2\u00ed"+
		"\u00ee\7\21\2\2\u00ee\u00f8\5@!\2\u00ef\u00f0\7\21\2\2\u00f0\u00f8\5B"+
		"\"\2\u00f1\u00f2\7\21\2\2\u00f2\u00f8\5D#\2\u00f3\u00f4\7\21\2\2\u00f4"+
		"\u00f8\5\66\34\2\u00f5\u00f6\7\22\2\2\u00f6\u00f8\5H%\2\u00f7\u00ed\3"+
		"\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00fa\7\21\2\2\u00fa\u010e\5H%\2"+
		"\u00fb\u00fc\7\21\2\2\u00fc\u010e\5L\'\2\u00fd\u00fe\7\21\2\2\u00fe\u010e"+
		"\5N(\2\u00ff\u0100\7\21\2\2\u0100\u010e\5P)\2\u0101\u0102\7\21\2\2\u0102"+
		"\u010e\5R*\2\u0103\u0104\7\21\2\2\u0104\u010e\5T+\2\u0105\u0106\7\21\2"+
		"\2\u0106\u010e\5^\60\2\u0107\u0108\7\22\2\2\u0108\u010e\5^\60\2\u0109"+
		"\u010a\7\23\2\2\u010a\u010e\5d\63\2\u010b\u010c\7\23\2\2\u010c\u010e\5"+
		"^\60\2\u010d\u00f9\3\2\2\2\u010d\u00fb\3\2\2\2\u010d\u00fd\3\2\2\2\u010d"+
		"\u00ff\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0105\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"!\3\2\2\2\u010f\u0110\7\22\2\2\u0110\u0111\5J&\2\u0111#\3\2\2\2\u0112"+
		"\u0113\7\22\2\2\u0113\u0118\5L\'\2\u0114\u0115\7\22\2\2\u0115\u0118\5"+
		".\30\2\u0116\u0118\5\"\22\2\u0117\u0112\3\2\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118%\3\2\2\2\u0119\u011a\7\21\2\2\u011a\u0121\5:\36\2"+
		"\u011b\u011c\7\22\2\2\u011c\u0121\5N(\2\u011d\u011e\7\22\2\2\u011e\u0121"+
		"\5\60\31\2\u011f\u0121\5$\23\2\u0120\u0119\3\2\2\2\u0120\u011b\3\2\2\2"+
		"\u0120\u011d\3\2\2\2\u0120\u011f\3\2\2\2\u0121\'\3\2\2\2\u0122\u0123\7"+
		"\21\2\2\u0123\u0126\58\35\2\u0124\u0126\5&\24\2\u0125\u0122\3\2\2\2\u0125"+
		"\u0124\3\2\2\2\u0126)\3\2\2\2\u0127\u0128\7\21\2\2\u0128\u012b\5<\37\2"+
		"\u0129\u012b\5(\25\2\u012a\u0127\3\2\2\2\u012a\u0129\3\2\2\2\u012b+\3"+
		"\2\2\2\u012c\u012d\7\21\2\2\u012d\u0130\5> \2\u012e\u0130\5*\26\2\u012f"+
		"\u012c\3\2\2\2\u012f\u012e\3\2\2\2\u0130-\3\2\2\2\u0131\u0132\7/\2\2\u0132"+
		"/\3\2\2\2\u0133\u0134\7\37\2\2\u0134\u0135\5@!\2\u0135\u0136\79\2\2\u0136"+
		"\u0137\5\34\17\2\u0137\u0146\3\2\2\2\u0138\u0139\7\25\2\2\u0139\u013a"+
		"\5\60\31\2\u013a\u013b\79\2\2\u013b\u013c\5\16\b\2\u013c\u0146\3\2\2\2"+
		"\u013d\u013e\7\26\2\2\u013e\u013f\5\60\31\2\u013f\u0140\79\2\2\u0140\u0141"+
		"\5\34\17\2\u0141\u0146\3\2\2\2\u0142\u0143\7\31\2\2\u0143\u0146\5h\65"+
		"\2\u0144\u0146\5.\30\2\u0145\u0133\3\2\2\2\u0145\u0138\3\2\2\2\u0145\u013d"+
		"\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0144\3\2\2\2\u0146\61\3\2\2\2\u0147"+
		"\u0148\7\16\2\2\u0148\u0158\58\35\2\u0149\u014a\7\25\2\2\u014a\u014b\5"+
		"\62\32\2\u014b\u014c\79\2\2\u014c\u014d\5\20\t\2\u014d\u0158\3\2\2\2\u014e"+
		"\u014f\7\26\2\2\u014f\u0150\5\62\32\2\u0150\u0151\79\2\2\u0151\u0152\5"+
		"\34\17\2\u0152\u0158\3\2\2\2\u0153\u0154\5p9\2\u0154\u0155\5j\66\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0158\5\60\31\2\u0157\u0147\3\2\2\2\u0157\u0149\3"+
		"\2\2\2\u0157\u014e\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\63\3\2\2\2\u0159\u015a\7\16\2\2\u015a\u0162\5D#\2\u015b\u015c\7\24\2"+
		"\2\u015c\u015d\5\64\33\2\u015d\u015e\79\2\2\u015e\u015f\5\22\n\2\u015f"+
		"\u0162\3\2\2\2\u0160\u0162\5\62\32\2\u0161\u0159\3\2\2\2\u0161\u015b\3"+
		"\2\2\2\u0161\u0160\3\2\2\2\u0162\65\3\2\2\2\u0163\u0164\7\24\2\2\u0164"+
		"\u0165\5\66\34\2\u0165\u0166\79\2\2\u0166\u0167\5\24\13\2\u0167\u016f"+
		"\3\2\2\2\u0168\u0169\7\26\2\2\u0169\u016a\5\66\34\2\u016a\u016b\79\2\2"+
		"\u016b\u016c\5\34\17\2\u016c\u016f\3\2\2\2\u016d\u016f\5\64\33\2\u016e"+
		"\u0163\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u016d\3\2\2\2\u016f\67\3\2\2"+
		"\2\u0170\u0171\7\r\2\2\u0171\u0179\5\62\32\2\u0172\u0173\7\25\2\2\u0173"+
		"\u0174\58\35\2\u0174\u0175\79\2\2\u0175\u0176\5\20\t\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0179\7)\2\2\u0178\u0170\3\2\2\2\u0178\u0172\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u01799\3\2\2\2\u017a\u017b\7-\2\2\u017b;\3\2\2\2\u017c"+
		"\u017d\7\24\2\2\u017d\u017e\5<\37\2\u017e\u017f\79\2\2\u017f\u0180\5\22"+
		"\n\2\u0180\u0183\3\2\2\2\u0181\u0183\58\35\2\u0182\u017c\3\2\2\2\u0182"+
		"\u0181\3\2\2\2\u0183=\3\2\2\2\u0184\u0185\5<\37\2\u0185?\3\2\2\2\u0186"+
		"\u0187\7\'\2\2\u0187A\3\2\2\2\u0188\u0189\5@!\2\u0189C\3\2\2\2\u018a\u0194"+
		"\7(\2\2\u018b\u018c\7\r\2\2\u018c\u0194\5\64\33\2\u018d\u018e\7\24\2\2"+
		"\u018e\u018f\5D#\2\u018f\u0190\79\2\2\u0190\u0191\5\22\n\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0194\5B\"\2\u0193\u018a\3\2\2\2\u0193\u018b\3\2\2\2\u0193"+
		"\u018d\3\2\2\2\u0193\u0192\3\2\2\2\u0194E\3\2\2\2\u0195\u0196\5D#\2\u0196"+
		"G\3\2\2\2\u0197\u0198\7\24\2\2\u0198\u0199\5H%\2\u0199\u019a\79\2\2\u019a"+
		"\u019b\5\32\16\2\u019b\u01a3\3\2\2\2\u019c\u019d\7\26\2\2\u019d\u019e"+
		"\5H%\2\u019e\u019f\79\2\2\u019f\u01a0\5 \21\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u01a3\7+\2\2\u01a2\u0197\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u01a1\3\2"+
		"\2\2\u01a3I\3\2\2\2\u01a4\u01a5\7\24\2\2\u01a5\u01a6\5J&\2\u01a6\u01a7"+
		"\79\2\2\u01a7\u01a8\5\32\16\2\u01a8\u01b6\3\2\2\2\u01a9\u01aa\7\26\2\2"+
		"\u01aa\u01ab\5J&\2\u01ab\u01ac\79\2\2\u01ac\u01ad\5 \21\2\u01ad\u01b6"+
		"\3\2\2\2\u01ae\u01af\7\36\2\2\u01af\u01b6\5^\60\2\u01b0\u01b1\7\31\2\2"+
		"\u01b1\u01b6\5V,\2\u01b2\u01b3\7\32\2\2\u01b3\u01b6\5V,\2\u01b4\u01b6"+
		"\7.\2\2\u01b5\u01a4\3\2\2\2\u01b5\u01a9\3\2\2\2\u01b5\u01ae\3\2\2\2\u01b5"+
		"\u01b0\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6K\3\2\2\2"+
		"\u01b7\u01b8\7\26\2\2\u01b8\u01b9\5L\'\2\u01b9\u01ba\79\2\2\u01ba\u01bb"+
		"\5 \21\2\u01bb\u01cc\3\2\2\2\u01bc\u01bd\7\30\2\2\u01bd\u01be\5L\'\2\u01be"+
		"\u01bf\79\2\2\u01bf\u01c0\5L\'\2\u01c0\u01cc\3\2\2\2\u01c1\u01c2\7\31"+
		"\2\2\u01c2\u01cc\5X-\2\u01c3\u01c4\7\32\2\2\u01c4\u01cc\5X-\2\u01c5\u01c6"+
		"\7\31\2\2\u01c6\u01cc\5`\61\2\u01c7\u01c8\7\35\2\2\u01c8\u01cc\5d\63\2"+
		"\u01c9\u01cc\7*\2\2\u01ca\u01cc\5J&\2\u01cb\u01b7\3\2\2\2\u01cb\u01bc"+
		"\3\2\2\2\u01cb\u01c1\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb\u01c5\3\2\2\2\u01cb"+
		"\u01c7\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccM\3\2\2\2"+
		"\u01cd\u01ce\7\25\2\2\u01ce\u01cf\5N(\2\u01cf\u01d0\79\2\2\u01d0\u01d1"+
		"\5\16\b\2\u01d1\u01dd\3\2\2\2\u01d2\u01d3\7\26\2\2\u01d3\u01d4\5N(\2\u01d4"+
		"\u01d5\79\2\2\u01d5\u01d6\5 \21\2\u01d6\u01dd\3\2\2\2\u01d7\u01d8\7\31"+
		"\2\2\u01d8\u01dd\5Z.\2\u01d9\u01da\7\31\2\2\u01da\u01dd\5b\62\2\u01db"+
		"\u01dd\5L\'\2\u01dc\u01cd\3\2\2\2\u01dc\u01d2\3\2\2\2\u01dc\u01d7\3\2"+
		"\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddO\3\2\2\2\u01de\u01df"+
		"\7\25\2\2\u01df\u01e0\5P)\2\u01e0\u01e1\79\2\2\u01e1\u01e2\5\20\t\2\u01e2"+
		"\u01ed\3\2\2\2\u01e3\u01e4\7\26\2\2\u01e4\u01e5\5P)\2\u01e5\u01e6\79\2"+
		"\2\u01e6\u01e7\5 \21\2\u01e7\u01ed\3\2\2\2\u01e8\u01e9\5p9\2\u01e9\u01ea"+
		"\5\\/\2\u01ea\u01ed\3\2\2\2\u01eb\u01ed\5N(\2\u01ec\u01de\3\2\2\2\u01ec"+
		"\u01e3\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01eb\3\2\2\2\u01edQ\3\2\2\2"+
		"\u01ee\u01ef\7\24\2\2\u01ef\u01f0\5R*\2\u01f0\u01f1\79\2\2\u01f1\u01f2"+
		"\5\22\n\2\u01f2\u01f5\3\2\2\2\u01f3\u01f5\5P)\2\u01f4\u01ee\3\2\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f5S\3\2\2\2\u01f6\u01f7\7\24\2\2\u01f7\u01f8\5T+\2\u01f8"+
		"\u01f9\79\2\2\u01f9\u01fa\5\24\13\2\u01fa\u0202\3\2\2\2\u01fb\u01fc\7"+
		"\26\2\2\u01fc\u01fd\5T+\2\u01fd\u01fe\79\2\2\u01fe\u01ff\5 \21\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u0202\5R*\2\u0201\u01f6\3\2\2\2\u0201\u01fb\3\2\2"+
		"\2\u0201\u0200\3\2\2\2\u0202U\3\2\2\2\u0203\u0204\7\27\2\2\u0204\u0205"+
		"\5^\60\2\u0205\u0206\79\2\2\u0206\u0207\5J&\2\u0207W\3\2\2\2\u0208\u0209"+
		"\7 \2\2\u0209\u020a\5H%\2\u020a\u020b\79\2\2\u020b\u020c\5H%\2\u020c\u021a"+
		"\3\2\2\2\u020d\u020e\7%\2\2\u020e\u020f\5 \21\2\u020f\u0210\79\2\2\u0210"+
		"\u0211\5 \21\2\u0211\u0212\79\2\2\u0212\u0213\5X-\2\u0213\u021a\3\2\2"+
		"\2\u0214\u0215\7\27\2\2\u0215\u0216\5^\60\2\u0216\u0217\79\2\2\u0217\u0218"+
		"\5L\'\2\u0218\u021a\3\2\2\2\u0219\u0208\3\2\2\2\u0219\u020d\3\2\2\2\u0219"+
		"\u0214\3\2\2\2\u021aY\3\2\2\2\u021b\u021c\7\27\2\2\u021c\u021d\5^\60\2"+
		"\u021d\u021e\79\2\2\u021e\u021f\5N(\2\u021f\u0222\3\2\2\2\u0220\u0222"+
		"\5X-\2\u0221\u021b\3\2\2\2\u0221\u0220\3\2\2\2\u0222[\3\2\2\2\u0223\u0224"+
		"\7\25\2\2\u0224\u0225\5\\/\2\u0225\u0226\79\2\2\u0226\u0227\5\20\t\2\u0227"+
		"\u022a\3\2\2\2\u0228\u022a\5Z.\2\u0229\u0223\3\2\2\2\u0229\u0228\3\2\2"+
		"\2\u022a]\3\2\2\2\u022b\u022c\7#\2\2\u022c\u022d\5H%\2\u022d\u022e\79"+
		"\2\2\u022e\u022f\5H%\2\u022f\u0237\3\2\2\2\u0230\u0231\7\24\2\2\u0231"+
		"\u0232\5^\60\2\u0232\u0233\79\2\2\u0233\u0234\5\22\n\2\u0234\u0237\3\2"+
		"\2\2\u0235\u0237\5\\/\2\u0236\u022b\3\2\2\2\u0236\u0230\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237_\3\2\2\2\u0238\u0239\7\"\2\2\u0239\u023a\5\34\17"+
		"\2\u023a\u023b\79\2\2\u023b\u023c\5 \21\2\u023c\u0243\3\2\2\2\u023d\u023e"+
		"\7\27\2\2\u023e\u023f\5d\63\2\u023f\u0240\79\2\2\u0240\u0241\5.\30\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0238\3\2\2\2\u0242\u023d\3\2\2\2\u0243a\3\2\2\2"+
		"\u0244\u0245\7\27\2\2\u0245\u0246\5d\63\2\u0246\u0247\79\2\2\u0247\u0248"+
		"\5\60\31\2\u0248\u024b\3\2\2\2\u0249\u024b\5`\61\2\u024a\u0244\3\2\2\2"+
		"\u024a\u0249\3\2\2\2\u024bc\3\2\2\2\u024c\u024d\7$\2\2\u024d\u024e\5\34"+
		"\17\2\u024e\u024f\79\2\2\u024f\u0250\5H%\2\u0250\u0257\3\2\2\2\u0251\u0252"+
		"\7\24\2\2\u0252\u0253\5d\63\2\u0253\u0254\79\2\2\u0254\u0255\5\22\n\2"+
		"\u0255\u0257\3\2\2\2\u0256\u024c\3\2\2\2\u0256\u0251\3\2\2\2\u0257e\3"+
		"\2\2\2\u0258\u0259\7!\2\2\u0259\u025a\5\34\17\2\u025a\u025b\79\2\2\u025b"+
		"\u025c\5\34\17\2\u025c\u0263\3\2\2\2\u025d\u025e\7\27\2\2\u025e\u025f"+
		"\5l\67\2\u025f\u0260\79\2\2\u0260\u0261\5.\30\2\u0261\u0263\3\2\2\2\u0262"+
		"\u0258\3\2\2\2\u0262\u025d\3\2\2\2\u0263g\3\2\2\2\u0264\u0265\7\27\2\2"+
		"\u0265\u0266\5l\67\2\u0266\u0267\79\2\2\u0267\u0268\5\60\31\2\u0268\u026b"+
		"\3\2\2\2\u0269\u026b\5f\64\2\u026a\u0264\3\2\2\2\u026a\u0269\3\2\2\2\u026b"+
		"i\3\2\2\2\u026c\u026d\7\25\2\2\u026d\u026e\5j\66\2\u026e\u026f\79\2\2"+
		"\u026f\u0270\5\20\t\2\u0270\u0273\3\2\2\2\u0271\u0273\5h\65\2\u0272\u026c"+
		"\3\2\2\2\u0272\u0271\3\2\2\2\u0273k\3\2\2\2\u0274\u0275\7\24\2\2\u0275"+
		"\u0276\5l\67\2\u0276\u0277\79\2\2\u0277\u0278\5\22\n\2\u0278\u027c\3\2"+
		"\2\2\u0279\u027c\5n8\2\u027a\u027c\5j\66\2\u027b\u0274\3\2\2\2\u027b\u0279"+
		"\3\2\2\2\u027b\u027a\3\2\2\2\u027cm\3\2\2\2\u027d\u027e\7&\2\2\u027e\u027f"+
		"\5\34\17\2\u027f\u0280\79\2\2\u0280\u0281\5\34\17\2\u0281\u0282\79\2\2"+
		"\u0282\u0283\5N(\2\u0283\u028a\3\2\2\2\u0284\u0285\7\24\2\2\u0285\u0286"+
		"\5n8\2\u0286\u0287\79\2\2\u0287\u0288\7\66\2\2\u0288\u028a\3\2\2\2\u0289"+
		"\u027d\3\2\2\2\u0289\u0284\3\2\2\2\u028ao\3\2\2\2\u028b\u028c\t\2\2\2"+
		"\u028cq\3\2\2\2\60u{\u0082\u0088\u008f\u00a0\u00aa\u00b8\u00bf\u00c8\u00d1"+
		"\u00d9\u00eb\u00f7\u010d\u0117\u0120\u0125\u012a\u012f\u0145\u0157\u0161"+
		"\u016e\u0178\u0182\u0193\u01a2\u01b5\u01cb\u01dc\u01ec\u01f4\u0201\u0219"+
		"\u0221\u0229\u0236\u0242\u024a\u0256\u0262\u026a\u0272\u027b\u0289";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}