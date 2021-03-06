/*
 * QuickSortCToy.java
 *
 * Created on June 14, 2003, 6:45 PM
 */

package colToy.sortToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class QuickSortCToy {
    Comparable items[];
    
    /** Creates a new instance of QuickSortCToy */
    public QuickSortCToy(Comparable[] items) {
        this.items = items;
        sort(items,0,items.length-1);
    }
    
    private void sort(Comparable[] a, int left, int right){
        // for testing only
        System.out.println(toString());
        
        if(left<right){
            int p=partition(a,left,right);
            sort(a,left,p-1);
            sort(a,p+1,right);
        }
    }
    
    private static int partition(Comparable[] a, int left, int right){
        Comparable pivot=a[left];
        int p=left;
        for(int r=left+1;r<=right;r++){
            int comp=a[r].compareTo(pivot);
            if(comp<0) {
                a[p] = a[r];
                a[r] = a[p+1];
                a[p+1] = pivot;
                p++;
            }
        }
        return p;
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
        QuickSortCToy t = new QuickSortCToy(items);
        System.out.println(t);
    }
    
    public static void main(String[] args){
        test();
    }
}
