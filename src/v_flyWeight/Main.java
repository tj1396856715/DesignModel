package v_flyWeight;

/**
 * @author Tang
 * @Date 2023-01-04-12:57
 */
public class Main {
    public static void main(String[] args) {
        int extrinsicState = 22;
        FlyWeightFactory f = new FlyWeightFactory();
        FlyWeight fx = f.getFlyWeight("X");
        fx.operation(--extrinsicState);

        FlyWeight fy = f.getFlyWeight("Y");
        fy.operation(--extrinsicState);

        FlyWeight fz = f.getFlyWeight("Z");
        fz.operation(--extrinsicState);

        UnSharedConcreteFlyWeight uf = new UnSharedConcreteFlyWeight();
        uf.operation(--extrinsicState);
    }
}
