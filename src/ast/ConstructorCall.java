package ast;

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
        StringBuilder sb = new StringBuilder("new ");
        sb.append(className);
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