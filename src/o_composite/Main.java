package o_composite;

/**
 * @author Tang
 * @Date 2023-01-02-13:15
 */
public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        Composite comp = new Composite("Composite X");
        root.add(comp);

        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        Composite comp2 = new Composite("Composite XY");
        comp.add(comp2);

        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
