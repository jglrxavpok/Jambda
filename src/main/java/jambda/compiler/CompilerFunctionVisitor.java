package jambda.compiler;

import antlr.jambda.JambdaBaseVisitor;
import antlr.jambda.JambdaParser;
import jambda.JambdaTupleType;
import jambda.JambdaType;

import java.util.List;
import java.util.stream.Collectors;

class CompilerFunctionVisitor extends JambdaBaseVisitor<CompiledJambdaFunction> {

    @Override
    public CompiledJambdaFunction visitFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx) {
        CompiledJambdaFunction function = new CompiledJambdaFunction();
        function.name = ctx.IDENTIFIER().getText();
        if(hasTypeConstraints(ctx)) {
            final JambdaType[] types = {null, null};
            ctx.accept(new JambdaBaseVisitor<JambdaType>() {

                @Override
                public JambdaType visitType(JambdaParser.TypeContext ctx) {
                    JambdaType found = findType(ctx);
                    if(types[0] == null)
                        types[0] = found; // set argument constraint
                    else if(types[1] == null)
                        types[1] = found; // set return constraint
                    return found;
                }

                private JambdaType findType(JambdaParser.TypeContext ctx) {
                    JambdaType found;
                    if(ctx.IDENTIFIER() != null) {
                        found = new JambdaType(ctx.IDENTIFIER().getText());
                    } else { // it is a tuple
                        List<JambdaType> types = ctx.variableTuple().type()
                                .stream()
                                .map(this::findType)
                                .collect(Collectors.toList());
                        JambdaType[] tupleTypes = types.toArray(new JambdaType[0]);
                        found = new JambdaTupleType(tupleTypes);
                    }
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
