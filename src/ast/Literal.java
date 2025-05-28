package ast;

public class Literal extends Node  implements Expression {
    String stringValue;
    Integer intValue;
    Boolean boolValue;


    public Literal() {
    }

    public Literal(String stringValue) {
        this.stringValue = stringValue;
    }

    public Literal(Integer intValue) {
        this.intValue = intValue;
    }

    public Literal(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public void add(Expression child) {

    }

    @Override
    public String toString() {
        if (stringValue != null) return stringValue;
        if (intValue != null) return intValue.toString();
        if (boolValue != null) return boolValue.toString();
        return "null";
    }

}
