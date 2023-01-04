package n_memento;

/**
 * @author Tang
 * @Date 2022-12-30-18:34
 */
public class Main {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        // 创建备忘录并保存
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        // 从备忘录恢复
        o.setMemento(caretaker.getMemento());
        o.show();
    }
}
