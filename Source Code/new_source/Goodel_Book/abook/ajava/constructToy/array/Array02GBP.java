/*
 * Array01GBP.java
 *
 * Created on January 20, 2004, 3:54 AM
 */

package abook.ajava.constructToy.array;

/**
 *
 * @author  bbhariyanto
 */
public class Array02GBP {
    // Deklarasi variabel array
    private final static int monthDays[] = 
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
    static void test(){
        // Mencetak elemen ke empat
        System.out.println("April mempunyai "+monthDays[3]+" hari.");
    }
    
    public static void main(String args[]){
        test();
    }

}
