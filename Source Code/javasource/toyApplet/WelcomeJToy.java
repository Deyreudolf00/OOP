/*
 * WelcomeJToy.java
 *
 * Created on May 26, 2003, 4:41 AM
 */

package toyApplet;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class WelcomeJToy extends javax.swing.JApplet {
    
    /** Creates a new instance of WelcomeJToy */
    public WelcomeJToy() {
    }
    
   public void paint(Graphics g) {
      super.paint(g);
      g.drawString("Welcome to Java Programming!",25,25);
   }
}
