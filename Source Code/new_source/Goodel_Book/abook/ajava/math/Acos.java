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
public class Acos {
  public static void main(String[] args) {
    demo();
  }

  static void demo(){
      System.out.println("Percobaan dengan Math.acos()");
      System.out.println("Eksekusi Math.acos(-1000.0) = "+Math.acos(-1000.0));
      System.out.println("Eksekusi Math.acos(-500.0)  = "+Math.acos(-500.0));
      System.out.println("Eksekusi Math.acos(-2.0)    = "+Math.acos(-2.0));
      System.out.println("Eksekusi Math.acos(-1.1)    = "+Math.acos(-1.1));
      System.out.println("Eksekusi Math.acos(-1.0)    = "+Math.acos(-1.0));
      System.out.println("Eksekusi Math.acos(-0.9)    = "+Math.acos(-0.9));
      System.out.println("Eksekusi Math.acos(-0.0)    = "+Math.acos(-0.0));
      System.out.println("Eksekusi Math.acos(0.9)     = "+Math.acos(0.9));
      System.out.println("Eksekusi Math.acos(1.0)     = "+Math.acos(1.0));
      System.out.println("Eksekusi Math.acos(1.1)     = "+Math.acos(1.1));
      System.out.println("Eksekusi Math.acos(2.0)     = "+Math.acos(2.0));
      System.out.println("Eksekusi Math.acos(500.0)   = "+Math.acos(500.0));
      System.out.println("Eksekusi Math.acos(1000.0)  = "+Math.acos(1000.0));
  }
}
