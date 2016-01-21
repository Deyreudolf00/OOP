/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstantacircle;

/**
 *
 * @author rengga
 */
public class KonstantaCircle {
    public static final double PHI=3.14;
    
    static void test()
    {
        KonstantaCircle lingkaran = new KonstantaCircle();
        double radius = 100;
        System.out.println("Keliling linkaran berjari-jari " +radius+ "adalah " +lingkaran.calcCircumference(radius));
        System.out.println("Luas lingkaran berjari-jari " +radius+ "adalah " +lingkaran.calcArea(radius));
    }
    static double calcCircumference(double r)
    {
        return(2*PHI*r);
    }
    static double calcArea(double r)
    {
        return(PHI*r*r);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test();
    }
    
}
