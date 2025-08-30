package ast;

import java.util.ArrayList;

public class ConstructorCall extends Node implements Expression {
    private final String className;           // اسم الـ class يلي عم يناديه new
    private final Expression argument;        // التعبير الموجود بين القوسين ()
    private final Expression genericType;     // إذا فيه <arrayLiteral>

    public ConstructorCall(String className, Expression argument, Expression genericType) {
        this.className = className;
        this.argument = argument;
        this.genericType = genericType;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        // إذا كان BehaviorSubject → SimpleSubject
        if ("BehaviorSubject".equals(this.className)) {
            sb.append("new SimpleSubject(");

            if (argument != null) {
                // نتأكد إذا الـ argument هو ArrayLiteral
                if (argument instanceof ArrayLiteral) {
                    ArrayLiteral arr = (ArrayLiteral) argument;
                    ArrayList<String> items = new ArrayList<>();

                    for (Expression elem : arr.getElements()) {
                        if (elem instanceof ObjectLiteral) {
                            ObjectLiteral obj = (ObjectLiteral) elem;

                            // نحول كل PropertyAssignment إلى قيمة للـ constructor
                            ArrayList<String> values = new ArrayList<>();
                            for (Expression prop : obj.properties) {
                                values.add(((Node) prop).generate());
                            }

                            // نفترض ترتيب الخصائص: name, image, details
                            items.add("new Product(" + String.join(", ", values) + ")");
                        } else {
                            // أي عنصر آخر نولده كما هو
                            items.add(((Node) elem).generate());
                        }
                    }

                    sb.append("[" + String.join(", ", items) + "]");
                } else {
                    sb.append(((Node) argument).generate());
                }
            }

            sb.append(")");
            return sb.toString();
        }

        // الحالة العادية
        sb.append("new ").append(className);
        if (genericType != null) {
            sb.append("<" + ((Node) genericType).generate() + ">");
        }
        sb.append("(");
        if (argument != null) {
            sb.append(((Node) argument).generate());
        }
        sb.append(")");
        return sb.toString();
    }




    @Override
    public String toString() {
        return "new " + className
                + ( "<" + genericType + ">")
                + "(" + argument + ")\n";
    }



}
