package i_builder;

/**
 * @author Tang
 * @Date 2022-12-30-13:43
 */
public class BuilderImpl1 extends Builder {

    @Override
    public void builderPartA() {
        product.add("部件A");
    }

    @Override
    public void builderPartB() {
        product.add("部件B");
    }

}
