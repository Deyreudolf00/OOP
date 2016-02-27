/*
 * WindowEvents.java
 *
 * Created on February 10, 2004, 3:52 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 *
 * @author  bbhariyanto
 */
public class WindowEvents extends java.applet.Applet implements MouseListener, MouseMotionListener {
    SampleFrame f;
    String msg = "";
    int mouseX=0, mouseY=10;
    int movX=0, movY=0;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        f = new SampleFrame("Menangani mouse event");
        f.setSize(300, 200);
        f.setVisible(true);
        
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void stop(){
        f.setVisible(false);
    }
    
    public void start(){
        f.setVisible(true);
    }
    
    public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
    }
    
    public void mouseDragged(java.awt.event.MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        movX = mouseEvent.getX();
        movY = mouseEvent.getY();
        msg = "*";
        repaint();
    }
    
    public void mouseEntered(java.awt.event.MouseEvent mouseEvent) {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse baru saja memasuki child";
        repaint();
    }
    
    public void mouseExited(java.awt.event.MouseEvent mouseEvent) {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse baru saja keluar child";
        repaint();
    }
    
    public void mouseMoved(java.awt.event.MouseEvent mouseEvent) {
        movX = mouseEvent.getX();
        movY = mouseEvent.getY();
        repaint(0, 0, 100, 60);
    }
    
    public void mousePressed(java.awt.event.MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Down";
        repaint();
    }
    
    public void mouseReleased(java.awt.event.MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Up";
        repaint();
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at " + movX + ", "+movY, 10, 40);
    }
}

class SampleFrame extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX=10, mouseY = 40;
    int movX=0, movY=0;
    
    SampleFrame(String title) {
        super(title);
        addMouseListener(this);
        addMouseMotionListener(this);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
    
    public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
    }
    
    public void mouseDragged(java.awt.event.MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        movX = mouseEvent.getX();
        movY = mouseEvent.getY();
        msg = "*";
        repaint();
    }
    
    public void mouseEntered(java.awt.event.MouseEvent mouseEvent) {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse baru saja memasuki child";
        repaint();
    }
    
    public void mouseExited(java.awt.event.MouseEvent mouseEvent) {
        mouseX = 10;
        mouseY = 54;
        msg = "Mouse baru saja keluar child";
        repaint();
    }
    
    public void mouseMoved(java.awt.event.MouseEvent mouseEvent) {
        movX = mouseEvent.getX();
        movY = mouseEvent.getY();
        repaint(0, 0, 100, 60);
    }
    
    public void mousePressed(java.awt.event.MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Down";
        repaint();
    }
    
    public void mouseReleased(java.awt.event.MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
        msg = "Up";
        repaint();
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
        g.drawString("Mouse at " + movX + ", "+movY, 10, 40);
    }
}

