package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:24
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new ColorRed();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new ColorGreen();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new ColorBlue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
