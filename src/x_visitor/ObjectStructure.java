package x_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2023-01-04-15:21
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }
}
