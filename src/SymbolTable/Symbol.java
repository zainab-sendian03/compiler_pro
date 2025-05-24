package SymbolTable;

public class Symbol {
    private String name;   // اسم المتغير
    private String type;   // نوع المتغير (مثل int، String)
    private String value;  // القيمة
    private String scope;  // نطاق المتغير
    private final int lineNumber;
    public Symbol(String name, String type, String value, String scope, int lineNumber) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.scope = scope;
        this.lineNumber=lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    // طباعة الرمز بطريقة مفهومة
    @Override
    public String toString() {
        return "Symbol{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", scope='" + scope + '\'' +
                '}';
    }
}
