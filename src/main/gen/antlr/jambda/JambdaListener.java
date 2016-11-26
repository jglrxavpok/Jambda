// Generated from F:/Programming/Java/Languages/Jambda/src/main/java/antlr/jambda\Jambda.g4 by ANTLR 4.5.3
package antlr.jambda;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JambdaParser}.
 */
public interface JambdaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JambdaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JambdaParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JambdaParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JambdaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JambdaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(JambdaParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(JambdaParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPackage_declaration(JambdaParser.Package_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#package_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPackage_declaration(JambdaParser.Package_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void enterImport_declaration(JambdaParser.Import_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#import_declaration}.
	 * @param ctx the parse tree
	 */
	void exitImport_declaration(JambdaParser.Import_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(JambdaParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(JambdaParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(JambdaParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(JambdaParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JambdaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JambdaParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JambdaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JambdaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(JambdaParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(JambdaParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(JambdaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(JambdaParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(JambdaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(JambdaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(JambdaParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(JambdaParser.LetterContext ctx);
}