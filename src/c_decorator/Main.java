package c_decorator;

/**
 * @author Tang
 * @Date 2022-12-30-12:00
 */
public class Main {
    public static void main(String[] args) {
        ComponentImpl c = new ComponentImpl();
        DecoratorImplA da = new DecoratorImplA();
        DecoratorImplB db = new DecoratorImplB();
        da.setComponent(c);
        db.setComponent(da);
        db.Operation();
    }
}
