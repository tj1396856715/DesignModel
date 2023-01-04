package h_facade;

/**
 * @author Tang
 * @Date 2022-12-30-13:35
 */
public class Facade {

    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void MethodA() {
        System.out.println("方法组A");
        one.methodOne();
        three.methodThree();
    }

    public void MethodB() {
        System.out.println("方法组B");
        two.methodTwo();
        three.methodThree();
    }
}
