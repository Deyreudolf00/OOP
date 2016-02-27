/*
 * MathToy.java
 *
 * Created on May 25, 2003, 5:41 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 212, exercise 6.28, 6.40
 */

public class MathToy {
 
    public static int gcd(int m, int n) {
        int t;
        while ((m % n) != 0) {
            t = m;
            m = n;
            n = t % n;
        }
        return n;
    }
    
    public static long gcd(long m, long n) {
        long t;
        while ((m % n) != 0) {
            t = m;
            m = n;
            n = t % n;
        }
        return n;
    }
    
    static void test(){
        System.out.println("gcd(2,3) = "+gcd(2,3));
        System.out.println("gcd(2,4) = "+gcd(2,4));
        System.out.println("gcd(5,7) = "+gcd(5,7));
        System.out.println("gcd(12,4) = "+gcd(12,4));
        System.out.println("gcd(5,35) = "+gcd(5,35));
        System.out.println("gcd(7,35) = "+gcd(7,35));
        System.out.println("gcd(15,20) = "+gcd(15,20));
    }
    
    public static void main(String[] args){
        test();
    }
}
