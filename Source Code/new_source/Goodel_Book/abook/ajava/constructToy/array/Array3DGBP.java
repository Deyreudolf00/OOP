/*
 * Array3DGBP.java
 *
 * Created on May 31, 2003, 3:14 PM
 */

package abook.ajava.constructToy.array;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
class Array3DGBP {
    static void test() {
        // Deklarasi dan alokasi
        int int3DArr[][][] = new int[3][4][5];
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++){
                for (int k=0;k<5;k++) {
                    int3DArr[i][j][k] = i * j * k;
                }
            }
        }
        
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++){
                for (int k=0;k<5;k++) {
                    System.out.print(int3DArr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        test();
    }
}
