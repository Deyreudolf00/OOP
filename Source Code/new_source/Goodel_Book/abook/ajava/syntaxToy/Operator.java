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
public class Operator {
  public static void main(String[] args) {
    // demoPostIncrement();
    // demoPostIncrement2();
    // demoPreIncrement();
    // demoPreIncrement2();
    // demoPostDecrement();
    // demoPostDecrement2();
    // demoPreDecrement();
    // demoPreDecrement2();

    demoWhatWrong();
  }

  public static void demoPostIncrement() {
    int x = 10;
    System.out.println("x = " + x);
    System.out.println("x++   ==> x = " + x++);
    System.out.println("x = " + x);

  }

  public static void demoPostIncrement2() {
    int x = 10;

    int a = x;
    int b = x++;
    int c = x;

    System.out.println("int x = 10");
    System.out.println("int a = x");
    System.out.println("int b = x++");
    System.out.println("int c = x");
    System.out.println(":: efeknya sebagai berikut : ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }

  public static void demoPreIncrement() {
    int x = 10;
    System.out.println("x = " + x);
    System.out.println("++x   ==> x = " + ++x);
    System.out.println("x = " + x);

  }

  public static void demoPreIncrement2() {
    int x = 10;

    int a = x;
    int b = ++x;
    int c = x;

    System.out.println("int x = 10");
    System.out.println("int a = x");
    System.out.println("int b = ++x");
    System.out.println("int c = x");
    System.out.println(":: efeknya sebagai berikut : ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }

  public static void demoPostDecrement() {
    int x = 10;
    System.out.println("x = " + x);
    System.out.println("x--   ==> x = " + x--);
    System.out.println("x = " + x);

  }

  public static void demoPostDecrement2() {
    int x = 10;

    int a = x;
    int b = x--;
    int c = x;

    System.out.println("int x = 10");
    System.out.println("int a = x");
    System.out.println("int b = x--");
    System.out.println("int c = x");
    System.out.println(":: efeknya sebagai berikut : ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }

  public static void demoPreDecrement() {
    int x = 10;
    System.out.println("x = " + x);
    System.out.println("--x   ==> x = " + --x);
    System.out.println("x = " + x);

  }

  public static void demoPreDecrement2() {
    int x = 10;

    int a = x;
    int b = --x;
    int c = x;

    System.out.println("int x = 10");
    System.out.println("int a = x");
    System.out.println("int b = --x");
    System.out.println("int c = x");
    System.out.println(":: efeknya sebagai berikut : ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
  }

  public static void demoWhatWrong() {
    int a = 10;

    int b = (a);     // Valid
    int c = ++(a);   // Valid
    int d = (a+1);   // Valid
    // int e = ++(a+1); // Tidak Valid
    // int f = ++(a++); // Tidak Valid
    // int g = ++(++a); // Tidak Valid
    int h = ++a + 1; // Valid
    int i = a++ + 1; // Valid

    System.out.println("a = " + a);
  }
}
