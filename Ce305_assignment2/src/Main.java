import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {

        String filename = "src/CompiledCode.txt";
        CharStream in = CharStreams.fromFileName("src/pythonCode");
        pythonLexer lexer = new pythonLexer(in);  //create a lexer object
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        pythonParser parser = new pythonParser(tokens);
        prettyPrint printer = new prettyPrint();
        ParseTree parseTree = parser.start();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(printer, parseTree);

        System.out.println("Translated source code: \n");
        System.out.println(printer.getResult());
        System.out.println("Symbol Table: \n");
        printer.getSymbolTable();
        FileWriter writer = null;
        writer = new FileWriter(filename);
        writer.write(printer.getResult());
        writer.close();

        pythonEvaluator pe = new pythonEvaluator();
        System.out.println("\nsPython result: \n");
        pe.evaluatePythonCode("src/CompiledCode.txt");
    }
}
