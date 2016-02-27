/*
 * DoubleInputSToy.java
 *
 * Created on May 31, 2003, 3:51 PM
 */

package abook.ajava.swingToy;
import javax.swing.*;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class DoubleInputSToy {  
    public static void main (String args[]) {     
        String input = JOptionPane.showInputDialog("Berapa tinggi menara Pisa?");     
        double height = Double.parseDouble(input);     
        System.out.println("Tinggi menara pisa = "+height);     
        System.exit(0);  
    }
}
