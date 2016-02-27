/*
 * LineApplet.java
 *
 * Created on February 10, 2004, 6:03 AM
 */

package abook.ajava.appletToy.basic;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author  bbhariyanto
 */
public class LineApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
    }
}
