package ast;

public class Accessor extends Node{
    private String identifier;      // لو كان DOT IDENTIFIER
    private ArrayLiteral arrayLiteral; // لو كان DOT arrayLiteral

    public Accessor(String identifier) {
        this.identifier = identifier;
    }

    public Accessor(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public boolean isIdentifier() {
        return identifier != null;
    }

    public boolean isArrayLiteral() {
        return arrayLiteral != null;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }
    @Override
    public String toString() {
        if (isIdentifier()) return "." + identifier;
        else return "." + arrayLiteral.toString();
    }

    @Override
    public String generate() {
        if (identifier != null) return "." + identifier;
        else return arrayLiteral.generate();

    }
}