package p_iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2023-01-02-13:58
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object getObject(int index) {
        return items.get(index);
    }

    public void setItems(int index, Object value) {
        items.add(index, value);
    }

}
