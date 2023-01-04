package n_memento;

/**
 * @author Tang
 * @Date 2022-12-30-18:36
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
