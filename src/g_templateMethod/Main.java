package g_templateMethod;

/**
 * @author Tang
 * @Date 2022-12-30-13:28
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();
        System.out.println("=============");
        c = new ConcreteClassB();
        c.templateMethod();

    }
}
