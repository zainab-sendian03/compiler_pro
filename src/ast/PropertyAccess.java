package ast;

public class PropertyAccess extends Node implements Expression {
    String fullChain;

    public PropertyAccess(String objectName, String fullChain) {
        this.fullChain = fullChain;
    }

    @Override
    public void add(Expression child) {

    }

    @Override
    public String toString() {
        return fullChain;
    }
}
