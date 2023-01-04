package i_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tang
 * @Date 2022-12-30-13:41
 */
public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String s) {
        parts.add(s);
    }

    public void show() {
        for (String p : parts) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
