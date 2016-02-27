/*
 * DivByZeroNextNextNextNextNextNextNextToy.java
 *
 * Created on June 1, 2003, 7:34 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DivByZeroNextNextNextNextNextNextNextToy {
    
    /** Creates a new instance of DivByZeroNextNextNextNextNextNextNextToy */
    public DivByZeroNextNextNextNextNextNextNextToy() {
    }
    
    public static void main (String args[]) {
        int zeroInt = 0;
        int anInt = 10;
        
        try {
            int divResult = anInt / zeroInt;
            System.out.println("Hasilnya adalah " + divResult);
        } catch (ArithmeticException e) { 
            //menangkap kesalahan div-by-zero
            System.out.println("Terjadi pembagian dengan nol");
            System.out.println("Diatasi blok penanganan sendiri");
        } finally {
            System.out.println("Kalimat di finally");
        }
        System.out.println("Kalimat di luar blok try-catch-finally");
    }
}
    
