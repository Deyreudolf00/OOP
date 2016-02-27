/*
 * StackNextToy.java
 *
 * Created on June 1, 2003, 9:24 PM
 */

package abook.old;
import java.io.DataInputStream;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class StackNextToy {
    
    /** Creates a new instance of StackNextToy */
    public StackNextToy() {
    }
    
    static private String inputSentence () throws java.io.IOException{
        DataInputStream dis=new DataInputStream(System.in);

        System.out.println("Masukkan satu kalimat: ");
        return(dis.readLine());
    }
    
    public static void invertSentence(String s)
    {
        StringTokenizer st=new StringTokenizer(s);
        Stack stack=new Stack();
        while (st.hasMoreTokens())
            stack.push(st.nextToken());
        while (!stack.empty())
            System.out.print((String)stack.pop()+" ");
        System.out.println();
    }
    
    static void test(){
	try {
	    invertSentence(inputSentence());	
	} catch (Exception E) {
	    System.out.println(E.getMessage());
	}
    }

    public static void main(String args[]) {
        test();
    }

}
