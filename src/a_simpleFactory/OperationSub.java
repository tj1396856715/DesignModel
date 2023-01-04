package a_simpleFactory;

/**
 * @author Tang
 * @Date 2022-12-30-11:53
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return super.getNumA() - super.getNumB();
    }
}
