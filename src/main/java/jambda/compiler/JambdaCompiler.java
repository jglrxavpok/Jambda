package jambda.compiler;

import antlr.jambda.JambdaBaseVisitor;
import antlr.jambda.JambdaLexer;
import antlr.jambda.JambdaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

public class JambdaCompiler {

    private final JambdaParser parser;

    public JambdaCompiler(InputStream codeInput) throws IOException {
        JambdaLexer lexer = new JambdaLexer(new ANTLRInputStream(codeInput));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new JambdaParser(tokens);
    }

    public CompiledJambdaCode compile() {
        CompilerJambdaVisitor visitor = new CompilerJambdaVisitor();
        parser.file().accept(visitor);
        return visitor.getResult();
    }

    private String joinIdentifiers(String joiner, List<TerminalNode> identifiers) {
        Optional<String> joined = identifiers.stream()
                .map(ParseTree::getText)
                .reduce((a,b) -> String.join(joiner, a, b));
        return joined.orElse("");
    }

    private class CompilerJambdaVisitor extends JambdaBaseVisitor<Void> {
        private final CompilerFunctionVisitor functionVisitor;
        private CompiledJambdaCode result;

        CompilerJambdaVisitor() {
            result = new CompiledJambdaCode();
            functionVisitor = new CompilerFunctionVisitor();
        }

        @Override
        public Void visitPackageDeclaration(JambdaParser.PackageDeclarationContext ctx) {
            result.packageName = joinIdentifiers(".", ctx.IDENTIFIER());
            return super.visitPackageDeclaration(ctx);
        }

        @Override
        public Void visitImportDeclaration(JambdaParser.ImportDeclarationContext ctx) {
            result.imports.add(joinIdentifiers(".", ctx.IDENTIFIER()));
            return super.visitImportDeclaration(ctx);
        }

        @Override
        public Void visitFunctionDeclaration(JambdaParser.FunctionDeclarationContext ctx) {
            CompiledJambdaFunction function = functionVisitor.visitFunctionDeclaration(ctx);
            result.functions.add(function);
            return super.visitFunctionDeclaration(ctx);
        }

        public CompiledJambdaCode getResult() {
            return result;
        }
    }
}
