package ast;

public class PropertyAccess extends Expression {
    String fullChain;

    public PropertyAccess(String objectName, String fullChain) {
        this.fullChain = fullChain;
    }

    @Override
    public String toString() {
        return fullChain;
    }
}
