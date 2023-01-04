package a_simpleFactory;

/**
 * @author Tang
 * @Date 2022-12-30-11:53
 */
public class Main {
    public static void main(String[] args) {
        Operation operate = SimpleFactory.createOperate("+");
        operate.setNumA(1);
        operate.setNumB(2);
        System.out.println(operate.getResult());
    }
}
