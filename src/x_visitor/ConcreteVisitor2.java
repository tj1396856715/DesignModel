package x_visitor;

/**
 * @author Tang
 * @Date 2023-01-04-15:17
 */
public class ConcreteVisitor2 extends Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("concreteElementA被ConcreteVisitor2访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("concreteElementB被ConcreteVisitor2访问");
    }
}
