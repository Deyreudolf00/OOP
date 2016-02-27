/*
 * CardTest.java
 *
 * Created on June 3, 2003, 6:17 AM
 */

package toySwing;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class CardTest extends JFrame{
    protected CardLayout layout;

    public static void main(String[] args) {
        CardTest ct = new CardTest();
        
        ct.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ct.displayTab("Green Tab");
        ct.setSize(400,300);
        ct.setVisible(true);
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {};
            ct.cycle();
        }
        System.exit(0);
    }

    public CardTest() {
        JPanel tab;
        Container pane=getContentPane();
        layout = new CardLayout();
        pane.setLayout(layout);
        tab = new JPanel();
        tab.setBackground(Color.red);
        pane.add(tab,"Red Tab");
        tab = new JPanel();
        tab.setBackground(Color.green);
        pane.add(tab,"Green Tab");
        tab = new JPanel();
        tab.setBackground(Color.blue);
        pane.add(tab,"Blue Tab");
    }

    public void cycle() {
        layout.next(this.getContentPane());
    }

    public void displayTab(String name) {
        layout.show(this.getContentPane(),name);
    }
}