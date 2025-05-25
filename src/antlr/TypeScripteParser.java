// Generated from C:/Users/HP ALL IN ONE/IdeaProjects/code/src/antlr/TypeScripteParser.g4 by ANTLR 4.13.2
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
		IDENTIFIER=50, ANGULAR_EXPRESSION=51, TAG_NAME=52, SPASE=53, SLASH=54;
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
		RULE_variableDeclaration = 35, RULE_element = 36, RULE_completeTag = 37, 
		RULE_selfClosingTag = 38, RULE_openTag = 39, RULE_closedTag = 40, RULE_angularExpression = 41, 
		RULE_content = 42, RULE_normalAttribute = 43, RULE_bindingAttribute = 44, 
		RULE_direvtiveAttribute = 45, RULE_eventAttribute = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "componentDeclaration", "componentBody", 
			"field", "selectorField", "templateField", "backTemplate", "importsField", 
			"standaloneField", "otherFields", "classDeclaration", "classBody", "propertyDeclaration", 
			"methodDeclaration", "parameterList", "parameter", "methodBody", "type", 
			"primitiveType", "expression", "literal", "arrayLiteral", "objectLiteral", 
			"propertyAssignment", "functionCall", "arrowFunction", "lt", "operation", 
			"assignmentExpression", "propertyAccess", "expressionStatement", "forLoop", 
			"ifStatement", "variableDeclaration", "element", "completeTag", "selfClosingTag", 
			"openTag", "closedTag", "angularExpression", "content", "normalAttribute", 
			"bindingAttribute", "direvtiveAttribute", "eventAttribute"
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
			null, null, null, null, "' '"
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
			"TAG_NAME", "SPASE", "SLASH"
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325574678096L) != 0)) {
				{
				{
				setState(94);
				statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				importStatement();
				}
				break;
			case 2:
				_localctx = new ComponentStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new VariableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ObjectLiteralStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				objectLiteral();
				}
				break;
			case 5:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				expressionStatement();
				}
				break;
			case 6:
				_localctx = new ClassStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				classDeclaration();
				}
				break;
			case 7:
				_localctx = new ForLoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				forLoop();
				}
				break;
			case 8:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
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
			setState(112);
			match(IMPORT);
			setState(113);
			match(LBRACE);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==COMPONENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
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
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(RBRACE);
			setState(123);
			match(FROM);
			setState(124);
			match(STRING);
			setState(125);
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
			setState(127);
			match(AT);
			setState(128);
			match(COMPONENT);
			setState(129);
			match(LPAREN);
			setState(130);
			match(LBRACE);
			setState(131);
			componentBody();
			setState(132);
			match(RBRACE);
			setState(133);
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
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				field();
				setState(136);
				match(COMMA);
				}
				}
				setState(140); 
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorFldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				selectorField();
				}
				break;
			case STANDALONE:
				_localctx = new StandaloneFldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				standaloneField();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsFldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				importsField();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateFldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				templateField();
				}
				break;
			case IDENTIFIER:
				_localctx = new OtherFldsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
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
			setState(149);
			match(SELECTOR);
			setState(150);
			match(COLON);
			setState(151);
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
			setState(153);
			match(TEMPLATE);
			setState(154);
			match(COLON);
			setState(155);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(BACKTICK);
			setState(158);
			element();
			setState(159);
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
			setState(161);
			match(IMPORTS);
			setState(162);
			match(COLON);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1978021600821760L) != 0)) {
				{
				{
				setState(163);
				primitiveType();
				}
				}
				setState(168);
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
			setState(169);
			match(STANDALONE);
			setState(170);
			match(COLON);
			setState(171);
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
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(COLON);
			setState(175);
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
			setState(177);
			match(EXPORT);
			setState(178);
			match(CLASS);
			setState(179);
			match(IDENTIFIER);
			setState(180);
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
			setState(182);
			match(LBRACE);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(183);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(184);
					methodDeclaration();
					}
					break;
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
			setState(192);
			match(IDENTIFIER);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(193);
				match(COLON);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1978021600821760L) != 0)) {
				{
				setState(196);
				type();
				}
			}

			setState(199);
			match(EQUALS);
			setState(200);
			expression();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(201);
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
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(LPAREN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(206);
				parameterList();
				}
			}

			setState(209);
			match(RPAREN);
			setState(210);
			match(COLON);
			setState(211);
			type();
			setState(212);
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
			setState(214);
			parameter();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				parameter();
				}
				}
				setState(221);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(IDENTIFIER);
				setState(223);
				match(COLON);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1978021600821760L) != 0)) {
					{
					setState(224);
					type();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
			setState(230);
			match(LBRACE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325574678096L) != 0)) {
				{
				{
				setState(231);
				statement();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				primitiveType();
				setState(241);
				match(PIPE);
				setState(242);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(MYSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(VOID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				backTemplate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(253);
				arrayLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(254);
				objectLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				literal();
				}
				break;
			case 2:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				arrayLiteral();
				}
				break;
			case 3:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				objectLiteral();
				}
				break;
			case 4:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				functionCall();
				}
				break;
			case 5:
				_localctx = new ArrowFunctionExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				arrowFunction();
				}
				break;
			case 6:
				_localctx = new OperationExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				operation();
				}
				break;
			case 7:
				_localctx = new AssignmentExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				assignmentExpression();
				}
				break;
			case 8:
				_localctx = new PropertyAccessExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				propertyAccess();
				}
				break;
			case 9:
				_localctx = new VarDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
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
			setState(269);
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
			setState(271);
			match(LBRACKET);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
				{
				setState(272);
				expression();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					expression();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(282);
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
			setState(284);
			match(LBRACE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(285);
				propertyAssignment();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(286);
					match(COMMA);
					setState(287);
					propertyAssignment();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(295);
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
			setState(297);
			match(IDENTIFIER);
			setState(298);
			match(COLON);
			setState(299);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(301);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(302);
				propertyAccess();
				}
				break;
			}
			setState(305);
			match(LPAREN);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
				{
				setState(306);
				expression();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(307);
					match(COMMA);
					setState(308);
					expression();
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(RPAREN);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(317);
				match(DOT);
				setState(318);
				match(IDENTIFIER);
				setState(319);
				match(LPAREN);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
					{
					setState(320);
					expression();
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(321);
						match(COMMA);
						setState(322);
						expression();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(330);
				match(RPAREN);
				}
				}
				setState(335);
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
			setState(336);
			match(LPAREN);
			setState(337);
			parameterList();
			setState(338);
			match(RPAREN);
			setState(339);
			match(ARROW);
			setState(340);
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
			setState(342);
			match(OPEN_SYMBOL);
			setState(343);
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(IDENTIFIER);
				setState(353);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(346);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(347);
					match(MINUS);
					}
					break;
				case STAR:
					{
					setState(348);
					match(STAR);
					}
					break;
				case SLASH:
					{
					setState(349);
					match(SLASH);
					}
					break;
				case MOD:
					{
					setState(350);
					match(MOD);
					}
					break;
				case CLOSED_SYMBOL:
					{
					setState(351);
					match(CLOSED_SYMBOL);
					}
					break;
				case OPEN_SYMBOL:
					{
					setState(352);
					lt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(355);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(IDENTIFIER);
				{
				setState(357);
				match(PLUS);
				setState(358);
				match(PLUS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(IDENTIFIER);
				{
				setState(360);
				match(MINUS);
				setState(361);
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
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				propertyAccess();
				setState(365);
				match(EQUALS);
				setState(366);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				propertyAccess();
				setState(369);
				match(EQUALS);
				setState(370);
				match(EQUALS);
				setState(371);
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
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(IDENTIFIER);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(376);
					match(DOT);
					setState(377);
					match(IDENTIFIER);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(IDENTIFIER);
				setState(384);
				match(DOT);
				setState(385);
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
			setState(388);
			expression();
			setState(389);
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
			setState(391);
			match(FOR);
			setState(392);
			match(LPAREN);
			setState(393);
			variableDeclaration();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325557895680L) != 0)) {
				{
				setState(394);
				expression();
				}
			}

			setState(397);
			match(SEMICOLON);
			setState(398);
			expression();
			setState(399);
			match(RPAREN);
			setState(400);
			match(LBRACE);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970325574678096L) != 0)) {
				{
				{
				setState(401);
				statement();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
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
			setState(409);
			match(IF);
			setState(410);
			match(LPAREN);
			setState(411);
			expression();
			setState(412);
			match(RPAREN);
			setState(413);
			match(LBRACE);
			setState(414);
			statement();
			setState(415);
			match(RBRACE);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(416);
				match(ELSE);
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(417);
					match(LBRACE);
					}
					break;
				}
				setState(420);
				statement();
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(421);
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
			setState(435);
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
				setState(426);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1597952L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(427);
				match(IDENTIFIER);
				setState(428);
				match(EQUALS);
				setState(429);
				expression();
				setState(430);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new VarReassignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(IDENTIFIER);
				setState(433);
				match(EQUALS);
				setState(434);
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
		enterRule(_localctx, 72, RULE_element);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new CompleteElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				completeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
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
		enterRule(_localctx, 74, RULE_completeTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			openTag();
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(444);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_SYMBOL:
						{
						setState(442);
						element();
						}
						break;
					case ANGULAR_EXPRESSION:
						{
						setState(443);
						angularExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(449);
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
		enterRule(_localctx, 76, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(OPEN_SYMBOL);
			setState(452);
			match(TAG_NAME);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126038016884736L) != 0)) {
				{
				{
				setState(453);
				content();
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			match(SLASHSELF);
			setState(460);
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
		enterRule(_localctx, 78, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(OPEN_SYMBOL);
			setState(463);
			match(TAG_NAME);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126038016884736L) != 0)) {
				{
				{
				setState(464);
				content();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
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
		enterRule(_localctx, 80, RULE_closedTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(OPEN_SYMBOL);
			setState(473);
			match(SLASH);
			setState(474);
			match(TAG_NAME);
			setState(475);
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
		enterRule(_localctx, 82, RULE_angularExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
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
		enterRule(_localctx, 84, RULE_content);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new NormalAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				normalAttribute();
				}
				break;
			case LBRACKET:
				_localctx = new BindingAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				bindingAttribute();
				}
				break;
			case STAR:
				_localctx = new DirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				direvtiveAttribute();
				}
				break;
			case LPAREN:
				_localctx = new EventAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				eventAttribute();
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
		enterRule(_localctx, 86, RULE_normalAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(IDENTIFIER);
			setState(486);
			match(EQUALS);
			setState(487);
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
		enterRule(_localctx, 88, RULE_bindingAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(LBRACKET);
			setState(490);
			match(IDENTIFIER);
			setState(491);
			match(RBRACKET);
			setState(492);
			match(EQUALS);
			setState(493);
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
		enterRule(_localctx, 90, RULE_direvtiveAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(STAR);
			setState(496);
			match(IDENTIFIER);
			setState(497);
			match(EQUALS);
			setState(498);
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
		enterRule(_localctx, 92, RULE_eventAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(LPAREN);
			setState(501);
			match(IDENTIFIER);
			setState(502);
			match(RPAREN);
			setState(503);
			match(EQUALS);
			setState(504);
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
		"\u0004\u00016\u01fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0005\u0000`\b\u0000\n\u0000\f\u0000"+
		"c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"o\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002v\b\u0002\n\u0002\f\u0002y\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u008b\b\u0004\u000b\u0004\f\u0004"+
		"\u008c\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0094\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u00a5\b\t\n\t\f\t\u00a8\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00ba\b\r\n\r\f\r\u00bd\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00c3\b\u000e\u0001\u000e\u0003\u000e\u00c6\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cb\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00d0\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00da\b\u0010\n\u0010\f\u0010\u00dd\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00e2\b\u0011\u0001\u0011\u0003\u0011\u00e5\b"+
		"\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u00e9\b\u0012\n\u0012\f\u0012"+
		"\u00ec\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00f5\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0101\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u010c\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0114\b\u0017\n\u0017"+
		"\f\u0017\u0117\t\u0017\u0003\u0017\u0119\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0121\b\u0018"+
		"\n\u0018\f\u0018\u0124\t\u0018\u0003\u0018\u0126\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0130\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0005\u001a\u0136\b\u001a\n\u001a\f\u001a\u0139\t\u001a\u0003\u001a"+
		"\u013b\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0144\b\u001a\n\u001a\f\u001a\u0147"+
		"\t\u001a\u0003\u001a\u0149\b\u001a\u0001\u001a\u0005\u001a\u014c\b\u001a"+
		"\n\u001a\f\u001a\u014f\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0162\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u016b"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0176\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u017b\b\u001f\n\u001f\f\u001f"+
		"\u017e\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0183\b"+
		"\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u018c\b"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0193\b!\n!\f!\u0196\t!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01a3\b\"\u0001\"\u0001\"\u0003\"\u01a7\b\"\u0003\""+
		"\u01a9\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01b4\b#\u0001$\u0001$\u0003$\u01b8\b$\u0001%\u0001%\u0001%\u0005"+
		"%\u01bd\b%\n%\f%\u01c0\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&\u01c7"+
		"\b&\n&\f&\u01ca\t&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u01d2\b\'\n\'\f\'\u01d5\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u01e4\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0000\u0000/\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"\u0000\u0003\u0002\u0000\b\b22\u0002\u0000\u0015\u001701\u0003\u0000\t"+
		"\t\r\u000e\u0013\u0014\u0219\u0000a\u0001\u0000\u0000\u0000\u0002n\u0001"+
		"\u0000\u0000\u0000\u0004p\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000"+
		"\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n\u0093\u0001\u0000\u0000"+
		"\u0000\f\u0095\u0001\u0000\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000"+
		"\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000"+
		"\u0014\u00a9\u0001\u0000\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000"+
		"\u0018\u00b1\u0001\u0000\u0000\u0000\u001a\u00b6\u0001\u0000\u0000\u0000"+
		"\u001c\u00c0\u0001\u0000\u0000\u0000\u001e\u00cc\u0001\u0000\u0000\u0000"+
		" \u00d6\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000$\u00e6"+
		"\u0001\u0000\u0000\u0000&\u00f4\u0001\u0000\u0000\u0000(\u0100\u0001\u0000"+
		"\u0000\u0000*\u010b\u0001\u0000\u0000\u0000,\u010d\u0001\u0000\u0000\u0000"+
		".\u010f\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u00002\u0129"+
		"\u0001\u0000\u0000\u00004\u012f\u0001\u0000\u0000\u00006\u0150\u0001\u0000"+
		"\u0000\u00008\u0156\u0001\u0000\u0000\u0000:\u016a\u0001\u0000\u0000\u0000"+
		"<\u0175\u0001\u0000\u0000\u0000>\u0182\u0001\u0000\u0000\u0000@\u0184"+
		"\u0001\u0000\u0000\u0000B\u0187\u0001\u0000\u0000\u0000D\u0199\u0001\u0000"+
		"\u0000\u0000F\u01b3\u0001\u0000\u0000\u0000H\u01b7\u0001\u0000\u0000\u0000"+
		"J\u01b9\u0001\u0000\u0000\u0000L\u01c3\u0001\u0000\u0000\u0000N\u01ce"+
		"\u0001\u0000\u0000\u0000P\u01d8\u0001\u0000\u0000\u0000R\u01dd\u0001\u0000"+
		"\u0000\u0000T\u01e3\u0001\u0000\u0000\u0000V\u01e5\u0001\u0000\u0000\u0000"+
		"X\u01e9\u0001\u0000\u0000\u0000Z\u01ef\u0001\u0000\u0000\u0000\\\u01f4"+
		"\u0001\u0000\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005"+
		"\u0000\u0000\u0001e\u0001\u0001\u0000\u0000\u0000fo\u0003\u0004\u0002"+
		"\u0000go\u0003\u0006\u0003\u0000ho\u0003F#\u0000io\u00030\u0018\u0000"+
		"jo\u0003@ \u0000ko\u0003\u0018\f\u0000lo\u0003B!\u0000mo\u0003D\"\u0000"+
		"nf\u0001\u0000\u0000\u0000ng\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000"+
		"\u0000ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0003"+
		"\u0001\u0000\u0000\u0000pq\u0005\u0004\u0000\u0000qr\u0005\u0019\u0000"+
		"\u0000rw\u0007\u0000\u0000\u0000st\u0005 \u0000\u0000tv\u0007\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0005\u0005\u0000\u0000"+
		"|}\u00050\u0000\u0000}~\u0005!\u0000\u0000~\u0005\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\u0018\u0000\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081"+
		"\u0082\u0005\u001d\u0000\u0000\u0082\u0083\u0005\u0019\u0000\u0000\u0083"+
		"\u0084\u0003\b\u0004\u0000\u0084\u0085\u0005\u001a\u0000\u0000\u0085\u0086"+
		"\u0005\u001e\u0000\u0000\u0086\u0007\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0003\n\u0005\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008b\u0001"+
		"\u0000\u0000\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\t\u0001\u0000\u0000\u0000\u008e\u0094\u0003\f"+
		"\u0006\u0000\u008f\u0094\u0003\u0014\n\u0000\u0090\u0094\u0003\u0012\t"+
		"\u0000\u0091\u0094\u0003\u000e\u0007\u0000\u0092\u0094\u0003\u0016\u000b"+
		"\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000"+
		"\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u000b\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0005\u001f\u0000"+
		"\u0000\u0097\u0098\u0003(\u0014\u0000\u0098\r\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005\u0010\u0000\u0000\u009a\u009b\u0005\u001f\u0000\u0000"+
		"\u009b\u009c\u0003(\u0014\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005*\u0000\u0000\u009e\u009f\u0003H$\u0000\u009f\u00a0\u0005"+
		"*\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0011"+
		"\u0000\u0000\u00a2\u00a6\u0005\u001f\u0000\u0000\u00a3\u00a5\u0003(\u0014"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u0013\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0012\u0000\u0000\u00aa\u00ab\u0005\u001f\u0000"+
		"\u0000\u00ab\u00ac\u0003(\u0014\u0000\u00ac\u0015\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u00052\u0000\u0000\u00ae\u00af\u0005\u001f\u0000\u0000\u00af"+
		"\u00b0\u0003*\u0015\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0006\u0000\u0000\u00b2\u00b3\u0005\u0007\u0000\u0000\u00b3\u00b4"+
		"\u00052\u0000\u0000\u00b4\u00b5\u0003\u001a\r\u0000\u00b5\u0019\u0001"+
		"\u0000\u0000\u0000\u00b6\u00bb\u0005\u0019\u0000\u0000\u00b7\u00ba\u0003"+
		"\u001c\u000e\u0000\u00b8\u00ba\u0003\u001e\u000f\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0005\u001a\u0000\u0000\u00bf\u001b\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u00052\u0000\u0000\u00c1\u00c3\u0005\u001f"+
		"\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003&\u0013"+
		"\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\'\u0000\u0000"+
		"\u00c8\u00ca\u0003*\u0015\u0000\u00c9\u00cb\u0005!\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u001d"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u00052\u0000\u0000\u00cd\u00cf\u0005"+
		"\u001d\u0000\u0000\u00ce\u00d0\u0003 \u0010\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\u001e\u0000\u0000\u00d2\u00d3\u0005\u001f"+
		"\u0000\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00d5\u0003$\u0012\u0000"+
		"\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00db\u0003\"\u0011\u0000\u00d7"+
		"\u00d8\u0005 \u0000\u0000\u00d8\u00da\u0003\"\u0011\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc!\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"2\u0000\u0000\u00df\u00e1\u0005\u001f\u0000\u0000\u00e0\u00e2\u0003&\u0013"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e5\u00052\u0000\u0000"+
		"\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5#\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u0019\u0000\u0000\u00e7"+
		"\u00e9\u0003\u0002\u0001\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u001a\u0000\u0000\u00ee"+
		"%\u0001\u0000\u0000\u0000\u00ef\u00f5\u0003(\u0014\u0000\u00f0\u00f1\u0003"+
		"(\u0014\u0000\u00f1\u00f2\u0005+\u0000\u0000\u00f2\u00f3\u0003&\u0013"+
		"\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000"+
		"\u00f6\u0101\u00051\u0000\u0000\u00f7\u0101\u0005\t\u0000\u0000\u00f8"+
		"\u0101\u0005(\u0000\u0000\u00f9\u0101\u0005)\u0000\u0000\u00fa\u0101\u0005"+
		"\u0017\u0000\u0000\u00fb\u0101\u00052\u0000\u0000\u00fc\u0101\u0003\u0010"+
		"\b\u0000\u00fd\u0101\u0003.\u0017\u0000\u00fe\u0101\u00030\u0018\u0000"+
		"\u00ff\u0101\u0003,\u0016\u0000\u0100\u00f6\u0001\u0000\u0000\u0000\u0100"+
		"\u00f7\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000\u0000\u0000\u0100"+
		"\u00f9\u0001\u0000\u0000\u0000\u0100\u00fa\u0001\u0000\u0000\u0000\u0100"+
		"\u00fb\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101)\u0001\u0000\u0000\u0000\u0102\u010c"+
		"\u0003,\u0016\u0000\u0103\u010c\u0003.\u0017\u0000\u0104\u010c\u00030"+
		"\u0018\u0000\u0105\u010c\u00034\u001a\u0000\u0106\u010c\u00036\u001b\u0000"+
		"\u0107\u010c\u0003:\u001d\u0000\u0108\u010c\u0003<\u001e\u0000\u0109\u010c"+
		"\u0003>\u001f\u0000\u010a\u010c\u0003F#\u0000\u010b\u0102\u0001\u0000"+
		"\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u0104\u0001\u0000"+
		"\u0000\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b\u0106\u0001\u0000"+
		"\u0000\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010b\u0108\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010c+\u0001\u0000\u0000\u0000\u010d\u010e\u0007\u0001\u0000"+
		"\u0000\u010e-\u0001\u0000\u0000\u0000\u010f\u0118\u0005\u001b\u0000\u0000"+
		"\u0110\u0115\u0003*\u0015\u0000\u0111\u0112\u0005 \u0000\u0000\u0112\u0114"+
		"\u0003*\u0015\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u0110\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"\u001c\u0000\u0000\u011b/\u0001\u0000\u0000\u0000\u011c\u0125\u0005\u0019"+
		"\u0000\u0000\u011d\u0122\u00032\u0019\u0000\u011e\u011f\u0005 \u0000\u0000"+
		"\u011f\u0121\u00032\u0019\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0125\u011d\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005\u001a\u0000\u0000\u01281\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u00052\u0000\u0000\u012a\u012b\u0005\u001f\u0000\u0000\u012b\u012c\u0003"+
		"*\u0015\u0000\u012c3\u0001\u0000\u0000\u0000\u012d\u0130\u00052\u0000"+
		"\u0000\u012e\u0130\u0003>\u001f\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u013a\u0005\u001d\u0000\u0000\u0132\u0137\u0003*\u0015\u0000\u0133"+
		"\u0134\u0005 \u0000\u0000\u0134\u0136\u0003*\u0015\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013b\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u0132\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u014d\u0005\u001e\u0000\u0000\u013d\u013e\u0005"+
		"\"\u0000\u0000\u013e\u013f\u00052\u0000\u0000\u013f\u0148\u0005\u001d"+
		"\u0000\u0000\u0140\u0145\u0003*\u0015\u0000\u0141\u0142\u0005 \u0000\u0000"+
		"\u0142\u0144\u0003*\u0015\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144"+
		"\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147"+
		"\u0145\u0001\u0000\u0000\u0000\u0148\u0140\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u0005\u001e\u0000\u0000\u014b\u013d\u0001\u0000\u0000\u0000\u014c"+
		"\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0001\u0000\u0000\u0000\u014e5\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u001d\u0000\u0000\u0151\u0152"+
		"\u0003 \u0010\u0000\u0152\u0153\u0005\u001e\u0000\u0000\u0153\u0154\u0005"+
		",\u0000\u0000\u0154\u0155\u0003>\u001f\u0000\u01557\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0005-\u0000\u0000\u0157\u0158\u00055\u0000\u0000\u0158"+
		"9\u0001\u0000\u0000\u0000\u0159\u0161\u00052\u0000\u0000\u015a\u0162\u0005"+
		"#\u0000\u0000\u015b\u0162\u0005$\u0000\u0000\u015c\u0162\u0005%\u0000"+
		"\u0000\u015d\u0162\u00056\u0000\u0000\u015e\u0162\u0005&\u0000\u0000\u015f"+
		"\u0162\u0005.\u0000\u0000\u0160\u0162\u00038\u001c\u0000\u0161\u015a\u0001"+
		"\u0000\u0000\u0000\u0161\u015b\u0001\u0000\u0000\u0000\u0161\u015c\u0001"+
		"\u0000\u0000\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0161\u015e\u0001"+
		"\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u016b\u0003"+
		"*\u0015\u0000\u0164\u0165\u00052\u0000\u0000\u0165\u0166\u0005#\u0000"+
		"\u0000\u0166\u016b\u0005#\u0000\u0000\u0167\u0168\u00052\u0000\u0000\u0168"+
		"\u0169\u0005$\u0000\u0000\u0169\u016b\u0005$\u0000\u0000\u016a\u0159\u0001"+
		"\u0000\u0000\u0000\u016a\u0164\u0001\u0000\u0000\u0000\u016a\u0167\u0001"+
		"\u0000\u0000\u0000\u016b;\u0001\u0000\u0000\u0000\u016c\u016d\u0003>\u001f"+
		"\u0000\u016d\u016e\u0005\'\u0000\u0000\u016e\u016f\u0003*\u0015\u0000"+
		"\u016f\u0176\u0001\u0000\u0000\u0000\u0170\u0171\u0003>\u001f\u0000\u0171"+
		"\u0172\u0005\'\u0000\u0000\u0172\u0173\u0005\'\u0000\u0000\u0173\u0174"+
		"\u0003*\u0015\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u016c\u0001"+
		"\u0000\u0000\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0176=\u0001\u0000"+
		"\u0000\u0000\u0177\u017c\u00052\u0000\u0000\u0178\u0179\u0005\"\u0000"+
		"\u0000\u0179\u017b\u00052\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000"+
		"\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0183\u0001\u0000\u0000\u0000"+
		"\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u00052\u0000\u0000\u0180"+
		"\u0181\u0005\"\u0000\u0000\u0181\u0183\u00034\u001a\u0000\u0182\u0177"+
		"\u0001\u0000\u0000\u0000\u0182\u017f\u0001\u0000\u0000\u0000\u0183?\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0003*\u0015\u0000\u0185\u0186\u0005!\u0000"+
		"\u0000\u0186A\u0001\u0000\u0000\u0000\u0187\u0188\u0005\f\u0000\u0000"+
		"\u0188\u0189\u0005\u001d\u0000\u0000\u0189\u018b\u0003F#\u0000\u018a\u018c"+
		"\u0003*\u0015\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"!\u0000\u0000\u018e\u018f\u0003*\u0015\u0000\u018f\u0190\u0005\u001e\u0000"+
		"\u0000\u0190\u0194\u0005\u0019\u0000\u0000\u0191\u0193\u0003\u0002\u0001"+
		"\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0005\u001a\u0000\u0000\u0198C\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0005\n\u0000\u0000\u019a\u019b\u0005\u001d\u0000\u0000\u019b"+
		"\u019c\u0003*\u0015\u0000\u019c\u019d\u0005\u001e\u0000\u0000\u019d\u019e"+
		"\u0005\u0019\u0000\u0000\u019e\u019f\u0003\u0002\u0001\u0000\u019f\u01a8"+
		"\u0005\u001a\u0000\u0000\u01a0\u01a2\u0005\u000b\u0000\u0000\u01a1\u01a3"+
		"\u0005\u0019\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0003\u0002\u0001\u0000\u01a5\u01a7\u0005\u001a\u0000\u0000\u01a6\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9E\u0001\u0000\u0000\u0000\u01aa\u01ab\u0007"+
		"\u0002\u0000\u0000\u01ab\u01ac\u00052\u0000\u0000\u01ac\u01ad\u0005\'"+
		"\u0000\u0000\u01ad\u01ae\u0003*\u0015\u0000\u01ae\u01af\u0005!\u0000\u0000"+
		"\u01af\u01b4\u0001\u0000\u0000\u0000\u01b0\u01b1\u00052\u0000\u0000\u01b1"+
		"\u01b2\u0005\'\u0000\u0000\u01b2\u01b4\u0003*\u0015\u0000\u01b3\u01aa"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b4G\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b8\u0003J%\u0000\u01b6\u01b8\u0003L&\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8I\u0001\u0000\u0000\u0000\u01b9\u01be\u0003N\'\u0000\u01ba\u01bd"+
		"\u0003H$\u0000\u01bb\u01bd\u0003R)\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000"+
		"\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0003P(\u0000\u01c2K\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005-\u0000\u0000\u01c4\u01c8\u00054\u0000\u0000\u01c5\u01c7\u0003"+
		"T*\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0005/\u0000\u0000\u01cc\u01cd\u0005.\u0000\u0000\u01cd"+
		"M\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005-\u0000\u0000\u01cf\u01d3\u0005"+
		"4\u0000\u0000\u01d0\u01d2\u0003T*\u0000\u01d1\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005.\u0000\u0000"+
		"\u01d7O\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005-\u0000\u0000\u01d9\u01da"+
		"\u00056\u0000\u0000\u01da\u01db\u00054\u0000\u0000\u01db\u01dc\u0005."+
		"\u0000\u0000\u01dcQ\u0001\u0000\u0000\u0000\u01dd\u01de\u00053\u0000\u0000"+
		"\u01deS\u0001\u0000\u0000\u0000\u01df\u01e4\u0003V+\u0000\u01e0\u01e4"+
		"\u0003X,\u0000\u01e1\u01e4\u0003Z-\u0000\u01e2\u01e4\u0003\\.\u0000\u01e3"+
		"\u01df\u0001\u0000\u0000\u0000\u01e3\u01e0\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4"+
		"U\u0001\u0000\u0000\u0000\u01e5\u01e6\u00052\u0000\u0000\u01e6\u01e7\u0005"+
		"\'\u0000\u0000\u01e7\u01e8\u00050\u0000\u0000\u01e8W\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0005\u001b\u0000\u0000\u01ea\u01eb\u00052\u0000\u0000"+
		"\u01eb\u01ec\u0005\u001c\u0000\u0000\u01ec\u01ed\u0005\'\u0000\u0000\u01ed"+
		"\u01ee\u00050\u0000\u0000\u01eeY\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005"+
		"%\u0000\u0000\u01f0\u01f1\u00052\u0000\u0000\u01f1\u01f2\u0005\'\u0000"+
		"\u0000\u01f2\u01f3\u00050\u0000\u0000\u01f3[\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u0005\u001d\u0000\u0000\u01f5\u01f6\u00052\u0000\u0000\u01f6\u01f7"+
		"\u0005\u001e\u0000\u0000\u01f7\u01f8\u0005\'\u0000\u0000\u01f8\u01f9\u0005"+
		"0\u0000\u0000\u01f9]\u0001\u0000\u0000\u0000.anw\u008c\u0093\u00a6\u00b9"+
		"\u00bb\u00c2\u00c5\u00ca\u00cf\u00db\u00e1\u00e4\u00ea\u00f4\u0100\u010b"+
		"\u0115\u0118\u0122\u0125\u012f\u0137\u013a\u0145\u0148\u014d\u0161\u016a"+
		"\u0175\u017c\u0182\u018b\u0194\u01a2\u01a6\u01a8\u01b3\u01b7\u01bc\u01be"+
		"\u01c8\u01d3\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}