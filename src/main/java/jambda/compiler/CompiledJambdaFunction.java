package jambda.compiler;

import jambda.JambdaType;

public class CompiledJambdaFunction {

    String name;
    JambdaType argumentConstraint;
    JambdaType returnConstraint;
    String argumentName;

    public CompiledJambdaFunction() {
        argumentConstraint = JambdaType.ANY;
        returnConstraint = JambdaType.ANY;
    }

    public String getName() {
        return name;
    }

    public JambdaType getArgumentConstraint() {
        return argumentConstraint;
    }

    public JambdaType getReturnConstraint() {
        return returnConstraint;
    }
}
