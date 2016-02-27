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
public class Concat {
  static String s1 = "Orang yang dapat melepaskan diri dari suatu kebiasaan ";
  static String s2 = "adalah bagaikan mukjizat";

  public static void main(String[] args) {
    demo();
  }

  static void demo() {
      System.out.println("Percobaan sederhana untuk concat() : ");
      System.out.println("String s1 = "+s1);
      System.out.println("String s2 = "+s2);
      System.out.println("String s1.concat(s2) = "+s1.concat(s2));
  }
}
