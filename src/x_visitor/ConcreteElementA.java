package x_visitor;

/**
 * @author Tang
 * @Date 2023-01-04-15:15
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}
