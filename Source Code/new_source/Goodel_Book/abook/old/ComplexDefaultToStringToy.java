/*
 * ComplexDefaultToStringToy.java
 *
 * Created on June 1, 2003, 5:57 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ComplexDefaultToStringToy {
    private double re;
    private double im;
    
    /** Creates a new instance of ComplexDefaultToStringToy */
    public ComplexDefaultToStringToy() {
        re = 0.0;
        im = 0.0;
    }
    
    public ComplexDefaultToStringToy(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    static void test(){
        ComplexDefaultToStringToy t = new ComplexDefaultToStringToy(5.0, -5.0);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
}
