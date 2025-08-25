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
        StringBuilder sb = new StringBuilder();
        for (String item : imports) {
            sb.append(  item );
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ImportsField: " + imports +"\n";
    }
}
