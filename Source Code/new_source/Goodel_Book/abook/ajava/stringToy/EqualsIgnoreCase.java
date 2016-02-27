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
public class EqualsIgnoreCase {
  static String s = "Hello";

  public static void main(String[] args) {
    demo();
  }
  static void demo() {
    System.out.println("Percobaan sederhana untuk equalsIgnoreCase(): ");
    System.out.println("String s = "+s);

    if (s.equalsIgnoreCase("Hello")) {
        System.out.println("Bagian TRUE : s.equalsIgnoreCase(\"Hello\")");
    } else {
        System.out.println("Bagian FALSE : s.equalsIgnoreCase(\"Hello\")");
    }

    if (s.equalsIgnoreCase("HELLO")) {
        System.out.println("Bagian TRUE : s.equalsIgnoreCase(\"HELLO\")");
    } else {
        System.out.println("Bagian FALSE : s.equalsIgnoreCase(\"HELLO\")");
    }
}


}
