package test;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import grammar.*;
import visitors.EvalVisitor;

import java.io.FileInputStream;
import java.io.InputStream;
// import java.time.Duration;
// import java.time.Instant;

public class Decibel {
    public static void main(String[] args) throws Exception {
        EvalVisitor eval = new EvalVisitor();

        // Instant start = Instant.now();

        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null)
            is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        DecibelLexer lexer = new DecibelLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DecibelParser parser = new DecibelParser(tokens);
        ParseTree tree = parser.program();
        eval.visit(tree);

        // Instant finish = Instant.now();
        // long timeElapsed = Duration.between(start, finish).toMillis();
        // System.out.println("milliseconds elapsed: " + timeElapsed);
    }
}