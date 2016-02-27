/*
 * MathExploreToy.java
 *
 * Created on June 3, 2003, 7:17 PM
 */

package abook.afield.amath.miscToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by Deitel, page 268
 *
 */
public class MathExploreToy {
    
    /** Creates a new instance of MathExploreToy */
    public MathExploreToy() {
    }
    
    static void test(){
        testE();
        testPI();
        testAbs();
    }
    
    static void betterTest(){
        testIntAbs();
    }
    
    static void testE(){
        System.out.println("Testing untuk Math.E");
        System.out.println("Math.E = "+Math.E);
        System.out.println("");
    }
    
    static void testPI(){
        System.out.println("Testing untuk Math.PI");
        System.out.println("Math.PI = "+Math.PI);
        System.out.println("");
    }
    
    static void testAbs(){
        System.out.println("Testing untuk Math.abs()");
        System.out.println("Math.abs(-23.7) = "+Math.abs(-23.7));
        System.out.println("Math.abs(0.0) = "+Math.abs(0.0));
        System.out.println("Math.abs(23.7)  = "+Math.abs(23.7));
        System.out.println("Double.MIN_VALUE = "+Double.MIN_VALUE);
        System.out.println("Math.abs(Double.MIN_VALUE)  = "+Math.abs(Double.MIN_VALUE));
        System.out.println("Math.abs(-Double.MIN_VALUE) = "+Math.abs(-Double.MIN_VALUE));
        System.out.println("Double.MAX_VALUE = "+Double.MAX_VALUE);
        System.out.println("Math.abs(Double.MAX_VALUE)  = "+Math.abs(Double.MAX_VALUE));
        System.out.println("Math.abs(-Double.MAX_VALUE) = "+Math.abs(-Double.MAX_VALUE));
        System.out.println("");
    }
    
    static void testIntAbs(){
        System.out.println("Cara pengujian yang lebih baik - mendukung otomatisasi!");
        System.out.println("Testing untuk Math.abs() bagi bilangan bulat");
        if (Math.abs(-23) != 23) System.out.println("Math(-23) :: Error! Hasil harus 23");
        else System.out.println("Math(-23) :: Correct!");

        if (Math.abs(0) != 0) System.out.println("Math(0) :: Error! Hasil harus 0");
        else System.out.println("Math(0) :: Correct!");
        
        if (Math.abs(23) != 23) System.out.println("Math(23) :: Error! Hasil harus 23");
        else System.out.println("Math(23) :: Correct!");
        
        System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);
        System.out.println("Math.abs(Integer.MIN_VALUE) = "+Math.abs(Integer.MIN_VALUE));
        System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
        if (Math.abs(Integer.MIN_VALUE) != (-Integer.MIN_VALUE)) System.out.println("Math(Integer.MIN_VALUE) :: Error!");
        else System.out.println("Math(Integer.MIN_VALUE) :: Correct!");
        if (Math.abs(Integer.MIN_VALUE) < 0) System.out.println("Math(Integer.MIN_VALUE) :: Error! Hasil harus > 0");
        else System.out.println("Math(Integer.MIN_VALUE) :: Correct!");
        
        if (Math.abs(Integer.MAX_VALUE) != Integer.MAX_VALUE) System.out.println("Math(Integer.MAX_VALUE) :: Error! ");
        else System.out.println("Math(Integer.MAX_VALUE) :: Correct!");
        System.out.println("\n\nPERHATIAN!");
        System.out.println(
            "Pengujian menunjukkan hasil yang tidak sesuai dengan matematika!!!\n"+
            "Pada kondisi batas sangat sulit diprediksi, untuk itu kita harus mengacu dokumentasi bahasa\n"+
            "Pengujian otomatis kadang tidak dapat menemukakannya secara benar karena dibatasi juga\n"+
            "oleh kemampuan bahasa itu sendiri bila kesalahan adalah pada spesifikasi bahasa itu sendiri!\n"+
            "Pengujian otomatis akan benar ditangan yang ahli, pengujian dapat ditambah sbb:\n"+
            "Berdasarkan kenyataan bahwa hasil fungsi abs tidak boleh kurang dari nol"
        );
        
        System.out.println(
            "\n"+
            "Di Java, Math.abs(Integer.MIN_VALUE) justru menghasilkan bilangan negatif. \n"+
            "Melanggar rumus matematika dimana hasil fungsi absolut selalu bernilai positif.\n"+
            "Hasil ini dapat ditelusuri karena representasi int adalah two's complement\n"+
            "Versi yang dipakai penulis :: JDK 1.4"
        );
    }

    static void testAcos(){
        System.out.println("Math.acos(0.9) = " + Math.acos(0.9));
    }
    
    static void testCeil(){
    }
    
    static void testCos(){
    }
    
    static void testExp(){
    }
    
    static void testFloor(){
    }
    
    static void testLog(){
    }
    
    static void testMax(){
    }
    
    static void testMin(){
    }
    
    static void testPow(){
    }
    
    static void testSin(){
    }
    
    static void testSqrt(){
    }
    
    static void testTan(){
    }
 
    public static void main(String[] args){
        test();
        betterTest();
    }
}
