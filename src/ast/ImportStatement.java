package ast;

import java.util.ArrayList;

public class ImportStatement extends Node {
    public ArrayList<String> identifiers = new ArrayList<>();
    public String fromModule;

    public ImportStatement(String fromModule) {
        this.fromModule = fromModule;
    }

    public void addIdentifier(String id) {
        identifiers.add(id);
    }
    @Override
    public String generate() {
        return "";
    }

    @Override
    public String toString() {
        return "import { " + String.join(", ", identifiers) + " } from \"" + fromModule + "\";";
    }

}