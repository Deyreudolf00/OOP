/*
 * PutGetDemo.java
 *
 * Created on February 20, 2004, 6:50 AM
 */

package abook.ajava.utilToy.treemap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class PutGetDemo {
    static TreeMap tm;
    
    static void initTreeMap() {
        tm = new TreeMap();
    }
    
    static void putEntries() {
        // Mengisikan elemen-elemen ke map
        tm.put("Adnan",new Double(0.0));
        tm.put("Herman",new Double(100.0));
        tm.put("Susi",new Double(2000.0));
    }
    
    static void printEntries() {
        System.out.println("Isi TreeMap hm : ");
        
        // Memperoleh set dari TreeMap
        Set set = tm.entrySet();
        Iterator i = set.iterator();
        
        // Menampilkan elemen-elemen
        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        
        System.out.println();
    }
    
    static void modifyHermanEntry() {
        // Menambahkan 1000.0 ke rekening Herman
        double balance = ((Double)tm.get("Herman")).doubleValue();
        tm.put("Herman",new Double(balance+1000.0));
        
        System.out.println("Rekening baru Herman : "+tm.get("Herman"));
    }
    
    static void demo(){
        // Menciptakan hash map
        System.out.println("## Demo penggunaan TreeMap ##");
        
        initTreeMap();
        putEntries();
        printEntries();
        modifyHermanEntry();
    }
    
    public static void main (String[] args) {
        demo();
    }
}
