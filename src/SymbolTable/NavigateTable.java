    package SymbolTable;

    import java.util.*;

    public class NavigateTable {
        private static final List<NavigateSymbol> navigateSymbols = new ArrayList<>();

        public static void addNavigate(String value, String type, int lineNum) {
            NavigateSymbol sym = new NavigateSymbol(value, type, lineNum);
            navigateSymbols.add(sym);
        }

        public static List<NavigateSymbol> getAllNavigates() {
            return new ArrayList<>(navigateSymbols);
        }
        public static void print() {
            System.out.println("Value\t\ttype\t\tline");
            System.out.println("*=========================================*");
            for (NavigateSymbol s : navigateSymbols) {
                System.out.printf("%s\t\t%s\t\t%s",
                        s.getValue(),
                        s.getType(),
                        s.getLineNumber()
                    );
                System.out.println( );
                System.out.println("____________________________________________________________________________________");

            }
        }

    }
