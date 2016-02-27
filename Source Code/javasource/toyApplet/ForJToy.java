/*
 * ForJToy.java
 *
 * Created on June 3, 2003, 6:31 AM
 */

package toyApplet;
import javax.swing.JApplet;
import java.awt.Graphics;


/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ForJToy extends javax.swing.JApplet {
    
    /** Creates a new instance of ForJToy */
    public ForJToy() {
    }
    
   public void paint(Graphics g) {
      super.paint(g);

      for(int counter =1; counter <=10 ; counter++) {
         g.drawLine(10, 10, 250, counter * 10);
      }
   }
}
