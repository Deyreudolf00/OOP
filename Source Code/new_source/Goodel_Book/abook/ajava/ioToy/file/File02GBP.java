/*
 * File02GBP.java
 *
 * Created on January 25, 2004, 1:24 PM
 */

package abook.ajava.ioToy.file;
import java.io.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class File02GBP {
    
    static void test01() {
        String filename = "g:/Reborn/green-beans.org/javasrc/trial/file.txt";
        File aFile = new File(filename);
        if (!aFile.exists()){
            try {
                FileOutputStream file1 = new FileOutputStream(aFile);
                System.out.println("file.txt output stream telah diciptakan.");
            } catch (IOException e) {
                System.out.println("Kesalahan : "+e);
            }
        } else {
            System.out.println("file.txt telah ada.");
        }
    }
    
    static void test(){
        test01();
    }
    
    public static void main (String[] args){
        test();
    }
}
