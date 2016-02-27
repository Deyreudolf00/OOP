/*
 * EllipseApplet.java
 *
 * Created on February 10, 2004, 6:18 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class EllipseApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint(Graphics g) {
        g.drawOval(10, 10, 50, 50);
        g.fillOval(100, 10, 75, 50);
        g.drawOval(190, 10, 90, 30);
        g.fillOval(70, 90, 140, 100);
    }
    
}
