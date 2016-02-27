/*
 * addGBD.java
 *
 * Created on January 15, 2004, 4:38 AM
 */

package abook.ajava.utilToy.treeset;
import java.util.TreeSet;

/**
 *
 * @author  bbhariyanto
 */
public class addGBD {
    static void test() {
        // test untuk penambahan
        TreeSet ts = new TreeSet();
        System.out.println("Ukuran awal ts [ts.size()] = "+ts.size());
        
        // Penambahan elemen ke array list
        ts.add("CCCCC");
        ts.add("BBBBB");
        ts.add("EEEEE");
        ts.add("AAAAA");
        ts.add("FFFFF");
        // ts.add(1, "CCCC2");
        // Error : cannot resolve symbol
        
        System.out.println("Ukuran ts setelah penambahan = "+ts.size());
        System.out.println("Isi dari ts ="+ts);
        
        // Penghapusan elemen-elemen dari array list
        ts.remove("FFFFF");
        // ts.remove(2);
        // Error : cannot resolve symbol

        System.out.println("Ukuran ts setelah penghapusan = "+ts.size());
        System.out.println("Isi dari ts ="+ts);
    }
    
    public static void main (String[] args){
        test();
    }
}
