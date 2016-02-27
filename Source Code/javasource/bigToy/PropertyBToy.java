/*
 * PropertyBToy.java
 *
 * Created on June 1, 2003, 9:18 AM
 */

package bigToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class PropertyBToy {
    
    /** Creates a new instance of PropertyBToy */
    public PropertyBToy() {
    }
    
    static void test(){
        System.out.println(System.getProperty("user.name"));    
        System.out.println(System.getProperty("user.dir"));    
        System.out.println(System.getProperty("user.home"));  
    }
    
    static public void main(String args[]) {    
        test();
    }
    
}
