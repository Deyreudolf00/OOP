/*
 * DemoNextTToy.java
 *
 * Created on May 26, 2003, 6:40 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DemoNextTToy {
    
    /** Creates a new instance of DemoNextTToy */
    public DemoNextTToy() {
    }
    
   public static void main (String args[]) {
      new NewThread();

      try {
         for(int i=5;i>0;i--) {
            System.out.println("Main Thread : "+i);
            Thread.sleep(100);
         }
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread existing.");
   }
}

class NewThread implements Runnable {
   Thread t;

   NewThread() {
      t = new Thread(this, "Demo Thread");
      System.out.println("Child thread : "+t);
      t.start();
   }

   public void run() {
      try {
         for (int i=5; i>0; i--) {
            System.out.println("Child thread: "+ i);
            Thread.sleep (500);
         }
      } catch (InterruptedException e) {
         System.out.println("Child interrupted.");
      }
      System.out.println("Existing child thread.");
   }
}

