/*
 * VectorNextToy.java
 *
 * Created on June 1, 2003, 9:33 PM
 */

package abook.old;
import java.lang.Integer;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class VectorNextToy {
    
    /** Creates a new instance of VectorNextToy */
    public VectorNextToy() {
    }
    
    static void test(){
        Vector v=new Vector(10,10);
        for (int i=0;i<20;i++)
            v.addElement(new Integer(i));

        System.out.println("Vector in original order using an Enumeration");
        for (Enumeration e=v.elements();e.hasMoreElements();)
            System.out.print(e.nextElement()+" ");
        System.out.println();

        System.out.println("Vector in original order using elementAt");
        for (int i=0;i<v.size();i++)
            System.out.print(v.elementAt(i)+" ");
        System.out.println();

        // Print out the original vector
        System.out.println("\nVector in reverse order using elementAt");
        for (int i=v.size()-1;i>=0;i--)
            System.out.print(v.elementAt(i)+" ");
        System.out.println();

        // Print out the original vector
        System.out.println("\nVector as a String");
        System.out.println(v.toString());
    }
    
    public static void main(String args[]){
        test();
    }
}
