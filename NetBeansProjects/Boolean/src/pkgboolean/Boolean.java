/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

/**
 *
 * @author Rengga
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b;
        
        b = false;
        System.out.println("b adalah"+b);
        b=true;
        System.out.println("b adalah" +b);
        if(b)
            System.out.println("Pernyataan ini dieksekusi" );
            b=false;
        if(b)
            System.out.println("Pernyataan ini tidak dieksekusi" );
        System.out.println("10 > 7" + (10>7) );
    }
    
}
