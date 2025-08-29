lexer grammar TypeScripteLexer;
//WhiteSpace
WS: [ \t\r\n]+ -> skip;

// Comments
LINE_COMMENT: ( '//' ~[\r\n]* | '<!--' .*? '-->' ) -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Keywords
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
CLASS: 'class';
INTERFACE:'interface';
COMPONENT: 'Component';
MYSTRING: 'String';
INJECTABLE: 'Injectable';
PROVIDEDIN: 'providedIn';
ROOT: 'root';
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN :'return';
NEW:'new';
PROTECTED:'protected';
PRIVATE :'private';
PUBLIC :'public';
INT: 'int';
VAR: 'var';
SELECTOR: 'selector';
TEMPLATE: 'template';
IMPORTS: 'imports';
STANDALONE: 'standalone';
CONST: 'const';
THIS:'this';
LET: 'let';
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

// Symbols
AT: '@';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
LPAREN: '(';
RPAREN: ')';
COLON: ':';
COMMA: ',';
SEMICOLON: ';';
DOTDOTDOT: '...';
DOLAR: '$';
DOT: '.';
PLUS: '+';
MINUS: '-';
STAR: '*';
MOD: '%';
EQUALS: '=';
NOTEQUALS :'!==';
ANDAND:'&&';
OROR:'||';
GREATERTHAN :'>=';
CONSTRUCTOR:'constructor';
BOOLEAN: 'boolean';
VOID: 'void';
BACKTICK: '`';
PIPE: '|';
ARROW: '=>';
OPEN_SYMBOL: '<' -> pushMode(TAG);
CLOSED_SYMBOL: '>';
SLASHSELF : '/';

// Literals
STRING: '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'';

NUMBER: [0-9]+('.'[0-9]+)?;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
ANGULAR_EXPRESSION : '{{'  .*? '}}'  ;
TEXT: [\p{L}_][\p{L}\p{N}_]*;


// Modes for HTML parsing
mode TAG;
TAG_NAME: [a-z][a-z0-9\-]* -> popMode;
SPASE: ' ' -> popMode;
SLASH: '/';
