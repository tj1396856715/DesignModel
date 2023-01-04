package j_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2022-12-30-11:11
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void notice() {
        for (Observer ob : list) {
            ob.update();
        }
    }
}
