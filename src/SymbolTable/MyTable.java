package SymbolTable;
import java.util.*;


public class MyTable {
    private static final List<Property> Property = new ArrayList<>();
    private static final Deque<Scope> scopes = new ArrayDeque<>();
    public static Scope currentScope = null; // النطاق الحالي

    public static Deque<Scope> getScopeStack() {
            return scopes;
    }

    public static Scope getCurrentScope() {
        return scopes.peek();
    }

    public void add(String name,String value,String type, String scope, int lineNum) {
        Property error = new Property(name,value,type,scope ,lineNum);
        Property.add(error);
    }


    public static void createScope(String name) {
        Scope newScope = new Scope(name, currentScope);
        scopes.add(newScope);
        currentScope = newScope; // تحديث النطاق الحالي
        //  System.out.println("Scope created: " + name);
    }

    public static void endCurrentScope() {
        if (currentScope != null) {
            //     System.out.println("Scope ended: " + currentScope.getName());
            currentScope = currentScope.getParentScope(); // العودة إلى النطاق الأب
        } else {
            System.out.println("No scope to end!");
        }
    }
    public  void addSymbolToCurrentScope(String name, String value, String type, int lineNum) {
        Scope currentScope = getCurrentScope();

        if (currentScope == null) {
            System.out.println("No current scope to add symbol!");
            return;
        }
        Symbol symbol = new Symbol(name, type, value, currentScope.getName(), lineNum);
        currentScope.addSymbol(symbol);
    }

    public static void print() {
        System.out.println("Name\t\tValue\t\tType\t\tScope\t\t line");
        System.out.println("*=====================================================*");
        for (Property property : Property) {
            System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%d%n",
                    property.getPropertyName(),
                   property.getValue(),
                   property.getType(),
                   property.getScope(),
                    property.getLine()


            );
            System.out.println("____________________________________________________________________________________");

        }
    }
        }








