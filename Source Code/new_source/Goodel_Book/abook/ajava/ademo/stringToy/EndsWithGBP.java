/*
 * EndsWith.java
 *
 * Created on January 14, 2004, 1:10 AM
 */

package abook.ajava.ademo.stringToy;

/**
 *
 * @author  bbhariyanto
 */
public class EndsWithGBP {
    static String s = 
        "Orang yang dapat melepaskan diri dari suatu kebiasaan "+
        "adalah bagaikan mukjizat";
    
    static void test01(){
        System.out.println("Percobaan sederhana untuk endsWith(): ");
        
        if (s.endsWith("t")) {
            System.out.println("Bagian TRUE:");
            System.out.println("String s = "+s);
            System.out.println("berakhir dengan : "+"t");
        }

        if (s.endsWith("zat")) {
            System.out.println("Bagian TRUE:");
            System.out.println("String s = "+s);
            System.out.println("berakhir dengan : "+"zat");
        }
        
        if (s.endsWith("mukjizat")) {
            System.out.println("Bagian TRUE:");
            System.out.println("String s = "+s);
            System.out.println("berakhir dengan : "+"mukjizat");
        }
        
        if (s.endsWith(" mukjizat")) {
            System.out.println("Bagian TRUE:");
            System.out.println("String s = "+s);
            System.out.println("berakhir dengan : "+" mukjizat");
        }

        if (s.endsWith("bagaikan mukjizat")) {
            System.out.println("Bagian TRUE:");
            System.out.println("String s = "+s);
            System.out.println("berakhir dengan : "+"bagaikan mukjizat");
        }
    }
    
    static void test02(){
        if (s.endsWith("yaitu mukjizat")) {
            System.out.println("Bagian TRUE:");
            System.out.println("String s = "+s);
            System.out.println("berakhir dengan : "+"yaitu mukjizat");
        } else {
            System.out.println("Bagian FALSE:");
            System.out.println("String s = "+s);
            System.out.println("tidak berakhir dengan : "+"yaitu mukjizat");
        }
    }

    public static void main (String[] args) {
        test01();
        test02();
    }
}
