package abook.ajava.ioToy.output;

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
import java.io.*;

public class AsciiArray {

  public static void main(String[] args) {

    byte[] b = new byte[(127-31)*2];
    int index = 0;
    for (int i = 32; i < 127; i++) {
      b[index++] = (byte) i;
      // break line after every eight characters
      if (i % 8 == 7) b[index++] = (byte) '\n';
      else b[index++] = (byte) '\t';
    }
    b[index++] = (byte) '\n';
    try {
      System.out.write(b);
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }

}
