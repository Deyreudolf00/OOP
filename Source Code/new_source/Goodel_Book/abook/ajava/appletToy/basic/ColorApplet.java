/*
 * ColorApplet.java
 *
 * Created on February 10, 2004, 7:45 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
/**
 *
 * @author  bbhariyanto
 */
public class ColorApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint(Graphics g) {
        Color c1 = new Color(255, 100, 100);
        Color c2 = new Color(100, 255, 100);
        Color c3 = new Color(100, 100, 255);
        
        g.setColor(c1);
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        
        g.setColor(c2);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
        
        g.setColor(c3);
        g.drawLine(20, 150, 50, 50);
        g.drawLine(5, 290, 80, 19);
        
        g.setColor(Color.red);
        g.drawOval(10, 10, 50, 50);
        g.fillOval(70, 90, 140, 100);
        
        g.setColor(Color.blue);
        g.drawOval(190, 10, 60, 50);
        g.drawRect(10, 10, 60, 50);
        
        g.setColor(Color.cyan);
        g.fillRect(100, 10, 60, 50);
        g.drawRoundRect(190, 10, 60, 50, 15, 15);
    }
    
}
