package ast;

import java.util.ArrayList;


public class FunctionCall extends Node  implements Expression,Addable<FunctionCall> {
    String functionName;
    ArrayList<Expression> arguments;
    ArrayList<FunctionCall> chainedCalls;

    public FunctionCall(String functionName) {
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
        this.chainedCalls = new ArrayList<>();
    }

    public void addChainedCall(FunctionCall call) {
        this.chainedCalls.add(call);
    }

    @Override
    public void add(Expression child) {
        arguments.add(child);
    }

    @Override
    public void add(FunctionCall item) {
        chainedCalls.add(item);
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
