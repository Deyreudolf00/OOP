/*
 * SuspendResumeOldTToy.java
 *
 * Created on May 26, 2003, 6:35 AM
 */

package abook.ajava.threadToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class SuspendResumeOldTToy {
    
    /** Creates a new instance of SuspendResumeOldTToy */
    public SuspendResumeOldTToy() {
    }
    
   public static void main (String args[]) {
      NewThread ob1 = new NewThread("One");
      NewThread ob2 = new NewThread("Two");

      try {
         Thread.sleep(1000);
         ob1.t.suspend();
         System.out.println("Suspending thread one");
         Thread.sleep(1000);
         ob1.t.resume();
         System.out.println("Resuming thread one");
         ob2.t.suspend();
         System.out.println("Suspending thread two");
         ob2.t.resume();
         System.out.println("Resuming thread two");

      } catch(InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }

      try {
         System.out.println("Waiting for threads to finish");
         ob1.t.join();
         ob2.t.join();

      } catch(InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread exiting");
   }
}

class NewThread implements Runnable {
   String name;
   Thread t;

   NewThread(String newName) {
      name = newName;
      t = new Thread(this, name);
      System.out.println("New thread : " + t);
      t.start();
   }

   public void run() {
      try {
         for(int i=15;i>0;i--) {
            System.out.println(name + ": " + i);
            Thread.sleep(200);
         }
      } catch(InterruptedException e) {
         System.out.println(name + " interrupted.");
      }
      System.out.println(name + " exiting");
   }
}

