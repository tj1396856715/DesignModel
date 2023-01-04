package r_bridge;

/**
 * @author Tang
 * @Date 2023-01-04-10:53
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
