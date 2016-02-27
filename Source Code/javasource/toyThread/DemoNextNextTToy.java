/*
 * DemoNextNextTToy.java
 *
 * Created on May 26, 2003, 6:41 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class DemoNextNextTToy {
    
    /** Creates a new instance of DemoNextNextTToy */
    public DemoNextNextTToy() {
    }
   public static void main (String args[]) {
      new NewThread();

      try {
         for (int i=5;i>0;i--) {
            System.out.println("Main thread : "+i);
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread exiting.");
   }
    
}

class NewThread extends Thread {
    NewThread() {
       super("Demo Thread");
       System.out.println("Child thread "+this);
       start();
    }

    public void run() {
       try {
           for(int i=5;i>0;i--) {
              System.out.println("Child thread : "+i);
              Thread.sleep(1000);
           }
       } catch (InterruptedException e) {
          System.out.println("Child interrupted.");
       }
       System.out.println("Exiting child thread.");
    }
}
