package u_mediator;

/**
 * @author Tang
 * @Date 2023-01-04-12:26
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void notifyMsg(String message);
}
