/*
 * Queue.java
 *
 * Created on June 6, 2003, 6:28 AM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public interface Queue {
    public boolean isEmpty();
    public int size();
    public Object get();
    public void clear();
    public void add(Object o);
    public void remove();
}
