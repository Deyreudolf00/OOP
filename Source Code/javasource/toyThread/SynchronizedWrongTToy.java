/*
 * SynchronizedWrongTToy.java
 *
 * Created on May 26, 2003, 6:33 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Schild, 291-292
 */
public class SynchronizedWrongTToy {
    
    /** Creates a new instance of SynchronizedWrongTToy */
    public SynchronizedWrongTToy() {
    }
    
   public static void main (String args[]) {
      Callme target = new Callme();
      Caller ob1 = new Caller(target, "Hello");
      Caller ob2 = new Caller(target, "Synchronized");
      Caller ob3 = new Caller(target, "World");

      try {
         ob1.t.join();
         ob2.t.join();
         ob3.t.join();
      } catch (InterruptedException e) {
         System.out.println("Interrupted.");
      }
   }
}

class Callme {
   void call (String msg) {
      System.out.print("["+msg);
      try {
         Thread.sleep(1000);
      } catch (InterruptedException e) {
         System.out.println("Interrupted.");
      }
      System.out.println("]");
   }
}

class Caller implements Runnable {
   String msg;
   Callme target;
   Thread t;
   public Caller(Callme newTarget, String s) {
      target = newTarget;
      msg = s;
      t = new Thread(this);
      t.start();
   }

   public void run() {
      target.call(msg);
   }
}
