package abook.ajava.ioToy.latex2e;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */
public class IO {
  static void _writeToFile(String filename, String str) {
    try {
      DataOutputStream out = new DataOutputStream(new FileOutputStream(filename));
      out.writeBytes(str);
    }
    catch (Exception e) {
      System.out.println("Error: " + e.toString());
    }
    System.out.println("Pembuatan file " + filename + " TELAH SELESAI");
  }
}
