package x_visitor;

/**
 * @author Tang
 * @Date 2023-01-04-15:15
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
        operationB();
    }

    public void operationB(){
        System.out.println("elementB's operationB");
    }
}
