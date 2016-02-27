/*
 * SystemPropertiesBToy.java
 *
 * Created on June 2, 2003, 7:37 AM
 */

package abook.misc.bigToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class SystemPropertiesBToy {
    
    /** Creates a new instance of SystemPropertiesBToy */
    public SystemPropertiesBToy() {
    }
    
    public static void main (String args[]) {
        System.getProperties().list(System.out);
    }
}
