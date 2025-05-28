package ast;

import java.util.ArrayList;

public class ParameterList extends Node  {
    private final ArrayList<Parameter> parameters;

    public ParameterList() {
        this.parameters = new ArrayList<>();
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public String toString() {
        return parameters.toString();
    }
}
