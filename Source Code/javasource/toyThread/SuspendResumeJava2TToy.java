/*
 * SuspendResumeJava2TToy.java
 *
 * Created on May 26, 2003, 6:30 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Schild, 307-308
 */
public class SuspendResumeJava2TToy {
    
    /** Creates a new instance of SuspendResumeJava2TToy */
    public SuspendResumeJava2TToy() {
    }
    
   public static void main (String args[]) {
      NewThread ob1 = new NewThread("One");
      NewThread ob2 = new NewThread("Two");

      try {
         Thread.sleep(1000);
         ob1.mysuspend();
         System.out.println("Suspending thread one");
         Thread.sleep(1000);
         ob1.myresume();
         System.out.println("Resuming thread one");
         ob2.mysuspend();
         System.out.println("Suspending thread two");
         ob2.myresume();
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
   boolean suspendFlag;

   NewThread(String newName) {
      name = newName;
      t = new Thread(this, name);
      System.out.println("New thread : " + t);
      suspendFlag = false;
      t.start();
   }

   void mysuspend() {
      suspendFlag = true;
   }

   synchronized void myresume() {
      suspendFlag = false;
      notify();
   }

   public void run() {
      try {
         for(int i=15;i>0;i--) {
            System.out.println(name + ": " + i);
            Thread.sleep(200);
            synchronized (this) {
               while(suspendFlag) {
                  wait();
               }
            }
         }
      } catch(InterruptedException e) {
         System.out.println(name + " interrupted.");
      }
      System.out.println(name + " exiting");
   }
}


