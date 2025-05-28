package ast;

import java.util.ArrayList;

public class ImportStatement extends Statement implements Addable<String>{
    ArrayList<String> identifiers;
    String module;

    public ImportStatement(String module) {
        this.module = module;
        this.identifiers = new ArrayList<>();
    }

    @Override
    public void add(String item) {
        identifiers.add(item);
    }

    @Override
    public String toString() {
        return "ImportStatement{" +
                identifiers +
                " From " + module +
                '}';
    }
}
