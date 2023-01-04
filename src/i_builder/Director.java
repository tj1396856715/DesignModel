package i_builder;

/**
 * @author Tang
 * @Date 2022-12-30-13:46
 */
// 指挥者 指定制作流程 返回产品
public class Director {

    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //如何处理建造产品的流程，交给了指挥者
    public Product constructProduct() {
        builder.builderPartA();
        builder.builderPartB();
        return builder.build();
    }
}
