/*
 * PolymorphismToy.java
 *
 * Created on June 1, 2003, 6:18 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class PolymorphismToy {
    
    static void test(){
        // Tidak apa-apa, belum menciptakan instan
        RectangleToy theRectangle = new RectangleToy(100,200);
        SquareToy theSquare = new SquareToy(100);
        CircleToy theCircle = new CircleToy(200);
        
        printGeometry(theRectangle);
        printGeometry(theSquare);
        printGeometry(theCircle);
    }
    
    public static void main (String args[]) {
        test();
    }
    
    static void printGeometry (GeometryToy theG){
        System.out.println("=========================================");
        System.out.println("Geometri : "+theG.getGeometry());
        System.out.println("Luas geometri     : "+theG.area());
        System.out.println("Keliling geometri : "+theG.circumference());
        System.out.println("=========================================");
    }
}

abstract class GeometryToy{
    // Jenis/tipe geometry
    abstract public String getGeometry();
    // Luas bentuk geometri
    abstract public double area();
    // Keliling geometri
    abstract public double circumference();
}

// Persegi panjang
class RectangleToy extends GeometryToy {
    double width, height;
    
    public RectangleToy(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    public String getGeometry() {
        return "Persegi Panjang";
    }
    
    // Luas bentuk persegi panjang
    public double area() {
        return width * height;
    }
    
    // Keliling persegi panjang
    public double circumference() {
        return 2 * (width + height);
    }
}

// Bujursangkar
// Kenapa bujursangkar tidak boleh diturunkan dari persegipanjang
// meskipun hubungan secara matematika, bujursangkar adalah
// kasus khusus dari persegi panjang
// Itu akan melanggar prinsip substitusi Liskov yang berlaku
// untuk total typed polymorphic relationship
// Lihat penjelasan di buku penulis 
//   Rekayasa Perangkat Lunak Berorientasi Objek
// Hubungan matematika bahkan seringkali merupakan kebalikan 
// dari hubungan polymorphic

class SquareToy extends GeometryToy {
    double side;
    
    public SquareToy(double newSide) {
        side = newSide;
    }
    
    public String getGeometry() {
        return "Bujur sangkar";
    }
    
    // Luas bentuk bujursangkar
    public double area() {
        return side * side;
    }
    
    // Keliling bujursangkar
    public double circumference() {
        return 4 * side;
    }
}

class CircleToy extends GeometryToy {
    final double PI = 3.14159;
    double radius;
    
    public CircleToy(double newRadius) {
        radius = newRadius;
    }
    
    public String getGeometry() {
        return "Lingkaran";
    }
    
    // Luas bentuk lingkaran
    public double area() {
        return PI * radius * radius;
    }
    
    // Keliling lingkaran
    public double circumference() {
        return 2.0 * PI * radius;
    }
}