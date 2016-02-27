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
public class StringDemo {
  public static void main(String[] args) {
    demo01();
  }

  static void demo01() {
      System.out.println(":: Demo string constructors ::");
      char charArray[] = {'b', 'a', 'm', 'b', 'a', 'n', 'g'};
      byte byteArray[] = {'h', 'a', 'r', 'i', 'y', 'a', 'n', 't', 'o'};

      // StringBuffer constructor
      StringBuffer strBuf = new StringBuffer();
      strBuf = strBuf.append("Selamat datang!");

      // String constructors
      String s = new String("Hello!");
      String s1 = new String();
      String s2 = new String(s);
      String s3 = new String(charArray);
      String s4 = new String(charArray, 4,3);
      String s5 = new String(byteArray, 0, 4, 4);
      String s6 = new String(byteArray, 0);
      String s7 = new String(strBuf);

      System.out.println("charArray[] = "+charArray);
      System.out.println("byteArray[] = "+byteArray);
      System.out.println("strBuf      = "+strBuf);

      System.out.println("-------------------------");
      System.out.println("s = new String(\"Hello\"),          s  = "+s);
      System.out.println("s1 = new String(),                s1 = "+s1);
      System.out.println("s2 = new String(s),               s2 = "+s2);
      System.out.println("s3 = new String(charArray),       s3 = "+s3);
      System.out.println("s4 = new String(charArray,4,3),   s4 = "+s4);
      System.out.println("s5 = new String(byteArray,0,4,4), s5 = "+s5);
      System.out.println("s6 = new String(byteArray,0),     s6 = "+s6);
      System.out.println("s7 = new String(strBuf),          s7 = "+s7);
  }

  static void demo02() {
      String s1 = new String("Hello, teman!");
      char charArray[] = new char[5];
      byte byteArray[] = new byte[5];

      System.out.println("String s1   = "+s1);
      System.out.println("s1.length() = "+s1.length());
      System.out.println(":: Mencetak s1 dengan urutan terbalik ::");
      for(int i=s1.length()-1;i>=0;i--){
          System.out.print(s1.charAt(i));
      }
      System.out.println("");

      System.out.println(":: Mengkopi karakter dari string ke byte array ::");
      System.out.println("String s1   = "+s1);
      s1.getChars(0, 5, charArray, 0);
      System.out.println("s1.getChars(0, 5, charArray, 0), charArray = "+charArray);

      System.out.println(":: Mengkopi karakter dari string ke char array ::");
      System.out.println("String s1   = "+s1);
      s1.getBytes(6, 11, byteArray, 0);
      System.out.println("s1.getBytes(6, 11, charArray, 0), charArray = "+charArray);
  }

  static void demo03() {
      String s1 = new String("hello");
      String s2 = new String("Selamat datang!");
      String s3 = new String("Selamat Ulang Tahun!");
      String s4 = new String("Selamat ulang tahun!");

      System.out.println("s1 = "+s1);
      System.out.println("s2 = "+s2);
      System.out.println("s3 = "+s3);
      System.out.println("s4 = "+s4);

      System.out.println("s1 == \"Hello\"               = "+(s1=="Hello"));
      System.out.println("s1 == \"hello\"               = "+(s1=="hello"));
      System.out.println("s1.equals(\"Hello\")          = "+s1.equals("Hello"));
      System.out.println("s1.equals(\"hello\")          = "+s1.equals("hello"));
      System.out.println("s1.equalsIgnoreCase(\"Hello\") = "+s1.equalsIgnoreCase("Hello"));
      System.out.println("s1.equalsIgnoreCase(\"hello\") = "+s1.equalsIgnoreCase("hello"));
      System.out.println("s1.compareTo(s1) = "+s1.compareTo(s1));
      System.out.println("s1.compareTo(s2) = "+s1.compareTo(s2));
      System.out.println("s2.compareTo(s2) = "+s2.compareTo(s2));
      System.out.println("s2.compareTo(s1) = "+s2.compareTo(s1));
      System.out.println("s3.compareTo(s3) = "+s3.compareTo(s3));
      System.out.println("s3.compareTo(s4) = "+s3.compareTo(s4));
      System.out.println("s4.compareTo(s4) = "+s4.compareTo(s4));
      System.out.println("s4.compareTo(s3) = "+s4.compareTo(s3));
      System.out.println("s3.regionMatches(0, s4, 0, 5) = "+s3.regionMatches(0, s4, 0, 5));
      System.out.println("s3.regionMatches(true, 0, s4, 0, 5) = "+s3.regionMatches(true, 0, s4, 0, 5));
  }
}
