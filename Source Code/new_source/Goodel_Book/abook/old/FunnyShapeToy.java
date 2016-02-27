/*
 * FunnyShapeToy.java
 *
 * Created on May 18, 2003, 12:15 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 78, exercise 2.20
 */

public class FunnyShapeToy {
    
    private int number;
    
    /** Creates a new instance of FunnyShapeToy */
    public FunnyShapeToy() {
    }
    
    public FunnyShapeToy(int number){
        this.number = number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void printBox() {
        for(int i=0;i<number;i++){
            if (i==0 || i==number-1) {
                for (int j=0;j<number;j++) System.out.print("*");
            } else {
                System.out.print("*");
                for(int j=0;j<number-2;j++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printOval() {
        
    }
    
    public void printArrow() {
    }
    
    public void printDiamont(){
    }
    
    static void test(){
        FunnyShapeToy f = new FunnyShapeToy(9);
        f.printBox();
    }
    
    public static void main(String args[]){
        test();
    }
}
