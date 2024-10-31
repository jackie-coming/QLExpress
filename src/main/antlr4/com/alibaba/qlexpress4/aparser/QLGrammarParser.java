// Generated from QLGrammar.g4 by ANTLR 4.9.3

    import static com.alibaba.qlexpress4.aparser.ParserOperatorManager.OpType.*;
    import static com.alibaba.qlexpress4.QLPrecedences.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FOR=1, IF=2, ELSE=3, WHILE=4, BREAK=5, CONTINUE=6, RETURN=7, FUNCTION=8, 
		MACRO=9, IMPORT=10, STATIC=11, NEW=12, BYTE=13, SHORT=14, INT=15, LONG=16, 
		FLOAT=17, DOUBLE=18, CHAR=19, BOOL=20, NULL=21, TRUE=22, FALSE=23, EXTENDS=24, 
		SUPER=25, TRY=26, CATCH=27, FINALLY=28, THROW=29, CLASS=30, THIS=31, QuoteStringLiteral=32, 
		StringLiteral=33, IntegerLiteral=34, FloatingPointLiteral=35, IntegerOrFloatingLiteral=36, 
		ContextSelector=37, LPAREN=38, RPAREN=39, LBRACE=40, RBRACE=41, LBRACK=42, 
		RBRACK=43, DOT=44, ARROW=45, SEMI=46, COMMA=47, QUESTION=48, COLON=49, 
		DCOLON=50, GT=51, LT=52, EQ=53, NOEQ=54, RIGHSHIFT_ASSGIN=55, RIGHSHIFT=56, 
		OPTIONAL_CHAINING=57, SPREAD_CHAINING=58, URSHIFT_ASSGIN=59, URSHIFT=60, 
		LSHIFT_ASSGIN=61, LEFTSHIFT=62, GE=63, LE=64, DOTMUL=65, CARET=66, ADD_ASSIGN=67, 
		SUB_ASSIGN=68, AND_ASSIGN=69, OR_ASSIGN=70, MUL_ASSIGN=71, MOD_ASSIGN=72, 
		DIV_ASSIGN=73, XOR_ASSIGN=74, BANG=75, TILDE=76, ADD=77, SUB=78, MUL=79, 
		DIV=80, BIT_AND=81, BIT_OR=82, MOD=83, INC=84, DEC=85, WS=86, COMMENT=87, 
		LINE_COMMENT=88, OPID=89, ID=90, CATCH_ALL=91;
	public static final int
		RULE_program = 0, RULE_blockStatements = 1, RULE_blockStatement = 2, RULE_localVariableDeclaration = 3, 
		RULE_forInit = 4, RULE_variableDeclaratorList = 5, RULE_variableDeclarator = 6, 
		RULE_variableDeclaratorId = 7, RULE_variableInitializer = 8, RULE_arrayInitializer = 9, 
		RULE_variableInitializerList = 10, RULE_declType = 11, RULE_declTypeNoArr = 12, 
		RULE_primitiveType = 13, RULE_referenceType = 14, RULE_dims = 15, RULE_clsTypeNoTypeArguments = 16, 
		RULE_clsType = 17, RULE_typeArguments = 18, RULE_typeArgumentList = 19, 
		RULE_typeArgument = 20, RULE_wildcard = 21, RULE_wildcardBounds = 22, 
		RULE_expression = 23, RULE_leftHandSide = 24, RULE_ternaryExpr = 25, RULE_baseExpr = 26, 
		RULE_leftAsso = 27, RULE_binaryop = 28, RULE_primary = 29, RULE_prefixExpress = 30, 
		RULE_suffixExpress = 31, RULE_primaryNoFix = 32, RULE_ifBody = 33, RULE_listItems = 34, 
		RULE_dimExprs = 35, RULE_tryCatches = 36, RULE_tryCatch = 37, RULE_catchParams = 38, 
		RULE_tryFinally = 39, RULE_mapEntries = 40, RULE_mapEntry = 41, RULE_mapValue = 42, 
		RULE_mapKey = 43, RULE_idMapKey = 44, RULE_pathPart = 45, RULE_fieldId = 46, 
		RULE_indexValueExpr = 47, RULE_argumentList = 48, RULE_literal = 49, RULE_boolenLiteral = 50, 
		RULE_lambdaParameters = 51, RULE_formalOrInferredParameterList = 52, RULE_formalOrInferredParameter = 53, 
		RULE_importDeclaration = 54, RULE_assignOperator = 55, RULE_opId = 56, 
		RULE_varId = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "blockStatements", "blockStatement", "localVariableDeclaration", 
			"forInit", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "variableInitializerList", 
			"declType", "declTypeNoArr", "primitiveType", "referenceType", "dims", 
			"clsTypeNoTypeArguments", "clsType", "typeArguments", "typeArgumentList", 
			"typeArgument", "wildcard", "wildcardBounds", "expression", "leftHandSide", 
			"ternaryExpr", "baseExpr", "leftAsso", "binaryop", "primary", "prefixExpress", 
			"suffixExpress", "primaryNoFix", "ifBody", "listItems", "dimExprs", "tryCatches", 
			"tryCatch", "catchParams", "tryFinally", "mapEntries", "mapEntry", "mapValue", 
			"mapKey", "idMapKey", "pathPart", "fieldId", "indexValueExpr", "argumentList", 
			"literal", "boolenLiteral", "lambdaParameters", "formalOrInferredParameterList", 
			"formalOrInferredParameter", "importDeclaration", "assignOperator", "opId", 
			"varId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'if'", "'else'", "'while'", "'break'", "'continue'", 
			"'return'", "'function'", "'macro'", "'import'", "'static'", "'new'", 
			"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", 
			"'boolean'", "'null'", "'true'", "'false'", "'extends'", "'super'", "'try'", 
			"'catch'", "'finally'", "'throw'", "'class'", "'this'", null, null, null, 
			null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "'->'", 
			"';'", "','", "'?'", "':'", "'::'", "'>'", "'<'", "'='", "'<>'", "'>>='", 
			"'>>'", "'?.'", "'*.'", "'>>>='", "'>>>'", "'<<='", "'<<'", "'>='", "'<='", 
			"'.*'", "'^'", "'+='", "'-='", "'&='", "'|='", "'*='", "'%='", "'/='", 
			"'^='", "'!'", "'~'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'%'", 
			"'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FOR", "IF", "ELSE", "WHILE", "BREAK", "CONTINUE", "RETURN", "FUNCTION", 
			"MACRO", "IMPORT", "STATIC", "NEW", "BYTE", "SHORT", "INT", "LONG", "FLOAT", 
			"DOUBLE", "CHAR", "BOOL", "NULL", "TRUE", "FALSE", "EXTENDS", "SUPER", 
			"TRY", "CATCH", "FINALLY", "THROW", "CLASS", "THIS", "QuoteStringLiteral", 
			"StringLiteral", "IntegerLiteral", "FloatingPointLiteral", "IntegerOrFloatingLiteral", 
			"ContextSelector", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "DOT", "ARROW", "SEMI", "COMMA", "QUESTION", "COLON", "DCOLON", 
			"GT", "LT", "EQ", "NOEQ", "RIGHSHIFT_ASSGIN", "RIGHSHIFT", "OPTIONAL_CHAINING", 
			"SPREAD_CHAINING", "URSHIFT_ASSGIN", "URSHIFT", "LSHIFT_ASSGIN", "LEFTSHIFT", 
			"GE", "LE", "DOTMUL", "CARET", "ADD_ASSIGN", "SUB_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "MUL_ASSIGN", "MOD_ASSIGN", "DIV_ASSIGN", "XOR_ASSIGN", 
			"BANG", "TILDE", "ADD", "SUB", "MUL", "DIV", "BIT_AND", "BIT_OR", "MOD", 
			"INC", "DEC", "WS", "COMMENT", "LINE_COMMENT", "OPID", "ID", "CATCH_ALL"
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
	public String getGrammarFileName() { return "QLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    ParserOperatorManager opM;
	    public QLGrammarParser(TokenStream input, ParserOperatorManager opM) {    // custom constructor
	        this(input);
	        this.opM = opM;
	    }

	public QLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(QLGrammarParser.EOF, 0); }
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					importDeclaration();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(122);
				blockStatements();
				}
				break;
			}
			setState(125);
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

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					blockStatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends BlockStatementContext {
		public TerminalNode WHILE() { return getToken(QLGrammarParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public WhileStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TraditionalForStatementContext extends BlockStatementContext {
		public ExpressionContext forCondition;
		public ExpressionContext forUpdate;
		public TerminalNode FOR() { return getToken(QLGrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TraditionalForStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTraditionalForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTraditionalForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTraditionalForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyStatementContext extends BlockStatementContext {
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public EmptyStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalVariableDeclarationStatementContext extends BlockStatementContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForEachStatementContext extends BlockStatementContext {
		public TerminalNode FOR() { return getToken(QLGrammarParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QLGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public ForEachStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MacroStatementContext extends BlockStatementContext {
		public TerminalNode MACRO() { return getToken(QLGrammarParser.MACRO, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public MacroStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterMacroStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitMacroStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitMacroStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStatementContext extends BlockStatementContext {
		public TerminalNode THROW() { return getToken(QLGrammarParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public ThrowStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionStatementContext extends BlockStatementContext {
		public TerminalNode FUNCTION() { return getToken(QLGrammarParser.FUNCTION, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public FormalOrInferredParameterListContext formalOrInferredParameterList() {
			return getRuleContext(FormalOrInferredParameterListContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public FunctionStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends BlockStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public ExpressionStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends BlockStatementContext {
		public TerminalNode RETURN() { return getToken(QLGrammarParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContinueStatementContext extends BlockStatementContext {
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public TerminalNode BREAK() { return getToken(QLGrammarParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(QLGrammarParser.CONTINUE, 0); }
		public BreakContinueStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterBreakContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitBreakContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitBreakContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockStatement);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new LocalVariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				localVariableDeclaration();
				setState(133);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(THROW);
				setState(136);
				expression();
				setState(137);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(WHILE);
				setState(140);
				match(LPAREN);
				setState(141);
				expression();
				setState(142);
				match(RPAREN);
				setState(143);
				blockStatement();
				}
				break;
			case 4:
				_localctx = new TraditionalForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(FOR);
				setState(146);
				match(LPAREN);
				setState(147);
				forInit();
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(148);
					((TraditionalForStatementContext)_localctx).forCondition = expression();
					}
					break;
				}
				setState(151);
				match(SEMI);
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(152);
					((TraditionalForStatementContext)_localctx).forUpdate = expression();
					}
					break;
				}
				setState(155);
				match(RPAREN);
				setState(156);
				blockStatement();
				}
				break;
			case 5:
				_localctx = new ForEachStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(FOR);
				setState(159);
				match(LPAREN);
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(160);
					declType();
					}
					break;
				}
				setState(163);
				varId();
				setState(164);
				match(COLON);
				setState(165);
				expression();
				setState(166);
				match(RPAREN);
				setState(167);
				blockStatement();
				}
				break;
			case 6:
				_localctx = new FunctionStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(FUNCTION);
				setState(170);
				varId();
				setState(171);
				match(LPAREN);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0) || _la==ID) {
					{
					setState(172);
					formalOrInferredParameterList();
					}
				}

				setState(175);
				match(RPAREN);
				setState(176);
				match(LBRACE);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(177);
					blockStatements();
					}
					break;
				}
				setState(180);
				match(RBRACE);
				}
				break;
			case 7:
				_localctx = new MacroStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				match(MACRO);
				setState(183);
				varId();
				setState(184);
				match(LBRACE);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(185);
					blockStatements();
					}
					break;
				}
				setState(188);
				match(RBRACE);
				}
				break;
			case 8:
				_localctx = new BreakContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				match(RETURN);
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(193);
					expression();
					}
					break;
				}
				setState(196);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new EmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(197);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(198);
				expression();
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(199);
					match(SEMI);
					}
					break;
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			declType();
			setState(205);
			variableDeclaratorList();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forInit);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				localVariableDeclaration();
				setState(208);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				expression();
				setState(211);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(SEMI);
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

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVariableDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVariableDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			variableDeclarator();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				variableDeclarator();
				}
				}
				setState(223);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode EQ() { return getToken(QLGrammarParser.EQ, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			variableDeclaratorId();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(225);
				match(EQ);
				setState(226);
				variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			varId();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(230);
				dims();
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableInitializer);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				arrayInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(QLGrammarParser.COMMA, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LBRACE);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(238);
				variableInitializerList();
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241);
				match(COMMA);
				}
			}

			setState(244);
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

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVariableInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVariableInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			variableInitializer();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(COMMA);
					setState(248);
					variableInitializer();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class DeclTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ClsTypeContext clsType() {
			return getRuleContext(ClsTypeContext.class,0);
		}
		public DeclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypeContext declType() throws RecognitionException {
		DeclTypeContext _localctx = new DeclTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declType);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				primitiveType();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(255);
					dims();
					}
				}

				}
				break;
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				clsType();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(259);
					dims();
					}
				}

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

	public static class DeclTypeNoArrContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClsTypeContext clsType() {
			return getRuleContext(ClsTypeContext.class,0);
		}
		public DeclTypeNoArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTypeNoArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterDeclTypeNoArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitDeclTypeNoArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitDeclTypeNoArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclTypeNoArrContext declTypeNoArr() throws RecognitionException {
		DeclTypeNoArrContext _localctx = new DeclTypeNoArrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declTypeNoArr);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				primitiveType();
				}
				break;
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				clsType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(QLGrammarParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(QLGrammarParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(QLGrammarParser.INT, 0); }
		public TerminalNode LONG() { return getToken(QLGrammarParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(QLGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(QLGrammarParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(QLGrammarParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(QLGrammarParser.CHAR, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ClsTypeContext clsType() {
			return getRuleContext(ClsTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_referenceType);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				clsType();
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(271);
					dims();
					}
					break;
				}
				}
				break;
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				primitiveType();
				setState(275);
				dims();
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

	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(QLGrammarParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(QLGrammarParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(QLGrammarParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(QLGrammarParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(LBRACK);
			setState(280);
			match(RBRACK);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(LBRACK);
					setState(282);
					match(RBRACK);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class ClsTypeNoTypeArgumentsContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(QLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(QLGrammarParser.DOT, i);
		}
		public ClsTypeNoTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsTypeNoTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterClsTypeNoTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitClsTypeNoTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitClsTypeNoTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsTypeNoTypeArgumentsContext clsTypeNoTypeArguments() throws RecognitionException {
		ClsTypeNoTypeArgumentsContext _localctx = new ClsTypeNoTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clsTypeNoTypeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			varId();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(289);
				match(DOT);
				setState(290);
				varId();
				}
				}
				setState(295);
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

	public static class ClsTypeContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(QLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(QLGrammarParser.DOT, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterClsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitClsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitClsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsTypeContext clsType() throws RecognitionException {
		ClsTypeContext _localctx = new ClsTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clsType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			varId();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(297);
				match(DOT);
				setState(298);
				varId();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT || _la==NOEQ) {
				{
				setState(304);
				typeArguments();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(QLGrammarParser.LT, 0); }
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TerminalNode GT() { return getToken(QLGrammarParser.GT, 0); }
		public TerminalNode RIGHSHIFT() { return getToken(QLGrammarParser.RIGHSHIFT, 0); }
		public TerminalNode URSHIFT() { return getToken(QLGrammarParser.URSHIFT, 0); }
		public TerminalNode NOEQ() { return getToken(QLGrammarParser.NOEQ, 0); }
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeArguments);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(LT);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(308);
					typeArgumentList();
					}
					break;
				}
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(311);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << RIGHSHIFT) | (1L << URSHIFT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case NOEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(NOEQ);
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

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTypeArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTypeArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeArgumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			typeArgument();
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					match(COMMA);
					setState(319);
					typeArgument();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeArgument);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				referenceType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				wildcard();
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

	public static class WildcardContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(QLGrammarParser.QUESTION, 0); }
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(QUESTION);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(330);
				wildcardBounds();
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

	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode EXTENDS() { return getToken(QLGrammarParser.EXTENDS, 0); }
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(QLGrammarParser.SUPER, 0); }
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_wildcardBounds);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(EXTENDS);
				setState(334);
				referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(SUPER);
				setState(336);
				referenceType();
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

	public static class ExpressionContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryExprContext ternaryExpr() {
			return getRuleContext(TernaryExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				leftHandSide();
				setState(340);
				assignOperator();
				setState(341);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				ternaryExpr();
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

	public static class LeftHandSideContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public List<PathPartContext> pathPart() {
			return getRuleContexts(PathPartContext.class);
		}
		public PathPartContext pathPart(int i) {
			return getRuleContext(PathPartContext.class,i);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLeftHandSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLeftHandSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_leftHandSide);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			varId();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(347);
					pathPart();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class TernaryExprContext extends ParserRuleContext {
		public BaseExprContext condition;
		public BaseExprContext thenExpr;
		public ExpressionContext elseExpr;
		public List<BaseExprContext> baseExpr() {
			return getRuleContexts(BaseExprContext.class);
		}
		public BaseExprContext baseExpr(int i) {
			return getRuleContext(BaseExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(QLGrammarParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(QLGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryExprContext ternaryExpr() throws RecognitionException {
		TernaryExprContext _localctx = new TernaryExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ternaryExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			((TernaryExprContext)_localctx).condition = baseExpr(1);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(354);
				match(QUESTION);
				setState(355);
				((TernaryExprContext)_localctx).thenExpr = baseExpr(0);
				setState(356);
				match(COLON);
				setState(357);
				((TernaryExprContext)_localctx).elseExpr = expression();
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

	public static class BaseExprContext extends ParserRuleContext {
		public int p;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<LeftAssoContext> leftAsso() {
			return getRuleContexts(LeftAssoContext.class);
		}
		public LeftAssoContext leftAsso(int i) {
			return getRuleContext(LeftAssoContext.class,i);
		}
		public BaseExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BaseExprContext(ParserRuleContext parent, int invokingState, int p) {
			super(parent, invokingState);
			this.p = p;
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitBaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExprContext baseExpr(int p) throws RecognitionException {
		BaseExprContext _localctx = new BaseExprContext(_ctx, getState(), p);
		enterRule(_localctx, 52, RULE_baseExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			primary();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					if (!(_input.LT(1).getType() != Token.EOF &&
					        opM.isOpType(_input.LT(1).getText(), MIDDLE) && opM.precedence(_input.LT(1).getText()) >= _localctx.p)) throw new FailedPredicateException(this, "_input.LT(1).getType() != Token.EOF &&\n        opM.isOpType(_input.LT(1).getText(), MIDDLE) && opM.precedence(_input.LT(1).getText()) >= $p");
					setState(363);
					leftAsso();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class LeftAssoContext extends ParserRuleContext {
		public BinaryopContext binaryop() {
			return getRuleContext(BinaryopContext.class,0);
		}
		public BaseExprContext baseExpr() {
			return getRuleContext(BaseExprContext.class,0);
		}
		public LeftAssoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftAsso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLeftAsso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLeftAsso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLeftAsso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftAssoContext leftAsso() throws RecognitionException {
		LeftAssoContext _localctx = new LeftAssoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_leftAsso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			binaryop();
			setState(370);
			baseExpr(opM.precedence(_input.LT(-1).getText()) + 1);
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

	public static class BinaryopContext extends ParserRuleContext {
		public OpIdContext opId() {
			return getRuleContext(OpIdContext.class,0);
		}
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public BinaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterBinaryop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitBinaryop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitBinaryop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryopContext binaryop() throws RecognitionException {
		BinaryopContext _localctx = new BinaryopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_binaryop);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
			case LT:
			case EQ:
			case NOEQ:
			case RIGHSHIFT_ASSGIN:
			case RIGHSHIFT:
			case URSHIFT_ASSGIN:
			case URSHIFT:
			case LSHIFT_ASSGIN:
			case LEFTSHIFT:
			case GE:
			case LE:
			case DOTMUL:
			case CARET:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case MUL_ASSIGN:
			case MOD_ASSIGN:
			case DIV_ASSIGN:
			case XOR_ASSIGN:
			case BANG:
			case TILDE:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case BIT_AND:
			case BIT_OR:
			case MOD:
			case INC:
			case DEC:
			case OPID:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				opId();
				}
				break;
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				varId();
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoFixContext primaryNoFix() {
			return getRuleContext(PrimaryNoFixContext.class,0);
		}
		public PrefixExpressContext prefixExpress() {
			return getRuleContext(PrefixExpressContext.class,0);
		}
		public List<PathPartContext> pathPart() {
			return getRuleContexts(PathPartContext.class);
		}
		public PathPartContext pathPart(int i) {
			return getRuleContext(PathPartContext.class,i);
		}
		public SuffixExpressContext suffixExpress() {
			return getRuleContext(SuffixExpressContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(376);
				prefixExpress();
				}
				break;
			}
			setState(379);
			primaryNoFix();
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					pathPart();
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(386);
				suffixExpress();
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

	public static class PrefixExpressContext extends ParserRuleContext {
		public OpIdContext opId() {
			return getRuleContext(OpIdContext.class,0);
		}
		public PrefixExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterPrefixExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitPrefixExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitPrefixExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixExpressContext prefixExpress() throws RecognitionException {
		PrefixExpressContext _localctx = new PrefixExpressContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_prefixExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			if (!(_input.LT(1).getType() != Token.EOF && opM.isOpType(_input.LT(1).getText(), PREFIX))) throw new FailedPredicateException(this, "_input.LT(1).getType() != Token.EOF && opM.isOpType(_input.LT(1).getText(), PREFIX)");
			setState(390);
			opId();
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

	public static class SuffixExpressContext extends ParserRuleContext {
		public OpIdContext opId() {
			return getRuleContext(OpIdContext.class,0);
		}
		public SuffixExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffixExpress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterSuffixExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitSuffixExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitSuffixExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuffixExpressContext suffixExpress() throws RecognitionException {
		SuffixExpressContext _localctx = new SuffixExpressContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_suffixExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			if (!(_input.LT(1).getType() != Token.EOF && opM.isOpType(_input.LT(1).getText(), SUFFIX))) throw new FailedPredicateException(this, "_input.LT(1).getType() != Token.EOF && opM.isOpType(_input.LT(1).getText(), SUFFIX)");
			setState(393);
			opId();
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

	public static class PrimaryNoFixContext extends ParserRuleContext {
		public PrimaryNoFixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoFix; }
	 
		public PrimaryNoFixContext() { }
		public void copyFrom(PrimaryNoFixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupExprContext extends PrimaryNoFixContext {
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public GroupExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterGroupExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitGroupExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitGroupExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewEmptyArrExprContext extends PrimaryNoFixContext {
		public TerminalNode NEW() { return getToken(QLGrammarParser.NEW, 0); }
		public DeclTypeNoArrContext declTypeNoArr() {
			return getRuleContext(DeclTypeNoArrContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public NewEmptyArrExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterNewEmptyArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitNewEmptyArrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitNewEmptyArrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdExprContext extends PrimaryNoFixContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public VarIdExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVarIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVarIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVarIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExprContext extends PrimaryNoFixContext {
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public CastExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeExprContext extends PrimaryNoFixContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContextSelectExprContext extends PrimaryNoFixContext {
		public TerminalNode ContextSelector() { return getToken(QLGrammarParser.ContextSelector, 0); }
		public ContextSelectExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterContextSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitContextSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitContextSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapExprContext extends PrimaryNoFixContext {
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public MapEntriesContext mapEntries() {
			return getRuleContext(MapEntriesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public MapExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterMapExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitMapExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitMapExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewInitArrExprContext extends PrimaryNoFixContext {
		public TerminalNode NEW() { return getToken(QLGrammarParser.NEW, 0); }
		public DeclTypeNoArrContext declTypeNoArr() {
			return getRuleContext(DeclTypeNoArrContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public NewInitArrExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterNewInitArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitNewInitArrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitNewInitArrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TryCatchExprContext extends PrimaryNoFixContext {
		public TerminalNode TRY() { return getToken(QLGrammarParser.TRY, 0); }
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TryCatchesContext tryCatches() {
			return getRuleContext(TryCatchesContext.class,0);
		}
		public TryFinallyContext tryFinally() {
			return getRuleContext(TryFinallyContext.class,0);
		}
		public TryCatchExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTryCatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTryCatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTryCatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjExprContext extends PrimaryNoFixContext {
		public TerminalNode NEW() { return getToken(QLGrammarParser.NEW, 0); }
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(QLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(QLGrammarParser.DOT, i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public NewObjExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterNewObjExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitNewObjExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitNewObjExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaExprContext extends PrimaryNoFixContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(QLGrammarParser.ARROW, 0); }
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public LambdaExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends PrimaryNoFixContext {
		public ExpressionContext condition;
		public IfBodyContext thenBody;
		public IfBodyContext elseBody;
		public TerminalNode IF() { return getToken(QLGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<IfBodyContext> ifBody() {
			return getRuleContexts(IfBodyContext.class);
		}
		public IfBodyContext ifBody(int i) {
			return getRuleContext(IfBodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(QLGrammarParser.ELSE, 0); }
		public IfExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockExprContext extends PrimaryNoFixContext {
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterBlockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitBlockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitBlockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExprContext extends PrimaryNoFixContext {
		public TerminalNode LBRACK() { return getToken(QLGrammarParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(QLGrammarParser.RBRACK, 0); }
		public ListItemsContext listItems() {
			return getRuleContext(ListItemsContext.class,0);
		}
		public ListExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprContext extends PrimaryNoFixContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstExprContext(PrimaryNoFixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryNoFixContext primaryNoFix() throws RecognitionException {
		PrimaryNoFixContext _localctx = new PrimaryNoFixContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primaryNoFix);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new ConstExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				literal();
				}
				break;
			case 2:
				_localctx = new CastExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(LPAREN);
				setState(397);
				declType();
				setState(398);
				match(RPAREN);
				setState(399);
				primary();
				}
				break;
			case 3:
				_localctx = new GroupExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(LPAREN);
				setState(402);
				expression();
				setState(403);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new NewObjExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				match(NEW);
				setState(406);
				varId();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(407);
					match(DOT);
					setState(408);
					varId();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT || _la==NOEQ) {
					{
					setState(414);
					typeArguments();
					}
				}

				setState(417);
				match(LPAREN);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(418);
					argumentList();
					}
					break;
				}
				setState(421);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new NewEmptyArrExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				match(NEW);
				setState(424);
				declTypeNoArr();
				setState(425);
				dimExprs();
				}
				break;
			case 6:
				_localctx = new NewInitArrExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(427);
				match(NEW);
				setState(428);
				declTypeNoArr();
				setState(429);
				dims();
				setState(430);
				arrayInitializer();
				}
				break;
			case 7:
				_localctx = new LambdaExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(432);
				lambdaParameters();
				setState(433);
				match(ARROW);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(434);
					match(LBRACE);
					setState(436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(435);
						blockStatements();
						}
						break;
					}
					setState(438);
					match(RBRACE);
					}
					break;
				case 2:
					{
					setState(439);
					expression();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new VarIdExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(442);
				varId();
				}
				break;
			case 9:
				_localctx = new TypeExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(443);
				primitiveType();
				}
				break;
			case 10:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(444);
				match(LBRACK);
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(445);
					listItems();
					}
					break;
				}
				setState(448);
				match(RBRACK);
				}
				break;
			case 11:
				_localctx = new MapExprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(449);
				match(LBRACE);
				setState(450);
				mapEntries();
				setState(451);
				match(RBRACE);
				}
				break;
			case 12:
				_localctx = new BlockExprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(453);
				match(LBRACE);
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(454);
					blockStatements();
					}
					break;
				}
				setState(457);
				match(RBRACE);
				}
				break;
			case 13:
				_localctx = new IfExprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(458);
				match(IF);
				setState(459);
				match(LPAREN);
				setState(460);
				((IfExprContext)_localctx).condition = expression();
				setState(461);
				match(RPAREN);
				setState(462);
				((IfExprContext)_localctx).thenBody = ifBody();
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(463);
					match(ELSE);
					setState(464);
					((IfExprContext)_localctx).elseBody = ifBody();
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new TryCatchExprContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(467);
				match(TRY);
				setState(468);
				match(LBRACE);
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(469);
					blockStatements();
					}
					break;
				}
				setState(472);
				match(RBRACE);
				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(473);
					tryCatches();
					}
					break;
				}
				setState(477);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(476);
					tryFinally();
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new ContextSelectExprContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(479);
				match(ContextSelector);
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

	public static class IfBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifBody);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(LBRACE);
				setState(484);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(483);
					blockStatements();
					}
					break;
				}
				setState(486);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				blockStatement();
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

	public static class ListItemsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public ListItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterListItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitListItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitListItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemsContext listItems() throws RecognitionException {
		ListItemsContext _localctx = new ListItemsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			expression();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(491);
				match(COMMA);
				setState(492);
				expression();
				}
				}
				setState(497);
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

	public static class DimExprsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(QLGrammarParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(QLGrammarParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(QLGrammarParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(QLGrammarParser.RBRACK, i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(LBRACK);
			setState(499);
			expression();
			setState(500);
			match(RBRACK);
			setState(507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501);
					match(LBRACK);
					setState(502);
					expression();
					setState(503);
					match(RBRACK);
					}
					} 
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class TryCatchesContext extends ParserRuleContext {
		public List<TryCatchContext> tryCatch() {
			return getRuleContexts(TryCatchContext.class);
		}
		public TryCatchContext tryCatch(int i) {
			return getRuleContext(TryCatchContext.class,i);
		}
		public TryCatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTryCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTryCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTryCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchesContext tryCatches() throws RecognitionException {
		TryCatchesContext _localctx = new TryCatchesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tryCatches);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			tryCatch();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					tryCatch();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class TryCatchContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(QLGrammarParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public CatchParamsContext catchParams() {
			return getRuleContext(CatchParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchContext tryCatch() throws RecognitionException {
		TryCatchContext _localctx = new TryCatchContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(CATCH);
			setState(518);
			match(LPAREN);
			setState(519);
			catchParams();
			setState(520);
			match(RPAREN);
			setState(521);
			match(LBRACE);
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(522);
				blockStatements();
				}
				break;
			}
			setState(525);
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

	public static class CatchParamsContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public List<DeclTypeContext> declType() {
			return getRuleContexts(DeclTypeContext.class);
		}
		public DeclTypeContext declType(int i) {
			return getRuleContext(DeclTypeContext.class,i);
		}
		public List<TerminalNode> BIT_OR() { return getTokens(QLGrammarParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(QLGrammarParser.BIT_OR, i);
		}
		public CatchParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterCatchParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitCatchParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitCatchParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchParamsContext catchParams() throws RecognitionException {
		CatchParamsContext _localctx = new CatchParamsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_catchParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(527);
				declType();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BIT_OR) {
					{
					{
					setState(528);
					match(BIT_OR);
					setState(529);
					declType();
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(537);
			varId();
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

	public static class TryFinallyContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(QLGrammarParser.FINALLY, 0); }
		public TerminalNode LBRACE() { return getToken(QLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(QLGrammarParser.RBRACE, 0); }
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public TryFinallyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryFinally; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterTryFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitTryFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitTryFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryFinallyContext tryFinally() throws RecognitionException {
		TryFinallyContext _localctx = new TryFinallyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tryFinally);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(FINALLY);
			setState(540);
			match(LBRACE);
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(541);
				blockStatements();
				}
				break;
			}
			setState(544);
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

	public static class MapEntriesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(QLGrammarParser.COLON, 0); }
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public MapEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterMapEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitMapEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitMapEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntriesContext mapEntries() throws RecognitionException {
		MapEntriesContext _localctx = new MapEntriesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mapEntries);
		int _la;
		try {
			int _alt;
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(COLON);
				}
				break;
			case FOR:
			case IF:
			case ELSE:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FUNCTION:
			case MACRO:
			case IMPORT:
			case STATIC:
			case NEW:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case NULL:
			case TRUE:
			case FALSE:
			case EXTENDS:
			case SUPER:
			case TRY:
			case CATCH:
			case FINALLY:
			case THROW:
			case CLASS:
			case THIS:
			case QuoteStringLiteral:
			case StringLiteral:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				mapEntry();
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(548);
						match(COMMA);
						setState(549);
						mapEntry();
						}
						} 
					}
					setState(554);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(555);
					match(COMMA);
					}
				}

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

	public static class MapEntryContext extends ParserRuleContext {
		public MapKeyContext mapKey() {
			return getRuleContext(MapKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(QLGrammarParser.COLON, 0); }
		public MapValueContext mapValue() {
			return getRuleContext(MapValueContext.class,0);
		}
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mapEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			mapKey();
			setState(561);
			match(COLON);
			setState(562);
			mapValue();
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

	public static class MapValueContext extends ParserRuleContext {
		public MapValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapValue; }
	 
		public MapValueContext() { }
		public void copyFrom(MapValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClsValueContext extends MapValueContext {
		public Token cls;
		public TerminalNode StringLiteral() { return getToken(QLGrammarParser.StringLiteral, 0); }
		public TerminalNode QuoteStringLiteral() { return getToken(QLGrammarParser.QuoteStringLiteral, 0); }
		public ClsValueContext(MapValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterClsValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitClsValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitClsValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EValueContext extends MapValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EValueContext(MapValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterEValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitEValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitEValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapValueContext mapValue() throws RecognitionException {
		MapValueContext _localctx = new MapValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mapValue);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new ClsValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				if (!(_input.LT(-2).getText().equals("'@class'"))) throw new FailedPredicateException(this, "_input.LT(-2).getText().equals(\"'@class'\")");
				setState(565);
				((ClsValueContext)_localctx).cls = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==QuoteStringLiteral || _la==StringLiteral) ) {
					((ClsValueContext)_localctx).cls = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new EValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
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

	public static class MapKeyContext extends ParserRuleContext {
		public MapKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKey; }
	 
		public MapKeyContext() { }
		public void copyFrom(MapKeyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuoteStringKeyContext extends MapKeyContext {
		public TerminalNode QuoteStringLiteral() { return getToken(QLGrammarParser.QuoteStringLiteral, 0); }
		public QuoteStringKeyContext(MapKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterQuoteStringKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitQuoteStringKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitQuoteStringKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdKeyContext extends MapKeyContext {
		public IdMapKeyContext idMapKey() {
			return getRuleContext(IdMapKeyContext.class,0);
		}
		public IdKeyContext(MapKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterIdKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitIdKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitIdKey(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringKeyContext extends MapKeyContext {
		public TerminalNode StringLiteral() { return getToken(QLGrammarParser.StringLiteral, 0); }
		public StringKeyContext(MapKeyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterStringKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitStringKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitStringKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapKeyContext mapKey() throws RecognitionException {
		MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mapKey);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case IF:
			case ELSE:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FUNCTION:
			case MACRO:
			case IMPORT:
			case STATIC:
			case NEW:
			case BYTE:
			case SHORT:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case CHAR:
			case BOOL:
			case NULL:
			case TRUE:
			case FALSE:
			case EXTENDS:
			case SUPER:
			case TRY:
			case CATCH:
			case FINALLY:
			case THROW:
			case CLASS:
			case THIS:
			case ID:
				_localctx = new IdKeyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				idMapKey();
				}
				break;
			case StringLiteral:
				_localctx = new StringKeyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(StringLiteral);
				}
				break;
			case QuoteStringLiteral:
				_localctx = new QuoteStringKeyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				match(QuoteStringLiteral);
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

	public static class IdMapKeyContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode FOR() { return getToken(QLGrammarParser.FOR, 0); }
		public TerminalNode IF() { return getToken(QLGrammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(QLGrammarParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(QLGrammarParser.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(QLGrammarParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(QLGrammarParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(QLGrammarParser.RETURN, 0); }
		public TerminalNode FUNCTION() { return getToken(QLGrammarParser.FUNCTION, 0); }
		public TerminalNode MACRO() { return getToken(QLGrammarParser.MACRO, 0); }
		public TerminalNode IMPORT() { return getToken(QLGrammarParser.IMPORT, 0); }
		public TerminalNode STATIC() { return getToken(QLGrammarParser.STATIC, 0); }
		public TerminalNode NEW() { return getToken(QLGrammarParser.NEW, 0); }
		public TerminalNode BYTE() { return getToken(QLGrammarParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(QLGrammarParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(QLGrammarParser.INT, 0); }
		public TerminalNode LONG() { return getToken(QLGrammarParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(QLGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(QLGrammarParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(QLGrammarParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(QLGrammarParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(QLGrammarParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(QLGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(QLGrammarParser.FALSE, 0); }
		public TerminalNode EXTENDS() { return getToken(QLGrammarParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(QLGrammarParser.SUPER, 0); }
		public TerminalNode TRY() { return getToken(QLGrammarParser.TRY, 0); }
		public TerminalNode CATCH() { return getToken(QLGrammarParser.CATCH, 0); }
		public TerminalNode FINALLY() { return getToken(QLGrammarParser.FINALLY, 0); }
		public TerminalNode THROW() { return getToken(QLGrammarParser.THROW, 0); }
		public TerminalNode CLASS() { return getToken(QLGrammarParser.CLASS, 0); }
		public TerminalNode THIS() { return getToken(QLGrammarParser.THIS, 0); }
		public IdMapKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idMapKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterIdMapKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitIdMapKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitIdMapKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdMapKeyContext idMapKey() throws RecognitionException {
		IdMapKeyContext _localctx = new IdMapKeyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_idMapKey);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				varId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(FOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(IF);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577);
				match(ELSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				match(WHILE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(579);
				match(BREAK);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(580);
				match(CONTINUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(581);
				match(RETURN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(582);
				match(FUNCTION);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(583);
				match(MACRO);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(584);
				match(IMPORT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(585);
				match(STATIC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(586);
				match(NEW);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(587);
				match(BYTE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(588);
				match(SHORT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(589);
				match(INT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(590);
				match(LONG);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(591);
				match(FLOAT);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(592);
				match(DOUBLE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(593);
				match(CHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(594);
				match(BOOL);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(595);
				match(NULL);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(596);
				match(TRUE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(597);
				match(FALSE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(598);
				match(EXTENDS);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(599);
				match(SUPER);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(600);
				match(TRY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(601);
				match(CATCH);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(602);
				match(FINALLY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(603);
				match(THROW);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(604);
				match(CLASS);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(605);
				match(THIS);
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

	public static class PathPartContext extends ParserRuleContext {
		public PathPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPart; }
	 
		public PathPartContext() { }
		public void copyFrom(PathPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexExprContext extends PathPartContext {
		public TerminalNode LBRACK() { return getToken(QLGrammarParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(QLGrammarParser.RBRACK, 0); }
		public IndexValueExprContext indexValueExpr() {
			return getRuleContext(IndexValueExprContext.class,0);
		}
		public IndexExprContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterIndexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitIndexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpreadMethodInvokeContext extends PathPartContext {
		public TerminalNode SPREAD_CHAINING() { return getToken(QLGrammarParser.SPREAD_CHAINING, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SpreadMethodInvokeContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterSpreadMethodInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitSpreadMethodInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitSpreadMethodInvoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CustomPathContext extends PathPartContext {
		public OpIdContext opId() {
			return getRuleContext(OpIdContext.class,0);
		}
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public CustomPathContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterCustomPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitCustomPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitCustomPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodInvokeContext extends PathPartContext {
		public TerminalNode DOT() { return getToken(QLGrammarParser.DOT, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvokeContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterMethodInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitMethodInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitMethodInvoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionalMethodInvokeContext extends PathPartContext {
		public TerminalNode OPTIONAL_CHAINING() { return getToken(QLGrammarParser.OPTIONAL_CHAINING, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public OptionalMethodInvokeContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterOptionalMethodInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitOptionalMethodInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitOptionalMethodInvoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodAccessContext extends PathPartContext {
		public TerminalNode DCOLON() { return getToken(QLGrammarParser.DCOLON, 0); }
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public MethodAccessContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterMethodAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitMethodAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitMethodAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessContext extends PathPartContext {
		public TerminalNode DOT() { return getToken(QLGrammarParser.DOT, 0); }
		public FieldIdContext fieldId() {
			return getRuleContext(FieldIdContext.class,0);
		}
		public FieldAccessContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionalFieldAccessContext extends PathPartContext {
		public TerminalNode OPTIONAL_CHAINING() { return getToken(QLGrammarParser.OPTIONAL_CHAINING, 0); }
		public FieldIdContext fieldId() {
			return getRuleContext(FieldIdContext.class,0);
		}
		public OptionalFieldAccessContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterOptionalFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitOptionalFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitOptionalFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpreadFieldAccessContext extends PathPartContext {
		public TerminalNode SPREAD_CHAINING() { return getToken(QLGrammarParser.SPREAD_CHAINING, 0); }
		public FieldIdContext fieldId() {
			return getRuleContext(FieldIdContext.class,0);
		}
		public SpreadFieldAccessContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterSpreadFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitSpreadFieldAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitSpreadFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExprContext extends PathPartContext {
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public CallExprContext(PathPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPartContext pathPart() throws RecognitionException {
		PathPartContext _localctx = new PathPartContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pathPart);
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new MethodInvokeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(DOT);
				setState(609);
				varId();
				setState(610);
				match(LPAREN);
				setState(612);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(611);
					argumentList();
					}
					break;
				}
				setState(614);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new OptionalMethodInvokeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				match(OPTIONAL_CHAINING);
				setState(617);
				varId();
				setState(618);
				match(LPAREN);
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(619);
					argumentList();
					}
					break;
				}
				setState(622);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new SpreadMethodInvokeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				match(SPREAD_CHAINING);
				setState(625);
				varId();
				setState(626);
				match(LPAREN);
				setState(628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(627);
					argumentList();
					}
					break;
				}
				setState(630);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new FieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				match(DOT);
				setState(633);
				fieldId();
				}
				break;
			case 5:
				_localctx = new OptionalFieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				match(OPTIONAL_CHAINING);
				setState(635);
				fieldId();
				}
				break;
			case 6:
				_localctx = new SpreadFieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(636);
				match(SPREAD_CHAINING);
				setState(637);
				fieldId();
				}
				break;
			case 7:
				_localctx = new MethodAccessContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(638);
				match(DCOLON);
				setState(639);
				varId();
				}
				break;
			case 8:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(640);
				match(LPAREN);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(641);
					argumentList();
					}
					break;
				}
				setState(644);
				match(RPAREN);
				}
				break;
			case 9:
				_localctx = new IndexExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(645);
				match(LBRACK);
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(646);
					indexValueExpr();
					}
					break;
				}
				setState(649);
				match(RBRACK);
				}
				break;
			case 10:
				_localctx = new CustomPathContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(650);
				if (!(opM.isOpType(_input.LT(1).getText(), MIDDLE) && opM.precedence(_input.LT(1).getText()) == GROUP)) throw new FailedPredicateException(this, "opM.isOpType(_input.LT(1).getText(), MIDDLE) && opM.precedence(_input.LT(1).getText()) == GROUP");
				setState(651);
				opId();
				setState(652);
				varId();
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

	public static class FieldIdContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(QLGrammarParser.CLASS, 0); }
		public TerminalNode StringLiteral() { return getToken(QLGrammarParser.StringLiteral, 0); }
		public TerminalNode QuoteStringLiteral() { return getToken(QLGrammarParser.QuoteStringLiteral, 0); }
		public FieldIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterFieldId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitFieldId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitFieldId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldIdContext fieldId() throws RecognitionException {
		FieldIdContext _localctx = new FieldIdContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fieldId);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				varId();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(CLASS);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(StringLiteral);
				}
				break;
			case QuoteStringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				match(QuoteStringLiteral);
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

	public static class IndexValueExprContext extends ParserRuleContext {
		public IndexValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexValueExpr; }
	 
		public IndexValueExprContext() { }
		public void copyFrom(IndexValueExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SliceIndexContext extends IndexValueExprContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public TerminalNode COLON() { return getToken(QLGrammarParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceIndexContext(IndexValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterSliceIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitSliceIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitSliceIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleIndexContext extends IndexValueExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleIndexContext(IndexValueExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterSingleIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitSingleIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitSingleIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexValueExprContext indexValueExpr() throws RecognitionException {
		IndexValueExprContext _localctx = new IndexValueExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_indexValueExpr);
		try {
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new SingleIndexContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				expression();
				}
				break;
			case 2:
				_localctx = new SliceIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(663);
					((SliceIndexContext)_localctx).start = expression();
					}
					break;
				}
				setState(666);
				match(COLON);
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(667);
					((SliceIndexContext)_localctx).end = expression();
					}
					break;
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			expression();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(673);
				match(COMMA);
				setState(674);
				expression();
				}
				}
				setState(679);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(QLGrammarParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(QLGrammarParser.FloatingPointLiteral, 0); }
		public TerminalNode IntegerOrFloatingLiteral() { return getToken(QLGrammarParser.IntegerOrFloatingLiteral, 0); }
		public BoolenLiteralContext boolenLiteral() {
			return getRuleContext(BoolenLiteralContext.class,0);
		}
		public TerminalNode QuoteStringLiteral() { return getToken(QLGrammarParser.QuoteStringLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(QLGrammarParser.StringLiteral, 0); }
		public TerminalNode NULL() { return getToken(QLGrammarParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_literal);
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(FloatingPointLiteral);
				}
				break;
			case IntegerOrFloatingLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(IntegerOrFloatingLiteral);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				boolenLiteral();
				}
				break;
			case QuoteStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				match(QuoteStringLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(685);
				match(StringLiteral);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(686);
				match(NULL);
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

	public static class BoolenLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(QLGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(QLGrammarParser.FALSE, 0); }
		public BoolenLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolenLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterBoolenLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitBoolenLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitBoolenLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolenLiteralContext boolenLiteral() throws RecognitionException {
		BoolenLiteralContext _localctx = new BoolenLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_boolenLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class LambdaParametersContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(QLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(QLGrammarParser.RPAREN, 0); }
		public FormalOrInferredParameterListContext formalOrInferredParameterList() {
			return getRuleContext(FormalOrInferredParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_lambdaParameters);
		int _la;
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				varId();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				match(LPAREN);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << BYTE) | (1L << SHORT) | (1L << INT) | (1L << LONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << CHAR) | (1L << BOOL))) != 0) || _la==ID) {
					{
					setState(693);
					formalOrInferredParameterList();
					}
				}

				setState(696);
				match(RPAREN);
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

	public static class FormalOrInferredParameterListContext extends ParserRuleContext {
		public List<FormalOrInferredParameterContext> formalOrInferredParameter() {
			return getRuleContexts(FormalOrInferredParameterContext.class);
		}
		public FormalOrInferredParameterContext formalOrInferredParameter(int i) {
			return getRuleContext(FormalOrInferredParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QLGrammarParser.COMMA, i);
		}
		public FormalOrInferredParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalOrInferredParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterFormalOrInferredParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitFormalOrInferredParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitFormalOrInferredParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalOrInferredParameterListContext formalOrInferredParameterList() throws RecognitionException {
		FormalOrInferredParameterListContext _localctx = new FormalOrInferredParameterListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_formalOrInferredParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			formalOrInferredParameter();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(700);
				match(COMMA);
				setState(701);
				formalOrInferredParameter();
				}
				}
				setState(706);
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

	public static class FormalOrInferredParameterContext extends ParserRuleContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public DeclTypeContext declType() {
			return getRuleContext(DeclTypeContext.class,0);
		}
		public FormalOrInferredParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalOrInferredParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterFormalOrInferredParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitFormalOrInferredParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitFormalOrInferredParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalOrInferredParameterContext formalOrInferredParameter() throws RecognitionException {
		FormalOrInferredParameterContext _localctx = new FormalOrInferredParameterContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_formalOrInferredParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(707);
				declType();
				}
				break;
			}
			setState(710);
			varId();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportClsContext extends ImportDeclarationContext {
		public TerminalNode IMPORT() { return getToken(QLGrammarParser.IMPORT, 0); }
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public List<TerminalNode> DOT() { return getTokens(QLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(QLGrammarParser.DOT, i);
		}
		public ImportClsContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterImportCls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitImportCls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitImportCls(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportPackContext extends ImportDeclarationContext {
		public TerminalNode IMPORT() { return getToken(QLGrammarParser.IMPORT, 0); }
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(QLGrammarParser.SEMI, 0); }
		public List<TerminalNode> DOT() { return getTokens(QLGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(QLGrammarParser.DOT, i);
		}
		public TerminalNode MUL() { return getToken(QLGrammarParser.MUL, 0); }
		public TerminalNode DOTMUL() { return getToken(QLGrammarParser.DOTMUL, 0); }
		public ImportPackContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterImportPack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitImportPack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitImportPack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_importDeclaration);
		int _la;
		try {
			int _alt;
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new ImportClsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(IMPORT);
				setState(713);
				varId();
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(714);
					match(DOT);
					setState(715);
					varId();
					}
					}
					setState(720);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(721);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ImportPackContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(IMPORT);
				setState(724);
				varId();
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(725);
						match(DOT);
						setState(726);
						varId();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				setState(735);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(732);
					match(DOT);
					setState(733);
					match(MUL);
					}
					break;
				case DOTMUL:
					{
					setState(734);
					match(DOTMUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(737);
				match(SEMI);
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

	public static class AssignOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(QLGrammarParser.EQ, 0); }
		public TerminalNode RIGHSHIFT_ASSGIN() { return getToken(QLGrammarParser.RIGHSHIFT_ASSGIN, 0); }
		public TerminalNode URSHIFT_ASSGIN() { return getToken(QLGrammarParser.URSHIFT_ASSGIN, 0); }
		public TerminalNode LSHIFT_ASSGIN() { return getToken(QLGrammarParser.LSHIFT_ASSGIN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(QLGrammarParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(QLGrammarParser.SUB_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(QLGrammarParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(QLGrammarParser.OR_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(QLGrammarParser.MUL_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(QLGrammarParser.MOD_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(QLGrammarParser.DIV_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(QLGrammarParser.XOR_ASSIGN, 0); }
		public AssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOperatorContext assignOperator() throws RecognitionException {
		AssignOperatorContext _localctx = new AssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (EQ - 53)) | (1L << (RIGHSHIFT_ASSGIN - 53)) | (1L << (URSHIFT_ASSGIN - 53)) | (1L << (LSHIFT_ASSGIN - 53)) | (1L << (ADD_ASSIGN - 53)) | (1L << (SUB_ASSIGN - 53)) | (1L << (AND_ASSIGN - 53)) | (1L << (OR_ASSIGN - 53)) | (1L << (MUL_ASSIGN - 53)) | (1L << (MOD_ASSIGN - 53)) | (1L << (DIV_ASSIGN - 53)) | (1L << (XOR_ASSIGN - 53)))) != 0)) ) {
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

	public static class OpIdContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(QLGrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(QLGrammarParser.LT, 0); }
		public TerminalNode GE() { return getToken(QLGrammarParser.GE, 0); }
		public TerminalNode LE() { return getToken(QLGrammarParser.LE, 0); }
		public TerminalNode BANG() { return getToken(QLGrammarParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(QLGrammarParser.TILDE, 0); }
		public TerminalNode ADD() { return getToken(QLGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(QLGrammarParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(QLGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(QLGrammarParser.DIV, 0); }
		public TerminalNode INC() { return getToken(QLGrammarParser.INC, 0); }
		public TerminalNode DEC() { return getToken(QLGrammarParser.DEC, 0); }
		public TerminalNode DOTMUL() { return getToken(QLGrammarParser.DOTMUL, 0); }
		public TerminalNode NOEQ() { return getToken(QLGrammarParser.NOEQ, 0); }
		public TerminalNode RIGHSHIFT() { return getToken(QLGrammarParser.RIGHSHIFT, 0); }
		public TerminalNode URSHIFT() { return getToken(QLGrammarParser.URSHIFT, 0); }
		public TerminalNode LEFTSHIFT() { return getToken(QLGrammarParser.LEFTSHIFT, 0); }
		public TerminalNode BIT_AND() { return getToken(QLGrammarParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(QLGrammarParser.BIT_OR, 0); }
		public TerminalNode MOD() { return getToken(QLGrammarParser.MOD, 0); }
		public TerminalNode CARET() { return getToken(QLGrammarParser.CARET, 0); }
		public AssignOperatorContext assignOperator() {
			return getRuleContext(AssignOperatorContext.class,0);
		}
		public TerminalNode OPID() { return getToken(QLGrammarParser.OPID, 0); }
		public OpIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterOpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitOpId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitOpId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpIdContext opId() throws RecognitionException {
		OpIdContext _localctx = new OpIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_opId);
		try {
			setState(766);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				match(GT);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(744);
				match(LT);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(GE);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 4);
				{
				setState(746);
				match(LE);
				}
				break;
			case BANG:
				enterOuterAlt(_localctx, 5);
				{
				setState(747);
				match(BANG);
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 6);
				{
				setState(748);
				match(TILDE);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 7);
				{
				setState(749);
				match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 8);
				{
				setState(750);
				match(SUB);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 9);
				{
				setState(751);
				match(MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 10);
				{
				setState(752);
				match(DIV);
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 11);
				{
				setState(753);
				match(INC);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 12);
				{
				setState(754);
				match(DEC);
				}
				break;
			case DOTMUL:
				enterOuterAlt(_localctx, 13);
				{
				setState(755);
				match(DOTMUL);
				}
				break;
			case NOEQ:
				enterOuterAlt(_localctx, 14);
				{
				setState(756);
				match(NOEQ);
				}
				break;
			case RIGHSHIFT:
				enterOuterAlt(_localctx, 15);
				{
				setState(757);
				match(RIGHSHIFT);
				}
				break;
			case URSHIFT:
				enterOuterAlt(_localctx, 16);
				{
				setState(758);
				match(URSHIFT);
				}
				break;
			case LEFTSHIFT:
				enterOuterAlt(_localctx, 17);
				{
				setState(759);
				match(LEFTSHIFT);
				}
				break;
			case BIT_AND:
				enterOuterAlt(_localctx, 18);
				{
				setState(760);
				match(BIT_AND);
				}
				break;
			case BIT_OR:
				enterOuterAlt(_localctx, 19);
				{
				setState(761);
				match(BIT_OR);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 20);
				{
				setState(762);
				match(MOD);
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 21);
				{
				setState(763);
				match(CARET);
				}
				break;
			case EQ:
			case RIGHSHIFT_ASSGIN:
			case URSHIFT_ASSGIN:
			case LSHIFT_ASSGIN:
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case MUL_ASSIGN:
			case MOD_ASSIGN:
			case DIV_ASSIGN:
			case XOR_ASSIGN:
				enterOuterAlt(_localctx, 22);
				{
				setState(764);
				assignOperator();
				}
				break;
			case OPID:
				enterOuterAlt(_localctx, 23);
				{
				setState(765);
				match(OPID);
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

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QLGrammarParser.ID, 0); }
		public TerminalNode FUNCTION() { return getToken(QLGrammarParser.FUNCTION, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QLGrammarListener ) ((QLGrammarListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QLGrammarVisitor ) return ((QLGrammarVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_varId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==ID) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return baseExpr_sempred((BaseExprContext)_localctx, predIndex);
		case 30:
			return prefixExpress_sempred((PrefixExpressContext)_localctx, predIndex);
		case 31:
			return suffixExpress_sempred((SuffixExpressContext)_localctx, predIndex);
		case 42:
			return mapValue_sempred((MapValueContext)_localctx, predIndex);
		case 45:
			return pathPart_sempred((PathPartContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean baseExpr_sempred(BaseExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return _input.LT(1).getType() != Token.EOF &&
		        opM.isOpType(_input.LT(1).getText(), MIDDLE) && opM.precedence(_input.LT(1).getText()) >= _localctx.p;
		}
		return true;
	}
	private boolean prefixExpress_sempred(PrefixExpressContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _input.LT(1).getType() != Token.EOF && opM.isOpType(_input.LT(1).getText(), PREFIX);
		}
		return true;
	}
	private boolean suffixExpress_sempred(SuffixExpressContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LT(1).getType() != Token.EOF && opM.isOpType(_input.LT(1).getText(), SUFFIX);
		}
		return true;
	}
	private boolean mapValue_sempred(MapValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return _input.LT(-2).getText().equals("'@class'");
		}
		return true;
	}
	private boolean pathPart_sempred(PathPartContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return opM.isOpType(_input.LT(1).getText(), MIDDLE) && opM.precedence(_input.LT(1).getText()) == GROUP;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u0305\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\2\5\2~\n\2\3\2\3\2\3\3\6\3\u0083\n\3\r\3\16\3\u0084"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u0098\n\4\3\4\3\4\5\4\u009c\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a4\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b0\n\4\3\4\3\4\3\4\5"+
		"\4\u00b5\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00bd\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00c5\n\4\3\4\3\4\3\4\3\4\5\4\u00cb\n\4\5\4\u00cd\n\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d9\n\6\3\7\3\7\3\7\7\7\u00de\n"+
		"\7\f\7\16\7\u00e1\13\7\3\b\3\b\3\b\5\b\u00e6\n\b\3\t\3\t\5\t\u00ea\n\t"+
		"\3\n\3\n\5\n\u00ee\n\n\3\13\3\13\5\13\u00f2\n\13\3\13\5\13\u00f5\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\7\f\u00fc\n\f\f\f\16\f\u00ff\13\f\3\r\3\r\5\r\u0103"+
		"\n\r\3\r\3\r\5\r\u0107\n\r\5\r\u0109\n\r\3\16\3\16\5\16\u010d\n\16\3\17"+
		"\3\17\3\20\3\20\5\20\u0113\n\20\3\20\3\20\3\20\5\20\u0118\n\20\3\21\3"+
		"\21\3\21\3\21\7\21\u011e\n\21\f\21\16\21\u0121\13\21\3\22\3\22\3\22\7"+
		"\22\u0126\n\22\f\22\16\22\u0129\13\22\3\23\3\23\3\23\7\23\u012e\n\23\f"+
		"\23\16\23\u0131\13\23\3\23\5\23\u0134\n\23\3\24\3\24\5\24\u0138\n\24\3"+
		"\24\5\24\u013b\n\24\3\24\5\24\u013e\n\24\3\25\3\25\3\25\7\25\u0143\n\25"+
		"\f\25\16\25\u0146\13\25\3\26\3\26\5\26\u014a\n\26\3\27\3\27\5\27\u014e"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u0154\n\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u015b\n\31\3\32\3\32\7\32\u015f\n\32\f\32\16\32\u0162\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u016a\n\33\3\34\3\34\3\34\7\34\u016f\n\34\f"+
		"\34\16\34\u0172\13\34\3\35\3\35\3\35\3\36\3\36\5\36\u0179\n\36\3\37\5"+
		"\37\u017c\n\37\3\37\3\37\7\37\u0180\n\37\f\37\16\37\u0183\13\37\3\37\5"+
		"\37\u0186\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\7\"\u019c\n\"\f\"\16\"\u019f\13\"\3\"\5\"\u01a2\n\""+
		"\3\"\3\"\5\"\u01a6\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01b7\n\"\3\"\3\"\5\"\u01bb\n\"\3\"\3\"\3\"\3\"\5\"\u01c1"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01ca\n\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u01d4\n\"\3\"\3\"\3\"\5\"\u01d9\n\"\3\"\3\"\5\"\u01dd\n\""+
		"\3\"\5\"\u01e0\n\"\3\"\5\"\u01e3\n\"\3#\3#\5#\u01e7\n#\3#\3#\5#\u01eb"+
		"\n#\3$\3$\3$\7$\u01f0\n$\f$\16$\u01f3\13$\3%\3%\3%\3%\3%\3%\3%\7%\u01fc"+
		"\n%\f%\16%\u01ff\13%\3&\3&\7&\u0203\n&\f&\16&\u0206\13&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u020e\n\'\3\'\3\'\3(\3(\3(\7(\u0215\n(\f(\16(\u0218\13"+
		"(\5(\u021a\n(\3(\3(\3)\3)\3)\5)\u0221\n)\3)\3)\3*\3*\3*\3*\7*\u0229\n"+
		"*\f*\16*\u022c\13*\3*\5*\u022f\n*\5*\u0231\n*\3+\3+\3+\3+\3,\3,\3,\5,"+
		"\u023a\n,\3-\3-\3-\5-\u023f\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0261\n."+
		"\3/\3/\3/\3/\5/\u0267\n/\3/\3/\3/\3/\3/\3/\5/\u026f\n/\3/\3/\3/\3/\3/"+
		"\3/\5/\u0277\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0285\n/\3/\3/"+
		"\3/\5/\u028a\n/\3/\3/\3/\3/\3/\5/\u0291\n/\3\60\3\60\3\60\3\60\5\60\u0297"+
		"\n\60\3\61\3\61\5\61\u029b\n\61\3\61\3\61\5\61\u029f\n\61\5\61\u02a1\n"+
		"\61\3\62\3\62\3\62\7\62\u02a6\n\62\f\62\16\62\u02a9\13\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u02b2\n\63\3\64\3\64\3\65\3\65\3\65\5\65"+
		"\u02b9\n\65\3\65\5\65\u02bc\n\65\3\66\3\66\3\66\7\66\u02c1\n\66\f\66\16"+
		"\66\u02c4\13\66\3\67\5\67\u02c7\n\67\3\67\3\67\38\38\38\38\78\u02cf\n"+
		"8\f8\168\u02d2\138\38\38\38\38\38\38\78\u02da\n8\f8\168\u02dd\138\38\3"+
		"8\38\58\u02e2\n8\38\38\58\u02e6\n8\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0301\n:\3;\3;\3;\2\2<\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprt\2\t\3\2\7\b\3\2\17\26\5\2\65\65::>>\3\2\"#\3\2\30"+
		"\31\7\2\67\6799==??EL\4\2\n\n\\\\\2\u0381\2y\3\2\2\2\4\u0082\3\2\2\2\6"+
		"\u00cc\3\2\2\2\b\u00ce\3\2\2\2\n\u00d8\3\2\2\2\f\u00da\3\2\2\2\16\u00e2"+
		"\3\2\2\2\20\u00e7\3\2\2\2\22\u00ed\3\2\2\2\24\u00ef\3\2\2\2\26\u00f8\3"+
		"\2\2\2\30\u0108\3\2\2\2\32\u010c\3\2\2\2\34\u010e\3\2\2\2\36\u0117\3\2"+
		"\2\2 \u0119\3\2\2\2\"\u0122\3\2\2\2$\u012a\3\2\2\2&\u013d\3\2\2\2(\u013f"+
		"\3\2\2\2*\u0149\3\2\2\2,\u014b\3\2\2\2.\u0153\3\2\2\2\60\u015a\3\2\2\2"+
		"\62\u015c\3\2\2\2\64\u0163\3\2\2\2\66\u016b\3\2\2\28\u0173\3\2\2\2:\u0178"+
		"\3\2\2\2<\u017b\3\2\2\2>\u0187\3\2\2\2@\u018a\3\2\2\2B\u01e2\3\2\2\2D"+
		"\u01ea\3\2\2\2F\u01ec\3\2\2\2H\u01f4\3\2\2\2J\u0200\3\2\2\2L\u0207\3\2"+
		"\2\2N\u0219\3\2\2\2P\u021d\3\2\2\2R\u0230\3\2\2\2T\u0232\3\2\2\2V\u0239"+
		"\3\2\2\2X\u023e\3\2\2\2Z\u0260\3\2\2\2\\\u0290\3\2\2\2^\u0296\3\2\2\2"+
		"`\u02a0\3\2\2\2b\u02a2\3\2\2\2d\u02b1\3\2\2\2f\u02b3\3\2\2\2h\u02bb\3"+
		"\2\2\2j\u02bd\3\2\2\2l\u02c6\3\2\2\2n\u02e5\3\2\2\2p\u02e7\3\2\2\2r\u0300"+
		"\3\2\2\2t\u0302\3\2\2\2vx\5n8\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2|~\5\4\3\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\7\2\2\3\u0080\3\3\2\2\2\u0081\u0083\5\6\4\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\5\3"+
		"\2\2\2\u0086\u0087\5\b\5\2\u0087\u0088\7\60\2\2\u0088\u00cd\3\2\2\2\u0089"+
		"\u008a\7\37\2\2\u008a\u008b\5\60\31\2\u008b\u008c\7\60\2\2\u008c\u00cd"+
		"\3\2\2\2\u008d\u008e\7\6\2\2\u008e\u008f\7(\2\2\u008f\u0090\5\60\31\2"+
		"\u0090\u0091\7)\2\2\u0091\u0092\5\6\4\2\u0092\u00cd\3\2\2\2\u0093\u0094"+
		"\7\3\2\2\u0094\u0095\7(\2\2\u0095\u0097\5\n\6\2\u0096\u0098\5\60\31\2"+
		"\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\7\60\2\2\u009a\u009c\5\60\31\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009e\7)\2\2\u009e\u009f\5\6\4\2\u009f\u00cd"+
		"\3\2\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a3\7(\2\2\u00a2\u00a4\5\30\r\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5t"+
		";\2\u00a6\u00a7\7\63\2\2\u00a7\u00a8\5\60\31\2\u00a8\u00a9\7)\2\2\u00a9"+
		"\u00aa\5\6\4\2\u00aa\u00cd\3\2\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\5t"+
		";\2\u00ad\u00af\7(\2\2\u00ae\u00b0\5j\66\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b4\7*\2\2\u00b3"+
		"\u00b5\5\4\3\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\7+\2\2\u00b7\u00cd\3\2\2\2\u00b8\u00b9\7\13\2\2\u00b9"+
		"\u00ba\5t;\2\u00ba\u00bc\7*\2\2\u00bb\u00bd\5\4\3\2\u00bc\u00bb\3\2\2"+
		"\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7+\2\2\u00bf\u00cd"+
		"\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1\u00cd\7\60\2\2\u00c2\u00c4\7\t\2\2"+
		"\u00c3\u00c5\5\60\31\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00cd\7\60\2\2\u00c7\u00cd\7\60\2\2\u00c8\u00ca\5\60\31"+
		"\2\u00c9\u00cb\7\60\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u0086\3\2\2\2\u00cc\u0089\3\2\2\2\u00cc\u008d\3\2"+
		"\2\2\u00cc\u0093\3\2\2\2\u00cc\u00a0\3\2\2\2\u00cc\u00ab\3\2\2\2\u00cc"+
		"\u00b8\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c7\3\2"+
		"\2\2\u00cc\u00c8\3\2\2\2\u00cd\7\3\2\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0"+
		"\5\f\7\2\u00d0\t\3\2\2\2\u00d1\u00d2\5\b\5\2\u00d2\u00d3\7\60\2\2\u00d3"+
		"\u00d9\3\2\2\2\u00d4\u00d5\5\60\31\2\u00d5\u00d6\7\60\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d9\7\60\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d4\3\2\2\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9\13\3\2\2\2\u00da\u00df\5\16\b\2\u00db\u00dc"+
		"\7\61\2\2\u00dc\u00de\5\16\b\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\r\3\2\2\2\u00e1\u00df\3"+
		"\2\2\2\u00e2\u00e5\5\20\t\2\u00e3\u00e4\7\67\2\2\u00e4\u00e6\5\22\n\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\17\3\2\2\2\u00e7\u00e9"+
		"\5t;\2\u00e8\u00ea\5 \21\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\21\3\2\2\2\u00eb\u00ee\5\60\31\2\u00ec\u00ee\5\24\13\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\23\3\2\2\2\u00ef\u00f1\7*\2\2\u00f0\u00f2"+
		"\5\26\f\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2"+
		"\u00f3\u00f5\7\61\2\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f7\7+\2\2\u00f7\25\3\2\2\2\u00f8\u00fd\5\22\n\2\u00f9"+
		"\u00fa\7\61\2\2\u00fa\u00fc\5\22\n\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\27\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0102\5\34\17\2\u0101\u0103\5 \21\2\u0102\u0101\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0109\3\2\2\2\u0104\u0106\5$\23\2\u0105"+
		"\u0107\5 \21\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u0100\3\2\2\2\u0108\u0104\3\2\2\2\u0109\31\3\2\2\2\u010a\u010d"+
		"\5\34\17\2\u010b\u010d\5$\23\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2"+
		"\u010d\33\3\2\2\2\u010e\u010f\t\3\2\2\u010f\35\3\2\2\2\u0110\u0112\5$"+
		"\23\2\u0111\u0113\5 \21\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0118\3\2\2\2\u0114\u0115\5\34\17\2\u0115\u0116\5 \21\2\u0116\u0118\3"+
		"\2\2\2\u0117\u0110\3\2\2\2\u0117\u0114\3\2\2\2\u0118\37\3\2\2\2\u0119"+
		"\u011a\7,\2\2\u011a\u011f\7-\2\2\u011b\u011c\7,\2\2\u011c\u011e\7-\2\2"+
		"\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120!\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\5t;\2\u0123\u0124"+
		"\7.\2\2\u0124\u0126\5t;\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128#\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012f\5t;\2\u012b\u012c\7.\2\2\u012c\u012e\5t;\2\u012d\u012b\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\5&\24\2\u0133\u0132\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134%\3\2\2\2\u0135\u0137\7\66\2\2\u0136\u0138"+
		"\5(\25\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u013b\t\4\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013e\78\2\2\u013d\u0135\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\'\3\2\2\2\u013f\u0144\5*\26\2\u0140\u0141\7\61\2\2\u0141\u0143\5*\26"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145)\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014a\5\36\20\2\u0148"+
		"\u014a\5,\27\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a+\3\2\2\2"+
		"\u014b\u014d\7\62\2\2\u014c\u014e\5.\30\2\u014d\u014c\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e-\3\2\2\2\u014f\u0150\7\32\2\2\u0150\u0154\5\36\20\2\u0151"+
		"\u0152\7\33\2\2\u0152\u0154\5\36\20\2\u0153\u014f\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0154/\3\2\2\2\u0155\u0156\5\62\32\2\u0156\u0157\5p9\2\u0157"+
		"\u0158\5\60\31\2\u0158\u015b\3\2\2\2\u0159\u015b\5\64\33\2\u015a\u0155"+
		"\3\2\2\2\u015a\u0159\3\2\2\2\u015b\61\3\2\2\2\u015c\u0160\5t;\2\u015d"+
		"\u015f\5\\/\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\63\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0169"+
		"\5\66\34\2\u0164\u0165\7\62\2\2\u0165\u0166\5\66\34\2\u0166\u0167\7\63"+
		"\2\2\u0167\u0168\5\60\31\2\u0168\u016a\3\2\2\2\u0169\u0164\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\65\3\2\2\2\u016b\u0170\5<\37\2\u016c\u016d\6\34\2"+
		"\3\u016d\u016f\58\35\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\67\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\5:\36\2\u0174\u0175\5\66\34\2\u01759\3\2\2\2\u0176\u0179\5r:\2"+
		"\u0177\u0179\5t;\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179;\3\2"+
		"\2\2\u017a\u017c\5> \2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u0181\5B\"\2\u017e\u0180\5\\/\2\u017f\u017e\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0184\u0186\5@!\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186=\3\2\2\2\u0187\u0188\6 \3\2\u0188\u0189\5r:\2\u0189?\3"+
		"\2\2\2\u018a\u018b\6!\4\2\u018b\u018c\5r:\2\u018cA\3\2\2\2\u018d\u01e3"+
		"\5d\63\2\u018e\u018f\7(\2\2\u018f\u0190\5\30\r\2\u0190\u0191\7)\2\2\u0191"+
		"\u0192\5<\37\2\u0192\u01e3\3\2\2\2\u0193\u0194\7(\2\2\u0194\u0195\5\60"+
		"\31\2\u0195\u0196\7)\2\2\u0196\u01e3\3\2\2\2\u0197\u0198\7\16\2\2\u0198"+
		"\u019d\5t;\2\u0199\u019a\7.\2\2\u019a\u019c\5t;\2\u019b\u0199\3\2\2\2"+
		"\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a1"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\5&\24\2\u01a1\u01a0\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\7(\2\2\u01a4\u01a6\5b\62"+
		"\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8"+
		"\7)\2\2\u01a8\u01e3\3\2\2\2\u01a9\u01aa\7\16\2\2\u01aa\u01ab\5\32\16\2"+
		"\u01ab\u01ac\5H%\2\u01ac\u01e3\3\2\2\2\u01ad\u01ae\7\16\2\2\u01ae\u01af"+
		"\5\32\16\2\u01af\u01b0\5 \21\2\u01b0\u01b1\5\24\13\2\u01b1\u01e3\3\2\2"+
		"\2\u01b2\u01b3\5h\65\2\u01b3\u01ba\7/\2\2\u01b4\u01b6\7*\2\2\u01b5\u01b7"+
		"\5\4\3\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01bb\7+\2\2\u01b9\u01bb\5\60\31\2\u01ba\u01b4\3\2\2\2\u01ba\u01b9\3"+
		"\2\2\2\u01bb\u01e3\3\2\2\2\u01bc\u01e3\5t;\2\u01bd\u01e3\5\34\17\2\u01be"+
		"\u01c0\7,\2\2\u01bf\u01c1\5F$\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2"+
		"\2\u01c1\u01c2\3\2\2\2\u01c2\u01e3\7-\2\2\u01c3\u01c4\7*\2\2\u01c4\u01c5"+
		"\5R*\2\u01c5\u01c6\7+\2\2\u01c6\u01e3\3\2\2\2\u01c7\u01c9\7*\2\2\u01c8"+
		"\u01ca\5\4\3\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01e3\7+\2\2\u01cc\u01cd\7\4\2\2\u01cd\u01ce\7(\2\2\u01ce\u01cf"+
		"\5\60\31\2\u01cf\u01d0\7)\2\2\u01d0\u01d3\5D#\2\u01d1\u01d2\7\5\2\2\u01d2"+
		"\u01d4\5D#\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01e3\3\2\2"+
		"\2\u01d5\u01d6\7\34\2\2\u01d6\u01d8\7*\2\2\u01d7\u01d9\5\4\3\2\u01d8\u01d7"+
		"\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\7+\2\2\u01db"+
		"\u01dd\5J&\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2"+
		"\2\u01de\u01e0\5P)\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01e3\7\'\2\2\u01e2\u018d\3\2\2\2\u01e2\u018e\3\2\2\2\u01e2"+
		"\u0193\3\2\2\2\u01e2\u0197\3\2\2\2\u01e2\u01a9\3\2\2\2\u01e2\u01ad\3\2"+
		"\2\2\u01e2\u01b2\3\2\2\2\u01e2\u01bc\3\2\2\2\u01e2\u01bd\3\2\2\2\u01e2"+
		"\u01be\3\2\2\2\u01e2\u01c3\3\2\2\2\u01e2\u01c7\3\2\2\2\u01e2\u01cc\3\2"+
		"\2\2\u01e2\u01d5\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3C\3\2\2\2\u01e4\u01e6"+
		"\7*\2\2\u01e5\u01e7\5\4\3\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01eb\7+\2\2\u01e9\u01eb\5\6\4\2\u01ea\u01e4\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01ebE\3\2\2\2\u01ec\u01f1\5\60\31\2\u01ed\u01ee"+
		"\7\61\2\2\u01ee\u01f0\5\60\31\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2"+
		"\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2G\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f4\u01f5\7,\2\2\u01f5\u01f6\5\60\31\2\u01f6\u01fd\7-\2\2\u01f7"+
		"\u01f8\7,\2\2\u01f8\u01f9\5\60\31\2\u01f9\u01fa\7-\2\2\u01fa\u01fc\3\2"+
		"\2\2\u01fb\u01f7\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01feI\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0204\5L\'\2\u0201"+
		"\u0203\5L\'\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205K\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208"+
		"\7\35\2\2\u0208\u0209\7(\2\2\u0209\u020a\5N(\2\u020a\u020b\7)\2\2\u020b"+
		"\u020d\7*\2\2\u020c\u020e\5\4\3\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7+\2\2\u0210M\3\2\2\2\u0211\u0216"+
		"\5\30\r\2\u0212\u0213\7T\2\2\u0213\u0215\5\30\r\2\u0214\u0212\3\2\2\2"+
		"\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u0211\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\5t;\2\u021cO\3\2\2\2\u021d\u021e\7\36\2\2\u021e"+
		"\u0220\7*\2\2\u021f\u0221\5\4\3\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7+\2\2\u0223Q\3\2\2\2\u0224\u0231"+
		"\7\63\2\2\u0225\u022a\5T+\2\u0226\u0227\7\61\2\2\u0227\u0229\5T+\2\u0228"+
		"\u0226\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022f\7\61\2\2\u022e"+
		"\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u0224\3\2"+
		"\2\2\u0230\u0225\3\2\2\2\u0231S\3\2\2\2\u0232\u0233\5X-\2\u0233\u0234"+
		"\7\63\2\2\u0234\u0235\5V,\2\u0235U\3\2\2\2\u0236\u0237\6,\5\2\u0237\u023a"+
		"\t\5\2\2\u0238\u023a\5\60\31\2\u0239\u0236\3\2\2\2\u0239\u0238\3\2\2\2"+
		"\u023aW\3\2\2\2\u023b\u023f\5Z.\2\u023c\u023f\7#\2\2\u023d\u023f\7\"\2"+
		"\2\u023e\u023b\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023fY"+
		"\3\2\2\2\u0240\u0261\5t;\2\u0241\u0261\7\3\2\2\u0242\u0261\7\4\2\2\u0243"+
		"\u0261\7\5\2\2\u0244\u0261\7\6\2\2\u0245\u0261\7\7\2\2\u0246\u0261\7\b"+
		"\2\2\u0247\u0261\7\t\2\2\u0248\u0261\7\n\2\2\u0249\u0261\7\13\2\2\u024a"+
		"\u0261\7\f\2\2\u024b\u0261\7\r\2\2\u024c\u0261\7\16\2\2\u024d\u0261\7"+
		"\17\2\2\u024e\u0261\7\20\2\2\u024f\u0261\7\21\2\2\u0250\u0261\7\22\2\2"+
		"\u0251\u0261\7\23\2\2\u0252\u0261\7\24\2\2\u0253\u0261\7\25\2\2\u0254"+
		"\u0261\7\26\2\2\u0255\u0261\7\27\2\2\u0256\u0261\7\30\2\2\u0257\u0261"+
		"\7\31\2\2\u0258\u0261\7\32\2\2\u0259\u0261\7\33\2\2\u025a\u0261\7\34\2"+
		"\2\u025b\u0261\7\35\2\2\u025c\u0261\7\36\2\2\u025d\u0261\7\37\2\2\u025e"+
		"\u0261\7 \2\2\u025f\u0261\7!\2\2\u0260\u0240\3\2\2\2\u0260\u0241\3\2\2"+
		"\2\u0260\u0242\3\2\2\2\u0260\u0243\3\2\2\2\u0260\u0244\3\2\2\2\u0260\u0245"+
		"\3\2\2\2\u0260\u0246\3\2\2\2\u0260\u0247\3\2\2\2\u0260\u0248\3\2\2\2\u0260"+
		"\u0249\3\2\2\2\u0260\u024a\3\2\2\2\u0260\u024b\3\2\2\2\u0260\u024c\3\2"+
		"\2\2\u0260\u024d\3\2\2\2\u0260\u024e\3\2\2\2\u0260\u024f\3\2\2\2\u0260"+
		"\u0250\3\2\2\2\u0260\u0251\3\2\2\2\u0260\u0252\3\2\2\2\u0260\u0253\3\2"+
		"\2\2\u0260\u0254\3\2\2\2\u0260\u0255\3\2\2\2\u0260\u0256\3\2\2\2\u0260"+
		"\u0257\3\2\2\2\u0260\u0258\3\2\2\2\u0260\u0259\3\2\2\2\u0260\u025a\3\2"+
		"\2\2\u0260\u025b\3\2\2\2\u0260\u025c\3\2\2\2\u0260\u025d\3\2\2\2\u0260"+
		"\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261[\3\2\2\2\u0262\u0263\7.\2\2\u0263"+
		"\u0264\5t;\2\u0264\u0266\7(\2\2\u0265\u0267\5b\62\2\u0266\u0265\3\2\2"+
		"\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7)\2\2\u0269\u0291"+
		"\3\2\2\2\u026a\u026b\7;\2\2\u026b\u026c\5t;\2\u026c\u026e\7(\2\2\u026d"+
		"\u026f\5b\62\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2"+
		"\2\2\u0270\u0271\7)\2\2\u0271\u0291\3\2\2\2\u0272\u0273\7<\2\2\u0273\u0274"+
		"\5t;\2\u0274\u0276\7(\2\2\u0275\u0277\5b\62\2\u0276\u0275\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\7)\2\2\u0279\u0291\3\2"+
		"\2\2\u027a\u027b\7.\2\2\u027b\u0291\5^\60\2\u027c\u027d\7;\2\2\u027d\u0291"+
		"\5^\60\2\u027e\u027f\7<\2\2\u027f\u0291\5^\60\2\u0280\u0281\7\64\2\2\u0281"+
		"\u0291\5t;\2\u0282\u0284\7(\2\2\u0283\u0285\5b\62\2\u0284\u0283\3\2\2"+
		"\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0291\7)\2\2\u0287\u0289"+
		"\7,\2\2\u0288\u028a\5`\61\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u0291\7-\2\2\u028c\u028d\6/\6\2\u028d\u028e\5r:\2"+
		"\u028e\u028f\5t;\2\u028f\u0291\3\2\2\2\u0290\u0262\3\2\2\2\u0290\u026a"+
		"\3\2\2\2\u0290\u0272\3\2\2\2\u0290\u027a\3\2\2\2\u0290\u027c\3\2\2\2\u0290"+
		"\u027e\3\2\2\2\u0290\u0280\3\2\2\2\u0290\u0282\3\2\2\2\u0290\u0287\3\2"+
		"\2\2\u0290\u028c\3\2\2\2\u0291]\3\2\2\2\u0292\u0297\5t;\2\u0293\u0297"+
		"\7 \2\2\u0294\u0297\7#\2\2\u0295\u0297\7\"\2\2\u0296\u0292\3\2\2\2\u0296"+
		"\u0293\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297_\3\2\2\2"+
		"\u0298\u02a1\5\60\31\2\u0299\u029b\5\60\31\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\7\63\2\2\u029d\u029f\5"+
		"\60\31\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u0298\3\2\2\2\u02a0\u029a\3\2\2\2\u02a1a\3\2\2\2\u02a2\u02a7\5\60\31"+
		"\2\u02a3\u02a4\7\61\2\2\u02a4\u02a6\5\60\31\2\u02a5\u02a3\3\2\2\2\u02a6"+
		"\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8c\3\2\2\2"+
		"\u02a9\u02a7\3\2\2\2\u02aa\u02b2\7$\2\2\u02ab\u02b2\7%\2\2\u02ac\u02b2"+
		"\7&\2\2\u02ad\u02b2\5f\64\2\u02ae\u02b2\7\"\2\2\u02af\u02b2\7#\2\2\u02b0"+
		"\u02b2\7\27\2\2\u02b1\u02aa\3\2\2\2\u02b1\u02ab\3\2\2\2\u02b1\u02ac\3"+
		"\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b2e\3\2\2\2\u02b3\u02b4\t\6\2\2\u02b4g\3\2\2\2\u02b5"+
		"\u02bc\5t;\2\u02b6\u02b8\7(\2\2\u02b7\u02b9\5j\66\2\u02b8\u02b7\3\2\2"+
		"\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\7)\2\2\u02bb\u02b5"+
		"\3\2\2\2\u02bb\u02b6\3\2\2\2\u02bci\3\2\2\2\u02bd\u02c2\5l\67\2\u02be"+
		"\u02bf\7\61\2\2\u02bf\u02c1\5l\67\2\u02c0\u02be\3\2\2\2\u02c1\u02c4\3"+
		"\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3k\3\2\2\2\u02c4\u02c2"+
		"\3\2\2\2\u02c5\u02c7\5\30\r\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2"+
		"\u02c7\u02c8\3\2\2\2\u02c8\u02c9\5t;\2\u02c9m\3\2\2\2\u02ca\u02cb\7\f"+
		"\2\2\u02cb\u02d0\5t;\2\u02cc\u02cd\7.\2\2\u02cd\u02cf\5t;\2\u02ce\u02cc"+
		"\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02d3\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7\60\2\2\u02d4\u02e6\3"+
		"\2\2\2\u02d5\u02d6\7\f\2\2\u02d6\u02db\5t;\2\u02d7\u02d8\7.\2\2\u02d8"+
		"\u02da\5t;\2\u02d9\u02d7\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2\2"+
		"\2\u02db\u02dc\3\2\2\2\u02dc\u02e1\3\2\2\2\u02dd\u02db\3\2\2\2\u02de\u02df"+
		"\7.\2\2\u02df\u02e2\7Q\2\2\u02e0\u02e2\7C\2\2\u02e1\u02de\3\2\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7\60\2\2\u02e4\u02e6\3"+
		"\2\2\2\u02e5\u02ca\3\2\2\2\u02e5\u02d5\3\2\2\2\u02e6o\3\2\2\2\u02e7\u02e8"+
		"\t\7\2\2\u02e8q\3\2\2\2\u02e9\u0301\7\65\2\2\u02ea\u0301\7\66\2\2\u02eb"+
		"\u0301\7A\2\2\u02ec\u0301\7B\2\2\u02ed\u0301\7M\2\2\u02ee\u0301\7N\2\2"+
		"\u02ef\u0301\7O\2\2\u02f0\u0301\7P\2\2\u02f1\u0301\7Q\2\2\u02f2\u0301"+
		"\7R\2\2\u02f3\u0301\7V\2\2\u02f4\u0301\7W\2\2\u02f5\u0301\7C\2\2\u02f6"+
		"\u0301\78\2\2\u02f7\u0301\7:\2\2\u02f8\u0301\7>\2\2\u02f9\u0301\7@\2\2"+
		"\u02fa\u0301\7S\2\2\u02fb\u0301\7T\2\2\u02fc\u0301\7U\2\2\u02fd\u0301"+
		"\7D\2\2\u02fe\u0301\5p9\2\u02ff\u0301\7[\2\2\u0300\u02e9\3\2\2\2\u0300"+
		"\u02ea\3\2\2\2\u0300\u02eb\3\2\2\2\u0300\u02ec\3\2\2\2\u0300\u02ed\3\2"+
		"\2\2\u0300\u02ee\3\2\2\2\u0300\u02ef\3\2\2\2\u0300\u02f0\3\2\2\2\u0300"+
		"\u02f1\3\2\2\2\u0300\u02f2\3\2\2\2\u0300\u02f3\3\2\2\2\u0300\u02f4\3\2"+
		"\2\2\u0300\u02f5\3\2\2\2\u0300\u02f6\3\2\2\2\u0300\u02f7\3\2\2\2\u0300"+
		"\u02f8\3\2\2\2\u0300\u02f9\3\2\2\2\u0300\u02fa\3\2\2\2\u0300\u02fb\3\2"+
		"\2\2\u0300\u02fc\3\2\2\2\u0300\u02fd\3\2\2\2\u0300\u02fe\3\2\2\2\u0300"+
		"\u02ff\3\2\2\2\u0301s\3\2\2\2\u0302\u0303\t\b\2\2\u0303u\3\2\2\2_y}\u0084"+
		"\u0097\u009b\u00a3\u00af\u00b4\u00bc\u00c4\u00ca\u00cc\u00d8\u00df\u00e5"+
		"\u00e9\u00ed\u00f1\u00f4\u00fd\u0102\u0106\u0108\u010c\u0112\u0117\u011f"+
		"\u0127\u012f\u0133\u0137\u013a\u013d\u0144\u0149\u014d\u0153\u015a\u0160"+
		"\u0169\u0170\u0178\u017b\u0181\u0185\u019d\u01a1\u01a5\u01b6\u01ba\u01c0"+
		"\u01c9\u01d3\u01d8\u01dc\u01df\u01e2\u01e6\u01ea\u01f1\u01fd\u0204\u020d"+
		"\u0216\u0219\u0220\u022a\u022e\u0230\u0239\u023e\u0260\u0266\u026e\u0276"+
		"\u0284\u0289\u0290\u0296\u029a\u029e\u02a0\u02a7\u02b1\u02b8\u02bb\u02c2"+
		"\u02c6\u02d0\u02db\u02e1\u02e5\u0300";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}