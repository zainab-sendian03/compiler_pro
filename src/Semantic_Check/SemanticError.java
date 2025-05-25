package Semantic_Check;


public class SemanticError {
    private final String message;
    private final String symbolName;
    private final String scopeName;
    private final int lineNumber;


    public SemanticError(String message, String symbolName, String scopeName, int lineNumber) {
        this.message = message;
        this.symbolName = symbolName;
        this.scopeName = scopeName;
        this.lineNumber = lineNumber;
    }

    public String getMessage() {
        return message;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getScopeName() {
        return scopeName;
    }

    public int getLineNumber() {
        return lineNumber;
    }



    @Override
    public String toString() {
        return "Error in scope '" + scopeName + "' on symbol '" + symbolName + "' at line " + lineNumber + ": " + message;
    }
}
