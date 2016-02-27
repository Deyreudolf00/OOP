/*
 * Io02GBP.java
 *
 * Created on January 22, 2004, 8:27 AM
 */

package abook.ajava.ioToy.old;
import java.io.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class Io02GBP {
    
    static void test(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine=null;
        int val=0;
        
        try {
            inputLine=br.readLine();
            val = Integer.parseInt(inputLine);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: "+e);
        } catch (IOException e) {
            System.out.println("IOException : "+e);
        }
        System.out.println("Bilangan : "+val);
    }
    
    public static void main(String[] args) {
        test();
    }
}
