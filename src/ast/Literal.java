package ast;

public class Literal extends Node  implements Expression {
    String stringValue;
    Integer intValue;
    Boolean boolValue;


    public Literal() {
    }

    public Literal(String stringValue) {
        this.stringValue = stringValue;
    }

    public Literal(Integer intValue) {
        this.intValue = intValue;
    }

    public Literal(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public Boolean getBoolValue() {
        return boolValue;
    }
    
    @Override
    public String generate() {
        if (stringValue != null) {
            // إذا كان string يحتوي على quotes، أزلها
            String cleanString = stringValue;
            if ((cleanString.startsWith("\"") && cleanString.endsWith("\"")) ||
                (cleanString.startsWith("'") && cleanString.endsWith("'"))) {
                cleanString = cleanString.substring(1, cleanString.length() - 1);
            }
            return "'" + cleanString + "'";
        }
        if (intValue != null) return intValue.toString();
        if (boolValue != null) return boolValue.toString();
        return "null";
    }

    @Override
    public String toString() {
        if (stringValue != null) return stringValue;
        if (intValue != null) return intValue.toString();
        if (boolValue != null) return boolValue.toString();
        return "null";
    }

}