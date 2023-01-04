package u_mediator;

/**
 * @author Tang
 * @Date 2023-01-04-12:27
 */
public class ConcreteMediator extends Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1){
            colleague2.notifyMsg(message);
        }else {
            colleague1.notifyMsg(message);
        }
    }
}
