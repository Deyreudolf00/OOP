package abook.ajava.inputToy;

import javax.swing.JOptionPane;

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
public class Input {
  public static void main(String[] args) {
    demo02();
    System.exit(0);
  }

  public static void demo01() {
    int i = intInput("Masukkan bilangan bulat : ");
    System.out.println("Angka yang dimasukkan : "+i);
  }

  public static void demo02() {
    float f = floatInput("Masukkan bilangan float : ");
    System.out.println("Angka yang dimasukkan : "+f);
  }

  public static int intInput (String s) {
    String input, dialog = s;
    int i = 0;

    while (true) {
      if (i>0)
        dialog = s + " (Pengulangan ke " + i + ")";

      input = JOptionPane.showInputDialog(dialog);
      try {
        int result = Integer.parseInt(input);
        return result;
      }
      catch (Exception e) {
        i++;
        // Empty
      }
    }
  }

  public static float floatInput (String s) {
    String input, dialog = s;
    int i = 0;

    while (true) {
      if (i>0)
        dialog = s + " (Pengulangan ke " + i + ")";

      input = JOptionPane.showInputDialog(dialog);
      try {
        float result = Float.parseFloat(input);
        return result;
      }
      catch (Exception e) {
        i++;
        // Empty
      }
    }
  }

  public static double doubleInput (String s) {
    String input, dialog = s;
    int i = 0;

    while (true) {
      if (i>0)
        dialog = s + " (Pengulangan ke " + i + ")";

      input = JOptionPane.showInputDialog(dialog);
      try {
        double result = Double.parseDouble(input);
        return result;
      }
      catch (Exception e) {
        i++;
        // Empty
      }
    }
  }

}
