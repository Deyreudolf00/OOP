/*
 * StringInputSToy.java
 *
 * Created on May 31, 2003, 3:45 PM
 */

package toySwing;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class StringInputSToy  {
    public static void main (String args[]) {
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        System.exit(0);
    }
}