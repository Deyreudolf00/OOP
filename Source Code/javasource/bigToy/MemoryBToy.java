/*
 * MemoryBToy.java
 *
 * Created on June 1, 2003, 9:20 AM
 */

package bigToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class MemoryBToy {
    
    /** Creates a new instance of MemoryBToy */
    public MemoryBToy() {
    }
    
    static void test(){
        Runtime runtime = Runtime.getRuntime();    
        long freeMem = runtime.freeMemory() / 1024;    
        long totalMem = runtime.totalMemory() / 1024;    
        System.out.println("Free memory : " + freeMem + "KB");    
        System.out.println("Total memory : " + totalMem + "KB");  
    }
    
    public static void main (String args[]) {    
        test();
    }    
}
