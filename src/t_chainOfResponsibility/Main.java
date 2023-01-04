package t_chainOfResponsibility;

/**
 * @author Tang
 * @Date 2023-01-04-11:53
 */
public class Main {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] rs = {2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : rs) {
            h1.handleRequest(request);
        }

    }
}
