/*
 * InsertionSortCToy.java
 *
 * Created on June 14, 2003, 6:28 PM
 */

package colToy.sortToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class InsertionSortCToy {
    Comparable items[];
    
    /** Creates a new instance of insertionSortCToy */
    public InsertionSortCToy(Comparable[] items) {
        this.items = items;
        sort(items,0,items.length-1);
    }
   
    private void sort(Comparable[] a, int left, int right){
        for (int r=left;r<=right;r++){
            Comparable val=a[r];
            int p=r;
            while (p>left && val.compareTo(a[p-1])<0) {
                a[p] = a[p-1];
                p--;
            }
            a[p] = val;
            
            // for testing only
            System.out.println(toString());
        }
    }
    
    public String toString(){
        String str ="";
        for(int i=0;i<items.length;i++){
            str += items[i] + "\t";
        }
        return str;
    }

    static void test(){
        Double[] items = {
            new Double(4.0),
            new Double(12.0),
            new Double(3.0),
            new Double(9.0),
            new Double(1.0),
            new Double(21.0),
            new Double(5.0),
            new Double(2.0)
        };
        InsertionSortCToy t = new InsertionSortCToy(items);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
}
