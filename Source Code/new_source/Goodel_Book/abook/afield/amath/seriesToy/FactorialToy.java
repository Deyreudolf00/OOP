/*
 * FactorialToy.java
 *
 * Created on May 18, 2003, 3:16 PM
 */

package abook.afield.amath.seriesToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 212, exercise 5.8
 */

public class FactorialToy {
    
    private int number = 0;
    
    /** Creates a new instance of FactorialToy */
    public FactorialToy() {
    }
    
    public FactorialToy(int number){
        this.number = number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public long get() {
        return calc(number);
    }
    
    static void test(){
        FactorialToy f = new FactorialToy();
        for (int i=0;i<20;i++){
            f.setNumber(i);
            System.out.println("Faktorial dari "+i+" adalah "+f.get());
        }
    }
    
    public static void main(String[] args) {
        test();
    }

    private long calc(int n){
        
        if (n > 1) { 
            return (n * calc(n-1));
        } else { return 1;}
    }
    
}
