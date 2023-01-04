package t_chainOfResponsibility;

/**
 * @author Tang
 * @Date 2023-01-04-11:56
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
