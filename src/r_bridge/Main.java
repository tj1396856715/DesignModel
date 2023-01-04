package r_bridge;

/**
 * @author Tang
 * @Date 2023-01-04-10:44
 */
public class Main {
    public static void main(String[] args) {

        Abstraction ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
