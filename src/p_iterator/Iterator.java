package p_iterator;

/**
 * @author Tang
 * @Date 2023-01-02-13:55
 */
public interface Iterator {

    Object first();

    Object next();

    boolean isDone();

    Object currentItem();
}
