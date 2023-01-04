package b_strategy;

/**
 * @author Tang
 * @Date 2022-12-30-11:45
 */
public class Main {

    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyImplA());
        context.contextInterface();
        System.out.println("================");
        context = new Context(new StrategyImplB());
        context.contextInterface();
    }

}
