/*
 * ArrayToy.java
 *
 * Created on May 31, 2003, 2:54 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
class ArrayToy {
    public static void main(String args[]){
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
        System.out.println("April mempunyai "+monthDays[3]+" hari.");
    }
}