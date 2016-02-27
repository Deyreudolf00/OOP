package abook.misc;

public class Quadratic implements IQuadratic {

    private double fA;

    private double fB;

    private double fC;

    private double fD;

    private double fX1;

    private double fX2;

    private boolean fValid = false;

    /** Creates a new instance of SquareEq */
    public Quadratic() {
    }

    public Quadratic(double a, double b, double c) {
        fA = a;
        fB = b;
        fC = c;

        calc();

    }

    public double getA() {
        return fA;
    }

    public double getB() {
        return fB;
    }

    public double getC() {
        return fC;
    }

    public double getD() {
        return fD;
    }

    public double getX1() {
        return fX1;
    }

    public double getX2() {
        return fX2;
    }

    public boolean isValid() {
        return fValid;
    }

    public void setA(double a) {
        fA = a;
        fValid = false;
    }

    public void setB(double b) {
        fB = b;
        fValid = false;
    }

    public void setC(double c) {
        fC = c;
        fValid = false;
    }

    public void execute() {
        calc();
    }

    private void calc() {
        calcD();
        if (fD >= 0.0) {
            fValid = true;
            fX1 = (-fB + Math.sqrt(fD))/(2*fA);
            fX2 = (-fB - Math.sqrt(fD))/(2*fA);
        }
    }

    private void calcD() {
        fD = (fB * fB) - (4 * fA * fC);
    }

}
