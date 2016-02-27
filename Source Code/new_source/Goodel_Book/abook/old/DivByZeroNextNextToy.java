/*
 * DivByZeroNextNextToy.java
 *
 * Created on June 1, 2003, 7:15 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DivByZeroNextNextToy {
    
    /** Creates a new instance of DivByZeroNextNextToy */
    public DivByZeroNextNextToy() {
    }

    public static void main (String args[]) {
        int anInt = 10;
        for (int zeroInt =-1;zeroInt<2;zeroInt++){
            try {
                int divResult = anInt / zeroInt;
                System.out.println("Hasilnya adalah " + divResult);
            }catch (ArithmeticException e) { 
                //menangkap kesalahan div-by-zero
                System.out.println("Terjadi pembagian dengan nol");
                System.out.println("Diatasi blok penanganan sendiri");
            }
            System.out.println("Kalimat setelah catch");
        }
    }
}
