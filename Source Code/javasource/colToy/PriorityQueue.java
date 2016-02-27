/*
 * PriorityQueue.java
 *
 * Created on June 7, 2003, 6:54 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public interface PriorityQueue {
    public boolean isEmpty();
    public int size();
    public Comparable getLeast();
    public void clear();
    public void add(Comparable c);
    public void removeLeast();
}
