package c_decorator;

/**
 * @author Tang
 * @Date 2022-12-30-12:33
 */
public class DecoratorImplA extends Decorator {

    private String addedState; // DecoratorImplA 特有的，区别于DecoratorImplB

    @Override
    public void Operation() {
        super.Operation();
        // 装饰模式增加其他功能的位置
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
