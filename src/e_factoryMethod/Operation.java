package e_factoryMethod;

/**
 * @author Tang
 * @Date 2022-12-30-12:59
 */
public abstract class Operation {

    private double numA;

    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public abstract double getResult();

}
