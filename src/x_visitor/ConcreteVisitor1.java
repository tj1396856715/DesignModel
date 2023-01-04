package x_visitor;

/**
 * @author Tang
 * @Date 2023-01-04-15:17
 */
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("concreteElementA被ConcreteVisitor1访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("concreteElementB被ConcreteVisitor1访问");
    }
}
