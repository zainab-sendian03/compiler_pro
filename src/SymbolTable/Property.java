package SymbolTable;

public class Property {
    String propertyName;
    String scope;
    String value;
    String type;
    int line;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public Property(String propertyName, String scope, String value, String type, int line) {
        this.propertyName = propertyName;
        this.scope = scope;
        this.value= value;
        this.type= type;
        this.line = line;
    }
}
