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
public class Atan {
  public static void main(String[] args) {
    demo();
  }

  static void demo(){
      System.out.println("Percobaan dengan Math.atan()");
      System.out.println("Eksekusi Math.atan(-1000.0) = "+Math.atan(-1000.0));
      System.out.println("Eksekusi Math.atan(-500.0)  = "+Math.atan(-500.0));
      System.out.println("Eksekusi Math.atan(-2.0)    = "+Math.atan(-2.0));
      System.out.println("Eksekusi Math.atan(-1.1)    = "+Math.atan(-1.1));
      System.out.println("Eksekusi Math.atan(-1.0)    = "+Math.atan(-1.0));
      System.out.println("Eksekusi Math.atan(-0.9)    = "+Math.atan(-0.9));
      System.out.println("Eksekusi Math.atan(-0.0)    = "+Math.atan(-0.0));
      System.out.println("Eksekusi Math.atan(0.9)     = "+Math.atan(0.9));
      System.out.println("Eksekusi Math.atan(1.0)     = "+Math.atan(1.0));
      System.out.println("Eksekusi Math.atan(1.1)     = "+Math.atan(1.1));
      System.out.println("Eksekusi Math.atan(2.0)     = "+Math.atan(2.0));
      System.out.println("Eksekusi Math.atan(500.0)   = "+Math.atan(500.0));
      System.out.println("Eksekusi Math.atan(1000.0)  = "+Math.atan(1000.0));
  }
}
