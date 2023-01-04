package e_factoryMethod;

/**
 * @author Tang
 * @Date 2022-12-30-13:00
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
