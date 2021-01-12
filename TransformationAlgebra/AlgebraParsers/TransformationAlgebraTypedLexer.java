// Generated from TransformationAlgebraTyped.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TransformationAlgebraTypedLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NOM=3, ORD=4, ITV=5, RAT=6, COUNT=7, E=8, I=9, O=10, L=11, 
		S=12, BOOL=13, NOMV=14, ORDV=15, ITVV=16, RATV=17, COUNTV=18, EV=19, IV=20, 
		OV=21, LV=22, SV=23, BOOLV=24, REL=25, IMPLIED=26, DATAV=27, WHITESPACE=28, 
		KEYWORD=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NOM", "ORD", "ITV", "RAT", "COUNT", "E", "I", "O", "L", 
			"S", "BOOL", "NOMV", "ORDV", "ITVV", "RATV", "COUNTV", "EV", "IV", "OV", 
			"LV", "SV", "BOOLV", "REL", "IMPLIED", "DATAV", "WHITESPACE", "KEYWORD", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'Nom'", "'Ord'", "'Itv'", "'Ratio'", "'Count'", 
			"'Ext'", "'Int'", "'O'", "'L'", "'S'", "'Bool'", "'NomV'", "'OrdV'", 
			"'ItvV'", "'RatioV'", "'CountV'", "'ExtV'", "'IntV'", "'OV'", "'LV'", 
			"'SV'", "'BoolV'", "'*'", "'-:'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NOM", "ORD", "ITV", "RAT", "COUNT", "E", "I", "O", 
			"L", "S", "BOOL", "NOMV", "ORDV", "ITVV", "RATV", "COUNTV", "EV", "IV", 
			"OV", "LV", "SV", "BOOLV", "REL", "IMPLIED", "DATAV", "WHITESPACE", "KEYWORD", 
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


	public TransformationAlgebraTypedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TransformationAlgebraTyped.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\6\34"+
		"\u00ab\n\34\r\34\16\34\u00ac\3\35\3\35\3\36\6\36\u00b2\n\36\r\36\16\36"+
		"\u00b3\3\37\6\37\u00b7\n\37\r\37\16\37\u00b8\3\37\3\37\2\2 \3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\5"+
		"\3\2\62;\7\2//\62<C\\aac|\5\2\13\f\17\17\"\"\2\u00be\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3"+
		"?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tG\3\2\2\2\13K\3\2\2\2\rO\3\2\2\2\17U"+
		"\3\2\2\2\21[\3\2\2\2\23_\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33"+
		"i\3\2\2\2\35n\3\2\2\2\37s\3\2\2\2!x\3\2\2\2#}\3\2\2\2%\u0084\3\2\2\2\'"+
		"\u008b\3\2\2\2)\u0090\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009b\3\2"+
		"\2\2\61\u009e\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00aa\3\2\2"+
		"\29\u00ae\3\2\2\2;\u00b1\3\2\2\2=\u00b6\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB"+
		"\7+\2\2B\6\3\2\2\2CD\7P\2\2DE\7q\2\2EF\7o\2\2F\b\3\2\2\2GH\7Q\2\2HI\7"+
		"t\2\2IJ\7f\2\2J\n\3\2\2\2KL\7K\2\2LM\7v\2\2MN\7x\2\2N\f\3\2\2\2OP\7T\2"+
		"\2PQ\7c\2\2QR\7v\2\2RS\7k\2\2ST\7q\2\2T\16\3\2\2\2UV\7E\2\2VW\7q\2\2W"+
		"X\7w\2\2XY\7p\2\2YZ\7v\2\2Z\20\3\2\2\2[\\\7G\2\2\\]\7z\2\2]^\7v\2\2^\22"+
		"\3\2\2\2_`\7K\2\2`a\7p\2\2ab\7v\2\2b\24\3\2\2\2cd\7Q\2\2d\26\3\2\2\2e"+
		"f\7N\2\2f\30\3\2\2\2gh\7U\2\2h\32\3\2\2\2ij\7D\2\2jk\7q\2\2kl\7q\2\2l"+
		"m\7n\2\2m\34\3\2\2\2no\7P\2\2op\7q\2\2pq\7o\2\2qr\7X\2\2r\36\3\2\2\2s"+
		"t\7Q\2\2tu\7t\2\2uv\7f\2\2vw\7X\2\2w \3\2\2\2xy\7K\2\2yz\7v\2\2z{\7x\2"+
		"\2{|\7X\2\2|\"\3\2\2\2}~\7T\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7q\2\2\u0082\u0083\7X\2\2\u0083$\3\2\2\2\u0084\u0085"+
		"\7E\2\2\u0085\u0086\7q\2\2\u0086\u0087\7w\2\2\u0087\u0088\7p\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7X\2\2\u008a&\3\2\2\2\u008b\u008c\7G\2\2\u008c"+
		"\u008d\7z\2\2\u008d\u008e\7v\2\2\u008e\u008f\7X\2\2\u008f(\3\2\2\2\u0090"+
		"\u0091\7K\2\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\u0094\7X\2\2"+
		"\u0094*\3\2\2\2\u0095\u0096\7Q\2\2\u0096\u0097\7X\2\2\u0097,\3\2\2\2\u0098"+
		"\u0099\7N\2\2\u0099\u009a\7X\2\2\u009a.\3\2\2\2\u009b\u009c\7U\2\2\u009c"+
		"\u009d\7X\2\2\u009d\60\3\2\2\2\u009e\u009f\7D\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7X\2\2\u00a3\62\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a8\7<\2\2\u00a8"+
		"\66\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad8\3\2\2\2\u00ae\u00af"+
		"\7\"\2\2\u00af:\3\2\2\2\u00b0\u00b2\t\3\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4<\3\2\2\2"+
		"\u00b5\u00b7\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\37\2\2"+
		"\u00bb>\3\2\2\2\7\2\u00ac\u00b1\u00b3\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}