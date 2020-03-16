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
		PI1=17, PI2=18, SIGMAE2=19, SIGMASE2=20, BOWTIE=21, BOWTIESTAR=22, GROUPBYAVG=23, 
		GROUPBYSUM=24, GROUPBYMIN=25, GROUPBYMAX=26, ODIST=27, LDIST=28, LODIST=29, 
		OTOPO=30, LOTOPO=31, NDIST=32, LVIS=33, DATAPM=34, DATAAMOUNT=35, DATACONTOUR=36, 
		DATAOBJQ=37, DATAOBJS=38, DATAOBJV=39, DATACONTOURLINE=40, DATAOBJCOUNT=41, 
		DATAFIELD=42, TOPOV=43, BOOLV=44, DATAV=45, WHITESPACE=46, KEYWORD=47, 
		WS=48;
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
			"PI2", "SIGMAE2", "SIGMASE2", "BOWTIE", "BOWTIESTAR", "GROUPBYAVG", "GROUPBYSUM", 
			"GROUPBYMIN", "GROUPBYMAX", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", 
			"NDIST", "LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
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
			"'sigmae '", "'sigmale '", "'bowtie '", "'bowtie* '", "'groupby_avg '", 
			"'groupby_sum '", "'groupby_min '", "'groupby_max '", "'odist '", "'ldist '", 
			"'lodist '", "'otopo '", "'lotopo '", "'ndist '", "'lvis '", null, null, 
			null, null, null, null, null, null, null, "'in'", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AVG", "MIN", "MAX", "SUM", "COUNT", "REIFY", "DEIFY", "GET", "INVERT", 
			"REVERT", "MERGE", "FCONT", "OCONT", "SIZE", "RATIO", "INTERPOL", "PI1", 
			"PI2", "SIGMAE2", "SIGMASE2", "BOWTIE", "BOWTIESTAR", "GROUPBYAVG", "GROUPBYSUM", 
			"GROUPBYMIN", "GROUPBYMAX", "ODIST", "LDIST", "LODIST", "OTOPO", "LOTOPO", 
			"NDIST", "LVIS", "DATAPM", "DATAAMOUNT", "DATACONTOUR", "DATAOBJQ", "DATAOBJS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u01fb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\3"+
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
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\5-\u01e7\n-\3.\6.\u01ea\n.\r.\16.\u01eb\3/\3/\3"+
		"\60\6\60\u01f1\n\60\r\60\16\60\u01f2\3\61\6\61\u01f6\n\61\r\61\16\61\u01f7"+
		"\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\5"+
		"\3\2\62;\6\2//C\\aac|\5\2\13\f\17\17\"\"\2\u01fe\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5h\3"+
		"\2\2\2\7m\3\2\2\2\tr\3\2\2\2\13w\3\2\2\2\r~\3\2\2\2\17\u0085\3\2\2\2\21"+
		"\u008c\3\2\2\2\23\u0091\3\2\2\2\25\u0099\3\2\2\2\27\u00a1\3\2\2\2\31\u00a8"+
		"\3\2\2\2\33\u00af\3\2\2\2\35\u00b6\3\2\2\2\37\u00bc\3\2\2\2!\u00c3\3\2"+
		"\2\2#\u00cd\3\2\2\2%\u00d2\3\2\2\2\'\u00d7\3\2\2\2)\u00df\3\2\2\2+\u00e8"+
		"\3\2\2\2-\u00f0\3\2\2\2/\u00f9\3\2\2\2\61\u0106\3\2\2\2\63\u0113\3\2\2"+
		"\2\65\u0120\3\2\2\2\67\u012d\3\2\2\29\u0134\3\2\2\2;\u013b\3\2\2\2=\u0143"+
		"\3\2\2\2?\u014a\3\2\2\2A\u0152\3\2\2\2C\u0159\3\2\2\2E\u015f\3\2\2\2G"+
		"\u0170\3\2\2\2I\u0181\3\2\2\2K\u018c\3\2\2\2M\u0197\3\2\2\2O\u01a8\3\2"+
		"\2\2Q\u01b2\3\2\2\2S\u01c1\3\2\2\2U\u01d1\3\2\2\2W\u01da\3\2\2\2Y\u01e6"+
		"\3\2\2\2[\u01e9\3\2\2\2]\u01ed\3\2\2\2_\u01f0\3\2\2\2a\u01f5\3\2\2\2c"+
		"d\7c\2\2de\7x\2\2ef\7i\2\2fg\7\"\2\2g\4\3\2\2\2hi\7o\2\2ij\7k\2\2jk\7"+
		"p\2\2kl\7\"\2\2l\6\3\2\2\2mn\7o\2\2no\7c\2\2op\7z\2\2pq\7\"\2\2q\b\3\2"+
		"\2\2rs\7u\2\2st\7w\2\2tu\7o\2\2uv\7\"\2\2v\n\3\2\2\2wx\7e\2\2xy\7q\2\2"+
		"yz\7w\2\2z{\7p\2\2{|\7v\2\2|}\7\"\2\2}\f\3\2\2\2~\177\7t\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\u0083\7{\2\2\u0083"+
		"\u0084\7\"\2\2\u0084\16\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7g\2\2"+
		"\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089\u008a\7{\2\2\u008a\u008b"+
		"\7\"\2\2\u008b\20\3\2\2\2\u008c\u008d\7i\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7\"\2\2\u0090\22\3\2\2\2\u0091\u0092\7k\2\2"+
		"\u0092\u0093\7p\2\2\u0093\u0094\7x\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7t\2\2\u0096\u0097\7v\2\2\u0097\u0098\7\"\2\2\u0098\24\3\2\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7x\2\2\u009c\u009d\7g\2\2"+
		"\u009d\u009e\7t\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7\"\2\2\u00a0\26\3"+
		"\2\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7i\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7\"\2\2\u00a7\30\3\2\2\2"+
		"\u00a8\u00a9\7h\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7\"\2\2\u00ae\32\3\2\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7p\2\2"+
		"\u00b3\u00b4\7v\2\2\u00b4\u00b5\7\"\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7"+
		"u\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7|\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7\"\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7\"\2"+
		"\2\u00c2 \3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7"+
		"v\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7\"\2\2\u00cc\"\3\2\2\2\u00cd\u00ce"+
		"\7r\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7\63\2\2\u00d0\u00d1\7\"\2\2\u00d1"+
		"$\3\2\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7\64\2\2\u00d5"+
		"\u00d6\7\"\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7i\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7\"\2\2\u00de(\3\2\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7k"+
		"\2\2\u00e1\u00e2\7i\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7n\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7\"\2\2\u00e7*\3\2\2\2\u00e8\u00e9"+
		"\7d\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7v\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7\"\2\2\u00ef,\3\2\2\2\u00f0"+
		"\u00f1\7d\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7y\2\2\u00f3\u00f4\7v\2\2"+
		"\u00f4\u00f5\7k\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8"+
		"\7\"\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7d\2\2\u00ff"+
		"\u0100\7{\2\2\u0100\u0101\7a\2\2\u0101\u0102\7c\2\2\u0102\u0103\7x\2\2"+
		"\u0103\u0104\7i\2\2\u0104\u0105\7\"\2\2\u0105\60\3\2\2\2\u0106\u0107\7"+
		"i\2\2\u0107\u0108\7t\2\2\u0108\u0109\7q\2\2\u0109\u010a\7w\2\2\u010a\u010b"+
		"\7r\2\2\u010b\u010c\7d\2\2\u010c\u010d\7{\2\2\u010d\u010e\7a\2\2\u010e"+
		"\u010f\7u\2\2\u010f\u0110\7w\2\2\u0110\u0111\7o\2\2\u0111\u0112\7\"\2"+
		"\2\u0112\62\3\2\2\2\u0113\u0114\7i\2\2\u0114\u0115\7t\2\2\u0115\u0116"+
		"\7q\2\2\u0116\u0117\7w\2\2\u0117\u0118\7r\2\2\u0118\u0119\7d\2\2\u0119"+
		"\u011a\7{\2\2\u011a\u011b\7a\2\2\u011b\u011c\7o\2\2\u011c\u011d\7k\2\2"+
		"\u011d\u011e\7p\2\2\u011e\u011f\7\"\2\2\u011f\64\3\2\2\2\u0120\u0121\7"+
		"i\2\2\u0121\u0122\7t\2\2\u0122\u0123\7q\2\2\u0123\u0124\7w\2\2\u0124\u0125"+
		"\7r\2\2\u0125\u0126\7d\2\2\u0126\u0127\7{\2\2\u0127\u0128\7a\2\2\u0128"+
		"\u0129\7o\2\2\u0129\u012a\7c\2\2\u012a\u012b\7z\2\2\u012b\u012c\7\"\2"+
		"\2\u012c\66\3\2\2\2\u012d\u012e\7q\2\2\u012e\u012f\7f\2\2\u012f\u0130"+
		"\7k\2\2\u0130\u0131\7u\2\2\u0131\u0132\7v\2\2\u0132\u0133\7\"\2\2\u0133"+
		"8\3\2\2\2\u0134\u0135\7n\2\2\u0135\u0136\7f\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7u\2\2\u0138\u0139\7v\2\2\u0139\u013a\7\"\2\2\u013a:\3\2\2\2\u013b"+
		"\u013c\7n\2\2\u013c\u013d\7q\2\2\u013d\u013e\7f\2\2\u013e\u013f\7k\2\2"+
		"\u013f\u0140\7u\2\2\u0140\u0141\7v\2\2\u0141\u0142\7\"\2\2\u0142<\3\2"+
		"\2\2\u0143\u0144\7q\2\2\u0144\u0145\7v\2\2\u0145\u0146\7q\2\2\u0146\u0147"+
		"\7r\2\2\u0147\u0148\7q\2\2\u0148\u0149\7\"\2\2\u0149>\3\2\2\2\u014a\u014b"+
		"\7n\2\2\u014b\u014c\7q\2\2\u014c\u014d\7v\2\2\u014d\u014e\7q\2\2\u014e"+
		"\u014f\7r\2\2\u014f\u0150\7q\2\2\u0150\u0151\7\"\2\2\u0151@\3\2\2\2\u0152"+
		"\u0153\7p\2\2\u0153\u0154\7f\2\2\u0154\u0155\7k\2\2\u0155\u0156\7u\2\2"+
		"\u0156\u0157\7v\2\2\u0157\u0158\7\"\2\2\u0158B\3\2\2\2\u0159\u015a\7n"+
		"\2\2\u015a\u015b\7x\2\2\u015b\u015c\7k\2\2\u015c\u015d\7u\2\2\u015d\u015e"+
		"\7\"\2\2\u015eD\3\2\2\2\u015f\u0160\7r\2\2\u0160\u0161\7q\2\2\u0161\u0162"+
		"\7k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7v\2\2\u0164\u0165\7o\2\2\u0165"+
		"\u0166\7g\2\2\u0166\u0167\7c\2\2\u0167\u0168\7u\2\2\u0168\u0169\7w\2\2"+
		"\u0169\u016a\7t\2\2\u016a\u016b\7g\2\2\u016b\u016c\7u\2\2\u016c\u016d"+
		"\7\"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\5_\60\2\u016fF\3\2\2\2\u0170"+
		"\u0171\7c\2\2\u0171\u0172\7o\2\2\u0172\u0173\7q\2\2\u0173\u0174\7w\2\2"+
		"\u0174\u0175\7p\2\2\u0175\u0176\7v\2\2\u0176\u0177\7r\2\2\u0177\u0178"+
		"\7c\2\2\u0178\u0179\7v\2\2\u0179\u017a\7e\2\2\u017a\u017b\7j\2\2\u017b"+
		"\u017c\7g\2\2\u017c\u017d\7u\2\2\u017d\u017e\7\"\2\2\u017e\u017f\3\2\2"+
		"\2\u017f\u0180\5_\60\2\u0180H\3\2\2\2\u0181\u0182\7e\2\2\u0182\u0183\7"+
		"q\2\2\u0183\u0184\7p\2\2\u0184\u0185\7v\2\2\u0185\u0186\7q\2\2\u0186\u0187"+
		"\7w\2\2\u0187\u0188\7t\2\2\u0188\u0189\7\"\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\5_\60\2\u018bJ\3\2\2\2\u018c\u018d\7q\2\2\u018d\u018e\7d\2\2\u018e"+
		"\u018f\7l\2\2\u018f\u0190\7g\2\2\u0190\u0191\7e\2\2\u0191\u0192\7v\2\2"+
		"\u0192\u0193\7u\2\2\u0193\u0194\7\"\2\2\u0194\u0195\3\2\2\2\u0195\u0196"+
		"\5_\60\2\u0196L\3\2\2\2\u0197\u0198\7q\2\2\u0198\u0199\7d\2\2\u0199\u019a"+
		"\7l\2\2\u019a\u019b\7g\2\2\u019b\u019c\7e\2\2\u019c\u019d\7v\2\2\u019d"+
		"\u019e\7t\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7i\2\2\u01a0\u01a1\7k\2\2"+
		"\u01a1\u01a2\7q\2\2\u01a2\u01a3\7p\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5"+
		"\7\"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\5_\60\2\u01a7N\3\2\2\2\u01a8"+
		"\u01a9\7q\2\2\u01a9\u01aa\7d\2\2\u01aa\u01ab\7l\2\2\u01ab\u01ac\7g\2\2"+
		"\u01ac\u01ad\7e\2\2\u01ad\u01ae\7v\2\2\u01ae\u01af\7\"\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b1\5_\60\2\u01b1P\3\2\2\2\u01b2\u01b3\7e\2\2\u01b3\u01b4"+
		"\7q\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7\7q\2\2\u01b7"+
		"\u01b8\7w\2\2\u01b8\u01b9\7t\2\2\u01b9\u01ba\7n\2\2\u01ba\u01bb\7k\2\2"+
		"\u01bb\u01bc\7p\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7\"\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c0\5_\60\2\u01c0R\3\2\2\2\u01c1\u01c2\7q\2\2\u01c2\u01c3"+
		"\7d\2\2\u01c3\u01c4\7l\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7e\2\2\u01c6"+
		"\u01c7\7v\2\2\u01c7\u01c8\7e\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca\7w\2\2"+
		"\u01ca\u01cb\7p\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7u\2\2\u01cd\u01ce"+
		"\7\"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\5_\60\2\u01d0T\3\2\2\2\u01d1"+
		"\u01d2\7h\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7n\2\2"+
		"\u01d5\u01d6\7f\2\2\u01d6\u01d7\7\"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\5_\60\2\u01d9V\3\2\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7p\2\2\u01dcX\3"+
		"\2\2\2\u01dd\u01de\7v\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7w\2\2\u01e0"+
		"\u01e7\7g\2\2\u01e1\u01e2\7h\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7n\2\2"+
		"\u01e4\u01e5\7u\2\2\u01e5\u01e7\7g\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01e1"+
		"\3\2\2\2\u01e7Z\3\2\2\2\u01e8\u01ea\t\2\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\\\3\2\2\2"+
		"\u01ed\u01ee\7\"\2\2\u01ee^\3\2\2\2\u01ef\u01f1\t\3\2\2\u01f0\u01ef\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"`\3\2\2\2\u01f4\u01f6\t\4\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\b\61\2\2\u01fab\3\2\2\2\7\2\u01e6\u01eb\u01f2\u01f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}