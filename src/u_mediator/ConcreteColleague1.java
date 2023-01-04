package u_mediator;

/**
 * @author Tang
 * @Date 2023-01-04-12:30
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("中介者中转了：" + message);
        mediator.send(message, this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事1得到信息：" + message);

    }
}
