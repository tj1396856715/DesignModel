package e_factoryMethod;

/**
 * @author Tang
 * @Date 2022-12-30-13:06
 */
public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
