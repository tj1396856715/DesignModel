package g_templateMethod;

/**
 * @author Tang
 * @Date 2022-12-30-13:28
 */
public abstract class AbstractClass {

    public abstract void operation1();

    public abstract void operation2();

    public void templateMethod() {
        operation1();
        operation2();
        System.out.println("模板方法固定步骤如上");
    }
}
