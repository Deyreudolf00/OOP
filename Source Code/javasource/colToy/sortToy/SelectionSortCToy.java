/*
 * SelectionSortCToy.java
 *
 * Created on June 14, 2003, 6:41 PM
 */

package colToy.sortToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class SelectionSortCToy {
    Comparable items[];
    
    /** Creates a new instance of SelectionSortCToy */
    public SelectionSortCToy(Comparable[] items) {
        this.items = items;
        sort(items,0,items.length-1);
    }
    
    private void sort(Comparable[] a, int left, int right){
        for (int l=left;l<right;l++){
            int p = 1;
            for(int k=l+1;k<=right;k++){
                int comp = a[k].compareTo(a[p]);
                if(comp<0)p=k;
            }
            if (p!=1) {
                Comparable least = a[p];
                a[p] = a[l];
                a[l] = least;
            }
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
        SelectionSortCToy t = new SelectionSortCToy(items);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
    
}
