/*
 * ButtonApplet.java
 *
 * Created on February 10, 2004, 6:07 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author  bbhariyanto
 */
public class ButtonApplet extends java.applet.Applet implements ActionListener{
    String msg = "";
    Button bYes, bNo, bMayBe;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        bYes = new Button("Yes");
        bNo = new Button("No");
        bMayBe = new Button("May be!");
        
        add(bYes);
        add(bNo);
        add(bMayBe);
        
        bYes.addActionListener(this);
        bNo.addActionListener(this);
        bMayBe.addActionListener(this);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        String str = actionEvent.getActionCommand();
        if (str.equals("Yes")) {
            msg = "Anda mengetikkan Yes";
        } else if (str.equals("No")) {
            msg = "Anda mengetikkan No";
        } else {
            msg = "Anda mengetikkan sesuatu yang tidak terdefinisi";
        }
        repaint();
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, 6, 100);
    }
}
