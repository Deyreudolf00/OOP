/*
 * ButtonListApplet.java
 *
 * Created on February 10, 2004, 6:20 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class ButtonListApplet extends java.applet.Applet implements ActionListener{
    String msg = "";
    Button bList[] = new Button[3];
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        Button bYes = new Button("Yes");
        Button bNo = new Button("No");
        Button bMayBe = new Button("May be!");
        
        bList[0] = (Button) add(bYes);
        bList[1] = (Button) add(bNo);
        bList[2] = (Button) add(bMayBe);
        
        for (int i=0;i<3;i++) {
            bList[i].addActionListener(this);
        }
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        for (int i=0;i<3;i++) {
            if (actionEvent.getSource() == bList[i]) {
                msg = "Anda menekan tombol "+bList[i].getLabel();
            }
        }
        repaint();
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, 6, 100);
    }
}
