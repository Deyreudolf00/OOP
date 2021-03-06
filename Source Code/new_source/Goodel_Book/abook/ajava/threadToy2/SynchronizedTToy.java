/*
 * SynchronizedTToy.java
 *
 * Created on May 26, 2003, 6:28 AM
 */

package abook.ajava.threadToy2;

import abook.ajava.threadToy2.synch02.Caller;
import abook.ajava.threadToy2.synch02.Callme;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Schild, page 294-295
 */

public class SynchronizedTToy {
    
    /** Creates a new instance of SynchronizedTToy */
    public SynchronizedTToy() {
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
      synchronized(target) {
         target.call(msg);
      }
   }
}
