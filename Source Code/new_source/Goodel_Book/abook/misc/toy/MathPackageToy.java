/*
 * MathPackageToy.java
 *
 * Created on June 1, 2003, 6:44 AM
 */

package abook.misc.toy;
import java.lang.System;
import java.lang.Math;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class MathPackageToy {
    
    /** Creates a new instance of MathPackageToy */
    public MathPackageToy() {
    }
    
    static void test(){
        System.out.println(Math.E);  
        System.out.println(Math.PI);  
        System.out.println(Math.abs(-1234));  
        System.out.println(Math.cos(Math.PI/4));  
        System.out.println(Math.sin(Math.PI/2));  
        System.out.println(Math.tan(Math.PI/4));  
        System.out.println(Math.log(1));  
        System.out.println(Math.exp(Math.PI));  
        for(int i=0;i<3;++i)   
            System.out.print(Math.random()+" ");  
        System.out.println(); 
    }
    
    public static void main(String args[]) {  
        test();
    }
}
