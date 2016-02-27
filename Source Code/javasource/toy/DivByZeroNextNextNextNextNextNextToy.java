/*
 * DivByZeroNextNextNextNextNextNextToy.java
 *
 * Created on June 1, 2003, 7:32 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DivByZeroNextNextNextNextNextNextToy {
    
    /** Creates a new instance of DivByZeroNextNextNextNextNextNextToy */
    public DivByZeroNextNextNextNextNextNextToy() {
    }
    
    public static void main (String args[]) {
        int anInt = 10;
        try {
            int divBy = args.length;
            int divResult = anInt / divBy;
            
            System.out.println("Hasilnya adalah " + divResult);
            int c[] = {1};
            c[10] = 100;
        }catch (ArithmeticException e) { 
            //menangkap kesalahan div-by-zero
            System.out.println("Terjadi pembagian dengan nol");
            System.out.println("Diatasi blok penanganan A");
        }catch (Exception e) { 
            //menangkap kesalahan 
            System.out.println("Terjadi kesalahan");
            System.out.println("Diatasi blok penanganan B");
        }
        System.out.println("Kalimat setelah catch");
    }
}
