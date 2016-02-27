/*
 * ConditionalToy.java
 *
 * Created on May 31, 2003, 4:25 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ConditionalToy {  
    public static void main (String args[]) {    
        int x = 0;    
        boolean isEven = false;    
        System.out.println("x = " + x);    
        x = isEven ? 4 : 7;    System.out.println("x = " + x);  
    }
}