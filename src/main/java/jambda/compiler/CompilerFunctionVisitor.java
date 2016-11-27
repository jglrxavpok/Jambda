package jambda.compiler;

import antlr.jambda.JambdaBaseVisitor;
import antlr.jambda.JambdaParser;
import jambda.JambdaType;

class CompilerFunctionVisitor extends JambdaBaseVisitor<CompiledJambdaFunction> {

    @Override
    public CompiledJambdaFunction visitFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx) {
        CompiledJambdaFunction function = new CompiledJambdaFunction();
        function.name = ctx.IDENTIFIER().getText();
        if(hasTypeConstraints(ctx)) {
            final JambdaType[] types = {null, null};
            ctx.accept(new JambdaBaseVisitor<JambdaType>() {

                private int counter;

                @Override
                public JambdaType visitType(JambdaParser.TypeContext ctx) {

                    JambdaType found = null;
                    if(ctx.IDENTIFIER() != null) {
                        found = new JambdaType(ctx.IDENTIFIER().getText());
                    } else { // it is a tuple
                        // TODO
                    }
                    types[counter] = found;
                    counter++;
                    return found;
                }
            });
            function.argumentConstraint = types[0];
            function.returnConstraint = types[1];
        }
        return function;
    }

    private boolean hasTypeConstraints(JambdaParser.FunctionDeclarationContext ctx) {
        return ctx.DOUBLE_COLON() != null;
    }
}
