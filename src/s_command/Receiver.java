package s_command;

/**
 * @author Tang
 * @Date 2023-01-04-11:10
 */
// 知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者
public class Receiver {

    public void action() {
        System.out.println("执行请求");
    }

    public void  action2(){
        System.out.println("执行请求2");
    }
}
