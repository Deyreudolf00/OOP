/*
 * BigNumberToy.java
 *
 * Created on June 1, 2003, 7:03 AM
 */

package abook.misc.toy;
import java.lang.System;
import java.math.BigInteger;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class BigNumberToy {
    
    /** Creates a new instance of BigNumberToy */
    public BigNumberToy() {
    }
    
    static void test(){
        BigInteger n=new BigInteger("1000000000000");  
        BigInteger one=new BigInteger("1");  
        while(!n.isProbablePrime(7)) 
            n=n.add(one);  
        System.out.println(n.toString(10)+" adalah berpeluang sebagai bilangan prima.");  
        System.out.println("Dengan panjang bilangan : "+n.bitLength()+" bit"); 
    }
    
    public static void main(String args[]){  
        test();
    }
}
