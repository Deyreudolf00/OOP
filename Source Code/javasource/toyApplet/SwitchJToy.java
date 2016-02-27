/*
 * SwitchJToy.java
 *
 * Created on June 3, 2003, 6:35 AM
 */

package toyApplet;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class SwitchJToy extends javax.swing.JApplet {
    
    /** Creates a new instance of SwitchJToy */
    public SwitchJToy() {
    }
   int choice;

   public void init() {
      String input;

      input = JOptionPane.showInputDialog(
        "Enter 1 to draw lines\n" +
        "Enter 2 to draw rectangles\n" +
        "Enter 3 to draw ovals\n");

      choice = Integer.parseInt(input);
   }

   public void paint(Graphics g) {
      super.paint(g);
      for (int i=0;i<10;i++) {
         switch(choice) {
           case 1:
             g.drawLine(10,10,250,10+i*10);
             break;
           case 2:
             g.drawRect(10+i*10,10+i*10,50+i*10,50+i*10);
             break;
           case 3:
             g.drawOval(10+i*10,10+i*10,50+i*10,50+i*10);
             break;
         }
      }
   }
}
