/*
 * HelloWorldJToy.java
 *
 * Created on May 26, 2003, 4:36 AM
 */

package abook.ajava.appletToy;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class HelloWorldJToy extends javax.swing.JApplet {
    
    /** Creates a new instance of HelloWorldJToy */
    public HelloWorldJToy() {
    }
    
   public void paint (Graphics g) {
      super.paint(g);
      g.drawString("Hello World!",25,25);
   }
}
