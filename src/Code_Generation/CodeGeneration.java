package Code_Generation;

import ast.Node;
import ast.Program;
import Code_Generation.Page;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CodeGeneration {

    private static int pageNumber = 1;
    public static Page currentPage;
    private ArrayList<Page> pages = new ArrayList<>();
    private static Class currentClass;

    // ---- helper runtime to inject at top of generated JS ----
    private static final String HELPER_RUNTIME = String.join("\n",
            "// ---- Helper runtime (generate once at top) ----",
            "class SimpleSubject {",
            "  constructor(initial = []) { this.value = initial; this.subs = []; }",
            "  asObservable() { return this; }",
            "  next(v) { this.value = v; this.subs.forEach(s => s(v)); }",
            "  subscribe(fn) { this.subs.push(fn); fn(this.value); return { unsubscribe: () => {} }; }",
            "}",
            "function safeGet(obj, prop, fallback=null){ try { return obj[prop]; } catch(e){ return fallback; } }",
            ""
    );

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

        // 1. توليد كود JavaScript في ملف global.js مع حقن الـ helper في الأعلى
        this.createJSPage("global");

        String jsBody = program.getStatements()
                .stream()
                .map(Node::generate)
                .collect(Collectors.joining("\n"));

        String fullJs = HELPER_RUNTIME + "\n\n" + jsBody;

        System.out.println("Generated JS Code:\n");
        currentPage.writeOnFile(fullJs);
        currentPage.closeFile();

        // 2. توليد كود HTML صحيح
        this.createHTMLPage("welcomePage");
        String htmlCode = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Welcome Page</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    \n" +
                "    <div id=\"app\"></div>\n" +
                "    <script src=\"global.js\"></script>\n" +
                "</body>\n" +
                "</html>";

        currentPage.writeOnFile(htmlCode);
        currentPage.closeFile();
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
                "    " + html +
                "    <script src=\"index.js\"></script>\n" +
                "</body>\n" +
                "</html>";
    }

}
