package ast;

import java.util.ArrayList;

public class ImportsField extends Field implements Addable<String>{
    ArrayList<String> imports;

    public ImportsField() {
        this.imports = new ArrayList<>();
    }


    @Override
    public void add(String item) {
        imports.add(item);
    }

    public ArrayList<String> getImports() {
        return imports;
    }
    @Override
    public String generate() {
        StringBuilder jsBuilder = new StringBuilder();
        jsBuilder.append("// Imports: ").append(String.join(", ", imports)).append("\n");
        for (String importItem : imports) {
            jsBuilder.append("// Import: ").append(importItem).append("\n");
        }
        return jsBuilder.toString();
    }

    @Override
    public String toString() {
        return "ImportsField: " + imports +"\n";
    }
}
