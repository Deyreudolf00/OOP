/*
 * PiCalculationToy.java
 *
 * Created on May 18, 2003, 1:35 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 213, exercise 5.16
 */

public class PiCalculationToy {
    
    private int numberOfTerm;
    private double buffer=0.0;
    
    /** Creates a new instance of PiCalculationToy */
    public PiCalculationToy(int numberOfTerm){
        this.numberOfTerm = numberOfTerm;
    }
    
    public void setNumberOfTerm(int numberOfTerm) {
        this.numberOfTerm = numberOfTerm;
    }
    
    public int getNumberOfTerm() {
        return numberOfTerm;
    }
    
    public double getPI(){
        return calcPI();
    }
    
    public String toString(){
        String str = 
            "Pi "+getNumberOfTerm()+" suku = "+getPI();
        return str;
    }
    
    static void test(){
        System.out.println(new PiCalculationToy(5));
        System.out.println(new PiCalculationToy(10));
        System.out.println(new PiCalculationToy(15));
        System.out.println(new PiCalculationToy(20));
        System.out.println(new PiCalculationToy(30));
        System.out.println(new PiCalculationToy(40));
        System.out.println(new PiCalculationToy(50));
        System.out.println(new PiCalculationToy(100));
        System.out.println(new PiCalculationToy(200));
        System.out.println(new PiCalculationToy(400));
        System.out.println(new PiCalculationToy(500));
        System.out.println(new PiCalculationToy(1000));
        System.out.println(new PiCalculationToy(2000));
        System.out.println(new PiCalculationToy(5000));
        System.out.println(new PiCalculationToy(10000));
        System.out.println(new PiCalculationToy(20000));
        System.out.println(new PiCalculationToy(50000));
        
        PiCalculationToy p = new PiCalculationToy(100000);
        System.out.println(p);
        System.out.println("Pi dari Math.PI  = "+Math.PI);
        System.out.println("Selisih absolut adalah = "+Math.abs(Math.PI-p.getPI()));
    }
    
    public static void main(String[] args) {
        test();
    }
    
    private double calcPI() {
        double pi = 4.0;
        double num = 4.0;
        double denom = 3.0;
        
        double sign = -1.0;
        for(int i=0;i<numberOfTerm;i++){
            double term = (sign * num / denom);
            pi += term;
            denom += 2.0;
            sign *= -1.0;
        }
        buffer = pi;
        return pi;
    }
}
