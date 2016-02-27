/*
 * DiamondPattern.java
 *
 * Created on May 25, 2003, 6:58 AM
 */

package abook.arec.shapeToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DiamondPatternToy {
    
    private int number = 0;
    
    /** Creates a new instance of DiamondPattern */
    public DiamondPatternToy(int number) {
        this.number = number;
    }
    
    static void test(){
        DiamondPatternToy t = new DiamondPatternToy(9);
        t.printDiamond();
    }
    
    public static void main (String[] args){
        test();
    }
    
    void printDiamond(){
        for (int i=0;i<number/2+1;i++){
            // Segitiga atas
            for(int j=0;j<(number/2-i);j++) System.out.print(" ");
            for(int j=0;j<2*i+1;j++) System.out.print("*");
            System.out.println();
        }
                // Segitiga bawah
        for (int i=number/2-1;i>=0;i--){
            for(int j=0;j<(number/2-i);j++) System.out.print(" ");
            for(int j=0;j<2*i+1;j++) System.out.print("*");
            System.out.println();
        }
    }
}
