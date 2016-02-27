/*
 * BorderJToy.java
 *
 * Created on May 26, 2003, 4:33 AM
 */

package abook.ajava.appletToy;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * JFC
 * Page 23-24
 */

public class BorderJToy extends javax.swing.JApplet {
    
    /** Creates a new instance of BorderJToy */
    public BorderJToy() {
    }
    
   public synchronized void init () {
      setBackground(Color.lightGray);
      getContentPane().setLayout(new GridLayout(6,1,10,3));


      JLabel lbl1 = new JLabel("LineBorder", SwingConstants.CENTER);
      lbl1.setBorder(new LineBorder(Color.gray, 2));
      getContentPane().add(lbl1);

      JLabel lbl2 = new JLabel("BevelBorder RAISED",SwingConstants.CENTER);
      Border b1 = new BevelBorder(BevelBorder.RAISED, Color.white, Color.gray);
      lbl2.setBorder(b1);
      getContentPane().add(lbl2);

      JLabel lbl3 = new JLabel("SoftBevelBorder LOWERED", SwingConstants.CENTER);
      Border b2 = new BevelBorder(BevelBorder.LOWERED, Color.white, Color.gray);
      lbl3.setBorder(b2);
      getContentPane().add(lbl3);

      JLabel lbl4 = new JLabel("EtchedBorder",SwingConstants.CENTER);
      lbl4.setBorder(new EtchedBorder(Color.gray, Color.white));
      getContentPane().add(lbl4);

      JLabel lbl5 = new JLabel("CompoundBorder", SwingConstants.CENTER);
      lbl5.setBorder(new CompoundBorder(b1,b2));
      getContentPane().add(lbl5);

      JLabel lbl6 = new JLabel("MatteBorder",SwingConstants.CENTER);
      lbl6.setBorder(new MatteBorder(3,6,0,6,Color.red));
      getContentPane().add(lbl6);

   }
}
