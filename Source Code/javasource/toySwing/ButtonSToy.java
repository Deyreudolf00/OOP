/*
 * ButtonSToy.java
 *
 * Created on May 26, 2003, 5:52 AM
 */

package toySwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * JFC, page 28
 */

public class ButtonSToy extends JFrame {
    
    /** Creates a new instance of ButtonSToy */
    public ButtonSToy() {
      super("JFC Buttons");
      setSize(400, 200);
      setBackground(Color.lightGray);
      getContentPane().setLayout(new FlowLayout());

      ImageIcon img1 = new ImageIcon("face1.gif");
      ImageIcon img2 = new ImageIcon("face2.gif");
      ImageIcon img3 = new ImageIcon("face3.gif");

      JButton b1 = new JButton(img1);
      b1.setRolloverIcon(img2);
      b1.setRolloverEnabled(true);
      b1.setPressedIcon(img3);
      getContentPane().add(b1);

      addWindowListener(new MyWindowListener());
      setVisible(true);
    }
    
   class MyWindowListener extends WindowAdapter {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
   }
   public static void main (String args[]) {
     new ButtonSToy();
   }
}
