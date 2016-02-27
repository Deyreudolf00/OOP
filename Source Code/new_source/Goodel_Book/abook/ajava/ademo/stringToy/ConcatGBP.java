/*
 * ConcatGBP.java
 *
 * Created on January 14, 2004, 12:53 AM
 */

package abook.ajava.ademo.stringToy;

/**
 *
 * @author  bbhariyanto
 */
public class ConcatGBP {
    
    static String s1 = 
        "Orang yang dapat melepaskan diri dari suatu kebiasaan ";
    static String s2 = "adalah bagaikan mukjizat";
    
    static void test01() {
        System.out.println("Percobaan sederhana untuk concat() : ");
        System.out.println("String s1 = "+s1);
        System.out.println("String s2 = "+s2);
        System.out.println("String s1.concat(s2) = "+s1.concat(s2));
    }

    public static void main (String[] args) {
        test01();
    }
}
