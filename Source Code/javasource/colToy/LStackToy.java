/*
 * LStackToy.java
 *
 * Created on June 6, 2003, 3:19 PM
 */

package colToy;
import java.util.NoSuchElementException;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class LStackToy implements Stack {
    private SLLNode top = null;
    private int numberOfElement=0;
    
    /** Creates a new instance of LStackToy */
    public LStackToy() {
        reset();
    }
    
    public void add(Object o) {
        top = new SLLNode(o, top);
        numberOfElement++;
    }
    
    private void reset(){
        top = null;
        numberOfElement = 0;
    }
    
    public void clear() {
        reset();
    }
    
    public Object get() {
        if (top==null) throw new NoSuchElementException();
        return top.o;
    }
    
    public boolean isEmpty() {
        return (top==null);
    }
    
    public void remove() {
        if (top==null) throw new NoSuchElementException();
        top = top.next;
        numberOfElement--;
    }
    
    public int size() {
        return numberOfElement;
    }
    
        static void test01(){
        LStackToy t = new LStackToy();
        for(int i=0;i<10;i++) t.add(new Integer(i));
        System.out.println("Stack berisi : \n");
        for(int i=0;i<10;i++) {
            System.out.println(t.get());
            t.remove();
        }
    }
    
    static void test02(){
        LStackToy t = new LStackToy();
        for(int i=0;i<10;i++) t.add(new Integer(i));
        System.out.println("Stack berisi : \n");
        for(int i=0;i<10;i++) {
            System.out.println(t.get());
            t.remove();
        }
    }
    
    public static void main(String[] args){
        test01();
//        test02();
    }

}
