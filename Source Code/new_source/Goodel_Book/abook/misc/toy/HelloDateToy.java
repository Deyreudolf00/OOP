/*
 * HelloDateToy.java
 *
 * Created on May 25, 2003, 6:22 PM
 */

package abook.misc.toy;
import java.util.Date;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class HelloDateToy {

    /** Creates a new instance of HelloDateToy */
    static void printHello () {
        System.out.println ("Hello, it's : ");
        System.out.println (new Date());
    }    
    
    public static void main (String[] args) {
        printHello();
    }
}
