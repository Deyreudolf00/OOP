/*
 * ScopeNextToy.java
 *
 * Created on May 31, 2003, 4:42 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ScopeNextToy {  
    public static void main (String args[]) {    
        int k, l;    
        System.out.println("Goodbye, World!");    
        for (k = 0; k < 5; k++) {      
            int m;      
            System.out.println("Bye!");    
        }  
    }
}
