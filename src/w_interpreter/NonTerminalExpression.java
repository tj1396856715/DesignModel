package w_interpreter;

/**
 * @author Tang
 * @Date 2023-01-04-14:51
 */
public class NonTerminalExpression extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        System.out.println("非终端解释器");
    }

}
