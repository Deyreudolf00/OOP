/*
 * ArrayGBP.java
 *
 * Created on January 20, 2004, 3:45 AM
 */

package abook.ajava.constructToy.array;

/**
 *
 * @author  bbhariyanto
 */
public class ArrayGBP {

    static void test(){
        // Langkah 1: deklarasi variabel array
        int monthDays[];
        // Langkah 2: penciptaan array bilangan int dengan elemen 12
        monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 29;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        
        // Mencetak elemen ke empat
        System.out.println("April mempunyai "+monthDays[3]+" hari.");
    }
    
    public static void main(String args[]){
        test();
    }

}
