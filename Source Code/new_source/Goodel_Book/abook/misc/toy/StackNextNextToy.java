/*
 * StackNextNextToy.java
 *
 * Created on June 1, 2003, 9:28 PM
 */

package abook.misc.toy;
import java.io.DataInputStream;
import java.util.Stack;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class StackNextNextToy {
    
    /** Creates a new instance of StackNextNextToy */
    public StackNextNextToy() {
    }
    
    public static String convertBase10To2Str(int theNumber) {
	String aString = new String();
	Stack aStack = new Stack();
	
	int remainder;
	while (theNumber != 0) {
	    remainder = theNumber % 2;
	    Integer I = new Integer(remainder);
	    aStack.push(I);
	    theNumber /= 2;    
	}
	
	while (!aStack.isEmpty()) {
	    aString = aString.concat(aStack.pop().toString());
	}
	return aString;
    }
    
    static void test(){
	System.out.println("0 = " + convertBase10To2Str(0));
	System.out.println("1 = " + convertBase10To2Str(1));
	System.out.println("2 = " + convertBase10To2Str(2));
	System.out.println("3 = " + convertBase10To2Str(3));
	System.out.println("4 = " + convertBase10To2Str(4));
	System.out.println("5 = " + convertBase10To2Str(5));
	System.out.println("10 = " + convertBase10To2Str(10));
	System.out.println("100 = " + convertBase10To2Str(100));
	System.out.println("1000 = " + convertBase10To2Str(1000));
	System.out.println("10000 = " + convertBase10To2Str(10000));
	System.out.println("100000 = " + convertBase10To2Str(100000));
    }
    
    public static void main (String args[]) {
        test();
    }
}
