/*
 * ComplexToy.java
 *
 * Created on May 18, 2003, 10:34 AM
 */

package abook.misc.toy;

/**
 *
 * @author  unknown
 */

public class ComplexToy {
    private double re;
    private double im;
    
    static void test(){
	System.out.println("Aplikasi Aritmatika Bilangan Kompleks");
        ComplexToy t1 = new ComplexToy(2.0,2.0);
        ComplexToy t2 = new ComplexToy(1.0,1.0);
	
	System.out.println("Bilangan t1 : "+t1.toString());
	System.out.println("Bilangan t2 : "+t2.toString());
	System.out.println("Penjumlahan bilangan t1 + t2 : ");
	try {
            ComplexToy complex3 = (ComplexToy) t1.clone();
	    complex3.add(t2);
	    System.out.println(complex3.toString());
	} catch (Exception E) {
	    System.out.println("Tidak dapat di-clone: "+E.getMessage());
	}
    }
    
    public static void main (String args[]) {
        test();
    }
    
    // Constructor
    public ComplexToy () {
	re = 0.0;
	im = 0.0;
    }
    
    public ComplexToy (double newRe, double newIm) 
    {
	re = newRe;
	im = newIm;
    }

    public ComplexToy (ComplexToy theC) {
        re = theC.re;
        im = theC.im;
    }
    
    protected Object clone() {
        ComplexToy theComplex = new ComplexToy();
	theComplex.re = re;
	theComplex.im = im;
	return theComplex;
    }

    public String toString() {
	Double reDouble = new Double(re);
	Double imDouble = new Double(im);
	
	return (reDouble.toString() + "+" + imDouble.toString() + "i");
    }

    // Accessing operations
    public void setRe (double newRe) {
	re = newRe;
    }    
    
    public double getRe () {
	return re;
    }
    
    public void setIm (double newIm) {
	im = newIm;
    }
    
    public double getIm () {
	return im;
    }
    
    // Computation operations
    public void add (ComplexToy theComplex) 
    {
	re = re + theComplex.re;
	im = im + theComplex.im;
    }
    
    public void sub (ComplexToy theComplex)
    {
	re = re - theComplex.re;
	im = im - theComplex.im;
    }
    
    // INSTRUKSI:
    // public void mul (ComplexToy theComplex)
    // Buatlah operasi untuk perkalian

    // public void div (ComplexToy theComplex)
    // Buatlah operasi untuk pembagian
}
