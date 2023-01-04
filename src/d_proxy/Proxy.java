package d_proxy;

/**
 * @author Tang
 * @Date 2022-12-30-12:53
 */
public class Proxy extends Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) realSubject = new RealSubject();
        realSubject.request();
    }
}
