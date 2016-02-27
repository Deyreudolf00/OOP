/*
 * ArrayInt2DToy.java
 *
 * Created on May 31, 2003, 3:02 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
class ArrayInt2DToy {
    public static void main(String args[]){
        // Langkah 1: deklarasi variabel array dan penciptaan
        int int2DArr[][] = new int[4][5];
        int k=0;
        for (int i=0;i<4;i++) {
            for (int j=0;j<5;j++){
                int2DArr[i][j] = k++;
            }
        }
        for (int i=0;i<4;i++) {
            for (int j=0;j<5;j++){
                System.out.print(int2DArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}