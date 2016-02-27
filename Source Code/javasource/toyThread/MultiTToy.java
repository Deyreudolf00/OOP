/*
 * MultiTToy.java
 *
 * Created on May 26, 2003, 6:22 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Schild, page 282-283
 */
public class MultiTToy {
    
    /** Creates a new instance of MultiTToy */
    public MultiTToy() {
    }
    
   public static void main (String args[]) {
      new NewThread("One");
      new NewThread("Two");
      new NewThread("Three");

      try {
         Thread.sleep(10000);
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
   }
}

class NewThread implements Runnable {
   String name;
   Thread t;

   NewThread(String threadName) {
      name = threadName;
      t = new Thread(this, name);
      System.out.println(" New thread : "+t);
      t.start();
   }

   public void run() {
      try {
         for (int i=5; i>0; i--) {
            System.out.println(name + " : " + i);
            Thread.sleep (1000);
         }
      } catch (InterruptedException e) {
         System.out.println(name+ " interrupted.");
      }
      System.out.println(name + " existing.");
   }

}

