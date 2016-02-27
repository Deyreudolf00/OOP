/*
 * Created on May 18, 2003, 10:25 AM
 */

package abook.misc.toy;
import book.misc.toy.MathToy;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  C++ Program Design : An Introduction to Programming and Object Oriented Design
 *  James P Cohon dan Jack W Davidson, page 363-380
 *  In subject :  Object as machine
 *
 */
 public class FractionToy {
    private int num;
    private int denom;
    
    // Constructor
    public FractionToy (int num, int denom) {
        int t = MathToy.gcd(num, denom);
        this.num = num / t;
        this.denom = denom / t;
    }
    
    // Computation operations
    public FractionToy add(FractionToy theF)
    {
	//
        int tNum = (num * theF.denom) + (theF.num * denom);
        int tDenom = denom * theF.denom;

        return (new FractionToy(tNum, tDenom));
    }

    public String toString () {
        return num + "/" + denom;
    }

    static void test(){
	System.out.println("Aplikasi Aritmatika Bilangan Pecahan");

        FractionToy a = new FractionToy(2,3);
        FractionToy b = new FractionToy(4,6);
        FractionToy c = a.add(b);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+" + "+b+" = "+c);
    }
    
    public static void main (String args[]) {
        test();
    }

}
