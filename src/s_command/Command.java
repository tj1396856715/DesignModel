package s_command;

/**
 * @author Tang
 * @Date 2023-01-04-11:08
 */
public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
