package t_chainOfResponsibility;

/**
 * @author Tang
 * @Date 2023-01-04-11:58
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) { // 只处理[10,20）的请求
            System.out.println("ConcreteHandler2 处理请求:" + request);
        } else if (successor != null) {
            successor.handleRequest(request); // 转发给下一位
        }
    }
}
