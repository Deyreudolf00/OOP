/*
 * AbsGBP.java
 * ### MOVED to bms.lang.math.Abs in jgreenpearl.org
 *
 * Created on January 14, 2004, 1:32 AM
 */

package abook.ajava.ademo.mathToy;

/**
 *
 * @author  bbhariyanto
 */
public class AbsGBP {
    
    static void test() {
        System.out.println("Percobaan sederhana untuk Math.abs(): ");
        System.out.println("Eksekusi Math.abs(-13.0) = "+Math.abs(-13.0));
        System.out.println("Eksekusi Math.abs(0.0) = "+Math.abs(-13.0));
        System.out.println("Eksekusi Math.abs(-0.0) = "+Math.abs(-13.0));
        System.out.println("Eksekusi Math.abs(13.0) = "+Math.abs(-13.0));
        
        System.out.println("Percobaan angka double besar POSITIF untuk Math.abs(): ");
        System.out.println("Eksekusi Math.abs(1234567890.0) = "+
            Math.abs(12345678900.0));
        System.out.println("Eksekusi Math.abs(12345678901234567890.0) = "+
            Math.abs(12345678901234567890.0));
        System.out.println("Eksekusi Math.abs(123456789012345678901234567890.0) = "+
            Math.abs(123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(1234567890123456789012345678901234567890.0) = "+
            Math.abs(1234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(12345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(12345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(1234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(1234567890123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(12345678901234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(12345678901234567890123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0));

        System.out.println("Percobaan angka double besar NEGATIF untuk Math.abs(): ");
        System.out.println("Eksekusi Math.abs(-1234567890.0) = "+
            Math.abs(-12345678900.0));
        System.out.println("Eksekusi Math.abs(-12345678901234567890.0) = "+
            Math.abs(-12345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-123456789012345678901234567890.0) = "+
            Math.abs(-123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-1234567890123456789012345678901234567890.0) = "+
            Math.abs(-1234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-12345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(-12345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(-123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-1234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(-1234567890123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-12345678901234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(-12345678901234567890123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0));
        System.out.println("Eksekusi Math.abs(-1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0) = "+
            Math.abs(-1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890.0));

        System.out.println("Percobaan angka besar POSITIF untuk Math.abs(): ");

        //        System.out.println("Eksekusi Math.abs(1234567890) = "+
        //    Math.abs(1234567890));
        // Error : integer number too large : 1234567890
        
        System.out.println("Eksekusi Math.abs(1234567890L) = "+
        Math.abs(1234567890L));

        //        System.out.println("Eksekusi Math.abs(12345678901234567890L) = "+
        //    Math.abs(12345678901234567890L));
        // Error : integer number too large
    }
    
    public static void main (String[] args) {
        test();
    }
}
