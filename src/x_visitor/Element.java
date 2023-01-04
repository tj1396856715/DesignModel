package x_visitor;

/**
 * @author Tang
 * @Date 2023-01-04-15:14
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
