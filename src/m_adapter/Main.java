package m_adapter;

/**
 * @author Tang
 * @Date 2022-12-30-18:17
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
