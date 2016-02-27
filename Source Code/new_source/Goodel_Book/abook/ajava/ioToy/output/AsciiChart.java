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

public class AsciiChart {
  public static void main(String[] args) {
    for (int i = 32; i < 127; i++) {
      System.out.write(i);
// break line after every eight characters.
      if (i % 8 == 7) {
        System.out.write('\n');
      }
      else {
        System.out.write('\t');
      }
    }
    System.out.write('\n');
  }
}
