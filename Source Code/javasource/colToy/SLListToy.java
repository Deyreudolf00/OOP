/*
 * SLListToy.java
 *
 * Created on June 5, 2003, 5:55 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class SLListToy {
    
    private SLLNode header;
    
    /** Creates a new instance of SLListToy */
    public SLListToy() {
        this.header = null;
    }
    
    public void printAll(){
        for(SLLNode cur = header;cur != null;cur = cur.next){
            System.out.println(cur.o+" ");
        }
    }
    
    public void insertFirst(SLLNode n){
        n.next = header;
        header = n;
    }
    
    public void insertAfter(SLLNode bef, SLLNode n){
        n.next = bef.next;
        bef.next = n;
    }
    
    public void insertLast(SLLNode n){
        SLLNode p = header;
        if (p == null) {
            header = n;
        } else {
            while (p.next != null)p = p.next;
            p.next = n;
        }
    }
    
    public void deleteFirst(){
        if (header != null) header = header.next;
    }
    
    public void deleteLast(){
        if (header == null) return;
        
        SLLNode p = header;
        SLLNode prev = null;
        while (p.next != null) {
            prev = p;
            p = p.next;
        }
        
        // Hanya satu node
        if (prev == null) header = null;
        else prev.next = null;
    }
    
    public void deleteAll(){
        header = null;
    }
    
    public void deleteNode(SLLNode n){
        SLLNode p = header;
        SLLNode prev = null;
        while (p != n) {
            prev = p;
            p = p.next;
        }
        
        // Jika ditemukan 
        if (p == n) {
            // Hanya satu node
            if (prev == null) header = null;
            else prev.next = n.next;
        }
    }
    
    public SLLNode createSLLNode(Object o){
        return (new SLLNode(o, null));
    }
    
    static void test01(){
        // Test terhadap insertFirst()
        SLListToy t = new SLListToy();
        for (int i=0;i<10;i++) {
            Integer o = new Integer(i);
            SLLNode n = new SLLNode(o,null);
            t.insertFirst(n);
        }
        
        // printAll
        t.printAll();
    }

    static void test02(){
        // test terhadap insertLast()
        SLListToy t = new SLListToy();
        for (int i=0;i<10;i++) {
            Integer o = new Integer(i);
            SLLNode n = new SLLNode(o,null);
            t.insertLast(n);
        }
        
        // printAll
        System.out.println(t);
    }

    public static void main (String[] args){
        test01();
        test02();
    }
    
    public String toString(){
        String str = "";
        for(SLLNode cur = header;cur != null;cur = cur.next){
            str += cur + "\n";
        }
        return str;
    }
}

