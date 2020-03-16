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
		AVG=1, MIN=2, MAX=3, SUM=4, COUNT=5, REIFY=6, DEIFY=7, GET=8, MERGE=9, 
		FCONT=10, OCONT=11, SIZE=12, RATIO=13, INTERPOL=14, PI1=15, PI2=16, SIGMAE2=17, 
		SIGMASE2=18, BOWTIE=19, BOWTIESTAR=20, GROUPBYAVG=21, GROUPBYSUM=22, GROUPBYMIN=23, 
		GROUPBYMAX=24, ODIST=25, LDIST=26, LODIST=27, OTOPO=28, LOTOPO=29, NDIST=30, 
		LVIS=31, DATAPM=32, DATAAMOUNT=33, DATACONTOUR=34, DATAOBJQ=35, DATAOBJS=36, 
		DATAOBJV=37, DATACONTOURLINE=38, DATAOBJCOUNT=39, DATAFIELD=40, TOPOV=41, 
		BOOLV=42, DATAV=43, WHITESPACE=44, KEYWORD=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "MERGE", 
			"FCONT", "OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", "PI2", "SIGMAE2", 
			"SIGMASE2", "BOWTIE", "BOWTIESTAR", "GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", 
			"GROUPBYMAX", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", 
			"LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
			"DATAOBJV", "DATACONTOURLINE", "DATAOBJCOUNT", "DATAFIELD", "TOPOV", 
			"BOOLV", "DATAV", "WHITESPACE", "KEYWORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'avg '", "'min '", "'max '", "'sum '", "'count '", "'reify '", 
			"'deify '", "'get '", "'merge '", "'fcont '", "'ocont '", "'size '", 
			"'ratio '", "'interpol '", "'pi1 '", "'pi2 '", "'sigmae '", "'sigmale '", 
			"'bowtie '", "'bowtie* '", "'groupby_avg '", "'groupby_sum '", "'groupby_min '", 
			"'groupby_max '", "'odist '", "'ldist '", "'lodist '", "'otopo '", "'lotopo '", 
			"'ndist '", "'lvis '", null, null, null, null, null, null, null, null, 
			null, "'in'", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "MERGE", 
			"FCONT", "OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", "PI2", "SIGMAE2", 
			"SIGMASE2", "BOWTIE", "BOWTIESTAR", "GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", 
			"GROUPBYMAX", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", 
			"LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
			"DATAOBJV", "DATACONTOURLINE", "DATAOBJCOUNT", "DATAFIELD", "TOPOV", 
			"BOOLV", "DATAV", "WHITESPACE", "KEYWORD", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01e7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01d3\n+\3,\6,\u01d6\n,\r,\16,\u01d7"+
		"\3-\3-\3.\6.\u01dd\n.\r.\16.\u01de\3/\6/\u01e2\n/\r/\16/\u01e3\3/\3/\2"+
		"\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\5\3\2\62;\6\2//C\\aac|"+
		"\5\2\13\f\17\17\"\"\2\u01ea\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\3_\3\2\2\2\5d\3\2\2\2\7i\3\2\2\2\tn\3\2\2\2\13s\3\2\2\2\r"+
		"z\3\2\2\2\17\u0081\3\2\2\2\21\u0088\3\2\2\2\23\u008d\3\2\2\2\25\u0094"+
		"\3\2\2\2\27\u009b\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3\2\2\2\35\u00af\3"+
		"\2\2\2\37\u00b9\3\2\2\2!\u00be\3\2\2\2#\u00c3\3\2\2\2%\u00cb\3\2\2\2\'"+
		"\u00d4\3\2\2\2)\u00dc\3\2\2\2+\u00e5\3\2\2\2-\u00f2\3\2\2\2/\u00ff\3\2"+
		"\2\2\61\u010c\3\2\2\2\63\u0119\3\2\2\2\65\u0120\3\2\2\2\67\u0127\3\2\2"+
		"\29\u012f\3\2\2\2;\u0136\3\2\2\2=\u013e\3\2\2\2?\u0145\3\2\2\2A\u014b"+
		"\3\2\2\2C\u015c\3\2\2\2E\u016d\3\2\2\2G\u0178\3\2\2\2I\u0183\3\2\2\2K"+
		"\u0194\3\2\2\2M\u019e\3\2\2\2O\u01ad\3\2\2\2Q\u01bd\3\2\2\2S\u01c6\3\2"+
		"\2\2U\u01d2\3\2\2\2W\u01d5\3\2\2\2Y\u01d9\3\2\2\2[\u01dc\3\2\2\2]\u01e1"+
		"\3\2\2\2_`\7c\2\2`a\7x\2\2ab\7i\2\2bc\7\"\2\2c\4\3\2\2\2de\7o\2\2ef\7"+
		"k\2\2fg\7p\2\2gh\7\"\2\2h\6\3\2\2\2ij\7o\2\2jk\7c\2\2kl\7z\2\2lm\7\"\2"+
		"\2m\b\3\2\2\2no\7u\2\2op\7w\2\2pq\7o\2\2qr\7\"\2\2r\n\3\2\2\2st\7e\2\2"+
		"tu\7q\2\2uv\7w\2\2vw\7p\2\2wx\7v\2\2xy\7\"\2\2y\f\3\2\2\2z{\7t\2\2{|\7"+
		"g\2\2|}\7k\2\2}~\7h\2\2~\177\7{\2\2\177\u0080\7\"\2\2\u0080\16\3\2\2\2"+
		"\u0081\u0082\7f\2\2\u0082\u0083\7g\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7h\2\2\u0085\u0086\7{\2\2\u0086\u0087\7\"\2\2\u0087\20\3\2\2\2\u0088"+
		"\u0089\7i\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\u008c\7\"\2"+
		"\2\u008c\22\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7i\2\2\u0091\u0092\7g\2\2\u0092\u0093\7\"\2\2\u0093"+
		"\24\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7e\2\2\u0096\u0097\7q\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\u009a\7\"\2\2\u009a\26\3\2\2\2"+
		"\u009b\u009c\7q\2\2\u009c\u009d\7e\2\2\u009d\u009e\7q\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7\"\2\2\u00a1\30\3\2\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7|\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7"+
		"c\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7\"\2\2\u00ae\34\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7r\2\2"+
		"\u00b5\u00b6\7q\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7\"\2\2\u00b8\36\3"+
		"\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7\63\2\2\u00bc"+
		"\u00bd\7\"\2\2\u00bd \3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7\64\2\2\u00c1\u00c2\7\"\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7u\2\2"+
		"\u00c4\u00c5\7k\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8"+
		"\7c\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7\"\2\2\u00ca$\3\2\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7o\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7\"\2"+
		"\2\u00d3&\3\2\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7"+
		"y\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7g\2\2\u00da\u00db"+
		"\7\"\2\2\u00db(\3\2\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7q\2\2\u00de\u00df"+
		"\7y\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7,\2\2\u00e3\u00e4\7\"\2\2\u00e4*\3\2\2\2\u00e5\u00e6\7i\2\2\u00e6"+
		"\u00e7\7t\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7r\2\2"+
		"\u00ea\u00eb\7d\2\2\u00eb\u00ec\7{\2\2\u00ec\u00ed\7a\2\2\u00ed\u00ee"+
		"\7c\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7i\2\2\u00f0\u00f1\7\"\2\2\u00f1"+
		",\3\2\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7w\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7{\2\2"+
		"\u00f9\u00fa\7a\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd"+
		"\7o\2\2\u00fd\u00fe\7\"\2\2\u00fe.\3\2\2\2\u00ff\u0100\7i\2\2\u0100\u0101"+
		"\7t\2\2\u0101\u0102\7q\2\2\u0102\u0103\7w\2\2\u0103\u0104\7r\2\2\u0104"+
		"\u0105\7d\2\2\u0105\u0106\7{\2\2\u0106\u0107\7a\2\2\u0107\u0108\7o\2\2"+
		"\u0108\u0109\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7\"\2\2\u010b\60\3"+
		"\2\2\2\u010c\u010d\7i\2\2\u010d\u010e\7t\2\2\u010e\u010f\7q\2\2\u010f"+
		"\u0110\7w\2\2\u0110\u0111\7r\2\2\u0111\u0112\7d\2\2\u0112\u0113\7{\2\2"+
		"\u0113\u0114\7a\2\2\u0114\u0115\7o\2\2\u0115\u0116\7c\2\2\u0116\u0117"+
		"\7z\2\2\u0117\u0118\7\"\2\2\u0118\62\3\2\2\2\u0119\u011a\7q\2\2\u011a"+
		"\u011b\7f\2\2\u011b\u011c\7k\2\2\u011c\u011d\7u\2\2\u011d\u011e\7v\2\2"+
		"\u011e\u011f\7\"\2\2\u011f\64\3\2\2\2\u0120\u0121\7n\2\2\u0121\u0122\7"+
		"f\2\2\u0122\u0123\7k\2\2\u0123\u0124\7u\2\2\u0124\u0125\7v\2\2\u0125\u0126"+
		"\7\"\2\2\u0126\66\3\2\2\2\u0127\u0128\7n\2\2\u0128\u0129\7q\2\2\u0129"+
		"\u012a\7f\2\2\u012a\u012b\7k\2\2\u012b\u012c\7u\2\2\u012c\u012d\7v\2\2"+
		"\u012d\u012e\7\"\2\2\u012e8\3\2\2\2\u012f\u0130\7q\2\2\u0130\u0131\7v"+
		"\2\2\u0131\u0132\7q\2\2\u0132\u0133\7r\2\2\u0133\u0134\7q\2\2\u0134\u0135"+
		"\7\"\2\2\u0135:\3\2\2\2\u0136\u0137\7n\2\2\u0137\u0138\7q\2\2\u0138\u0139"+
		"\7v\2\2\u0139\u013a\7q\2\2\u013a\u013b\7r\2\2\u013b\u013c\7q\2\2\u013c"+
		"\u013d\7\"\2\2\u013d<\3\2\2\2\u013e\u013f\7p\2\2\u013f\u0140\7f\2\2\u0140"+
		"\u0141\7k\2\2\u0141\u0142\7u\2\2\u0142\u0143\7v\2\2\u0143\u0144\7\"\2"+
		"\2\u0144>\3\2\2\2\u0145\u0146\7n\2\2\u0146\u0147\7x\2\2\u0147\u0148\7"+
		"k\2\2\u0148\u0149\7u\2\2\u0149\u014a\7\"\2\2\u014a@\3\2\2\2\u014b\u014c"+
		"\7r\2\2\u014c\u014d\7q\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f"+
		"\u0150\7v\2\2\u0150\u0151\7o\2\2\u0151\u0152\7g\2\2\u0152\u0153\7c\2\2"+
		"\u0153\u0154\7u\2\2\u0154\u0155\7w\2\2\u0155\u0156\7t\2\2\u0156\u0157"+
		"\7g\2\2\u0157\u0158\7u\2\2\u0158\u0159\7\"\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\5[.\2\u015bB\3\2\2\2\u015c\u015d\7c\2\2\u015d\u015e\7o\2\2\u015e"+
		"\u015f\7q\2\2\u015f\u0160\7w\2\2\u0160\u0161\7p\2\2\u0161\u0162\7v\2\2"+
		"\u0162\u0163\7r\2\2\u0163\u0164\7c\2\2\u0164\u0165\7v\2\2\u0165\u0166"+
		"\7e\2\2\u0166\u0167\7j\2\2\u0167\u0168\7g\2\2\u0168\u0169\7u\2\2\u0169"+
		"\u016a\7\"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5[.\2\u016cD\3\2\2\2\u016d"+
		"\u016e\7e\2\2\u016e\u016f\7q\2\2\u016f\u0170\7p\2\2\u0170\u0171\7v\2\2"+
		"\u0171\u0172\7q\2\2\u0172\u0173\7w\2\2\u0173\u0174\7t\2\2\u0174\u0175"+
		"\7\"\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5[.\2\u0177F\3\2\2\2\u0178\u0179"+
		"\7q\2\2\u0179\u017a\7d\2\2\u017a\u017b\7l\2\2\u017b\u017c\7g\2\2\u017c"+
		"\u017d\7e\2\2\u017d\u017e\7v\2\2\u017e\u017f\7u\2\2\u017f\u0180\7\"\2"+
		"\2\u0180\u0181\3\2\2\2\u0181\u0182\5[.\2\u0182H\3\2\2\2\u0183\u0184\7"+
		"q\2\2\u0184\u0185\7d\2\2\u0185\u0186\7l\2\2\u0186\u0187\7g\2\2\u0187\u0188"+
		"\7e\2\2\u0188\u0189\7v\2\2\u0189\u018a\7t\2\2\u018a\u018b\7g\2\2\u018b"+
		"\u018c\7i\2\2\u018c\u018d\7k\2\2\u018d\u018e\7q\2\2\u018e\u018f\7p\2\2"+
		"\u018f\u0190\7u\2\2\u0190\u0191\7\"\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\5[.\2\u0193J\3\2\2\2\u0194\u0195\7q\2\2\u0195\u0196\7d\2\2\u0196\u0197"+
		"\7l\2\2\u0197\u0198\7g\2\2\u0198\u0199\7e\2\2\u0199\u019a\7v\2\2\u019a"+
		"\u019b\7\"\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5[.\2\u019dL\3\2\2\2\u019e"+
		"\u019f\7e\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2\7v\2\2"+
		"\u01a2\u01a3\7q\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7t\2\2\u01a5\u01a6"+
		"\7n\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7g\2\2\u01a9"+
		"\u01aa\7\"\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\5[.\2\u01acN\3\2\2\2\u01ad"+
		"\u01ae\7q\2\2\u01ae\u01af\7d\2\2\u01af\u01b0\7l\2\2\u01b0\u01b1\7g\2\2"+
		"\u01b1\u01b2\7e\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7e\2\2\u01b4\u01b5"+
		"\7q\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8\7v\2\2\u01b8"+
		"\u01b9\7u\2\2\u01b9\u01ba\7\"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5[."+
		"\2\u01bcP\3\2\2\2\u01bd\u01be\7h\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7"+
		"g\2\2\u01c0\u01c1\7n\2\2\u01c1\u01c2\7f\2\2\u01c2\u01c3\7\"\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\5[.\2\u01c5R\3\2\2\2\u01c6\u01c7\7k\2\2\u01c7"+
		"\u01c8\7p\2\2\u01c8T\3\2\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7t\2\2\u01cb"+
		"\u01cc\7w\2\2\u01cc\u01d3\7g\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf\7c\2\2"+
		"\u01cf\u01d0\7n\2\2\u01d0\u01d1\7u\2\2\u01d1\u01d3\7g\2\2\u01d2\u01c9"+
		"\3\2\2\2\u01d2\u01cd\3\2\2\2\u01d3V\3\2\2\2\u01d4\u01d6\t\2\2\2\u01d5"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8X\3\2\2\2\u01d9\u01da\7\"\2\2\u01daZ\3\2\2\2\u01db\u01dd\t\3"+
		"\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\\\3\2\2\2\u01e0\u01e2\t\4\2\2\u01e1\u01e0\3\2\2\2"+
		"\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\b/\2\2\u01e6^\3\2\2\2\7\2\u01d2\u01d7\u01de\u01e3"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}