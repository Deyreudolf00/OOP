/*
 * ArrayAverageToy.java
 *
 * Created on May 31, 2003, 3:00 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ArrayAverageToy {
    public static void main(String args[]){
        // Langkah 1: deklarasi, penciptaan, inisialisasi variabel array
        double exam_point[] = {20,30,40,50,60};
        double result = 0;
        for (int i=0;i<5;i++) 
            result = result + exam_point[i];
        System.out.println("Rataan adalah "+result/5);
    }
}