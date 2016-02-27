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
public class Expression {
  public static void main(String[] args) {
    // demoAritmeticExpr1();
    demoAritmeticExpr2();
  }


  public static void demoAritmeticExpr1 () {
    long x;

    x = 7 + 3 * 6 / 2 - 1;
    System.out.println("x = 7 + 3 * 6 / 2 - 1                     ==> x = " + x);

    x = 2 % 2 + 2 * 2 - 2 / 2;
    System.out.println("x = 2 % 2 + 2 * 2 - 2 / 2                 ==> x = " + x);

    x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
    System.out.println("x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) ) ==> x = " + x);

  }

  public static void demoAritmeticExpr2 () {
    long a = 5 ;
    long x = 10;
    long y = a * x * x * x + 7;

    System.out.println("long a = 5;");
    System.out.println("long x = 10;");
    System.out.println("long y = a * x * x * x + 7; ==> y = " + y);
  }

}
