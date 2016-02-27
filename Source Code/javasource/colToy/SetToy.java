/*
 * SetToy.java
 *
 * Created on June 7, 2003, 6:26 AM
 */

package colToy;
import java.util.Iterator;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class SetToy implements Set {
    private Comparable[] members;
    private int capacity;
    private int numberOfMembers;
    
    /** Creates a new instance of SetToy */
    public SetToy(int capacity) {
        this.capacity = capacity;
        reset();
    }
    
    private void reset(){
        members = new Comparable[capacity];
        numberOfMembers = 0;
    }
    
    public void add(Object o) {
        Comparable c = (Comparable o);
        int pos = search(c);
        if(!c.equals(members[pos])){
            if(numberOfMembers==capacity) expand();
            for(int i=numberOfMembers; i>pos;i--) members[i] = members[i-1];
            members[pos] = c;
            numberOfMembers++;
        }
    }
    
    public void addAll(Set s) {
        for(int i=0;i<s.capacity;i++) this.add(s.elements[i]);
    }
    
    public void clear() {
        reset();
    }
    
    public boolean contains(Object o) {
        if(o instanceof Comparable) {
            Comparable c = (Comparable) o;
            int pos = search(c);
            return c.equals(members[pos]);
        } else return false;
    }
    
    public boolean containsAll(Set s) {
        // Not yet implemented
        return true;
    }
    
    public boolean equals(Set s) {
        ArrayToy other = (ArrayToy) s;
        if(this.numberOfMembers != other.numberOfMembers) return false;
        for(int i=0;i<this.numberOfMembers;i++)
            if(!this.members[i].equals(other.members[i])) return false;
        return true;
    }
    
    public boolean isEmpty() {
        return (numberOfMembers==0);
    }
    
    public Iterator iterator() {
        // Not yet implemented
        return null;
    }
    
    public void remove(Object o) {
    }
    
    public void removeAll(Set s) {
        reset();
    }
    
    public void retainAll(Set s) {
        ArrayToy other = (ArrayToy) s;
        Comparable[] newMembers = new Comparable[this.member.capacity];
        int i=0;
        int j=0;
        int k=0;
        while (i<this.numberOfMembers && j<other.numberOfMembers){
            int comp = this.members[i].compareTo(other.members[i]);
            if (comp<0) i++;
            else if (comp>0) j++;
            else {
                newMembers[k++] = this.members[i++];
                j++;
            }
        }
        this.members = newMembers;
        this.numberOfElements = k;
    }
    
    public int size() {
        return numberOfMembers;
    }
    
    private int search(Comparable target){
        int l=0;
        int r = numberOfElements - 1;
        
        while (l<=r){
            int m = (l+r)/2;
            int comp = target.compareTo(members[m]);
            if(comp==0) return m;
            else if(comp<0) r=m-1;
            else l=m+1;
        }
        return l;
    }
    
}

private class LRIterator implements Iterator{
    private int place;
    private LRIIterator(){
        place = 0;
    }
    
    public boolean hasNext(){
        return (place < numberOfMembers)
    }
    
    public Object next(){
        if (place >= numberOfMembers) throw new NoSuchElementException();
        place++;
        return null;
    }
    
    public void get(){
        return members[place];
    }
    
    public void remove() {
    }

}
