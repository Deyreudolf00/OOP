/*
 * FontInfoApplet.java
 *
 * Created on February 10, 2004, 8:31 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
/**
 *
 * @author  bbhariyanto
 */
public class FontInfoApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
    }
    
    public void paint(Graphics g) {
        Font f = g.getFont();
        String fontName = f.getName();
        String fontFamily = f.getFamily();
        int fontSize = f.getSize();
        int fontStyle = f.getStyle();
        
        String msg = "Font : " + fontName;
        msg += ", Family : "+fontFamily;
        msg += ", Size : "+fontSize;
        msg += ", Style : ";
        if ((fontStyle & Font.BOLD) == Font.BOLD)
            msg += "Bold";
        if ((fontStyle & Font.ITALIC) == Font.ITALIC)
            msg += "Italics";
        if ((fontStyle & Font.PLAIN) == Font.PLAIN)
            msg += "Plain";
        
        g.drawString(msg, 4, 16);
        
    }
}
