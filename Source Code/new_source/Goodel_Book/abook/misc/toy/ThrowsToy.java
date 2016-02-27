/*
 * ThrowsToy.java
 *
 * Created on June 1, 2003, 7:51 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ThrowsToy {
    
    /** Creates a new instance of ThrowsToy */
    public ThrowsToy() {
    }
    
    static void throwsException() throws IllegalAccessException {
        System.out.println("Di dalam throwsException.");
        throw new IllegalAccessException("Exception di throwsException");
    }
    
    public static void main (String args[]) {
        try {throwsException();
        }catch (IllegalAccessException e) { 
            //menangkap exception
            System.out.println("Ditangkap exception: " + e);
        }
    }
}
