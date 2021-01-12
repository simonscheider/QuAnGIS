// Generated from TransformationAlgebraH.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransformationAlgebraLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RATIO", "EQUAL", "LEQ", "AVG", "MIN", "MAX", "COUNT", "SIZE", "MERGE", 
			"REIFY", "DEIFY", "GET", "INVERT", "REVERT", "FCONT", "OCONT", "PI1", 
			"PI2", "PI3", "SIGMAE", "SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", 
			"GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", 
			"GROUPBYCOUNT", "INTERPOL", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", 
			"NDIST", "LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
			"DATAOBJV", "DATACONTOURLINE", "DATAOBJCOUNT", "DATAFIELD", "TOPOV", 
			"SV", "COUNTV", "RATIOV", "INTV", "ORDV", "BOOLV", "NOMV", "DATAV", "WHITESPACE", 
			"KEYWORD", "WS"
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


	public TransformationAlgebraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TransformationAlgebraH.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u028a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0260\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u026b\n\67\38\38\38\38\38\38\38\38\38\38\38\39\69\u0279\n9\r9\169\u027a"+
		"\3:\3:\3;\6;\u0280\n;\r;\16;\u0281\3<\6<\u0285\n<\r<\16<\u0286\3<\3<\2"+
		"\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=\3\2\5\3\2\62;\7\2//\62<C\\aac|\5\2\13\f\17\17\"\"\2\u028e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5"+
		"\u0080\3\2\2\2\7\u0082\3\2\2\2\t\u0085\3\2\2\2\13\u008a\3\2\2\2\r\u008f"+
		"\3\2\2\2\17\u0094\3\2\2\2\21\u009b\3\2\2\2\23\u00a1\3\2\2\2\25\u00a8\3"+
		"\2\2\2\27\u00af\3\2\2\2\31\u00b6\3\2\2\2\33\u00bb\3\2\2\2\35\u00c3\3\2"+
		"\2\2\37\u00cb\3\2\2\2!\u00d2\3\2\2\2#\u00d9\3\2\2\2%\u00de\3\2\2\2\'\u00e3"+
		"\3\2\2\2)\u00e8\3\2\2\2+\u00f0\3\2\2\2-\u00f9\3\2\2\2/\u0101\3\2\2\2\61"+
		"\u010a\3\2\2\2\63\u0118\3\2\2\2\65\u0125\3\2\2\2\67\u0132\3\2\2\29\u013f"+
		"\3\2\2\2;\u014c\3\2\2\2=\u015a\3\2\2\2?\u0169\3\2\2\2A\u0173\3\2\2\2C"+
		"\u017a\3\2\2\2E\u0181\3\2\2\2G\u0189\3\2\2\2I\u0190\3\2\2\2K\u0198\3\2"+
		"\2\2M\u019f\3\2\2\2O\u01a5\3\2\2\2Q\u01b6\3\2\2\2S\u01c7\3\2\2\2U\u01d2"+
		"\3\2\2\2W\u01dd\3\2\2\2Y\u01ee\3\2\2\2[\u01f8\3\2\2\2]\u0207\3\2\2\2_"+
		"\u0217\3\2\2\2a\u0220\3\2\2\2c\u0223\3\2\2\2e\u022d\3\2\2\2g\u0236\3\2"+
		"\2\2i\u023f\3\2\2\2k\u025f\3\2\2\2m\u026a\3\2\2\2o\u026c\3\2\2\2q\u0278"+
		"\3\2\2\2s\u027c\3\2\2\2u\u027f\3\2\2\2w\u0284\3\2\2\2yz\7t\2\2z{\7c\2"+
		"\2{|\7v\2\2|}\7k\2\2}~\7q\2\2~\177\7\"\2\2\177\4\3\2\2\2\u0080\u0081\7"+
		"?\2\2\u0081\6\3\2\2\2\u0082\u0083\7>\2\2\u0083\u0084\7?\2\2\u0084\b\3"+
		"\2\2\2\u0085\u0086\7c\2\2\u0086\u0087\7x\2\2\u0087\u0088\7i\2\2\u0088"+
		"\u0089\7\"\2\2\u0089\n\3\2\2\2\u008a\u008b\7o\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008e\7\"\2\2\u008e\f\3\2\2\2\u008f\u0090\7o\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7z\2\2\u0092\u0093\7\"\2\2\u0093\16\3\2\2\2"+
		"\u0094\u0095\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7w\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7v\2\2\u0099\u009a\7\"\2\2\u009a\20\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7k\2\2\u009d\u009e\7|\2\2\u009e\u009f\7g\2\2"+
		"\u009f\u00a0\7\"\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7"+
		"g\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7\"\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7k\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7{\2\2\u00ad\u00ae\7\"\2"+
		"\2\u00ae\26\3\2\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7k\2\2\u00b2\u00b3\7h\2\2\u00b3\u00b4\7{\2\2\u00b4\u00b5\7\"\2\2\u00b5"+
		"\30\3\2\2\2\u00b6\u00b7\7i\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7\"\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd\u00be\7x\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7\"\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2"+
		"\u00c8\u00c9\7v\2\2\u00c9\u00ca\7\"\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7"+
		"h\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7\"\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7e\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"\u00d8\7\"\2\2\u00d8\"\3\2\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7\63\2\2\u00dc\u00dd\7\"\2\2\u00dd$\3\2\2\2\u00de\u00df\7r\2\2"+
		"\u00df\u00e0\7k\2\2\u00e0\u00e1\7\64\2\2\u00e1\u00e2\7\"\2\2\u00e2&\3"+
		"\2\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7\65\2\2\u00e6"+
		"\u00e7\7\"\2\2\u00e7(\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7k\2\2\u00ea"+
		"\u00eb\7i\2\2\u00eb\u00ec\7o\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7g\2\2"+
		"\u00ee\u00ef\7\"\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7k"+
		"\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7n\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7\"\2\2\u00f8,\3\2\2\2\u00f9\u00fa"+
		"\7d\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7y\2\2\u00fc\u00fd\7v\2\2\u00fd"+
		"\u00fe\7k\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7\"\2\2\u0100.\3\2\2\2\u0101"+
		"\u0102\7d\2\2\u0102\u0103\7q\2\2\u0103\u0104\7y\2\2\u0104\u0105\7v\2\2"+
		"\u0105\u0106\7k\2\2\u0106\u0107\7g\2\2\u0107\u0108\7,\2\2\u0108\u0109"+
		"\7\"\2\2\u0109\60\3\2\2\2\u010a\u010b\7d\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7y\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2\u010f\u0110\7g\2\2"+
		"\u0110\u0111\7a\2\2\u0111\u0112\7t\2\2\u0112\u0113\7c\2\2\u0113\u0114"+
		"\7v\2\2\u0114\u0115\7k\2\2\u0115\u0116\7q\2\2\u0116\u0117\7\"\2\2\u0117"+
		"\62\3\2\2\2\u0118\u0119\7i\2\2\u0119\u011a\7t\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7w\2\2\u011c\u011d\7r\2\2\u011d\u011e\7d\2\2\u011e\u011f\7{\2\2"+
		"\u011f\u0120\7a\2\2\u0120\u0121\7c\2\2\u0121\u0122\7x\2\2\u0122\u0123"+
		"\7i\2\2\u0123\u0124\7\"\2\2\u0124\64\3\2\2\2\u0125\u0126\7i\2\2\u0126"+
		"\u0127\7t\2\2\u0127\u0128\7q\2\2\u0128\u0129\7w\2\2\u0129\u012a\7r\2\2"+
		"\u012a\u012b\7d\2\2\u012b\u012c\7{\2\2\u012c\u012d\7a\2\2\u012d\u012e"+
		"\7u\2\2\u012e\u012f\7w\2\2\u012f\u0130\7o\2\2\u0130\u0131\7\"\2\2\u0131"+
		"\66\3\2\2\2\u0132\u0133\7i\2\2\u0133\u0134\7t\2\2\u0134\u0135\7q\2\2\u0135"+
		"\u0136\7w\2\2\u0136\u0137\7r\2\2\u0137\u0138\7d\2\2\u0138\u0139\7{\2\2"+
		"\u0139\u013a\7a\2\2\u013a\u013b\7o\2\2\u013b\u013c\7k\2\2\u013c\u013d"+
		"\7p\2\2\u013d\u013e\7\"\2\2\u013e8\3\2\2\2\u013f\u0140\7i\2\2\u0140\u0141"+
		"\7t\2\2\u0141\u0142\7q\2\2\u0142\u0143\7w\2\2\u0143\u0144\7r\2\2\u0144"+
		"\u0145\7d\2\2\u0145\u0146\7{\2\2\u0146\u0147\7a\2\2\u0147\u0148\7o\2\2"+
		"\u0148\u0149\7c\2\2\u0149\u014a\7z\2\2\u014a\u014b\7\"\2\2\u014b:\3\2"+
		"\2\2\u014c\u014d\7i\2\2\u014d\u014e\7t\2\2\u014e\u014f\7q\2\2\u014f\u0150"+
		"\7w\2\2\u0150\u0151\7r\2\2\u0151\u0152\7d\2\2\u0152\u0153\7{\2\2\u0153"+
		"\u0154\7a\2\2\u0154\u0155\7u\2\2\u0155\u0156\7k\2\2\u0156\u0157\7|\2\2"+
		"\u0157\u0158\7g\2\2\u0158\u0159\7\"\2\2\u0159<\3\2\2\2\u015a\u015b\7i"+
		"\2\2\u015b\u015c\7t\2\2\u015c\u015d\7q\2\2\u015d\u015e\7w\2\2\u015e\u015f"+
		"\7r\2\2\u015f\u0160\7d\2\2\u0160\u0161\7{\2\2\u0161\u0162\7a\2\2\u0162"+
		"\u0163\7e\2\2\u0163\u0164\7q\2\2\u0164\u0165\7w\2\2\u0165\u0166\7p\2\2"+
		"\u0166\u0167\7v\2\2\u0167\u0168\7\"\2\2\u0168>\3\2\2\2\u0169\u016a\7k"+
		"\2\2\u016a\u016b\7p\2\2\u016b\u016c\7v\2\2\u016c\u016d\7g\2\2\u016d\u016e"+
		"\7t\2\2\u016e\u016f\7r\2\2\u016f\u0170\7q\2\2\u0170\u0171\7n\2\2\u0171"+
		"\u0172\7\"\2\2\u0172@\3\2\2\2\u0173\u0174\7q\2\2\u0174\u0175\7f\2\2\u0175"+
		"\u0176\7k\2\2\u0176\u0177\7u\2\2\u0177\u0178\7v\2\2\u0178\u0179\7\"\2"+
		"\2\u0179B\3\2\2\2\u017a\u017b\7n\2\2\u017b\u017c\7f\2\2\u017c\u017d\7"+
		"k\2\2\u017d\u017e\7u\2\2\u017e\u017f\7v\2\2\u017f\u0180\7\"\2\2\u0180"+
		"D\3\2\2\2\u0181\u0182\7n\2\2\u0182\u0183\7q\2\2\u0183\u0184\7f\2\2\u0184"+
		"\u0185\7k\2\2\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2\u0187\u0188\7\"\2"+
		"\2\u0188F\3\2\2\2\u0189\u018a\7q\2\2\u018a\u018b\7v\2\2\u018b\u018c\7"+
		"q\2\2\u018c\u018d\7r\2\2\u018d\u018e\7q\2\2\u018e\u018f\7\"\2\2\u018f"+
		"H\3\2\2\2\u0190\u0191\7n\2\2\u0191\u0192\7q\2\2\u0192\u0193\7v\2\2\u0193"+
		"\u0194\7q\2\2\u0194\u0195\7r\2\2\u0195\u0196\7q\2\2\u0196\u0197\7\"\2"+
		"\2\u0197J\3\2\2\2\u0198\u0199\7p\2\2\u0199\u019a\7f\2\2\u019a\u019b\7"+
		"k\2\2\u019b\u019c\7u\2\2\u019c\u019d\7v\2\2\u019d\u019e\7\"\2\2\u019e"+
		"L\3\2\2\2\u019f\u01a0\7n\2\2\u01a0\u01a1\7x\2\2\u01a1\u01a2\7k\2\2\u01a2"+
		"\u01a3\7u\2\2\u01a3\u01a4\7\"\2\2\u01a4N\3\2\2\2\u01a5\u01a6\7r\2\2\u01a6"+
		"\u01a7\7q\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7v\2\2"+
		"\u01aa\u01ab\7o\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae"+
		"\7u\2\2\u01ae\u01af\7w\2\2\u01af\u01b0\7t\2\2\u01b0\u01b1\7g\2\2\u01b1"+
		"\u01b2\7u\2\2\u01b2\u01b3\7\"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5u;"+
		"\2\u01b5P\3\2\2\2\u01b6\u01b7\7c\2\2\u01b7\u01b8\7o\2\2\u01b8\u01b9\7"+
		"q\2\2\u01b9\u01ba\7w\2\2\u01ba\u01bb\7p\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd"+
		"\7r\2\2\u01bd\u01be\7c\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7e\2\2\u01c0"+
		"\u01c1\7j\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4\7\"\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\5u;\2\u01c6R\3\2\2\2\u01c7\u01c8\7"+
		"e\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc"+
		"\7q\2\2\u01cc\u01cd\7w\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7\"\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\5u;\2\u01d1T\3\2\2\2\u01d2\u01d3\7q\2\2\u01d3"+
		"\u01d4\7d\2\2\u01d4\u01d5\7l\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7e\2\2"+
		"\u01d7\u01d8\7v\2\2\u01d8\u01d9\7u\2\2\u01d9\u01da\7\"\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dc\5u;\2\u01dcV\3\2\2\2\u01dd\u01de\7q\2\2\u01de\u01df"+
		"\7d\2\2\u01df\u01e0\7l\2\2\u01e0\u01e1\7g\2\2\u01e1\u01e2\7e\2\2\u01e2"+
		"\u01e3\7v\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7g\2\2\u01e5\u01e6\7i\2\2"+
		"\u01e6\u01e7\7k\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7p\2\2\u01e9\u01ea"+
		"\7u\2\2\u01ea\u01eb\7\"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5u;\2\u01ed"+
		"X\3\2\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0\7d\2\2\u01f0\u01f1\7l\2\2\u01f1"+
		"\u01f2\7g\2\2\u01f2\u01f3\7e\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7\"\2"+
		"\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\5u;\2\u01f7Z\3\2\2\2\u01f8\u01f9\7"+
		"e\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd"+
		"\7q\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7n\2\2\u0200"+
		"\u0201\7k\2\2\u0201\u0202\7p\2\2\u0202\u0203\7g\2\2\u0203\u0204\7\"\2"+
		"\2\u0204\u0205\3\2\2\2\u0205\u0206\5u;\2\u0206\\\3\2\2\2\u0207\u0208\7"+
		"q\2\2\u0208\u0209\7d\2\2\u0209\u020a\7l\2\2\u020a\u020b\7g\2\2\u020b\u020c"+
		"\7e\2\2\u020c\u020d\7v\2\2\u020d\u020e\7e\2\2\u020e\u020f\7q\2\2\u020f"+
		"\u0210\7w\2\2\u0210\u0211\7p\2\2\u0211\u0212\7v\2\2\u0212\u0213\7u\2\2"+
		"\u0213\u0214\7\"\2\2\u0214\u0215\3\2\2\2\u0215\u0216\5u;\2\u0216^\3\2"+
		"\2\2\u0217\u0218\7h\2\2\u0218\u0219\7k\2\2\u0219\u021a\7g\2\2\u021a\u021b"+
		"\7n\2\2\u021b\u021c\7f\2\2\u021c\u021d\7\"\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\5u;\2\u021f`\3\2\2\2\u0220\u0221\7k\2\2\u0221\u0222\7p\2\2\u0222"+
		"b\3\2\2\2\u0223\u0224\7t\2\2\u0224\u0225\7g\2\2\u0225\u0226\7i\2\2\u0226"+
		"\u0227\7k\2\2\u0227\u0228\7q\2\2\u0228\u0229\7p\2\2\u0229\u022a\7\"\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022c\5q9\2\u022cd\3\2\2\2\u022d\u022e\7"+
		"e\2\2\u022e\u022f\7q\2\2\u022f\u0230\7w\2\2\u0230\u0231\7p\2\2\u0231\u0232"+
		"\7v\2\2\u0232\u0233\7\"\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5q9\2\u0235"+
		"f\3\2\2\2\u0236\u0237\7t\2\2\u0237\u0238\7c\2\2\u0238\u0239\7v\2\2\u0239"+
		"\u023a\7k\2\2\u023a\u023b\7q\2\2\u023b\u023c\7\"\2\2\u023c\u023d\3\2\2"+
		"\2\u023d\u023e\5q9\2\u023eh\3\2\2\2\u023f\u0240\7k\2\2\u0240\u0241\7p"+
		"\2\2\u0241\u0242\7v\2\2\u0242\u0243\7g\2\2\u0243\u0244\7t\2\2\u0244\u0245"+
		"\7x\2\2\u0245\u0246\7c\2\2\u0246\u0247\7n\2\2\u0247\u0248\7\"\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024a\5q9\2\u024aj\3\2\2\2\u024b\u024c\7q\2\2\u024c"+
		"\u024d\7t\2\2\u024d\u024e\7f\2\2\u024e\u024f\7k\2\2\u024f\u0250\7p\2\2"+
		"\u0250\u0251\7c\2\2\u0251\u0252\7n\2\2\u0252\u0253\7\"\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\u0260\5q9\2\u0255\u0256\7q\2\2\u0256\u0257\7t\2\2\u0257"+
		"\u0258\7f\2\2\u0258\u0259\7k\2\2\u0259\u025a\7p\2\2\u025a\u025b\7c\2\2"+
		"\u025b\u025c\7n\2\2\u025c\u025d\7\"\2\2\u025d\u025e\3\2\2\2\u025e\u0260"+
		"\5u;\2\u025f\u024b\3\2\2\2\u025f\u0255\3\2\2\2\u0260l\3\2\2\2\u0261\u0262"+
		"\7v\2\2\u0262\u0263\7t\2\2\u0263\u0264\7w\2\2\u0264\u026b\7g\2\2\u0265"+
		"\u0266\7h\2\2\u0266\u0267\7c\2\2\u0267\u0268\7n\2\2\u0268\u0269\7u\2\2"+
		"\u0269\u026b\7g\2\2\u026a\u0261\3\2\2\2\u026a\u0265\3\2\2\2\u026bn\3\2"+
		"\2\2\u026c\u026d\7p\2\2\u026d\u026e\7q\2\2\u026e\u026f\7o\2\2\u026f\u0270"+
		"\7k\2\2\u0270\u0271\7p\2\2\u0271\u0272\7c\2\2\u0272\u0273\7n\2\2\u0273"+
		"\u0274\7\"\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5u;\2\u0276p\3\2\2\2\u0277"+
		"\u0279\t\2\2\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027br\3\2\2\2\u027c\u027d\7\"\2\2\u027dt\3\2"+
		"\2\2\u027e\u0280\t\3\2\2\u027f\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282v\3\2\2\2\u0283\u0285\t\4\2\2"+
		"\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\b<\2\2\u0289x\3\2\2\2\t\2\u025f"+
		"\u026a\u027a\u027f\u0281\u0286\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}