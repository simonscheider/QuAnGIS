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
		PI1=17, PI2=18, SIGMAE2=19, SIGMASE2=20, BOWTIE=21, BOWTIESTAR=22, BOWTIERATIO=23, 
		GROUPBYAVG=24, GROUPBYSUM=25, GROUPBYMIN=26, GROUPBYMAX=27, GROUPBYSIZE=28, 
		GROUPBYCOUNT=29, ODIST=30, LDIST=31, LODIST=32, OTOPO=33, LOTOPO=34, NDIST=35, 
		LVIS=36, DATAPM=37, DATAAMOUNT=38, DATACONTOUR=39, DATAOBJQ=40, DATAOBJS=41, 
		DATAOBJV=42, DATACONTOURLINE=43, DATAOBJCOUNT=44, DATAFIELD=45, TOPOV=46, 
		BOOLV=47, DATAV=48, WHITESPACE=49, KEYWORD=50, WS=51;
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
			"PI2", "SIGMAE2", "SIGMASE2", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", 
			"GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", 
			"GROUPBYCOUNT", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", 
			"LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
			"DATAOBJV", "DATACONTOURLINE", "DATAOBJCOUNT", "DATAFIELD", "TOPOV", 
			"BOOLV", "DATAV", "WHITESPACE", "KEYWORD", "WS"
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
			null, null, null, null, null, "'in'", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "INVERT", 
			"REVERT", "MERGE", "FCONT", "OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", 
			"PI2", "SIGMAE2", "SIGMASE2", "BOWTIE", "BOWTIESTAR", "BOWTIERATIO", 
			"GROUPBYAVG", "GROUPBYSUM", "GROUPBYMIN", "GROUPBYMAX", "GROUPBYSIZE", 
			"GROUPBYCOUNT", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", "NDIST", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u022c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0218\n\60\3\61\6\61\u021b\n\61\r"+
		"\61\16\61\u021c\3\62\3\62\3\63\6\63\u0222\n\63\r\63\16\63\u0223\3\64\6"+
		"\64\u0227\n\64\r\64\16\64\u0228\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\5\3\2\62;\6\2//C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u022f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2"+
		"\5n\3\2\2\2\7s\3\2\2\2\tx\3\2\2\2\13}\3\2\2\2\r\u0084\3\2\2\2\17\u008b"+
		"\3\2\2\2\21\u0092\3\2\2\2\23\u0097\3\2\2\2\25\u009f\3\2\2\2\27\u00a7\3"+
		"\2\2\2\31\u00ae\3\2\2\2\33\u00b5\3\2\2\2\35\u00bc\3\2\2\2\37\u00c2\3\2"+
		"\2\2!\u00c9\3\2\2\2#\u00d3\3\2\2\2%\u00d8\3\2\2\2\'\u00dd\3\2\2\2)\u00e5"+
		"\3\2\2\2+\u00ee\3\2\2\2-\u00f6\3\2\2\2/\u00ff\3\2\2\2\61\u010d\3\2\2\2"+
		"\63\u011a\3\2\2\2\65\u0127\3\2\2\2\67\u0134\3\2\2\29\u0141\3\2\2\2;\u014f"+
		"\3\2\2\2=\u015e\3\2\2\2?\u0165\3\2\2\2A\u016c\3\2\2\2C\u0174\3\2\2\2E"+
		"\u017b\3\2\2\2G\u0183\3\2\2\2I\u018a\3\2\2\2K\u0190\3\2\2\2M\u01a1\3\2"+
		"\2\2O\u01b2\3\2\2\2Q\u01bd\3\2\2\2S\u01c8\3\2\2\2U\u01d9\3\2\2\2W\u01e3"+
		"\3\2\2\2Y\u01f2\3\2\2\2[\u0202\3\2\2\2]\u020b\3\2\2\2_\u0217\3\2\2\2a"+
		"\u021a\3\2\2\2c\u021e\3\2\2\2e\u0221\3\2\2\2g\u0226\3\2\2\2ij\7c\2\2j"+
		"k\7x\2\2kl\7i\2\2lm\7\"\2\2m\4\3\2\2\2no\7o\2\2op\7k\2\2pq\7p\2\2qr\7"+
		"\"\2\2r\6\3\2\2\2st\7o\2\2tu\7c\2\2uv\7z\2\2vw\7\"\2\2w\b\3\2\2\2xy\7"+
		"u\2\2yz\7w\2\2z{\7o\2\2{|\7\"\2\2|\n\3\2\2\2}~\7e\2\2~\177\7q\2\2\177"+
		"\u0080\7w\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\u0083\7\"\2"+
		"\2\u0083\f\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7"+
		"k\2\2\u0087\u0088\7h\2\2\u0088\u0089\7{\2\2\u0089\u008a\7\"\2\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\7f\2\2\u008c\u008d\7g\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7h\2\2\u008f\u0090\7{\2\2\u0090\u0091\7\"\2\2\u0091\20\3\2\2\2"+
		"\u0092\u0093\7i\2\2\u0093\u0094\7g\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7\"\2\2\u0096\22\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7x\2\2\u009a\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7\"\2\2\u009e\24\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7"+
		"g\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7\"\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7o\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7i\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\u00ad\7\"\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7"+
		"e\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7\"\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7e\2\2\u00b7"+
		"\u00b8\7q\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7\"\2"+
		"\2\u00bb\34\3\2\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2\2\u00be\u00bf"+
		"\7|\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7\"\2\2\u00c1\36\3\2\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7k\2\2"+
		"\u00c6\u00c7\7q\2\2\u00c7\u00c8\7\"\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7k"+
		"\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7\"\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7\63\2\2\u00d6\u00d7\7\"\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7r\2\2"+
		"\u00d9\u00da\7k\2\2\u00da\u00db\7\64\2\2\u00db\u00dc\7\"\2\2\u00dc&\3"+
		"\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7i\2\2\u00e0"+
		"\u00e1\7o\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7\"\2"+
		"\2\u00e4(\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7"+
		"i\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ec\u00ed\7\"\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0"+
		"\7q\2\2\u00f0\u00f1\7y\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7g\2\2\u00f4\u00f5\7\"\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7"+
		"\u00f8\7q\2\2\u00f8\u00f9\7y\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7k\2\2"+
		"\u00fb\u00fc\7g\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7\"\2\2\u00fe.\3\2"+
		"\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7q\2\2\u0101\u0102\7y\2\2\u0102\u0103"+
		"\7v\2\2\u0103\u0104\7k\2\2\u0104\u0105\7g\2\2\u0105\u0106\7a\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7c\2\2\u0108\u0109\7v\2\2\u0109\u010a\7k\2\2"+
		"\u010a\u010b\7q\2\2\u010b\u010c\7\"\2\2\u010c\60\3\2\2\2\u010d\u010e\7"+
		"i\2\2\u010e\u010f\7t\2\2\u010f\u0110\7q\2\2\u0110\u0111\7w\2\2\u0111\u0112"+
		"\7r\2\2\u0112\u0113\7d\2\2\u0113\u0114\7{\2\2\u0114\u0115\7a\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7x\2\2\u0117\u0118\7i\2\2\u0118\u0119\7\"\2"+
		"\2\u0119\62\3\2\2\2\u011a\u011b\7i\2\2\u011b\u011c\7t\2\2\u011c\u011d"+
		"\7q\2\2\u011d\u011e\7w\2\2\u011e\u011f\7r\2\2\u011f\u0120\7d\2\2\u0120"+
		"\u0121\7{\2\2\u0121\u0122\7a\2\2\u0122\u0123\7u\2\2\u0123\u0124\7w\2\2"+
		"\u0124\u0125\7o\2\2\u0125\u0126\7\"\2\2\u0126\64\3\2\2\2\u0127\u0128\7"+
		"i\2\2\u0128\u0129\7t\2\2\u0129\u012a\7q\2\2\u012a\u012b\7w\2\2\u012b\u012c"+
		"\7r\2\2\u012c\u012d\7d\2\2\u012d\u012e\7{\2\2\u012e\u012f\7a\2\2\u012f"+
		"\u0130\7o\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132\u0133\7\"\2"+
		"\2\u0133\66\3\2\2\2\u0134\u0135\7i\2\2\u0135\u0136\7t\2\2\u0136\u0137"+
		"\7q\2\2\u0137\u0138\7w\2\2\u0138\u0139\7r\2\2\u0139\u013a\7d\2\2\u013a"+
		"\u013b\7{\2\2\u013b\u013c\7a\2\2\u013c\u013d\7o\2\2\u013d\u013e\7c\2\2"+
		"\u013e\u013f\7z\2\2\u013f\u0140\7\"\2\2\u01408\3\2\2\2\u0141\u0142\7i"+
		"\2\2\u0142\u0143\7t\2\2\u0143\u0144\7q\2\2\u0144\u0145\7w\2\2\u0145\u0146"+
		"\7r\2\2\u0146\u0147\7d\2\2\u0147\u0148\7{\2\2\u0148\u0149\7a\2\2\u0149"+
		"\u014a\7u\2\2\u014a\u014b\7k\2\2\u014b\u014c\7|\2\2\u014c\u014d\7g\2\2"+
		"\u014d\u014e\7\"\2\2\u014e:\3\2\2\2\u014f\u0150\7i\2\2\u0150\u0151\7t"+
		"\2\2\u0151\u0152\7q\2\2\u0152\u0153\7w\2\2\u0153\u0154\7r\2\2\u0154\u0155"+
		"\7d\2\2\u0155\u0156\7{\2\2\u0156\u0157\7a\2\2\u0157\u0158\7e\2\2\u0158"+
		"\u0159\7q\2\2\u0159\u015a\7w\2\2\u015a\u015b\7p\2\2\u015b\u015c\7v\2\2"+
		"\u015c\u015d\7\"\2\2\u015d<\3\2\2\2\u015e\u015f\7q\2\2\u015f\u0160\7f"+
		"\2\2\u0160\u0161\7k\2\2\u0161\u0162\7u\2\2\u0162\u0163\7v\2\2\u0163\u0164"+
		"\7\"\2\2\u0164>\3\2\2\2\u0165\u0166\7n\2\2\u0166\u0167\7f\2\2\u0167\u0168"+
		"\7k\2\2\u0168\u0169\7u\2\2\u0169\u016a\7v\2\2\u016a\u016b\7\"\2\2\u016b"+
		"@\3\2\2\2\u016c\u016d\7n\2\2\u016d\u016e\7q\2\2\u016e\u016f\7f\2\2\u016f"+
		"\u0170\7k\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2\u0172\u0173\7\"\2"+
		"\2\u0173B\3\2\2\2\u0174\u0175\7q\2\2\u0175\u0176\7v\2\2\u0176\u0177\7"+
		"q\2\2\u0177\u0178\7r\2\2\u0178\u0179\7q\2\2\u0179\u017a\7\"\2\2\u017a"+
		"D\3\2\2\2\u017b\u017c\7n\2\2\u017c\u017d\7q\2\2\u017d\u017e\7v\2\2\u017e"+
		"\u017f\7q\2\2\u017f\u0180\7r\2\2\u0180\u0181\7q\2\2\u0181\u0182\7\"\2"+
		"\2\u0182F\3\2\2\2\u0183\u0184\7p\2\2\u0184\u0185\7f\2\2\u0185\u0186\7"+
		"k\2\2\u0186\u0187\7u\2\2\u0187\u0188\7v\2\2\u0188\u0189\7\"\2\2\u0189"+
		"H\3\2\2\2\u018a\u018b\7n\2\2\u018b\u018c\7x\2\2\u018c\u018d\7k\2\2\u018d"+
		"\u018e\7u\2\2\u018e\u018f\7\"\2\2\u018fJ\3\2\2\2\u0190\u0191\7r\2\2\u0191"+
		"\u0192\7q\2\2\u0192\u0193\7k\2\2\u0193\u0194\7p\2\2\u0194\u0195\7v\2\2"+
		"\u0195\u0196\7o\2\2\u0196\u0197\7g\2\2\u0197\u0198\7c\2\2\u0198\u0199"+
		"\7u\2\2\u0199\u019a\7w\2\2\u019a\u019b\7t\2\2\u019b\u019c\7g\2\2\u019c"+
		"\u019d\7u\2\2\u019d\u019e\7\"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5e\63"+
		"\2\u01a0L\3\2\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7o\2\2\u01a3\u01a4\7"+
		"q\2\2\u01a4\u01a5\7w\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8"+
		"\7r\2\2\u01a8\u01a9\7c\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7e\2\2\u01ab"+
		"\u01ac\7j\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7\"\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5e\63\2\u01b1N\3\2\2\2\u01b2\u01b3"+
		"\7e\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7v\2\2\u01b6"+
		"\u01b7\7q\2\2\u01b7\u01b8\7w\2\2\u01b8\u01b9\7t\2\2\u01b9\u01ba\7\"\2"+
		"\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5e\63\2\u01bcP\3\2\2\2\u01bd\u01be"+
		"\7q\2\2\u01be\u01bf\7d\2\2\u01bf\u01c0\7l\2\2\u01c0\u01c1\7g\2\2\u01c1"+
		"\u01c2\7e\2\2\u01c2\u01c3\7v\2\2\u01c3\u01c4\7u\2\2\u01c4\u01c5\7\"\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\5e\63\2\u01c7R\3\2\2\2\u01c8\u01c9"+
		"\7q\2\2\u01c9\u01ca\7d\2\2\u01ca\u01cb\7l\2\2\u01cb\u01cc\7g\2\2\u01cc"+
		"\u01cd\7e\2\2\u01cd\u01ce\7v\2\2\u01ce\u01cf\7t\2\2\u01cf\u01d0\7g\2\2"+
		"\u01d0\u01d1\7i\2\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4"+
		"\7p\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7\"\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\5e\63\2\u01d8T\3\2\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7d\2\2\u01db"+
		"\u01dc\7l\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7e\2\2\u01de\u01df\7v\2\2"+
		"\u01df\u01e0\7\"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5e\63\2\u01e2V\3"+
		"\2\2\2\u01e3\u01e4\7e\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6\7p\2\2\u01e6"+
		"\u01e7\7v\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7w\2\2\u01e9\u01ea\7t\2\2"+
		"\u01ea\u01eb\7n\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee"+
		"\7g\2\2\u01ee\u01ef\7\"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\5e\63\2\u01f1"+
		"X\3\2\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4\7d\2\2\u01f4\u01f5\7l\2\2\u01f5"+
		"\u01f6\7g\2\2\u01f6\u01f7\7e\2\2\u01f7\u01f8\7v\2\2\u01f8\u01f9\7e\2\2"+
		"\u01f9\u01fa\7q\2\2\u01fa\u01fb\7w\2\2\u01fb\u01fc\7p\2\2\u01fc\u01fd"+
		"\7v\2\2\u01fd\u01fe\7u\2\2\u01fe\u01ff\7\"\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\5e\63\2\u0201Z\3\2\2\2\u0202\u0203\7h\2\2\u0203\u0204\7k\2\2\u0204"+
		"\u0205\7g\2\2\u0205\u0206\7n\2\2\u0206\u0207\7f\2\2\u0207\u0208\7\"\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u020a\5e\63\2\u020a\\\3\2\2\2\u020b\u020c"+
		"\7k\2\2\u020c\u020d\7p\2\2\u020d^\3\2\2\2\u020e\u020f\7v\2\2\u020f\u0210"+
		"\7t\2\2\u0210\u0211\7w\2\2\u0211\u0218\7g\2\2\u0212\u0213\7h\2\2\u0213"+
		"\u0214\7c\2\2\u0214\u0215\7n\2\2\u0215\u0216\7u\2\2\u0216\u0218\7g\2\2"+
		"\u0217\u020e\3\2\2\2\u0217\u0212\3\2\2\2\u0218`\3\2\2\2\u0219\u021b\t"+
		"\2\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021db\3\2\2\2\u021e\u021f\7\"\2\2\u021fd\3\2\2\2\u0220"+
		"\u0222\t\3\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224f\3\2\2\2\u0225\u0227\t\4\2\2\u0226\u0225"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022b\b\64\2\2\u022bh\3\2\2\2\7\2\u0217\u021c\u0223"+
		"\u0228\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}