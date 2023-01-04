package s_command;

/**
 * @author Tang
 * @Date 2023-01-04-11:11
 */
// 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现Execute
public class ConcreteCommand2 extends Command {

    public ConcreteCommand2(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action2();
    }

}
