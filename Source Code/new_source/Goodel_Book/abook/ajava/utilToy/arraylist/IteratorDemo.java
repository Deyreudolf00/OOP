/*
 * IteratorDemo.java
 *
 * Created on February 20, 2004, 1:50 AM
 */

package abook.ajava.utilToy.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class IteratorDemo {
    static ArrayList al;
    static Iterator itr;
    static ListIterator litr;
    
    static void initDemo() {
        System.out.println("Inisialisasi ArrayList untuk DEMO");
        al = new ArrayList();
    }
    
    static void addStringElements() {
        System.out.println("Ukuran awal al [al.size()] = "+al.size());
        
        System.out.println("Operasi penambahan 6 elemen ke ArrayList");
        // Penambahan elemen ke array list
        al.add("Cica");
        al.add("Bobby");
        al.add("Eka");
        al.add("Aan");
        al.add("Frida");
        al.add(1, "Cici");
        
        System.out.println("Ukuran al setelah penambahan = "+al.size());
        System.out.println("Isi al ="+al);
    }
    
    static void printAll() {
        // Demo iterator untuk menampilkan isi
        System.out.println("Menampilkan isi dengan iterator :");
        itr = al.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println("");
    }
    
    static void reversePrintAll() {
        // Demo iterator untuk menampilkan isi secara terbalik urutannya
        System.out.println("Menampilkan isi dengan iterator urutan terbalik:");
        while (litr.hasPrevious()){
            Object element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println("");
    }
    
    static void modifyAll() {
        // Demo iterator untuk memodifikasi isi
        System.out.println("Memodifikasi isi dengan iterator :");
        litr = al.listIterator();
        while (litr.hasNext()){
            Object element = litr.next();
            litr.set(element + "+");
        }
    }
    
    static void demo() {
        System.out.println("DEMO penggunaan Iterator pada ArrayList berisi String");

        initDemo();
        addStringElements();
        
        printAll();
        modifyAll();
        printAll();
        
        reversePrintAll();
    }
    
    public static void main (String[] args) {
        demo();
    }
}
