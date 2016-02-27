/*
 * ComplexProctectedCloneToy.java
 *
 * Created on June 1, 2003, 5:36 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ComplexProctectedCloneToy {
    private double re;    
    private double im;        
    
    /** Creates a new instance of ComplexProctectedCloneToy */
    public ComplexProctectedCloneToy() {
        re = 0.0;	
        im = 0.0;    
    }
    
    public ComplexProctectedCloneToy(double re, double im) {
        this.re = 0.0;	
        this.im = 0.0;    
    }
    
    public void setRe(double re) {	
        this.re = re;    
    }        
    
    public void setIm(double im) {	
        this.im = im;    
    }        
    
    public double getRe() {	
        return re;    
    }        
    
    public double getIm() {	
        return im;    
    }        
    
    // Metode ini memanggil clone() di Object    
    public ComplexProctectedCloneToy cloneComplex() {	
        try {
            // Memanggil clone di Object	    
            
            return (ComplexProctectedCloneToy) super.clone();	
        } catch (CloneNotSupportedException e) {	    
            System.out.println("Clonning tidak diijinkan");	    
            return this;	
        }    
    }    
    
    static void test(){
        ComplexProctectedCloneToy t1 = new ComplexProctectedCloneToy();	
        ComplexProctectedCloneToy t2;		
            
        t1.setRe(10.0);	
        t1.setIm(50.0);		
            
        // Melakukan clone terhadap aComplex1	
        t2 = t1.cloneComplex(); 
        System.out.println("t1 : " + t1.getRe() + " " + t1.getIm());	
        System.out.println("t2 : " + t2.getRe() + " " + t2.getIm());    
    }
    
    public static void main(String[] args) {	
        test();
    }
}
