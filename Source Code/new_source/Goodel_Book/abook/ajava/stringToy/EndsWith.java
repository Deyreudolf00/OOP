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
public class EndsWith {
  static String s =
      "Orang yang dapat melepaskan diri dari suatu kebiasaan "+
      "adalah bagaikan mukjizat";

  public static void main(String[] args) {
    demo01();
    demo02();
  }
  static void demo01(){
      System.out.println("Percobaan sederhana untuk endsWith(): ");

      if (s.endsWith("t")) {
          System.out.println("Bagian TRUE:");
          System.out.println("String s = "+s);
          System.out.println("berakhir dengan : "+"t");
      }

      if (s.endsWith("zat")) {
          System.out.println("Bagian TRUE:");
          System.out.println("String s = "+s);
          System.out.println("berakhir dengan : "+"zat");
      }

      if (s.endsWith("mukjizat")) {
          System.out.println("Bagian TRUE:");
          System.out.println("String s = "+s);
          System.out.println("berakhir dengan : "+"mukjizat");
      }

      if (s.endsWith(" mukjizat")) {
          System.out.println("Bagian TRUE:");
          System.out.println("String s = "+s);
          System.out.println("berakhir dengan : "+" mukjizat");
      }

      if (s.endsWith("bagaikan mukjizat")) {
          System.out.println("Bagian TRUE:");
          System.out.println("String s = "+s);
          System.out.println("berakhir dengan : "+"bagaikan mukjizat");
      }
  }

  static void demo02(){
      if (s.endsWith("yaitu mukjizat")) {
          System.out.println("Bagian TRUE:");
          System.out.println("String s = "+s);
          System.out.println("berakhir dengan : "+"yaitu mukjizat");
      } else {
          System.out.println("Bagian FALSE:");
          System.out.println("String s = "+s);
          System.out.println("tidak berakhir dengan : "+"yaitu mukjizat");
      }
  }

}
