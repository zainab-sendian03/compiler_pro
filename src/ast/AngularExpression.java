package ast;

public class AngularExpression extends Node {
    private String expression;

    public AngularExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
    @Override
    public String generate() {
        return "{{" + expression + "}}";
    }
    @Override
    public String toString() {
        return "AngularExpression:"  + expression ;
    }}
