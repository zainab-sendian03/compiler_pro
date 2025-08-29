package Main;

import Code_Generation.CodeGeneration;
import Semantic_Check.SemanticAnalyzer;
import Visitor.BaseVisitor;

import antlr.TypeScripteLexer;
import antlr.TypeScripteParser;
import ast.Program;

import SymbolTable.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;
import java.util.logging.*;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static Logger logger = Logger.getLogger("MyLog");

    public static void main(String[] args) throws IOException {
        String htmlCode = "Tests/htmlCode.txt";
        String errorsCode = "Tests/errorsCode.txt";
        String completeCode = "Tests/completeCode.txt";
        String sourcefile = "Tests/sourcefile.txt";
        CharStream cs = fromFileName(completeCode);
        //html
        //CharStream cs = fromFileName(htmlCode);
        TypeScripteLexer lexer = new TypeScripteLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        TypeScripteParser parser = new TypeScripteParser(token);
        ParseTree tree = parser.program();
        //html
        //ParseTree htmlTree = parser.htmlRoot();
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        BaseVisitor visitor = new BaseVisitor(analyzer);
        Program program = (Program) visitor.visit(tree);
        System.out.println("code generation start");
        CodeGeneration codeGeneration=new CodeGeneration();
        codeGeneration.startGenerate(program);
        System.out.println("Code generation finished. Check 'output' directory.");

// إضافة العناصر للtemplate
       // String htmlCode = template.generateHTML(); // HTML خالص
        //String templateLiteral = template.generate(); // Template literal للاستخدام في JS
        //html
        //HtmlRoot htmlRoot = (HtmlRoot) visitor.visit(htmlTree);

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
       // MyTable.print();
        //AttSymbolTable.print();


        System.out.println("AST:");
       System.out.println(program);
        //SymbolTable.print();

        //html
        //System.out.println("HTML AST:");
        //System.out.println(htmlRoot);
        //System.out.println(htmlTree.toStringTree(parser));
    }
}