/*
 * DivByZeroNextNextNextToy.java
 *
 * Created on June 1, 2003, 7:17 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DivByZeroNextNextNextToy {
    
    /** Creates a new instance of DivByZeroNextNextNextToy */
    public DivByZeroNextNextNextToy() {
    }
    
    public static void main (String args[]) {
        int anInt = 10;
        for (int zeroInt =-1;zeroInt<2;zeroInt++){
            try {
                int divResult = anInt / zeroInt;
                System.out.println("Hasilnya adalah " + divResult);
            }catch (ArithmeticException e) { 
                //menangkap kesalahan div-by-zero
                System.out.println("Pesan di exception: "+e);
                System.out.println("Terjadi pembagian dengan nol");
                System.out.println("Diatasi blok penanganan sendiri");
            }
            System.out.println("Kalimat setelah catch");
        }
    }
}
