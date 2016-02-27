/*
 * PriorityQueueToy.java
 *
 * Created on June 7, 2003, 7:06 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class PriorityQueueToy implements PriorityQueue {
    private Comparable[] elements;
    private int capacity;
    private int numberOfElements;
    
    /** Creates a new instance of PriorityQueueToy */
    public PriorityQueueToy(int capacity) {
        this.capacity = capacity;
        reset();
    }
    
    private void reset(){
        elements = new Comparable[capacity];
        numberOfElements = 0;
    }
    
    public void add(Comparable c) {
        if(numberOfElements == capacity) expand();
        int hole = numberOfElements++;
        for(;;){
            if(hole==0) {
                elements[hole] = c;
                return;
            } else {
                int parent = (hole-1)/2;
                if(elements[parent].compareTo(c)<=0){
                    elements[hole] = c;
                    return;
                } else {
                    elements[hole] = elements[parent];
                    hole = parent;
                }
            }
        }
    }
    
    public void clear() {
        reset();
    }
    
    public Comparable getLeast() {
        if(numberOfElements==0) throw new NoSuchElementException();
        return elements[0];
    }
    
    public boolean isEmpty() {
        return (numberOfElements==0);
    }
    
    public void removeLeast() {
        if(numberOfElements == 0) throw new NoSuchElementException();
        int hole = 0;
        Comparable last = elements[--numberOfElements];
        for(;;){
            int left = 2*hole+1;
            int right = 2*hole+2;
            int child;
            if(left>numberOfElements){
                elements[hole] = last;
                return;
            } else if(right>numberOfElements) child = left;
            else child = (elements[left].compareTo(elements[right]) <= 0?left:right);
            if(last.compareTo(elements[child]<=0){
                elements[hole] = last;
                return;
            } else{
                elements[hole] = elements[child];
                hole = child;
            }
            
        }
    }
    
    public int size() {
        return numberOfElements;
    }
    
    private void expand(){
        capacity = capacity + 10 + (int)(.1 * capacity);
        Object[] newElements = new Object[capacity];
        for(int i=0;i<numberOfElements;i++) newElements[i] = elements[i];
        elements = newElements;
        
    }
}
