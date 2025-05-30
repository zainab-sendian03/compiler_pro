package SymbolTable;

import java.util.ArrayList;

public class AttSymbolTable {
    private static ArrayList<AttSymbol> symbol = new ArrayList<>();

    public void setSymbols(ArrayList<AttSymbol> symbols) {
        AttSymbolTable.symbol = symbols;
    }

    public static ArrayList<AttSymbol> getSymbols() {
        return symbol;
    }

    public static void print() {
        System.out.println("Name\t\tType\t\tValue");
        System.out.println("*=========================================*");
        for (AttSymbol s : symbol) {
            System.out.printf("%s\t\t%s\t\t%s",
                    s.getName(),
                    s.getType(),
                    s.getValue());
            System.out.println( );
            System.out.println("____________________________________________________________________________________");

        }
    }
}
