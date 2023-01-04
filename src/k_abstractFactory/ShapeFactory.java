package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:23
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new ShapeCircle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new ShapeRectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new ShapeCircle();
        }
        return null;
    }
}
