package a_simpleFactory;

/**
 * @author Tang
 * @Date 2022-12-30-11:53
 */
public abstract class Operation {

    private double numA = 0;
    private double numB = 0;

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
