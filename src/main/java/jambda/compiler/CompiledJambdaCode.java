package jambda.compiler;

import java.util.ArrayList;
import java.util.List;

public class CompiledJambdaCode {

    String packageName;
    List<String> imports;
    List<CompiledJambdaFunction> functions;

    public CompiledJambdaCode() {
        imports = new ArrayList<>();
        functions = new ArrayList<>();
    }

    public List<CompiledJambdaFunction> getFunctions() {
        return functions;
    }

    public String getPackageName() {
        return packageName;
    }

    public List<String> getImports() {
        return imports;
    }
}
