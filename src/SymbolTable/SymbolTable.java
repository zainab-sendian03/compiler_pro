package SymbolTable;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {
    private static ArrayList<Symbol> symbols = new ArrayList<>();
    private static final Stack<Scope> scopes = new Stack<Scope>();

    public void setSymbols(ArrayList<Symbol> symbols) {
        SymbolTable.symbols = symbols;
    }

    public static ArrayList<Symbol> getSymbols() {
        return symbols;
    }

    public static void print() {
        System.out.println("Name\t\tType\t\tValue\t\tScope\t\t kind\t\t line");
        System.out.println("*=====================================================*");
        for (Symbol s : symbols) {
            System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%d%n",
                    s.getName(),
                    s.getType(),
                    s.getValue(),
                    s.getScope(),
                    s.getKind(),
                    s.getLineNumber());
            System.out.println("____________________________________________________________________________________");

        }
    }

    // جميع النطاقات
    public static Scope currentScope = null; // النطاق الحالي

    // إنشاء نطاق جديد
    public static void createScope(String name) {
        Scope newScope = new Scope(name, currentScope);
        scopes.add(newScope);
        currentScope = newScope; // تحديث النطاق الحالي
        //  System.out.println("Scope created: " + name);
    }

    //    // إنهاء النطاق الحالي
    public static void endCurrentScope() {
        if (currentScope != null) {
            //     System.out.println("Scope ended: " + currentScope.getName());
            currentScope = currentScope.getParentScope(); // العودة إلى النطاق الأب
        } else {
            System.out.println("No scope to end!");
        }
    }

    // إضافة رمز إلى النطاق الحالي
    public static void addSymbolToCurrentScope(String name, String type, String value, int lineNum) {
        if (currentScope == null) {
            System.out.println("No current scope to add symbol!");
            return;
        }
        Symbol symbol = new Symbol(name, type, value, currentScope.getName(), lineNum);
        currentScope.addSymbol(symbol);
    }

    public static List<Scope> getScopes() {
        return scopes;
    }

    // البحث عن رمز في النطاقات
    public static Symbol findSymbol(String name) {
        Scope scope = currentScope;
        while (scope != null) {
            Symbol symbol = scope.findSymbol(name);
            if (symbol != null) {
                return symbol;
            }
            scope = scope.getParentScope(); // الانتقال إلى النطاق الأب
        }
        return null; // إذا لم يتم العثور على الرمز
    }

    // طباعة جميع النطاقات
    public static void printScopes() {
        for (Scope scope : scopes) {
            System.out.println(scope);
        }
    }
    public static boolean isDeclaredBefore(String scopeName, String variableName, String currentVarName) {
        for (Scope scope : scopes) {
            if (scope.getName().equals(scopeName)) {
                List<Symbol> scopeSymbols = scope.getSymbols();
                boolean foundCurrent = false;
                for (Symbol symbol : scopeSymbols) {
                    if (symbol.getName().equals(variableName)) {
                        return true; // تم تعريفه قبل
                    }
                    if (symbol.getName().equals(currentVarName)) {
                        foundCurrent = true;
                        break; // توقف: وصلنا للمتحول الحالي قبل ما نلاقي المتحول المطلوب
                    }
                }
                // إذا ما وجدنا المتحول ضمن هذا الـ scope، نبحث في الأب
                if (scope.getParentScope() != null) {
                    return isDeclaredBefore(scope.getParentScope().getName(), variableName, currentVarName);
                }
            }
        }
        return false;
    }
}