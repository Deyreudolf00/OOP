/*
 * Set.java
 *
 * Created on June 7, 2003, 6:22 AM
 */

package colToy;
import java.util.Iterator;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public interface Set {
    public boolean isEmpty();
    public int size();
    public boolean contains(Object o);
    public boolean equals(Set s);
    public boolean containsAll (Set s);
    public void clear();
    public void add(Object o);
    public void remove(Object o);
    public void addAll(Set s);
    public void removeAll(Set s);
    public void retainAll(Set s);
    public Iterator iterator();
}
