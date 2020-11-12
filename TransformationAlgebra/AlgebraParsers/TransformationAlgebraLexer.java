// Generated from TransformationAlgebra.g4 by ANTLR 4.8
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
		RATIO=1, AVG=2, MIN=3, MAX=4, COUNT=5, SIZE=6, MERGE=7, REIFY=8, DEIFY=9, 
		GET=10, INVERT=11, REVERT=12, FCONT=13, OCONT=14, PI1=15, PI2=16, SIGMAE=17, 
		SIGMASE=18, BOWTIE=19, BOWTIESTAR=20, BOWTIERATIO=21, GROUPBYAVG=22, GROUPBYSUM=23, 
		GROUPBYMIN=24, GROUPBYMAX=25, GROUPBYSIZE=26, GROUPBYCOUNT=27, INTERPOL=28, 
		ODIST=29, LDIST=30, LODIST=31, OTOPO=32, LOTOPO=33, NDIST=34, LVIS=35, 
		DATAPM=36, DATAAMOUNT=37, DATACONTOUR=38, DATAOBJQ=39, DATAOBJS=40, DATAOBJV=41, 
		DATACONTOURLINE=42, DATAOBJCOUNT=43, DATAFIELD=44, TOPOV=45, COUNTV=46, 
		RATIOV=47, INTV=48, ORDV=49, BOOLV=50, NOMV=51, DATAV=52, WHITESPACE=53, 
		KEYWORD=54, WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RATIO", "AVG", "MIN", "MAX", "COUNT", "SIZE", "MERGE", "REIFY", "DEIFY", 
			"GET", "INVERT", "REVERT", "FCONT", "OCONT", "PI1", "PI2", "SIGMAE", 
			"SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", "GROUPBYAVG", "GROUPBYSUM", 
			"GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", "GROUPBYCOUNT", "INTERPOL", 
			"ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", "DATAPM", 
			"DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATAOBJV", "DATACONTOURLINE", 
			"DATAOBJCOUNT", "DATAFIELD", "TOPOV", "COUNTV", "RATIOV", "INTV", "ORDV", 
			"BOOLV", "NOMV", "DATAV", "WHITESPACE", "KEYWORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ratio '", "'avg '", "'min '", "'max '", "'count '", "'size '", 
			"'merge '", "'reify '", "'deify '", "'get '", "'invert '", "'revert '", 
			"'fcont '", "'ocont '", "'pi1 '", "'pi2 '", "'sigmae '", "'sigmale '", 
			"'bowtie '", "'bowtie* '", "'bowtie_ratio '", "'groupby_avg '", "'groupby_sum '", 
			"'groupby_min '", "'groupby_max '", "'groupby_size '", "'groupby_count '", 
			"'interpol '", "'odist '", "'ldist '", "'lodist '", "'otopo '", "'lotopo '", 
			"'ndist '", "'lvis '", null, null, null, null, null, null, null, null, 
			null, "'in'", null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RATIO", "AVG", "MIN", "MAX", "COUNT", "SIZE", "MERGE", "REIFY", 
			"DEIFY", "GET", "INVERT", "REVERT", "FCONT", "OCONT", "PI1", "PI2", "SIGMAE", 
			"SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", "GROUPBYAVG", "GROUPBYSUM", 
			"GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", "GROUPBYCOUNT", "INTERPOL", 
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


	public TransformationAlgebraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TransformationAlgebra.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u026e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u0244\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u024f\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\6\65\u025d\n\65\r\65\16\65\u025e\3\66\3\66\3\67\6"+
		"\67\u0264\n\67\r\67\16\67\u0265\38\68\u0269\n8\r8\168\u026a\38\38\2\2"+
		"9\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9\3\2\5\3\2\62;\7\2//\62<C\\aac|\5\2\13\f\17\17\"\"\2\u0272\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\3q\3\2\2\2\5x\3\2\2\2\7}\3\2\2\2\t\u0082\3\2\2\2\13\u0087\3\2\2\2\r"+
		"\u008e\3\2\2\2\17\u0094\3\2\2\2\21\u009b\3\2\2\2\23\u00a2\3\2\2\2\25\u00a9"+
		"\3\2\2\2\27\u00ae\3\2\2\2\31\u00b6\3\2\2\2\33\u00be\3\2\2\2\35\u00c5\3"+
		"\2\2\2\37\u00cc\3\2\2\2!\u00d1\3\2\2\2#\u00d6\3\2\2\2%\u00de\3\2\2\2\'"+
		"\u00e7\3\2\2\2)\u00ef\3\2\2\2+\u00f8\3\2\2\2-\u0106\3\2\2\2/\u0113\3\2"+
		"\2\2\61\u0120\3\2\2\2\63\u012d\3\2\2\2\65\u013a\3\2\2\2\67\u0148\3\2\2"+
		"\29\u0157\3\2\2\2;\u0161\3\2\2\2=\u0168\3\2\2\2?\u016f\3\2\2\2A\u0177"+
		"\3\2\2\2C\u017e\3\2\2\2E\u0186\3\2\2\2G\u018d\3\2\2\2I\u0193\3\2\2\2K"+
		"\u01a4\3\2\2\2M\u01b5\3\2\2\2O\u01c0\3\2\2\2Q\u01cb\3\2\2\2S\u01dc\3\2"+
		"\2\2U\u01e6\3\2\2\2W\u01f5\3\2\2\2Y\u0205\3\2\2\2[\u020e\3\2\2\2]\u0211"+
		"\3\2\2\2_\u021a\3\2\2\2a\u0223\3\2\2\2c\u0243\3\2\2\2e\u024e\3\2\2\2g"+
		"\u0250\3\2\2\2i\u025c\3\2\2\2k\u0260\3\2\2\2m\u0263\3\2\2\2o\u0268\3\2"+
		"\2\2qr\7t\2\2rs\7c\2\2st\7v\2\2tu\7k\2\2uv\7q\2\2vw\7\"\2\2w\4\3\2\2\2"+
		"xy\7c\2\2yz\7x\2\2z{\7i\2\2{|\7\"\2\2|\6\3\2\2\2}~\7o\2\2~\177\7k\2\2"+
		"\177\u0080\7p\2\2\u0080\u0081\7\"\2\2\u0081\b\3\2\2\2\u0082\u0083\7o\2"+
		"\2\u0083\u0084\7c\2\2\u0084\u0085\7z\2\2\u0085\u0086\7\"\2\2\u0086\n\3"+
		"\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7w\2\2\u008a"+
		"\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7\"\2\2\u008d\f\3\2\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091\7|\2\2\u0091\u0092\7g\2\2"+
		"\u0092\u0093\7\"\2\2\u0093\16\3\2\2\2\u0094\u0095\7o\2\2\u0095\u0096\7"+
		"g\2\2\u0096\u0097\7t\2\2\u0097\u0098\7i\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7\"\2\2\u009a\20\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7{\2\2\u00a0\u00a1\7\"\2"+
		"\2\u00a1\22\3\2\2\2\u00a2\u00a3\7f\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7k\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7{\2\2\u00a7\u00a8\7\"\2\2\u00a8"+
		"\24\3\2\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7\"\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7x\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7\"\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7t\2\2"+
		"\u00bb\u00bc\7v\2\2\u00bc\u00bd\7\"\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7"+
		"h\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3"+
		"\7v\2\2\u00c3\u00c4\7\"\2\2\u00c4\34\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6"+
		"\u00c7\7e\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7v\2\2"+
		"\u00ca\u00cb\7\"\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7r\2\2\u00cd\u00ce\7"+
		"k\2\2\u00ce\u00cf\7\63\2\2\u00cf\u00d0\7\"\2\2\u00d0 \3\2\2\2\u00d1\u00d2"+
		"\7r\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7\64\2\2\u00d4\u00d5\7\"\2\2\u00d5"+
		"\"\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7i\2\2\u00d9"+
		"\u00da\7o\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7\"\2"+
		"\2\u00dd$\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7"+
		"i\2\2\u00e1\u00e2\7o\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7\"\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7k\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\u00ee\7\"\2\2\u00ee(\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0"+
		"\u00f1\7q\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7k\2\2"+
		"\u00f4\u00f5\7g\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7\"\2\2\u00f7*\3\2"+
		"\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc"+
		"\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7a\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7c\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2"+
		"\u0103\u0104\7q\2\2\u0104\u0105\7\"\2\2\u0105,\3\2\2\2\u0106\u0107\7i"+
		"\2\2\u0107\u0108\7t\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a\u010b"+
		"\7r\2\2\u010b\u010c\7d\2\2\u010c\u010d\7{\2\2\u010d\u010e\7a\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7x\2\2\u0110\u0111\7i\2\2\u0111\u0112\7\"\2"+
		"\2\u0112.\3\2\2\2\u0113\u0114\7i\2\2\u0114\u0115\7t\2\2\u0115\u0116\7"+
		"q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7r\2\2\u0118\u0119\7d\2\2\u0119\u011a"+
		"\7{\2\2\u011a\u011b\7a\2\2\u011b\u011c\7u\2\2\u011c\u011d\7w\2\2\u011d"+
		"\u011e\7o\2\2\u011e\u011f\7\"\2\2\u011f\60\3\2\2\2\u0120\u0121\7i\2\2"+
		"\u0121\u0122\7t\2\2\u0122\u0123\7q\2\2\u0123\u0124\7w\2\2\u0124\u0125"+
		"\7r\2\2\u0125\u0126\7d\2\2\u0126\u0127\7{\2\2\u0127\u0128\7a\2\2\u0128"+
		"\u0129\7o\2\2\u0129\u012a\7k\2\2\u012a\u012b\7p\2\2\u012b\u012c\7\"\2"+
		"\2\u012c\62\3\2\2\2\u012d\u012e\7i\2\2\u012e\u012f\7t\2\2\u012f\u0130"+
		"\7q\2\2\u0130\u0131\7w\2\2\u0131\u0132\7r\2\2\u0132\u0133\7d\2\2\u0133"+
		"\u0134\7{\2\2\u0134\u0135\7a\2\2\u0135\u0136\7o\2\2\u0136\u0137\7c\2\2"+
		"\u0137\u0138\7z\2\2\u0138\u0139\7\"\2\2\u0139\64\3\2\2\2\u013a\u013b\7"+
		"i\2\2\u013b\u013c\7t\2\2\u013c\u013d\7q\2\2\u013d\u013e\7w\2\2\u013e\u013f"+
		"\7r\2\2\u013f\u0140\7d\2\2\u0140\u0141\7{\2\2\u0141\u0142\7a\2\2\u0142"+
		"\u0143\7u\2\2\u0143\u0144\7k\2\2\u0144\u0145\7|\2\2\u0145\u0146\7g\2\2"+
		"\u0146\u0147\7\"\2\2\u0147\66\3\2\2\2\u0148\u0149\7i\2\2\u0149\u014a\7"+
		"t\2\2\u014a\u014b\7q\2\2\u014b\u014c\7w\2\2\u014c\u014d\7r\2\2\u014d\u014e"+
		"\7d\2\2\u014e\u014f\7{\2\2\u014f\u0150\7a\2\2\u0150\u0151\7e\2\2\u0151"+
		"\u0152\7q\2\2\u0152\u0153\7w\2\2\u0153\u0154\7p\2\2\u0154\u0155\7v\2\2"+
		"\u0155\u0156\7\"\2\2\u01568\3\2\2\2\u0157\u0158\7k\2\2\u0158\u0159\7p"+
		"\2\2\u0159\u015a\7v\2\2\u015a\u015b\7g\2\2\u015b\u015c\7t\2\2\u015c\u015d"+
		"\7r\2\2\u015d\u015e\7q\2\2\u015e\u015f\7n\2\2\u015f\u0160\7\"\2\2\u0160"+
		":\3\2\2\2\u0161\u0162\7q\2\2\u0162\u0163\7f\2\2\u0163\u0164\7k\2\2\u0164"+
		"\u0165\7u\2\2\u0165\u0166\7v\2\2\u0166\u0167\7\"\2\2\u0167<\3\2\2\2\u0168"+
		"\u0169\7n\2\2\u0169\u016a\7f\2\2\u016a\u016b\7k\2\2\u016b\u016c\7u\2\2"+
		"\u016c\u016d\7v\2\2\u016d\u016e\7\"\2\2\u016e>\3\2\2\2\u016f\u0170\7n"+
		"\2\2\u0170\u0171\7q\2\2\u0171\u0172\7f\2\2\u0172\u0173\7k\2\2\u0173\u0174"+
		"\7u\2\2\u0174\u0175\7v\2\2\u0175\u0176\7\"\2\2\u0176@\3\2\2\2\u0177\u0178"+
		"\7q\2\2\u0178\u0179\7v\2\2\u0179\u017a\7q\2\2\u017a\u017b\7r\2\2\u017b"+
		"\u017c\7q\2\2\u017c\u017d\7\"\2\2\u017dB\3\2\2\2\u017e\u017f\7n\2\2\u017f"+
		"\u0180\7q\2\2\u0180\u0181\7v\2\2\u0181\u0182\7q\2\2\u0182\u0183\7r\2\2"+
		"\u0183\u0184\7q\2\2\u0184\u0185\7\"\2\2\u0185D\3\2\2\2\u0186\u0187\7p"+
		"\2\2\u0187\u0188\7f\2\2\u0188\u0189\7k\2\2\u0189\u018a\7u\2\2\u018a\u018b"+
		"\7v\2\2\u018b\u018c\7\"\2\2\u018cF\3\2\2\2\u018d\u018e\7n\2\2\u018e\u018f"+
		"\7x\2\2\u018f\u0190\7k\2\2\u0190\u0191\7u\2\2\u0191\u0192\7\"\2\2\u0192"+
		"H\3\2\2\2\u0193\u0194\7r\2\2\u0194\u0195\7q\2\2\u0195\u0196\7k\2\2\u0196"+
		"\u0197\7p\2\2\u0197\u0198\7v\2\2\u0198\u0199\7o\2\2\u0199\u019a\7g\2\2"+
		"\u019a\u019b\7c\2\2\u019b\u019c\7u\2\2\u019c\u019d\7w\2\2\u019d\u019e"+
		"\7t\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7\"\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\5m\67\2\u01a3J\3\2\2\2\u01a4\u01a5\7c\2\2\u01a5"+
		"\u01a6\7o\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7p\2\2"+
		"\u01a9\u01aa\7v\2\2\u01aa\u01ab\7r\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad"+
		"\7v\2\2\u01ad\u01ae\7e\2\2\u01ae\u01af\7j\2\2\u01af\u01b0\7g\2\2\u01b0"+
		"\u01b1\7u\2\2\u01b1\u01b2\7\"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\5m\67"+
		"\2\u01b4L\3\2\2\2\u01b5\u01b6\7e\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7"+
		"p\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7w\2\2\u01bb\u01bc"+
		"\7t\2\2\u01bc\u01bd\7\"\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5m\67\2\u01bf"+
		"N\3\2\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2\7d\2\2\u01c2\u01c3\7l\2\2\u01c3"+
		"\u01c4\7g\2\2\u01c4\u01c5\7e\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7u\2\2"+
		"\u01c7\u01c8\7\"\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\5m\67\2\u01caP\3"+
		"\2\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7d\2\2\u01cd\u01ce\7l\2\2\u01ce"+
		"\u01cf\7g\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7v\2\2\u01d1\u01d2\7t\2\2"+
		"\u01d2\u01d3\7g\2\2\u01d3\u01d4\7i\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6"+
		"\7q\2\2\u01d6\u01d7\7p\2\2\u01d7\u01d8\7u\2\2\u01d8\u01d9\7\"\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\5m\67\2\u01dbR\3\2\2\2\u01dc\u01dd\7q\2\2\u01dd"+
		"\u01de\7d\2\2\u01de\u01df\7l\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7e\2\2"+
		"\u01e1\u01e2\7v\2\2\u01e2\u01e3\7\"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\5m\67\2\u01e5T\3\2\2\2\u01e6\u01e7\7e\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9"+
		"\7p\2\2\u01e9\u01ea\7v\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ec\7w\2\2\u01ec"+
		"\u01ed\7t\2\2\u01ed\u01ee\7n\2\2\u01ee\u01ef\7k\2\2\u01ef\u01f0\7p\2\2"+
		"\u01f0\u01f1\7g\2\2\u01f1\u01f2\7\"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4"+
		"\5m\67\2\u01f4V\3\2\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7d\2\2\u01f7\u01f8"+
		"\7l\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7v\2\2\u01fb"+
		"\u01fc\7e\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff\7p\2\2"+
		"\u01ff\u0200\7v\2\2\u0200\u0201\7u\2\2\u0201\u0202\7\"\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0204\5m\67\2\u0204X\3\2\2\2\u0205\u0206\7h\2\2\u0206\u0207"+
		"\7k\2\2\u0207\u0208\7g\2\2\u0208\u0209\7n\2\2\u0209\u020a\7f\2\2\u020a"+
		"\u020b\7\"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5m\67\2\u020dZ\3\2\2\2"+
		"\u020e\u020f\7k\2\2\u020f\u0210\7p\2\2\u0210\\\3\2\2\2\u0211\u0212\7e"+
		"\2\2\u0212\u0213\7q\2\2\u0213\u0214\7w\2\2\u0214\u0215\7p\2\2\u0215\u0216"+
		"\7v\2\2\u0216\u0217\7\"\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5i\65\2\u0219"+
		"^\3\2\2\2\u021a\u021b\7t\2\2\u021b\u021c\7c\2\2\u021c\u021d\7v\2\2\u021d"+
		"\u021e\7k\2\2\u021e\u021f\7q\2\2\u021f\u0220\7\"\2\2\u0220\u0221\3\2\2"+
		"\2\u0221\u0222\5i\65\2\u0222`\3\2\2\2\u0223\u0224\7k\2\2\u0224\u0225\7"+
		"p\2\2\u0225\u0226\7v\2\2\u0226\u0227\7g\2\2\u0227\u0228\7t\2\2\u0228\u0229"+
		"\7x\2\2\u0229\u022a\7c\2\2\u022a\u022b\7n\2\2\u022b\u022c\7\"\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\5i\65\2\u022eb\3\2\2\2\u022f\u0230\7q\2\2\u0230"+
		"\u0231\7t\2\2\u0231\u0232\7f\2\2\u0232\u0233\7k\2\2\u0233\u0234\7p\2\2"+
		"\u0234\u0235\7c\2\2\u0235\u0236\7n\2\2\u0236\u0237\7\"\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0244\5i\65\2\u0239\u023a\7q\2\2\u023a\u023b\7t\2\2\u023b"+
		"\u023c\7f\2\2\u023c\u023d\7k\2\2\u023d\u023e\7p\2\2\u023e\u023f\7c\2\2"+
		"\u023f\u0240\7n\2\2\u0240\u0241\7\"\2\2\u0241\u0242\3\2\2\2\u0242\u0244"+
		"\5m\67\2\u0243\u022f\3\2\2\2\u0243\u0239\3\2\2\2\u0244d\3\2\2\2\u0245"+
		"\u0246\7v\2\2\u0246\u0247\7t\2\2\u0247\u0248\7w\2\2\u0248\u024f\7g\2\2"+
		"\u0249\u024a\7h\2\2\u024a\u024b\7c\2\2\u024b\u024c\7n\2\2\u024c\u024d"+
		"\7u\2\2\u024d\u024f\7g\2\2\u024e\u0245\3\2\2\2\u024e\u0249\3\2\2\2\u024f"+
		"f\3\2\2\2\u0250\u0251\7p\2\2\u0251\u0252\7q\2\2\u0252\u0253\7o\2\2\u0253"+
		"\u0254\7k\2\2\u0254\u0255\7p\2\2\u0255\u0256\7c\2\2\u0256\u0257\7n\2\2"+
		"\u0257\u0258\7\"\2\2\u0258\u0259\3\2\2\2\u0259\u025a\5m\67\2\u025ah\3"+
		"\2\2\2\u025b\u025d\t\2\2\2\u025c\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025fj\3\2\2\2\u0260\u0261\7\"\2\2"+
		"\u0261l\3\2\2\2\u0262\u0264\t\3\2\2\u0263\u0262\3\2\2\2\u0264\u0265\3"+
		"\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266n\3\2\2\2\u0267\u0269"+
		"\t\4\2\2\u0268\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\b8\2\2\u026dp\3\2\2\2\t"+
		"\2\u0243\u024e\u025e\u0263\u0265\u026a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}