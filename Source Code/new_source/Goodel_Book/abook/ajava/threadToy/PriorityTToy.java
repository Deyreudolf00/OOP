/*
 * PriorityTToy.java
 *
 * Created on May 26, 2003, 6:46 AM
 * Schild, page 288-289
 */

package abook.ajava.threadToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class PriorityTToy {
    
    /** Creates a new instance of PriorityTToy */
    public PriorityTToy() {
    }
   public static void main (String args[]) {
      Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
      clicker hi = new clicker(Thread.NORM_PRIORITY+2);
      clicker lo = new clicker(Thread.NORM_PRIORITY-2);

      lo.start();
      hi.start();
      try {
         Thread.sleep(10000);
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }

      lo.stop();
      hi.stop();

      try {
         hi.t.join();
         lo.t.join();
      } catch (InterruptedException e) {
         System.out.println("InterruptedException caught.");
      }
      System.out.println("Low priority thread  : " + lo.getClick());
      System.out.println("High priority thread : " + hi.getClick());
   }
}

class clicker implements Runnable {
   int click = 0;
   Thread t;
   private volatile boolean running = true;

   public clicker(int p) {
      t = new Thread(this);
      t.setPriority(p);
   }

   public int getClick() {
      return click;
   }

   public void run() {
      while (running) {
         click++;
      }
   }

   public void stop() {
      running = false;
   }

   public void start() {
     t.start();
   }
}
