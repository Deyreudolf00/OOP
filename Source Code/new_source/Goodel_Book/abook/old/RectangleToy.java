/*
 * Class.java
 *
 * Created on June 1, 2003, 5:24 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class RectangleToy {
    
    private double width, height;
    // Bila tanpa parameter maka ditambah 1
    // pada masing-masing sisi panjang dan lebar
    
    /** Creates a new instance of Class */
    public RectangleToy() {
        width = 0.0;
        height = 0.0;
    }
    
    public RectangleToy(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void enlarge () {
        width += 1;
        height += 1;
    }

    public void enlarge (double deltaWidth, double deltaHeight) {
        width += deltaWidth;
        height += deltaHeight;
    }
}