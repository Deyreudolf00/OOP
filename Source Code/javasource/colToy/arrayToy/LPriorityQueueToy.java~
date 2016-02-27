/*
 * LPriorityQueueToy.java
 *
 * Created on June 7, 2003, 6:57 PM
 */

package colToy;
import java.util.NoSuchElementException;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Priority Queue with Sorted Linked List
 */

public class LPriorityQueueToy implements PriorityQueue {
    private SLLNode header;
    private int numberOfNodes;
    
    /** Creates a new instance of LPriorityQueueToy */
    public LPriorityQueueToy() {
        reset();
    }
    
    private void reset(){
        header = null;
        numberOfNodes = 0;
    }
    
    public void add(Comparable c) {
        SLLNode pred=null;
        SLLNode cur=header;
        
        while (cur != null && c.compareTo(cur.o) >= 0) {
            pred = cur;
            cur = cur.next;
        }
        
        SLLNode n = new SLLNode(c, cur);
        if(pred==null) header = n;
        else pred.next = n;
        numberOfNodes++;
    }
    
    public void clear() {
        reset();
    }
    
    public Comparable getLeast() {
        if (header == null) throw new NoSuchElementException();
        return (Comparable) header.o;
    }
    
    public boolean isEmpty() {
        return (numberOfNodes==0);
    }
    
    public void removeLeast() {
        if(header==null) throw new NoSuchElementException();
        header = header.next;
        numberOfNodes--;
    }
    
    public int size() {
        return numberOfNodes;
    }
    
}
