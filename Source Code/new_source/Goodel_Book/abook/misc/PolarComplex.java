package abook.misc;

public class PolarComplex implements IComplex{
    private double fR;
    private double fTeta;

    /** Creates a new instance of PolarComplex */
    public PolarComplex() {
        fR = 0.0;
        fTeta = 0.0;
    }
    public PolarComplex(double r, double teta) {
        fR = r;
        fTeta = teta;
    }

    public double getIm() {
        return fR * Math.sin(fTeta);
    }

    public double getRe() {
        return fR * Math.cos(fTeta);
    }

    public Complex add(Complex c) {
      // TODO :
      return null;
    }

    public PolarComplex mul(PolarComplex c) {
        double rPart = fR * c.fR;
        double tetaPart = fTeta + c.fTeta - (2 * Math.PI);
        return new PolarComplex(rPart, tetaPart);
    }

    public PolarComplex div(PolarComplex c){
        double rPart = fR / c.fR;
        double tetaPart = fTeta - c.fTeta;
        return new PolarComplex(rPart, tetaPart);
    }

    public Complex sub(Complex c) {
      // TODO :
      return null;
    }

    public boolean equals(IComplex c) {
        return ((c.getR()==fR) && (c.getTeta()==fTeta));
    }

    public double getR() {
        return fR;
    }

    public double getTeta() {
        return fTeta;
    }

}
