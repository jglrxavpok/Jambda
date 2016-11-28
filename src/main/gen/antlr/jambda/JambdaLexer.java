// Generated from F:/Programming/Java/Languages/Jambda/src/main/java/antlr/jambda\Jambda.g4 by ANTLR 4.5.3
package antlr.jambda;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JambdaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FLOAT_TERMINATOR=6, DOUBLE_COLON=7, 
		DIGIT=8, PERIOD=9, PLUS=10, MINUS=11, MULTIPLY=12, DIVISION=13, COLON=14, 
		LEFT_PAREN=15, RIGHT_PAREN=16, SMALL_ARROW=17, EQUAL_SIGN=18, IDENTIFIER=19, 
		LOWERCASE_LETTER=20, UPPERCASE_LETTER=21, WHITESPACE=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "FLOAT_TERMINATOR", "DOUBLE_COLON", 
		"DIGIT", "PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "EQUAL_SIGN", "IDENTIFIER", "LOWERCASE_LETTER", 
		"UPPERCASE_LETTER", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'package '", "'import '", "'\\u03BB'", "'lambda '", "'f'", 
		"'::'", null, "'.'", "'+'", "'-'", "'*'", "'/'", "':'", "'('", "')'", 
		"'->'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "FLOAT_TERMINATOR", "DOUBLE_COLON", 
		"DIGIT", "PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "EQUAL_SIGN", "IDENTIFIER", "LOWERCASE_LETTER", 
		"UPPERCASE_LETTER", "WHITESPACE"
	};
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


	public JambdaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\6\24j\n\24\r\24\16\24k\3\25\3\25\3\26\3\26\3\27\6"+
		"\27s\n\27\r\27\16\27t\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"\3\2\4\5\2C\\aac|\5\2\13\f\17\17\"\"y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7:\3\2\2\2\tB\3\2"+
		"\2\2\13D\3\2\2\2\rL\3\2\2\2\17N\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3"+
		"\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3"+
		"\2\2\2#c\3\2\2\2%f\3\2\2\2\'i\3\2\2\2)m\3\2\2\2+o\3\2\2\2-r\3\2\2\2/\60"+
		"\7.\2\2\60\4\3\2\2\2\61\62\7r\2\2\62\63\7c\2\2\63\64\7e\2\2\64\65\7m\2"+
		"\2\65\66\7c\2\2\66\67\7i\2\2\678\7g\2\289\7\"\2\29\6\3\2\2\2:;\7k\2\2"+
		";<\7o\2\2<=\7r\2\2=>\7q\2\2>?\7t\2\2?@\7v\2\2@A\7\"\2\2A\b\3\2\2\2BC\7"+
		"\u03bd\2\2C\n\3\2\2\2DE\7n\2\2EF\7c\2\2FG\7o\2\2GH\7d\2\2HI\7f\2\2IJ\7"+
		"c\2\2JK\7\"\2\2K\f\3\2\2\2LM\7h\2\2M\16\3\2\2\2NO\7<\2\2OP\7<\2\2P\20"+
		"\3\2\2\2QR\4\62;\2R\22\3\2\2\2ST\7\60\2\2T\24\3\2\2\2UV\7-\2\2V\26\3\2"+
		"\2\2WX\7/\2\2X\30\3\2\2\2YZ\7,\2\2Z\32\3\2\2\2[\\\7\61\2\2\\\34\3\2\2"+
		"\2]^\7<\2\2^\36\3\2\2\2_`\7*\2\2` \3\2\2\2ab\7+\2\2b\"\3\2\2\2cd\7/\2"+
		"\2de\7@\2\2e$\3\2\2\2fg\7?\2\2g&\3\2\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2"+
		"ki\3\2\2\2kl\3\2\2\2l(\3\2\2\2mn\4c|\2n*\3\2\2\2op\4C\\\2p,\3\2\2\2qs"+
		"\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\27\2\2"+
		"w.\3\2\2\2\5\2kt\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}