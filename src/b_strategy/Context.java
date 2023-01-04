package b_strategy;

/**
 * @author Tang
 * @Date 2022-12-30-11:47
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
