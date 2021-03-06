package antlr;// Generated by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#minijava}.
	 * @param ctx the parse tree
	 */
	void enterMinijava(MiniJavaParser.MinijavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#minijava}.
	 * @param ctx the parse tree
	 */
	void exitMinijava(MiniJavaParser.MinijavaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#declarators}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators(MiniJavaParser.DeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#declarators}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators(MiniJavaParser.DeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#primType}.
	 * @param ctx the parse tree
	 */
	void enterPrimType(MiniJavaParser.PrimTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#primType}.
	 * @param ctx the parse tree
	 */
	void exitPrimType(MiniJavaParser.PrimTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(MiniJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(MiniJavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arrType}.
	 * @param ctx the parse tree
	 */
	void enterArrType(MiniJavaParser.ArrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arrType}.
	 * @param ctx the parse tree
	 */
	void exitArrType(MiniJavaParser.ArrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MiniJavaParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MiniJavaParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MiniJavaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MiniJavaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(MiniJavaParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(MiniJavaParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(MiniJavaParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(MiniJavaParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(MiniJavaParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(MiniJavaParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(MiniJavaParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(MiniJavaParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goExp}.
	 * @param ctx the parse tree
	 */
	void enterGoExp(MiniJavaParser.GoExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goExp}.
	 * @param ctx the parse tree
	 */
	void exitGoExp(MiniJavaParser.GoExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#arthmetic}.
	 * @param ctx the parse tree
	 */
	void enterArthmetic(MiniJavaParser.ArthmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#arthmetic}.
	 * @param ctx the parse tree
	 */
	void exitArthmetic(MiniJavaParser.ArthmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#urey}.
	 * @param ctx the parse tree
	 */
	void enterUrey(MiniJavaParser.UreyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#urey}.
	 * @param ctx the parse tree
	 */
	void exitUrey(MiniJavaParser.UreyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MiniJavaParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MiniJavaParser.BoolContext ctx);
}