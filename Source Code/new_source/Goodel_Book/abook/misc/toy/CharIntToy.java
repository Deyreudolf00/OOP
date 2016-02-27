/*
 * CharIntToy.java
 *
 * Created on May 25, 2003, 4:14 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 80, exercise 2.31
 */

public class CharIntToy {
    static void test(){
        String str = "";
        
        for(int i=0;i<256;i++){
            str += (char)i + "  ";
            if (i % 30 == 0) str += "\n";
            if (i % 256 == 0) str += "\n\n";
        }
        System.out.println("Karakter dari 0 sampai 255 : ");
        System.out.println(str);
        
        str = "";
        for (int i=60;i<60+30;i++) {
            char ch = (char)i;
            str += ch + "   : "+(int)ch +"\n";
        }
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
