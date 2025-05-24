// Generated from C:/Users/HP/compiler_pro/src/antlr/TypeScripteParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeScripteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeScripteParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TypeScripteParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(TypeScripteParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStmt(TypeScripteParser.ComponentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStmt(TypeScripteParser.VariableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteralStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteralStmt(TypeScripteParser.ObjectLiteralStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(TypeScripteParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStmt(TypeScripteParser.ClassStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoopStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStmt(TypeScripteParser.ForLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(TypeScripteParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(TypeScripteParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(TypeScripteParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(TypeScripteParser.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorFld(TypeScripteParser.SelectorFldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneFld(TypeScripteParser.StandaloneFldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsFld(TypeScripteParser.ImportsFldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateFld(TypeScripteParser.TemplateFldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OtherFlds}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherFlds(TypeScripteParser.OtherFldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#selectorField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorField(TypeScripteParser.SelectorFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#templateField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateField(TypeScripteParser.TemplateFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#importsField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsField(TypeScripteParser.ImportsFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#standaloneField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneField(TypeScripteParser.StandaloneFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#otherFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherFields(TypeScripteParser.OtherFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(TypeScripteParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TypeScripteParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(TypeScripteParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TypeScripteParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TypeScripteParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(TypeScripteParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TypeScripteParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(TypeScripteParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(TypeScripteParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(TypeScripteParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(TypeScripteParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(TypeScripteParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionExpr(TypeScripteParser.ArrowFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpr(TypeScripteParser.OperationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(TypeScripteParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccessExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessExpr(TypeScripteParser.PropertyAccessExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclExpr(TypeScripteParser.VarDeclExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(TypeScripteParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(TypeScripteParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(TypeScripteParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(TypeScripteParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TypeScripteParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(TypeScripteParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(TypeScripteParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(TypeScripteParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TypeScripteParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#propertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(TypeScripteParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TypeScripteParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(TypeScripteParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TypeScripteParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclWithKeyword}
	 * labeled alternative in {@link TypeScripteParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclWithKeyword(TypeScripteParser.VarDeclWithKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarReassignment}
	 * labeled alternative in {@link TypeScripteParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarReassignment(TypeScripteParser.VarReassignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompleteElement}
	 * labeled alternative in {@link TypeScripteParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteElement(TypeScripteParser.CompleteElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingElement}
	 * labeled alternative in {@link TypeScripteParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(TypeScripteParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#completeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteTag(TypeScripteParser.CompleteTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(TypeScripteParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(TypeScripteParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#closedTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosedTag(TypeScripteParser.ClosedTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#angularExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularExpression(TypeScripteParser.AngularExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAttr(TypeScripteParser.NormalAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BindingAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttr(TypeScripteParser.BindingAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectiveAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveAttr(TypeScripteParser.DirectiveAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttr(TypeScripteParser.EventAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#normalAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAttribute(TypeScripteParser.NormalAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#bindingAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttribute(TypeScripteParser.BindingAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#direvtiveAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirevtiveAttribute(TypeScripteParser.DirevtiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScripteParser#eventAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttribute(TypeScripteParser.EventAttributeContext ctx);
}