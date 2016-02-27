/*
 * CommandArgumenToy.java
 *
 * Created on May 19, 2003, 3:10 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class CommandArgumenToy {
    
    /** Creates a new instance of CommandArgumenToy */
    public CommandArgumenToy() {
    }
    
  public static void main (String args[]) {
      System.out.println("Argumen-argumen baris perintah: ");
      for (int i = 0; i<args.length; i++) {
          System.out.println(args[i]);
      }
  }
}
