package ast;
public class TwoWayBindingAttribute extends Content {
    private String name;
    private String value;

    public TwoWayBindingAttribute(String name, String value) {
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
    public String toString() {
        return "TwoWayBindingAttribute : AttributeName:" + "[(" + name + ")]" + ", AttributeValue:" + value + " ";
    }
}

