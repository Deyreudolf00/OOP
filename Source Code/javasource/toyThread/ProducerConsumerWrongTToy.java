/*
 * ProducerConsumerWrongTToy.java
 *
 * Created on May 26, 2003, 6:26 AM
 */

package toyThread;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Schild, 296-297
 */
public class ProducerConsumerWrongTToy {
    
    /** Creates a new instance of ProducerConsumerWrongTToy */
    public ProducerConsumerWrongTToy() {
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

   synchronized int get() {
      System.out.println("Got : "+n);
      return n;
   }

   synchronized void put(int n) {
      this.n = n;
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

