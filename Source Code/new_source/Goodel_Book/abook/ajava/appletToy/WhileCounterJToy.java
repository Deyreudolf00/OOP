/*
 * WhileCounterJToy.java
 *
 * Created on May 26, 2003, 4:38 AM
 */

package abook.ajava.appletToy;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Deitel, page 170
 */

public class WhileCounterJToy extends javax.swing.JApplet {
    
    /** Creates a new instance of WhileCounterJToy */
    public WhileCounterJToy() {
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        int counter = 1;

        while (counter <= 10) {
            g.drawLine(10, 10, 250, counter * 10);
            ++counter;
        }
   }
    
}
