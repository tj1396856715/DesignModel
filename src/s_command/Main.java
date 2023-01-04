package s_command;

/**
 * @author Tang
 * @Date 2023-01-04-11:08
 */
public class Main {
    public static void main(String[] args) {
        Invoker i = new Invoker();// 服务员下命令并通知执行
        Receiver r = new Receiver();// 厨师
        ConcreteCommand c = new ConcreteCommand(r);//命令1
        i.setCommand(c);
        i.executeCommand();
        System.out.println("=======");

        ConcreteCommand2 c2 = new ConcreteCommand2(r);//命令2
        i.setCommand(c2);
        i.executeCommand();
        System.out.println("=======");

        i.cancelCommand(c);
        i.executeCommand();
    }
}
