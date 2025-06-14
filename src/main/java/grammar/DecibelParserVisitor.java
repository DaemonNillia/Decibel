// Generated from src/main/grammarRules/DecibelParser.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecibelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecibelParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DecibelParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DecibelParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(DecibelParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseStatement(DecibelParser.BaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(DecibelParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(DecibelParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DecibelParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(DecibelParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(DecibelParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatment}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatment(DecibelParser.ReturnStatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(DecibelParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link DecibelParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(DecibelParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(DecibelParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(DecibelParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpression(DecibelParser.BaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(DecibelParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpression(DecibelParser.MultiplicationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(DecibelParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(DecibelParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpression(DecibelParser.IncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lengthExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthExpression(DecibelParser.LengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(DecibelParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(DecibelParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(DecibelParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(DecibelParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(DecibelParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(DecibelParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpression(DecibelParser.IndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealExpression(DecibelParser.RealExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DecibelParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link DecibelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(DecibelParser.ListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DecibelParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DecibelParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DecibelParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(DecibelParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(DecibelParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#assignmentOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOrExpression(DecibelParser.AssignmentOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(DecibelParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(DecibelParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#actualParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameters(DecibelParser.ActualParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DecibelParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(DecibelParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(DecibelParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(DecibelParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(DecibelParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#prefixIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixIncrement(DecibelParser.PrefixIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#postfixIncrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixIncrement(DecibelParser.PostfixIncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecibelParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(DecibelParser.BooleanContext ctx);
}