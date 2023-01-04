package l_state;

/**
 * @author Tang
 * @Date 2022-12-30-16:32
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State stateImplA = new StateImplA();
        stateImplA.handle(context);
        System.out.println(context.getState().toString());

        State stateImplB = new StateImplB();
        stateImplB.handle(context);
        System.out.println(context.getState().toString());
    }
}
