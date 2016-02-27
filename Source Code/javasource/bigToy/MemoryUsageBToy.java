/*
 * MemoryUsageBToy.java
 *
 * Created on June 1, 2003, 9:23 AM
 */

package bigToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class MemoryUsageBToy {
    
    /** Creates a new instance of MemoryUsageBToy */
    public MemoryUsageBToy() {
    }
    
    static void test(){
        Runtime r = Runtime.getRuntime();    
        long mem1, mem2;    
        Integer arrInt[] = new Integer[1000];    
        
        System.out.println("Total memory adalah : "+r.totalMemory());    
        mem1 = r.freeMemory();    
        System.out.println("Free memory mula-mula : "+mem1);    
        r.gc();    
        mem1 = r.freeMemory();    
        System.out.println("Free memory setelah garbage collection : "+mem1);    
        for (int i=0;i<1000;i++) 
            arrInt[i] = new Integer(i);    
        mem2 = r.freeMemory();    
        System.out.println("Free memory setelah garbage collection: "+mem2);    
        System.out.println("Memori yang digunakan oleh alokasi: "+(mem1-mem2));    
        
        // Abaikan Integer    
        for(int i=0;i<1000;i++) arrInt[i] = null;    
        r.gc();    mem2 = r.freeMemory();    
        System.out.println("Free memory setelah coleccting: " + mem2);  
    }
    
    public static void main(String args[]) {    
        test();
    }
}
