/*
 * AppletFrame.java
 *
 * Created on February 10, 2004, 3:47 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/**
 *
 * @author  bbhariyanto
 */
public class AppletFrame extends java.applet.Applet {
    Frame f;
        
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init(){
        f = new SampleFrame("A Frame Window");
        f.setSize(250, 250);
        f.setVisible(true);
    }
        
    public void start(){
        setVisible(true);
    }
        
    public void stop(){
        f.setVisible(false);
    }
        
    public void paint(Graphics g) {
        g.drawString("Ini di dalam applet window", 10, 20);
    }
}

class SampleFrame extends Frame {
    public SampleFrame(String title) {
        super(title);
            
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
        
    public void paint(Graphics g) {
        g.drawString("Ini di dalam frame window", 10, 40);
    }
}
    
