package a_simpleFactory;

/**
 * @author Tang
 * @Date 2022-12-30-11:53
 */
public class SimpleFactory {

    public static Operation createOperate(String op) {
        Operation oper = null;
        switch (op) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
        }
        return oper;
    }
}
