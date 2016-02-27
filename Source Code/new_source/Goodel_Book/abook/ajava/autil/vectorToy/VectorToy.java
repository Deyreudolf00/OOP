package abook.ajava.autil.vectorToy;

import java.util.Vector;
import java.util.Enumeration;

public class VectorToy {

	/** Creates a new instance of VectorToy */
	public VectorToy() {
	}

	public static void test() {
		Vector v = new Vector();
		v.addElement("Satu");
		v.addElement("Dua");
		v.addElement("Tiga");

		v.insertElementAt("Nol", 0);
		v.insertElementAt("Oops", 3);
		v.insertElementAt("Empat", 5);

		System.out.println("Ukuran: " + v.size());
		Enumeration enumer = v.elements();
		while (enumer.hasMoreElements())
			System.out.print(enumer.nextElement() + " ");
		System.out.println();
		v.removeElement("Oops");
		System.out.println("Ukuran: " + v.size());

		for (int i = 0; i < v.size(); ++i)
			System.out.print(v.elementAt(i) + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		test();
	}

}
