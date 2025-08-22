package SymbolTable;

public class AttSymbol {
    private String name;   // اسم المتغير
    private String type;   // نوع المتغير (مثل int، String)
    private String value;
    private  int lineNumber;
    private String scope;


    public AttSymbol(String name, String type, String value,int lineNumber ) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.lineNumber=lineNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
