package i_builder;

/**
 * @author Tang
 * @Date 2022-12-30-13:40
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director(new BuilderImpl1());
        Product product = director.constructProduct();
        product.show();
    }
}
