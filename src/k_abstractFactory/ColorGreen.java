package k_abstractFactory;

/**
 * @author Tang
 * @Date 2022-12-30-16:22
 */
public class ColorGreen implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
