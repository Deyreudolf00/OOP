/*
 * StringConversionToy.java
 *
 * Created on June 1, 2003, 7:00 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class StringConversionToy {
    
    /** Creates a new instance of StringConversionToy */
    public StringConversionToy() {
    }
    
    static void test(){
        int anInt = 2002;		
        System.out.println(anInt + " dalam biner adalah " + Integer.toBinaryString(anInt));	
        System.out.println(anInt + " dalam oktal adalah " + Integer.toOctalString(anInt));	
        System.out.println(anInt + " dalam heksadesimal adalah " + Integer.toHexString(anInt));    
    }
  
    static public void main (String[] args) {	
        test();
    }    
}
