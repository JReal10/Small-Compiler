// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(pythonParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(pythonParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(pythonParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(pythonParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(pythonParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(pythonParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(pythonParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(pythonParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(pythonParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(pythonParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(pythonParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(pythonParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(pythonParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(pythonParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterIteration(pythonParser.IterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitIteration(pythonParser.IterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(pythonParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(pythonParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#total}.
	 * @param ctx the parse tree
	 */
	void enterTotal(pythonParser.TotalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#total}.
	 * @param ctx the parse tree
	 */
	void exitTotal(pythonParser.TotalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(pythonParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(pythonParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(pythonParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(pythonParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquals(pythonParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquals(pythonParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(pythonParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(pythonParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparisson}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisson(pythonParser.ComparissonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparisson}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisson(pythonParser.ComparissonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVARIABLE(pythonParser.VARIABLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VARIABLE}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVARIABLE(pythonParser.VARIABLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(pythonParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(pythonParser.ParenContext ctx);
}