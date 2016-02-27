/*
 * FontApplet.java
 *
 * Created on February 10, 2004, 8:05 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class FontApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint(Graphics g) {
        String msg = "";
        String[] FontList;
        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        FontList = ge.getAvailableFontFamilyNames();
        for(int i=0;i<FontList.length;i++){
            msg = "";
            msg += i + "  " + FontList[i] + " ";
            g.drawString(msg, 4, 16+(i*15));
        }
    }
    
}
