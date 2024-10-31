package com.alibaba.qlexpress4.aparser;// Generated from QLGrammar.g4 by ANTLR 4.9.3

    import static com.alibaba.qlexpress4.aparser.ParserOperatorManager.OpType.*;
    import static com.alibaba.qlexpress4.QLPrecedences.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QLGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QLGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(QLGrammarParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localVariableDeclarationStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(QLGrammarParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(QLGrammarParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(QLGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code traditionalForStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraditionalForStatement(QLGrammarParser.TraditionalForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(QLGrammarParser.ForEachStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(QLGrammarParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code macroStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroStatement(QLGrammarParser.MacroStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakContinueStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakContinueStatement(QLGrammarParser.BreakContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(QLGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(QLGrammarParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link QLGrammarParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(QLGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(QLGrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(QLGrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(QLGrammarParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(QLGrammarParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(QLGrammarParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(QLGrammarParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(QLGrammarParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(QLGrammarParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#declType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclType(QLGrammarParser.DeclTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#declTypeNoArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTypeNoArr(QLGrammarParser.DeclTypeNoArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(QLGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(QLGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(QLGrammarParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#clsTypeNoTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsTypeNoTypeArguments(QLGrammarParser.ClsTypeNoTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#clsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsType(QLGrammarParser.ClsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(QLGrammarParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(QLGrammarParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(QLGrammarParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(QLGrammarParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(QLGrammarParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QLGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(QLGrammarParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#ternaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(QLGrammarParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpr(QLGrammarParser.BaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#leftAsso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftAsso(QLGrammarParser.LeftAssoContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryop(QLGrammarParser.BinaryopContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(QLGrammarParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#prefixExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpress(QLGrammarParser.PrefixExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#suffixExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixExpress(QLGrammarParser.SuffixExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(QLGrammarParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(QLGrammarParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupExpr(QLGrammarParser.GroupExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newObjExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewObjExpr(QLGrammarParser.NewObjExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newEmptyArrExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewEmptyArrExpr(QLGrammarParser.NewEmptyArrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newInitArrExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInitArrExpr(QLGrammarParser.NewInitArrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(QLGrammarParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIdExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdExpr(QLGrammarParser.VarIdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpr(QLGrammarParser.TypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(QLGrammarParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapExpr(QLGrammarParser.MapExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(QLGrammarParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(QLGrammarParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tryCatchExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchExpr(QLGrammarParser.TryCatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code contextSelectExpr}
	 * labeled alternative in {@link QLGrammarParser#primaryNoFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContextSelectExpr(QLGrammarParser.ContextSelectExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(QLGrammarParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#listItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItems(QLGrammarParser.ListItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(QLGrammarParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#tryCatches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatches(QLGrammarParser.TryCatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(QLGrammarParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#catchParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchParams(QLGrammarParser.CatchParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#tryFinally}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryFinally(QLGrammarParser.TryFinallyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#mapEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntries(QLGrammarParser.MapEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#mapEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEntry(QLGrammarParser.MapEntryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clsValue}
	 * labeled alternative in {@link QLGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClsValue(QLGrammarParser.ClsValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eValue}
	 * labeled alternative in {@link QLGrammarParser#mapValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEValue(QLGrammarParser.EValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdKey(QLGrammarParser.IdKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringKey(QLGrammarParser.StringKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quoteStringKey}
	 * labeled alternative in {@link QLGrammarParser#mapKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoteStringKey(QLGrammarParser.QuoteStringKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#idMapKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdMapKey(QLGrammarParser.IdMapKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvoke(QLGrammarParser.MethodInvokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionalMethodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalMethodInvoke(QLGrammarParser.OptionalMethodInvokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spreadMethodInvoke}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadMethodInvoke(QLGrammarParser.SpreadMethodInvokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(QLGrammarParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionalFieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalFieldAccess(QLGrammarParser.OptionalFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spreadFieldAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadFieldAccess(QLGrammarParser.SpreadFieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodAccess}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAccess(QLGrammarParser.MethodAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(QLGrammarParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(QLGrammarParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code customPath}
	 * labeled alternative in {@link QLGrammarParser#pathPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomPath(QLGrammarParser.CustomPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#fieldId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldId(QLGrammarParser.FieldIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleIndex}
	 * labeled alternative in {@link QLGrammarParser#indexValueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleIndex(QLGrammarParser.SingleIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sliceIndex}
	 * labeled alternative in {@link QLGrammarParser#indexValueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceIndex(QLGrammarParser.SliceIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(QLGrammarParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(QLGrammarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#boolenLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolenLiteral(QLGrammarParser.BoolenLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(QLGrammarParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#formalOrInferredParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalOrInferredParameterList(QLGrammarParser.FormalOrInferredParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#formalOrInferredParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalOrInferredParameter(QLGrammarParser.FormalOrInferredParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importCls}
	 * labeled alternative in {@link QLGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportCls(QLGrammarParser.ImportClsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importPack}
	 * labeled alternative in {@link QLGrammarParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPack(QLGrammarParser.ImportPackContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(QLGrammarParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#opId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpId(QLGrammarParser.OpIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QLGrammarParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(QLGrammarParser.VarIdContext ctx);
}