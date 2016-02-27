/*
 * ScrollbarApplet.java
 *
 * Created on February 10, 2004, 7:27 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class ScrollbarApplet extends java.applet.Applet  implements AdjustmentListener, MouseMotionListener {
    String msg = "";
    Scrollbar vertSB, horzSB;

    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));
        vertSB = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
        horzSB = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, height);
        add(vertSB);
        add(horzSB);
        
        vertSB.addAdjustmentListener(this);
        horzSB.addAdjustmentListener(this);
        
        addMouseMotionListener(this);
    }
    
    public void adjustmentValueChanged(java.awt.event.AdjustmentEvent adjustmentEvent) {
        repaint();
    }
    
    public void mouseDragged(java.awt.event.MouseEvent mouseEvent) {
        int x = mouseEvent.getX();
        int y = mouseEvent.getY();
        vertSB.setValue(y);
        horzSB.setValue(x);
        repaint();
    }
    
    public void mouseMoved(java.awt.event.MouseEvent mouseEvent) {
        
    }
    
    public void paint(Graphics g) {
        msg = "Vertikal : "+vertSB.getValue();
        msg += ", Horizontal : "+horzSB.getValue();
        g.drawString(msg, 6, 100);
        
        g.drawString("*", horzSB.getValue(), vertSB.getValue());
    }
}
