package p_iterator;

/**
 * @author Tang
 * @Date 2023-01-02-13:54
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.setItems(0, "大鸟");
        a.setItems(1, "小菜");
        a.setItems(2, "行李");
        a.setItems(3, "老外");
        a.setItems(4, "公交内部员工");
        a.setItems(5, "小偷");
        Iterator iterator = a.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + " 请买车票");
            iterator.next();
        }
    }
}
