package ast;

import java.util.ArrayList;
import java.util.List;

public class ComponentBody extends Field {
     List<Field> fields;

    public ComponentBody() {
        this.fields = new ArrayList<>();
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    public List<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "ComponentBody{" +"\n" + fields + "\n"+'}';
    }
}
