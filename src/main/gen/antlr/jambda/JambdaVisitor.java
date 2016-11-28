// Generated from F:/Programming/Java/Languages/Jambda/src/main/java/antlr/jambda\Jambda.g4 by ANTLR 4.5.3
package antlr.jambda;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JambdaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JambdaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JambdaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JambdaParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(JambdaParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(JambdaParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JambdaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(JambdaParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#variableTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTuple(JambdaParser.VariableTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JambdaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JambdaParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JambdaParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(JambdaParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(JambdaParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JambdaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#floatingPointNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointNumber(JambdaParser.FloatingPointNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#functionApplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApplication(JambdaParser.FunctionApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JambdaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(JambdaParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(JambdaParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(JambdaParser.LetterContext ctx);
}