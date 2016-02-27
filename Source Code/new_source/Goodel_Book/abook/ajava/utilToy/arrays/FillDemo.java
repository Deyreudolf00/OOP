/*
 * FillDemo.java
 *
 * Created on February 20, 2004, 2:44 AM
 */

package abook.ajava.utilToy.arrays;
import java.util.Arrays;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class FillDemo {
    static int ia[];
    
    static void initArray() {
        ia = new int[10];
        for (int i=0;i<10;i++) {
            ia[i] = -3 * i;
        }
        printAll("Array awal : ");
    }
    
    static void printAll(String str) {
        System.out.println(str);
        System.out.print("  ");
        for (int i=0;i<ia.length;i++) 
            System.out.print(ia[i] + "\t");
        System.out.println("");
    }
    
    static void demo(){
        System.out.println("DEMO Arrays.fill()");
        
        // alokasi dan inisialisasi array
        initArray();
        
        // isi dan tampilkan
        Arrays.fill(ia, 2, 6, -1);
        printAll("Setelah fill() : ");
    }
    
    public static void main (String[] args) {
        demo();
    }
}
