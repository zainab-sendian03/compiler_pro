package ast;

public class NormalAttribute extends Content {
    private String name;
    private String value;

    public NormalAttribute(String name, String value) {
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
        return name + "=\"" + value + "\"";
    }

    @Override
    public String toString() {

        return "NormalAttribute : AttributeName:" + name + ", AttributeValue:" + value + " ";
    }
}