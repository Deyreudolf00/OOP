package abook.ajava.aswing.graphics2dToy;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;

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
public class HitMe
    extends ApplicationFrame {
  public static void main(String[] args) {
    Frame f = new HitMe();
    f.setTitle("HitMe v1.0");
    f.setVisible(true);
  }

  private TextLayout mTextLayout;
  private int mX = 40, mY = 80;
  public HitMe() {
    super("HitMe v1.0");
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent me) {
        TextHitInfo hit = mTextLayout.hitTestChar(
            me.getX() - mX, me.getY() - mY);
        System.out.println(hit);
      }
    });
  }

  public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
    String s = "Camelopardalis";
    Font font = new Font("Serif", Font.PLAIN, 32);
    if (mTextLayout == null) {
      FontRenderContext frc = g2.getFontRenderContext();
      mTextLayout = new TextLayout(s, font, frc);
    }
    mTextLayout.draw(g2, mX, mY);
  }
}
