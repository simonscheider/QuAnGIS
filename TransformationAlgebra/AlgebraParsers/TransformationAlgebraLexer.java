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
		AVG=1, MIN=2, MAX=3, SUM=4, COUNT=5, REIFY=6, DEIFY=7, GET=8, INVERT=9, 
		REVERT=10, MERGE=11, FCONT=12, OCONT=13, SIZE=14, RATIO=15, INTERPOL=16, 
		PI1=17, PI2=18, SIGMAE=19, SIGMASE=20, BOWTIE=21, BOWTIESTAR=22, BOWTIERATIO=23, 
		GROUPBYAVG=24, GROUPBYSUM=25, GROUPBYMIN=26, GROUPBYMAX=27, GROUPBYSIZE=28, 
		GROUPBYCOUNT=29, ODIST=30, LDIST=31, LODIST=32, OTOPO=33, LOTOPO=34, NDIST=35, 
		LVIS=36, DATAPM=37, DATAAMOUNT=38, DATACONTOUR=39, DATAOBJQ=40, DATAOBJS=41, 
		DATAOBJV=42, DATACONTOURLINE=43, DATAOBJCOUNT=44, DATAFIELD=45, TOPOV=46, 
		COUNTV=47, RATIOV=48, INTV=49, ORDV=50, BOOLV=51, NOMV=52, DATAV=53, WHITESPACE=54, 
		KEYWORD=55, WS=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "INVERT", 
			"REVERT", "MERGE", "FCONT", "OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", 
			"PI2", "SIGMAE", "SIGMASE", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", "GROUPBYAVG", 
			"GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", "GROUPBYCOUNT", 
			"ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", "DATAPM", 
			"DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATAOBJV", "DATACONTOURLINE", 
			"DATAOBJCOUNT", "DATAFIELD", "TOPOV", "COUNTV", "RATIOV", "INTV", "ORDV", 
			"BOOLV", "NOMV", "DATAV", "WHITESPACE", "KEYWORD", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0275\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u024b\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0256\n"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u0264"+
		"\n\66\r\66\16\66\u0265\3\67\3\67\38\68\u026b\n8\r8\168\u026c\39\69\u0270"+
		"\n9\r9\169\u0271\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o9q:\3\2\5\3\2\62;\6\2//C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u0279\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5x\3\2\2\2\7}\3\2\2\2\t"+
		"\u0082\3\2\2\2\13\u0087\3\2\2\2\r\u008e\3\2\2\2\17\u0095\3\2\2\2\21\u009c"+
		"\3\2\2\2\23\u00a1\3\2\2\2\25\u00a9\3\2\2\2\27\u00b1\3\2\2\2\31\u00b8\3"+
		"\2\2\2\33\u00bf\3\2\2\2\35\u00c6\3\2\2\2\37\u00cc\3\2\2\2!\u00d3\3\2\2"+
		"\2#\u00dd\3\2\2\2%\u00e2\3\2\2\2\'\u00e7\3\2\2\2)\u00ef\3\2\2\2+\u00f8"+
		"\3\2\2\2-\u0100\3\2\2\2/\u0109\3\2\2\2\61\u0117\3\2\2\2\63\u0124\3\2\2"+
		"\2\65\u0131\3\2\2\2\67\u013e\3\2\2\29\u014b\3\2\2\2;\u0159\3\2\2\2=\u0168"+
		"\3\2\2\2?\u016f\3\2\2\2A\u0176\3\2\2\2C\u017e\3\2\2\2E\u0185\3\2\2\2G"+
		"\u018d\3\2\2\2I\u0194\3\2\2\2K\u019a\3\2\2\2M\u01ab\3\2\2\2O\u01bc\3\2"+
		"\2\2Q\u01c7\3\2\2\2S\u01d2\3\2\2\2U\u01e3\3\2\2\2W\u01ed\3\2\2\2Y\u01fc"+
		"\3\2\2\2[\u020c\3\2\2\2]\u0215\3\2\2\2_\u0218\3\2\2\2a\u0221\3\2\2\2c"+
		"\u022a\3\2\2\2e\u024a\3\2\2\2g\u0255\3\2\2\2i\u0257\3\2\2\2k\u0263\3\2"+
		"\2\2m\u0267\3\2\2\2o\u026a\3\2\2\2q\u026f\3\2\2\2st\7c\2\2tu\7x\2\2uv"+
		"\7i\2\2vw\7\"\2\2w\4\3\2\2\2xy\7o\2\2yz\7k\2\2z{\7p\2\2{|\7\"\2\2|\6\3"+
		"\2\2\2}~\7o\2\2~\177\7c\2\2\177\u0080\7z\2\2\u0080\u0081\7\"\2\2\u0081"+
		"\b\3\2\2\2\u0082\u0083\7u\2\2\u0083\u0084\7w\2\2\u0084\u0085\7o\2\2\u0085"+
		"\u0086\7\"\2\2\u0086\n\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7w\2\2\u008a\u008b\7p\2\2\u008b\u008c\7v\2\2\u008c\u008d\7\"\2"+
		"\2\u008d\f\3\2\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7"+
		"k\2\2\u0091\u0092\7h\2\2\u0092\u0093\7{\2\2\u0093\u0094\7\"\2\2\u0094"+
		"\16\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7h\2\2\u0099\u009a\7{\2\2\u009a\u009b\7\"\2\2\u009b\20\3\2\2\2"+
		"\u009c\u009d\7i\2\2\u009d\u009e\7g\2\2\u009e\u009f\7v\2\2\u009f\u00a0"+
		"\7\"\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7x\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7\"\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7"+
		"g\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7\"\2\2\u00b0\26\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7g\2\2"+
		"\u00b6\u00b7\7\"\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7"+
		"e\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be"+
		"\7\"\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7e\2\2\u00c1"+
		"\u00c2\7q\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7\"\2"+
		"\2\u00c5\34\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9"+
		"\7|\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7\"\2\2\u00cb\36\3\2\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2"+
		"\u00d0\u00d1\7q\2\2\u00d1\u00d2\7\"\2\2\u00d2 \3\2\2\2\u00d3\u00d4\7k"+
		"\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7\"\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7k\2\2\u00df"+
		"\u00e0\7\63\2\2\u00e0\u00e1\7\"\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7r\2\2"+
		"\u00e3\u00e4\7k\2\2\u00e4\u00e5\7\64\2\2\u00e5\u00e6\7\"\2\2\u00e6&\3"+
		"\2\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7i\2\2\u00ea"+
		"\u00eb\7o\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7\"\2"+
		"\2\u00ee(\3\2\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7"+
		"i\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7\"\2\2\u00f7*\3\2\2\2\u00f8\u00f9\7d\2\2\u00f9\u00fa"+
		"\7q\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7\"\2\2\u00ff,\3\2\2\2\u0100\u0101\7d\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7y\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2"+
		"\u0105\u0106\7g\2\2\u0106\u0107\7,\2\2\u0107\u0108\7\"\2\2\u0108.\3\2"+
		"\2\2\u0109\u010a\7d\2\2\u010a\u010b\7q\2\2\u010b\u010c\7y\2\2\u010c\u010d"+
		"\7v\2\2\u010d\u010e\7k\2\2\u010e\u010f\7g\2\2\u010f\u0110\7a\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7c\2\2\u0112\u0113\7v\2\2\u0113\u0114\7k\2\2"+
		"\u0114\u0115\7q\2\2\u0115\u0116\7\"\2\2\u0116\60\3\2\2\2\u0117\u0118\7"+
		"i\2\2\u0118\u0119\7t\2\2\u0119\u011a\7q\2\2\u011a\u011b\7w\2\2\u011b\u011c"+
		"\7r\2\2\u011c\u011d\7d\2\2\u011d\u011e\7{\2\2\u011e\u011f\7a\2\2\u011f"+
		"\u0120\7c\2\2\u0120\u0121\7x\2\2\u0121\u0122\7i\2\2\u0122\u0123\7\"\2"+
		"\2\u0123\62\3\2\2\2\u0124\u0125\7i\2\2\u0125\u0126\7t\2\2\u0126\u0127"+
		"\7q\2\2\u0127\u0128\7w\2\2\u0128\u0129\7r\2\2\u0129\u012a\7d\2\2\u012a"+
		"\u012b\7{\2\2\u012b\u012c\7a\2\2\u012c\u012d\7u\2\2\u012d\u012e\7w\2\2"+
		"\u012e\u012f\7o\2\2\u012f\u0130\7\"\2\2\u0130\64\3\2\2\2\u0131\u0132\7"+
		"i\2\2\u0132\u0133\7t\2\2\u0133\u0134\7q\2\2\u0134\u0135\7w\2\2\u0135\u0136"+
		"\7r\2\2\u0136\u0137\7d\2\2\u0137\u0138\7{\2\2\u0138\u0139\7a\2\2\u0139"+
		"\u013a\7o\2\2\u013a\u013b\7k\2\2\u013b\u013c\7p\2\2\u013c\u013d\7\"\2"+
		"\2\u013d\66\3\2\2\2\u013e\u013f\7i\2\2\u013f\u0140\7t\2\2\u0140\u0141"+
		"\7q\2\2\u0141\u0142\7w\2\2\u0142\u0143\7r\2\2\u0143\u0144\7d\2\2\u0144"+
		"\u0145\7{\2\2\u0145\u0146\7a\2\2\u0146\u0147\7o\2\2\u0147\u0148\7c\2\2"+
		"\u0148\u0149\7z\2\2\u0149\u014a\7\"\2\2\u014a8\3\2\2\2\u014b\u014c\7i"+
		"\2\2\u014c\u014d\7t\2\2\u014d\u014e\7q\2\2\u014e\u014f\7w\2\2\u014f\u0150"+
		"\7r\2\2\u0150\u0151\7d\2\2\u0151\u0152\7{\2\2\u0152\u0153\7a\2\2\u0153"+
		"\u0154\7u\2\2\u0154\u0155\7k\2\2\u0155\u0156\7|\2\2\u0156\u0157\7g\2\2"+
		"\u0157\u0158\7\"\2\2\u0158:\3\2\2\2\u0159\u015a\7i\2\2\u015a\u015b\7t"+
		"\2\2\u015b\u015c\7q\2\2\u015c\u015d\7w\2\2\u015d\u015e\7r\2\2\u015e\u015f"+
		"\7d\2\2\u015f\u0160\7{\2\2\u0160\u0161\7a\2\2\u0161\u0162\7e\2\2\u0162"+
		"\u0163\7q\2\2\u0163\u0164\7w\2\2\u0164\u0165\7p\2\2\u0165\u0166\7v\2\2"+
		"\u0166\u0167\7\"\2\2\u0167<\3\2\2\2\u0168\u0169\7q\2\2\u0169\u016a\7f"+
		"\2\2\u016a\u016b\7k\2\2\u016b\u016c\7u\2\2\u016c\u016d\7v\2\2\u016d\u016e"+
		"\7\"\2\2\u016e>\3\2\2\2\u016f\u0170\7n\2\2\u0170\u0171\7f\2\2\u0171\u0172"+
		"\7k\2\2\u0172\u0173\7u\2\2\u0173\u0174\7v\2\2\u0174\u0175\7\"\2\2\u0175"+
		"@\3\2\2\2\u0176\u0177\7n\2\2\u0177\u0178\7q\2\2\u0178\u0179\7f\2\2\u0179"+
		"\u017a\7k\2\2\u017a\u017b\7u\2\2\u017b\u017c\7v\2\2\u017c\u017d\7\"\2"+
		"\2\u017dB\3\2\2\2\u017e\u017f\7q\2\2\u017f\u0180\7v\2\2\u0180\u0181\7"+
		"q\2\2\u0181\u0182\7r\2\2\u0182\u0183\7q\2\2\u0183\u0184\7\"\2\2\u0184"+
		"D\3\2\2\2\u0185\u0186\7n\2\2\u0186\u0187\7q\2\2\u0187\u0188\7v\2\2\u0188"+
		"\u0189\7q\2\2\u0189\u018a\7r\2\2\u018a\u018b\7q\2\2\u018b\u018c\7\"\2"+
		"\2\u018cF\3\2\2\2\u018d\u018e\7p\2\2\u018e\u018f\7f\2\2\u018f\u0190\7"+
		"k\2\2\u0190\u0191\7u\2\2\u0191\u0192\7v\2\2\u0192\u0193\7\"\2\2\u0193"+
		"H\3\2\2\2\u0194\u0195\7n\2\2\u0195\u0196\7x\2\2\u0196\u0197\7k\2\2\u0197"+
		"\u0198\7u\2\2\u0198\u0199\7\"\2\2\u0199J\3\2\2\2\u019a\u019b\7r\2\2\u019b"+
		"\u019c\7q\2\2\u019c\u019d\7k\2\2\u019d\u019e\7p\2\2\u019e\u019f\7v\2\2"+
		"\u019f\u01a0\7o\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3"+
		"\7u\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6\7g\2\2\u01a6"+
		"\u01a7\7u\2\2\u01a7\u01a8\7\"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\5o8"+
		"\2\u01aaL\3\2\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7o\2\2\u01ad\u01ae\7"+
		"q\2\2\u01ae\u01af\7w\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7v\2\2\u01b1\u01b2"+
		"\7r\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7e\2\2\u01b5"+
		"\u01b6\7j\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9\7\"\2"+
		"\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\5o8\2\u01bbN\3\2\2\2\u01bc\u01bd\7"+
		"e\2\2\u01bd\u01be\7q\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1"+
		"\7q\2\2\u01c1\u01c2\7w\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7\"\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\5o8\2\u01c6P\3\2\2\2\u01c7\u01c8\7q\2\2\u01c8"+
		"\u01c9\7d\2\2\u01c9\u01ca\7l\2\2\u01ca\u01cb\7g\2\2\u01cb\u01cc\7e\2\2"+
		"\u01cc\u01cd\7v\2\2\u01cd\u01ce\7u\2\2\u01ce\u01cf\7\"\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\5o8\2\u01d1R\3\2\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4"+
		"\7d\2\2\u01d4\u01d5\7l\2\2\u01d5\u01d6\7g\2\2\u01d6\u01d7\7e\2\2\u01d7"+
		"\u01d8\7v\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7g\2\2\u01da\u01db\7i\2\2"+
		"\u01db\u01dc\7k\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7p\2\2\u01de\u01df"+
		"\7u\2\2\u01df\u01e0\7\"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5o8\2\u01e2"+
		"T\3\2\2\2\u01e3\u01e4\7q\2\2\u01e4\u01e5\7d\2\2\u01e5\u01e6\7l\2\2\u01e6"+
		"\u01e7\7g\2\2\u01e7\u01e8\7e\2\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7\"\2"+
		"\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\5o8\2\u01ecV\3\2\2\2\u01ed\u01ee\7"+
		"e\2\2\u01ee\u01ef\7q\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f1\7v\2\2\u01f1\u01f2"+
		"\7q\2\2\u01f2\u01f3\7w\2\2\u01f3\u01f4\7t\2\2\u01f4\u01f5\7n\2\2\u01f5"+
		"\u01f6\7k\2\2\u01f6\u01f7\7p\2\2\u01f7\u01f8\7g\2\2\u01f8\u01f9\7\"\2"+
		"\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5o8\2\u01fbX\3\2\2\2\u01fc\u01fd\7"+
		"q\2\2\u01fd\u01fe\7d\2\2\u01fe\u01ff\7l\2\2\u01ff\u0200\7g\2\2\u0200\u0201"+
		"\7e\2\2\u0201\u0202\7v\2\2\u0202\u0203\7e\2\2\u0203\u0204\7q\2\2\u0204"+
		"\u0205\7w\2\2\u0205\u0206\7p\2\2\u0206\u0207\7v\2\2\u0207\u0208\7u\2\2"+
		"\u0208\u0209\7\"\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5o8\2\u020bZ\3\2"+
		"\2\2\u020c\u020d\7h\2\2\u020d\u020e\7k\2\2\u020e\u020f\7g\2\2\u020f\u0210"+
		"\7n\2\2\u0210\u0211\7f\2\2\u0211\u0212\7\"\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\5o8\2\u0214\\\3\2\2\2\u0215\u0216\7k\2\2\u0216\u0217\7p\2\2\u0217"+
		"^\3\2\2\2\u0218\u0219\7e\2\2\u0219\u021a\7q\2\2\u021a\u021b\7w\2\2\u021b"+
		"\u021c\7p\2\2\u021c\u021d\7v\2\2\u021d\u021e\7\"\2\2\u021e\u021f\3\2\2"+
		"\2\u021f\u0220\5k\66\2\u0220`\3\2\2\2\u0221\u0222\7t\2\2\u0222\u0223\7"+
		"c\2\2\u0223\u0224\7v\2\2\u0224\u0225\7k\2\2\u0225\u0226\7q\2\2\u0226\u0227"+
		"\7\"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\5k\66\2\u0229b\3\2\2\2\u022a"+
		"\u022b\7k\2\2\u022b\u022c\7p\2\2\u022c\u022d\7v\2\2\u022d\u022e\7g\2\2"+
		"\u022e\u022f\7t\2\2\u022f\u0230\7x\2\2\u0230\u0231\7c\2\2\u0231\u0232"+
		"\7n\2\2\u0232\u0233\7\"\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5k\66\2\u0235"+
		"d\3\2\2\2\u0236\u0237\7q\2\2\u0237\u0238\7t\2\2\u0238\u0239\7f\2\2\u0239"+
		"\u023a\7k\2\2\u023a\u023b\7p\2\2\u023b\u023c\7c\2\2\u023c\u023d\7n\2\2"+
		"\u023d\u023e\7\"\2\2\u023e\u023f\3\2\2\2\u023f\u024b\5k\66\2\u0240\u0241"+
		"\7q\2\2\u0241\u0242\7t\2\2\u0242\u0243\7f\2\2\u0243\u0244\7k\2\2\u0244"+
		"\u0245\7p\2\2\u0245\u0246\7c\2\2\u0246\u0247\7n\2\2\u0247\u0248\7\"\2"+
		"\2\u0248\u0249\3\2\2\2\u0249\u024b\5o8\2\u024a\u0236\3\2\2\2\u024a\u0240"+
		"\3\2\2\2\u024bf\3\2\2\2\u024c\u024d\7v\2\2\u024d\u024e\7t\2\2\u024e\u024f"+
		"\7w\2\2\u024f\u0256\7g\2\2\u0250\u0251\7h\2\2\u0251\u0252\7c\2\2\u0252"+
		"\u0253\7n\2\2\u0253\u0254\7u\2\2\u0254\u0256\7g\2\2\u0255\u024c\3\2\2"+
		"\2\u0255\u0250\3\2\2\2\u0256h\3\2\2\2\u0257\u0258\7p\2\2\u0258\u0259\7"+
		"q\2\2\u0259\u025a\7o\2\2\u025a\u025b\7k\2\2\u025b\u025c\7p\2\2\u025c\u025d"+
		"\7c\2\2\u025d\u025e\7n\2\2\u025e\u025f\7\"\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0261\5o8\2\u0261j\3\2\2\2\u0262\u0264\t\2\2\2\u0263\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266l\3\2\2\2"+
		"\u0267\u0268\7\"\2\2\u0268n\3\2\2\2\u0269\u026b\t\3\2\2\u026a\u0269\3"+
		"\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"p\3\2\2\2\u026e\u0270\t\4\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2"+
		"\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274"+
		"\b9\2\2\u0274r\3\2\2\2\b\2\u024a\u0255\u0265\u026c\u0271\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}