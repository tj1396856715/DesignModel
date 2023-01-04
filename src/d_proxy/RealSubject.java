package d_proxy;

/**
 * @author Tang
 * @Date 2022-12-30-12:52
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
