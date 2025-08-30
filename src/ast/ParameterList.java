package ast;

import java.util.ArrayList;

public class ParameterList extends Node {
    public ArrayList<Parameter> parameters = new ArrayList<>();

    public void add(Parameter param) {
        parameters.add(param);
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i).generate());
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameters.size(); i++) {
            sb.append(parameters.get(i));
            if (i < parameters.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
