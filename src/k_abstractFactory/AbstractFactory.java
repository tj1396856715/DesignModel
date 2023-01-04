package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:22
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
