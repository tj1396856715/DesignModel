package t_chainOfResponsibility;

/**
 * @author Tang
 * @Date 2023-01-04-11:58
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) { // 只处理[20,30）的请求
            System.out.println("ConcreteHandler3 处理请求:" + request);
        } else if (successor != null) {
            successor.handleRequest(request); // 转发给下一位
        }
    }
}
