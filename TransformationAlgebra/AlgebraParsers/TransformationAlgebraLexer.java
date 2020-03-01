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
		FCONT=1, RATIO=2, INTERPOL=3, SIGMA1=4, DATAPM=5, DATAPAMOUNT=6, WHITESPACE=7, 
		KEYWORD=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FCONT", "RATIO", "INTERPOL", "SIGMA1", "DATAPM", "DATAPAMOUNT", "WHITESPACE", 
			"KEYWORD", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fcont '", "'ratio '", "'interpol '", "'sigma1 '", null, null, 
			"' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FCONT", "RATIO", "INTERPOL", "SIGMA1", "DATAPM", "DATAPAMOUNT", 
			"WHITESPACE", "KEYWORD", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\t\6\tw\n\t\r\t\16\tx\3\n\6\n|\n"+
		"\n\r\n\16\n}\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3"+
		"\2\4\7\2//\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0084\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\34\3\2\2\2\7#\3\2\2\2\t-\3\2\2\2"+
		"\13R\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21v\3\2\2\2\23{\3\2\2\2\25\26\7h\2"+
		"\2\26\27\7e\2\2\27\30\7q\2\2\30\31\7p\2\2\31\32\7v\2\2\32\33\7\"\2\2\33"+
		"\4\3\2\2\2\34\35\7t\2\2\35\36\7c\2\2\36\37\7v\2\2\37 \7k\2\2 !\7q\2\2"+
		"!\"\7\"\2\2\"\6\3\2\2\2#$\7k\2\2$%\7p\2\2%&\7v\2\2&\'\7g\2\2\'(\7t\2\2"+
		"()\7r\2\2)*\7q\2\2*+\7n\2\2+,\7\"\2\2,\b\3\2\2\2-.\7u\2\2./\7k\2\2/\60"+
		"\7i\2\2\60\61\7o\2\2\61\62\7c\2\2\62\63\7\63\2\2\63\64\7\"\2\2\64\n\3"+
		"\2\2\2\65\66\7r\2\2\66\67\7q\2\2\678\7k\2\289\7p\2\29:\7v\2\2:;\7o\2\2"+
		";<\7g\2\2<=\7c\2\2=>\7u\2\2>?\7w\2\2?@\7t\2\2@A\7g\2\2AS\7u\2\2BC\7r\2"+
		"\2CD\7q\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2GH\7o\2\2HI\7g\2\2IJ\7c\2\2JK\7"+
		"u\2\2KL\7w\2\2LM\7t\2\2MN\7g\2\2NO\7u\2\2OP\7\"\2\2PQ\3\2\2\2QS\5\21\t"+
		"\2R\65\3\2\2\2RB\3\2\2\2S\f\3\2\2\2TU\7c\2\2UV\7o\2\2VW\7q\2\2WX\7w\2"+
		"\2XY\7p\2\2YZ\7v\2\2Z[\7r\2\2[\\\7c\2\2\\]\7v\2\2]^\7e\2\2^_\7j\2\2_`"+
		"\7g\2\2`r\7u\2\2ab\7c\2\2bc\7o\2\2cd\7q\2\2de\7w\2\2ef\7p\2\2fg\7v\2\2"+
		"gh\7r\2\2hi\7c\2\2ij\7v\2\2jk\7e\2\2kl\7j\2\2lm\7g\2\2mn\7u\2\2no\7\""+
		"\2\2op\3\2\2\2pr\5\21\t\2qT\3\2\2\2qa\3\2\2\2r\16\3\2\2\2st\7\"\2\2t\20"+
		"\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\22\3\2\2\2"+
		"z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\b\n\2\2\u0080\24\3\2\2\2\7\2Rqx}\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}