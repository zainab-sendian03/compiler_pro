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
   | injectableDeclaration #InjectableStmt
   | variableDeclaration   #VariableStmt
   | objectLiteral         #ObjectLiteralStmt
   | expressionStatement   #ExprStmt
   | classDeclaration      #ClassStmt
   | forLoop               #ForLoopStmt
   | ifStatement           #IfStmt
   ;


injectableDeclaration
  : AT INJECTABLE LPAREN LBRACE injectableBody RBRACE RPAREN
  ;

injectableBody
  : PROVIDEDIN COLON STRING
  ;

importStatement
  : IMPORT LBRACE (IDENTIFIER |COMPONENT) (COMMA (IDENTIFIER |COMPONENT | INJECTABLE))* RBRACE FROM STRING SEMICOLON
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
  : SELECTOR COLON primitiveType
  ;

templateField
  : TEMPLATE COLON primitiveType
  ;

backTemplate
    : BACKTICK element* BACKTICK
    ;

importsField
  : IMPORTS COLON primitiveType*
  ;

standaloneField
  : STANDALONE COLON primitiveType
  ;

otherFields
  : IDENTIFIER COLON expression
  ;

classDeclaration
  : (EXPORT CLASS IDENTIFIER |
  EXPORT INTERFACE IDENTIFIER |
  CLASS IDENTIFIER )classBody
  ;

classBody
  : LBRACE (propertyDeclaration | methodDeclaration | constructor)* RBRACE
  ;

propertyDeclaration
  : (PUBLIC | PRIVATE | PROTECTED)? IDENTIFIER DOLAR? COLON? type? (EQUALS expression)? SEMICOLON?
  ;

constructorCall
  : NEW IDENTIFIER ( lt type gt)? LPAREN expression RPAREN
  ;


methodDeclaration
  : IDENTIFIER LPAREN parameterList? RPAREN (COLON type)? methodBody
  ;

parameterList
  : parameter (COMMA parameter)*
  ;

parameter
  : IDENTIFIER COLON type?
  | IDENTIFIER
  ;

methodBody
  : LBRACE RETURN? statement* RBRACE
  ;

type
  : primitiveType
  | primitiveType lt type (COMMA type)* gt
  | primitiveType PIPE type;


primitiveType
  : NUMBER | MYSTRING | BOOLEAN | VOID | NULL | IDENTIFIER | backTemplate
  | arrayLiteral
  | objectLiteral
  | literal
  ;


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
  | constructorCall          #ConstructorCallExpr
  | constructor              #ConstructorExpr
  ;


literal
  : STRING
  | NUMBER
  | TRUE
  | FALSE
  | NULL
  | IDENTIFIER
  ;

arrayLiteral
  : IDENTIFIER? LBRACKET (expression | DOTDOTDOT expression)? (COMMA (expression | DOTDOTDOT expression)*)? RBRACKET
  | LBRACKET (expression (COMMA expression)*)? RBRACKET
  ;

objectLiteral
  : LBRACE DOTDOTDOT? (propertyAssignment (COMMA propertyAssignment)*)? RBRACE
  ;

propertyAssignment
  : expression (COLON expression)*
  ;

functionCall
    : (IDENTIFIER | propertyAccess)
      LPAREN (expression (COMMA expression)*)? RPAREN
      (DOT IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN)* propertyAccess? SEMICOLON?
    ;


arrowFunction
    : (LPAREN parameterList RPAREN | IDENTIFIER) ARROW (methodBody | functionCall)
    ;



lt:
 OPEN_SYMBOL SPASE
 ;
gt:
  CLOSED_SYMBOL
 ;
operation
    : (PLUS | MINUS)? IDENTIFIER arrayAccess?       #unaryOrArray
    | IDENTIFIER (PLUS PLUS)                        #increment
    | IDENTIFIER (MINUS MINUS)                      #decrement
    ;

arrayAccess
    : LBRACKET expression RBRACKET
    ;

keys:PLUS | MINUS | STAR | SLASH | MOD | CLOSED_SYMBOL| lt | ANDAND | OROR | NOTEQUALS |GREATERTHAN;

assignmentExpression
  : propp   EQUALS  expression #PropExpy
  | arrayLiteral  EQUALS  expression #ArrayExpy

  ;
propp:
IDENTIFIER DOT IDENTIFIER
;
propertyAccess
    : IDENTIFIER (DOT IDENTIFIER DOLAR? | DOT arrayLiteral)* (OROR literal)?
    ;


expressionStatement
  : expression SEMICOLON
  ;

forLoop
  : FOR LPAREN variableDeclaration expression? SEMICOLON expression RPAREN LBRACE statement* RBRACE
  ;

ifStatement
  : IF LPAREN expression (keys expression)* RPAREN LBRACE? statement* RBRACE? (ELSE LBRACE? statement RBRACE?)?
  ;

variableDeclaration
  : (VAR | CONST | LET | MYSTRING | INT ) IDENTIFIER EQUALS expression SEMICOLON  #VarDeclWithKeyword
  | IDENTIFIER EQUALS expression                                #VarReassignment
  ;

constructor
    : CONSTRUCTOR LPAREN propertyDeclaration (COMMA propertyDeclaration)* RPAREN LBRACE statement* RBRACE
    ;

element
  : completeTag     #CompleteElement
  | selfClosingTag  #SelfClosingElement
  ;


completeTag
    : openTag (element | angularExpression|text )* closedTag
    ;

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
text:TEXT | IDENTIFIER ;

content
  : normalAttribute     #NormalAttr
  | bindingAttribute    #BindingAttr
  | direvtiveAttribute  #DirectiveAttr
  | eventAttribute      #EventAttr
  | twoWayBindingAttribute #TwoWayBindingAttr
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

twoWayBindingAttribute
    : LBRACKET LPAREN IDENTIFIER RPAREN RBRACKET EQUALS STRING
    ;

