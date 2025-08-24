// Generated from C:/Users/USER/Desktop/4th-2/Compiler2/New folder/compiler_pro/src/antlr/TypeScripteParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeScripteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LINE_COMMENT=2, BLOCK_COMMENT=3, IMPORT=4, FROM=5, EXPORT=6, CLASS=7, 
		COMPONENT=8, MYSTRING=9, IF=10, ELSE=11, FOR=12, INT=13, VAR=14, SELECTOR=15, 
		TEMPLATE=16, IMPORTS=17, STANDALONE=18, CONST=19, LET=20, TRUE=21, FALSE=22, 
		NULL=23, AT=24, LBRACE=25, RBRACE=26, LBRACKET=27, RBRACKET=28, LPAREN=29, 
		RPAREN=30, COLON=31, COMMA=32, SEMICOLON=33, DOT=34, PLUS=35, MINUS=36, 
		STAR=37, MOD=38, EQUALS=39, BOOLEAN=40, VOID=41, BACKTICK=42, PIPE=43, 
		ARROW=44, OPEN_SYMBOL=45, CLOSED_SYMBOL=46, SLASHSELF=47, STRING=48, NUMBER=49, 
		IDENTIFIER=50, ANGULAR_EXPRESSION=51, TEXT=52, TAG_NAME=53, SPASE=54, 
		SLASH=55;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_componentDeclaration = 3, 
		RULE_componentBody = 4, RULE_field = 5, RULE_selectorField = 6, RULE_templateField = 7, 
		RULE_backTemplate = 8, RULE_importsField = 9, RULE_standaloneField = 10, 
		RULE_otherFields = 11, RULE_classDeclaration = 12, RULE_classBody = 13, 
		RULE_propertyDeclaration = 14, RULE_methodDeclaration = 15, RULE_parameterList = 16, 
		RULE_parameter = 17, RULE_methodBody = 18, RULE_type = 19, RULE_primitiveType = 20, 
		RULE_expression = 21, RULE_literal = 22, RULE_arrayLiteral = 23, RULE_objectLiteral = 24, 
		RULE_propertyAssignment = 25, RULE_functionCall = 26, RULE_arrowFunction = 27, 
		RULE_lt = 28, RULE_operation = 29, RULE_assignmentExpression = 30, RULE_propertyAccess = 31, 
		RULE_expressionStatement = 32, RULE_forLoop = 33, RULE_ifStatement = 34, 
		RULE_variableDeclaration = 35, RULE_htmlRoot = 36, RULE_element = 37, 
		RULE_completeTag = 38, RULE_selfClosingTag = 39, RULE_openTag = 40, RULE_closedTag = 41, 
		RULE_angularExpression = 42, RULE_text = 43, RULE_content = 44, RULE_normalAttribute = 45, 
		RULE_bindingAttribute = 46, RULE_direvtiveAttribute = 47, RULE_eventAttribute = 48, 
		RULE_twoWayBindingAttribute = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "componentDeclaration", "componentBody", 
			"field", "selectorField", "templateField", "backTemplate", "importsField", 
			"standaloneField", "otherFields", "classDeclaration", "classBody", "propertyDeclaration", 
			"methodDeclaration", "parameterList", "parameter", "methodBody", "type", 
			"primitiveType", "expression", "literal", "arrayLiteral", "objectLiteral", 
			"propertyAssignment", "functionCall", "arrowFunction", "lt", "operation", 
			"assignmentExpression", "propertyAccess", "expressionStatement", "forLoop", 
			"ifStatement", "variableDeclaration", "htmlRoot", "element", "completeTag", 
			"selfClosingTag", "openTag", "closedTag", "angularExpression", "text", 
			"content", "normalAttribute", "bindingAttribute", "direvtiveAttribute", 
			"eventAttribute", "twoWayBindingAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'import'", "'from'", "'export'", "'class'", 
			"'Component'", "'String'", "'if'", "'else'", "'for'", "'int'", "'var'", 
			"'selector'", "'template'", "'imports'", "'standalone'", "'const'", "'let'", 
			"'true'", "'false'", "'null'", "'@'", "'{'", "'}'", "'['", "']'", "'('", 
			"')'", "':'", "','", "';'", "'.'", "'+'", "'-'", "'*'", "'%'", "'='", 
			"'boolean'", "'void'", "'`'", "'|'", "'=>'", "'<'", "'>'", null, null, 
			null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "BLOCK_COMMENT", "IMPORT", "FROM", "EXPORT", 
			"CLASS", "COMPONENT", "MYSTRING", "IF", "ELSE", "FOR", "INT", "VAR", 
			"SELECTOR", "TEMPLATE", "IMPORTS", "STANDALONE", "CONST", "LET", "TRUE", 
			"FALSE", "NULL", "AT", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "LPAREN", 
			"RPAREN", "COLON", "COMMA", "SEMICOLON", "DOT", "PLUS", "MINUS", "STAR", 
			"MOD", "EQUALS", "BOOLEAN", "VOID", "BACKTICK", "PIPE", "ARROW", "OPEN_SYMBOL", 
			"CLOSED_SYMBOL", "SLASHSELF", "STRING", "NUMBER", "IDENTIFIER", "ANGULAR_EXPRESSION", 
			"TEXT", "TAG_NAME", "SPASE", "SLASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TypeScripteParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeScripteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TypeScripteParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325574678096L) != 0)) {
				{
				{
				setState(100);
				statement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStmtContext extends StatementContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ComponentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterComponentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitComponentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitComponentStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralStmtContext extends StatementContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterObjectLiteralStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitObjectLiteralStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitObjectLiteralStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStmtContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterVariableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitVariableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitVariableStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopStmtContext extends StatementContext {
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForLoopStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterForLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitForLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitForLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassStmtContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterClassStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitClassStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitClassStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				importStatement();
				}
				break;
			case 2:
				_localctx = new ComponentStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new VariableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ObjectLiteralStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				objectLiteral();
				}
				break;
			case 5:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				expressionStatement();
				}
				break;
			case 6:
				_localctx = new ClassStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				classDeclaration();
				}
				break;
			case 7:
				_localctx = new ForLoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				forLoop();
				}
				break;
			case 8:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TypeScripteParser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(TypeScripteParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScripteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScripteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMPONENT() { return getTokens(TypeScripteParser.COMPONENT); }
		public TerminalNode COMPONENT(int i) {
			return getToken(TypeScripteParser.COMPONENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IMPORT);
			setState(119);
			match(LBRACE);
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==COMPONENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(121);
				match(COMMA);
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==COMPONENT || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RBRACE);
			setState(129);
			match(FROM);
			setState(130);
			match(STRING);
			setState(131);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(TypeScripteParser.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(TypeScripteParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(AT);
			setState(134);
			match(COMPONENT);
			setState(135);
			match(LPAREN);
			setState(136);
			match(LBRACE);
			setState(137);
			componentBody();
			setState(138);
			match(RBRACE);
			setState(139);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				field();
				setState(142);
				match(COMMA);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1125899907334144L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OtherFldsContext extends FieldContext {
		public OtherFieldsContext otherFields() {
			return getRuleContext(OtherFieldsContext.class,0);
		}
		public OtherFldsContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterOtherFlds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitOtherFlds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitOtherFlds(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFldContext extends FieldContext {
		public TemplateFieldContext templateField() {
			return getRuleContext(TemplateFieldContext.class,0);
		}
		public TemplateFldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterTemplateFld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitTemplateFld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitTemplateFld(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneFldContext extends FieldContext {
		public StandaloneFieldContext standaloneField() {
			return getRuleContext(StandaloneFieldContext.class,0);
		}
		public StandaloneFldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterStandaloneFld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitStandaloneFld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitStandaloneFld(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsFldContext extends FieldContext {
		public ImportsFieldContext importsField() {
			return getRuleContext(ImportsFieldContext.class,0);
		}
		public ImportsFldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterImportsFld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitImportsFld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitImportsFld(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorFldContext extends FieldContext {
		public SelectorFieldContext selectorField() {
			return getRuleContext(SelectorFieldContext.class,0);
		}
		public SelectorFldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterSelectorFld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitSelectorFld(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitSelectorFld(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorFldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				selectorField();
				}
				break;
			case STANDALONE:
				_localctx = new StandaloneFldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				standaloneField();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsFldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				importsField();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateFldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				templateField();
				}
				break;
			case IDENTIFIER:
				_localctx = new OtherFldsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				otherFields();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorFieldContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(TypeScripteParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public SelectorFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterSelectorField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitSelectorField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitSelectorField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorFieldContext selectorField() throws RecognitionException {
		SelectorFieldContext _localctx = new SelectorFieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectorField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SELECTOR);
			setState(156);
			match(COLON);
			setState(157);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFieldContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(TypeScripteParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TemplateFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterTemplateField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitTemplateField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitTemplateField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateFieldContext templateField() throws RecognitionException {
		TemplateFieldContext _localctx = new TemplateFieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_templateField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TEMPLATE);
			setState(160);
			match(COLON);
			setState(161);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackTemplateContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(TypeScripteParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(TypeScripteParser.BACKTICK, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BackTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterBackTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitBackTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitBackTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackTemplateContext backTemplate() throws RecognitionException {
		BackTemplateContext _localctx = new BackTemplateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_backTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(BACKTICK);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_SYMBOL) {
				{
				{
				setState(164);
				element();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsFieldContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(TypeScripteParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public List<PrimitiveTypeContext> primitiveType() {
			return getRuleContexts(PrimitiveTypeContext.class);
		}
		public PrimitiveTypeContext primitiveType(int i) {
			return getRuleContext(PrimitiveTypeContext.class,i);
		}
		public ImportsFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterImportsField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitImportsField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitImportsField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsFieldContext importsField() throws RecognitionException {
		ImportsFieldContext _localctx = new ImportsFieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IMPORTS);
			setState(173);
			match(COLON);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1978021600821760L) != 0)) {
				{
				{
				setState(174);
				primitiveType();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneFieldContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(TypeScripteParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public StandaloneFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterStandaloneField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitStandaloneField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitStandaloneField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneFieldContext standaloneField() throws RecognitionException {
		StandaloneFieldContext _localctx = new StandaloneFieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_standaloneField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STANDALONE);
			setState(181);
			match(COLON);
			setState(182);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtherFieldsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterOtherFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitOtherFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitOtherFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherFieldsContext otherFields() throws RecognitionException {
		OtherFieldsContext _localctx = new OtherFieldsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_otherFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(COLON);
			setState(186);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(TypeScripteParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(TypeScripteParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(EXPORT);
			setState(189);
			match(CLASS);
			setState(190);
			match(IDENTIFIER);
			setState(191);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LBRACE);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(194);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(195);
					methodDeclaration();
					}
					break;
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IDENTIFIER);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(204);
				match(COLON);
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1978021600821760L) != 0)) {
				{
				setState(207);
				type();
				}
			}

			setState(210);
			match(EQUALS);
			setState(211);
			expression();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(212);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(LPAREN);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(217);
				parameterList();
				}
			}

			setState(220);
			match(RPAREN);
			setState(221);
			match(COLON);
			setState(222);
			type();
			setState(223);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			parameter();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				parameter();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENTIFIER);
				setState(234);
				match(COLON);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1978021600821760L) != 0)) {
					{
					setState(235);
					type();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(LBRACE);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325574678096L) != 0)) {
				{
				{
				setState(242);
				statement();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(TypeScripteParser.PIPE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				primitiveType();
				setState(252);
				match(PIPE);
				setState(253);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TypeScripteParser.NUMBER, 0); }
		public TerminalNode MYSTRING() { return getToken(TypeScripteParser.MYSTRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypeScripteParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(TypeScripteParser.VOID, 0); }
		public TerminalNode NULL() { return getToken(TypeScripteParser.NULL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public BackTemplateContext backTemplate() {
			return getRuleContext(BackTemplateContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitiveType);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(MYSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(VOID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				backTemplate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				arrayLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				objectLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExprContext extends ExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterObjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitObjectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationExprContext extends ExpressionContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitOperationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitOperationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionExprContext extends ExpressionContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterArrowFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitArrowFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitArrowFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessExprContext extends ExpressionContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public PropertyAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterPropertyAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitPropertyAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitPropertyAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclExprContext extends ExpressionContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VarDeclExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterVarDeclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitVarDeclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitVarDeclExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				literal();
				}
				break;
			case 2:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				arrayLiteral();
				}
				break;
			case 3:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				objectLiteral();
				}
				break;
			case 4:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				functionCall();
				}
				break;
			case 5:
				_localctx = new ArrowFunctionExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				arrowFunction();
				}
				break;
			case 6:
				_localctx = new OperationExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				operation();
				}
				break;
			case 7:
				_localctx = new AssignmentExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				assignmentExpression();
				}
				break;
			case 8:
				_localctx = new PropertyAccessExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				propertyAccess();
				}
				break;
			case 9:
				_localctx = new VarDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(TypeScripteParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(TypeScripteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TypeScripteParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(TypeScripteParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 844424944812032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TypeScripteParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(TypeScripteParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LBRACKET);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
				{
				setState(283);
				expression();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					expression();
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(293);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LBRACE);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(296);
				propertyAssignment();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					propertyAssignment();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(306);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(COLON);
			setState(310);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(TypeScripteParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(TypeScripteParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(TypeScripteParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(TypeScripteParser.RPAREN, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScripteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScripteParser.IDENTIFIER, i);
		}
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(TypeScripteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScripteParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(312);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(313);
				propertyAccess();
				}
				break;
			}
			setState(316);
			match(LPAREN);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
				{
				setState(317);
				expression();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(318);
					match(COMMA);
					setState(319);
					expression();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
			match(RPAREN);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(328);
				match(DOT);
				setState(329);
				match(IDENTIFIER);
				setState(330);
				match(LPAREN);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
					{
					setState(331);
					expression();
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(332);
						match(COMMA);
						setState(333);
						expression();
						}
						}
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(341);
				match(RPAREN);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(TypeScripteParser.ARROW, 0); }
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LPAREN);
			setState(348);
			parameterList();
			setState(349);
			match(RPAREN);
			setState(350);
			match(ARROW);
			setState(351);
			propertyAccess();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends ParserRuleContext {
		public TerminalNode OPEN_SYMBOL() { return getToken(TypeScripteParser.OPEN_SYMBOL, 0); }
		public TerminalNode SPASE() { return getToken(TypeScripteParser.SPASE, 0); }
		public LtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtContext lt() throws RecognitionException {
		LtContext _localctx = new LtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(OPEN_SYMBOL);
			setState(354);
			match(SPASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(TypeScripteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TypeScripteParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(TypeScripteParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TypeScripteParser.MINUS, i);
		}
		public TerminalNode STAR() { return getToken(TypeScripteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(TypeScripteParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(TypeScripteParser.MOD, 0); }
		public TerminalNode CLOSED_SYMBOL() { return getToken(TypeScripteParser.CLOSED_SYMBOL, 0); }
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operation);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(IDENTIFIER);
				setState(364);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(357);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(358);
					match(MINUS);
					}
					break;
				case STAR:
					{
					setState(359);
					match(STAR);
					}
					break;
				case SLASH:
					{
					setState(360);
					match(SLASH);
					}
					break;
				case MOD:
					{
					setState(361);
					match(MOD);
					}
					break;
				case CLOSED_SYMBOL:
					{
					setState(362);
					match(CLOSED_SYMBOL);
					}
					break;
				case OPEN_SYMBOL:
					{
					setState(363);
					lt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(366);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(IDENTIFIER);
				{
				setState(368);
				match(PLUS);
				setState(369);
				match(PLUS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(IDENTIFIER);
				{
				setState(371);
				match(MINUS);
				setState(372);
				match(MINUS);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public PropertyAccessContext propertyAccess() {
			return getRuleContext(PropertyAccessContext.class,0);
		}
		public List<TerminalNode> EQUALS() { return getTokens(TypeScripteParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(TypeScripteParser.EQUALS, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignmentExpression);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				propertyAccess();
				setState(376);
				match(EQUALS);
				setState(377);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				propertyAccess();
				setState(380);
				match(EQUALS);
				setState(381);
				match(EQUALS);
				setState(382);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScripteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScripteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TypeScripteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScripteParser.DOT, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessContext propertyAccess() throws RecognitionException {
		PropertyAccessContext _localctx = new PropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyAccess);
		int _la;
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(IDENTIFIER);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(387);
					match(DOT);
					setState(388);
					match(IDENTIFIER);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(IDENTIFIER);
				setState(395);
				match(DOT);
				setState(396);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			expression();
			setState(400);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TypeScripteParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(FOR);
			setState(403);
			match(LPAREN);
			setState(404);
			variableDeclaration();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
				{
				setState(405);
				expression();
				}
			}

			setState(408);
			match(SEMICOLON);
			setState(409);
			expression();
			setState(410);
			match(RPAREN);
			setState(411);
			match(LBRACE);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325574678096L) != 0)) {
				{
				{
				setState(412);
				statement();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TypeScripteParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(TypeScripteParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TypeScripteParser.LBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TypeScripteParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TypeScripteParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(TypeScripteParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(IF);
			setState(421);
			match(LPAREN);
			setState(422);
			expression();
			setState(423);
			match(RPAREN);
			setState(424);
			match(LBRACE);
			setState(425);
			statement();
			setState(426);
			match(RBRACE);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(427);
				match(ELSE);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(428);
					match(LBRACE);
					}
					break;
				}
				setState(431);
				statement();
				setState(433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(432);
					match(RBRACE);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarReassignmentContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarReassignmentContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterVarReassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitVarReassignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitVarReassignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclWithKeywordContext extends VariableDeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(TypeScripteParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(TypeScripteParser.CONST, 0); }
		public TerminalNode LET() { return getToken(TypeScripteParser.LET, 0); }
		public TerminalNode MYSTRING() { return getToken(TypeScripteParser.MYSTRING, 0); }
		public TerminalNode INT() { return getToken(TypeScripteParser.INT, 0); }
		public VarDeclWithKeywordContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterVarDeclWithKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitVarDeclWithKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitVarDeclWithKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaration);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MYSTRING:
			case INT:
			case VAR:
			case CONST:
			case LET:
				_localctx = new VarDeclWithKeywordContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1597952L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(438);
				match(IDENTIFIER);
				setState(439);
				match(EQUALS);
				setState(440);
				expression();
				setState(441);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new VarReassignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(IDENTIFIER);
				setState(444);
				match(EQUALS);
				setState(445);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlRootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TypeScripteParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HtmlRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterHtmlRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitHtmlRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitHtmlRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlRootContext htmlRoot() throws RecognitionException {
		HtmlRootContext _localctx = new HtmlRootContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_htmlRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_SYMBOL) {
				{
				{
				setState(448);
				element();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompleteElementContext extends ElementContext {
		public CompleteTagContext completeTag() {
			return getRuleContext(CompleteTagContext.class,0);
		}
		public CompleteElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterCompleteElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitCompleteElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitCompleteElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ElementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_element);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new CompleteElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				completeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				selfClosingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompleteTagContext extends ParserRuleContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public ClosedTagContext closedTag() {
			return getRuleContext(ClosedTagContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<AngularExpressionContext> angularExpression() {
			return getRuleContexts(AngularExpressionContext.class);
		}
		public AngularExpressionContext angularExpression(int i) {
			return getRuleContext(AngularExpressionContext.class,i);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public CompleteTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterCompleteTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitCompleteTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitCompleteTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompleteTagContext completeTag() throws RecognitionException {
		CompleteTagContext _localctx = new CompleteTagContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_completeTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			openTag();
			setState(466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(464);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_SYMBOL:
						{
						setState(461);
						element();
						}
						break;
					case ANGULAR_EXPRESSION:
						{
						setState(462);
						angularExpression();
						}
						break;
					case IDENTIFIER:
					case TEXT:
						{
						setState(463);
						text();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(469);
			closedTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN_SYMBOL() { return getToken(TypeScripteParser.OPEN_SYMBOL, 0); }
		public TerminalNode TAG_NAME() { return getToken(TypeScripteParser.TAG_NAME, 0); }
		public TerminalNode SLASHSELF() { return getToken(TypeScripteParser.SLASHSELF, 0); }
		public TerminalNode CLOSED_SYMBOL() { return getToken(TypeScripteParser.CLOSED_SYMBOL, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(OPEN_SYMBOL);
			setState(472);
			match(TAG_NAME);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126038016884736L) != 0)) {
				{
				{
				setState(473);
				content();
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(SLASHSELF);
			setState(480);
			match(CLOSED_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode OPEN_SYMBOL() { return getToken(TypeScripteParser.OPEN_SYMBOL, 0); }
		public TerminalNode TAG_NAME() { return getToken(TypeScripteParser.TAG_NAME, 0); }
		public TerminalNode CLOSED_SYMBOL() { return getToken(TypeScripteParser.CLOSED_SYMBOL, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(OPEN_SYMBOL);
			setState(483);
			match(TAG_NAME);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126038016884736L) != 0)) {
				{
				{
				setState(484);
				content();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(CLOSED_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClosedTagContext extends ParserRuleContext {
		public TerminalNode OPEN_SYMBOL() { return getToken(TypeScripteParser.OPEN_SYMBOL, 0); }
		public TerminalNode SLASH() { return getToken(TypeScripteParser.SLASH, 0); }
		public TerminalNode TAG_NAME() { return getToken(TypeScripteParser.TAG_NAME, 0); }
		public TerminalNode CLOSED_SYMBOL() { return getToken(TypeScripteParser.CLOSED_SYMBOL, 0); }
		public ClosedTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterClosedTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitClosedTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitClosedTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedTagContext closedTag() throws RecognitionException {
		ClosedTagContext _localctx = new ClosedTagContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_closedTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(OPEN_SYMBOL);
			setState(493);
			match(SLASH);
			setState(494);
			match(TAG_NAME);
			setState(495);
			match(CLOSED_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularExpressionContext extends ParserRuleContext {
		public TerminalNode ANGULAR_EXPRESSION() { return getToken(TypeScripteParser.ANGULAR_EXPRESSION, 0); }
		public AngularExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterAngularExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitAngularExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitAngularExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularExpressionContext angularExpression() throws RecognitionException {
		AngularExpressionContext _localctx = new AngularExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_angularExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(ANGULAR_EXPRESSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TypeScripteParser.TEXT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventAttrContext extends ContentContext {
		public EventAttributeContext eventAttribute() {
			return getRuleContext(EventAttributeContext.class,0);
		}
		public EventAttrContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterEventAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitEventAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitEventAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveAttrContext extends ContentContext {
		public DirevtiveAttributeContext direvtiveAttribute() {
			return getRuleContext(DirevtiveAttributeContext.class,0);
		}
		public DirectiveAttrContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterDirectiveAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitDirectiveAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitDirectiveAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BindingAttrContext extends ContentContext {
		public BindingAttributeContext bindingAttribute() {
			return getRuleContext(BindingAttributeContext.class,0);
		}
		public BindingAttrContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterBindingAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitBindingAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitBindingAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayBindingAttrContext extends ContentContext {
		public TwoWayBindingAttributeContext twoWayBindingAttribute() {
			return getRuleContext(TwoWayBindingAttributeContext.class,0);
		}
		public TwoWayBindingAttrContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterTwoWayBindingAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitTwoWayBindingAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitTwoWayBindingAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalAttrContext extends ContentContext {
		public NormalAttributeContext normalAttribute() {
			return getRuleContext(NormalAttributeContext.class,0);
		}
		public NormalAttrContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterNormalAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitNormalAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitNormalAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_content);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new NormalAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				normalAttribute();
				}
				break;
			case 2:
				_localctx = new BindingAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				bindingAttribute();
				}
				break;
			case 3:
				_localctx = new DirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				direvtiveAttribute();
				}
				break;
			case 4:
				_localctx = new EventAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				eventAttribute();
				}
				break;
			case 5:
				_localctx = new TwoWayBindingAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(505);
				twoWayBindingAttribute();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public NormalAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterNormalAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitNormalAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitNormalAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalAttributeContext normalAttribute() throws RecognitionException {
		NormalAttributeContext _localctx = new NormalAttributeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_normalAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(IDENTIFIER);
			setState(509);
			match(EQUALS);
			setState(510);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindingAttributeContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TypeScripteParser.LBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode RBRACKET() { return getToken(TypeScripteParser.RBRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public BindingAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingAttributeContext bindingAttribute() throws RecognitionException {
		BindingAttributeContext _localctx = new BindingAttributeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bindingAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(LBRACKET);
			setState(513);
			match(IDENTIFIER);
			setState(514);
			match(RBRACKET);
			setState(515);
			match(EQUALS);
			setState(516);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirevtiveAttributeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(TypeScripteParser.STAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public DirevtiveAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direvtiveAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterDirevtiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitDirevtiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitDirevtiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirevtiveAttributeContext direvtiveAttribute() throws RecognitionException {
		DirevtiveAttributeContext _localctx = new DirevtiveAttributeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_direvtiveAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(STAR);
			setState(519);
			match(IDENTIFIER);
			setState(520);
			match(EQUALS);
			setState(521);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventAttributeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public EventAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterEventAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitEventAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitEventAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventAttributeContext eventAttribute() throws RecognitionException {
		EventAttributeContext _localctx = new EventAttributeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_eventAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(LPAREN);
			setState(524);
			match(IDENTIFIER);
			setState(525);
			match(RPAREN);
			setState(526);
			match(EQUALS);
			setState(527);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayBindingAttributeContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(TypeScripteParser.LBRACKET, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode RBRACKET() { return getToken(TypeScripteParser.RBRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public TwoWayBindingAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBindingAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterTwoWayBindingAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitTwoWayBindingAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitTwoWayBindingAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingAttributeContext twoWayBindingAttribute() throws RecognitionException {
		TwoWayBindingAttributeContext _localctx = new TwoWayBindingAttributeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_twoWayBindingAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(LBRACKET);
			setState(530);
			match(LPAREN);
			setState(531);
			match(IDENTIFIER);
			setState(532);
			match(RPAREN);
			setState(533);
			match(RBRACKET);
			setState(534);
			match(EQUALS);
			setState(535);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u021a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0005\u0000f\b\u0000\n\u0000\f\u0000i\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002|\b\u0002\n\u0002"+
		"\f\u0002\u007f\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u0091\b\u0004\u000b\u0004\f\u0004\u0092\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009a\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\u00a6\b\b\n\b\f\b\u00a9\t\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00b0\b\t\n\t\f\t\u00b3"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00c5\b\r\n\r\f\r\u00c8\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ce\b\u000e\u0001\u000e\u0003\u000e\u00d1\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d6\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00db\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00e5\b\u0010\n\u0010\f\u0010\u00e8\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00ed\b\u0011\u0001\u0011\u0003\u0011\u00f0"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u00f4\b\u0012\n\u0012\f\u0012"+
		"\u00f7\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0100\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u010c\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0117\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u011f\b\u0017\n\u0017"+
		"\f\u0017\u0122\t\u0017\u0003\u0017\u0124\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u012c\b\u0018"+
		"\n\u0018\f\u0018\u012f\t\u0018\u0003\u0018\u0131\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u013b\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0141\b\u001a\n\u001a\f\u001a\u0144\t\u001a\u0003\u001a"+
		"\u0146\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u014f\b\u001a\n\u001a\f\u001a\u0152"+
		"\t\u001a\u0003\u001a\u0154\b\u001a\u0001\u001a\u0005\u001a\u0157\b\u001a"+
		"\n\u001a\f\u001a\u015a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u016d\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0176"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0181\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0186\b\u001f\n\u001f\f\u001f"+
		"\u0189\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u018e\b"+
		"\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u0197\b"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u019e\b!\n!\f!\u01a1\t!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01ae\b\"\u0001\"\u0001\"\u0003\"\u01b2\b\"\u0003\""+
		"\u01b4\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01bf\b#\u0001$\u0005$\u01c2\b$\n$\f$\u01c5\t$\u0001$\u0001$"+
		"\u0001%\u0001%\u0003%\u01cb\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u01d1"+
		"\b&\n&\f&\u01d4\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005\'\u01db"+
		"\b\'\n\'\f\'\u01de\t\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0005"+
		"(\u01e6\b(\n(\f(\u01e9\t(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u01fb\b,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u0000\u00002\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`b\u0000\u0004\u0002\u0000\b\b22\u0002\u0000\u0015\u001701\u0003\u0000"+
		"\t\t\r\u000e\u0013\u0014\u0002\u00002244\u0239\u0000g\u0001\u0000\u0000"+
		"\u0000\u0002t\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000\u0000\u0006"+
		"\u0085\u0001\u0000\u0000\u0000\b\u0090\u0001\u0000\u0000\u0000\n\u0099"+
		"\u0001\u0000\u0000\u0000\f\u009b\u0001\u0000\u0000\u0000\u000e\u009f\u0001"+
		"\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000\u0012\u00ac\u0001"+
		"\u0000\u0000\u0000\u0014\u00b4\u0001\u0000\u0000\u0000\u0016\u00b8\u0001"+
		"\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000\u0000\u001a\u00c1\u0001"+
		"\u0000\u0000\u0000\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00d7\u0001"+
		"\u0000\u0000\u0000 \u00e1\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000"+
		"\u0000\u0000$\u00f1\u0001\u0000\u0000\u0000&\u00ff\u0001\u0000\u0000\u0000"+
		"(\u010b\u0001\u0000\u0000\u0000*\u0116\u0001\u0000\u0000\u0000,\u0118"+
		"\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u00000\u0127\u0001\u0000"+
		"\u0000\u00002\u0134\u0001\u0000\u0000\u00004\u013a\u0001\u0000\u0000\u0000"+
		"6\u015b\u0001\u0000\u0000\u00008\u0161\u0001\u0000\u0000\u0000:\u0175"+
		"\u0001\u0000\u0000\u0000<\u0180\u0001\u0000\u0000\u0000>\u018d\u0001\u0000"+
		"\u0000\u0000@\u018f\u0001\u0000\u0000\u0000B\u0192\u0001\u0000\u0000\u0000"+
		"D\u01a4\u0001\u0000\u0000\u0000F\u01be\u0001\u0000\u0000\u0000H\u01c3"+
		"\u0001\u0000\u0000\u0000J\u01ca\u0001\u0000\u0000\u0000L\u01cc\u0001\u0000"+
		"\u0000\u0000N\u01d7\u0001\u0000\u0000\u0000P\u01e2\u0001\u0000\u0000\u0000"+
		"R\u01ec\u0001\u0000\u0000\u0000T\u01f1\u0001\u0000\u0000\u0000V\u01f3"+
		"\u0001\u0000\u0000\u0000X\u01fa\u0001\u0000\u0000\u0000Z\u01fc\u0001\u0000"+
		"\u0000\u0000\\\u0200\u0001\u0000\u0000\u0000^\u0206\u0001\u0000\u0000"+
		"\u0000`\u020b\u0001\u0000\u0000\u0000b\u0211\u0001\u0000\u0000\u0000d"+
		"f\u0003\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0000\u0000\u0001k\u0001"+
		"\u0001\u0000\u0000\u0000lu\u0003\u0004\u0002\u0000mu\u0003\u0006\u0003"+
		"\u0000nu\u0003F#\u0000ou\u00030\u0018\u0000pu\u0003@ \u0000qu\u0003\u0018"+
		"\f\u0000ru\u0003B!\u0000su\u0003D\"\u0000tl\u0001\u0000\u0000\u0000tm"+
		"\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000to\u0001\u0000\u0000"+
		"\u0000tp\u0001\u0000\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000ts\u0001\u0000\u0000\u0000u\u0003\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0004\u0000\u0000wx\u0005\u0019\u0000\u0000x}\u0007\u0000\u0000"+
		"\u0000yz\u0005 \u0000\u0000z|\u0007\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u001a\u0000\u0000\u0081\u0082\u0005\u0005\u0000"+
		"\u0000\u0082\u0083\u00050\u0000\u0000\u0083\u0084\u0005!\u0000\u0000\u0084"+
		"\u0005\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086"+
		"\u0087\u0005\b\u0000\u0000\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u0089"+
		"\u0005\u0019\u0000\u0000\u0089\u008a\u0003\b\u0004\u0000\u008a\u008b\u0005"+
		"\u001a\u0000\u0000\u008b\u008c\u0005\u001e\u0000\u0000\u008c\u0007\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\n\u0005\u0000\u008e\u008f\u0005 "+
		"\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\t\u0001\u0000\u0000"+
		"\u0000\u0094\u009a\u0003\f\u0006\u0000\u0095\u009a\u0003\u0014\n\u0000"+
		"\u0096\u009a\u0003\u0012\t\u0000\u0097\u009a\u0003\u000e\u0007\u0000\u0098"+
		"\u009a\u0003\u0016\u000b\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099"+
		"\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u000b\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u000f\u0000\u0000\u009c"+
		"\u009d\u0005\u001f\u0000\u0000\u009d\u009e\u0003(\u0014\u0000\u009e\r"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0010\u0000\u0000\u00a0\u00a1"+
		"\u0005\u001f\u0000\u0000\u00a1\u00a2\u0003(\u0014\u0000\u00a2\u000f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a7\u0005*\u0000\u0000\u00a4\u00a6\u0003J%"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005*\u0000\u0000\u00ab\u0011\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0011\u0000\u0000\u00ad\u00b1\u0005\u001f\u0000\u0000"+
		"\u00ae\u00b0\u0003(\u0014\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u0013\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0012\u0000\u0000\u00b5"+
		"\u00b6\u0005\u001f\u0000\u0000\u00b6\u00b7\u0003(\u0014\u0000\u00b7\u0015"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u00052\u0000\u0000\u00b9\u00ba\u0005"+
		"\u001f\u0000\u0000\u00ba\u00bb\u0003*\u0015\u0000\u00bb\u0017\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0006\u0000\u0000\u00bd\u00be\u0005\u0007"+
		"\u0000\u0000\u00be\u00bf\u00052\u0000\u0000\u00bf\u00c0\u0003\u001a\r"+
		"\u0000\u00c0\u0019\u0001\u0000\u0000\u0000\u00c1\u00c6\u0005\u0019\u0000"+
		"\u0000\u00c2\u00c5\u0003\u001c\u000e\u0000\u00c3\u00c5\u0003\u001e\u000f"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001a\u0000"+
		"\u0000\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cd\u00052\u0000\u0000"+
		"\u00cc\u00ce\u0005\u001f\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0003&\u0013\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\'\u0000\u0000\u00d3\u00d5\u0003*\u0015\u0000\u00d4\u00d6"+
		"\u0005!\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"2\u0000\u0000\u00d8\u00da\u0005\u001d\u0000\u0000\u00d9\u00db\u0003 \u0010"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u001e\u0000"+
		"\u0000\u00dd\u00de\u0005\u001f\u0000\u0000\u00de\u00df\u0003&\u0013\u0000"+
		"\u00df\u00e0\u0003$\u0012\u0000\u00e0\u001f\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e6\u0003\"\u0011\u0000\u00e2\u00e3\u0005 \u0000\u0000\u00e3\u00e5"+
		"\u0003\"\u0011\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7!\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u00052\u0000\u0000\u00ea\u00ec\u0005\u001f\u0000"+
		"\u0000\u00eb\u00ed\u0003&\u0013\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00f0\u00052\u0000\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0#\u0001\u0000\u0000\u0000\u00f1\u00f5"+
		"\u0005\u0019\u0000\u0000\u00f2\u00f4\u0003\u0002\u0001\u0000\u00f3\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0005\u001a\u0000\u0000\u00f9%\u0001\u0000\u0000\u0000\u00fa\u0100\u0003"+
		"(\u0014\u0000\u00fb\u00fc\u0003(\u0014\u0000\u00fc\u00fd\u0005+\u0000"+
		"\u0000\u00fd\u00fe\u0003&\u0013\u0000\u00fe\u0100\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fa\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001\u0000\u0000\u0000"+
		"\u0100\'\u0001\u0000\u0000\u0000\u0101\u010c\u00051\u0000\u0000\u0102"+
		"\u010c\u0005\t\u0000\u0000\u0103\u010c\u0005(\u0000\u0000\u0104\u010c"+
		"\u0005)\u0000\u0000\u0105\u010c\u0005\u0017\u0000\u0000\u0106\u010c\u0005"+
		"2\u0000\u0000\u0107\u010c\u0003\u0010\b\u0000\u0108\u010c\u0003.\u0017"+
		"\u0000\u0109\u010c\u00030\u0018\u0000\u010a\u010c\u0003,\u0016\u0000\u010b"+
		"\u0101\u0001\u0000\u0000\u0000\u010b\u0102\u0001\u0000\u0000\u0000\u010b"+
		"\u0103\u0001\u0000\u0000\u0000\u010b\u0104\u0001\u0000\u0000\u0000\u010b"+
		"\u0105\u0001\u0000\u0000\u0000\u010b\u0106\u0001\u0000\u0000\u0000\u010b"+
		"\u0107\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		")\u0001\u0000\u0000\u0000\u010d\u0117\u0003,\u0016\u0000\u010e\u0117\u0003"+
		".\u0017\u0000\u010f\u0117\u00030\u0018\u0000\u0110\u0117\u00034\u001a"+
		"\u0000\u0111\u0117\u00036\u001b\u0000\u0112\u0117\u0003:\u001d\u0000\u0113"+
		"\u0117\u0003<\u001e\u0000\u0114\u0117\u0003>\u001f\u0000\u0115\u0117\u0003"+
		"F#\u0000\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000"+
		"\u0000\u0116\u010f\u0001\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000"+
		"\u0000\u0116\u0111\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000"+
		"\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000"+
		"\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117+\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0007\u0001\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u011a"+
		"\u0123\u0005\u001b\u0000\u0000\u011b\u0120\u0003*\u0015\u0000\u011c\u011d"+
		"\u0005 \u0000\u0000\u011d\u011f\u0003*\u0015\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u011b\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0005\u001c\u0000\u0000\u0126/\u0001\u0000\u0000"+
		"\u0000\u0127\u0130\u0005\u0019\u0000\u0000\u0128\u012d\u00032\u0019\u0000"+
		"\u0129\u012a\u0005 \u0000\u0000\u012a\u012c\u00032\u0019\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0128"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u001a\u0000\u0000\u01331\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u00052\u0000\u0000\u0135\u0136\u0005\u001f"+
		"\u0000\u0000\u0136\u0137\u0003*\u0015\u0000\u01373\u0001\u0000\u0000\u0000"+
		"\u0138\u013b\u00052\u0000\u0000\u0139\u013b\u0003>\u001f\u0000\u013a\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u0145\u0005\u001d\u0000\u0000\u013d\u0142"+
		"\u0003*\u0015\u0000\u013e\u013f\u0005 \u0000\u0000\u013f\u0141\u0003*"+
		"\u0015\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u013d\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0158\u0005\u001e"+
		"\u0000\u0000\u0148\u0149\u0005\"\u0000\u0000\u0149\u014a\u00052\u0000"+
		"\u0000\u014a\u0153\u0005\u001d\u0000\u0000\u014b\u0150\u0003*\u0015\u0000"+
		"\u014c\u014d\u0005 \u0000\u0000\u014d\u014f\u0003*\u0015\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0154"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u014b"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0005\u001e\u0000\u0000\u0156\u0148"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u01595\u0001"+
		"\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"\u001d\u0000\u0000\u015c\u015d\u0003 \u0010\u0000\u015d\u015e\u0005\u001e"+
		"\u0000\u0000\u015e\u015f\u0005,\u0000\u0000\u015f\u0160\u0003>\u001f\u0000"+
		"\u01607\u0001\u0000\u0000\u0000\u0161\u0162\u0005-\u0000\u0000\u0162\u0163"+
		"\u00056\u0000\u0000\u01639\u0001\u0000\u0000\u0000\u0164\u016c\u00052"+
		"\u0000\u0000\u0165\u016d\u0005#\u0000\u0000\u0166\u016d\u0005$\u0000\u0000"+
		"\u0167\u016d\u0005%\u0000\u0000\u0168\u016d\u00057\u0000\u0000\u0169\u016d"+
		"\u0005&\u0000\u0000\u016a\u016d\u0005.\u0000\u0000\u016b\u016d\u00038"+
		"\u001c\u0000\u016c\u0165\u0001\u0000\u0000\u0000\u016c\u0166\u0001\u0000"+
		"\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000\u016c\u0168\u0001\u0000"+
		"\u0000\u0000\u016c\u0169\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u0176\u0003*\u0015\u0000\u016f\u0170\u00052\u0000\u0000"+
		"\u0170\u0171\u0005#\u0000\u0000\u0171\u0176\u0005#\u0000\u0000\u0172\u0173"+
		"\u00052\u0000\u0000\u0173\u0174\u0005$\u0000\u0000\u0174\u0176\u0005$"+
		"\u0000\u0000\u0175\u0164\u0001\u0000\u0000\u0000\u0175\u016f\u0001\u0000"+
		"\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0176;\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003>\u001f\u0000\u0178\u0179\u0005\'\u0000\u0000"+
		"\u0179\u017a\u0003*\u0015\u0000\u017a\u0181\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0003>\u001f\u0000\u017c\u017d\u0005\'\u0000\u0000\u017d\u017e"+
		"\u0005\'\u0000\u0000\u017e\u017f\u0003*\u0015\u0000\u017f\u0181\u0001"+
		"\u0000\u0000\u0000\u0180\u0177\u0001\u0000\u0000\u0000\u0180\u017b\u0001"+
		"\u0000\u0000\u0000\u0181=\u0001\u0000\u0000\u0000\u0182\u0187\u00052\u0000"+
		"\u0000\u0183\u0184\u0005\"\u0000\u0000\u0184\u0186\u00052\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188\u018e\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u00052\u0000\u0000\u018b\u018c\u0005\"\u0000\u0000\u018c"+
		"\u018e\u00034\u001a\u0000\u018d\u0182\u0001\u0000\u0000\u0000\u018d\u018a"+
		"\u0001\u0000\u0000\u0000\u018e?\u0001\u0000\u0000\u0000\u018f\u0190\u0003"+
		"*\u0015\u0000\u0190\u0191\u0005!\u0000\u0000\u0191A\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0005\f\u0000\u0000\u0193\u0194\u0005\u001d\u0000\u0000"+
		"\u0194\u0196\u0003F#\u0000\u0195\u0197\u0003*\u0015\u0000\u0196\u0195"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0005!\u0000\u0000\u0199\u019a\u0003"+
		"*\u0015\u0000\u019a\u019b\u0005\u001e\u0000\u0000\u019b\u019f\u0005\u0019"+
		"\u0000\u0000\u019c\u019e\u0003\u0002\u0001\u0000\u019d\u019c\u0001\u0000"+
		"\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u001a"+
		"\u0000\u0000\u01a3C\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\n\u0000"+
		"\u0000\u01a5\u01a6\u0005\u001d\u0000\u0000\u01a6\u01a7\u0003*\u0015\u0000"+
		"\u01a7\u01a8\u0005\u001e\u0000\u0000\u01a8\u01a9\u0005\u0019\u0000\u0000"+
		"\u01a9\u01aa\u0003\u0002\u0001\u0000\u01aa\u01b3\u0005\u001a\u0000\u0000"+
		"\u01ab\u01ad\u0005\u000b\u0000\u0000\u01ac\u01ae\u0005\u0019\u0000\u0000"+
		"\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0003\u0002\u0001\u0000"+
		"\u01b0\u01b2\u0005\u001a\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01ab\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4E\u0001\u0000\u0000\u0000\u01b5\u01b6\u0007\u0002\u0000\u0000\u01b6"+
		"\u01b7\u00052\u0000\u0000\u01b7\u01b8\u0005\'\u0000\u0000\u01b8\u01b9"+
		"\u0003*\u0015\u0000\u01b9\u01ba\u0005!\u0000\u0000\u01ba\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u00052\u0000\u0000\u01bc\u01bd\u0005\'\u0000"+
		"\u0000\u01bd\u01bf\u0003*\u0015\u0000\u01be\u01b5\u0001\u0000\u0000\u0000"+
		"\u01be\u01bb\u0001\u0000\u0000\u0000\u01bfG\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0003J%\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c7\u0005\u0000\u0000\u0001\u01c7I\u0001\u0000"+
		"\u0000\u0000\u01c8\u01cb\u0003L&\u0000\u01c9\u01cb\u0003N\'\u0000\u01ca"+
		"\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb"+
		"K\u0001\u0000\u0000\u0000\u01cc\u01d2\u0003P(\u0000\u01cd\u01d1\u0003"+
		"J%\u0000\u01ce\u01d1\u0003T*\u0000\u01cf\u01d1\u0003V+\u0000\u01d0\u01cd"+
		"\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0003R)\u0000\u01d6M\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005-\u0000"+
		"\u0000\u01d8\u01dc\u00055\u0000\u0000\u01d9\u01db\u0003X,\u0000\u01da"+
		"\u01d9\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd"+
		"\u01df\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0005/\u0000\u0000\u01e0\u01e1\u0005.\u0000\u0000\u01e1O\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e3\u0005-\u0000\u0000\u01e3\u01e7\u00055\u0000"+
		"\u0000\u01e4\u01e6\u0003X,\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9"+
		"\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005.\u0000\u0000\u01ebQ\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0005-\u0000\u0000\u01ed\u01ee\u00057\u0000"+
		"\u0000\u01ee\u01ef\u00055\u0000\u0000\u01ef\u01f0\u0005.\u0000\u0000\u01f0"+
		"S\u0001\u0000\u0000\u0000\u01f1\u01f2\u00053\u0000\u0000\u01f2U\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0007\u0003\u0000\u0000\u01f4W\u0001\u0000"+
		"\u0000\u0000\u01f5\u01fb\u0003Z-\u0000\u01f6\u01fb\u0003\\.\u0000\u01f7"+
		"\u01fb\u0003^/\u0000\u01f8\u01fb\u0003`0\u0000\u01f9\u01fb\u0003b1\u0000"+
		"\u01fa\u01f5\u0001\u0000\u0000\u0000\u01fa\u01f6\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fbY\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u00052\u0000\u0000\u01fd\u01fe\u0005\'\u0000\u0000\u01fe\u01ff"+
		"\u00050\u0000\u0000\u01ff[\u0001\u0000\u0000\u0000\u0200\u0201\u0005\u001b"+
		"\u0000\u0000\u0201\u0202\u00052\u0000\u0000\u0202\u0203\u0005\u001c\u0000"+
		"\u0000\u0203\u0204\u0005\'\u0000\u0000\u0204\u0205\u00050\u0000\u0000"+
		"\u0205]\u0001\u0000\u0000\u0000\u0206\u0207\u0005%\u0000\u0000\u0207\u0208"+
		"\u00052\u0000\u0000\u0208\u0209\u0005\'\u0000\u0000\u0209\u020a\u0005"+
		"0\u0000\u0000\u020a_\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u001d\u0000"+
		"\u0000\u020c\u020d\u00052\u0000\u0000\u020d\u020e\u0005\u001e\u0000\u0000"+
		"\u020e\u020f\u0005\'\u0000\u0000\u020f\u0210\u00050\u0000\u0000\u0210"+
		"a\u0001\u0000\u0000\u0000\u0211\u0212\u0005\u001b\u0000\u0000\u0212\u0213"+
		"\u0005\u001d\u0000\u0000\u0213\u0214\u00052\u0000\u0000\u0214\u0215\u0005"+
		"\u001e\u0000\u0000\u0215\u0216\u0005\u001c\u0000\u0000\u0216\u0217\u0005"+
		"\'\u0000\u0000\u0217\u0218\u00050\u0000\u0000\u0218c\u0001\u0000\u0000"+
		"\u00000gt}\u0092\u0099\u00a7\u00b1\u00c4\u00c6\u00cd\u00d0\u00d5\u00da"+
		"\u00e6\u00ec\u00ef\u00f5\u00ff\u010b\u0116\u0120\u0123\u012d\u0130\u013a"+
		"\u0142\u0145\u0150\u0153\u0158\u016c\u0175\u0180\u0187\u018d\u0196\u019f"+
		"\u01ad\u01b1\u01b3\u01be\u01c3\u01ca\u01d0\u01d2\u01dc\u01e7\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}