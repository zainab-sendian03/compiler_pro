package ast;

public class DirectiveAttribute extends Content {
    private String name;
    private String value;

    public DirectiveAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String generate() {
        return "*" + name + "=\"" + value + "\"";
    }

    @Override
    public String toString() {
        return "DirectiveAttribute : AttributeName:" + "*" + name  + ", AttributeValue:" + value + " ";
    }
}
