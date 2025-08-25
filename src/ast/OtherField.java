    package ast;


    public class OtherField extends Field {
         String name;
        Expression value;

        public OtherField(String name, Expression value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Expression getValue() {
            return value;
        }
        @Override
        public String generate() {
            return "";
        }

        @Override
        public String toString() {
            return name + ": " + value;
        }
    }
