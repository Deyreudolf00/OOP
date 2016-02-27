/*
 * DivByZeroNextToy.java
 *
 * Created on June 1, 2003, 7:12 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DivByZeroNextToy {
    
    /** Creates a new instance of DivByZeroNextToy */
    public DivByZeroNextToy() {
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
        }
        System.out.println("Kalimat setelah catch");
    }
}
