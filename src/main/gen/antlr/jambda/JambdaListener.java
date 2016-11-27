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
	 * Enter a parse tree produced by {@link JambdaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(JambdaParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(JambdaParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void enterVariableTuple(JambdaParser.VariableTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#variableTuple}.
	 * @param ctx the parse tree
	 */
	void exitVariableTuple(JambdaParser.VariableTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JambdaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JambdaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JambdaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JambdaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JambdaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JambdaParser.ImportDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link JambdaParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(JambdaParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(JambdaParser.VariablesContext ctx);
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
	 * Enter a parse tree produced by {@link JambdaParser#floatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointNumber(JambdaParser.FloatingPointNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#floatingPointNumber}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointNumber(JambdaParser.FloatingPointNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JambdaParser#functionApplication}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApplication(JambdaParser.FunctionApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JambdaParser#functionApplication}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApplication(JambdaParser.FunctionApplicationContext ctx);
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