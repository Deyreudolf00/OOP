/*
 * PalindromToy.java
 *
 * Created on May 25, 2003, 6:36 PM
 */

package abook.old;
import java.io.DataInputStream;
import java.util.Stack;


/**
 *
 * @author  Bambang Hariyanto,Ir.MT
    Compiling & execution Instructions:         
	prompt\> javac Palindrom         
	prompt\> java PalindromApp    
 */

public class PalindromToy {
    /** Creates a new instance of PalindromToy */
    public PalindromToy() {
    }
    
    public static boolean isPalindrom (String theString) {
	int stringLength, div2Length;
	int i,j;
	
	Stack aStack = new Stack();
	
	stringLength = theString.length();
	div2Length = stringLength / 2;
	for (i=0;i<div2Length;i++) {
	    Character C = new Character(theString.charAt(i));
	    aStack.push(C);
	}
	if (stringLength % 2 != 0) i++;
	
	for (j=i;j<stringLength;j++) {
	    Character C = new Character(theString.charAt(j));
	    if (!(C.equals(aStack.pop()))) return false; 
	}
	return true;
    }
    
    private static String inputSentence () throws java.io.IOException{        
	DataInputStream dis=new DataInputStream(System.in);        
	System.out.println("Masukkan satu kalimat: ");        
        return(dis.readLine());    
    }    
    
    static void test(){
	try {
	    String aString = new String(inputSentence());
	    
            if (PalindromToy.isPalindrom(aString)) {
		System.out.println(aString+" adalah Palindrom");
	    } else
	    {
		System.out.println(aString+" adalah bukan Palindrom");
	    }
	} catch (Exception E) {
	    System.out.println(E.getMessage());
	}
    }
    
    static public void main(String[] args){
        test();
    }
}
