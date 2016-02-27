/*
 * Stack.java
 *
 * Created on June 6, 2003, 5:44 AM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public interface Stack {
    public boolean isEmpty();
    public int size();
    public void clear();
    public void add(Object o);
    public Object get();
    public void remove();
}
