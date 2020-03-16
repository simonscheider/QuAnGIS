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
		AVG=1, MIN=2, MAX=3, SUM=4, COUNT=5, REIFY=6, DEIFY=7, GET=8, FCONT=9, 
		OCONT=10, SIZE=11, RATIO=12, INTERPOL=13, PI1=14, PI2=15, SIGMAE2=16, 
		SIGMASE2=17, BOWTIE=18, BOWTIESTAR=19, GROUPBYAVG=20, GROUPBYSUM=21, GROUPBYMIN=22, 
		GROUPBYMAX=23, ODIST=24, LDIST=25, LODIST=26, OTOPO=27, LOTOPO=28, NDIST=29, 
		LVIS=30, DATAPM=31, DATAAMOUNT=32, DATACONTOUR=33, DATAOBJQ=34, DATAOBJS=35, 
		DATAOBJV=36, DATACONTOURLINE=37, DATAOBJCOUNT=38, DATAFIELD=39, TOPOV=40, 
		BOOLV=41, DATAV=42, WHITESPACE=43, KEYWORD=44, WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "FCONT", 
			"OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", "PI2", "SIGMAE2", "SIGMASE2", 
			"BOWTIE", "BOWTIESTAR", "GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", 
			"ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", "DATAPM", 
			"DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATAOBJV", "DATACONTOURLINE", 
			"DATAOBJCOUNT", "DATAFIELD", "TOPOV", "BOOLV", "DATAV", "WHITESPACE", 
			"KEYWORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'avg '", "'min '", "'max '", "'sum '", "'count '", "'reify '", 
			"'deify '", "'get '", "'fcont '", "'ocont '", "'size '", "'ratio '", 
			"'interpol '", "'pi1 '", "'pi2 '", "'sigmae '", "'sigmale '", "'bowtie '", 
			"'bowtie* '", "'groupby_avg '", "'groupby_sum '", "'groupby_min '", "'groupby_max '", 
			"'odist '", "'ldist '", "'lodist '", "'otopo '", "'lotopo '", "'ndist '", 
			"'lvis '", null, null, null, null, null, null, null, null, null, "'in'", 
			null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "FCONT", 
			"OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", "PI2", "SIGMAE2", "SIGMASE2", 
			"BOWTIE", "BOWTIESTAR", "GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", 
			"ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", "LVIS", "DATAPM", 
			"DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", "DATAOBJV", "DATACONTOURLINE", 
			"DATAOBJCOUNT", "DATAFIELD", "TOPOV", "BOOLV", "DATAV", "WHITESPACE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01ca"+
		"\n*\3+\6+\u01cd\n+\r+\16+\u01ce\3,\3,\3-\6-\u01d4\n-\r-\16-\u01d5\3.\6"+
		".\u01d9\n.\r.\16.\u01da\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/\3\2\5\3\2\62;\6\2//C\\aac|\5\2\13\f\17\17\"\"\2\u01e1\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5b\3\2\2\2\7g\3\2\2\2\tl\3\2\2"+
		"\2\13q\3\2\2\2\rx\3\2\2\2\17\177\3\2\2\2\21\u0086\3\2\2\2\23\u008b\3\2"+
		"\2\2\25\u0092\3\2\2\2\27\u0099\3\2\2\2\31\u009f\3\2\2\2\33\u00a6\3\2\2"+
		"\2\35\u00b0\3\2\2\2\37\u00b5\3\2\2\2!\u00ba\3\2\2\2#\u00c2\3\2\2\2%\u00cb"+
		"\3\2\2\2\'\u00d3\3\2\2\2)\u00dc\3\2\2\2+\u00e9\3\2\2\2-\u00f6\3\2\2\2"+
		"/\u0103\3\2\2\2\61\u0110\3\2\2\2\63\u0117\3\2\2\2\65\u011e\3\2\2\2\67"+
		"\u0126\3\2\2\29\u012d\3\2\2\2;\u0135\3\2\2\2=\u013c\3\2\2\2?\u0142\3\2"+
		"\2\2A\u0153\3\2\2\2C\u0164\3\2\2\2E\u016f\3\2\2\2G\u017a\3\2\2\2I\u018b"+
		"\3\2\2\2K\u0195\3\2\2\2M\u01a4\3\2\2\2O\u01b4\3\2\2\2Q\u01bd\3\2\2\2S"+
		"\u01c9\3\2\2\2U\u01cc\3\2\2\2W\u01d0\3\2\2\2Y\u01d3\3\2\2\2[\u01d8\3\2"+
		"\2\2]^\7c\2\2^_\7x\2\2_`\7i\2\2`a\7\"\2\2a\4\3\2\2\2bc\7o\2\2cd\7k\2\2"+
		"de\7p\2\2ef\7\"\2\2f\6\3\2\2\2gh\7o\2\2hi\7c\2\2ij\7z\2\2jk\7\"\2\2k\b"+
		"\3\2\2\2lm\7u\2\2mn\7w\2\2no\7o\2\2op\7\"\2\2p\n\3\2\2\2qr\7e\2\2rs\7"+
		"q\2\2st\7w\2\2tu\7p\2\2uv\7v\2\2vw\7\"\2\2w\f\3\2\2\2xy\7t\2\2yz\7g\2"+
		"\2z{\7k\2\2{|\7h\2\2|}\7{\2\2}~\7\"\2\2~\16\3\2\2\2\177\u0080\7f\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7k\2\2\u0082\u0083\7h\2\2\u0083\u0084\7{\2\2"+
		"\u0084\u0085\7\"\2\2\u0085\20\3\2\2\2\u0086\u0087\7i\2\2\u0087\u0088\7"+
		"g\2\2\u0088\u0089\7v\2\2\u0089\u008a\7\"\2\2\u008a\22\3\2\2\2\u008b\u008c"+
		"\7h\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7\"\2\2\u0091\24\3\2\2\2\u0092\u0093\7q\2\2"+
		"\u0093\u0094\7e\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u0098\7\"\2\2\u0098\26\3\2\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7|\2\2\u009c\u009d\7g\2\2\u009d\u009e\7\"\2"+
		"\2\u009e\30\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7\"\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7q\2\2"+
		"\u00ad\u00ae\7n\2\2\u00ae\u00af\7\"\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7"+
		"r\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7\63\2\2\u00b3\u00b4\7\"\2\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7\64\2\2"+
		"\u00b8\u00b9\7\"\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7k"+
		"\2\2\u00bc\u00bd\7i\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7\"\2\2\u00c1\"\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7i\2\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7\"\2\2\u00ca$\3\2\2\2\u00cb"+
		"\u00cc\7d\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7y\2\2\u00ce\u00cf\7v\2\2"+
		"\u00cf\u00d0\7k\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7\"\2\2\u00d2&\3\2"+
		"\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7"+
		"\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7,\2\2\u00da"+
		"\u00db\7\"\2\2\u00db(\3\2\2\2\u00dc\u00dd\7i\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7q\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7d\2\2"+
		"\u00e2\u00e3\7{\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7x\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7\"\2\2\u00e8*\3\2\2\2\u00e9\u00ea"+
		"\7i\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7w\2\2\u00ed"+
		"\u00ee\7r\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0\7{\2\2\u00f0\u00f1\7a\2\2"+
		"\u00f1\u00f2\7u\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5"+
		"\7\"\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7i\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7w\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7d\2\2\u00fc"+
		"\u00fd\7{\2\2\u00fd\u00fe\7a\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7k\2\2"+
		"\u0100\u0101\7p\2\2\u0101\u0102\7\"\2\2\u0102.\3\2\2\2\u0103\u0104\7i"+
		"\2\2\u0104\u0105\7t\2\2\u0105\u0106\7q\2\2\u0106\u0107\7w\2\2\u0107\u0108"+
		"\7r\2\2\u0108\u0109\7d\2\2\u0109\u010a\7{\2\2\u010a\u010b\7a\2\2\u010b"+
		"\u010c\7o\2\2\u010c\u010d\7c\2\2\u010d\u010e\7z\2\2\u010e\u010f\7\"\2"+
		"\2\u010f\60\3\2\2\2\u0110\u0111\7q\2\2\u0111\u0112\7f\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7u\2\2\u0114\u0115\7v\2\2\u0115\u0116\7\"\2\2\u0116"+
		"\62\3\2\2\2\u0117\u0118\7n\2\2\u0118\u0119\7f\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7u\2\2\u011b\u011c\7v\2\2\u011c\u011d\7\"\2\2\u011d\64\3\2\2\2"+
		"\u011e\u011f\7n\2\2\u011f\u0120\7q\2\2\u0120\u0121\7f\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7u\2\2\u0123\u0124\7v\2\2\u0124\u0125\7\"\2\2\u0125"+
		"\66\3\2\2\2\u0126\u0127\7q\2\2\u0127\u0128\7v\2\2\u0128\u0129\7q\2\2\u0129"+
		"\u012a\7r\2\2\u012a\u012b\7q\2\2\u012b\u012c\7\"\2\2\u012c8\3\2\2\2\u012d"+
		"\u012e\7n\2\2\u012e\u012f\7q\2\2\u012f\u0130\7v\2\2\u0130\u0131\7q\2\2"+
		"\u0131\u0132\7r\2\2\u0132\u0133\7q\2\2\u0133\u0134\7\"\2\2\u0134:\3\2"+
		"\2\2\u0135\u0136\7p\2\2\u0136\u0137\7f\2\2\u0137\u0138\7k\2\2\u0138\u0139"+
		"\7u\2\2\u0139\u013a\7v\2\2\u013a\u013b\7\"\2\2\u013b<\3\2\2\2\u013c\u013d"+
		"\7n\2\2\u013d\u013e\7x\2\2\u013e\u013f\7k\2\2\u013f\u0140\7u\2\2\u0140"+
		"\u0141\7\"\2\2\u0141>\3\2\2\2\u0142\u0143\7r\2\2\u0143\u0144\7q\2\2\u0144"+
		"\u0145\7k\2\2\u0145\u0146\7p\2\2\u0146\u0147\7v\2\2\u0147\u0148\7o\2\2"+
		"\u0148\u0149\7g\2\2\u0149\u014a\7c\2\2\u014a\u014b\7u\2\2\u014b\u014c"+
		"\7w\2\2\u014c\u014d\7t\2\2\u014d\u014e\7g\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7\"\2\2\u0150\u0151\3\2\2\2\u0151\u0152\5Y-\2\u0152@\3\2\2\2\u0153"+
		"\u0154\7c\2\2\u0154\u0155\7o\2\2\u0155\u0156\7q\2\2\u0156\u0157\7w\2\2"+
		"\u0157\u0158\7p\2\2\u0158\u0159\7v\2\2\u0159\u015a\7r\2\2\u015a\u015b"+
		"\7c\2\2\u015b\u015c\7v\2\2\u015c\u015d\7e\2\2\u015d\u015e\7j\2\2\u015e"+
		"\u015f\7g\2\2\u015f\u0160\7u\2\2\u0160\u0161\7\"\2\2\u0161\u0162\3\2\2"+
		"\2\u0162\u0163\5Y-\2\u0163B\3\2\2\2\u0164\u0165\7e\2\2\u0165\u0166\7q"+
		"\2\2\u0166\u0167\7p\2\2\u0167\u0168\7v\2\2\u0168\u0169\7q\2\2\u0169\u016a"+
		"\7w\2\2\u016a\u016b\7t\2\2\u016b\u016c\7\"\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\5Y-\2\u016eD\3\2\2\2\u016f\u0170\7q\2\2\u0170\u0171\7d\2\2\u0171"+
		"\u0172\7l\2\2\u0172\u0173\7g\2\2\u0173\u0174\7e\2\2\u0174\u0175\7v\2\2"+
		"\u0175\u0176\7u\2\2\u0176\u0177\7\"\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\5Y-\2\u0179F\3\2\2\2\u017a\u017b\7q\2\2\u017b\u017c\7d\2\2\u017c\u017d"+
		"\7l\2\2\u017d\u017e\7g\2\2\u017e\u017f\7e\2\2\u017f\u0180\7v\2\2\u0180"+
		"\u0181\7t\2\2\u0181\u0182\7g\2\2\u0182\u0183\7i\2\2\u0183\u0184\7k\2\2"+
		"\u0184\u0185\7q\2\2\u0185\u0186\7p\2\2\u0186\u0187\7u\2\2\u0187\u0188"+
		"\7\"\2\2\u0188\u0189\3\2\2\2\u0189\u018a\5Y-\2\u018aH\3\2\2\2\u018b\u018c"+
		"\7q\2\2\u018c\u018d\7d\2\2\u018d\u018e\7l\2\2\u018e\u018f\7g\2\2\u018f"+
		"\u0190\7e\2\2\u0190\u0191\7v\2\2\u0191\u0192\7\"\2\2\u0192\u0193\3\2\2"+
		"\2\u0193\u0194\5Y-\2\u0194J\3\2\2\2\u0195\u0196\7e\2\2\u0196\u0197\7q"+
		"\2\2\u0197\u0198\7p\2\2\u0198\u0199\7v\2\2\u0199\u019a\7q\2\2\u019a\u019b"+
		"\7w\2\2\u019b\u019c\7t\2\2\u019c\u019d\7n\2\2\u019d\u019e\7k\2\2\u019e"+
		"\u019f\7p\2\2\u019f\u01a0\7g\2\2\u01a0\u01a1\7\"\2\2\u01a1\u01a2\3\2\2"+
		"\2\u01a2\u01a3\5Y-\2\u01a3L\3\2\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7d"+
		"\2\2\u01a6\u01a7\7l\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7e\2\2\u01a9\u01aa"+
		"\7v\2\2\u01aa\u01ab\7e\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7w\2\2\u01ad"+
		"\u01ae\7p\2\2\u01ae\u01af\7v\2\2\u01af\u01b0\7u\2\2\u01b0\u01b1\7\"\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\5Y-\2\u01b3N\3\2\2\2\u01b4\u01b5\7"+
		"h\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7n\2\2\u01b8\u01b9"+
		"\7f\2\2\u01b9\u01ba\7\"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5Y-\2\u01bc"+
		"P\3\2\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7p\2\2\u01bfR\3\2\2\2\u01c0\u01c1"+
		"\7v\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7w\2\2\u01c3\u01ca\7g\2\2\u01c4"+
		"\u01c5\7h\2\2\u01c5\u01c6\7c\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7u\2\2"+
		"\u01c8\u01ca\7g\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c4\3\2\2\2\u01caT\3\2"+
		"\2\2\u01cb\u01cd\t\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cfV\3\2\2\2\u01d0\u01d1\7\"\2\2"+
		"\u01d1X\3\2\2\2\u01d2\u01d4\t\3\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3"+
		"\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6Z\3\2\2\2\u01d7\u01d9"+
		"\t\4\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\b.\2\2\u01dd\\\3\2\2\2"+
		"\7\2\u01c9\u01ce\u01d5\u01da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}