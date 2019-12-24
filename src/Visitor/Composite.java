package Visitor;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private static char next = 'a';
    private List children = new ArrayList();
    private char letter = next++;

    public void add(Component c) {
        children.add(c);
    }

    public void traverse() {
        System.out.print(letter + " ");
        for (Object aChildren : children) {
            ((Component) aChildren).traverse();
        }
    }
}