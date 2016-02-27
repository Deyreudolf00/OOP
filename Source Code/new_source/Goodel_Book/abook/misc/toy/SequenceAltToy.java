/*
 * SequenceAltToy.java
 *
 * Created on June 3, 2003, 5:48 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public abstract class SequenceAltToy {
    
    public abstract void reset();
    
    public abstract void next();

    public abstract void prev();
    
    public abstract long getNumber(int n);
    
    public abstract long getNumber();
    
    
}
