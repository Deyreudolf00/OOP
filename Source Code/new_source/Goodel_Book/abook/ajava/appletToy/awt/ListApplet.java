/*
 * ListApplet.java
 *
 * Created on February 10, 2004, 7:15 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class ListApplet extends java.applet.Applet implements ActionListener {
    List os, browser;
    String msg = "";
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        os = new List(4, true);
        browser = new List(4, false);
        
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
        
        add(os);
        add(browser);
        
        os.addActionListener(this);
        browser.addActionListener(this);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        repaint();
    }
    
    public void paint(Graphics g) {
        int idx[];
        
        msg = "Sistem operasi saat ini : ";
        idx = os.getSelectedIndexes();
        for(int i=0; i<idx.length; i++) 
            msg += os.getItem(idx[i]) + " ";
        g.drawString(msg, 6, 120);
        
        msg = "Browser saat ini : ";
        msg += browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}
