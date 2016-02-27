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
public class ToNumberString {
  public static void main(String[] args) {
    demo();
  }

  static void demo(){
      int anInt = 2005;
      System.out.println(anInt + " dalam biner adalah " + Integer.toBinaryString(anInt));
      System.out.println(anInt + " dalam oktal adalah " + Integer.toOctalString(anInt));
      System.out.println(anInt + " dalam heksadesimal adalah " + Integer.toHexString(anInt));
  }
}
