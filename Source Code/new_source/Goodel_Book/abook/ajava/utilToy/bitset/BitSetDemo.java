/*
 * BitSetDemo.java
 *
 * Created on February 12, 2004, 7:41 AM
 */

package abook.ajava.utilToy.bitset;
import java.io.DataInputStream;
import java.util.BitSet;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class BitSetDemo {
    
    static void demo01(){
        System.out.println("DEMO 1 : Masukan secara hardcoded");
        BitSet bs1 = new BitSet(16);
        BitSet bs2 = new BitSet(16);
        
        for(int i=0; i<16; i++){
            if((i%2) == 0)
                bs1.set(i);
            if((i%5) != 0)
                bs2.set(i);
        }
        
        System.out.println("Pola awal bs1 : ");
        System.out.println(bs1);
        System.out.println("Pola awal bs2 : ");
        System.out.println(bs2);
        
        // AND
        bs2.and(bs1);
        System.out.println("\nbs2 AND bs1:");
        System.out.println(bs2);
        
        // OR
        bs2.or(bs1);
        System.out.println("\nbs2 OR bs1:");
        System.out.println(bs2);
        
        // XOR
        bs2.and(bs1);
        System.out.println("\nbs2 XOR bs1:");
        System.out.println(bs2);
        
    }
    
    static void demoFromKB () throws java.io.IOException{
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        BitSet bs3;

        // Meminta deret bit pertama dan menyimpan di bs1 
        DataInputStream dis=new DataInputStream(System.in);
        String bitstring;
        System.out.println("Bit sequence #1:");
        bitstring=dis.readLine();
        for (short i=0;i<bitstring.length();i++){
            if (bitstring.charAt(i)=='1')
                bs1.set(i);
            else
                bs1.clear(i);
        }
        
        // Meminta deret bit kedua dan menyimpan di bs2 
        System.out.println("Bit sequence #2:");
        bitstring=dis.readLine();
        for (short i=0;i<bitstring.length();i++){
            if (bitstring.charAt(i)=='1')
                bs2.set(i);
            else
                bs2.clear(i);
        }
        System.out.println("BitSet #1: "+bs1);
        System.out.println("BitSet #2: "+bs2);

        // Test the AND operation
        bs3=(BitSet)bs1.clone();
        bs3.and(bs2);
        System.out.println("bs1 AND bs2: "+bs3);

        // Test the OR operation
        bs3=(BitSet)bs1.clone();
        bs3.or(bs2);
        System.out.println("bs1 OR bs2: "+bs3);

        // Test the XOR operation
        bs3=(BitSet)bs1.clone();
        bs3.xor(bs2);
        System.out.println("bs1 XOR bs2: "+bs3);
    }
    
    static void demo02() {
        System.out.println("DEMO 2 : Masukan berasal dari Keyboard");
        System.out.println("Masukan berupa deret 0 dan/atau 1 ");
        try {
            demoFromKB();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    
    static void demo() {
        demo01();
        System.out.println("\n");
        demo02();
    }
    
    public static void main (String[] args) {
        demo();
    }
}
