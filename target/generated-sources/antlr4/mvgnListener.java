// Generated from mvgn.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mvgnParser}.
 */
public interface mvgnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mvgnParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull mvgnParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull mvgnParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#expList}.
	 * @param ctx the parse tree
	 */
	void enterExpList(@NotNull mvgnParser.ExpListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#expList}.
	 * @param ctx the parse tree
	 */
	void exitExpList(@NotNull mvgnParser.ExpListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull mvgnParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull mvgnParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull mvgnParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull mvgnParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#formalList}.
	 * @param ctx the parse tree
	 */
	void enterFormalList(@NotNull mvgnParser.FormalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#formalList}.
	 * @param ctx the parse tree
	 */
	void exitFormalList(@NotNull mvgnParser.FormalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull mvgnParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull mvgnParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull mvgnParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull mvgnParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull mvgnParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull mvgnParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull mvgnParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull mvgnParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull mvgnParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull mvgnParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#expRest}.
	 * @param ctx the parse tree
	 */
	void enterExpRest(@NotNull mvgnParser.ExpRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#expRest}.
	 * @param ctx the parse tree
	 */
	void exitExpRest(@NotNull mvgnParser.ExpRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link mvgnParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull mvgnParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mvgnParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull mvgnParser.VarDeclContext ctx);
}