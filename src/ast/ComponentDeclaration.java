package ast;

public class ComponentDeclaration extends Node {
    ComponentBody componentBody;

    public ComponentBody getComponentBody() {
        return componentBody;
    }

    public void setComponentBody(ComponentBody componentBody) {
        this.componentBody = componentBody;
    }
    @Override
    public String generate() {
        return "@Component({\n" + componentBody.generate() + "\n})";
    }
    @Override
    public String toString() {
        return "ComponentDeclaration{"+"\n" + componentBody + "\n"+'}';
    }
}
