package abook.ajava.stringToy;

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
public class Equals {
  static String s = "Hello";

  public static void main(String[] args) {
    demo();
  }
  static void demo() {
      System.out.println("Percobaan sederhana untuk equals(): ");
      System.out.println("String s = "+s);

      if (s.equals("Hello")) {
          System.out.println("Bagian TRUE : s.equals(\"Hello\")");
      } else {
          System.out.println("Bagian FALSE : s.equals(\"Hello\")");
      }

      if (s.equals("HELLO")) {
          System.out.println("Bagian TRUE : s.equals(\"HELLO\")");
      } else {
          System.out.println("Bagian FALSE : s.equals(\"HELLO\")");
      }
  }

}
