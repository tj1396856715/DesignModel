package j_observer;

/**
 * @author Tang
 * @Date 2022-12-30-11:33
 */
public class Main {

    public static void main(String[] args) {
        SubjectImpl s = new SubjectImpl();
        s.attach(new ObserverImpl("A", s));
        s.attach(new ObserverImpl("B", s));
        s.attach(new ObserverImpl("c", s));
        s.setSubjectState("ABC");
        s.notice();
        System.out.println("============");
        s.setSubjectState("BCD");
        s.notice();
    }
}
