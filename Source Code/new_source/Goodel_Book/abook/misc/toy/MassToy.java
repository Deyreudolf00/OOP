/*
 * MassToy.java
 *
 * Created on May 18, 2003, 6:27 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  C++ Program Design : An Introduction to Programming and Object Oriented Design
 *  James P Cohon dan Jack W Davidson, page 95
 *  Exercise 2.7
 *
 */

public class MassToy {
    
    private String name = "";
    private double density = 0;
    
    /** Creates a new instance of MassToy */
    public MassToy() {
        
    }
    
    public MassToy(String name, double density) {
        this.name = name;
        this.density = density;
    }
    
    public double getMass(double volume) {
        return density * volume;
    }
    
    public double getDensity() {
        return density;
    }
    
    public double getVolume(double mass) {
        return mass/density;
    }
    
    public String toString(){
        String str = "Benda "+"\n"+
            "Nama benda     = "+name+"\n"+
            "Massa jenis    = "+density+"\n";
        return str;
    }
    
    static void test(){
        MassToy m = new MassToy("Alumium",2.7);
        System.out.println(m);
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
