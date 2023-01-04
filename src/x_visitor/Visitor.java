package x_visitor;

/**
 * @author Tang
 * @Date 2023-01-04-15:13
 */
public abstract class Visitor {
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
