package abook.old;

/*
 * PrimeToy.java
 *
 * Created on May 31, 2003, 5:23 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class PrimeToy {
    private int number;
    private boolean fPrime = true;
    // Flag untuk prima, 
    //   true bila bilangan prima
    //   false bila bukan bilangan prima
    
    public PrimeToy(int number){
        this.number = number;
        doPrimeTest();
    }
    
    public int getNumber(){
        return number;
    }
    
    public boolean isPrime(){
        return fPrime;
    }
    
    public String toString(){
        String str = "";
        if (fPrime) str += number + " adalah bilangan prima";
        else str += number + " adalah bukan bilangan prima";
        return str;
    }
    
    static void test(){
        System.out.println(new PrimeToy(19));
        System.out.println(new PrimeToy(20));
        System.out.println(new PrimeToy(23));
    }
    
    public static void main(String args[]){
        test();
    }

    private void doPrimeTest(){
        for (int i = 2; i <= (int)Math.floor(Math.sqrt(number)); i++) {
            if((number % i)==0) {
                fPrime = false;
                return;
            }
        }
    }
    
}