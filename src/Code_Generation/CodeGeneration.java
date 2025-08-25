package Code_Generation;

import ast.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeGeneration {
    private static int pageNumber = 1;
    public static Page currentPage;
    private ArrayList<Page> pages = new ArrayList<>();
    private static Class currentClass;

    public void createHTMLPage(String name) {
        Page page = new Page(name + ".html");
        currentPage = page;
        pages.add(page);
        pageNumber++;
    }

    public void createJSPage(String name) {
        Page page = new Page(name + ".js");
        currentPage = page;
        pages.add(page);
    }

    public void startGenerate(Program program) {
        this.createJSPage("global");
        Page globalJsPage = currentPage;

        StringBuilder indexHtmlContent = new StringBuilder();
        indexHtmlContent.append("<!DOCTYPE html>\n");
        indexHtmlContent.append("<html lang=\"en\">\n");
        indexHtmlContent.append("<head>\n");
        indexHtmlContent.append("    <meta charset=\"UTF-8\">\n");
        indexHtmlContent.append("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
        indexHtmlContent.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        indexHtmlContent.append("    <title>Generated Application</title>\n");
        indexHtmlContent.append("    <script src=\"global.js\"></script>\n");
        indexHtmlContent.append("</head>\n");
        indexHtmlContent.append("<body>\n");

        List<ComponentDeclaration> componentDeclarations = new ArrayList<>();
        List<ClassDeclaration> classDeclarations = new ArrayList<>();
        List<InjectableDeclaration> injectableDeclarations = new ArrayList<>();
        List<ImportStatement> importStatements = new ArrayList<>();
        List<Node> otherStatements = new ArrayList<>();


        for (Node statement : program.statements) {
            if (statement instanceof ComponentDeclaration) {
                componentDeclarations.add((ComponentDeclaration) statement);
            } else if (statement instanceof ClassDeclaration) {
                classDeclarations.add((ClassDeclaration) statement);
            } else if (statement instanceof InjectableDeclaration) {
                injectableDeclarations.add((InjectableDeclaration) statement);
            } else if (statement instanceof ImportStatement) {
                importStatements.add((ImportStatement) statement);
            } else {
                otherStatements.add(statement);
            }
        }

        List<String> componentClassNames = new ArrayList<>();
        for (ComponentDeclaration component : componentDeclarations) {
            String selector = "";
            if (component.getComponentBody() != null) {
                for (Field field : component.getComponentBody().getFields()) {
                    if (field instanceof SelectorField) {
                        selector = ((SelectorField) field).generate().replaceAll("\"", "").replaceAll("'", "");
                        break;
                    }
                }
            }
            for (ClassDeclaration classDecl : classDeclarations) {
                if (classDecl.name.equalsIgnoreCase(selector.replace("-", ""))) {
                    componentClassNames.add(classDecl.name);
                    break;
                }
            }
        }

        // معالجة العبارات العامة أولاً (عبارات الاستيراد والخدمات)
        for (ImportStatement importStmt : importStatements) {
            globalJsPage.writeOnFile(importStmt.generate());
        }

        globalJsPage.writeOnFile("\n");

        for (InjectableDeclaration injectable : injectableDeclarations) {
            globalJsPage.writeOnFile(injectable.generate());
        }

        globalJsPage.writeOnFile("\n");

        for (ClassDeclaration classDecl : classDeclarations) {
            if (!componentClassNames.contains(classDecl.name)) {
                globalJsPage.writeOnFile(classDecl.generate());
                globalJsPage.writeOnFile("\n");
            }
        }

        // المرور على المكونات لتوليد ملفاتها
        for (ComponentDeclaration component : componentDeclarations) {
            String selector = "";
            String imports = "";
            String standalone = "";
            String template = "";

            if (component.getComponentBody() != null) {
                for (Field field : component.getComponentBody().getFields()) {
                    if (field instanceof SelectorField) {
                        selector = ((SelectorField) field).generate().replaceAll("\"", "").replaceAll("'", "");
                    } else if (field instanceof ImportsField) {
                        imports = ((ImportsField) field).generate();
                    } else if (field instanceof StandalongField) {
                        standalone = ((StandalongField) field).generate();
                    }else if (field instanceof TemplateField) {
                    template = ((TemplateField) field).generate();
                    // إزالة الـ backticks إذا موجودة
                    template = template.replaceAll("^`", "").replaceAll("`$", "");
                }

            }
            }

            String htmlFileName = selector ;
            this.createHTMLPage(htmlFileName);
            currentPage.writeOnFile(getHtmlCode(template));
            currentPage.closeFile();

            String jsFileName = selector ;
            this.createJSPage(jsFileName);

            StringBuilder jsContent = new StringBuilder();
            jsContent.append("@Component({\n");
            jsContent.append("  selector: '" + selector + "',\n");
            jsContent.append("  standalone: " + (standalone.isEmpty() ? "false" : standalone) + ",\n");
            jsContent.append( "  imports: " + imports + ",\n");
            jsContent.append("  templateUrl: './" + htmlFileName + ".html',\n");
            jsContent.append("})\n");

            ClassDeclaration matchedClass = null;
            for (ClassDeclaration classDecl : classDeclarations) {
                if (classDecl.name.equalsIgnoreCase(selector.replace("-", ""))) {
                    matchedClass = classDecl;
                    break;
                }
            }

            if (matchedClass != null) {
                jsContent.append(matchedClass.generate());
            }

            currentPage.writeOnFile(jsContent.toString());
            currentPage.closeFile();

            indexHtmlContent.append("    <script src=\"" + jsFileName + ".js\"></script>\n");
        }

        for (Node otherStmt : otherStatements) {
            if (otherStmt != null) {
                globalJsPage.writeOnFile(otherStmt.generate());
            }
        }


        indexHtmlContent.append("</body>\n");
        indexHtmlContent.append("</html>\n");

        this.createHTMLPage("index");
        currentPage.writeOnFile(indexHtmlContent.toString());
        currentPage.closeFile();
        globalJsPage.closeFile();
    }

    public String getHtmlCode(String html) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    " + html+
                "</body>\n" +
                "</html>";
    }
}