package SymbolTable;

public class NavigateSymbol {

    private final String value;
    private final String type;
    private final   int lineNumber;


    public NavigateSymbol( String value, String type,int lineNumber ) {
this.type=type;
        this.value = value;
        this.lineNumber=lineNumber;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public int getLineNumber() {
        return lineNumber;
    }

}
