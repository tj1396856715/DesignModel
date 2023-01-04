package w_interpreter;

/**
 * @author Tang
 * @Date 2023-01-04-14:50
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpreter(Context context) {
        System.out.println("终端解释器");
    }
}
