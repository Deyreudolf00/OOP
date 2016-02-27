/*
 * ChoiceApplet.java
 *
 * Created on February 10, 2004, 6:58 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class ChoiceApplet extends java.applet.Applet implements ItemListener{
    Choice os, browser;
    String msg = "";
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        os = new Choice();
        browser = new Choice();
        
        // Tambahkan pada item pada daftar sistem operasi
        os.add("Linux");
        os.add("Microsoft Windows 98");
        os.add("Microsoft Windows NT");
        os.add("Microsoft Windows 2000");
        os.add("Microsoft Windows XP");
        os.add("SUN Solaris");
        os.add("Macintosh");

        browser.add("Netscape 1.1");
        browser.add("Netscape 2.x");
        browser.add("Netscape 3.x");
        browser.add("Netscape 4.x");
        browser.add("Netscape 5.x");
        browser.add("Netscape 6.x");
        
        browser.add("Internet Explorer 3.x");
        browser.add("Internet Explorer 4.x");
        browser.add("Internet Explorer 5.x");
        browser.add("Internet Explorer 6.x");

        browser.add("Lynx");
        
        browser.select("Nestcape 4.x");
        
        add(os);
        add(browser);
        
        os.addItemListener(this);
        browser.addItemListener(this);
        
    }
    
    public void itemStateChanged(java.awt.event.ItemEvent itemEvent) {
        repaint();
    }
    
    public void paint(Graphics g) {
        msg = "Status sistem operasi : ";
        msg += os.getSelectedItem();
        g.drawString(msg, 6, 120);
        
        msg = "Browser saat itu : ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}
