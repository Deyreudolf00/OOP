/*
 * ArrayNextToy.java
 *
 * Created on May 31, 2003, 2:58 PM
 */

package abook.ajava.constructToy.array;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class Array01GBP {
    static void test() {
        // Langkah : deklarasi dan inisialisasi
        // sehingga sekaligus juga dilakukan penciptaan 
        int monthDays[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        System.out.println("April mempunyai "+monthDays[3]+" hari.");
    }
    
    public static void main(String args[]){
        test();
    }
}
