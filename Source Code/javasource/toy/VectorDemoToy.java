/*
 * VectorDemoToy.java
 *
 * Created on May 26, 2003, 4:14 AM
 */

package toy;
import java.util.Vector;
import java.util.Enumeration;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class VectorDemoToy {
    
    /** Creates a new instance of VectorDemoToy */
    public VectorDemoToy() {
    }
    
    static void test(){
	Vector v = new Vector();
        
	v.addElement("Satu");
	v.addElement("Dua");
	v.addElement("Tiga");
	
	v.insertElementAt("Nol",0);
	v.insertElementAt("Oops",3);
	v.insertElementAt("Empat",5);
	
	System.out.println("Ukuran: "+v.size());
	
        Enumeration enum = v.elements();
	while (enum.hasMoreElements())
	    System.out.print(enum.nextElement()+" ");
	System.out.println();
	v.removeElement("Oops");
	System.out.println("Ukuran: "+v.size());
	
	for(int i=0;i<v.size();++i)
	    System.out.print(v.elementAt(i)+" ");
	System.out.println();
    }
    
    static void test2(){
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
    
    static public void main(String[] args) {
        test();
        test2();
    }
    
}
