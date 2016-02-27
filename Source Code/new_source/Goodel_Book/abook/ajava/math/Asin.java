package abook.ajava.math;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */
public class Asin {
  public static void main(String[] args) {
    demo();
  }

  static void demo(){
      System.out.println("Percobaan dengan Math.asin()");
      System.out.println("Eksekusi Math.asin(-1000.0) = "+Math.asin(-1000.0));
      System.out.println("Eksekusi Math.asin(-500.0)  = "+Math.asin(-500.0));
      System.out.println("Eksekusi Math.asin(-2.0)    = "+Math.asin(-2.0));
      System.out.println("Eksekusi Math.asin(-1.1)    = "+Math.asin(-1.1));
      System.out.println("Eksekusi Math.asin(-1.0)    = "+Math.asin(-1.0));
      System.out.println("Eksekusi Math.asin(-0.9)    = "+Math.asin(-0.9));
      System.out.println("Eksekusi Math.asin(-0.0)    = "+Math.asin(-0.0));
      System.out.println("Eksekusi Math.asin(0.9)     = "+Math.asin(0.9));
      System.out.println("Eksekusi Math.asin(1.0)     = "+Math.asin(1.0));
      System.out.println("Eksekusi Math.asin(1.1)     = "+Math.asin(1.1));
      System.out.println("Eksekusi Math.asin(2.0)     = "+Math.asin(2.0));
      System.out.println("Eksekusi Math.asin(500.0)   = "+Math.asin(500.0));
      System.out.println("Eksekusi Math.asin(1000.0)  = "+Math.asin(1000.0));
  }
 }
