/*
 * GridLayoutApplet.java
 *
 * Created on February 10, 2004, 10:24 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class GridLayoutApplet extends java.applet.Applet {
    static final int n = 4;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        setLayout(new GridLayout(n, n));
        setFont(new Font("SansSerif", Font.BOLD, 24));
        
        for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int k = i * n + j;
                if (k > 0) 
                    add(new Button(""+k));
            }
        }
    }
    
}
