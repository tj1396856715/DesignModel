package v_flyWeight;

/**
 * @author Tang
 * @Date 2023-01-04-13:08
 */
public class UnSharedConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体Flyweight：" + extrinsicState);
    }
}
