/*
 * BallToy.java
 *
 * Created on May 18, 2003, 11:18 AM
 */
package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 84
 *  Bola ::
 *    d = 2r
 *    Luas = 4 pi r^2
 *    Vol  = 4/3 pi r^3
 */


public class BallNextToy {
    
    private double radius;
    
    /** Creates a new instance of BallToy */
    public BallNextToy() {
    }
    
    public BallNextToy(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getDiameter(){
        return calcDiameter();
    }
    
    public double getVolume(){
        return calcVolume();
    }
    
    public double getArea(){
        return calcArea();
    }
    
    private double calcDiameter(){
        return 2 * radius;
    }
    
    private double calcVolume() {
        return (4/3 * Math.PI * radius * radius * radius);
    }
    
    private double calcArea() {
        return 4 * Math.PI * radius *radius;
    }
    
    public String toString() {
        String str = 
            "Bola "+"\n"+
            "Radius     = "+radius+"\n"+
            "Diameter   = "+calcDiameter()+"\n"+
            "Luas       = "+calcArea() + "\n"+
            "Volume     = "+calcVolume() + "\n";
        ;
        return str;
    }
    
    static void test(){
        BallNextToy b = new BallNextToy(10);
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        test();
    }
}
