/*
 * AppWindow.java
 *
 * Created on February 10, 2004, 4:16 AM
 */

package abook.ajava.appletToy.basic;
import java.awt.*;
import java.awt.event.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class AppWindow extends Frame {
    String keymsg = "";
    String mousemsg = "";
    int mouseX=30, mouseY=30;
    
    /** Creates a new instance of AppWindow */
    public AppWindow() {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter2(this));
        addWindowListener(new MyWindowAdapter());
    }
    
    public void paint(Graphics g) {
        g.drawString(keymsg, 10, 40);
        g.drawString(mousemsg, mouseX, mouseY);
    }
    
    public static void main(String[] args) throws Exception {
        AppWindow appwin = new AppWindow();
        appwin.setSize(new Dimension(300, 200));
        appwin.setTitle("Aplikasi berbasis AWT");
        appwin.setVisible(true);
    }
}

class MyKeyAdapter extends KeyAdapter {
    AppWindow appWindow;
    public MyKeyAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }
    public void keyTyped(KeyEvent ke) {
        appWindow.keymsg += ke.getKeyChar();
        appWindow.repaint();
    }
}


class MyMouseAdapter2 extends MouseAdapter {
    AppWindow appWindow;
    public MyMouseAdapter2(AppWindow appWindow) {
        this.appWindow = appWindow;
    }
    public void mousePressed(MouseEvent me) {
        appWindow.mouseX = me.getX();
        appWindow.mouseY = me.getY();
        appWindow.mousemsg = "Mouse down at "+appWindow.mouseX + ", "+appWindow.mouseY;
        appWindow.repaint();
    }
}


/*
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

*/