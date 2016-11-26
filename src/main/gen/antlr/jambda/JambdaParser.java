// Generated from F:/Programming/Java/Languages/Jambda/src/main/java/antlr/jambda\Jambda.g4 by ANTLR 4.5.3
package antlr.jambda;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JambdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FLOAT_TERMINATOR=6, DOUBLE_COLON=7, 
		DIGIT=8, PERIOD=9, PLUS=10, MINUS=11, MULTIPLY=12, DIVISION=13, COLON=14, 
		LEFT_PAREN=15, RIGHT_PAREN=16, SMALL_ARROW=17, IDENTIFIER=18, LOWERCASE_LETTER=19, 
		UPPERCASE_LETTER=20, WHITESPACE=21;
	public static final int
		RULE_file = 0, RULE_function = 1, RULE_functionDeclaration = 2, RULE_packageDeclaration = 3, 
		RULE_importDeclaration = 4, RULE_lambda = 5, RULE_identifiers = 6, RULE_value = 7, 
		RULE_floatingPointNumber = 8, RULE_expression = 9, RULE_integer = 10, 
		RULE_operator = 11, RULE_letter = 12;
	public static final String[] ruleNames = {
		"file", "function", "functionDeclaration", "packageDeclaration", "importDeclaration", 
		"lambda", "identifiers", "value", "floatingPointNumber", "expression", 
		"integer", "operator", "letter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package '", "'import '", "'\\u03BB'", "'lambda '", "','", "'f'", 
		"'::'", null, "'.'", "'+'", "'-'", "'*'", "'/'", "':'", "'('", "')'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "FLOAT_TERMINATOR", "DOUBLE_COLON", 
		"DIGIT", "PERIOD", "PLUS", "MINUS", "MULTIPLY", "DIVISION", "COLON", "LEFT_PAREN", 
		"RIGHT_PAREN", "SMALL_ARROW", "IDENTIFIER", "LOWERCASE_LETTER", "UPPERCASE_LETTER", 
		"WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "Jambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JambdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(26);
				packageDeclaration();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(29);
				importDeclaration();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(35);
				functionDeclaration();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FunctionContext extends ParserRuleContext {
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(JambdaParser.PERIOD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			lambda();
			setState(42);
			identifiers();
			setState(43);
			match(PERIOD);
			setState(44);
			expression(0);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(JambdaParser.COLON, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(JambdaParser.DOUBLE_COLON, 0); }
		public TerminalNode SMALL_ARROW() { return getToken(JambdaParser.SMALL_ARROW, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(IDENTIFIER);
			setState(51);
			_la = _input.LA(1);
			if (_la==DOUBLE_COLON) {
				{
				setState(47);
				match(DOUBLE_COLON);
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(SMALL_ARROW);
				setState(50);
				match(IDENTIFIER);
				}
			}

			setState(53);
			match(COLON);
			setState(54);
			function();
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(IDENTIFIER);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(58);
				match(PERIOD);
				setState(59);
				match(IDENTIFIER);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			match(IDENTIFIER);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(67);
				match(PERIOD);
				setState(68);
				match(IDENTIFIER);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LambdaContext extends ParserRuleContext {
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class IdentifiersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(JambdaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(JambdaParser.IDENTIFIER, i);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(77);
				match(T__4);
				setState(78);
				match(IDENTIFIER);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JambdaParser.IDENTIFIER, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatingPointNumberContext floatingPointNumber() {
			return getRuleContext(FloatingPointNumberContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				integer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				floatingPointNumber();
				}
				break;
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

	public static class FloatingPointNumberContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TerminalNode PERIOD() { return getToken(JambdaParser.PERIOD, 0); }
		public TerminalNode FLOAT_TERMINATOR() { return getToken(JambdaParser.FLOAT_TERMINATOR, 0); }
		public FloatingPointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterFloatingPointNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitFloatingPointNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitFloatingPointNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatingPointNumberContext floatingPointNumber() throws RecognitionException {
		FloatingPointNumberContext _localctx = new FloatingPointNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_floatingPointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			integer();
			setState(90);
			match(PERIOD);
			setState(91);
			integer();
			setState(92);
			match(FLOAT_TERMINATOR);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(JambdaParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(JambdaParser.RIGHT_PAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch (_input.LA(1)) {
			case DIGIT:
			case IDENTIFIER:
				{
				setState(95);
				value();
				}
				break;
			case T__2:
			case T__3:
				{
				setState(96);
				function();
				}
				break;
			case LEFT_PAREN:
				{
				setState(97);
				match(LEFT_PAREN);
				setState(98);
				expression(0);
				setState(99);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(103);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(104);
					operator();
					setState(105);
					expression(4);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(JambdaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(JambdaParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(JambdaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JambdaParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(JambdaParser.MULTIPLY, 0); }
		public TerminalNode DIVISION() { return getToken(JambdaParser.DIVISION, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVISION))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode LOWERCASE_LETTER() { return getToken(JambdaParser.LOWERCASE_LETTER, 0); }
		public TerminalNode UPPERCASE_LETTER() { return getToken(JambdaParser.UPPERCASE_LETTER, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JambdaListener ) ((JambdaListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JambdaVisitor ) return ((JambdaVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_letter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==LOWERCASE_LETTER || _la==UPPERCASE_LETTER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3"+
		"\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\66\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\6\3\6"+
		"\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\b\3\b\3\b\7\bR\n\b\f\b\16\b"+
		"U\13\b\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13h\n\13\3\13\3\13\3\13\3\13\7\13n\n\13\f\13\16\13q\13"+
		"\13\3\f\6\ft\n\f\r\f\16\fu\3\r\3\r\3\16\3\16\3\16\2\3\24\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\5\3\2\5\6\3\2\f\17\3\2\25\26{\2\35\3\2\2\2\4"+
		"+\3\2\2\2\6\60\3\2\2\2\b:\3\2\2\2\nC\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20"+
		"Y\3\2\2\2\22[\3\2\2\2\24g\3\2\2\2\26s\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2"+
		"\34\36\5\b\5\2\35\34\3\2\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37!\5\n\6\2 \37"+
		"\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#(\3\2\2\2$\"\3\2\2\2%\'\5\6\4"+
		"\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\5\f"+
		"\7\2,-\5\16\b\2-.\7\13\2\2./\5\24\13\2/\5\3\2\2\2\60\65\7\24\2\2\61\62"+
		"\7\t\2\2\62\63\7\24\2\2\63\64\7\23\2\2\64\66\7\24\2\2\65\61\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\678\7\20\2\289\5\4\3\29\7\3\2\2\2:;\7\3\2\2"+
		";@\7\24\2\2<=\7\13\2\2=?\7\24\2\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\t\3\2\2\2B@\3\2\2\2CD\7\4\2\2DI\7\24\2\2EF\7\13\2\2FH\7\24\2\2G"+
		"E\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LM\t\2\2"+
		"\2M\r\3\2\2\2NS\7\24\2\2OP\7\7\2\2PR\7\24\2\2QO\3\2\2\2RU\3\2\2\2SQ\3"+
		"\2\2\2ST\3\2\2\2T\17\3\2\2\2US\3\2\2\2VZ\7\24\2\2WZ\5\26\f\2XZ\5\22\n"+
		"\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\21\3\2\2\2[\\\5\26\f\2\\]\7\13\2\2]"+
		"^\5\26\f\2^_\7\b\2\2_\23\3\2\2\2`a\b\13\1\2ah\5\20\t\2bh\5\4\3\2cd\7\21"+
		"\2\2de\5\24\13\2ef\7\22\2\2fh\3\2\2\2g`\3\2\2\2gb\3\2\2\2gc\3\2\2\2ho"+
		"\3\2\2\2ij\f\5\2\2jk\5\30\r\2kl\5\24\13\6ln\3\2\2\2mi\3\2\2\2nq\3\2\2"+
		"\2om\3\2\2\2op\3\2\2\2p\25\3\2\2\2qo\3\2\2\2rt\7\n\2\2sr\3\2\2\2tu\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2v\27\3\2\2\2wx\t\3\2\2x\31\3\2\2\2yz\t\4\2\2z"+
		"\33\3\2\2\2\r\35\"(\65@ISYgou";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}