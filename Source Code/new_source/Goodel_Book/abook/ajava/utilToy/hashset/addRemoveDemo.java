/*
 * addRemoveDemo.java
 *
 * Created on January 15, 2004, 4:34 AM
 */

package abook.ajava.utilToy.hashset;
import java.util.HashSet;

/**
 *
 * @author  bbhariyanto
 */
public class addRemoveDemo {
    static HashSet hs;
    
    static void initHashSet() {
        hs = new HashSet();
    }

    static void addStringElements() {
        System.out.println("Ukuran awal hs [hs.size()] = "+hs.size());
        
        System.out.println("Operasi penambahan 6 elemen ke HashSet");
        // Penambahan elemen ke array list
        hs.add("Cica");
        hs.add("Bobby");
        hs.add("Eka");
        hs.add("Aan");
        hs.add("Frida");
        hs.add("Cici");
        
        System.out.println("Ukuran hs setelah penambahan = "+hs.size());
        System.out.println("Isi hs ="+hs);
    }
    
    static void removeStringElements() {
        // Penghapusan elemen-elemen dari array list
        hs.remove("Frida");
        
        // ELemen dihitung mulai dengan indeks 0
        System.out.println("Ukuran hs setelah penghapusan = "+hs.size());
        System.out.println("Isi dari hs ="+hs);
    }
    
    static void demo() {
        initHashSet();
        addStringElements();
        removeStringElements();
    }
    
    public static void main (String[] args){
        demo();
    }
}
