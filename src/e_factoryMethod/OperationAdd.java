package e_factoryMethod;


/**
 * @author Tang
 * @Date 2022-12-30-13:01
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return super.getNumA() + super.getNumB();
    }
}
