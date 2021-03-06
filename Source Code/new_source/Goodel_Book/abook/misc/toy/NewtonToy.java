/*
 * NewtonToy.java
 *
 * Created on June 8, 2003, 7:39 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * C. Thomas Wu, An Introduction to Object Oriented Programming with Java
 * Page 136, exercise 20
 */

public class NewtonToy {
    public final double K = 6.67e-8;
    
    private double m1;
    private double m2;
    private double d;
    
    /** Creates a new instance of NewtonToy */
    public NewtonToy(double m1, double m2, double d) {
        this.m1 = m1;
        this.m2 = m2;
        this.d = d;
    }
    
    public double getM1(){
        return m1;
    }
    
    public double getM2(){
        return m2;
    }
    
    public double getD(){
        return d;
    }
    
    public double getForce(){
        return (K *(m1*m2)/(d*d));
    }
    
    public String toString(){
        String str = 
          "Hukum Newton = \n"+
          "Massa 1 = "+getM1()+" gram\n"+
          "Massa 2 = "+getM2()+" gram\n"+
          "Jarak   = "+getD()+" cm\n"+
          "Gaya    = "+getForce()+" dyne cm2/gram2";
        return str;
    }
    
    static void test(){
        NewtonToy t = new NewtonToy(5.983e27,7.347e25,3.844e10);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
    
}
