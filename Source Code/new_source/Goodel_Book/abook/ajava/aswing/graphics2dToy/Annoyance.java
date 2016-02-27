package abook.ajava.aswing.graphics2dToy;

import java.awt.*;
import java.awt.event.*;

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
public class Annoyance
    extends ApplicationFrame implements MouseMotionListener {
  public static void main(String[] args) {
    new Annoyance();
  }

  private int mX, mY;
  public Annoyance() {
    super("Annoyance v1.0");
    addMouseMotionListener(this);
    setVisible(true);
  }

  public void mouseMoved(MouseEvent me) {
    mX = (int) me.getPoint().getX();
    mY = (int) me.getPoint().getY();
    repaint();
  }

  public void mouseDragged(MouseEvent me) {
    mouseMoved(me);
  }

  public void paint(Graphics g) {
    int s = 100;
    g.setColor(Color.blue);
    g.fillRect(mX - s / 2, mY - s / 2, s, s);
  }
}
