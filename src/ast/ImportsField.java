package ast;

import java.util.ArrayList;

public class ImportsField extends Field {
    ArrayList<String> imports;

    public ImportsField() {
        this.imports = new ArrayList<>();
    }

    public void addImport(String importName) {
        this.imports.add(importName);
    }

    public ArrayList<String> getImports() {
        return imports;
    }

    @Override
    public String toString() {
        return "ImportsField: " + imports +"\n";
    }
}
