/*
 * BMIToy.java
 *
 * Created on June 8, 2003, 7:12 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * C. Thomas Wu, An Introduction to Object Oriented Programming with Java
 * Page 131, exercise 11
 * BMI = Body Mass Index
 *   w dalam kilogram
 *   h dalam meter
 */

public class BMIToy {
    private double w;
    private double h;
    
    /** Creates a new instance of BMIToy */
    public BMIToy(double w, double h) {
        this.w = w;
        this.h = h;
    }
    
    public double getBMI(){
        return (w/(h*h));
    }
    
    public String toString(){
        String str = 
         "Berat   = "+w+"\n"+
         "Tinggi  = "+h+"\n"+
         "BMI     = "+getBMI()+"\n";
        return str;
    }
    
    static void test(){
        BMIToy t = new BMIToy(60,1.65);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
    
}
