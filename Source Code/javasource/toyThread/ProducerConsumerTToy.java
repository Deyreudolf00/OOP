/*
 * ProducerConsumerTToy.java
 *
 * Created on May 26, 2003, 6:15 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Schild, page 298-299
 */

public class ProducerConsumerTToy {
    
    /** Creates a new instance of ProducerConsumerTToy */
    public ProducerConsumerTToy() {
    }
    
    public static void main (String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stop");
    }
}

class Q {
   int n;
   boolean valueSet = false;

   synchronized int get() {
      if (!valueSet) {
         try {
            wait();
         } catch (InterruptedException e) {
            System.out.println("Interrupted.");
         }
      }
      System.out.println("Got : "+n);
      valueSet = false;
      notify();
      return n;
   }

   synchronized void put(int n) {
      if (valueSet) {
         try {
            wait();
         } catch(InterruptedException e) {
            System.out.println("Interrupted.");

         }
      }

      this.n = n;
      valueSet = true;
      System.out.println("Put: " + n);
   }
}

class Producer implements Runnable {
  Q q;

  Producer (Q q) {
     this.q = q;
     new Thread(this, "Producer").start();
  }

  public void run() {
     int i=0;

     while (true) {
        q.put(i++);
     }
  }
}

class Consumer implements Runnable {
   Q q;

   Consumer(Q q) {
      this.q = q;
      new Thread(this,"Consumen").start();
   }

   public void run() {
      while (true) {
         q.get();
      }
   }
}

