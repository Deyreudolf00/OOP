/*
 * MenuApplet.java
 *
 * Created on February 11, 2004, 6:01 AM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author  bbhariyanto
 */
public class MenuApplet extends java.applet.Applet {
    Frame f;
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        f = new MenuFrame("DEMO Menu");
        int width = Integer.parseInt(getParameter("width"));
        int height = Integer.parseInt(getParameter("height"));
        
        setSize(new Dimension(width, height));
        
        f.setSize(width, height);
        f.setVisible(true);
    }
    
    public void start() {
        f.setVisible(true);
    }
    
    public void stop() {
        f.setVisible(false);
    }
    
}

class MenuFrame extends Frame {
    String msg = "";
    CheckboxMenuItem debug, test;
    
    public MenuFrame(String title) {
        super(title);
        
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        
        Menu file = new Menu("File");
        MenuItem item1, item2, item3, item4, item5;
        file.add(item1 = new MenuItem("New ..."));
        file.add(item2 = new MenuItem("Open ..."));
        file.add(item3 = new MenuItem("Close"));
        file.add(item4 = new MenuItem("-"));
        file.add(item5 = new MenuItem("Exit"));
        
        
        Menu edit = new Menu("Edit");
        MenuItem item6, item7, item8, item9;
        edit.add(item6 = new MenuItem("Cut"));
        edit.add(item7 = new MenuItem("Copy"));
        edit.add(item8 = new MenuItem("Paste"));
        edit.add(item9 = new MenuItem("-"));
        
        Menu sub = new Menu("Special");
        MenuItem item10, item11, item12;
        sub.add(item10 = new MenuItem("First"));
        sub.add(item11 = new MenuItem("Second"));
        sub.add(item12 = new MenuItem("Third"));
        edit.add(sub);
        
        debug = new CheckboxMenuItem("Debug");
        edit.add(debug);
        test = new CheckboxMenuItem("Testing");
        edit.add(test);
        
        mbar.add(edit);
        
        MyMenuHandler handler = new MyMenuHandler(this);
        
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
        item10.addActionListener(handler);
        item11.addActionListener(handler);
        item12.addActionListener(handler);
        
        debug.addItemListener(handler);
        test.addItemListener(handler);
        
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
    
    public void paint(Graphics g) {
        g.drawString(msg, 10, 200);
        
        if (debug.getState()) 
            g.drawString("Debug sedang ON", 10, 220);
        else
            g.drawString("Debug sedang OFF", 10, 220);
        
        if (test.getState())
            g.drawString("Testing sedang ON", 10, 240);
        else
            g.drawString("Testing sedang OFF", 10, 240);
            
    }
}

class MyWindowAdapter extends WindowAdapter {
    MenuFrame menuFrame;
    public MyWindowAdapter (MenuFrame menuFrame) {
        this.menuFrame = menuFrame;
    }
    
    public void windowClosing(WindowEvent windowEvent) {
        menuFrame.setVisible(false);
    }
}

class MyMenuHandler implements ActionListener, ItemListener {
    MenuFrame menuFrame;
    public MyMenuHandler (MenuFrame menuFrame) {
        this.menuFrame = menuFrame;
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        String msg = "Anda telah memilih : ";
        String arg = (String) actionEvent.getActionCommand();
        if(arg.equals("New ..."))
            msg += "New.";
        else if(arg.equals("Open ..."))
            msg += "Open.";
        else if(arg.equals("Close"))
            msg += "Close.";
        else if(arg.equals("Exit"))
            msg += "Exit.";
        else if(arg.equals("Edit"))
            msg += "Edit.";
        else if(arg.equals("Cut"))
            msg += "Cut.";
        else if(arg.equals("Copy"))
            msg += "Copy.";
        else if(arg.equals("Paste"))
            msg += "Paste.";
        else if(arg.equals("First"))
            msg += "First.";
        else if(arg.equals("Second"))
            msg += "Second.";
        else if(arg.equals("Third"))
            msg += "Third.";
        else if(arg.equals("Debug"))
            msg += "Debug.";
        else if(arg.equals("Testing"))
            msg += "Testing.";
        menuFrame.msg = msg;
        menuFrame.repaint();
    }
    
    public void itemStateChanged(java.awt.event.ItemEvent itemEvent) {
        menuFrame.repaint();
    }
    
}
