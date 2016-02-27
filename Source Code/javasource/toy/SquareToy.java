/*
 * SquareToy.java
 *
 * Created on May 18, 2003, 10:58 AM
 */

package toy;

/**
 *
 * @author  unknown
 */
public class SquareToy {
    
    private double side = 0;
    
    /** Creates a new instance of SquareToy */
    public SquareToy() {
    }
    
    public SquareToy(double side) {
        this.side = side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public double calcCircumference() {
        return (4 * side);
    }
    
    public double calcArea() {
        return (side * side);
    }
    
    public double calcDiagonal() {
        return (Math.sqrt(side*side + side*side));
    }
    
    public String toString(){
        String str = 
            "Bujur sangkar "+"\n"+
            "Panjang sisi     = " + side + "\n"+
            "Panjang diagonal = " + calcDiagonal() + "\n" +
            "Keliling         = " + calcCircumference() + "\n" +
            "Luas             = " + calcArea() ;
        return str;
    }
    
    static void test(){
        SquareToy s = new SquareToy(10);
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
