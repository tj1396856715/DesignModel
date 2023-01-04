package u_mediator;

/**
 * @author Tang
 * @Date 2023-01-04-12:23
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();
        Colleague c1 = new ConcreteColleague1(m);
        Colleague c2 = new ConcreteColleague2(m);
        m.setColleague1(c1);
        m.setColleague2(c2);
        c1.send("吃饭了没有");
        c2.send("莫有啊，你请客吗？");
    }
}
