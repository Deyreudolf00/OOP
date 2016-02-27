/*
 * ReadlineBToy.java
 *
 * Created on June 1, 2003, 9:00 PM
 */

package abook.misc.bigToy;
import java.io.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ReadlineBToy {
    
    /** Creates a new instance of ReadlineBToy */
    public ReadlineBToy() {
    }
    
    static void test(){
	try {
	    doReadLine();
	} catch (Exception e) {
	    System.out.println("Terjadi kesalahan : "+e.getMessage());
	}
    }
    
    public static void main (String args[]) throws IOException {
        test();
    }
    
    static void doReadLine() throws IOException {
	String str;
	BufferedReader theBR = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Masukan baris teks, ketikkan 'berhenti' untuk berakhir!");
	do {
	    str = theBR.readLine();
	    System.out.println(str);
	} while (!str.equals("berhenti"));
    }
}
