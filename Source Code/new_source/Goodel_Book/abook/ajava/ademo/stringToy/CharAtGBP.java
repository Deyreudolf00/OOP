/*
 * CharAtGBP.java
 *
 * Created on January 14, 2004, 12:41 AM
 */

package abook.ajava.ademo.stringToy;

/**
 *
 * @author  bbhariyanto
 */
public class CharAtGBP {
    static String s = 
        "Orang yang dapat melepaskan diri dari suatu kebiasaan "+
        "adalah bagaikan mukjizat";
    
    static void test01() {
        System.out.println("Percobaan sederhana untuk charAt() : ");
        System.out.println("String berisi : "+s);
        System.out.println("Eksekusi charAt(0)  = "+s.charAt(0));
        System.out.println("Eksekusi charAt(2)  = "+s.charAt(2));
        System.out.println("Eksekusi charAt(4)  = "+s.charAt(4));
        System.out.println("Eksekusi charAt(6)  = "+s.charAt(6));
        System.out.println("Eksekusi charAt(10) = "+s.charAt(10));
        System.out.println("Eksekusi charAt(20) = "+s.charAt(20));
        System.out.println("Eksekusi charAt(50) = "+s.charAt(50));

        //        System.out.println("Eksekusi charAt(100) = "+s.charAt(100));
        // Error dengan pesan Exception : java.lang.StringIndexOutBoundsException
    }
    
    public static void main (String[] args) {
        test01();
    }
}
