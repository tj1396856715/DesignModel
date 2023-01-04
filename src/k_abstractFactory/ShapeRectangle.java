package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:19
 */
public class ShapeRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
