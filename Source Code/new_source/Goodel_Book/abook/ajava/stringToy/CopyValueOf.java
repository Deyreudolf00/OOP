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
public class CopyValueOf {
  static char[] c = {'H', 'E', 'L', 'L', 'O'};
  static String s;

  public static void main(String[] args) {
    demo();
    demo02();
  }

  static void demo() {
      System.out.println("Percobaan sederhana untuk copyValueOf : ");
      System.out.println("c[0] = "+c[0]);
      System.out.println("c[1] = "+c[1]);
      System.out.println("c[2] = "+c[2]);
      System.out.println("c[3] = "+c[3]);
      System.out.println("c[4] = "+c[4]);
      System.out.println("Eksekusi s.copyValueOf(c) = "+s.copyValueOf(c));
  }

  static void demo02() {
      System.out.println("Percobaan sederhana untuk copyValueOf(c,offset,index) : ");
      System.out.println("Eksekusi s.copyValueOf(c,0,0) = "+s.copyValueOf(c,0,0));
      System.out.println("Eksekusi s.copyValueOf(c,0,1) = "+s.copyValueOf(c,0,1));
      System.out.println("Eksekusi s.copyValueOf(c,0,2) = "+s.copyValueOf(c,0,2));
      System.out.println("Eksekusi s.copyValueOf(c,0,3) = "+s.copyValueOf(c,0,3));
      System.out.println("Eksekusi s.copyValueOf(c,0,4) = "+s.copyValueOf(c,0,4));
      System.out.println("Eksekusi s.copyValueOf(c,0,5) = "+s.copyValueOf(c,0,5));

      System.out.println("Eksekusi s.copyValueOf(c,1,0) = "+s.copyValueOf(c,0,0));
      System.out.println("Eksekusi s.copyValueOf(c,1,1) = "+s.copyValueOf(c,1,1));
      System.out.println("Eksekusi s.copyValueOf(c,1,2) = "+s.copyValueOf(c,1,2));
      System.out.println("Eksekusi s.copyValueOf(c,1,3) = "+s.copyValueOf(c,1,3));
      System.out.println("Eksekusi s.copyValueOf(c,1,4) = "+s.copyValueOf(c,1,4));

      //        System.out.println("Eksekusi s.copyValueOf(c,1,5) = "+s.copyValueOf(c,1,5));
      // Error dengan pesan Exception : java.lang.StringIndexOutOfBoundsException
  }

}
