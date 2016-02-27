/*
 * ResizeApplet.java
 *
 * Created on February 10, 2004, 6:29 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class ResizeApplet extends java.applet.Applet {
    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public ResizeApplet() {
        addMouseListener (new MouseAdapter() {
            public void mouseReleased(MouseEvent me) {
                int w = (d.width + inc) > max?min:(d.width+inc);
                int h = (d.height + inc) > max?min:(d.height+inc);
                setSize(new Dimension(w, h));
            }
        });
    }
    
    public void paint(Graphics g) {
        d = getSize();
        g.drawLine(0, 0, d.width-1, d.height-1);
        g.drawLine(0, d.height-1, d.width-1, 0);
        g.drawRect(0, 0, d.width-1, d.height-1);
    }
    
}
