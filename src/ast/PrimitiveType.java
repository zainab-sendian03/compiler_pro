package ast;

public class PrimitiveType extends Type {
     String primitiveName;

    public PrimitiveType(String primitiveName) {
        super(primitiveName);
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
