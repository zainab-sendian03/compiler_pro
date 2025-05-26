package Main;

import Semantic_Check.SemanticAnalyzer;
import Visitor.BaseVisitor;
import antlr.TypeScripteLexer;
import antlr.TypeScripteParser;
import ast.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import SymbolTable.SymbolTable;


import java.io.IOException;
import java.util.logging.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static Logger logger = Logger.getLogger("MyLog");

    public static void main(String[] args) throws IOException {
        String src = "Tests/test 2.txt";
        CharStream cs = fromFileName(src);
        TypeScripteLexer lexer = new TypeScripteLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        TypeScripteParser parser = new TypeScripteParser(token);
        ParseTree tree = parser.program();
        BaseVisitor visitor = new BaseVisitor();
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

            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.analyzeAll(SymbolTable.getScopes());
            fileHandler.close();

        } catch (IOException e) {
            System.err.println("Failed to set up logger: " + e.getMessage());
        }

//        System.out.println("AST:");
//    System.out.println(program);
//            System.out.println("------------------------- Symbol Table -------------------------");
//            SymbolTable.print();
// SymbolTable.printScopes();


    }
}