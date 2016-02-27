/*
 * LengthToy.java
 *
 * Created on June 8, 2003, 6:55 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by 
 * C. Thomas Wu, An Introduction to Object Oriented Programming with Java
 * Page 131, exercise 8
 */
public class LengthToy {
    public final static int CM = 1;
    public final static int DM = 2;
    public final static int M = 3;
    public final static int KM = 4;
    public final static int INCH = 5;
    
    private double cm;
    
    /** Creates a new instance of Class */
    public LengthToy(double cm) {
        this.cm = cm;
    }
    
    public LengthToy(double val, int unit) {
        switch (unit ){
            case CM : 
                this.cm = val; break;
            case DM :
                this.cm = 10 * val; break;
            case M :
                this.cm = 100 * val; break;
            case KM :
                this.cm = 10000 * val; break;
            case INCH :
                this.cm = 2.54 * val; break;
        }
    }
    
    public double getCM(){
        return (cm);
    }
    
    public double getDM(){
        return (0.1 * cm);
    }
    
    public double getM(){
        return (0.01 * cm);
    }
    
    public double getKM(){
        return (0.0001 * cm);
    }
    
    public double getInch(){
        return ((1/2.54) * cm);
    }
    
    public String toString(){
        String str = 
         "Centimeter  = "+getCM()+"\n"+
         "Decimeter   = "+getDM()+"\n"+
         "Meter       = "+getMeter()+"\n"+
         "Kilometer   = "+getKM()+"\n"+
         "Inch        = "+getInch()+"\n";
        
        return str;
    }
    
    static void test01(){
        System.out.println(new LengthToy(1));
        System.out.println(new LengthToy(10));
        System.out.println(new LengthToy(100));
        System.out.println(new LengthToy(1000));
        System.out.println(new LengthToy(10000));
    }
    
    static void test02(){
        System.out.println(new LengthToy(1, CM));
        System.out.println(new LengthToy(1, DM));
        System.out.println(new LengthToy(1, M));
        System.out.println(new LengthToy(1, KM));
        System.out.println(new LengthToy(1, INCH));
    }
    
    static void test(){
//        test01();
        test02();
    }
    
    public static void main(String[] args){
        test();
    }
}
