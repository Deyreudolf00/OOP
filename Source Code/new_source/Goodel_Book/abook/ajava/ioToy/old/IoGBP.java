/*
 * IoGBP.java
 *
 * Created on January 22, 2004, 8:18 AM
 */

package abook.ajava.ioToy.old;
import java.io.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class IoGBP {

    static void test(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine;
        
        try {
            while ((inputLine=br.readLine())!=null) {
                System.out.println("Kalimat : "+inputLine);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Exception : "+e);
        }
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
