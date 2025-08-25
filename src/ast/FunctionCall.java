package ast;

import java.util.ArrayList;

public class FunctionCall extends Node implements Expression {
    public String functionName;
    public ArrayList<Expression> arguments = new ArrayList<>();
    public ArrayList<FunctionCall> chainedCalls = new ArrayList<>();

    public FunctionCall(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(Expression expr) {
        arguments.add(expr);
    }

    public void addChainedCall(FunctionCall call) {
        chainedCalls.add(call);
    }

    public String getFunctionName() {
        return functionName;
    }

    public ArrayList<Expression> getArguments() {
        return arguments;
    }

    public ArrayList<FunctionCall> getChainedCalls() {
        return chainedCalls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i));
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        if (!chainedCalls.isEmpty()) {
            sb.append(".").append(chainedCalls);
        }

        return sb.toString();
    }


}
