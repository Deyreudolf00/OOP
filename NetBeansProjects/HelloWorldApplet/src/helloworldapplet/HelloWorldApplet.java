/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapplet;
import java.awt.Graphics;
import javax.swing.JApplet;
/**
 *
 * @author rengga
 */
public class HelloWorldApplet  extends JApplet
{

    /**
     * @param args the command line arguments
     */
       
        // TODO code application logic here
        public void paint (Graphics g)
        {
          super.paint(g);
          g.drawString("Hello world", 25, 25);
        }
}
    
    

