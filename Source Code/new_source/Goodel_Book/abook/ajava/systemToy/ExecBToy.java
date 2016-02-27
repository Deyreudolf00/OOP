/*
 * ExecBToy.java
 *
 * Created on June 1, 2003, 9:26 AM
 */

package abook.ajava.systemToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ExecBToy {
    
    /** Creates a new instance of ExecBToy */
    public ExecBToy() {
    }
    
    static void test(){
        Runtime r = Runtime.getRuntime();    
        try {      
            r.exec("notepad");    
        } catch (Exception e) {      
            System.out.println("Terdapat kesalahan dalam eksekusi Notepad");    
        }    
        System.out.println("Notepad telah dieksekusi");  
    }
    
    public static void main(String args[]) {    
        test();
    }
}
