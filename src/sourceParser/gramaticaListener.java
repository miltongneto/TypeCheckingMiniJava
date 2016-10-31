package sourceParser;

// Generated from gramatica.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull gramaticaParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull gramaticaParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull gramaticaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull gramaticaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull gramaticaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull gramaticaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull gramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull gramaticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull gramaticaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull gramaticaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(@NotNull gramaticaParser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(@NotNull gramaticaParser.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull gramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull gramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull gramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull gramaticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull gramaticaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull gramaticaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull gramaticaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull gramaticaParser.ClassDeclarationContext ctx);
}