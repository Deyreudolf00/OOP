/*
 * DLListToy.java
 *
 * Created on June 5, 2003, 10:45 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DLListToy {
    private DLLNode header, tail;
    
    /** Creates a new instance of DLListToy */
    public DLListToy() {
        header = null;
        tail = null;
    }
    
    public void printAll(){
        for(DLLNode cur = header;cur != null;cur = cur.next){
            System.out.println(cur.o+" ");
        }
    }
    
    public void printRevAll(){
        for(DLLNode cur=tail;cur != null;cur=cur.prev) System.out.println(cur.o+" ");
    }
    
    public void insertFirst(DLLNode n){
        
        // Apakah masih kosong?
        if(header==null){
            header = n;
            tail = n;
        } else {
            n.next = header;
            header.prev = n;
            header = n;
        }
    }
    
    public void insertAfter(DLLNode bef, DLLNode n){
        if(bef==null){
            insertFirst(n);
        } else{
            n.next = bef.next;
            n.prev = bef;
            if(bef.next != null) {
                // n tidak menjadi node terakhir
                bef.next.prev = n;
            } else {
                // n menjadi node terakhir
                tail = n;
            }
            bef.next = n;
        }
    }
    
}
