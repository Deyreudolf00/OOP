/*
 * Io03GBP.java
 *
 * Created on January 22, 2004, 8:33 AM
 */

package abook.ajava.ioToy.old;
import java.io.*;
/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class Io03GBP {
    
    static void test(){
        try {
            FileIO.copyFile(
                "G:\\Reborn\\green-beans.org\\javasrc\\toy\\basics\\io\\IoGBP.java",
                "G:\\Reborn\\green-beans.org\\javasrc\\toy\\basics\\io\\IoGBP.java.bak");
            FileIO.copyFile(
                "G:\\Reborn\\green-beans.org\\javasrc\\toy\\basics\\io\\IoGBP.class",
                "G:\\Reborn\\green-beans.org\\javasrc\\toy\\basics\\io\\IoGBP.class.bak");
        } catch(FileNotFoundException e){
            System.out.println("Exception : "+e);
        } catch(IOException e) {
            System.out.println("Exception : "+e);
        }
    }
    
    public static void main(String[] args) {
        test();
    }
}
