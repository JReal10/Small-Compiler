// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(pythonParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(pythonParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(pythonParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(pythonParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(pythonParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(pythonParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(pythonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration(pythonParser.IterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(pythonParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#total}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotal(pythonParser.TotalContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(pythonParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(pythonParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(pythonParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(pythonParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparisson}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisson(pythonParser.ComparissonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVARIABLE(pythonParser.VARIABLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(pythonParser.ParenContext ctx);
}