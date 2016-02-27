/*
 * ProcessBToy.java
 *
 * Created on June 1, 2003, 11:29 AM
 */

package abook.ajava.systemToy;
import java.lang.System;
import java.lang.Runtime;
import java.lang.Process;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ProcessBToy {
    
    /** Creates a new instance of ProcessBToy */
    public ProcessBToy() {
    }
    
    static void test(){
        Runtime r = Runtime.getRuntime();  
        try {
            Process p = r.exec("java PersonToy");  
            BufferedReader kbdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));  
            String line;  
            while((line = kbdInput.readLine())!=null)   
                System.out.println(line); 
        } catch(Exception e) {
            System.out.println("Terjadi kesalahan!");
        }
        
    }
 
    public static void main(String args[]) throws IOException {  
        test();
    }    
}
