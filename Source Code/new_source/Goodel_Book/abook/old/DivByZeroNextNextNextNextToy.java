/*
 * DivByZeroNextNextNextNextToy.java
 *
 * Created on June 1, 2003, 7:19 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DivByZeroNextNextNextNextToy {
    
    /** Creates a new instance of DivByZeroNextNextNextNextToy */
    public DivByZeroNextNextNextNextToy() {
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
        } catch (ArrayIndexOutOfBoundsException e) { 
            //menangkap kesalahan out of bounds
            System.out.println("Terjadi indeks array di luar batas");
            System.out.println("Diatasi blok penanganan B");
        }
        System.out.println("Kalimat setelah catch");
    }
}
