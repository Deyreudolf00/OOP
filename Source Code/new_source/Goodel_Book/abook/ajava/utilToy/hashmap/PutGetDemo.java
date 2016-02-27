/*
 * PutGetDemo.java
 *
 * Created on February 20, 2004, 6:41 AM
 */

package abook.ajava.utilToy.hashmap;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class PutGetDemo {
    static HashMap hm;
    
    static void initHashMap() {
        hm = new HashMap();
    }
    
    static void putEntries() {
        // Mengisikan elemen-elemen ke map
        hm.put("Adnan",new Double(0.0));
        hm.put("Herman",new Double(100.0));
        hm.put("Susi",new Double(2000.0));
    }
    
    static void printEntries() {
        System.out.println("Isi TreeMap hm : ");
        // Memperoleh set dari HashMap
        Set set = hm.entrySet();
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
        double balance = ((Double)hm.get("Herman")).doubleValue();
        hm.put("Herman",new Double(balance+1000.0));
        
        System.out.println("Rekening baru Herman : "+hm.get("Herman"));
    }
    
    static void demo(){
        // Menciptakan hash map
        System.out.println("## Demo penggunaan HashMap ##");
        
        initHashMap();
        putEntries();
        printEntries();
        modifyHermanEntry();
    }
    
    public static void main (String[] args) {
        demo();
    }
}
