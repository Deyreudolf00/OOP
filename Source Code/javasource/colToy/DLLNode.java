/*
 * DLLNode.java
 *
 * Created on June 5, 2003, 10:41 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DLLNode {
    protected Object o;
    protected DLLNode prev;
    protected DLLNode next;
    
    /** Creates a new instance of DLLNode */
    public DLLNode(Object o, DLLNode prev, DLLNode next) {
        this.o = o;
        this.prev = prev;
        this.next = next;
    }
    
    public String toString(){
        return ""+o;
    }
    
    public Object getObject(){
        return o;
    }
}
