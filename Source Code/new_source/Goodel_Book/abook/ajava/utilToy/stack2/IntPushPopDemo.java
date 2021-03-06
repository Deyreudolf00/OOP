/*
 * IntPushPopDemo.java
 *
 * Created on June 1, 2003, 9:21 PM
 */

package abook.ajava.utilToy.stack2;
import java.util.Stack;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class IntPushPopDemo {
    static Stack s;
    static void initStack() {
        s = new Stack();
    }
    
    static void doPush() {
        System.out.println("Push lima elemen ke Stack");
	s.push(new Integer(1));
	s.push(new Integer(2));
	s.push(new Integer(3));
	s.push(new Integer(4));
	s.push(new Integer(5));
    }
    
    static void doPeek() {
	System.out.println("Puncak stack: "+s.peek());
    }
    
    static void doPop() {
        System.out.println("Pop seluruh isi Stack");
	while (!s.empty())
	    System.out.println(s.pop());
    }

    static void demo(){
        initStack();
        doPush();
        doPeek();
        doPop();
    }
    
    public static void main (String args[]){
        demo();
    }
}
