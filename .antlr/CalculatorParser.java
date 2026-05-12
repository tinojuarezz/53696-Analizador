// Generated from c:/Users/Usuario/ssl-antlr-calculator/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MIENTRAS=1, IMPRIMIR=2, VERDADERO=3, FALSO=4, LLLAVE=5, RLLAVE=6, LPAREN=7, 
		RPAREN=8, PUNTOYCOMA=9, CADENA=10, WS=11;
	public static final int
		RULE_prog = 0, RULE_instruc = 1, RULE_bucle = 2, RULE_salida = 3, RULE_condicion = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "instruc", "bucle", "salida", "condicion"
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

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<InstrucContext> instruc() {
			return getRuleContexts(InstrucContext.class);
		}
		public InstrucContext instruc(int i) {
			return getRuleContext(InstrucContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				instruc();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MIENTRAS || _la==IMPRIMIR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucContext extends ParserRuleContext {
		public InstrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruc; }
	 
		public InstrucContext() { }
		public void copyFrom(InstrucContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrucBucleContext extends InstrucContext {
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public InstrucBucleContext(InstrucContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrucSalidaContext extends InstrucContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public InstrucSalidaContext(InstrucContext ctx) { copyFrom(ctx); }
	}

	public final InstrucContext instruc() throws RecognitionException {
		InstrucContext _localctx = new InstrucContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruc);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIENTRAS:
				_localctx = new InstrucBucleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				bucle();
				}
				break;
			case IMPRIMIR:
				_localctx = new InstrucSalidaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				salida();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleContext extends ParserRuleContext {
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
	 
		public BucleContext() { }
		public void copyFrom(BucleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaBucleContext extends BucleContext {
		public TerminalNode MIENTRAS() { return getToken(CalculatorParser.MIENTRAS, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode LLLAVE() { return getToken(CalculatorParser.LLLAVE, 0); }
		public TerminalNode RLLAVE() { return getToken(CalculatorParser.RLLAVE, 0); }
		public List<InstrucContext> instruc() {
			return getRuleContexts(InstrucContext.class);
		}
		public InstrucContext instruc(int i) {
			return getRuleContext(InstrucContext.class,i);
		}
		public SentenciaBucleContext(BucleContext ctx) { copyFrom(ctx); }
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bucle);
		int _la;
		try {
			_localctx = new SentenciaBucleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(MIENTRAS);
			setState(20);
			condicion();
			setState(21);
			match(LLLAVE);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MIENTRAS || _la==IMPRIMIR) {
				{
				{
				setState(22);
				instruc();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(RLLAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
	 
		public SalidaContext() { }
		public void copyFrom(SalidaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaSalidaContext extends SalidaContext {
		public TerminalNode IMPRIMIR() { return getToken(CalculatorParser.IMPRIMIR, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode CADENA() { return getToken(CalculatorParser.CADENA, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(CalculatorParser.PUNTOYCOMA, 0); }
		public SentenciaSalidaContext(SalidaContext ctx) { copyFrom(ctx); }
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_salida);
		try {
			_localctx = new SentenciaSalidaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(IMPRIMIR);
			setState(31);
			match(LPAREN);
			setState(32);
			match(CADENA);
			setState(33);
			match(RPAREN);
			setState(34);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionVerdaderoContext extends CondicionContext {
		public TerminalNode VERDADERO() { return getToken(CalculatorParser.VERDADERO, 0); }
		public CondicionVerdaderoContext(CondicionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionFalsoContext extends CondicionContext {
		public TerminalNode FALSO() { return getToken(CalculatorParser.FALSO, 0); }
		public CondicionFalsoContext(CondicionContext ctx) { copyFrom(ctx); }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADERO:
				_localctx = new CondicionVerdaderoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(VERDADERO);
				}
				break;
			case FALSO:
				_localctx = new CondicionFalsoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(FALSO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u0018\b\u0002\n\u0002\f\u0002\u001b\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004\'\b\u0004\u0001\u0004\u0000"+
		"\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000\'\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u0013\u0001"+
		"\u0000\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b&\u0001\u0000"+
		"\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0012\u0003"+
		"\u0004\u0002\u0000\u0010\u0012\u0003\u0006\u0003\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0003\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0003"+
		"\b\u0004\u0000\u0015\u0019\u0005\u0005\u0000\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005\u0006\u0000\u0000\u001d\u0005\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f \u0005\u0007\u0000"+
		"\u0000 !\u0005\n\u0000\u0000!\"\u0005\b\u0000\u0000\"#\u0005\t\u0000\u0000"+
		"#\u0007\u0001\u0000\u0000\u0000$\'\u0005\u0003\u0000\u0000%\'\u0005\u0004"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\t\u0001"+
		"\u0000\u0000\u0000\u0004\r\u0011\u0019&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}