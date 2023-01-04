package e_factoryMethod;

/**
 * @author Tang
 * @Date 2022-12-30-13:07
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return super.getNumA() - super.getNumB();
    }
}
