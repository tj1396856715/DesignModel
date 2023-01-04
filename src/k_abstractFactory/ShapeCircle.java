package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:20
 */
public class ShapeCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
