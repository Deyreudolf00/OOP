/*
 * FileIO.java
 *
 * Created on January 22, 2004, 8:40 AM
 */

package abook.ajava.ioToy.old;
import java.io.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class FileIO {
    
    public static void copyFile(String inFile, String outFile) throws FileNotFoundException, IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFile));
        copyFile(bis, bos, true);
    }
    
    public static void copyFile(InputStream is, OutputStream os, boolean close) throws IOException{
        int b;
        while ((b=is.read()) != -1) {
            os.write(b);
        }
        is.close();
        if (close) os.close();
    }
    
    public static void copyFile(Reader r, Writer w, boolean close) throws IOException{
        int b;
        while ((b=r.read()) != -1) {
            w.write(b);
        }
        r.close();
        if (close) w.close();
    }
    
}
