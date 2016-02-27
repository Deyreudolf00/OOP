package abook.ajava.syntaxToy;

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
public class Precedence {
  public static void main(String[] args) {
    demo();
  }

  public static void demo() {
    int p = 1, q = 2, r = 3;

    System.out.println("Hasil eksekusi ekspresi \"1 + 2 == 3 * 4\"               ===> "
                       + (1 + 2 == 3 * 4) );
    System.out.println("Hasil eksekusi ekspresi \"1 + 2 == 3 * 4 && 5 / 6 == 7\" ===> "
                       + (1 + 2 == 3 * 4 && 5 / 6 == 7) );
    /* Error
    System.out.println("Hasil eksekusi ekspresi \"p == q <= r\"                  ===> "
                       + (p == q <= r) );
    */

  }
}
