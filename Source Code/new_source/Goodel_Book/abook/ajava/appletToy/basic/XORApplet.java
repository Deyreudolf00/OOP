/*
 * XORApplet.java
 *
 * Created on February 10, 2004, 7:52 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author  bbhariyanto
 */
public class XORApplet extends java.applet.Applet {
    int chsX=100, chsY=100;
    
    public XORApplet() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                chsX = x-10;
                chsY = y-10;
                
                repaint();
            }
        });
    }
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        
        g.setColor(Color.blue);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
        
        g.setColor(Color.green);
        g.drawRect(10, 10, 60, 50);
        g.fillRect(100, 10, 60, 50);
        
        g.setColor(Color.red);
        g.drawRoundRect(190, 10, 60, 50, 15, 15);
        g.fillRoundRect(70, 90, 140, 100, 30, 40);
        g.setColor(Color.cyan);
        g.drawLine(20, 150, 80, 19);
        
        // xor 
        g.setXORMode(Color.black);
        g.drawLine(chsX-10, chsX, chsX+10, chsY);
        g.drawLine(chsX, chsY-10, chsX, chsY+10);
        g.setPaintMode();
        
    }
    
}
