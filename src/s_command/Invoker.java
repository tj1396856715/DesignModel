package s_command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2023-01-04-11:10
 */
// 要求该命令执行该请求
public class Invoker {

    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void cancelCommand(Command command) {
        System.out.println("取消命令");
        commands.remove(command);
    }

    public void executeCommand() {
        for (Command c : commands) {
            c.execute();
        }
    }
}
