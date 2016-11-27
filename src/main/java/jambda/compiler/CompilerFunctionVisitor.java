package jambda.compiler;

import antlr.jambda.JambdaBaseVisitor;
import antlr.jambda.JambdaParser;

class CompilerFunctionVisitor extends JambdaBaseVisitor<CompiledJambdaFunction> {

    @Override
    public CompiledJambdaFunction visitFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx) {
        CompiledJambdaFunction function = new CompiledJambdaFunction();
        function.name = ctx.IDENTIFIER(0 /*index of the name*/).getText();
        return function;
    }
}
