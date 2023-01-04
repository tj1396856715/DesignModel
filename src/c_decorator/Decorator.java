package c_decorator;

/**
 * @author Tang
 * @Date 2022-12-30-12:31
 */
public abstract class Decorator extends Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
