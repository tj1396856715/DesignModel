package o_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2023-01-02-13:21
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
