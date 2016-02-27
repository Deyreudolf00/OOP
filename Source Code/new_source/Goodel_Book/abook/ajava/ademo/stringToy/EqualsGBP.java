/*
 * EqualsGBP.java
 *
 * Created on January 14, 2004, 1:19 AM
 */

package abook.ajava.ademo.stringToy;

/**
 *
 * @author  bbhariyanto
 */
public class EqualsGBP {
    
    static String s = "Hello";
    
    static void test() {
        System.out.println("Percobaan sederhana untuk equals(): ");
        System.out.println("String s = "+s);

        if (s.equals("Hello")) {
            System.out.println("Bagian TRUE : s.equals(\"Hello\")");
        } else {
            System.out.println("Bagian FALSE : s.equals(\"Hello\")");
        }

        if (s.equals("HELLO")) {
            System.out.println("Bagian TRUE : s.equals(\"HELLO\")");
        } else {
            System.out.println("Bagian FALSE : s.equals(\"HELLO\")");
        }
    }
    
    public static void main (String[] args) {
        test();
    }
}
