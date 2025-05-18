package ast;

import java.util.ArrayList;


public class FunctionCall extends Expression {
    String functionName;
    ArrayList<Expression> arguments;
    ArrayList<FunctionCall> chainedCalls;

    public FunctionCall(String functionName) {
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
        this.chainedCalls = new ArrayList<>();
    }

    public void addArgument(Expression argument) {
        this.arguments.add(argument);
    }

    public void addChainedCall(FunctionCall call) {
        this.chainedCalls.add(call);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).toString());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}
