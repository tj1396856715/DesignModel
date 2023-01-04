package r_bridge;

/**
 * @author Tang
 * @Date 2023-01-04-10:55
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        System.out.println("重定义抽象类后执行方法");
        super.operation();
    }
}
