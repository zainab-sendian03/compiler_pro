package ast;

import java.util.ArrayList;
import java.util.List;

public class ComponentBody extends Node implements Addable<Field>{
    List<Field> fields;

    public ComponentBody() {
        this.fields = new ArrayList<>();
    }


    public List<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "ComponentBody{" +"\n" + fields + "\n"+'}';
    }

    @Override
    public void add(Field item) {
        fields.add(item);
    }
}