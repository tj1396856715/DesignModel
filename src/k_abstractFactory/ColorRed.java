package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:21
 */
public class ColorRed implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
