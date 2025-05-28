package ast;

public class PrimitiveType extends Node  {
     String primitiveName;

    public PrimitiveType(String primitiveName) {
        this.primitiveName = primitiveName;
    }

    @Override
    public String toString() {
        return "PrimitiveType{" +
                "primitiveName='" + primitiveName + '\'' +
                '}';
    }

    public String getPrimitiveName() {
        return primitiveName;
    }
}
