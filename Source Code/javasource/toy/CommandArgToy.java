/*
 * CommandArgToy.java
 *
 * Created on May 25, 2003, 6:34 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class CommandArgToy {
    
    /** Creates a new instance of CommandArgToy */
  public static void main (String args[]) {
      System.out.println("Argumen-argumen baris perintah: ");
      for (int i = 0; i<args.length; i++) {
          System.out.println(args[i]);
      }
  }
}
