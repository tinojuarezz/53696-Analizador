// Generated from c:/Users/Usuario/ssl-antlr-calculator/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MIENTRAS=1, IMPRIMIR=2, VERDADERO=3, FALSO=4, LLLAVE=5, RLLAVE=6, LPAREN=7, 
		RPAREN=8, PUNTOYCOMA=9, CADENA=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MIENTRAS", "IMPRIMIR", "VERDADERO", "FALSO", "LLLAVE", "RLLAVE", "LPAREN", 
			"RPAREN", "PUNTOYCOMA", "CADENA", "CARACTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mientras'", "'imprimir'", "'verdadero'", "'falso'", "'{'", "'}'", 
			"'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MIENTRAS", "IMPRIMIR", "VERDADERO", "FALSO", "LLLAVE", "RLLAVE", 
			"LPAREN", "RPAREN", "PUNTOYCOMA", "CADENA", "WS"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u000bX\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tH\b\t\n\t\f\tK\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0003\nP\b\n\u0001\u000b\u0004\u000bS\b\u000b"+
		"\u000b\u000b\f\u000bT\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u0000\u0017\u000b\u0001\u0000\u0002\u0007\u0000"+
		" !,,..0;??AZaz\u0003\u0000\t\n\r\r  X\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019"+
		"\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005+\u0001"+
		"\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000"+
		"\u0000\u000b=\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000f"+
		"A\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001"+
		"\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005m\u0000\u0000\u001a\u001b\u0005i\u0000\u0000\u001b"+
		"\u001c\u0005e\u0000\u0000\u001c\u001d\u0005n\u0000\u0000\u001d\u001e\u0005"+
		"t\u0000\u0000\u001e\u001f\u0005r\u0000\u0000\u001f \u0005a\u0000\u0000"+
		" !\u0005s\u0000\u0000!\u0002\u0001\u0000\u0000\u0000\"#\u0005i\u0000\u0000"+
		"#$\u0005m\u0000\u0000$%\u0005p\u0000\u0000%&\u0005r\u0000\u0000&\'\u0005"+
		"i\u0000\u0000\'(\u0005m\u0000\u0000()\u0005i\u0000\u0000)*\u0005r\u0000"+
		"\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005v\u0000\u0000,-\u0005e\u0000"+
		"\u0000-.\u0005r\u0000\u0000./\u0005d\u0000\u0000/0\u0005a\u0000\u0000"+
		"01\u0005d\u0000\u000012\u0005e\u0000\u000023\u0005r\u0000\u000034\u0005"+
		"o\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005f\u0000\u000067\u0005"+
		"a\u0000\u000078\u0005l\u0000\u000089\u0005s\u0000\u00009:\u0005o\u0000"+
		"\u0000:\b\u0001\u0000\u0000\u0000;<\u0005{\u0000\u0000<\n\u0001\u0000"+
		"\u0000\u0000=>\u0005}\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005("+
		"\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005)\u0000\u0000B\u0010"+
		"\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u0012\u0001\u0000\u0000"+
		"\u0000EI\u0005\"\u0000\u0000FH\u0003\u0015\n\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005"+
		"\"\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NP\u0007\u0000\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QS\u0007\u0001"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0006\u000b\u0000\u0000W\u0018\u0001\u0000\u0000\u0000\u0004\u0000"+
		"IOT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}