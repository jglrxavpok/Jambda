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
	 * Visit a parse tree produced by {@link JambdaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JambdaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(JambdaParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(JambdaParser.Package_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(JambdaParser.Import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(JambdaParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(JambdaParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(JambdaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JambdaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JambdaParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(JambdaParser.OperationContext ctx);
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