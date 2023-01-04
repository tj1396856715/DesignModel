package m_adapter;

/**
 * @author Tang
 * @Date 2022-12-30-18:20
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();// 这样表面上调用的是request(),实际上调用specificRequest
    }
}
