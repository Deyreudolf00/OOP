/*
 * RTTIBToy.java
 *
 * Created on June 1, 2003, 9:13 AM
 */

package bigToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

class X {    
    int anInt;    
    float anFloat;
}

class Y extends X {    
    double anDouble;
}

public class RTTIBToy {
    
    /** Creates a new instance of Class */
    public RTTIBToy() {
    }
    
    static void test(){
        X theX = new X();	
        Y theY = new Y();	
        Class theClass;		
        theClass = theX.getClass(); 
        
        // untuk memperoleh acuan Class	
        System.out.println("theX adalah objek bertipe : "+ theClass.getName());		
        theClass = theY.getClass(); 
        // untuk memperoleh acuan Class	
        System.out.println("theY adalah objek bertipe : "+ theClass.getName());    
    }
    
    public static void main (String args[]) {	
        test();
    }
}
