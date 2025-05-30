package Main;

import Semantic_Check.SemanticAnalyzer;
import Visitor.BaseVisitor;
import antlr.TypeScripteLexer;
import antlr.TypeScripteParser;
import ast.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import SymbolTable.*;


import java.io.IOException;
import java.util.logging.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static Logger logger = Logger.getLogger("MyLog");

    public static void main(String[] args) throws IOException {
        String src = "Tests/test 2.txt";
        //String srcFisrt = "Tests/sourcefile.txt";
        CharStream cs = fromFileName(src);
        TypeScripteLexer lexer = new TypeScripteLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        TypeScripteParser parser = new TypeScripteParser(token);
        ParseTree tree = parser.program();
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        BaseVisitor visitor = new BaseVisitor(analyzer);
        Program program = (Program) visitor.visit(tree);
        try {
            FileHandler fileHandler = new FileHandler("src/ErrorStore/semantic_errors.log", false);
            fileHandler.setFormatter(new Formatter() {
                @Override
                public String format(LogRecord record) {
                    return record.getMessage() + "\n";
                }
            });
            logger.setUseParentHandlers(false);
            logger.addHandler(fileHandler);
            analyzer.analyzeAll(AttSymbolTable.getSymbols());
            fileHandler.close();

        } catch (IOException e) {
            System.err.println("Failed to set up logger: " + e.getMessage());
        }
        // System.out.println("------------------------- Symbol Table -------------------------");
        MyTable.print();
        AttSymbolTable.print();
        //System.out.println("AST:");
        System.out.println(program);
        //SymbolTable.print();









    }
}