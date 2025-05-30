package test;

import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import grammar.*;

//  TODO make base expressions act as print statements
public class Main {
    public static void main(String args[]) throws Exception {
        System.out.println("DECIBEL v0.0 CONSUME RESPONSIBLY");
        var eval = new EvalVisitor();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.print("> ");
                CharStream input = CharStreams.fromString(in.nextLine() + ";");
                DecibelLexer lexer = new DecibelLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                DecibelParser parser = new DecibelParser(tokens);
                ParseTree tree = parser.program();
                // System.out.println(tree.toStringTree(parser));
                eval.visit(tree);
            }
        }
    }
}