/*
 * GravityToy.java
 *
 * Created on June 8, 2003, 7:18 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * C. Thomas Wu, An Introduction to Object Oriented Programming with Java
 * Page 131, exercise 12
 */

public class GravityToy {
    public final double EARTH = 1;
    public final double MERCURY = 0.4;
    public final double JUPITER = 2.5;
    public final double SATURN = 1.1;
    
    private double weigth;
    
    /** Creates a new instance of GravityToy */
    public GravityToy(double weigth) {
        this.weigth = weigth;
    }
    
    public double getEarth(){
        return weigth;
    }
    
    public double getMercury(){
        return (MERCURY * weigth);
    }
    
    public double getJupiter(){
        return (JUPITER * weigth);
    }
    
    public double getSaturn(){
        return (SATURN * weigth);
    }
    
    public String toString(){
        String str = 
         "Berat "+"\n"+
         " Di bumi       = "+getEarth()+"\n"+
         " Di Merkurius  = "+getMercury()+"\n"+
         " Di Yupiter    = "+getJupiter()+"\n"+
         " Di Saturnus   = "+getSaturn();
        return str;
    }
    
    static void test(){
        GravityToy t = new GravityToy(55);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
}
