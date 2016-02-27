/*
 * TrianglePatternToy.java
 *
 * Created on May 18, 2003, 1:08 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 212, exercise 5.10
 */

public class TrianglePatternToy {
    
    private int number;
    
    /** Creates a new instance of TrianglePatternToy */
    public TrianglePatternToy() {
    }
    
    public TrianglePatternToy(int number){
        this.number = number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void printFirstPattern() {
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printSecondPattern() {
        for(int i=0;i<number;i++){
            for(int j=number-0;i<j;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printThirdPattern() {
        for(int i=0;i<number;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<number-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printFourthPattern() {
        for(int i=0;i<number;i++){
            for(int j=0;j<number-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void test(){
        TrianglePatternToy t = new TrianglePatternToy(10);
        t.printFirstPattern();
        System.out.println();
        t.printSecondPattern();
        System.out.println();
        t.printThirdPattern();
        System.out.println();
        t.printFourthPattern();
    }
    
    public static void main(String[] args) {
        test();
    }
}
