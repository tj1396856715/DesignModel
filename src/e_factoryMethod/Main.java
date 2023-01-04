package e_factoryMethod;

/**
 * @author Tang
 * @Date 2022-12-30-12:56
 */
public class Main {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNumA(1);
        operation.setNumB(2);
        System.out.println(operation.getResult());
        System.out.println("============");
        IFactory factory2 = new SubFactory();
        Operation operation2 = factory2.createOperation();
        operation2.setNumA(1);
        operation2.setNumB(2);
        System.out.println(operation2.getResult());
    }
}
