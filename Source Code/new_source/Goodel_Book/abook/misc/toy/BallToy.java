/*
 * BallToy.java
 *
 * Created on May 31, 2003, 2:41 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

class BallToy {  
    public static void main (String args[]) {    
        float pi = 3.1416f;    
        float r = 10.0F;    
        float v;    
        v = (4.0f/3.0f) * (pi * r * r * r); 	       
        System.out.println("Volume bola = " + v);  
    }
}