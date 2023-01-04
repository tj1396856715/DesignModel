package c_decorator;

/**
 * @author Tang
 * @Date 2022-12-30-12:35
 */
public class DecoratorImplB extends Decorator {

    @Override
    public void Operation() {
        super.Operation();
        // 封装对象B的操作
        behaviorB();
        System.out.println("具体装饰对象B的操作");
    }

    private void behaviorB() {
        System.out.println("对象B的行为");
    }
}
