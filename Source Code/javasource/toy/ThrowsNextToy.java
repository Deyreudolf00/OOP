/*
 * ThrowsNextToy.java
 *
 * Created on June 1, 2003, 7:56 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ThrowsNextToy {
    
    /** Creates a new instance of ThrowsNextToy */
    public ThrowsNextToy() {
    }
    
    static void throwsException() throws IllegalAccessException {
        System.out.println("Di dalam throwsException.");
        throw new IllegalAccessException("Exception di throwsException()");
    }
    
    public static void main (String args[]) {
        throwsException();
    }
    
}
