package abook.ajava.aswing.graphics2dToy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */
public class RedTown
    extends JFrame {
  public static void main(String[] args) {
    new RedTown();
  }

  public RedTown() {
    super("RedTown v1.0");
    createUI();
    setVisible(true);
  }

  protected void createUI() {
    setSize(400, 400);
    setLocation(100, 100);
    getContentPane().setLayout(new GridBagLayout());
    JButton colorButton = new JButton("Choose a color...");
    getContentPane().add(colorButton);
    colorButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        Color c = JColorChooser.showDialog(
            RedTown.this, "Choose a color...", getBackground());
        if (c != null) {
          getContentPane().setBackground(c);
        }
      }
    });
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }
}
