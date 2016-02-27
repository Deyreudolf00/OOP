/*
 * List.java
 *
 * Created on June 6, 2003, 3:33 PM
 */

package colToy;
import java.util.Iterator;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public interface List {
    public boolean isEmpty();
    public Object get(int i);
    public boolean equals(List l);
    public void clear();
    public void set(int i, Object o);
    public void add(int i, Object o);
    public void add(Object o);
    public void addAll(List l);
    public void remove(int i);
    public Iterator iterator();
}
