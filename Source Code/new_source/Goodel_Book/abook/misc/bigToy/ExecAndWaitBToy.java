/*
 * ExecAndWaitBToy.java
 *
 * Created on June 1, 2003, 11:27 AM
 */

package abook.misc.bigToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ExecAndWaitBToy {
    
    /** Creates a new instance of ExecAndWaitBToy */
    public ExecAndWaitBToy() {
    }
    
    static void test(){
        Runtime r = Runtime.getRuntime();    
        Process p = null;    
        try {      
            p = r.exec("notepad");      
            p.waitFor();    
        } catch (Exception e) {      
            System.out.println("Terdapat kesalahan dalam eksekusi Notepad");    
        }    
        System.out.println("Notepad telah selesai");  
    }
    
    public static void main(String args[]) {    
        test();
    }
}
