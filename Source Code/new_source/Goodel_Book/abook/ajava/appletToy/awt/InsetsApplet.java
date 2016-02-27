/*
 * InsetsApplet.java
 *
 * Created on February 10, 2004, 10:17 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class InsetsApplet extends java.applet.Applet {
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        String msg = 
            "Untuk menjadi kuat, kamu harus seperti air. \n" +
            "Jika tidak ada halangan, ia mengalir;  \n" +
            "Jika ada halangan, ia berhenti;  \n" +
            "Jika bendungannya jebol, maka ia mengalir lebih jauh;  \n" +
            "Jika bencananya berbentuk persegi, bentuknya menjadi persegi;  \n" +
            "Jika bencananya berbentuk bundar, maka bentuknya menjadi bundar;  \n" +
            "Karena ia begitu lembut dan fleksibel,  \n" +
            "air adalah benda yang paling penting dan paling kuat. \n" +
            " -- Lao Tzu -- \n"
            ;
        
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        add(new Button("Berada di atas "),BorderLayout.NORTH);
        add(new Button("Pesan footer dapat berada di sini"), BorderLayout.SOUTH);
        add(new Button("Kanan"), BorderLayout.EAST);
        add(new Button("Kiri"), BorderLayout.WEST);
        
        add(new TextArea(msg), BorderLayout.CENTER);
    }
    
    public Insets getInsets(){
        return new Insets(10, 10, 10, 10);
    }
    
}
