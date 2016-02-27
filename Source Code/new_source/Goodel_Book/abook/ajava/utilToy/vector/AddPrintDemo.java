/*
 * addPrintDemo.java
 *
 * Created on February 20, 2004, 9:54 AM
 */

package abook.ajava.utilToy.vector;
import java.util.Vector;
/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class AddPrintDemo {
    static Vector fruits;
    static String[] fruitNames = {"Jeruk", "Kedondong", "Salak", "Manggis"};
    
    static void initVector() {
        fruits = new Vector();
    }
    
    static void doAdd() {
        System.out.println("Penambahan 4 elemen ke Vector");
        for(int i=0;i<fruitNames.length; i++)
            fruits.add(fruitNames[i]);
    }
    
    static void printAll() {
        for(int i=0;i<fruits.size();i++)
            System.out.println((String)fruits.get(i));
    }
    
    static void demo(){
        initVector();
        doAdd();
        printAll();
    }
    
    public static void main (String[] args) {
        demo();
    }
}
