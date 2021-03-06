/*
 * HeapCToy.java
 *
 * Created on June 14, 2003, 2:40 PM
 */

package colToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class HeapCToy {
    private Comparable[] items;
    private int capacity;
    private int numberOfItems;
    final static int ADJUST = 1;
    
    /** Creates a new instance of HeapCToy */
    public HeapCToy(int capacity) {
        this.capacity = capacity;
        reset();
    }
    
    public HeapCToy(Comparable[] items){
        this.capacity = items.length;
        numberOfItems = items.length;
        this.items = items;
        heapify();
    }
    
    public int getCapacity(){
        return capacity;
    }
    
    public int getSize(){
        return numberOfItems;
    }
    
    public Comparable get(){
        return items[0];
    }
    
    public void remove(){
    }
    
    public void insert(Comparable c){
        // Belum ada penanganan overflow
        numberOfItems++;
        if (numberOfItems==1) {
            items[0] = c;
            return;
        }
        
        int j = numberOfItems;
        int i = numberOfItems / 2;
        Comparable item = c;
        
        while (i>0) {
            int comp = items[i-ADJUST].compareTo(item);
            if (comp >=0) break;
            
            items[j-ADJUST] = items[i-ADJUST]; // Gerakkan induk ke bawah
            j = i;
            i = i / 2;
        }
        items[j-ADJUST] = item;
    }
    
    public void sort(){
        heapify();
        for(int i=numberOfItems;i>1;i--){
            Comparable t = items[i-ADJUST];
            items[i-ADJUST] = items[1-ADJUST];
            items[1-ADJUST] = t;
            System.out.println(toString());
            adjust(1,i-1);
        }
    }
    
    public String toString(){
        String str = "";
        for(int i=0;i<numberOfItems;i++){
            str += items[i] + "\t";
        }
        return str;
    }
    
    static void test01(){
        HeapCToy t = new HeapCToy(7);
        t.insert (new Integer(40));
        System.out.println(t);
        t.insert (new Integer(80));
        System.out.println(t);
        t.insert (new Integer(35));
        System.out.println(t);
        t.insert (new Integer(90));
        System.out.println(t);
        t.insert (new Integer(45));
        System.out.println(t);
        t.insert (new Integer(50));        
        System.out.println(t);
        t.insert (new Integer(70));        
        System.out.println(t);
    }
    
    static void test02(){
        Integer[] items = {
            new Integer(100), 
            new Integer(119),
            new Integer(118),
            new Integer(171),
            new Integer(112),
            new Integer(151),
            new Integer(132)
        };
        
        HeapCToy t = new HeapCToy(items);
        System.out.println(t);
    }
    
    static void test03(){
        Integer[] items = {
            new Integer(100), 
            new Integer(119),
            new Integer(118),
            new Integer(171),
            new Integer(112),
            new Integer(151),
            new Integer(132)
        };
        
        HeapCToy t = new HeapCToy(items);
        System.out.println(t);
        t.sort();
        System.out.println(t);
    }
    
    static void test(){
        // test01();
        // test02();
        test03();
    }
    
    public static void main(String[] args){
        test();
    }

    private void reset(){
        items = new Comparable[capacity];
        numberOfItems = 0;
    }
    
    private void adjust(int i, int n){
        int j = 2 * i;
        Comparable item = items[i-ADJUST];
        
        while (j <= n) {
            int comp = items[j-ADJUST].compareTo(items[j+1-ADJUST]);
            if (j<n && comp < 0) j++;
            
            comp = item.compareTo(items[j-ADJUST]);
            
            if (comp >= 0) break;
            else items[(j/2)-ADJUST] = items[j-ADJUST];
            j = 2 * j;
        }
        items[(j/2)-ADJUST] = item;
    }
    
    private void heapify(){
        for(int i=numberOfItems/2;i>0;i--) adjust(i,numberOfItems);
    }
}
