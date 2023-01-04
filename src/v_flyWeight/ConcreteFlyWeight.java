package v_flyWeight;

/**
 * @author Tang
 * @Date 2023-01-04-13:07
 */
public class ConcreteFlyWeight extends FlyWeight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体FlyWeight：" + extrinsicState);
    }
}
