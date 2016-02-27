/*
 * LabelApplet.java
 *
 * Created on February 10, 2004, 6:05 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
/**
 *
 * @author  bbhariyanto
 */
public class LabelApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        Label l1 = new Label ("Satu");
        Label l2 = new Label ("Dua");
        Label l3 = new Label ("Tiga");
        
        add(l1);
        add(l2);
        add(l3);
    }
    
}
