/*
 * KeyboardBToy.java
 *
 * Created on June 1, 2003, 9:03 PM
 */

package abook.ajava.systemToy;
import java.io.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class KeyboardBToy {
    
    /** Creates a new instance of KeyboardBToy */
    public KeyboardBToy() {
    }
    
    static void test(){
	try {
	    doReadKeyboard();
	} catch (Exception e) {
	    System.out.println("Terjadi kesalahan : "+e.getMessage());
	}
    }
    
    public static void main (String args[]) throws IOException {
        test();
    }
    
    static void doReadKeyboard() throws IOException {
	char c;
	BufferedReader theBR = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Masukan karakter, '$' untuk berakhir!");
	do {
	    c = (char) theBR.read();
	    System.out.println(c);
	} while (c != '$');
    }
}
