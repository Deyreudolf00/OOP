/*
 * BoxToy.java
 *
 * Created on May 18, 2003, 11:28 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto
 */

public class BoxToy {
    private double width = 0;
    private double length = 0;
    private double height = 0;
    
    /** Creates a new instance of BoxToy */
    
    public BoxToy(double length, double width, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getLength() {
        return length;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getArea(){
        return calcArea();
    }

    public String toString() {
        String str = 
            "Balok "+"\n"+
            "Panjang = "+length+"\n"+
            "Lebar   = "+width+"\n"+
            "Tinggi  = "+height+"\n"+
            "Luas    = "+calcArea()+"\n"+
            "Volume  = "+calcVolume()+"\n";
        return str;
    }
    
    static void test(){
        System.out.println(new BoxToy(10,20,50));
    }
    
    public static void main(String args[]) {
        test();
    }
    
    private double calcArea() {
        return 2 * ((width * length) + (width*height) + (length*height));
    }
    
    public double calcVolume() {
        return width * length * height;
    }
}
