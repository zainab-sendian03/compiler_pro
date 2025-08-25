package SymbolTable;

import java.util.ArrayList;

public class Scope {
    private String name; // اسم النطاق
    private Scope parentScope; // النطاق الأب (إن وجد)
    private ArrayList<Symbol> symbols = new ArrayList<>(); // قائمة الرموز داخل النطاق

    // Constructor
    public Scope(String name, Scope parentScope) {
        this.name = name;
        this.parentScope = parentScope;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getParentScope() {
        return parentScope;
    }

    public void setParentScope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    // إضافة رمز إلى النطاق
    public void addSymbol(Symbol symbol) {
        symbols.add(symbol);
    }

    // البحث عن رمز في هذا النطاق
    public Symbol findSymbol(String name) {
        for (Symbol symbol : symbols) {
            if (symbol.getName().equals(name)) {
                return symbol;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Scope{name='" + name + "', symbols=" + symbols + "}";
    }
}
