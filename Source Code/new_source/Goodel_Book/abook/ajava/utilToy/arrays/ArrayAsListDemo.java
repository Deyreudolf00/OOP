/*
 * ArrayAsListDemo.java
 *
 * Created on January 31, 2004, 11:13 AM
 */

package abook.ajava.utilToy.arrays;
import java.util.Arrays;
import java.util.List;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class ArrayAsListDemo {
    static String[] colors = {"merah", "putih", "hitam", "biru", "coklat", "hitam"};
        
    static void printAll(String str) {
        System.out.println(str);
        System.out.print("  ");
        for (int i=0;i<colors.length;i++) 
            System.out.print(colors[i] + "  ");
        System.out.println("");
    }
    
    static void demo(){
        System.out.println("DEMO memandang array sebagai list");
        printAll("Array di awal : ");
        // Memandang sebagai list
        List list = Arrays.asList(colors);
        
        // Mengubah nilai
        list.set(1,"ungu");
        printAll("Array setelah di-set melalui pandangan sebagai List :");
    }
    
    public static void main (String[] args) {
        demo();
    }

}
