// Generated from src/main/grammarRules/DecibelParser.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DecibelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, RETURN=2, CONTINUE=3, BREAK=4, FUNCTION=5, IF=6, ELSE=7, FOR=8, 
		WHILE=9, TRUE=10, FALSE=11, AND=12, OR=13, NOT=14, BITWISE_AND=15, BITWISE_OR=16, 
		BITWISE_XOR=17, BITWISE_NOT=18, BITWISE_SHIFT_RIGHT=19, BITWISE_SHIFT_LEFT=20, 
		IDENTIFIER=21, SEMICOLON=22, COMMA=23, QUOTE=24, OPEN=25, CLOSE=26, OPEN_BRACKET=27, 
		CLOSE_BRACKET=28, OPEN_CURLY=29, CLOSE_CURLY=30, INCREMENT=31, DECREMENT=32, 
		MODULO=33, EXPONENT=34, MULTIPLY=35, DIVIDE=36, ADD=37, SUBTRACT=38, LENGTH=39, 
		GREATER_THAN=40, LESSER_THAN=41, EQUALS=42, EQUALS_TO=43, GREATER_THAN_OR_EQUAL_TO=44, 
		LESSER_THAN_OR_EQUAL_TO=45, REAL=46, WHITE_SPACE=47, COMMENT=48;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_assignment = 4, RULE_function = 5, RULE_if = 6, RULE_while = 7, RULE_for = 8, 
		RULE_assignmentOrExpression = 9, RULE_call = 10, RULE_formalParameters = 11, 
		RULE_actualParameters = 12, RULE_block = 13, RULE_list = 14, RULE_index = 15, 
		RULE_length = 16, RULE_increment = 17, RULE_prefixIncrement = 18, RULE_postfixIncrement = 19, 
		RULE_boolean = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "expression", "assignment", "function", 
			"if", "while", "for", "assignmentOrExpression", "call", "formalParameters", 
			"actualParameters", "block", "list", "index", "length", "increment", 
			"prefixIncrement", "postfixIncrement", "boolean"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'return'", "'continue'", "'break'", "'function'", "'if'", 
			"'else'", "'for'", "'while'", "'true'", "'false'", null, null, null, 
			"'&'", "'|'", "'^'", "'~'", "'>>'", "'<<'", null, "';'", "','", "'\"'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'++'", "'--'", "'%'", "'**'", 
			"'*'", "'/'", "'+'", "'-'", "'#'", "'>'", "'<'", "'='", "'=='", "'>='", 
			"'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "RETURN", "CONTINUE", "BREAK", "FUNCTION", "IF", "ELSE", 
			"FOR", "WHILE", "TRUE", "FALSE", "AND", "OR", "NOT", "BITWISE_AND", "BITWISE_OR", 
			"BITWISE_XOR", "BITWISE_NOT", "BITWISE_SHIFT_RIGHT", "BITWISE_SHIFT_LEFT", 
			"IDENTIFIER", "SEMICOLON", "COMMA", "QUOTE", "OPEN", "CLOSE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "OPEN_CURLY", "CLOSE_CURLY", "INCREMENT", "DECREMENT", 
			"MODULO", "EXPONENT", "MULTIPLY", "DIVIDE", "ADD", "SUBTRACT", "LENGTH", 
			"GREATER_THAN", "LESSER_THAN", "EQUALS", "EQUALS_TO", "GREATER_THAN_OR_EQUAL_TO", 
			"LESSER_THAN_OR_EQUAL_TO", "REAL", "WHITE_SPACE", "COMMENT"
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
	public String getGrammarFileName() { return "DecibelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecibelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			statements();
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70787673378686L) != 0)) {
				{
				{
				setState(44);
				statement();
				}
				}
				setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatmentContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(DecibelParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecibelParser.SEMICOLON, 0); }
		public ReturnStatmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitReturnStatment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatementContext extends StatementContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecibelParser.SEMICOLON, 0); }
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecibelParser.SEMICOLON, 0); }
		public BaseStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitBaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(DecibelParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecibelParser.SEMICOLON, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(DecibelParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecibelParser.SEMICOLON, 0); }
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BaseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				expression(0);
				setState(51);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assignment();
				setState(54);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				function();
				}
				break;
			case 4:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				if_();
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				while_();
				}
				break;
			case 6:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				for_();
				}
				break;
			case 7:
				_localctx = new ReturnStatmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(RETURN);
				setState(61);
				expression(0);
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(64);
				match(CONTINUE);
				setState(65);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				match(BREAK);
				setState(67);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(DecibelParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(DecibelParser.SUBTRACT, 0); }
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_SHIFT_RIGHT() { return getToken(DecibelParser.BITWISE_SHIFT_RIGHT, 0); }
		public TerminalNode BITWISE_SHIFT_LEFT() { return getToken(DecibelParser.BITWISE_SHIFT_LEFT, 0); }
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseExpressionContext extends ExpressionContext {
		public TerminalNode OPEN() { return getToken(DecibelParser.OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(DecibelParser.CLOSE, 0); }
		public BaseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitBaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(DecibelParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(DecibelParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(DecibelParser.MODULO, 0); }
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitMultiplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(DecibelParser.GREATER_THAN, 0); }
		public TerminalNode LESSER_THAN() { return getToken(DecibelParser.LESSER_THAN, 0); }
		public TerminalNode EQUALS_TO() { return getToken(DecibelParser.EQUALS_TO, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL_TO() { return getToken(DecibelParser.GREATER_THAN_OR_EQUAL_TO, 0); }
		public TerminalNode LESSER_THAN_OR_EQUAL_TO() { return getToken(DecibelParser.LESSER_THAN_OR_EQUAL_TO, 0); }
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_OR() { return getToken(DecibelParser.BITWISE_OR, 0); }
		public TerminalNode BITWISE_XOR() { return getToken(DecibelParser.BITWISE_XOR, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementExpressionContext extends ExpressionContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public IncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthExpressionContext extends ExpressionContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public LengthExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitLengthExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExpressionContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DecibelParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecibelParser.OR, 0); }
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(DecibelParser.EXPONENT, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends ExpressionContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(DecibelParser.STRING, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_AND() { return getToken(DecibelParser.BITWISE_AND, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpressionContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealExpressionContext extends ExpressionContext {
		public TerminalNode REAL() { return getToken(DecibelParser.REAL, 0); }
		public RealExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitRealExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DecibelParser.NOT, 0); }
		public TerminalNode SUBTRACT() { return getToken(DecibelParser.SUBTRACT, 0); }
		public TerminalNode ADD() { return getToken(DecibelParser.ADD, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExpressionContext extends ExpressionContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitListExpression(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new BaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(71);
				match(OPEN);
				setState(72);
				expression(0);
				setState(73);
				match(CLOSE);
				}
				break;
			case 2:
				{
				_localctx = new IncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				increment();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316876800L) != 0)) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				expression(9);
				}
				break;
			case 4:
				{
				_localctx = new CallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				call();
				}
				break;
			case 5:
				{
				_localctx = new IndexExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				index();
				}
				break;
			case 6:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				list();
				}
				break;
			case 7:
				{
				_localctx = new LengthExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				length();
				}
				break;
			case 8:
				{
				_localctx = new RealExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(REAL);
				}
				break;
			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				boolean_();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(89);
						match(EXPONENT);
						setState(90);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(92);
						((MultiplicationExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 111669149696L) != 0)) ) {
							((MultiplicationExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(95);
						((AdditionExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
							((AdditionExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(98);
						((ShiftExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BITWISE_SHIFT_RIGHT || _la==BITWISE_SHIFT_LEFT) ) {
							((ShiftExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(101);
						((LogicalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(103);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(104);
						match(BITWISE_AND);
						setState(105);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(107);
						((LogicalOrExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BITWISE_OR || _la==BITWISE_XOR) ) {
							((LogicalOrExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(109);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(110);
						((ComparisonExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64871186038784L) != 0)) ) {
							((ComparisonExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(111);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(DecibelParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IDENTIFIER);
			setState(118);
			match(EQUALS);
			setState(119);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DecibelParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode OPEN() { return getToken(DecibelParser.OPEN, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(DecibelParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FUNCTION);
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(OPEN);
			setState(124);
			formalParameters();
			setState(125);
			match(CLOSE);
			setState(126);
			block();
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DecibelParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecibelParser.ELSE, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			expression(0);
			setState(130);
			block();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(131);
				match(ELSE);
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_CURLY:
					{
					setState(132);
					block();
					}
					break;
				case IF:
					{
					setState(133);
					if_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DecibelParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHILE);
			setState(139);
			expression(0);
			setState(140);
			block();
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DecibelParser.FOR, 0); }
		public TerminalNode OPEN() { return getToken(DecibelParser.OPEN, 0); }
		public List<AssignmentOrExpressionContext> assignmentOrExpression() {
			return getRuleContexts(AssignmentOrExpressionContext.class);
		}
		public AssignmentOrExpressionContext assignmentOrExpression(int i) {
			return getRuleContext(AssignmentOrExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(DecibelParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(DecibelParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(DecibelParser.CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOR);
			setState(143);
			match(OPEN);
			setState(144);
			assignmentOrExpression();
			setState(145);
			match(SEMICOLON);
			setState(146);
			expression(0);
			setState(147);
			match(SEMICOLON);
			setState(148);
			assignmentOrExpression();
			setState(149);
			match(CLOSE);
			setState(150);
			block();
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
	public static class AssignmentOrExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitAssignmentOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOrExpressionContext assignmentOrExpression() throws RecognitionException {
		AssignmentOrExpressionContext _localctx = new AssignmentOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentOrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(152);
				assignment();
				}
				break;
			case 2:
				{
				setState(153);
				expression(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode OPEN() { return getToken(DecibelParser.OPEN, 0); }
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(DecibelParser.CLOSE, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(OPEN);
			setState(158);
			actualParameters();
			setState(159);
			match(CLOSE);
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
	public static class FormalParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DecibelParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DecibelParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecibelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecibelParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(161);
				match(IDENTIFIER);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					match(IDENTIFIER);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActualParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecibelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecibelParser.COMMA, i);
		}
		public ActualParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitActualParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParametersContext actualParameters() throws RecognitionException {
		ActualParametersContext _localctx = new ActualParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actualParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70787673377794L) != 0)) {
				{
				setState(171);
				expression(0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					expression(0);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(DecibelParser.OPEN_CURLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(DecibelParser.CLOSE_CURLY, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(OPEN_CURLY);
			setState(182);
			statements();
			setState(183);
			match(CLOSE_CURLY);
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(DecibelParser.OPEN_BRACKET, 0); }
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DecibelParser.CLOSE_BRACKET, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(OPEN_BRACKET);
			setState(186);
			actualParameters();
			setState(187);
			match(CLOSE_BRACKET);
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
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(DecibelParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(DecibelParser.CLOSE_BRACKET, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IDENTIFIER);
			setState(190);
			match(OPEN_BRACKET);
			setState(191);
			expression(0);
			setState(192);
			match(CLOSE_BRACKET);
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
	public static class LengthContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode LENGTH() { return getToken(DecibelParser.LENGTH, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IDENTIFIER);
			setState(195);
			match(LENGTH);
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
	public static class IncrementContext extends ParserRuleContext {
		public PrefixIncrementContext prefixIncrement() {
			return getRuleContext(PrefixIncrementContext.class,0);
		}
		public PostfixIncrementContext postfixIncrement() {
			return getRuleContext(PostfixIncrementContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_increment);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				prefixIncrement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				postfixIncrement();
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
	public static class PrefixIncrementContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode INCREMENT() { return getToken(DecibelParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(DecibelParser.DECREMENT, 0); }
		public PrefixIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixIncrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitPrefixIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixIncrementContext prefixIncrement() throws RecognitionException {
		PrefixIncrementContext _localctx = new PrefixIncrementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prefixIncrement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((PrefixIncrementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				((PrefixIncrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			match(IDENTIFIER);
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
	public static class PostfixIncrementContext extends ParserRuleContext {
		public Token op;
		public TerminalNode IDENTIFIER() { return getToken(DecibelParser.IDENTIFIER, 0); }
		public TerminalNode INCREMENT() { return getToken(DecibelParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(DecibelParser.DECREMENT, 0); }
		public PostfixIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixIncrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitPostfixIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixIncrementContext postfixIncrement() throws RecognitionException {
		PostfixIncrementContext _localctx = new PostfixIncrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_postfixIncrement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENTIFIER);
			setState(205);
			((PostfixIncrementContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				((PostfixIncrementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DecibelParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DecibelParser.FALSE, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecibelParserVisitor ) return ((DecibelParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"E\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"W\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003q\b\u0003\n\u0003\f\u0003t\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006"+
		"\u0003\u0006\u0089\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0003\t\u009b\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a5\b\u000b"+
		"\n\u000b\f\u000b\u00a8\t\u000b\u0003\u000b\u00aa\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00af\b\f\n\f\f\f\u00b2\t\f\u0003\f\u00b4\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00c8\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001\u0006\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\t\u0002\u0000\u000e\u000e%&\u0002\u0000!!#$\u0001\u0000%"+
		"&\u0001\u0000\u0013\u0014\u0001\u0000\f\r\u0001\u0000\u0010\u0011\u0002"+
		"\u0000()+-\u0001\u0000\u001f \u0001\u0000\n\u000b\u00df\u0000*\u0001\u0000"+
		"\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000"+
		"\u0006V\u0001\u0000\u0000\u0000\bu\u0001\u0000\u0000\u0000\ny\u0001\u0000"+
		"\u0000\u0000\f\u0080\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000"+
		"\u0000\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u009a\u0001\u0000\u0000"+
		"\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000"+
		"\u0000\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000\u0000"+
		"\u0000\u001c\u00b9\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000"+
		"\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00c7\u0001\u0000\u0000\u0000"+
		"$\u00c9\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000\u0000(\u00cf"+
		"\u0001\u0000\u0000\u0000*+\u0003\u0002\u0001\u0000+\u0001\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\u0003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0003\u0006"+
		"\u0003\u000034\u0005\u0016\u0000\u00004E\u0001\u0000\u0000\u000056\u0003"+
		"\b\u0004\u000067\u0005\u0016\u0000\u00007E\u0001\u0000\u0000\u00008E\u0003"+
		"\n\u0005\u00009E\u0003\f\u0006\u0000:E\u0003\u000e\u0007\u0000;E\u0003"+
		"\u0010\b\u0000<=\u0005\u0002\u0000\u0000=>\u0003\u0006\u0003\u0000>?\u0005"+
		"\u0016\u0000\u0000?E\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000"+
		"AE\u0005\u0016\u0000\u0000BC\u0005\u0004\u0000\u0000CE\u0005\u0016\u0000"+
		"\u0000D2\u0001\u0000\u0000\u0000D5\u0001\u0000\u0000\u0000D8\u0001\u0000"+
		"\u0000\u0000D9\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000\u0000D;\u0001"+
		"\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0006\u0003"+
		"\uffff\uffff\u0000GH\u0005\u0019\u0000\u0000HI\u0003\u0006\u0003\u0000"+
		"IJ\u0005\u001a\u0000\u0000JW\u0001\u0000\u0000\u0000KW\u0003\"\u0011\u0000"+
		"LM\u0007\u0000\u0000\u0000MW\u0003\u0006\u0003\tNW\u0003\u0014\n\u0000"+
		"OW\u0003\u001e\u000f\u0000PW\u0003\u001c\u000e\u0000QW\u0003 \u0010\u0000"+
		"RW\u0005.\u0000\u0000SW\u0005\u0001\u0000\u0000TW\u0003(\u0014\u0000U"+
		"W\u0005\u0015\u0000\u0000VF\u0001\u0000\u0000\u0000VK\u0001\u0000\u0000"+
		"\u0000VL\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VO\u0001\u0000"+
		"\u0000\u0000VP\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000VR\u0001"+
		"\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000Wr\u0001\u0000\u0000\u0000XY\n\u0011\u0000\u0000"+
		"YZ\u0005\"\u0000\u0000Zq\u0003\u0006\u0003\u0012[\\\n\u0010\u0000\u0000"+
		"\\]\u0007\u0001\u0000\u0000]q\u0003\u0006\u0003\u0011^_\n\u000f\u0000"+
		"\u0000_`\u0007\u0002\u0000\u0000`q\u0003\u0006\u0003\u0010ab\n\u000e\u0000"+
		"\u0000bc\u0007\u0003\u0000\u0000cq\u0003\u0006\u0003\u000fde\n\r\u0000"+
		"\u0000ef\u0007\u0004\u0000\u0000fq\u0003\u0006\u0003\u000egh\n\f\u0000"+
		"\u0000hi\u0005\u000f\u0000\u0000iq\u0003\u0006\u0003\rjk\n\u000b\u0000"+
		"\u0000kl\u0007\u0005\u0000\u0000lq\u0003\u0006\u0003\fmn\n\n\u0000\u0000"+
		"no\u0007\u0006\u0000\u0000oq\u0003\u0006\u0003\u000bpX\u0001\u0000\u0000"+
		"\u0000p[\u0001\u0000\u0000\u0000p^\u0001\u0000\u0000\u0000pa\u0001\u0000"+
		"\u0000\u0000pd\u0001\u0000\u0000\u0000pg\u0001\u0000\u0000\u0000pj\u0001"+
		"\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0007\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0015\u0000\u0000vw\u0005"+
		"*\u0000\u0000wx\u0003\u0006\u0003\u0000x\t\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0005\u0000\u0000z{\u0005\u0015\u0000\u0000{|\u0005\u0019\u0000\u0000"+
		"|}\u0003\u0016\u000b\u0000}~\u0005\u001a\u0000\u0000~\u007f\u0003\u001a"+
		"\r\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0006\u0000"+
		"\u0000\u0081\u0082\u0003\u0006\u0003\u0000\u0082\u0088\u0003\u001a\r\u0000"+
		"\u0083\u0086\u0005\u0007\u0000\u0000\u0084\u0087\u0003\u001a\r\u0000\u0085"+
		"\u0087\u0003\f\u0006\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0083"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\r\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\t\u0000\u0000\u008b\u008c\u0003\u0006"+
		"\u0003\u0000\u008c\u008d\u0003\u001a\r\u0000\u008d\u000f\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\b\u0000\u0000\u008f\u0090\u0005\u0019\u0000\u0000"+
		"\u0090\u0091\u0003\u0012\t\u0000\u0091\u0092\u0005\u0016\u0000\u0000\u0092"+
		"\u0093\u0003\u0006\u0003\u0000\u0093\u0094\u0005\u0016\u0000\u0000\u0094"+
		"\u0095\u0003\u0012\t\u0000\u0095\u0096\u0005\u001a\u0000\u0000\u0096\u0097"+
		"\u0003\u001a\r\u0000\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u009b\u0003"+
		"\b\u0004\u0000\u0099\u009b\u0003\u0006\u0003\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0013\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e\u0005\u0019"+
		"\u0000\u0000\u009e\u009f\u0003\u0018\f\u0000\u009f\u00a0\u0005\u001a\u0000"+
		"\u0000\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a6\u0005\u0015\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0017\u0000\u0000\u00a3\u00a5\u0005\u0015\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a1\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003\u0006\u0003"+
		"\u0000\u00ac\u00ad\u0005\u0017\u0000\u0000\u00ad\u00af\u0003\u0006\u0003"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u0019\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u001d\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0002\u0001\u0000\u00b7\u00b8\u0005\u001e\u0000"+
		"\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u001b\u0000"+
		"\u0000\u00ba\u00bb\u0003\u0018\f\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000"+
		"\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0015\u0000\u0000"+
		"\u00be\u00bf\u0005\u001b\u0000\u0000\u00bf\u00c0\u0003\u0006\u0003\u0000"+
		"\u00c0\u00c1\u0005\u001c\u0000\u0000\u00c1\u001f\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0015\u0000\u0000\u00c3\u00c4\u0005\'\u0000\u0000\u00c4"+
		"!\u0001\u0000\u0000\u0000\u00c5\u00c8\u0003$\u0012\u0000\u00c6\u00c8\u0003"+
		"&\u0013\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8#\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0007\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0015\u0000\u0000\u00cb%\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0015\u0000\u0000\u00cd\u00ce\u0007\u0007\u0000\u0000"+
		"\u00ce\'\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007\b\u0000\u0000\u00d0"+
		")\u0001\u0000\u0000\u0000\r/DVpr\u0086\u0088\u009a\u00a6\u00a9\u00b0\u00b3"+
		"\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}