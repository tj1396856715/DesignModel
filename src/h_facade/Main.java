package h_facade;

/**
 * @author Tang
 * @Date 2022-12-30-13:33
 */
public class Main {
    public static void main(String[] args) {
        Facade fa = new Facade();
        fa.MethodA();
        System.out.println("========");
        fa.MethodB();
    }
}
