/*
 * StackToy.java
 *
 * Created on June 1, 2003, 9:21 PM
 */

package abook.old;
import java.lang.System;
import java.util.Stack;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class StackToy {
    static void test(){
	Stack s = new Stack();
	s.push("Satu");
	s.push("Dua");
	s.push("Tiga");
        
	System.out.println("Puncak stack: "+s.peek());
	while (!s.empty())
	    System.out.println(s.pop());
    }
    
    public static void main (String args[]){
        test();
    }
}
