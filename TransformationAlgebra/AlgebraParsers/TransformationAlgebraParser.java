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
		BOOLV=1, AVG=2, MIN=3, MAX=4, REIFY=5, DEIFY=6, GET=7, FCONT=8, OCONT=9, 
		RATIO=10, INTERPOL=11, PI1=12, PI2=13, SIGMAE2=14, SIGMASE2=15, BOWTIE=16, 
		GROUPBY=17, ODIST=18, LDIST=19, LODIST=20, OTOPO=21, LOTOPO=22, NDIST=23, 
		LVIS=24, DATAPM=25, DATAAMOUNT=26, DATACONTOUR=27, DATAOBJQ=28, DATAOBJS=29, 
		DATACONTOURLINE=30, DATAOBJCOUNT=31, DATAFIELD=32, DATAV=33, WHITESPACE=34, 
		KEYWORD=35, WS=36;
	public static final int
		RULE_start = 0, RULE_r = 1, RULE_rr = 2, RULE_v = 3, RULE_countv = 4, 
		RULE_ratiov = 5, RULE_intv = 6, RULE_ordv = 7, RULE_nomv = 8, RULE_qv = 9, 
		RULE_sv = 10, RULE_lv = 11, RULE_ov = 12, RULE_l = 13, RULE_s = 14, RULE_o = 15, 
		RULE_count = 16, RULE_ratio = 17, RULE_intt = 18, RULE_ordinal = 19, RULE_nom = 20, 
		RULE_q = 21, RULE_sint = 22, RULE_snom = 23, RULE_ords = 24, RULE_os = 25, 
		RULE_ints = 26, RULE_ocount = 27, RULE_lratio = 28, RULE_noms = 29, RULE_qs = 30, 
		RULE_oratio = 31, RULE_oint = 32, RULE_oord = 33, RULE_onom = 34, RULE_oq = 35, 
		RULE_lnom = 36, RULE_lint = 37, RULE_lord = 38, RULE_lq = 39, RULE_sord = 40, 
		RULE_sq = 41, RULE_oratioo = 42, RULE_lratiol = 43, RULE_lratioo = 44, 
		RULE_onomo = 45, RULE_lnomo = 46, RULE_lintl = 47, RULE_lordl = 48, RULE_lnoml = 49, 
		RULE_lbooll = 50, RULE_oordo = 51, RULE_ointo = 52, RULE_agg = 53, RULE_aggord = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "r", "rr", "v", "countv", "ratiov", "intv", "ordv", "nomv", 
			"qv", "sv", "lv", "ov", "l", "s", "o", "count", "ratio", "intt", "ordinal", 
			"nom", "q", "sint", "snom", "ords", "os", "ints", "ocount", "lratio", 
			"noms", "qs", "oratio", "oint", "oord", "onom", "oq", "lnom", "lint", 
			"lord", "lq", "sord", "sq", "oratioo", "lratiol", "lratioo", "onomo", 
			"lnomo", "lintl", "lordl", "lnoml", "lbooll", "oordo", "ointo", "agg", 
			"aggord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'average '", "'min '", "'max '", "'reify '", "'deify '", 
			"'get '", "'fcont '", "'ocont '", "'ratio '", "'interpol '", "'pi1 '", 
			"'pi2 '", "'sigmae '", "'sigmale '", "'bowtie '", "'groupby '", "'odist '", 
			"'ldist '", "'lodist '", "'otopo '", "'lotopo '", "'ndist '", "'lvis '", 
			null, null, null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLV", "AVG", "MIN", "MAX", "REIFY", "DEIFY", "GET", "FCONT", 
			"OCONT", "RATIO", "INTERPOL", "PI1", "PI2", "SIGMAE2", "SIGMASE2", "BOWTIE", 
			"GROUPBY", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", 
			"DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATACONTOURLINE", 
			"DATAOBJCOUNT", "DATAFIELD", "DATAV", "WHITESPACE", "KEYWORD", "WS"
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEIFY:
			case PI1:
			case PI2:
				{
				setState(110);
				r();
				}
				break;
			case INTERPOL:
			case SIGMAE2:
			case SIGMASE2:
			case BOWTIE:
			case GROUPBY:
			case DATAPM:
			case DATAAMOUNT:
			case DATACONTOUR:
			case DATAOBJQ:
			case DATAOBJS:
			case DATAFIELD:
				{
				setState(111);
				rr();
				}
				break;
			case AVG:
			case MIN:
			case MAX:
			case REIFY:
			case GET:
			case FCONT:
			case OCONT:
			case RATIO:
			case DATAV:
			case KEYWORD:
				{
				setState(112);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(115);
				l();
				}
				break;
			case 2:
				{
				setState(116);
				s();
				}
				break;
			case 3:
				{
				setState(117);
				q();
				}
				break;
			case 4:
				{
				setState(118);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(121);
				lq();
				}
				break;
			case 2:
				{
				setState(122);
				sq();
				}
				break;
			case 3:
				{
				setState(123);
				qs();
				}
				break;
			case 4:
				{
				setState(124);
				oq();
				}
				break;
			case 5:
				{
				setState(125);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(128);
				ov();
				}
				break;
			case 2:
				{
				setState(129);
				lv();
				}
				break;
			case 3:
				{
				setState(130);
				sv();
				}
				break;
			case 4:
				{
				setState(131);
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
		public TerminalNode OCONT() { return getToken(TransformationAlgebraParser.OCONT, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public CountContext count() {
			return getRuleContext(CountContext.class,0);
		}
		public TerminalNode DATAV() { return getToken(TransformationAlgebraParser.DATAV, 0); }
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
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCONT:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(OCONT);
				setState(135);
				o();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(GET);
				setState(137);
				count();
				}
				break;
			case DATAV:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(DATAV);
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
		public TerminalNode DATAV() { return getToken(TransformationAlgebraParser.DATAV, 0); }
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(FCONT);
				setState(142);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(FCONT);
				setState(144);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(RATIO);
				setState(146);
				ratiov();
				setState(147);
				match(WHITESPACE);
				setState(148);
				ratiov();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(OCONT);
				setState(151);
				oratio();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(GET);
				setState(153);
				ratio();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				countv();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				match(DATAV);
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
		public TerminalNode DATAV() { return getToken(TransformationAlgebraParser.DATAV, 0); }
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(AVG);
				setState(159);
				lint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(AVG);
				setState(161);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				ratiov();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(GET);
				setState(164);
				intt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(DATAV);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(MAX);
				setState(169);
				lord();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(MIN);
				setState(171);
				lord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(MAX);
				setState(173);
				oord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(MIN);
				setState(175);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				match(GET);
				setState(177);
				ordinal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				intv();
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(GET);
				setState(183);
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

	public static class QvContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(TransformationAlgebraParser.GET, 0); }
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public NomvContext nomv() {
			return getRuleContext(NomvContext.class,0);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(GET);
				setState(187);
				q();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				nomv();
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(REIFY);
				setState(192);
				l();
				}
				break;
			case GET:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(GET);
				setState(194);
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
			setState(197);
			match(GET);
			setState(198);
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
		public TerminalNode KEYWORD() { return getToken(TransformationAlgebraParser.KEYWORD, 0); }
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(GET);
				setState(201);
				o();
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(KEYWORD);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(DEIFY);
				setState(206);
				sv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(PI1);
				setState(208);
				lint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(PI1);
				setState(210);
				lord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(PI1);
				setState(212);
				lnom();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(PI1);
				setState(214);
				lq();
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(PI1);
				setState(218);
				sint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(PI1);
				setState(220);
				sord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(PI1);
				setState(222);
				snom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(PI1);
				setState(224);
				lq();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(PI2);
				setState(226);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(PI1);
				setState(230);
				os();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(PI1);
				setState(232);
				oratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(PI1);
				setState(234);
				oint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(PI1);
				setState(236);
				oord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(PI1);
				setState(238);
				onom();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				match(PI1);
				setState(240);
				oq();
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
			setState(243);
			match(PI2);
			setState(244);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(PI2);
				setState(247);
				oratio();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(PI2);
				setState(249);
				lratio();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(PI1);
				setState(254);
				ints();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(PI2);
				setState(256);
				oint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(PI2);
				setState(258);
				lint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(PI1);
				setState(263);
				ords();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
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
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(PI1);
				setState(268);
				noms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(PI1);
				setState(273);
				qs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
		enterRule(_localctx, 44, RULE_sint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
		enterRule(_localctx, 46, RULE_snom);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATAAMOUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(DATAAMOUNT);
				}
				break;
			case DATAPM:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
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

	public static class OrdsContext extends ParserRuleContext {
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
		enterRule(_localctx, 48, RULE_ords);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(DATACONTOUR);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
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
		enterRule(_localctx, 50, RULE_os);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(SIGMAE2);
				setState(286);
				os();
				setState(287);
				match(WHITESPACE);
				setState(288);
				ov();
				}
				break;
			case DATAOBJS:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
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
		enterRule(_localctx, 52, RULE_ints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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

	public static class OcountContext extends ParserRuleContext {
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
		public OcountContext ocount() {
			return getRuleContext(OcountContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OvContext ov() {
			return getRuleContext(OvContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_ocount);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMAE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(SIGMAE2);
				setState(296);
				ocount();
				setState(297);
				match(WHITESPACE);
				setState(298);
				ov();
				}
				break;
			case DATAOBJCOUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		enterRule(_localctx, 56, RULE_lratio);
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

	public static class NomsContext extends ParserRuleContext {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			ords();
			}
		}
		catch (RecognitionException re) {
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
			setState(307);
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

	public static class OratioContext extends ParserRuleContext {
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public OratioContext oratio() {
			return getRuleContext(OratioContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public TerminalNode GROUPBY() { return getToken(TransformationAlgebraParser.GROUPBY, 0); }
		public TerminalNode AVG() { return getToken(TransformationAlgebraParser.AVG, 0); }
		public OratiooContext oratioo() {
			return getRuleContext(OratiooContext.class,0);
		}
		public TerminalNode DATAOBJQ() { return getToken(TransformationAlgebraParser.DATAOBJQ, 0); }
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
		enterRule(_localctx, 62, RULE_oratio);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOWTIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(BOWTIE);
				setState(310);
				oratio();
				setState(311);
				match(WHITESPACE);
				setState(312);
				o();
				}
				break;
			case GROUPBY:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(GROUPBY);
				setState(315);
				match(AVG);
				setState(316);
				oratioo();
				}
				break;
			case DATAOBJQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(DATAOBJQ);
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

	public static class OintContext extends ParserRuleContext {
		public TerminalNode SIGMASE2() { return getToken(TransformationAlgebraParser.SIGMASE2, 0); }
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
		public TerminalNode GROUPBY() { return getToken(TransformationAlgebraParser.GROUPBY, 0); }
		public TerminalNode AVG() { return getToken(TransformationAlgebraParser.AVG, 0); }
		public OintoContext ointo() {
			return getRuleContext(OintoContext.class,0);
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
		enterRule(_localctx, 64, RULE_oint);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(SIGMASE2);
				setState(321);
				oint();
				setState(322);
				match(WHITESPACE);
				setState(323);
				intv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(BOWTIE);
				setState(326);
				oint();
				setState(327);
				match(WHITESPACE);
				setState(328);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(GROUPBY);
				setState(331);
				match(AVG);
				setState(332);
				ointo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
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
		public TerminalNode SIGMASE2() { return getToken(TransformationAlgebraParser.SIGMASE2, 0); }
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
		public TerminalNode GROUPBY() { return getToken(TransformationAlgebraParser.GROUPBY, 0); }
		public AggordContext aggord() {
			return getRuleContext(AggordContext.class,0);
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
		enterRule(_localctx, 66, RULE_oord);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(SIGMASE2);
				setState(337);
				oord();
				setState(338);
				match(WHITESPACE);
				setState(339);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(BOWTIE);
				setState(342);
				oord();
				setState(343);
				match(WHITESPACE);
				setState(344);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(GROUPBY);
				setState(347);
				aggord();
				setState(348);
				oordo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
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
		enterRule(_localctx, 68, RULE_onom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			oord();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
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
		enterRule(_localctx, 70, RULE_oq);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(SIGMAE2);
				setState(356);
				oq();
				setState(357);
				match(WHITESPACE);
				setState(358);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(BOWTIE);
				setState(361);
				oq();
				setState(362);
				match(WHITESPACE);
				setState(363);
				o();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
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

	public static class LnomContext extends ParserRuleContext {
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
		enterRule(_localctx, 72, RULE_lnom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			lord();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SIGMASE2() { return getToken(TransformationAlgebraParser.SIGMASE2, 0); }
		public LintContext lint() {
			return getRuleContext(LintContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public IntvContext intv() {
			return getRuleContext(IntvContext.class,0);
		}
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode GROUPBY() { return getToken(TransformationAlgebraParser.GROUPBY, 0); }
		public TerminalNode AVG() { return getToken(TransformationAlgebraParser.AVG, 0); }
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
		enterRule(_localctx, 74, RULE_lint);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(INTERPOL);
				setState(371);
				sint();
				}
				break;
			case SIGMASE2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(SIGMASE2);
				setState(373);
				lint();
				setState(374);
				match(WHITESPACE);
				setState(375);
				intv();
				}
				break;
			case BOWTIE:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(BOWTIE);
				setState(378);
				lint();
				setState(379);
				match(WHITESPACE);
				setState(380);
				l();
				}
				break;
			case GROUPBY:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(GROUPBY);
				setState(383);
				match(AVG);
				setState(384);
				lintl();
				}
				break;
			case DATAFIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
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
		public TerminalNode SIGMASE2() { return getToken(TransformationAlgebraParser.SIGMASE2, 0); }
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
		public TerminalNode GROUPBY() { return getToken(TransformationAlgebraParser.GROUPBY, 0); }
		public AggordContext aggord() {
			return getRuleContext(AggordContext.class,0);
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
		enterRule(_localctx, 76, RULE_lord);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(SIGMASE2);
				setState(389);
				lord();
				setState(390);
				match(WHITESPACE);
				setState(391);
				ordv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(BOWTIE);
				setState(394);
				lord();
				setState(395);
				match(WHITESPACE);
				setState(396);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(GROUPBY);
				setState(399);
				aggord();
				setState(400);
				lordl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
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

	public static class LqContext extends ParserRuleContext {
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
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
		enterRule(_localctx, 78, RULE_lq);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(SIGMAE2);
				setState(406);
				lq();
				setState(407);
				match(WHITESPACE);
				setState(408);
				qv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(BOWTIE);
				setState(411);
				lq();
				setState(412);
				match(WHITESPACE);
				setState(413);
				l();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
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
		enterRule(_localctx, 80, RULE_sord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
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
		enterRule(_localctx, 82, RULE_sq);
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
		enterRule(_localctx, 84, RULE_oratioo);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ODIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(ODIST);
				setState(423);
				os();
				setState(424);
				match(WHITESPACE);
				setState(425);
				os();
				}
				break;
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(NDIST);
				setState(428);
				o();
				setState(429);
				match(WHITESPACE);
				setState(430);
				o();
				setState(431);
				match(WHITESPACE);
				setState(432);
				oratioo();
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
		enterRule(_localctx, 86, RULE_lratiol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(LDIST);
			setState(437);
			l();
			setState(438);
			match(WHITESPACE);
			setState(439);
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

	public static class LratiooContext extends ParserRuleContext {
		public TerminalNode LODIST() { return getToken(TransformationAlgebraParser.LODIST, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OContext o() {
			return getRuleContext(OContext.class,0);
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
		enterRule(_localctx, 88, RULE_lratioo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(LODIST);
			setState(442);
			l();
			setState(443);
			match(WHITESPACE);
			setState(444);
			o();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
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
		enterRule(_localctx, 90, RULE_onomo);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OTOPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(OTOPO);
				setState(447);
				os();
				setState(448);
				match(WHITESPACE);
				setState(449);
				os();
				}
				break;
			case SIGMAE2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(SIGMAE2);
				setState(452);
				onomo();
				setState(453);
				match(WHITESPACE);
				setState(454);
				nomv();
				}
				break;
			case SIGMASE2:
			case BOWTIE:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
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

	public static class LnomoContext extends ParserRuleContext {
		public TerminalNode LOTOPO() { return getToken(TransformationAlgebraParser.LOTOPO, 0); }
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(TransformationAlgebraParser.WHITESPACE, 0); }
		public OsContext os() {
			return getRuleContext(OsContext.class,0);
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
		enterRule(_localctx, 92, RULE_lnomo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(LOTOPO);
			setState(460);
			l();
			setState(461);
			match(WHITESPACE);
			setState(462);
			os();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
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
		enterRule(_localctx, 94, RULE_lintl);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOWTIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(BOWTIE);
				setState(465);
				lnoml();
				setState(466);
				match(WHITESPACE);
				setState(467);
				lint();
				}
				break;
			case LDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				lratiol();
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

	public static class LordlContext extends ParserRuleContext {
		public TerminalNode SIGMASE2() { return getToken(TransformationAlgebraParser.SIGMASE2, 0); }
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
		enterRule(_localctx, 96, RULE_lordl);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(SIGMASE2);
				setState(473);
				lordl();
				setState(474);
				match(WHITESPACE);
				setState(475);
				ordv();
				}
				break;
			case BOWTIE:
			case LDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
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
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
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
		enterRule(_localctx, 98, RULE_lnoml);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(SIGMAE2);
				setState(481);
				lnoml();
				setState(482);
				match(WHITESPACE);
				setState(483);
				nomv();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				lbooll();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
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
		public TerminalNode SIGMAE2() { return getToken(TransformationAlgebraParser.SIGMAE2, 0); }
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
		enterRule(_localctx, 100, RULE_lbooll);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LVIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(LVIS);
				setState(490);
				l();
				setState(491);
				match(WHITESPACE);
				setState(492);
				l();
				setState(493);
				match(WHITESPACE);
				setState(494);
				oint();
				}
				break;
			case SIGMAE2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(SIGMAE2);
				setState(497);
				lbooll();
				setState(498);
				match(WHITESPACE);
				setState(499);
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

	public static class OordoContext extends ParserRuleContext {
		public TerminalNode SIGMASE2() { return getToken(TransformationAlgebraParser.SIGMASE2, 0); }
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
		enterRule(_localctx, 102, RULE_oordo);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIGMASE2:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(SIGMASE2);
				setState(504);
				oordo();
				setState(505);
				match(WHITESPACE);
				setState(506);
				ordv();
				}
				break;
			case BOWTIE:
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
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

	public static class OintoContext extends ParserRuleContext {
		public TerminalNode BOWTIE() { return getToken(TransformationAlgebraParser.BOWTIE, 0); }
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
		enterRule(_localctx, 104, RULE_ointo);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOWTIE:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(BOWTIE);
				setState(512);
				onomo();
				setState(513);
				match(WHITESPACE);
				setState(514);
				oint();
				}
				break;
			case ODIST:
			case NDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				oratioo();
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

	public static class AggContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(TransformationAlgebraParser.AVG, 0); }
		public AggordContext aggord() {
			return getRuleContext(AggordContext.class,0);
		}
		public AggContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterAgg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitAgg(this);
		}
	}

	public final AggContext agg() throws RecognitionException {
		AggContext _localctx = new AggContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_agg);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(AVG);
				}
				break;
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				aggord();
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

	public static class AggordContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(TransformationAlgebraParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(TransformationAlgebraParser.MAX, 0); }
		public AggordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).enterAggord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TransformationAlgebraListener ) ((TransformationAlgebraListener)listener).exitAggord(this);
		}
	}

	public final AggordContext aggord() throws RecognitionException {
		AggordContext _localctx = new AggordContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_aggord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !(_la==MIN || _la==MAX) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0210\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\5\2t\n\2\3\3\3\3\3"+
		"\3\3\3\5\3z\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\5\5"+
		"\u0087\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00b6\n\t\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\3\13\5\13\u00c0\n\13"+
		"\3\f\3\f\3\f\3\f\5\f\u00c6\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u00ce\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00da\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e6\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00f4\n\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00fe\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0107\n\24\3\25\3\25\3\25\5\25\u010c\n\25\3"+
		"\26\3\26\3\26\5\26\u0111\n\26\3\27\3\27\3\27\5\27\u0116\n\27\3\30\3\30"+
		"\3\31\3\31\5\31\u011c\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0126\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0130\n\35\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0141\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0151\n\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0162\n#\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\5%\u0171\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0185\n\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0196\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\5)\u01a3\n)\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01b5"+
		"\n,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/"+
		"\u01cc\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01d9\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01e1\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u01ea\n\63\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01f8\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0200\n\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0208\n\66\3"+
		"\67\3\67\5\67\u020c\n\67\38\38\38\2\29\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\3\3\2\5\6\2"+
		"\u022f\2s\3\2\2\2\4y\3\2\2\2\6\u0080\3\2\2\2\b\u0086\3\2\2\2\n\u008d\3"+
		"\2\2\2\f\u009e\3\2\2\2\16\u00a8\3\2\2\2\20\u00b5\3\2\2\2\22\u00ba\3\2"+
		"\2\2\24\u00bf\3\2\2\2\26\u00c5\3\2\2\2\30\u00c7\3\2\2\2\32\u00cd\3\2\2"+
		"\2\34\u00d9\3\2\2\2\36\u00e5\3\2\2\2 \u00f3\3\2\2\2\"\u00f5\3\2\2\2$\u00fd"+
		"\3\2\2\2&\u0106\3\2\2\2(\u010b\3\2\2\2*\u0110\3\2\2\2,\u0115\3\2\2\2."+
		"\u0117\3\2\2\2\60\u011b\3\2\2\2\62\u011d\3\2\2\2\64\u0125\3\2\2\2\66\u0127"+
		"\3\2\2\28\u012f\3\2\2\2:\u0131\3\2\2\2<\u0133\3\2\2\2>\u0135\3\2\2\2@"+
		"\u0140\3\2\2\2B\u0150\3\2\2\2D\u0161\3\2\2\2F\u0163\3\2\2\2H\u0170\3\2"+
		"\2\2J\u0172\3\2\2\2L\u0184\3\2\2\2N\u0195\3\2\2\2P\u01a2\3\2\2\2R\u01a4"+
		"\3\2\2\2T\u01a6\3\2\2\2V\u01b4\3\2\2\2X\u01b6\3\2\2\2Z\u01bb\3\2\2\2\\"+
		"\u01cb\3\2\2\2^\u01cd\3\2\2\2`\u01d8\3\2\2\2b\u01e0\3\2\2\2d\u01e9\3\2"+
		"\2\2f\u01f7\3\2\2\2h\u01ff\3\2\2\2j\u0207\3\2\2\2l\u020b\3\2\2\2n\u020d"+
		"\3\2\2\2pt\5\4\3\2qt\5\6\4\2rt\5\b\5\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t"+
		"\3\3\2\2\2uz\5\34\17\2vz\5\36\20\2wz\5,\27\2xz\5 \21\2yu\3\2\2\2yv\3\2"+
		"\2\2yw\3\2\2\2yx\3\2\2\2z\5\3\2\2\2{\u0081\5P)\2|\u0081\5T+\2}\u0081\5"+
		"> \2~\u0081\5H%\2\177\u0081\5\64\33\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080"+
		"}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\7\3\2\2\2\u0082\u0087"+
		"\5\32\16\2\u0083\u0087\5\30\r\2\u0084\u0087\5\26\f\2\u0085\u0087\5\24"+
		"\13\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\t\3\2\2\2\u0088\u0089\7\13\2\2\u0089\u008e\5 \21"+
		"\2\u008a\u008b\7\t\2\2\u008b\u008e\5\"\22\2\u008c\u008e\7#\2\2\u008d\u0088"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008c\3\2\2\2\u008e\13\3\2\2\2\u008f"+
		"\u0090\7\n\2\2\u0090\u009f\5L\'\2\u0091\u0092\7\n\2\2\u0092\u009f\5\34"+
		"\17\2\u0093\u0094\7\f\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7$\2\2\u0096"+
		"\u0097\5\f\7\2\u0097\u009f\3\2\2\2\u0098\u0099\7\13\2\2\u0099\u009f\5"+
		"@!\2\u009a\u009b\7\t\2\2\u009b\u009f\5$\23\2\u009c\u009f\5\n\6\2\u009d"+
		"\u009f\7#\2\2\u009e\u008f\3\2\2\2\u009e\u0091\3\2\2\2\u009e\u0093\3\2"+
		"\2\2\u009e\u0098\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\r\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a9\5L\'\2"+
		"\u00a2\u00a3\7\4\2\2\u00a3\u00a9\5B\"\2\u00a4\u00a9\5\f\7\2\u00a5\u00a6"+
		"\7\t\2\2\u00a6\u00a9\5&\24\2\u00a7\u00a9\7#\2\2\u00a8\u00a0\3\2\2\2\u00a8"+
		"\u00a2\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\17\3\2\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00b6\5N(\2\u00ac\u00ad"+
		"\7\5\2\2\u00ad\u00b6\5N(\2\u00ae\u00af\7\6\2\2\u00af\u00b6\5D#\2\u00b0"+
		"\u00b1\7\5\2\2\u00b1\u00b6\5D#\2\u00b2\u00b3\7\t\2\2\u00b3\u00b6\5(\25"+
		"\2\u00b4\u00b6\5\16\b\2\u00b5\u00aa\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5"+
		"\u00ae\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\21\3\2\2\2\u00b7\u00bb\5\20\t\2\u00b8\u00b9\7\t\2\2\u00b9\u00bb"+
		"\5*\26\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\23\3\2\2\2\u00bc"+
		"\u00bd\7\t\2\2\u00bd\u00c0\5,\27\2\u00be\u00c0\5\22\n\2\u00bf\u00bc\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\25\3\2\2\2\u00c1\u00c2\7\7\2\2\u00c2"+
		"\u00c6\5\34\17\2\u00c3\u00c4\7\t\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00c1"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00c9\5\34\17\2\u00c9\31\3\2\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00ce\5 \21"+
		"\2\u00cc\u00ce\7%\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\33"+
		"\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0\u00da\5\26\f\2\u00d1\u00d2\7\16\2\2"+
		"\u00d2\u00da\5L\'\2\u00d3\u00d4\7\16\2\2\u00d4\u00da\5N(\2\u00d5\u00d6"+
		"\7\16\2\2\u00d6\u00da\5J&\2\u00d7\u00d8\7\16\2\2\u00d8\u00da\5P)\2\u00d9"+
		"\u00cf\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d5\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\35\3\2\2\2\u00db\u00dc\7\16\2\2\u00dc\u00e6"+
		"\5.\30\2\u00dd\u00de\7\16\2\2\u00de\u00e6\5R*\2\u00df\u00e0\7\16\2\2\u00e0"+
		"\u00e6\5\60\31\2\u00e1\u00e2\7\16\2\2\u00e2\u00e6\5P)\2\u00e3\u00e4\7"+
		"\17\2\2\u00e4\u00e6\5\64\33\2\u00e5\u00db\3\2\2\2\u00e5\u00dd\3\2\2\2"+
		"\u00e5\u00df\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\37"+
		"\3\2\2\2\u00e7\u00e8\7\16\2\2\u00e8\u00f4\5\64\33\2\u00e9\u00ea\7\16\2"+
		"\2\u00ea\u00f4\5@!\2\u00eb\u00ec\7\16\2\2\u00ec\u00f4\5B\"\2\u00ed\u00ee"+
		"\7\16\2\2\u00ee\u00f4\5D#\2\u00ef\u00f0\7\16\2\2\u00f0\u00f4\5F$\2\u00f1"+
		"\u00f2\7\16\2\2\u00f2\u00f4\5H%\2\u00f3\u00e7\3\2\2\2\u00f3\u00e9\3\2"+
		"\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f6\7\17\2\2\u00f6\u00f7\58\35\2"+
		"\u00f7#\3\2\2\2\u00f8\u00f9\7\17\2\2\u00f9\u00fe\5@!\2\u00fa\u00fb\7\17"+
		"\2\2\u00fb\u00fe\5:\36\2\u00fc\u00fe\5\"\22\2\u00fd\u00f8\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe%\3\2\2\2\u00ff\u0100\7\16\2\2"+
		"\u0100\u0107\5\66\34\2\u0101\u0102\7\17\2\2\u0102\u0107\5B\"\2\u0103\u0104"+
		"\7\17\2\2\u0104\u0107\5L\'\2\u0105\u0107\5$\23\2\u0106\u00ff\3\2\2\2\u0106"+
		"\u0101\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0105\3\2\2\2\u0107\'\3\2\2\2"+
		"\u0108\u0109\7\16\2\2\u0109\u010c\5\62\32\2\u010a\u010c\5&\24\2\u010b"+
		"\u0108\3\2\2\2\u010b\u010a\3\2\2\2\u010c)\3\2\2\2\u010d\u010e\7\16\2\2"+
		"\u010e\u0111\5<\37\2\u010f\u0111\5(\25\2\u0110\u010d\3\2\2\2\u0110\u010f"+
		"\3\2\2\2\u0111+\3\2\2\2\u0112\u0113\7\16\2\2\u0113\u0116\5> \2\u0114\u0116"+
		"\5*\26\2\u0115\u0112\3\2\2\2\u0115\u0114\3\2\2\2\u0116-\3\2\2\2\u0117"+
		"\u0118\7\33\2\2\u0118/\3\2\2\2\u0119\u011c\7\34\2\2\u011a\u011c\5.\30"+
		"\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\61\3\2\2\2\u011d\u011e"+
		"\7\35\2\2\u011e\63\3\2\2\2\u011f\u0120\7\20\2\2\u0120\u0121\5\64\33\2"+
		"\u0121\u0122\7$\2\2\u0122\u0123\5\32\16\2\u0123\u0126\3\2\2\2\u0124\u0126"+
		"\7\37\2\2\u0125\u011f\3\2\2\2\u0125\u0124\3\2\2\2\u0126\65\3\2\2\2\u0127"+
		"\u0128\7 \2\2\u0128\67\3\2\2\2\u0129\u012a\7\20\2\2\u012a\u012b\58\35"+
		"\2\u012b\u012c\7$\2\2\u012c\u012d\5\32\16\2\u012d\u0130\3\2\2\2\u012e"+
		"\u0130\7!\2\2\u012f\u0129\3\2\2\2\u012f\u012e\3\2\2\2\u01309\3\2\2\2\u0131"+
		"\u0132\7\"\2\2\u0132;\3\2\2\2\u0133\u0134\5\62\32\2\u0134=\3\2\2\2\u0135"+
		"\u0136\5<\37\2\u0136?\3\2\2\2\u0137\u0138\7\22\2\2\u0138\u0139\5@!\2\u0139"+
		"\u013a\7$\2\2\u013a\u013b\5 \21\2\u013b\u0141\3\2\2\2\u013c\u013d\7\23"+
		"\2\2\u013d\u013e\7\4\2\2\u013e\u0141\5V,\2\u013f\u0141\7\36\2\2\u0140"+
		"\u0137\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013f\3\2\2\2\u0141A\3\2\2\2"+
		"\u0142\u0143\7\21\2\2\u0143\u0144\5B\"\2\u0144\u0145\7$\2\2\u0145\u0146"+
		"\5\16\b\2\u0146\u0151\3\2\2\2\u0147\u0148\7\22\2\2\u0148\u0149\5B\"\2"+
		"\u0149\u014a\7$\2\2\u014a\u014b\5 \21\2\u014b\u0151\3\2\2\2\u014c\u014d"+
		"\7\23\2\2\u014d\u014e\7\4\2\2\u014e\u0151\5j\66\2\u014f\u0151\5@!\2\u0150"+
		"\u0142\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u014c\3\2\2\2\u0150\u014f\3\2"+
		"\2\2\u0151C\3\2\2\2\u0152\u0153\7\21\2\2\u0153\u0154\5D#\2\u0154\u0155"+
		"\7$\2\2\u0155\u0156\5\20\t\2\u0156\u0162\3\2\2\2\u0157\u0158\7\22\2\2"+
		"\u0158\u0159\5D#\2\u0159\u015a\7$\2\2\u015a\u015b\5 \21\2\u015b\u0162"+
		"\3\2\2\2\u015c\u015d\7\23\2\2\u015d\u015e\5n8\2\u015e\u015f\5h\65\2\u015f"+
		"\u0162\3\2\2\2\u0160\u0162\5B\"\2\u0161\u0152\3\2\2\2\u0161\u0157\3\2"+
		"\2\2\u0161\u015c\3\2\2\2\u0161\u0160\3\2\2\2\u0162E\3\2\2\2\u0163\u0164"+
		"\5D#\2\u0164G\3\2\2\2\u0165\u0166\7\20\2\2\u0166\u0167\5H%\2\u0167\u0168"+
		"\7$\2\2\u0168\u0169\5\24\13\2\u0169\u0171\3\2\2\2\u016a\u016b\7\22\2\2"+
		"\u016b\u016c\5H%\2\u016c\u016d\7$\2\2\u016d\u016e\5 \21\2\u016e\u0171"+
		"\3\2\2\2\u016f\u0171\5F$\2\u0170\u0165\3\2\2\2\u0170\u016a\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171I\3\2\2\2\u0172\u0173\5N(\2\u0173K\3\2\2\2\u0174\u0175"+
		"\7\r\2\2\u0175\u0185\5.\30\2\u0176\u0177\7\21\2\2\u0177\u0178\5L\'\2\u0178"+
		"\u0179\7$\2\2\u0179\u017a\5\16\b\2\u017a\u0185\3\2\2\2\u017b\u017c\7\22"+
		"\2\2\u017c\u017d\5L\'\2\u017d\u017e\7$\2\2\u017e\u017f\5\34\17\2\u017f"+
		"\u0185\3\2\2\2\u0180\u0181\7\23\2\2\u0181\u0182\7\4\2\2\u0182\u0185\5"+
		"`\61\2\u0183\u0185\5:\36\2\u0184\u0174\3\2\2\2\u0184\u0176\3\2\2\2\u0184"+
		"\u017b\3\2\2\2\u0184\u0180\3\2\2\2\u0184\u0183\3\2\2\2\u0185M\3\2\2\2"+
		"\u0186\u0187\7\21\2\2\u0187\u0188\5N(\2\u0188\u0189\7$\2\2\u0189\u018a"+
		"\5\20\t\2\u018a\u0196\3\2\2\2\u018b\u018c\7\22\2\2\u018c\u018d\5N(\2\u018d"+
		"\u018e\7$\2\2\u018e\u018f\5\34\17\2\u018f\u0196\3\2\2\2\u0190\u0191\7"+
		"\23\2\2\u0191\u0192\5n8\2\u0192\u0193\5b\62\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0196\5L\'\2\u0195\u0186\3\2\2\2\u0195\u018b\3\2\2\2\u0195\u0190\3\2"+
		"\2\2\u0195\u0194\3\2\2\2\u0196O\3\2\2\2\u0197\u0198\7\20\2\2\u0198\u0199"+
		"\5P)\2\u0199\u019a\7$\2\2\u019a\u019b\5\24\13\2\u019b\u01a3\3\2\2\2\u019c"+
		"\u019d\7\22\2\2\u019d\u019e\5P)\2\u019e\u019f\7$\2\2\u019f\u01a0\5\34"+
		"\17\2\u01a0\u01a3\3\2\2\2\u01a1\u01a3\5J&\2\u01a2\u0197\3\2\2\2\u01a2"+
		"\u019c\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3Q\3\2\2\2\u01a4\u01a5\5.\30\2"+
		"\u01a5S\3\2\2\2\u01a6\u01a7\5\60\31\2\u01a7U\3\2\2\2\u01a8\u01a9\7\24"+
		"\2\2\u01a9\u01aa\5\64\33\2\u01aa\u01ab\7$\2\2\u01ab\u01ac\5\64\33\2\u01ac"+
		"\u01b5\3\2\2\2\u01ad\u01ae\7\31\2\2\u01ae\u01af\5 \21\2\u01af\u01b0\7"+
		"$\2\2\u01b0\u01b1\5 \21\2\u01b1\u01b2\7$\2\2\u01b2\u01b3\5V,\2\u01b3\u01b5"+
		"\3\2\2\2\u01b4\u01a8\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b5W\3\2\2\2\u01b6"+
		"\u01b7\7\25\2\2\u01b7\u01b8\5\34\17\2\u01b8\u01b9\7$\2\2\u01b9\u01ba\5"+
		"\34\17\2\u01baY\3\2\2\2\u01bb\u01bc\7\26\2\2\u01bc\u01bd\5\34\17\2\u01bd"+
		"\u01be\7$\2\2\u01be\u01bf\5 \21\2\u01bf[\3\2\2\2\u01c0\u01c1\7\27\2\2"+
		"\u01c1\u01c2\5\64\33\2\u01c2\u01c3\7$\2\2\u01c3\u01c4\5\64\33\2\u01c4"+
		"\u01cc\3\2\2\2\u01c5\u01c6\7\20\2\2\u01c6\u01c7\5\\/\2\u01c7\u01c8\7$"+
		"\2\2\u01c8\u01c9\5\22\n\2\u01c9\u01cc\3\2\2\2\u01ca\u01cc\5h\65\2\u01cb"+
		"\u01c0\3\2\2\2\u01cb\u01c5\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc]\3\2\2\2"+
		"\u01cd\u01ce\7\30\2\2\u01ce\u01cf\5\34\17\2\u01cf\u01d0\7$\2\2\u01d0\u01d1"+
		"\5\64\33\2\u01d1_\3\2\2\2\u01d2\u01d3\7\22\2\2\u01d3\u01d4\5d\63\2\u01d4"+
		"\u01d5\7$\2\2\u01d5\u01d6\5L\'\2\u01d6\u01d9\3\2\2\2\u01d7\u01d9\5X-\2"+
		"\u01d8\u01d2\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9a\3\2\2\2\u01da\u01db\7"+
		"\21\2\2\u01db\u01dc\5b\62\2\u01dc\u01dd\7$\2\2\u01dd\u01de\5\20\t\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01e1\5`\61\2\u01e0\u01da\3\2\2\2\u01e0\u01df\3\2"+
		"\2\2\u01e1c\3\2\2\2\u01e2\u01e3\7\20\2\2\u01e3\u01e4\5d\63\2\u01e4\u01e5"+
		"\7$\2\2\u01e5\u01e6\5\22\n\2\u01e6\u01ea\3\2\2\2\u01e7\u01ea\5f\64\2\u01e8"+
		"\u01ea\5b\62\2\u01e9\u01e2\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2"+
		"\2\2\u01eae\3\2\2\2\u01eb\u01ec\7\32\2\2\u01ec\u01ed\5\34\17\2\u01ed\u01ee"+
		"\7$\2\2\u01ee\u01ef\5\34\17\2\u01ef\u01f0\7$\2\2\u01f0\u01f1\5B\"\2\u01f1"+
		"\u01f8\3\2\2\2\u01f2\u01f3\7\20\2\2\u01f3\u01f4\5f\64\2\u01f4\u01f5\7"+
		"$\2\2\u01f5\u01f6\7\3\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7"+
		"\u01f2\3\2\2\2\u01f8g\3\2\2\2\u01f9\u01fa\7\21\2\2\u01fa\u01fb\5h\65\2"+
		"\u01fb\u01fc\7$\2\2\u01fc\u01fd\5\20\t\2\u01fd\u0200\3\2\2\2\u01fe\u0200"+
		"\5j\66\2\u01ff\u01f9\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200i\3\2\2\2\u0201"+
		"\u0202\7\22\2\2\u0202\u0203\5\\/\2\u0203\u0204\7$\2\2\u0204\u0205\5B\""+
		"\2\u0205\u0208\3\2\2\2\u0206\u0208\5V,\2\u0207\u0201\3\2\2\2\u0207\u0206"+
		"\3\2\2\2\u0208k\3\2\2\2\u0209\u020c\7\4\2\2\u020a\u020c\5n8\2\u020b\u0209"+
		"\3\2\2\2\u020b\u020a\3\2\2\2\u020cm\3\2\2\2\u020d\u020e\t\2\2\2\u020e"+
		"o\3\2\2\2)sy\u0080\u0086\u008d\u009e\u00a8\u00b5\u00ba\u00bf\u00c5\u00cd"+
		"\u00d9\u00e5\u00f3\u00fd\u0106\u010b\u0110\u0115\u011b\u0125\u012f\u0140"+
		"\u0150\u0161\u0170\u0184\u0195\u01a2\u01b4\u01cb\u01d8\u01e0\u01e9\u01f7"+
		"\u01ff\u0207\u020b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}