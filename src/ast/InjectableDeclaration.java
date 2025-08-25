package ast;

import java.util.ArrayList;

public class InjectableDeclaration extends Node {
    public String providedIn;

    public InjectableDeclaration(String providedIn) {
        this.providedIn = providedIn;
    }
    @Override
    public String generate() {
        return "@Injectable({ providedIn: '" + providedIn + "' })";
    }


    @Override
    public String toString() {
        return "@Injectable({ providedIn: " + providedIn + " })";
    }
}