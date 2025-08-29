package ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Statement implements Expression{
    private final String functionName;
    private final List<Node> arguments = new ArrayList<>();
    private final List<FunctionCall> chainedCalls = new ArrayList<>();

    public FunctionCall(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(Node expr) {
        arguments.add(expr);
    }

    public void addChainedCall(FunctionCall call) {
        chainedCalls.add(call);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).generate());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        for (FunctionCall chained : chainedCalls) {
            sb.append(".").append(chained.generate());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(functionName).append("(");
        for (int i = 0; i < arguments.size(); i++) {
            sb.append(arguments.get(i).generate());
            if (i < arguments.size() - 1) sb.append(", ");
        }
        sb.append(")");
        for (FunctionCall chained : chainedCalls) {
            sb.append(".").append(chained.generate());
        }
        return sb.toString();
    }
}
