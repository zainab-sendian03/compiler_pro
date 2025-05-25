// Generated from C:/Users/HP/compiler_pro/src/antlr/TypeScripteParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScripteParser}.
 */
public interface TypeScripteParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TypeScripteParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TypeScripteParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(TypeScripteParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(TypeScripteParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentStmt(TypeScripteParser.ComponentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentStmt(TypeScripteParser.ComponentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(TypeScripteParser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(TypeScripteParser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralStmt(TypeScripteParser.ObjectLiteralStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralStmt(TypeScripteParser.ObjectLiteralStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(TypeScripteParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(TypeScripteParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassStmt(TypeScripteParser.ClassStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassStmt(TypeScripteParser.ClassStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoopStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStmt(TypeScripteParser.ForLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoopStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStmt(TypeScripteParser.ForLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(TypeScripteParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link TypeScripteParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(TypeScripteParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(TypeScripteParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(TypeScripteParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(TypeScripteParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(TypeScripteParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(TypeScripteParser.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(TypeScripteParser.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void enterSelectorFld(TypeScripteParser.SelectorFldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void exitSelectorFld(TypeScripteParser.SelectorFldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneFld(TypeScripteParser.StandaloneFldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneFld(TypeScripteParser.StandaloneFldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void enterImportsFld(TypeScripteParser.ImportsFldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void exitImportsFld(TypeScripteParser.ImportsFldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void enterTemplateFld(TypeScripteParser.TemplateFldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateFld}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void exitTemplateFld(TypeScripteParser.TemplateFldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OtherFlds}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void enterOtherFlds(TypeScripteParser.OtherFldsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OtherFlds}
	 * labeled alternative in {@link TypeScripteParser#field}.
	 * @param ctx the parse tree
	 */
	void exitOtherFlds(TypeScripteParser.OtherFldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#selectorField}.
	 * @param ctx the parse tree
	 */
	void enterSelectorField(TypeScripteParser.SelectorFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#selectorField}.
	 * @param ctx the parse tree
	 */
	void exitSelectorField(TypeScripteParser.SelectorFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#templateField}.
	 * @param ctx the parse tree
	 */
	void enterTemplateField(TypeScripteParser.TemplateFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#templateField}.
	 * @param ctx the parse tree
	 */
	void exitTemplateField(TypeScripteParser.TemplateFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#backTemplate}.
	 * @param ctx the parse tree
	 */
	void enterBackTemplate(TypeScripteParser.BackTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#backTemplate}.
	 * @param ctx the parse tree
	 */
	void exitBackTemplate(TypeScripteParser.BackTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#importsField}.
	 * @param ctx the parse tree
	 */
	void enterImportsField(TypeScripteParser.ImportsFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#importsField}.
	 * @param ctx the parse tree
	 */
	void exitImportsField(TypeScripteParser.ImportsFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#standaloneField}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneField(TypeScripteParser.StandaloneFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#standaloneField}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneField(TypeScripteParser.StandaloneFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#otherFields}.
	 * @param ctx the parse tree
	 */
	void enterOtherFields(TypeScripteParser.OtherFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#otherFields}.
	 * @param ctx the parse tree
	 */
	void exitOtherFields(TypeScripteParser.OtherFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(TypeScripteParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(TypeScripteParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TypeScripteParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TypeScripteParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(TypeScripteParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(TypeScripteParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(TypeScripteParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(TypeScripteParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(TypeScripteParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TypeScripteParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TypeScripteParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(TypeScripteParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(TypeScripteParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TypeScripteParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TypeScripteParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(TypeScripteParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(TypeScripteParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(TypeScripteParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(TypeScripteParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(TypeScripteParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(TypeScripteParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(TypeScripteParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(TypeScripteParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(TypeScripteParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(TypeScripteParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionExpr(TypeScripteParser.ArrowFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionExpr(TypeScripteParser.ArrowFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpr(TypeScripteParser.OperationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpr(TypeScripteParser.OperationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(TypeScripteParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(TypeScripteParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyAccessExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessExpr(TypeScripteParser.PropertyAccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyAccessExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessExpr(TypeScripteParser.PropertyAccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclExpr(TypeScripteParser.VarDeclExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclExpr}
	 * labeled alternative in {@link TypeScripteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclExpr(TypeScripteParser.VarDeclExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(TypeScripteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(TypeScripteParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(TypeScripteParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(TypeScripteParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(TypeScripteParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(TypeScripteParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(TypeScripteParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(TypeScripteParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TypeScripteParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TypeScripteParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(TypeScripteParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(TypeScripteParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(TypeScripteParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(TypeScripteParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TypeScripteParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TypeScripteParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(TypeScripteParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(TypeScripteParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccess(TypeScripteParser.PropertyAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#propertyAccess}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccess(TypeScripteParser.PropertyAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(TypeScripteParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(TypeScripteParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(TypeScripteParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(TypeScripteParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TypeScripteParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TypeScripteParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclWithKeyword}
	 * labeled alternative in {@link TypeScripteParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclWithKeyword(TypeScripteParser.VarDeclWithKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclWithKeyword}
	 * labeled alternative in {@link TypeScripteParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclWithKeyword(TypeScripteParser.VarDeclWithKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReassignment}
	 * labeled alternative in {@link TypeScripteParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarReassignment(TypeScripteParser.VarReassignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReassignment}
	 * labeled alternative in {@link TypeScripteParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarReassignment(TypeScripteParser.VarReassignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompleteElement}
	 * labeled alternative in {@link TypeScripteParser#element}.
	 * @param ctx the parse tree
	 */
	void enterCompleteElement(TypeScripteParser.CompleteElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompleteElement}
	 * labeled alternative in {@link TypeScripteParser#element}.
	 * @param ctx the parse tree
	 */
	void exitCompleteElement(TypeScripteParser.CompleteElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingElement}
	 * labeled alternative in {@link TypeScripteParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(TypeScripteParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingElement}
	 * labeled alternative in {@link TypeScripteParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(TypeScripteParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#completeTag}.
	 * @param ctx the parse tree
	 */
	void enterCompleteTag(TypeScripteParser.CompleteTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#completeTag}.
	 * @param ctx the parse tree
	 */
	void exitCompleteTag(TypeScripteParser.CompleteTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(TypeScripteParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(TypeScripteParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(TypeScripteParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(TypeScripteParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#closedTag}.
	 * @param ctx the parse tree
	 */
	void enterClosedTag(TypeScripteParser.ClosedTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#closedTag}.
	 * @param ctx the parse tree
	 */
	void exitClosedTag(TypeScripteParser.ClosedTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#angularExpression}.
	 * @param ctx the parse tree
	 */
	void enterAngularExpression(TypeScripteParser.AngularExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#angularExpression}.
	 * @param ctx the parse tree
	 */
	void exitAngularExpression(TypeScripteParser.AngularExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void enterNormalAttr(TypeScripteParser.NormalAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void exitNormalAttr(TypeScripteParser.NormalAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void enterBindingAttr(TypeScripteParser.BindingAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void exitBindingAttr(TypeScripteParser.BindingAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectiveAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveAttr(TypeScripteParser.DirectiveAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectiveAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveAttr(TypeScripteParser.DirectiveAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void enterEventAttr(TypeScripteParser.EventAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link TypeScripteParser#content}.
	 * @param ctx the parse tree
	 */
	void exitEventAttr(TypeScripteParser.EventAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#normalAttribute}.
	 * @param ctx the parse tree
	 */
	void enterNormalAttribute(TypeScripteParser.NormalAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#normalAttribute}.
	 * @param ctx the parse tree
	 */
	void exitNormalAttribute(TypeScripteParser.NormalAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#bindingAttribute}.
	 * @param ctx the parse tree
	 */
	void enterBindingAttribute(TypeScripteParser.BindingAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#bindingAttribute}.
	 * @param ctx the parse tree
	 */
	void exitBindingAttribute(TypeScripteParser.BindingAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#direvtiveAttribute}.
	 * @param ctx the parse tree
	 */
	void enterDirevtiveAttribute(TypeScripteParser.DirevtiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#direvtiveAttribute}.
	 * @param ctx the parse tree
	 */
	void exitDirevtiveAttribute(TypeScripteParser.DirevtiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScripteParser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventAttribute(TypeScripteParser.EventAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScripteParser#eventAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventAttribute(TypeScripteParser.EventAttributeContext ctx);
}