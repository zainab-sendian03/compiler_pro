package ast;

import java.util.ArrayList;

public class ImportStatement extends Statement{
    ArrayList<String> identifiers;
    String module;

    public ImportStatement(String module) {
        this.module = module;
        this.identifiers = new ArrayList<>();
    }

    public void addIdentifiers(String identifier) {
        this.identifiers.add(identifier);
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                identifiers +
                " From " + module +
                '}';
    }
}
