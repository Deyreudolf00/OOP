/*
 * DemoTToy.java
 *
 * Created on May 26, 2003, 6:38 AM
 */

package abook.ajava.threadToy2;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DemoTToy {
    
    /** Creates a new instance of DemoTToy */
    public DemoTToy() {
    }
    
   public static void main (String args[]) {
      Thread t = Thread.currentThread();

      System.out.println("Current Thread : "+t);

      // Ubah nama dari thread
      t.setName("My Thread");
      System.out.println("Setelah diubah namanya : "+t);

      try {
         for (int n=5; n>0; n--) {
            System.out.print(n);
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
          System.out.println("Main thread interrupted");
      }
   }
}
