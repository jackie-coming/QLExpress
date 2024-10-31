// Generated from QLGrammar.g4 by ANTLR 4.9.3

    import static com.alibaba.qlexpress4.aparser.ParserOperatorManager.OpType.*;
    import static com.alibaba.qlexpress4.QLPrecedences.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QLGrammarParser}.
 */
public interface QLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QLGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QLGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(QLGrammarParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(QLGrammarParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localVariableDeclarationStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(QLGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localVariableDeclarationStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(QLGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(QLGrammarParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(QLGrammarParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(QLGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(QLGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code traditionalForStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterTraditionalForStatement(QLGrammarParser.TraditionalForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code traditionalForStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitTraditionalForStatement(QLGrammarParser.TraditionalForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(QLGrammarParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(QLGrammarParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(QLGrammarParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(QLGrammarParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code macroStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterMacroStatement(QLGrammarParser.MacroStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code macroStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitMacroStatement(QLGrammarParser.MacroStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakContinueStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakContinueStatement(QLGrammarParser.BreakContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakContinueStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakContinueStatement(QLGrammarParser.BreakContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(QLGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(QLGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(QLGrammarParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(QLGrammarParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(QLGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(QLGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(QLGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(QLGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(QLGrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(QLGrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(QLGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(QLGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(QLGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(QLGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(QLGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(QLGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(QLGrammarParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(QLGrammarParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(QLGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(QLGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(QLGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(QLGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#declType}.
	 * @param ctx the parse tree
	 */
	void enterDeclType(QLGrammarParser.DeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#declType}.
	 * @param ctx the parse tree
	 */
	void exitDeclType(QLGrammarParser.DeclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#declTypeNoArr}.
	 * @param ctx the parse tree
	 */
	void enterDeclTypeNoArr(QLGrammarParser.DeclTypeNoArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#declTypeNoArr}.
	 * @param ctx the parse tree
	 */
	void exitDeclTypeNoArr(QLGrammarParser.DeclTypeNoArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(QLGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(QLGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(QLGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(QLGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(QLGrammarParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(QLGrammarParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#clsTypeNoTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterClsTypeNoTypeArguments(QLGrammarParser.ClsTypeNoTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#clsTypeNoTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitClsTypeNoTypeArguments(QLGrammarParser.ClsTypeNoTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#clsType}.
	 * @param ctx the parse tree
	 */
	void enterClsType(QLGrammarParser.ClsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#clsType}.
	 * @param ctx the parse tree
	 */
	void exitClsType(QLGrammarParser.ClsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(QLGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(QLGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(QLGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(QLGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(QLGrammarParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(QLGrammarParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(QLGrammarParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(QLGrammarParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(QLGrammarParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(QLGrammarParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QLGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QLGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(QLGrammarParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(QLGrammarParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpr(QLGrammarParser.TernaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#ternaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpr(QLGrammarParser.TernaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(QLGrammarParser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(QLGrammarParser.BaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#leftAsso}.
	 * @param ctx the parse tree
	 */
	void enterLeftAsso(QLGrammarParser.LeftAssoContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#leftAsso}.
	 * @param ctx the parse tree
	 */
	void exitLeftAsso(QLGrammarParser.LeftAssoContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#binaryop}.
	 * @param ctx the parse tree
	 */
	void enterBinaryop(QLGrammarParser.BinaryopContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#binaryop}.
	 * @param ctx the parse tree
	 */
	void exitBinaryop(QLGrammarParser.BinaryopContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(QLGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(QLGrammarParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#prefixExpress}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpress(QLGrammarParser.PrefixExpressContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#prefixExpress}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpress(QLGrammarParser.PrefixExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#suffixExpress}.
	 * @param ctx the parse tree
	 */
	void enterSuffixExpress(QLGrammarParser.SuffixExpressContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#suffixExpress}.
	 * @param ctx the parse tree
	 */
	void exitSuffixExpress(QLGrammarParser.SuffixExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(QLGrammarParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(QLGrammarParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(QLGrammarParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(QLGrammarParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterGroupExpr(QLGrammarParser.GroupExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitGroupExpr(QLGrammarParser.GroupExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newObjExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterNewObjExpr(QLGrammarParser.NewObjExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newObjExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitNewObjExpr(QLGrammarParser.NewObjExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newEmptyArrExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterNewEmptyArrExpr(QLGrammarParser.NewEmptyArrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newEmptyArrExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitNewEmptyArrExpr(QLGrammarParser.NewEmptyArrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newInitArrExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterNewInitArrExpr(QLGrammarParser.NewInitArrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newInitArrExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitNewInitArrExpr(QLGrammarParser.NewInitArrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(QLGrammarParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(QLGrammarParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIdExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterVarIdExpr(QLGrammarParser.VarIdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIdExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitVarIdExpr(QLGrammarParser.VarIdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(QLGrammarParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(QLGrammarParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(QLGrammarParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(QLGrammarParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterMapExpr(QLGrammarParser.MapExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitMapExpr(QLGrammarParser.MapExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(QLGrammarParser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(QLGrammarParser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(QLGrammarParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(QLGrammarParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tryCatchExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchExpr(QLGrammarParser.TryCatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tryCatchExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchExpr(QLGrammarParser.TryCatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code contextSelectExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void enterContextSelectExpr(QLGrammarParser.ContextSelectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code contextSelectExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 */
	void exitContextSelectExpr(QLGrammarParser.ContextSelectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(QLGrammarParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(QLGrammarParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#listItems}.
	 * @param ctx the parse tree
	 */
	void enterListItems(QLGrammarParser.ListItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#listItems}.
	 * @param ctx the parse tree
	 */
	void exitListItems(QLGrammarParser.ListItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(QLGrammarParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(QLGrammarParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#tryCatches}.
	 * @param ctx the parse tree
	 */
	void enterTryCatches(QLGrammarParser.TryCatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#tryCatches}.
	 * @param ctx the parse tree
	 */
	void exitTryCatches(QLGrammarParser.TryCatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(QLGrammarParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(QLGrammarParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#catchParams}.
	 * @param ctx the parse tree
	 */
	void enterCatchParams(QLGrammarParser.CatchParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#catchParams}.
	 * @param ctx the parse tree
	 */
	void exitCatchParams(QLGrammarParser.CatchParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#tryFinally}.
	 * @param ctx the parse tree
	 */
	void enterTryFinally(QLGrammarParser.TryFinallyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#tryFinally}.
	 * @param ctx the parse tree
	 */
	void exitTryFinally(QLGrammarParser.TryFinallyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#mapEntries}.
	 * @param ctx the parse tree
	 */
	void enterMapEntries(QLGrammarParser.MapEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#mapEntries}.
	 * @param ctx the parse tree
	 */
	void exitMapEntries(QLGrammarParser.MapEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void enterMapEntry(QLGrammarParser.MapEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#mapEntry}.
	 * @param ctx the parse tree
	 */
	void exitMapEntry(QLGrammarParser.MapEntryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clsValue}
	 * labeled alternative in {@link QLGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void enterClsValue(QLGrammarParser.ClsValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clsValue}
	 * labeled alternative in {@link QLGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void exitClsValue(QLGrammarParser.ClsValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eValue}
	 * labeled alternative in {@link QLGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void enterEValue(QLGrammarParser.EValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eValue}
	 * labeled alternative in {@link QLGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 */
	void exitEValue(QLGrammarParser.EValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void enterIdKey(QLGrammarParser.IdKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void exitIdKey(QLGrammarParser.IdKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void enterStringKey(QLGrammarParser.StringKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void exitStringKey(QLGrammarParser.StringKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quoteStringKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void enterQuoteStringKey(QLGrammarParser.QuoteStringKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quoteStringKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 */
	void exitQuoteStringKey(QLGrammarParser.QuoteStringKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#idMapKey}.
	 * @param ctx the parse tree
	 */
	void enterIdMapKey(QLGrammarParser.IdMapKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#idMapKey}.
	 * @param ctx the parse tree
	 */
	void exitIdMapKey(QLGrammarParser.IdMapKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvoke(QLGrammarParser.MethodInvokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvoke(QLGrammarParser.MethodInvokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionalMethodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterOptionalMethodInvoke(QLGrammarParser.OptionalMethodInvokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionalMethodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitOptionalMethodInvoke(QLGrammarParser.OptionalMethodInvokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spreadMethodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterSpreadMethodInvoke(QLGrammarParser.SpreadMethodInvokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spreadMethodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitSpreadMethodInvoke(QLGrammarParser.SpreadMethodInvokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(QLGrammarParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(QLGrammarParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionalFieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterOptionalFieldAccess(QLGrammarParser.OptionalFieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionalFieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitOptionalFieldAccess(QLGrammarParser.OptionalFieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spreadFieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterSpreadFieldAccess(QLGrammarParser.SpreadFieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spreadFieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitSpreadFieldAccess(QLGrammarParser.SpreadFieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterMethodAccess(QLGrammarParser.MethodAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitMethodAccess(QLGrammarParser.MethodAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(QLGrammarParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(QLGrammarParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(QLGrammarParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(QLGrammarParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code customPath}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void enterCustomPath(QLGrammarParser.CustomPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code customPath}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 */
	void exitCustomPath(QLGrammarParser.CustomPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#fieldId}.
	 * @param ctx the parse tree
	 */
	void enterFieldId(QLGrammarParser.FieldIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#fieldId}.
	 * @param ctx the parse tree
	 */
	void exitFieldId(QLGrammarParser.FieldIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleIndex}
	 * labeled alternative in {@link QLGrammarParser#indexValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterSingleIndex(QLGrammarParser.SingleIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleIndex}
	 * labeled alternative in {@link QLGrammarParser#indexValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitSingleIndex(QLGrammarParser.SingleIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sliceIndex}
	 * labeled alternative in {@link QLGrammarParser#indexValueExpr}.
	 * @param ctx the parse tree
	 */
	void enterSliceIndex(QLGrammarParser.SliceIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sliceIndex}
	 * labeled alternative in {@link QLGrammarParser#indexValueExpr}.
	 * @param ctx the parse tree
	 */
	void exitSliceIndex(QLGrammarParser.SliceIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(QLGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(QLGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(QLGrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(QLGrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#boolenLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolenLiteral(QLGrammarParser.BoolenLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#boolenLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolenLiteral(QLGrammarParser.BoolenLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(QLGrammarParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(QLGrammarParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#formalOrInferredParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalOrInferredParameterList(QLGrammarParser.FormalOrInferredParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#formalOrInferredParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalOrInferredParameterList(QLGrammarParser.FormalOrInferredParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#formalOrInferredParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalOrInferredParameter(QLGrammarParser.FormalOrInferredParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#formalOrInferredParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalOrInferredParameter(QLGrammarParser.FormalOrInferredParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importCls}
	 * labeled alternative in {@link QLGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportCls(QLGrammarParser.ImportClsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importCls}
	 * labeled alternative in {@link QLGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportCls(QLGrammarParser.ImportClsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importPack}
	 * labeled alternative in {@link QLGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportPack(QLGrammarParser.ImportPackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importPack}
	 * labeled alternative in {@link QLGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportPack(QLGrammarParser.ImportPackContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(QLGrammarParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(QLGrammarParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#opId}.
	 * @param ctx the parse tree
	 */
	void enterOpId(QLGrammarParser.OpIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#opId}.
	 * @param ctx the parse tree
	 */
	void exitOpId(QLGrammarParser.OpIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link QLGrammarParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(QLGrammarParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link QLGrammarParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(QLGrammarParser.VarIdContext ctx);
}