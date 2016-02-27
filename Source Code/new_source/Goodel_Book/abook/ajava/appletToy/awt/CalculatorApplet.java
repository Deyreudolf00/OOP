/*
 * CalculatorApplet.java
 *
 * Created on February 10, 2004, 10:29 PM
 */

package abook.ajava.appletToy.awt;
import java.awt.*;

/**
 *
 * @author  bbhariyanto
 */
public class CalculatorApplet extends java.applet.Applet {
    static final int n = 6;
    
    /** Initialization method that will be called after the applet is loaded
     *  into the browser.
     */
    public void init() {
        setLayout(new GridLayout(n-1, n));
        setFont(new Font("SansSerif", Font.BOLD, 24));
        
        // Baris 1
        add(makeButton("X",Color.red));
        add(makeButton("X",Color.red));
        add(makeButton("X",Color.red));
        add(makeButton("Bksp",Color.red));
        add(makeButton("CE",Color.red));
        add(makeButton("X",Color.red));
        
        // Baris 2
        add(makeButton("MC",Color.red));
        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("/"));
        add(new Button("sqrt"));
        
        // Baris 3
        add(makeButton("MR",Color.red));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("x"));
        add(new Button("%"));
        
        // Baris 4
        add(makeButton("MR",Color.red));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("-"));
        add(new Button("1/x"));

        // Baris 5
        add(makeButton("M+",Color.red));
        add(new Button("0"));
        add(new Button("+/-"));
        add(new Button("."));
        add(new Button("+"));
        add(new Button("="));
    }
    
    private Button makeButton(String str, Color c) {
        Button b = new Button(str);
        b.setForeground(Color.red);
        
        return b;
    }
}
