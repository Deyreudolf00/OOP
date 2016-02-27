/*
 * PrintDemoDemo.java
 *
 * Created on June 1, 2003, 9:31 PM
 */

package abook.ajava.utilToy.vector;
import java.util.Vector;
import java.util.Enumeration;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class PrintAllDemo {
    static Vector v;
    
    static void initVector() {
        v=new Vector(10,10);
    }
    
    static void doAddInteger() {
        for (int i=0;i<20;i++)
            v.addElement(new Integer(i));
    }
    
    static void printWithEnumeration() {
        System.out.println("Mencetak Vector menggunakan Enumeration");
        for (Enumeration e=v.elements();e.hasMoreElements();)
            System.out.print(e.nextElement()+" ");
        System.out.println();
    }
    
    static void printWithElementAt() {
        System.out.println("Mencetak Vector menggunakan elementAt()");
        for (int i=0;i<v.size();i++)
            System.out.print(v.elementAt(i)+" ");
        System.out.println();
    }
    
    static void printReverseWithElementAt() {
        System.out.println("Mencetak Vector dengan urutan terbalik menggunakan elementAt");
        for (int i=v.size()-1;i>=0;i--)
            System.out.print(v.elementAt(i)+" ");
        System.out.println();
    }
    
    static void printWithToString() {
        System.out.println("Vector sebagai String");
        System.out.println(v.toString());
    }
    
    static void demo(){
        initVector();
        doAddInteger();
        printWithEnumeration();
        printWithElementAt();
        printReverseWithElementAt();
        printWithToString();
    }
    
    public static void main(String args[]){
	demo();
    }
    
}
