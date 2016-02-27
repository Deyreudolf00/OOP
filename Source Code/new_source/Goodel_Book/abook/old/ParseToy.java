/*
 * ParseToy.java
 *
 * Created on June 1, 2003, 6:55 AM
 */

package abook.old;
import java.io.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ParseToy {
    
    /** Creates a new instance of ParseToy */
    public ParseToy() {
    }
    
        static public void main (String args[]) throws IOException{
            test();    
        }
        
        static void test() throws IOException {	
        // Penciptaan BufferedReader menggunakan System.in	
        BufferedReader theBR = new BufferedReader(new InputStreamReader(System.in));	
        String str;	
        int i;	
        int sum=0;		
        System.out.println("Masukkan angka, 0 untuk keluar");	
        do {	    
            str = theBR.readLine();	    
            try {		
                i = Integer.parseInt(str);	    
            } catch(NumberFormatException e) {		
                System.out.println("Format yang tidak valid");		
                i = 0;	    
            }	    
            sum += i;	    
            System.out.println("Jumlah saat ini: " + sum);	
        } while (i != 0);    
    }
}
