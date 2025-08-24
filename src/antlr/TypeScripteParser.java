// Generated from C:/Users/HP ALL IN ONE/Desktop/4th projects/compiler_pro/src/antlr/TypeScripteParser.g4 by ANTLR 4.13.2
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
		INTERFACE=8, COMPONENT=9, MYSTRING=10, INJECTABLE=11, PROVIDEDIN=12, ROOT=13, 
		IF=14, ELSE=15, FOR=16, RETURN=17, NEW=18, PROTECTED=19, PRIVATE=20, PUBLIC=21, 
		INT=22, VAR=23, SELECTOR=24, TEMPLATE=25, IMPORTS=26, STANDALONE=27, CONST=28, 
		THIS=29, LET=30, TRUE=31, FALSE=32, NULL=33, AT=34, LBRACE=35, RBRACE=36, 
		LBRACKET=37, RBRACKET=38, LPAREN=39, RPAREN=40, COLON=41, COMMA=42, SEMICOLON=43, 
		DOTDOTDOT=44, DOLAR=45, DOT=46, PLUS=47, MINUS=48, STAR=49, MOD=50, EQUALS=51, 
		NOTEQUALS=52, ANDAND=53, OROR=54, GREATERTHAN=55, CONSTRUCTOR=56, BOOLEAN=57, 
		VOID=58, BACKTICK=59, PIPE=60, ARROW=61, OPEN_SYMBOL=62, CLOSED_SYMBOL=63, 
		SLASHSELF=64, STRING=65, NUMBER=66, IDENTIFIER=67, ANGULAR_EXPRESSION=68, 
		TAG_NAME=69, SPASE=70, SLASH=71;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_injectableDeclaration = 2, 
		RULE_injectableBody = 3, RULE_importStatement = 4, RULE_componentDeclaration = 5, 
		RULE_componentBody = 6, RULE_field = 7, RULE_selectorField = 8, RULE_templateField = 9, 
		RULE_backTemplate = 10, RULE_importsField = 11, RULE_standaloneField = 12, 
		RULE_otherFields = 13, RULE_classDeclaration = 14, RULE_classBody = 15, 
		RULE_propertyDeclaration = 16, RULE_constructorCall = 17, RULE_methodDeclaration = 18, 
		RULE_parameterList = 19, RULE_parameter = 20, RULE_methodBody = 21, RULE_type = 22, 
		RULE_primitiveType = 23, RULE_expression = 24, RULE_literal = 25, RULE_arrayLiteral = 26, 
		RULE_objectLiteral = 27, RULE_propertyAssignment = 28, RULE_functionCall = 29, 
		RULE_arrowFunction = 30, RULE_lt = 31, RULE_gt = 32, RULE_operation = 33, 
		RULE_keys = 34, RULE_assignmentExpression = 35, RULE_propertyAccess = 36, 
		RULE_expressionStatement = 37, RULE_forLoop = 38, RULE_ifStatement = 39, 
		RULE_variableDeclaration = 40, RULE_constructor = 41, RULE_element = 42, 
		RULE_completeTag = 43, RULE_selfClosingTag = 44, RULE_openTag = 45, RULE_closedTag = 46, 
		RULE_angularExpression = 47, RULE_content = 48, RULE_normalAttribute = 49, 
		RULE_bindingAttribute = 50, RULE_direvtiveAttribute = 51, RULE_eventAttribute = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "injectableDeclaration", "injectableBody", "importStatement", 
			"componentDeclaration", "componentBody", "field", "selectorField", "templateField", 
			"backTemplate", "importsField", "standaloneField", "otherFields", "classDeclaration", 
			"classBody", "propertyDeclaration", "constructorCall", "methodDeclaration", 
			"parameterList", "parameter", "methodBody", "type", "primitiveType", 
			"expression", "literal", "arrayLiteral", "objectLiteral", "propertyAssignment", 
			"functionCall", "arrowFunction", "lt", "gt", "operation", "keys", "assignmentExpression", 
			"propertyAccess", "expressionStatement", "forLoop", "ifStatement", "variableDeclaration", 
			"constructor", "element", "completeTag", "selfClosingTag", "openTag", 
			"closedTag", "angularExpression", "content", "normalAttribute", "bindingAttribute", 
			"direvtiveAttribute", "eventAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'import'", "'from'", "'export'", "'class'", 
			"'interface'", "'Component'", "'String'", "'Injectable'", "'providedIn'", 
			"'root'", "'if'", "'else'", "'for'", "'return'", "'new'", "'protected'", 
			"'private'", "'public'", "'int'", "'var'", "'selector'", "'template'", 
			"'imports'", "'standalone'", "'const'", "'this'", "'let'", "'true'", 
			"'false'", "'null'", "'@'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"':'", "','", "';'", "'...'", "'$'", "'.'", "'+'", "'-'", "'*'", "'%'", 
			"'='", "'!=='", "'&&'", "'||'", "'>='", "'constructor'", "'boolean'", 
			"'void'", "'`'", "'|'", "'=>'", "'<'", "'>'", null, null, null, null, 
			null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LINE_COMMENT", "BLOCK_COMMENT", "IMPORT", "FROM", "EXPORT", 
			"CLASS", "INTERFACE", "COMPONENT", "MYSTRING", "INJECTABLE", "PROVIDEDIN", 
			"ROOT", "IF", "ELSE", "FOR", "RETURN", "NEW", "PROTECTED", "PRIVATE", 
			"PUBLIC", "INT", "VAR", "SELECTOR", "TEMPLATE", "IMPORTS", "STANDALONE", 
			"CONST", "THIS", "LET", "TRUE", "FALSE", "NULL", "AT", "LBRACE", "RBRACE", 
			"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "COLON", "COMMA", "SEMICOLON", 
			"DOTDOTDOT", "DOLAR", "DOT", "PLUS", "MINUS", "STAR", "MOD", "EQUALS", 
			"NOTEQUALS", "ANDAND", "OROR", "GREATERTHAN", "CONSTRUCTOR", "BOOLEAN", 
			"VOID", "BACKTICK", "PIPE", "ARROW", "OPEN_SYMBOL", "CLOSED_SYMBOL", 
			"SLASHSELF", "STRING", "NUMBER", "IDENTIFIER", "ANGULAR_EXPRESSION", 
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4469962611994835760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 71L) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
	public static class InjectableStmtContext extends StatementContext {
		public InjectableDeclarationContext injectableDeclaration() {
			return getRuleContext(InjectableDeclarationContext.class,0);
		}
		public InjectableStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterInjectableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitInjectableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitInjectableStmt(this);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				importStatement();
				}
				break;
			case 2:
				_localctx = new ComponentStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new InjectableStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				injectableDeclaration();
				}
				break;
			case 4:
				_localctx = new VariableStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				variableDeclaration();
				}
				break;
			case 5:
				_localctx = new ObjectLiteralStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				objectLiteral();
				}
				break;
			case 6:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				expressionStatement();
				}
				break;
			case 7:
				_localctx = new ClassStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				classDeclaration();
				}
				break;
			case 8:
				_localctx = new ForLoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				forLoop();
				}
				break;
			case 9:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
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
	public static class InjectableDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(TypeScripteParser.AT, 0); }
		public TerminalNode INJECTABLE() { return getToken(TypeScripteParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public InjectableBodyContext injectableBody() {
			return getRuleContext(InjectableBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public InjectableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterInjectableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitInjectableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitInjectableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableDeclarationContext injectableDeclaration() throws RecognitionException {
		InjectableDeclarationContext _localctx = new InjectableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_injectableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(AT);
			setState(126);
			match(INJECTABLE);
			setState(127);
			match(LPAREN);
			setState(128);
			match(LBRACE);
			setState(129);
			injectableBody();
			setState(130);
			match(RBRACE);
			setState(131);
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
	public static class InjectableBodyContext extends ParserRuleContext {
		public TerminalNode PROVIDEDIN() { return getToken(TypeScripteParser.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(TypeScripteParser.STRING, 0); }
		public InjectableBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterInjectableBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitInjectableBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitInjectableBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableBodyContext injectableBody() throws RecognitionException {
		InjectableBodyContext _localctx = new InjectableBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_injectableBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PROVIDEDIN);
			setState(134);
			match(COLON);
			setState(135);
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
		public List<TerminalNode> INJECTABLE() { return getTokens(TypeScripteParser.INJECTABLE); }
		public TerminalNode INJECTABLE(int i) {
			return getToken(TypeScripteParser.INJECTABLE, i);
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
		enterRule(_localctx, 8, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IMPORT);
			setState(138);
			match(LBRACE);
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==COMPONENT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140);
				match(COMMA);
				setState(141);
				_la = _input.LA(1);
				if ( !(((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 288230376151711749L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(RBRACE);
			setState(148);
			match(FROM);
			setState(149);
			match(STRING);
			setState(150);
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
		enterRule(_localctx, 10, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(AT);
			setState(153);
			match(COMPONENT);
			setState(154);
			match(LPAREN);
			setState(155);
			match(LBRACE);
			setState(156);
			componentBody();
			setState(157);
			match(RBRACE);
			setState(158);
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
		enterRule(_localctx, 12, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				field();
				setState(161);
				match(COMMA);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & 8796093022223L) != 0) );
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
		enterRule(_localctx, 14, RULE_field);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorFldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				selectorField();
				}
				break;
			case STANDALONE:
				_localctx = new StandaloneFldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				standaloneField();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsFldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				importsField();
				}
				break;
			case TEMPLATE:
				_localctx = new TemplateFldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				templateField();
				}
				break;
			case IDENTIFIER:
				_localctx = new OtherFldsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
		enterRule(_localctx, 16, RULE_selectorField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(SELECTOR);
			setState(175);
			match(COLON);
			setState(176);
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
		enterRule(_localctx, 18, RULE_templateField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(TEMPLATE);
			setState(179);
			match(COLON);
			setState(180);
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
		enterRule(_localctx, 20, RULE_backTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(BACKTICK);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_SYMBOL) {
				{
				{
				setState(183);
				element();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
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
		enterRule(_localctx, 22, RULE_importsField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IMPORTS);
			setState(192);
			match(COLON);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 253186741733687297L) != 0)) {
				{
				{
				setState(193);
				primitiveType();
				}
				}
				setState(198);
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
		enterRule(_localctx, 24, RULE_standaloneField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(STANDALONE);
			setState(200);
			match(COLON);
			setState(201);
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
		enterRule(_localctx, 26, RULE_otherFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IDENTIFIER);
			setState(204);
			match(COLON);
			setState(205);
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
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(TypeScripteParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(TypeScripteParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode INTERFACE() { return getToken(TypeScripteParser.INTERFACE, 0); }
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
		enterRule(_localctx, 28, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(207);
				match(EXPORT);
				setState(208);
				match(CLASS);
				setState(209);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(210);
				match(EXPORT);
				setState(211);
				match(INTERFACE);
				setState(212);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(213);
				match(CLASS);
				setState(214);
				match(IDENTIFIER);
				}
				break;
			}
			setState(217);
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
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
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
		enterRule(_localctx, 30, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LBRACE);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 281612415664135L) != 0)) {
				{
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(220);
					propertyDeclaration();
					}
					break;
				case 2:
					{
					setState(221);
					methodDeclaration();
					}
					break;
				case 3:
					{
					setState(222);
					constructor();
					}
					break;
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
		public TerminalNode DOLAR() { return getToken(TypeScripteParser.DOLAR, 0); }
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(TypeScripteParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
		public TerminalNode PUBLIC() { return getToken(TypeScripteParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(TypeScripteParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(TypeScripteParser.PROTECTED, 0); }
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
		enterRule(_localctx, 32, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				setState(230);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(233);
			match(IDENTIFIER);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOLAR) {
				{
				setState(234);
				match(DOLAR);
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(237);
				match(COLON);
				}
			}

			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(240);
				type();
				}
				break;
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(243);
				match(EQUALS);
				setState(244);
				expression();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(247);
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
	public static class ConstructorCallContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(TypeScripteParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(NEW);
			setState(251);
			match(IDENTIFIER);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SYMBOL) {
				{
				setState(252);
				lt();
				setState(253);
				type();
				setState(254);
				gt();
				}
			}

			setState(258);
			match(LPAREN);
			setState(259);
			expression();
			setState(260);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TypeScripteParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 36, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			setState(263);
			match(LPAREN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(264);
				parameterList();
				}
			}

			setState(267);
			match(RPAREN);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(268);
				match(COLON);
				setState(269);
				type();
				}
			}

			setState(272);
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
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			parameter();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				parameter();
				}
				}
				setState(281);
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
		enterRule(_localctx, 40, RULE_parameter);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(IDENTIFIER);
				setState(283);
				match(COLON);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 253186741733687297L) != 0)) {
					{
					setState(284);
					type();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
		public TerminalNode RETURN() { return getToken(TypeScripteParser.RETURN, 0); }
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
		enterRule(_localctx, 42, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(LBRACE);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(291);
				match(RETURN);
				}
			}

			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4469962611994835760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 71L) != 0)) {
				{
				{
				setState(294);
				statement();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
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
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public GtContext gt() {
			return getRuleContext(GtContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public TerminalNode PIPE() { return getToken(TypeScripteParser.PIPE, 0); }
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
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				primitiveType();
				setState(304);
				lt();
				setState(305);
				type();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(306);
					match(COMMA);
					setState(307);
					type();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				gt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				primitiveType();
				setState(316);
				match(PIPE);
				setState(317);
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
		enterRule(_localctx, 46, RULE_primitiveType);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(MYSTRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(BOOLEAN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(VOID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				match(IDENTIFIER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				backTemplate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(328);
				arrayLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(329);
				objectLiteral();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(330);
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
	public static class ConstructorCallExprContext extends ExpressionContext {
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public ConstructorCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterConstructorCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitConstructorCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitConstructorCallExpr(this);
			else return visitor.visitChildren(this);
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
	public static class ConstructorExprContext extends ExpressionContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ConstructorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterConstructorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitConstructorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitConstructorExpr(this);
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
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				literal();
				}
				break;
			case 2:
				_localctx = new ArrayExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				arrayLiteral();
				}
				break;
			case 3:
				_localctx = new ObjectExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				objectLiteral();
				}
				break;
			case 4:
				_localctx = new FunctionCallExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				functionCall();
				}
				break;
			case 5:
				_localctx = new ArrowFunctionExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				arrowFunction();
				}
				break;
			case 6:
				_localctx = new OperationExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				operation();
				}
				break;
			case 7:
				_localctx = new AssignmentExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				assignmentExpression();
				}
				break;
			case 8:
				_localctx = new PropertyAccessExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(340);
				propertyAccess();
				}
				break;
			case 9:
				_localctx = new VarDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				variableDeclaration();
				}
				break;
			case 10:
				_localctx = new ConstructorCallExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(342);
				constructorCall();
				}
				break;
			case 11:
				_localctx = new ConstructorExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(343);
				constructor();
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
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 120259084295L) != 0)) ) {
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
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOTDOTDOT() { return getTokens(TypeScripteParser.DOTDOTDOT); }
		public TerminalNode DOTDOTDOT(int i) {
			return getToken(TypeScripteParser.DOTDOTDOT, i);
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
		enterRule(_localctx, 52, RULE_arrayLiteral);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(348);
					match(IDENTIFIER);
					}
				}

				setState(351);
				match(LBRACKET);
				setState(355);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MYSTRING:
				case NEW:
				case INT:
				case VAR:
				case CONST:
				case THIS:
				case LET:
				case TRUE:
				case FALSE:
				case NULL:
				case LBRACE:
				case LBRACKET:
				case LPAREN:
				case PLUS:
				case MINUS:
				case STAR:
				case MOD:
				case NOTEQUALS:
				case ANDAND:
				case OROR:
				case GREATERTHAN:
				case CONSTRUCTOR:
				case OPEN_SYMBOL:
				case CLOSED_SYMBOL:
				case STRING:
				case NUMBER:
				case IDENTIFIER:
				case SLASH:
					{
					setState(352);
					expression();
					}
					break;
				case DOTDOTDOT:
					{
					setState(353);
					match(DOTDOTDOT);
					setState(354);
					expression();
					}
					break;
				case RBRACKET:
				case COMMA:
					break;
				default:
					break;
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(357);
					match(COMMA);
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 2571693806155739393L) != 0)) {
						{
						setState(361);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MYSTRING:
						case NEW:
						case INT:
						case VAR:
						case CONST:
						case THIS:
						case LET:
						case TRUE:
						case FALSE:
						case NULL:
						case LBRACE:
						case LBRACKET:
						case LPAREN:
						case PLUS:
						case MINUS:
						case STAR:
						case MOD:
						case NOTEQUALS:
						case ANDAND:
						case OROR:
						case GREATERTHAN:
						case CONSTRUCTOR:
						case OPEN_SYMBOL:
						case CLOSED_SYMBOL:
						case STRING:
						case NUMBER:
						case IDENTIFIER:
						case SLASH:
							{
							setState(358);
							expression();
							}
							break;
						case DOTDOTDOT:
							{
							setState(359);
							match(DOTDOTDOT);
							setState(360);
							expression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(368);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(LBRACKET);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 2571693788975870209L) != 0)) {
					{
					setState(370);
					expression();
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(371);
						match(COMMA);
						setState(372);
						expression();
						}
						}
						setState(377);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(380);
				match(RBRACKET);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public TerminalNode DOTDOTDOT() { return getToken(TypeScripteParser.DOTDOTDOT, 0); }
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
		enterRule(_localctx, 54, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LBRACE);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOTDOT) {
				{
				setState(384);
				match(DOTDOTDOT);
				}
			}

			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 2571693788975870209L) != 0)) {
				{
				setState(387);
				propertyAssignment();
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(388);
					match(COMMA);
					setState(389);
					propertyAssignment();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(397);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(TypeScripteParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TypeScripteParser.COLON, i);
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
		enterRule(_localctx, 56, RULE_propertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			expression();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(400);
				match(COLON);
				setState(401);
				expression();
				}
				}
				setState(406);
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
		public List<PropertyAccessContext> propertyAccess() {
			return getRuleContexts(PropertyAccessContext.class);
		}
		public PropertyAccessContext propertyAccess(int i) {
			return getRuleContext(PropertyAccessContext.class,i);
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
		public TerminalNode SEMICOLON() { return getToken(TypeScripteParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 58, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(407);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(408);
				propertyAccess();
				}
				break;
			}
			setState(411);
			match(LPAREN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 2571693788975870209L) != 0)) {
				{
				setState(412);
				expression();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(413);
					match(COMMA);
					setState(414);
					expression();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
			match(RPAREN);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(423);
				match(DOT);
				setState(424);
				match(IDENTIFIER);
				setState(425);
				match(LPAREN);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 2571693788975870209L) != 0)) {
					{
					setState(426);
					expression();
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(427);
						match(COMMA);
						setState(428);
						expression();
						}
						}
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(436);
				match(RPAREN);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(442);
				propertyAccess();
				}
				break;
			}
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(445);
				match(SEMICOLON);
				}
				break;
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
		public TerminalNode ARROW() { return getToken(TypeScripteParser.ARROW, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 60, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(448);
				match(LPAREN);
				setState(449);
				parameterList();
				setState(450);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				{
				setState(452);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(455);
			match(ARROW);
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(456);
				methodBody();
				}
				break;
			case THIS:
			case IDENTIFIER:
				{
				setState(457);
				functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 62, RULE_lt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(OPEN_SYMBOL);
			setState(461);
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
	public static class GtContext extends ParserRuleContext {
		public TerminalNode CLOSED_SYMBOL() { return getToken(TypeScripteParser.CLOSED_SYMBOL, 0); }
		public GtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtContext gt() throws RecognitionException {
		GtContext _localctx = new GtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_gt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
	public static class OperationContext extends ParserRuleContext {
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TypeScripteParser.IDENTIFIER, 0); }
		public List<TerminalNode> PLUS() { return getTokens(TypeScripteParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(TypeScripteParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(TypeScripteParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(TypeScripteParser.MINUS, i);
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
		enterRule(_localctx, 66, RULE_operation);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(465);
					match(IDENTIFIER);
					}
				}

				setState(468);
				keys();
				setState(469);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(IDENTIFIER);
				{
				setState(472);
				match(PLUS);
				setState(473);
				match(PLUS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(IDENTIFIER);
				{
				setState(475);
				match(MINUS);
				setState(476);
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
	public static class KeysContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TypeScripteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TypeScripteParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(TypeScripteParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(TypeScripteParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(TypeScripteParser.MOD, 0); }
		public TerminalNode CLOSED_SYMBOL() { return getToken(TypeScripteParser.CLOSED_SYMBOL, 0); }
		public LtContext lt() {
			return getRuleContext(LtContext.class,0);
		}
		public TerminalNode ANDAND() { return getToken(TypeScripteParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(TypeScripteParser.OROR, 0); }
		public TerminalNode NOTEQUALS() { return getToken(TypeScripteParser.NOTEQUALS, 0); }
		public TerminalNode GREATERTHAN() { return getToken(TypeScripteParser.GREATERTHAN, 0); }
		public KeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitKeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysContext keys() throws RecognitionException {
		KeysContext _localctx = new KeysContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_keys);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(MINUS);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				match(STAR);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(SLASH);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
				match(MOD);
				}
				break;
			case CLOSED_SYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(484);
				match(CLOSED_SYMBOL);
				}
				break;
			case OPEN_SYMBOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(485);
				lt();
				}
				break;
			case ANDAND:
				enterOuterAlt(_localctx, 8);
				{
				setState(486);
				match(ANDAND);
				}
				break;
			case OROR:
				enterOuterAlt(_localctx, 9);
				{
				setState(487);
				match(OROR);
				}
				break;
			case NOTEQUALS:
				enterOuterAlt(_localctx, 10);
				{
				setState(488);
				match(NOTEQUALS);
				}
				break;
			case GREATERTHAN:
				enterOuterAlt(_localctx, 11);
				{
				setState(489);
				match(GREATERTHAN);
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
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
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
		enterRule(_localctx, 70, RULE_assignmentExpression);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				propertyAccess();
				setState(493);
				match(EQUALS);
				setState(494);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				propertyAccess();
				setState(497);
				match(EQUALS);
				setState(498);
				match(EQUALS);
				setState(499);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				arrayLiteral();
				setState(502);
				match(EQUALS);
				setState(503);
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
		public TerminalNode THIS() { return getToken(TypeScripteParser.THIS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TypeScripteParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TypeScripteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TypeScripteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TypeScripteParser.DOT, i);
		}
		public List<ArrayLiteralContext> arrayLiteral() {
			return getRuleContexts(ArrayLiteralContext.class);
		}
		public ArrayLiteralContext arrayLiteral(int i) {
			return getRuleContext(ArrayLiteralContext.class,i);
		}
		public TerminalNode OROR() { return getToken(TypeScripteParser.OROR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<TerminalNode> DOLAR() { return getTokens(TypeScripteParser.DOLAR); }
		public TerminalNode DOLAR(int i) {
			return getToken(TypeScripteParser.DOLAR, i);
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
		enterRule(_localctx, 72, RULE_propertyAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(508);
					match(DOT);
					setState(509);
					match(IDENTIFIER);
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOLAR) {
						{
						setState(510);
						match(DOLAR);
						}
					}

					}
					break;
				case 2:
					{
					setState(513);
					match(DOT);
					setState(514);
					arrayLiteral();
					}
					break;
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(520);
				match(OROR);
				setState(521);
				literal();
				}
				break;
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
		enterRule(_localctx, 74, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			expression();
			setState(525);
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
		enterRule(_localctx, 76, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(FOR);
			setState(528);
			match(LPAREN);
			setState(529);
			variableDeclaration();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 2571693788975870209L) != 0)) {
				{
				setState(530);
				expression();
				}
			}

			setState(533);
			match(SEMICOLON);
			setState(534);
			expression();
			setState(535);
			match(RPAREN);
			setState(536);
			match(LBRACE);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4469962611994835760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 71L) != 0)) {
				{
				{
				setState(537);
				statement();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public List<KeysContext> keys() {
			return getRuleContexts(KeysContext.class);
		}
		public KeysContext keys(int i) {
			return getRuleContext(KeysContext.class,i);
		}
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
		enterRule(_localctx, 78, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(IF);
			setState(546);
			match(LPAREN);
			setState(547);
			expression();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 16876015L) != 0)) {
				{
				{
				setState(548);
				keys();
				setState(549);
				expression();
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			match(RPAREN);
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(557);
				match(LBRACE);
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					statement();
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(566);
				match(RBRACE);
				}
				break;
			}
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(569);
				match(ELSE);
				setState(571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(570);
					match(LBRACE);
					}
					break;
				}
				setState(573);
				statement();
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(574);
					match(RBRACE);
					}
					break;
				}
				}
				break;
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
		enterRule(_localctx, 80, RULE_variableDeclaration);
		int _la;
		try {
			setState(588);
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
				setState(579);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1354761216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(580);
				match(IDENTIFIER);
				setState(581);
				match(EQUALS);
				setState(582);
				expression();
				setState(583);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new VarReassignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(IDENTIFIER);
				setState(586);
				match(EQUALS);
				setState(587);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(TypeScripteParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(TypeScripteParser.LPAREN, 0); }
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TypeScripteParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TypeScripteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TypeScripteParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TypeScripteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TypeScripteParser.COMMA, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeScripteParserListener ) ((TypeScripteParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypeScripteParserVisitor ) return ((TypeScripteParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(CONSTRUCTOR);
			setState(591);
			match(LPAREN);
			setState(592);
			propertyDeclaration();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				propertyDeclaration();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			match(RPAREN);
			setState(601);
			match(LBRACE);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS || _la==IDENTIFIER) {
				{
				setState(602);
				functionCall();
				}
			}

			setState(605);
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
		enterRule(_localctx, 84, RULE_element);
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				_localctx = new CompleteElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				completeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
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
		enterRule(_localctx, 86, RULE_completeTag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			openTag();
			setState(616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(614);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_SYMBOL:
						{
						setState(612);
						element();
						}
						break;
					case ANGULAR_EXPRESSION:
						{
						setState(613);
						angularExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(619);
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
		enterRule(_localctx, 88, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(OPEN_SYMBOL);
			setState(622);
			match(TAG_NAME);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 1073745925L) != 0)) {
				{
				{
				setState(623);
				content();
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(SLASHSELF);
			setState(630);
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
		enterRule(_localctx, 90, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(OPEN_SYMBOL);
			setState(633);
			match(TAG_NAME);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 1073745925L) != 0)) {
				{
				{
				setState(634);
				content();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
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
		enterRule(_localctx, 92, RULE_closedTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(OPEN_SYMBOL);
			setState(643);
			match(SLASH);
			setState(644);
			match(TAG_NAME);
			setState(645);
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
		enterRule(_localctx, 94, RULE_angularExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
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
		enterRule(_localctx, 96, RULE_content);
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new NormalAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				normalAttribute();
				}
				break;
			case LBRACKET:
				_localctx = new BindingAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				bindingAttribute();
				}
				break;
			case STAR:
				_localctx = new DirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				direvtiveAttribute();
				}
				break;
			case LPAREN:
				_localctx = new EventAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(652);
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
		enterRule(_localctx, 98, RULE_normalAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(IDENTIFIER);
			setState(656);
			match(EQUALS);
			setState(657);
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
		enterRule(_localctx, 100, RULE_bindingAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(LBRACKET);
			setState(660);
			match(IDENTIFIER);
			setState(661);
			match(RBRACKET);
			setState(662);
			match(EQUALS);
			setState(663);
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
		enterRule(_localctx, 102, RULE_direvtiveAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(STAR);
			setState(666);
			match(IDENTIFIER);
			setState(667);
			match(EQUALS);
			setState(668);
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
		enterRule(_localctx, 104, RULE_eventAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(LPAREN);
			setState(671);
			match(IDENTIFIER);
			setState(672);
			match(RPAREN);
			setState(673);
			match(EQUALS);
			setState(674);
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
		"\u0004\u0001G\u02a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0005\u0000l\b\u0000"+
		"\n\u0000\f\u0000o\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001|\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u008f\b\u0004\n\u0004\f\u0004\u0092"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00a4"+
		"\b\u0006\u000b\u0006\f\u0006\u00a5\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00ad\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00b9"+
		"\b\n\n\n\f\n\u00bc\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00c3\b\u000b\n\u000b\f\u000b\u00c6\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00d8\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00e0\b\u000f\n\u000f\f\u000f\u00e3"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u00e8\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00ec\b\u0010\u0001\u0010\u0003\u0010"+
		"\u00ef\b\u0010\u0001\u0010\u0003\u0010\u00f2\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00f6\b\u0010\u0001\u0010\u0003\u0010\u00f9\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0101\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u010a\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u010f\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0116\b\u0013\n\u0013"+
		"\f\u0013\u0119\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u011e\b\u0014\u0001\u0014\u0003\u0014\u0121\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0125\b\u0015\u0001\u0015\u0005\u0015\u0128\b\u0015"+
		"\n\u0015\f\u0015\u012b\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0135"+
		"\b\u0016\n\u0016\f\u0016\u0138\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0140\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u014c\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0159\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0003\u001a\u015e\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0164\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016a\b\u001a\n\u001a"+
		"\f\u001a\u016d\t\u001a\u0003\u001a\u016f\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0176\b\u001a\n\u001a"+
		"\f\u001a\u0179\t\u001a\u0003\u001a\u017b\b\u001a\u0001\u001a\u0003\u001a"+
		"\u017e\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0182\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0187\b\u001b\n\u001b\f\u001b"+
		"\u018a\t\u001b\u0003\u001b\u018c\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0193\b\u001c\n\u001c\f\u001c"+
		"\u0196\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u019a\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01a0\b\u001d\n"+
		"\u001d\f\u001d\u01a3\t\u001d\u0003\u001d\u01a5\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u01ae\b\u001d\n\u001d\f\u001d\u01b1\t\u001d\u0003\u001d\u01b3\b"+
		"\u001d\u0001\u001d\u0005\u001d\u01b6\b\u001d\n\u001d\f\u001d\u01b9\t\u001d"+
		"\u0001\u001d\u0003\u001d\u01bc\b\u001d\u0001\u001d\u0003\u001d\u01bf\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01c6\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01cb"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0003"+
		"!\u01d3\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01de\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01eb\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01fa\b#\u0001$\u0001$\u0001$\u0001$\u0003$\u0200\b$\u0001$\u0001"+
		"$\u0005$\u0204\b$\n$\f$\u0207\t$\u0001$\u0001$\u0003$\u020b\b$\u0001%"+
		"\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003&\u0214\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0005&\u021b\b&\n&\f&\u021e\t&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0228\b\'\n\'\f\'\u022b"+
		"\t\'\u0001\'\u0001\'\u0003\'\u022f\b\'\u0001\'\u0005\'\u0232\b\'\n\'\f"+
		"\'\u0235\t\'\u0001\'\u0003\'\u0238\b\'\u0001\'\u0001\'\u0003\'\u023c\b"+
		"\'\u0001\'\u0001\'\u0003\'\u0240\b\'\u0003\'\u0242\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u024d\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0254\b)\n)\f)\u0257\t)\u0001)\u0001)\u0001"+
		")\u0003)\u025c\b)\u0001)\u0001)\u0001*\u0001*\u0003*\u0262\b*\u0001+\u0001"+
		"+\u0001+\u0005+\u0267\b+\n+\f+\u026a\t+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0005,\u0271\b,\n,\f,\u0274\t,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0005-\u027c\b-\n-\f-\u027f\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00010\u00030\u028e\b0\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u0000\u00005\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfh\u0000\u0006\u0002\u0000\t\tCC\u0003\u0000\t\t\u000b\u000bCC\u0001"+
		"\u0000\u0013\u0015\u0002\u0000\u001f!AC\u0002\u0000\u001d\u001dCC\u0004"+
		"\u0000\n\n\u0016\u0017\u001c\u001c\u001e\u001e\u02e7\u0000m\u0001\u0000"+
		"\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000"+
		"\u0006\u0085\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000\u0000\u0000\n"+
		"\u0098\u0001\u0000\u0000\u0000\f\u00a3\u0001\u0000\u0000\u0000\u000e\u00ac"+
		"\u0001\u0000\u0000\u0000\u0010\u00ae\u0001\u0000\u0000\u0000\u0012\u00b2"+
		"\u0001\u0000\u0000\u0000\u0014\u00b6\u0001\u0000\u0000\u0000\u0016\u00bf"+
		"\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000\u0000\u0000\u001a\u00cb"+
		"\u0001\u0000\u0000\u0000\u001c\u00d7\u0001\u0000\u0000\u0000\u001e\u00db"+
		"\u0001\u0000\u0000\u0000 \u00e7\u0001\u0000\u0000\u0000\"\u00fa\u0001"+
		"\u0000\u0000\u0000$\u0106\u0001\u0000\u0000\u0000&\u0112\u0001\u0000\u0000"+
		"\u0000(\u0120\u0001\u0000\u0000\u0000*\u0122\u0001\u0000\u0000\u0000,"+
		"\u013f\u0001\u0000\u0000\u0000.\u014b\u0001\u0000\u0000\u00000\u0158\u0001"+
		"\u0000\u0000\u00002\u015a\u0001\u0000\u0000\u00004\u017d\u0001\u0000\u0000"+
		"\u00006\u017f\u0001\u0000\u0000\u00008\u018f\u0001\u0000\u0000\u0000:"+
		"\u0199\u0001\u0000\u0000\u0000<\u01c5\u0001\u0000\u0000\u0000>\u01cc\u0001"+
		"\u0000\u0000\u0000@\u01cf\u0001\u0000\u0000\u0000B\u01dd\u0001\u0000\u0000"+
		"\u0000D\u01ea\u0001\u0000\u0000\u0000F\u01f9\u0001\u0000\u0000\u0000H"+
		"\u01fb\u0001\u0000\u0000\u0000J\u020c\u0001\u0000\u0000\u0000L\u020f\u0001"+
		"\u0000\u0000\u0000N\u0221\u0001\u0000\u0000\u0000P\u024c\u0001\u0000\u0000"+
		"\u0000R\u024e\u0001\u0000\u0000\u0000T\u0261\u0001\u0000\u0000\u0000V"+
		"\u0263\u0001\u0000\u0000\u0000X\u026d\u0001\u0000\u0000\u0000Z\u0278\u0001"+
		"\u0000\u0000\u0000\\\u0282\u0001\u0000\u0000\u0000^\u0287\u0001\u0000"+
		"\u0000\u0000`\u028d\u0001\u0000\u0000\u0000b\u028f\u0001\u0000\u0000\u0000"+
		"d\u0293\u0001\u0000\u0000\u0000f\u0299\u0001\u0000\u0000\u0000h\u029e"+
		"\u0001\u0000\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0000\u0000\u0001q\u0001\u0001\u0000\u0000\u0000r|\u0003\b\u0004\u0000"+
		"s|\u0003\n\u0005\u0000t|\u0003\u0004\u0002\u0000u|\u0003P(\u0000v|\u0003"+
		"6\u001b\u0000w|\u0003J%\u0000x|\u0003\u001c\u000e\u0000y|\u0003L&\u0000"+
		"z|\u0003N\'\u0000{r\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000"+
		"{t\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000"+
		"\u0000{w\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u0003\u0001\u0000\u0000\u0000"+
		"}~\u0005\"\u0000\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u0080\u0005"+
		"\'\u0000\u0000\u0080\u0081\u0005#\u0000\u0000\u0081\u0082\u0003\u0006"+
		"\u0003\u0000\u0082\u0083\u0005$\u0000\u0000\u0083\u0084\u0005(\u0000\u0000"+
		"\u0084\u0005\u0001\u0000\u0000\u0000\u0085\u0086\u0005\f\u0000\u0000\u0086"+
		"\u0087\u0005)\u0000\u0000\u0087\u0088\u0005A\u0000\u0000\u0088\u0007\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008b\u0005"+
		"#\u0000\u0000\u008b\u0090\u0007\u0000\u0000\u0000\u008c\u008d\u0005*\u0000"+
		"\u0000\u008d\u008f\u0007\u0001\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005$\u0000\u0000"+
		"\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0096\u0005A\u0000\u0000\u0096"+
		"\u0097\u0005+\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\"\u0000\u0000\u0099\u009a\u0005\t\u0000\u0000\u009a\u009b\u0005"+
		"\'\u0000\u0000\u009b\u009c\u0005#\u0000\u0000\u009c\u009d\u0003\f\u0006"+
		"\u0000\u009d\u009e\u0005$\u0000\u0000\u009e\u009f\u0005(\u0000\u0000\u009f"+
		"\u000b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u000e\u0007\u0000\u00a1"+
		"\u00a2\u0005*\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\r\u0001"+
		"\u0000\u0000\u0000\u00a7\u00ad\u0003\u0010\b\u0000\u00a8\u00ad\u0003\u0018"+
		"\f\u0000\u00a9\u00ad\u0003\u0016\u000b\u0000\u00aa\u00ad\u0003\u0012\t"+
		"\u0000\u00ab\u00ad\u0003\u001a\r\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u000f\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0018\u0000\u0000"+
		"\u00af\u00b0\u0005)\u0000\u0000\u00b0\u00b1\u0003.\u0017\u0000\u00b1\u0011"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0019\u0000\u0000\u00b3\u00b4"+
		"\u0005)\u0000\u0000\u00b4\u00b5\u0003.\u0017\u0000\u00b5\u0013\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ba\u0005;\u0000\u0000\u00b7\u00b9\u0003T*\u0000"+
		"\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005;\u0000\u0000\u00be\u0015\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u001a\u0000\u0000\u00c0\u00c4\u0005)\u0000\u0000\u00c1\u00c3"+
		"\u0003.\u0017\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u0017\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u001b\u0000\u0000\u00c8\u00c9\u0005"+
		")\u0000\u0000\u00c9\u00ca\u0003.\u0017\u0000\u00ca\u0019\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005C\u0000\u0000\u00cc\u00cd\u0005)\u0000\u0000\u00cd"+
		"\u00ce\u00030\u0018\u0000\u00ce\u001b\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0005\u0006\u0000\u0000\u00d0\u00d1\u0005\u0007\u0000\u0000\u00d1\u00d8"+
		"\u0005C\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d4\u0005"+
		"\b\u0000\u0000\u00d4\u00d8\u0005C\u0000\u0000\u00d5\u00d6\u0005\u0007"+
		"\u0000\u0000\u00d6\u00d8\u0005C\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u001e\u000f"+
		"\u0000\u00da\u001d\u0001\u0000\u0000\u0000\u00db\u00e1\u0005#\u0000\u0000"+
		"\u00dc\u00e0\u0003 \u0010\u0000\u00dd\u00e0\u0003$\u0012\u0000\u00de\u00e0"+
		"\u0003R)\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005$\u0000\u0000\u00e5\u001f\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0007\u0002\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0005C\u0000\u0000\u00ea\u00ec\u0005-\u0000\u0000\u00eb"+
		"\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005)\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003,\u0016\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u00053\u0000\u0000\u00f4\u00f6\u00030\u0018"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005+\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0012\u0000\u0000\u00fb"+
		"\u0100\u0005C\u0000\u0000\u00fc\u00fd\u0003>\u001f\u0000\u00fd\u00fe\u0003"+
		",\u0016\u0000\u00fe\u00ff\u0003@ \u0000\u00ff\u0101\u0001\u0000\u0000"+
		"\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005\'\u0000\u0000"+
		"\u0103\u0104\u00030\u0018\u0000\u0104\u0105\u0005(\u0000\u0000\u0105#"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005C\u0000\u0000\u0107\u0109\u0005"+
		"\'\u0000\u0000\u0108\u010a\u0003&\u0013\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010e\u0005(\u0000\u0000\u010c\u010d\u0005)\u0000\u0000"+
		"\u010d\u010f\u0003,\u0016\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0003*\u0015\u0000\u0111%\u0001\u0000\u0000\u0000\u0112\u0117\u0003"+
		"(\u0014\u0000\u0113\u0114\u0005*\u0000\u0000\u0114\u0116\u0003(\u0014"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\'\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005C\u0000\u0000\u011b\u011d\u0005)\u0000\u0000\u011c\u011e"+
		"\u0003,\u0016\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u0121\u0005"+
		"C\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121)\u0001\u0000\u0000\u0000\u0122\u0124\u0005#\u0000\u0000"+
		"\u0123\u0125\u0005\u0011\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0129\u0001\u0000\u0000\u0000"+
		"\u0126\u0128\u0003\u0002\u0001\u0000\u0127\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005$\u0000\u0000\u012d"+
		"+\u0001\u0000\u0000\u0000\u012e\u0140\u0003.\u0017\u0000\u012f\u0130\u0003"+
		".\u0017\u0000\u0130\u0131\u0003>\u001f\u0000\u0131\u0136\u0003,\u0016"+
		"\u0000\u0132\u0133\u0005*\u0000\u0000\u0133\u0135\u0003,\u0016\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0003@ \u0000\u013a\u0140\u0001\u0000\u0000\u0000\u013b\u013c\u0003"+
		".\u0017\u0000\u013c\u013d\u0005<\u0000\u0000\u013d\u013e\u0003,\u0016"+
		"\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u012e\u0001\u0000\u0000"+
		"\u0000\u013f\u012f\u0001\u0000\u0000\u0000\u013f\u013b\u0001\u0000\u0000"+
		"\u0000\u0140-\u0001\u0000\u0000\u0000\u0141\u014c\u0005B\u0000\u0000\u0142"+
		"\u014c\u0005\n\u0000\u0000\u0143\u014c\u00059\u0000\u0000\u0144\u014c"+
		"\u0005:\u0000\u0000\u0145\u014c\u0005!\u0000\u0000\u0146\u014c\u0005C"+
		"\u0000\u0000\u0147\u014c\u0003\u0014\n\u0000\u0148\u014c\u00034\u001a"+
		"\u0000\u0149\u014c\u00036\u001b\u0000\u014a\u014c\u00032\u0019\u0000\u014b"+
		"\u0141\u0001\u0000\u0000\u0000\u014b\u0142\u0001\u0000\u0000\u0000\u014b"+
		"\u0143\u0001\u0000\u0000\u0000\u014b\u0144\u0001\u0000\u0000\u0000\u014b"+
		"\u0145\u0001\u0000\u0000\u0000\u014b\u0146\u0001\u0000\u0000\u0000\u014b"+
		"\u0147\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c"+
		"/\u0001\u0000\u0000\u0000\u014d\u0159\u00032\u0019\u0000\u014e\u0159\u0003"+
		"4\u001a\u0000\u014f\u0159\u00036\u001b\u0000\u0150\u0159\u0003:\u001d"+
		"\u0000\u0151\u0159\u0003<\u001e\u0000\u0152\u0159\u0003B!\u0000\u0153"+
		"\u0159\u0003F#\u0000\u0154\u0159\u0003H$\u0000\u0155\u0159\u0003P(\u0000"+
		"\u0156\u0159\u0003\"\u0011\u0000\u0157\u0159\u0003R)\u0000\u0158\u014d"+
		"\u0001\u0000\u0000\u0000\u0158\u014e\u0001\u0000\u0000\u0000\u0158\u014f"+
		"\u0001\u0000\u0000\u0000\u0158\u0150\u0001\u0000\u0000\u0000\u0158\u0151"+
		"\u0001\u0000\u0000\u0000\u0158\u0152\u0001\u0000\u0000\u0000\u0158\u0153"+
		"\u0001\u0000\u0000\u0000\u0158\u0154\u0001\u0000\u0000\u0000\u0158\u0155"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u01591\u0001\u0000\u0000\u0000\u015a\u015b\u0007"+
		"\u0003\u0000\u0000\u015b3\u0001\u0000\u0000\u0000\u015c\u015e\u0005C\u0000"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0163\u0005%\u0000\u0000"+
		"\u0160\u0164\u00030\u0018\u0000\u0161\u0162\u0005,\u0000\u0000\u0162\u0164"+
		"\u00030\u0018\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u016e\u0001"+
		"\u0000\u0000\u0000\u0165\u016b\u0005*\u0000\u0000\u0166\u016a\u00030\u0018"+
		"\u0000\u0167\u0168\u0005,\u0000\u0000\u0168\u016a\u00030\u0018\u0000\u0169"+
		"\u0166\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016e\u0165\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u017e\u0005&\u0000\u0000\u0171\u017a\u0005%\u0000\u0000\u0172\u0177\u0003"+
		"0\u0018\u0000\u0173\u0174\u0005*\u0000\u0000\u0174\u0176\u00030\u0018"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000"+
		"\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u017a\u0172\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0005&\u0000\u0000"+
		"\u017d\u015d\u0001\u0000\u0000\u0000\u017d\u0171\u0001\u0000\u0000\u0000"+
		"\u017e5\u0001\u0000\u0000\u0000\u017f\u0181\u0005#\u0000\u0000\u0180\u0182"+
		"\u0005,\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u018b\u0001\u0000\u0000\u0000\u0183\u0188\u0003"+
		"8\u001c\u0000\u0184\u0185\u0005*\u0000\u0000\u0185\u0187\u00038\u001c"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000"+
		"\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000"+
		"\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000"+
		"\u0000\u018b\u0183\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005$\u0000\u0000"+
		"\u018e7\u0001\u0000\u0000\u0000\u018f\u0194\u00030\u0018\u0000\u0190\u0191"+
		"\u0005)\u0000\u0000\u0191\u0193\u00030\u0018\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u01959\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0197\u019a\u0005C\u0000\u0000"+
		"\u0198\u019a\u0003H$\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a4"+
		"\u0005\'\u0000\u0000\u019c\u01a1\u00030\u0018\u0000\u019d\u019e\u0005"+
		"*\u0000\u0000\u019e\u01a0\u00030\u0018\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01b7\u0005(\u0000\u0000\u01a7\u01a8\u0005.\u0000\u0000\u01a8"+
		"\u01a9\u0005C\u0000\u0000\u01a9\u01b2\u0005\'\u0000\u0000\u01aa\u01af"+
		"\u00030\u0018\u0000\u01ab\u01ac\u0005*\u0000\u0000\u01ac\u01ae\u00030"+
		"\u0018\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000"+
		"\u0000\u0000\u01b2\u01aa\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b6\u0005(\u0000"+
		"\u0000\u01b5\u01a7\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bc\u0003H$\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bf\u0005+\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf;\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005"+
		"\'\u0000\u0000\u01c1\u01c2\u0003&\u0013\u0000\u01c2\u01c3\u0005(\u0000"+
		"\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c6\u0005C\u0000\u0000"+
		"\u01c5\u01c0\u0001\u0000\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01ca\u0005=\u0000\u0000\u01c8"+
		"\u01cb\u0003*\u0015\u0000\u01c9\u01cb\u0003:\u001d\u0000\u01ca\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb=\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0005>\u0000\u0000\u01cd\u01ce\u0005F\u0000\u0000"+
		"\u01ce?\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005?\u0000\u0000\u01d0A"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d3\u0005C\u0000\u0000\u01d2\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0003D\"\u0000\u01d5\u01d6\u00030\u0018"+
		"\u0000\u01d6\u01de\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005C\u0000\u0000"+
		"\u01d8\u01d9\u0005/\u0000\u0000\u01d9\u01de\u0005/\u0000\u0000\u01da\u01db"+
		"\u0005C\u0000\u0000\u01db\u01dc\u00050\u0000\u0000\u01dc\u01de\u00050"+
		"\u0000\u0000\u01dd\u01d2\u0001\u0000\u0000\u0000\u01dd\u01d7\u0001\u0000"+
		"\u0000\u0000\u01dd\u01da\u0001\u0000\u0000\u0000\u01deC\u0001\u0000\u0000"+
		"\u0000\u01df\u01eb\u0005/\u0000\u0000\u01e0\u01eb\u00050\u0000\u0000\u01e1"+
		"\u01eb\u00051\u0000\u0000\u01e2\u01eb\u0005G\u0000\u0000\u01e3\u01eb\u0005"+
		"2\u0000\u0000\u01e4\u01eb\u0005?\u0000\u0000\u01e5\u01eb\u0003>\u001f"+
		"\u0000\u01e6\u01eb\u00055\u0000\u0000\u01e7\u01eb\u00056\u0000\u0000\u01e8"+
		"\u01eb\u00054\u0000\u0000\u01e9\u01eb\u00057\u0000\u0000\u01ea\u01df\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e0\u0001\u0000\u0000\u0000\u01ea\u01e1\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e2\u0001\u0000\u0000\u0000\u01ea\u01e3\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e4\u0001\u0000\u0000\u0000\u01ea\u01e5\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e6\u0001\u0000\u0000\u0000\u01ea\u01e7\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01e9\u0001"+
		"\u0000\u0000\u0000\u01ebE\u0001\u0000\u0000\u0000\u01ec\u01ed\u0003H$"+
		"\u0000\u01ed\u01ee\u00053\u0000\u0000\u01ee\u01ef\u00030\u0018\u0000\u01ef"+
		"\u01fa\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003H$\u0000\u01f1\u01f2\u0005"+
		"3\u0000\u0000\u01f2\u01f3\u00053\u0000\u0000\u01f3\u01f4\u00030\u0018"+
		"\u0000\u01f4\u01fa\u0001\u0000\u0000\u0000\u01f5\u01f6\u00034\u001a\u0000"+
		"\u01f6\u01f7\u00053\u0000\u0000\u01f7\u01f8\u00030\u0018\u0000\u01f8\u01fa"+
		"\u0001\u0000\u0000\u0000\u01f9\u01ec\u0001\u0000\u0000\u0000\u01f9\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000\u01faG\u0001"+
		"\u0000\u0000\u0000\u01fb\u0205\u0007\u0004\u0000\u0000\u01fc\u01fd\u0005"+
		".\u0000\u0000\u01fd\u01ff\u0005C\u0000\u0000\u01fe\u0200\u0005-\u0000"+
		"\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u0204\u0001\u0000\u0000\u0000\u0201\u0202\u0005.\u0000\u0000"+
		"\u0202\u0204\u00034\u001a\u0000\u0203\u01fc\u0001\u0000\u0000\u0000\u0203"+
		"\u0201\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000\u0000\u0205"+
		"\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206"+
		"\u020a\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u00056\u0000\u0000\u0209\u020b\u00032\u0019\u0000\u020a\u0208\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020bI\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u00030\u0018\u0000\u020d\u020e\u0005+\u0000\u0000"+
		"\u020eK\u0001\u0000\u0000\u0000\u020f\u0210\u0005\u0010\u0000\u0000\u0210"+
		"\u0211\u0005\'\u0000\u0000\u0211\u0213\u0003P(\u0000\u0212\u0214\u0003"+
		"0\u0018\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0005+\u0000"+
		"\u0000\u0216\u0217\u00030\u0018\u0000\u0217\u0218\u0005(\u0000\u0000\u0218"+
		"\u021c\u0005#\u0000\u0000\u0219\u021b\u0003\u0002\u0001\u0000\u021a\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f"+
		"\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0005$\u0000\u0000\u0220M\u0001\u0000\u0000\u0000\u0221\u0222\u0005\u000e"+
		"\u0000\u0000\u0222\u0223\u0005\'\u0000\u0000\u0223\u0229\u00030\u0018"+
		"\u0000\u0224\u0225\u0003D\"\u0000\u0225\u0226\u00030\u0018\u0000\u0226"+
		"\u0228\u0001\u0000\u0000\u0000\u0227\u0224\u0001\u0000\u0000\u0000\u0228"+
		"\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0001\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b"+
		"\u0229\u0001\u0000\u0000\u0000\u022c\u022e\u0005(\u0000\u0000\u022d\u022f"+
		"\u0005#\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0233\u0001\u0000\u0000\u0000\u0230\u0232\u0003"+
		"\u0002\u0001\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001"+
		"\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001"+
		"\u0000\u0000\u0000\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233\u0001"+
		"\u0000\u0000\u0000\u0236\u0238\u0005$\u0000\u0000\u0237\u0236\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0241\u0001\u0000"+
		"\u0000\u0000\u0239\u023b\u0005\u000f\u0000\u0000\u023a\u023c\u0005#\u0000"+
		"\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0003\u0002\u0001"+
		"\u0000\u023e\u0240\u0005$\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000"+
		"\u0241\u0239\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242O\u0001\u0000\u0000\u0000\u0243\u0244\u0007\u0005\u0000\u0000\u0244"+
		"\u0245\u0005C\u0000\u0000\u0245\u0246\u00053\u0000\u0000\u0246\u0247\u0003"+
		"0\u0018\u0000\u0247\u0248\u0005+\u0000\u0000\u0248\u024d\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0005C\u0000\u0000\u024a\u024b\u00053\u0000\u0000\u024b"+
		"\u024d\u00030\u0018\u0000\u024c\u0243\u0001\u0000\u0000\u0000\u024c\u0249"+
		"\u0001\u0000\u0000\u0000\u024dQ\u0001\u0000\u0000\u0000\u024e\u024f\u0005"+
		"8\u0000\u0000\u024f\u0250\u0005\'\u0000\u0000\u0250\u0255\u0003 \u0010"+
		"\u0000\u0251\u0252\u0005*\u0000\u0000\u0252\u0254\u0003 \u0010\u0000\u0253"+
		"\u0251\u0001\u0000\u0000\u0000\u0254\u0257\u0001\u0000\u0000\u0000\u0255"+
		"\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0005(\u0000\u0000\u0259\u025b\u0005#\u0000\u0000\u025a\u025c\u0003"+
		":\u001d\u0000\u025b\u025a\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025e\u0005$\u0000"+
		"\u0000\u025eS\u0001\u0000\u0000\u0000\u025f\u0262\u0003V+\u0000\u0260"+
		"\u0262\u0003X,\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0260\u0001"+
		"\u0000\u0000\u0000\u0262U\u0001\u0000\u0000\u0000\u0263\u0268\u0003Z-"+
		"\u0000\u0264\u0267\u0003T*\u0000\u0265\u0267\u0003^/\u0000\u0266\u0264"+
		"\u0001\u0000\u0000\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0267\u026a"+
		"\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0269"+
		"\u0001\u0000\u0000\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u0268"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0003\\.\u0000\u026cW\u0001\u0000"+
		"\u0000\u0000\u026d\u026e\u0005>\u0000\u0000\u026e\u0272\u0005E\u0000\u0000"+
		"\u026f\u0271\u0003`0\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0271\u0274"+
		"\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\u0001\u0000\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0272"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0005@\u0000\u0000\u0276\u0277\u0005"+
		"?\u0000\u0000\u0277Y\u0001\u0000\u0000\u0000\u0278\u0279\u0005>\u0000"+
		"\u0000\u0279\u027d\u0005E\u0000\u0000\u027a\u027c\u0003`0\u0000\u027b"+
		"\u027a\u0001\u0000\u0000\u0000\u027c\u027f\u0001\u0000\u0000\u0000\u027d"+
		"\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e"+
		"\u0280\u0001\u0000\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280"+
		"\u0281\u0005?\u0000\u0000\u0281[\u0001\u0000\u0000\u0000\u0282\u0283\u0005"+
		">\u0000\u0000\u0283\u0284\u0005G\u0000\u0000\u0284\u0285\u0005E\u0000"+
		"\u0000\u0285\u0286\u0005?\u0000\u0000\u0286]\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0005D\u0000\u0000\u0288_\u0001\u0000\u0000\u0000\u0289\u028e\u0003"+
		"b1\u0000\u028a\u028e\u0003d2\u0000\u028b\u028e\u0003f3\u0000\u028c\u028e"+
		"\u0003h4\u0000\u028d\u0289\u0001\u0000\u0000\u0000\u028d\u028a\u0001\u0000"+
		"\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028c\u0001\u0000"+
		"\u0000\u0000\u028ea\u0001\u0000\u0000\u0000\u028f\u0290\u0005C\u0000\u0000"+
		"\u0290\u0291\u00053\u0000\u0000\u0291\u0292\u0005A\u0000\u0000\u0292c"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0005%\u0000\u0000\u0294\u0295\u0005"+
		"C\u0000\u0000\u0295\u0296\u0005&\u0000\u0000\u0296\u0297\u00053\u0000"+
		"\u0000\u0297\u0298\u0005A\u0000\u0000\u0298e\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u00051\u0000\u0000\u029a\u029b\u0005C\u0000\u0000\u029b\u029c\u0005"+
		"3\u0000\u0000\u029c\u029d\u0005A\u0000\u0000\u029dg\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0005\'\u0000\u0000\u029f\u02a0\u0005C\u0000\u0000"+
		"\u02a0\u02a1\u0005(\u0000\u0000\u02a1\u02a2\u00053\u0000\u0000\u02a2\u02a3"+
		"\u0005A\u0000\u0000\u02a3i\u0001\u0000\u0000\u0000Lm{\u0090\u00a5\u00ac"+
		"\u00ba\u00c4\u00d7\u00df\u00e1\u00e7\u00eb\u00ee\u00f1\u00f5\u00f8\u0100"+
		"\u0109\u010e\u0117\u011d\u0120\u0124\u0129\u0136\u013f\u014b\u0158\u015d"+
		"\u0163\u0169\u016b\u016e\u0177\u017a\u017d\u0181\u0188\u018b\u0194\u0199"+
		"\u01a1\u01a4\u01af\u01b2\u01b7\u01bb\u01be\u01c5\u01ca\u01d2\u01dd\u01ea"+
		"\u01f9\u01ff\u0203\u0205\u020a\u0213\u021c\u0229\u022e\u0233\u0237\u023b"+
		"\u023f\u0241\u024c\u0255\u025b\u0261\u0266\u0268\u0272\u027d\u028d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}