import jambda.compiler.CompiledJambdaCode;
import jambda.compiler.JambdaCompiler;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestCompiler {

    @Test
    public void testPackage() throws IOException {
        JambdaCompiler compiler = new JambdaCompiler(getClass().getResourceAsStream("/Tests.jl"));
        CompiledJambdaCode result = compiler.compile();
        assertEquals("jambda.tests", result.getPackageName());
    }

    @Test
    public void testImports() throws IOException {
        JambdaCompiler compiler = new JambdaCompiler(getClass().getResourceAsStream("/Tests.jl"));
        CompiledJambdaCode result = compiler.compile();
        assertEquals(Collections.singletonList("whatevs"), result.getImports());
    }

    @Test
    public void testFunctions() throws IOException {
        JambdaCompiler compiler = new JambdaCompiler(getClass().getResourceAsStream("/Tests.jl"));
        CompiledJambdaCode result = compiler.compile();
        assertEquals(2, result.getFunctions().size());
        assertEquals("identity", result.getFunctions().get(0).getName());
        assertEquals("nested_functions", result.getFunctions().get(1).getName());
    }
}
