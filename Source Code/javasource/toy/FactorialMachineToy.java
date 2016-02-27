/*
 * FactorialMachineToy.java
 *
 * Created on May 20, 2003, 6:12 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 212, exercise 5.8
 * Faktorial menggunakan teknik Bertrand Meyer
 * memandang sebagai mesin dengan prosedur
 *  - next
 *  - prev
 *  - get
 *  
 */

public class FactorialMachineToy {
    
    private int number = 0;
    private long result = 1;
    
    /** Creates a new instance of FactorialMachineToy */
    public FactorialMachineToy() {
        reset();
    }
    
    public FactorialMachineToy(int number){
        this.number = number;
        for (int i=0;i<number;i++) next();
    }
    
    public void setNumber(int number) {
        this.number = 1;
        for (int i=0;i<number;i++) next();
    }
    
    public int getNumber() {
        // Angke ke berapa
        return number;
    }
    
    public void next() {
        number++;
        result *= number;
    }
    
    public void prev() {
        result /= number;
        number--;
    }
    
    public long get() {
        return result;
    }
    
    public void clear(){
        reset();
    }
    
    static void test(){
        FactorialMachineToy m = new FactorialMachineToy();
        for(int i=0;i<11;i++){
            System.out.println("Factorial ke "+i+" : "+m.get());
            m.next();
        }
        System.out.println("Bergerak mundur");
        for(int i=m.getNumber();i>0;i--){
            System.out.println("Factorial ke "+i+" : "+m.get());
            m.prev();
        }
    }
    
    public static void main(String[] args) {
        test();
    }

    private void reset(){
        number = 0;
        result = 1;
    }
    
}
