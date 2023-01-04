package l_state;

/**
 * @author Tang
 * @Date 2022-12-30-16:35
 */
public class StateImplA extends State {

    @Override
    public void handle(Context context) {
        System.out.println("Player is in stateA");
        context.setState(this);
    }

    public String toString() {
        return "StateA";
    }
}
