/*
 * FibonacciAltToy.java
 *
 * Created on June 3, 2003, 5:49 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class  FibonacciAltToy{
    
    private long prevResult;
    private long currentResult;
    private long currentNr;
    
    /** Creates a new instance of  */
    public FibonacciAltToy() {
        reset();
    }
    
    static void test01(){
        FibonacciAltToy t = new FibonacciAltToy();
        
        System.out.println("NEXT");
        System.out.println(t.getNumber());
        t.next();
        System.out.println(t.getNumber());
        t.next();
        System.out.println(t.getNumber());
        t.next();
        System.out.println(t.getNumber());
        t.next();
        System.out.println(t.getNumber());
        t.next();
        System.out.println(t.getNumber());
        
        System.out.println("PREV");
        System.out.println(t.getNumber());
        t.prev();
        System.out.println(t.getNumber());
        t.prev();
        System.out.println(t.getNumber());
        t.prev();
        System.out.println(t.getNumber());
        t.prev();
        System.out.println(t.getNumber());
        t.prev();
        System.out.println(t.getNumber());
    }
    
    static void test02(){
        FibonacciAltToy t = new FibonacciAltToy();
        
        System.out.println("getNumber(1)     : "+t.getNumber(1));
        System.out.println("getNumber(2)     : "+t.getNumber(2));
        System.out.println("getNumber(3)     : "+t.getNumber(3));
        System.out.println("getNumber(4)     : "+t.getNumber(4));
        System.out.println("getNumber(5)     : "+t.getNumber(5));
        System.out.println("getNumber(10)    : "+t.getNumber(10));
        System.out.println("getNumber(15)    : "+t.getNumber(15));
        System.out.println("getNumber(20)     : "+t.getNumber(20));
        System.out.println("getNumber(25)     : "+t.getNumber(25));
        System.out.println("getNumber(30)     : "+t.getNumber(30));
        System.out.println("getNumber(35)     : "+t.getNumber(35));
        System.out.println("getNumber(40)     : "+t.getNumber(40));
        System.out.println("getNumber(100)    : "+t.getNumber(100));
        System.out.println("getNumber(200)    : "+t.getNumber(200));
        System.out.println("getNumber(300)    : "+t.getNumber(300));
        System.out.println("getNumber(500)    : "+t.getNumber(500));
        System.out.println("getNumber(700)    : "+t.getNumber(700));
        System.out.println("getNumber(900)    : "+t.getNumber(900));
        System.out.println("getNumber(1000)    : "+t.getNumber(1000));
    }
    
    static void test03(){
        FibonacciAltToy t = new FibonacciAltToy();
        System.out.println("getNumber(700)    : "+t.getNumber(700));
        System.out.println("getNumber(900)    : "+t.getNumber(900));
        t.reset();
        for(int i=1;i<=40;i++) {
            System.out.println("Bilangan ke-"+i+" adalah "+t.getNumber());
            t.next();
        }
    }
    
    public static void main(String args[]) {
        test01();
    }
    
    public void next(){
        long temp = currentResult;
        currentResult += prevResult;
        prevResult = temp;
        
        currentNr++;
    }
    
    public void prev() {
        long temp = currentResult;
        currentResult = prevResult;
        prevResult = temp - currentResult;
        
        currentNr--;
    }
    
    public long getNumber(int n) {
        reset();
        for (long i=1;i<n;i++) next();
        currentNr=n;
        return currentResult;
    }
    
    public long getNumber() {
        return currentResult;
    }
    
    public void reset() {
        prevResult = 0;
        currentResult = 1;
        currentNr = 1;
    }
}