package i_builder;

/**
 * @author Tang
 * @Date 2022-12-30-13:42
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void builderPartA();

    public abstract void builderPartB();

    public Product build() {
        return product;
    }
}
