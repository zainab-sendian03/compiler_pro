package ast;

public class IfStatement extends AST {
    Expression condition;
    Statement ifBody;
    Statement elseBody;

    public IfStatement(Expression condition, Statement ifBody, Statement elseBody) {
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        String result = "if (" + condition + ") " + "\n" + ifBody;
        if (elseBody != null) {
            result += "\n" + "\t else " + "\n" + "\t" + elseBody;
        }
        return result;
    }
}
