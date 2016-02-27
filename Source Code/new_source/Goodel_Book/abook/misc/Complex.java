package abook.misc;

public class Complex implements IComplex{
    private double fRe=0.0;
    private double fIm=0.0;

    /** Creates a new instance of Complex */
    public Complex() {
        fRe = 0.0;
        fIm = 0.0;
    }

    public Complex(double re) {
        fRe = re;
        fIm = 0.0;
    }

    public Complex(double re, double im) {
        fRe = re;
        fIm = im;
    }

    public Complex(Complex c) {
        fRe = c.fRe;
        fIm = c.fIm;
    }

    public double getIm() {
        return fIm;
    }

    public double getRe() {
        return fRe;
    }

    public Complex add(Complex ic) {
        Complex c = (Complex) ic;
        double rePart = c.fRe + fRe;
        double imPart = c.fIm + fIm;
        return new Complex(rePart,imPart);
    }

    public Complex sub(Complex c) {
        double rePart = fRe - c.fRe;
        double imPart = fIm - c.fIm;
        return new Complex(rePart, imPart);
    }

    public Complex mul(Complex c) {
        double rePart = (fRe * c.fRe)-(fIm*c.fIm);
        double imPart = (fRe * c.fIm)+(c.fRe * fIm);
        return new Complex(rePart, imPart);
    }

    public Complex div(Complex c) {
        double rePart = ((fRe*c.fRe)+(fIm*c.fIm))/((c.fRe*c.fRe)+(c.fIm*c.fIm));
        double imPart = ((c.fRe*fIm)-(fRe*c.fIm))/((c.fRe*c.fRe)+(c.fIm*c.fIm));

        return new Complex(rePart, imPart);
    }

    public IComplex conjugate(){
        return new Complex(fRe, -fIm);
    }

    public boolean equals(IComplex c) {
        return ((fRe == c.getRe()) && (fIm == c.getIm()));
    }

    public double getR() {
        return Math.sqrt((fRe*fRe)+(fIm+fIm));
    }

    public double getTeta() {
        return Math.atan(fIm/fRe);
    }

    public String toString(){
        String str = "";
        // Keanehan-keanehan yang ditemui bilamana bilangan double
        // berisi -0.0
        /*
        if (fIm == -0.0) {
            System.out.println("fIm = "+fIm);
            System.out.println("fIm >= 0.0 = "+(fIm=0.0));
            System.out.println("fIm == -0.0 = "+(fIm==-0.0));
            str += " + "+fIm+"i";
        }
        */

        if ((fRe == 0.0) || (fRe == -0.0))
            fRe = 0.0;

        if ((fIm == 0.0) || (fIm == -0.0))
            fIm = 0.0;

        if (fRe != 0.0) {
            str += fRe + "";
            if (fIm > 0.0)
                str += "+"+fIm+"i";
            else if (fIm < 0.0)
                str += "-"+(-fIm)+"i";
        } else {
            if (fIm > 0.0)
                str += fIm+"i";
            else if (fIm < 0.0)
                str += "-"+(-fIm)+"i";
            else
                str += 0.0;
        }
        return str;
    }


    static void demo00(){
        System.out.println("Complex(0.0, 0.0) : " + (new Complex(0.0, 0.0)));
        System.out.println("Complex(0.0, 5.0) : " + (new Complex(0.0, 5.0)));
        System.out.println("Complex(0.0, -5.0) : " + (new Complex(0.0, -5.0)));
        System.out.println("Complex(5.0, 0.0) : " + (new Complex(5.0, 0.0)));
        System.out.println("Complex(5.0, 5.0) : " + (new Complex(5.0, 5.0)));
        System.out.println("Complex(5.0, -5.0) : " + (new Complex(5.0, -5.0)));
        System.out.println("Complex(-5.0, 0.0) : " + (new Complex(-5.0, 0.0)));
        System.out.println("Complex(-5.0, 5.0) : " + (new Complex(-5.0, 5.0)));
        System.out.println("Complex(-5.0, -5.0) : " + (new Complex(-5.0, -5.0)));
    }

    static void demo01(){
        Complex c1 = new Complex(8.0, 3.0);
        Complex c2 = new Complex(9.0, -2.0);

        System.out.println("DEMO penjumlahan bilangan kompleks ");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c1 + c2 = "+c1.add(c2));
    }

    static void demo02(){
        Complex c1 = new Complex(8.0, 3.0);
        Complex c2 = new Complex(9.0, -2.0);

        System.out.println("DEMO perkalian bilangan kompleks ");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c1 x c2 = "+c1.mul(c2));
    }

    static void demo03(){
        Complex c1 = new Complex(8.0, 3.0);
        Complex c2 = new Complex(9.0, -2.0);

        System.out.println("DEMO pengurangan bilangan kompleks ");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c1 x c2 = "+c1.sub(c2));
    }

    static void demo04(){
        Complex c1 = new Complex(8.0, 3.0);
        Complex c2 = new Complex(9.0, -2.0);

        System.out.println("DEMO pembagian bilangan kompleks ");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c1 x c2 = "+c1.div(c2));
        System.out.println("66.0/85.0 = "+(66.0/85.0));
        System.out.println("43.0/85.0 = "+(43.0/85.0));
    }

    static void demo05(){
        Complex c1 = new Complex(8.0, 3.0);
        Complex c2 = new Complex(9.0, -2.0);

        System.out.println("DEMO conjugate bilangan kompleks ");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c1.conjugate() = "+c1.conjugate());
        System.out.println("c2.conjugate() = "+c2.conjugate());
    }

    static void demo06() {
        Complex c = new Complex(0.0, -1.0);
        System.out.println("c = "+c);
        System.out.println("c * c = "+c.mul(c));
        System.out.println("c * c * c = "+c.mul(c.mul(c)));
        System.out.println("c * c * c * c = "+c.mul(c.mul(c.mul(c))));
        System.out.println("c * c * c * c * c = "+c.mul(c.mul(c.mul(c.mul(c)))));
    }

    static void demo(){
        demo00();
        // demo01();
        // demo02();
        // demo03();
        // demo04();
        // demo05();
        // demo06();
    }
    public static void main (String[] args){
        demo();
    }
}
