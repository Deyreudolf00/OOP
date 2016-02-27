/*
 * TrianglePatternSideBySideToy.java
 *
 * Created on May 25, 2003, 6:25 AM
 */

package toy;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 212, exercise 5.18
 */

public class TrianglePatternSideBySideToy {
    
    private int number;
    
    /** Creates a new instance of TrianglePatternToy */
    public TrianglePatternSideBySideToy() {
    }
    
    public TrianglePatternSideBySideToy(int number){
        this.number = number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    
    public void printPattern(){
        for(int i=0;i<number;i++){
            // Segitiga pertama
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            
            // Spasi antara segitiga ke satu dan kedua
            for (int j=i;j<number+1;j++) System.out.print(" ");
            
            // Segitiga kedua
            for(int j=number-0;i<j;j--){
                System.out.print("*");
            }
            
            // Spasi antara segitiga kedua dan ketiga
            for (int j=0;j<i+1;j++) System.out.print(" ");
            
            // Spasi antara segitiga kedua dan ketiga
            for (int j=0;j<i+1;j++) System.out.print(" ");
            
            // Segitiga ketiga
            for(int j=0;i<j;j++){
                System.out.print(" ");
            }
            for(int j=0;j<number-i;j++) {
                System.out.print("*");
            }
            

            // Spasi antara segitiga ketiga dan keempat
            // Kenapa harus di-loop, biar serupa aja dengan yang diatas!
            for (int j=0;j<1;j++) System.out.print(" ");
            
            // Segitiga keempat
            for(int j=0;j<number-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            
            // Ganti baris
            System.out.println();
        }
    }
   
    static void test(){
        TrianglePatternSideBySideToy t = new TrianglePatternSideBySideToy(10);
        t.printPattern();
    }
    
    public static void main(String[] args) {
        test();
    }
}
