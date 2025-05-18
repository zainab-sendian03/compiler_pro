parser grammar TypeScripteParser;

options {
  tokenVocab=TypeScripteLexer;
}
program
  : statement* EOF
  ;

statement
   : importStatement       #ImportStmt
   | componentDeclaration  #ComponentStmt
   | variableDeclaration   #VariableStmt
   | objectLiteral         #ObjectLiteralStmt
   | expressionStatement   #ExprStmt
   | classDeclaration      #ClassStmt
   | forLoop               #ForLoopStmt
   | ifStatement           #IfStmt
   ;



importStatement
  : IMPORT LBRACE (IDENTIFIER |COMPONENT) (COMMA (IDENTIFIER |COMPONENT))* RBRACE FROM STRING SEMICOLON
  ;

componentDeclaration
  : AT COMPONENT LPAREN LBRACE componentBody RBRACE RPAREN
  ;

componentBody
  : (field COMMA)+
  ;

field
  : selectorField   #SelectorFld
  | standaloneField #StandaloneFld
  | importsField    #ImportsFld
  | templateField   #TemplateFld
  | otherFields     #OtherFlds
  ;


selectorField
  : SELECTOR COLON STRING
  ;

templateField
  : TEMPLATE COLON BACKTICK element* BACKTICK
  ;


importsField
  : IMPORTS COLON arrayLiteral*
  ;

standaloneField
  : STANDALONE COLON TRUE | FALSE
  ;

otherFields
  : IDENTIFIER COLON expression
  ;

classDeclaration
  : EXPORT CLASS IDENTIFIER classBody
  ;

classBody
  : LBRACE (propertyDeclaration | methodDeclaration)* RBRACE
  ;

propertyDeclaration
  : IDENTIFIER COLON? type? EQUALS expression SEMICOLON?
  ;

methodDeclaration
  : IDENTIFIER LPAREN parameterList? RPAREN COLON type methodBody
  ;

parameterList
  : parameter (COMMA parameter)*
  ;

parameter
  : IDENTIFIER COLON type?
  | IDENTIFIER
  ;

methodBody
  : LBRACE statement* RBRACE
  ;

type
  : primitiveType
  | primitiveType PIPE type;


primitiveType
  : NUMBER | STRING | BOOLEAN | VOID | NULL | IDENTIFIER;

expression
  : literal                  #LiteralExpr
  | arrayLiteral             #ArrayExpr
  | objectLiteral            #ObjectExpr
  | functionCall             #FunctionCallExpr
  | arrowFunction            #ArrowFunctionExpr
  | operation                #OperationExpr
  | assignmentExpression     #AssignmentExpr
  | propertyAccess           #PropertyAccessExpr
  | variableDeclaration      #VarDeclExpr
  ;


literal
  : STRING
  | NUMBER
  | TRUE
  | FALSE
  | NULL
  ;

arrayLiteral
  : LBRACKET (expression (COMMA expression)*)? RBRACKET
  ;

objectLiteral
  : LBRACE (propertyAssignment (COMMA propertyAssignment)*)? RBRACE
  ;

propertyAssignment
  : IDENTIFIER COLON expression
  ;

 functionCall
      : (IDENTIFIER | propertyAccess) LPAREN (expression (COMMA expression)*)?
      RPAREN (DOT IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN)*
      ;

arrowFunction
  : LPAREN parameterList RPAREN ARROW propertyAccess
  ;

lt:  OPEN_SYMBOL SPASE;

operation
  : IDENTIFIER (PLUS | MINUS | STAR | SLASH | MOD | CLOSED_SYMBOL| lt) expression
  | IDENTIFIER (PLUS PLUS)
  | IDENTIFIER (MINUS MINUS)
  ;

assignmentExpression
  : propertyAccess EQUALS expression
  | propertyAccess EQUALS EQUALS expression
  ;

propertyAccess
  : IDENTIFIER (DOT IDENTIFIER)*
  | IDENTIFIER DOT functionCall
  ;

expressionStatement
  : expression SEMICOLON
  ;

forLoop
  : FOR LPAREN variableDeclaration expression? SEMICOLON expression RPAREN LBRACE statement* RBRACE
  ;

ifStatement
  : IF LPAREN expression RPAREN LBRACE statement RBRACE (ELSE LBRACE? statement RBRACE?)?
  ;

variableDeclaration
  : (VAR | CONST | LET) IDENTIFIER EQUALS expression SEMICOLON  #VarDeclWithKeyword
  | IDENTIFIER EQUALS expression                                #VarReassignment
  ;


// القواعد لتحليل العناصر (الوسوم)
element
  : completeTag     #CompleteElement
  | selfClosingTag  #SelfClosingElement
  ;


// القواعد لتحليل الوسوم الكاملة (التي تحتوي على فتح وإغلاق)
completeTag
    : openTag (element|angularExpression)* closedTag
    ;

// القواعد لتحليل الوسوم الذاتية الإغلاق
selfClosingTag
    : OPEN_SYMBOL TAG_NAME content* SLASHSELF CLOSED_SYMBOL
    ;

openTag
    : OPEN_SYMBOL TAG_NAME content* CLOSED_SYMBOL
    ;

closedTag
    : OPEN_SYMBOL SLASH TAG_NAME CLOSED_SYMBOL
    ;

angularExpression
    : ANGULAR_EXPRESSION
    ;

// القواعد لتحليل السمات
content
  : normalAttribute     #NormalAttr
  | bindingAttribute    #BindingAttr
  | direvtiveAttribute  #DirectiveAttr
  | eventAttribute      #EventAttr
  ;


normalAttribute
    : IDENTIFIER EQUALS STRING
    ;

bindingAttribute
    : LBRACKET IDENTIFIER RBRACKET EQUALS STRING
    ;

direvtiveAttribute
    : STAR IDENTIFIER EQUALS STRING
    ;

eventAttribute
    : LPAREN IDENTIFIER RPAREN EQUALS STRING
    ;
