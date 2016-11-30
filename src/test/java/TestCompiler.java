import jambda.JambdaTupleType;
import jambda.JambdaType;
import jambda.compiler.CompiledJambdaCode;
import jambda.compiler.CompiledJambdaFunction;
import jambda.compiler.JambdaCompiler;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

        CompiledJambdaFunction identityFunction = result.getFunctions().get(0);
        assertTrue("Argument type constraint exists", identityFunction.getArgumentConstraint() != null);
        assertTrue("Return type constraint exists", identityFunction.getReturnConstraint() != null);

        assertEquals("Argument type constraint must be 'Natural'", "Natural", identityFunction.getArgumentConstraint().getName());
        assertEquals("Return type constraint must be 'Natural'", "Natural", identityFunction.getReturnConstraint().getName());
    }

    @Test
    public void testTuples() throws IOException {
        JambdaCompiler compiler = new JambdaCompiler(getClass().getResourceAsStream("/TestTuples.jl"));
        CompiledJambdaCode result = compiler.compile();
        CompiledJambdaFunction tupleFunction = result.getFunctions().get(0);
        assertTrue("Argument type constraint exists", tupleFunction.getArgumentConstraint() != null);
        assertTrue("Argument type constraint must be a Tuple", tupleFunction.getArgumentConstraint() instanceof JambdaTupleType);
        JambdaTupleType tupleType = (JambdaTupleType) tupleFunction.getArgumentConstraint();
        assertEquals("Tuple length must be of 2", 2, tupleType.getLength());
        assertEquals("Natural", tupleType.getComponentTypes()[0].getName());
        assertEquals("Float", tupleType.getComponentTypes()[1].getName());
    }
}
