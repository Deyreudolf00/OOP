/*
 * CardLayoutApplet.java
 *
 * Created on February 11, 2004, 5:46 AM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class CardLayoutApplet extends java.applet.Applet implements ActionListener, MouseListener {
    Checkbox cWin98, cWinNT, cWin2K, cWinXP, cSolaris, cMac, cLinux;
    Panel pOsCards;
    CardLayout cardLO;
    Button bWin, bOther;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        bWin = new Button("Microsoft Windows");
        bOther = new Button("Lainnya");
        add(bWin);
        add(bOther);
        
        cLinux = new Checkbox("Linux", null, true);
        cWin98 = new Checkbox("Microsoft Windows 98");
        cWinNT = new Checkbox("Microsoft Windows NT");
        cWin2K = new Checkbox("Microsoft Windows 2000");
        cWinXP = new Checkbox("Microsoft Windows XP");
        cSolaris = new Checkbox("SUN Solaris");
        cMac = new Checkbox("Macintosh");
        
        Panel pWin = new Panel();
        pWin.add(cWin98);
        pWin.add(cWinNT);
        pWin.add(cWin2K);
        pWin.add(cWinXP);
        
        Panel pOther = new Panel();
        pOther.add(cLinux);
        pOther.add(cSolaris);
        pOther.add(cMac);
        
        cardLO = new CardLayout();
        pOsCards = new Panel();
        pOsCards.setLayout(cardLO);
        
        pOsCards.add(pWin, "Microsoft Windows");
        pOsCards.add(pOther, "Lainnya");
        
        add(pOsCards);
        
        bWin.addActionListener(this);
        bOther.addActionListener(this);
        
        addMouseListener(this);
        
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        if(actionEvent.getSource() == bWin) {
            cardLO.show(pOsCards, "Microsoft Windows");
        } else {
            cardLO.show(pOsCards, "Lainnya");
        }
    }
    
    public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
    }
    
    public void mouseEntered(java.awt.event.MouseEvent mouseEvent) {
    }
    
    public void mouseExited(java.awt.event.MouseEvent mouseEvent) {
    }
    
    public void mousePressed(java.awt.event.MouseEvent mouseEvent) {
    }
    
    public void mouseReleased(java.awt.event.MouseEvent mouseEvent) {
    }
    
}
