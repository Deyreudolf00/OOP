/*
 * TextFieldApplet.java
 *
 * Created on February 10, 2004, 8:59 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class TextFieldApplet extends java.applet.Applet implements ActionListener {
    TextField tfName, tfPass;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        Label lName = new Label("Nama : ", Label.RIGHT);
        Label lPass = new Label("Password : ", Label.RIGHT);
        tfName = new TextField(12);
        tfPass = new TextField(8);
        tfPass.setEchoChar('*');
        
        add(lName);
        add(tfName);
        add(lPass);
        add(tfPass);
        
        tfName.addActionListener(this);
        tfPass.addActionListener(this);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        repaint();
    }
    
    
    public void paint(Graphics g) {
        g.drawString("Nama : "+tfName.getText(), 6, 60);
        g.drawString("Teks yang terpilih disorot di nama : "+tfName.getSelectedText(), 6, 80);
        g.drawString("Password : "+tfPass.getText(), 6, 100);
    }
}
