/*
 * FlowLayoutApplet.java
 *
 * Created on February 10, 2004, 9:24 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class FlowLayoutApplet extends java.applet.Applet implements ItemListener {
    String msg = "";
    Checkbox cWin98, cWinNT, cWin2K, cWinXP, cSolaris, cMac, cLinux;
    
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        cLinux = new Checkbox("Linux", null, true);
        cWin98 = new Checkbox("Microsoft Windows 98");
        cWinNT = new Checkbox("Microsoft Windows NT");
        cWin2K = new Checkbox("Microsoft Windows 2000");
        cWinXP = new Checkbox("Microsoft Windows XP");
        cSolaris = new Checkbox("SUN Solaris");
        cMac = new Checkbox("Macintosh");
        
        add(cLinux);
        add(cWin98);
        add(cWinNT);
        add(cWin2K);
        add(cWinXP);
        add(cSolaris);
        add(cMac);
        
        cLinux.addItemListener(this);
        cWin98.addItemListener(this);
        cWinNT.addItemListener(this);
        cWin2K.addItemListener(this);
        cWinXP.addItemListener(this);
        cSolaris.addItemListener(this);
        cMac.addItemListener(this);
    }
    
    public void itemStateChanged(java.awt.event.ItemEvent itemEvent) {
        repaint();
    }
    
    
    public void paint(Graphics g) {
        msg = "Status saat ini : ";
        g.drawString(msg, 6, 100);
        msg = "  Linux : "+cLinux.getState();
        g.drawString(msg, 6, 120);
        msg = "  Microsoft Windows 98: "+cWin98.getState();
        g.drawString(msg, 6, 140);
        msg = "  Microsoft Windows NT: "+cWinNT.getState();
        g.drawString(msg, 6, 160);
        msg = "  Microsoft Windows 2000: "+cWin2K.getState();
        g.drawString(msg, 6, 180);
        msg = "  Microsoft Windows XP: "+cWinXP.getState();
        g.drawString(msg, 6, 200);
        msg = "  SUN Solaris : "+cSolaris.getState();
        g.drawString(msg, 6, 220);
        msg = "  Macintosh : "+cMac.getState();
        g.drawString(msg, 6, 240);
        
    }
    
}
