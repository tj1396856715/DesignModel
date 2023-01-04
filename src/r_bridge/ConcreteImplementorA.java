package r_bridge;

/**
 * @author Tang
 * @Date 2023-01-04-10:49
 */
public class ConcreteImplementorA implements Implementor {

    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }

}
