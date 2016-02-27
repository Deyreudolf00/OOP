/*
 * ArcApplet.java
 *
 * Created on February 10, 2004, 6:21 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class ArcApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint (Graphics g) {
        g.drawArc(10, 40, 70, 70, 0, 75);
        g.fillArc(100, 40, 70, 70, 0, 75);
        g.drawArc(10, 100, 70, 80, 0, 175);
        g.fillArc(100, 100, 70, 90, 0, 270);
        g.drawArc(200, 80, 80, 80, 0, 180);
    }
    
}
