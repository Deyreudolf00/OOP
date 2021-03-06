/*
 * SequenceMachineToy.java
 *
 * Created on May 20, 2003, 6:39 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * 
 */
abstract public class SequenceMachineToy {
    
    protected int sequenceNr = 1;
    
    protected long result;
    
    /** Creates a new instance of SequenceMachineToy */
    public SequenceMachineToy() {
    }
    
    abstract public void next() ;
    
    abstract public void prev() ;
    
    public int getTH(){
        return sequenceNr;
    }
    
    public long get() {
        return result;
    }
}
