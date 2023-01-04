package w_interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2023-01-04-14:47
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression exp : list) {
            exp.interpreter(context);
        }
    }
}
