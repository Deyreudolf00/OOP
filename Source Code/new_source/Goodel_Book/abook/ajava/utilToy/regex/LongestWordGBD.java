/*
 * LongestWordGBD.java
 *
 * Created on January 14, 2004, 8:52 AM
 */

package abook.ajava.utilToy.regex;
import java.io.*;
import java.util.regex.*;

/**
 *
 * @author  bbhariyanto
 */
public class LongestWordGBD {
    
    static void test01() throws IOException {
        System.out.println("Test 01");
        System.out.println("Masukan berasal dari keyboard :");
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        Pattern pattern = Pattern.compile ("\\s*:\\s*");
        while (true) {
            String line = br.readLine();
            
            // Null line berart masukan telah terlampaui
            if (line == null) break;
            
            String words[] = pattern.split(line);
            
            // -1 berarti kita tidak menemukan kata sama sekali
            int longest = -1;
            int longestLength = 0;
            for (int i=0; i<words.length; ++i) {
                System.out.println("words["+i+"] ="+words[i]);
                if (words[i].length() > longestLength) {
                    longest = i;
                    longestLength = words[i].length();
                }
            }
            System.out.println("Kata terpanjang di : "+line+" ");
            System.out.println(words[longest]);
        }
    }
    
    static void test02() throws IOException {
        System.out.println("Test 02");
        System.out.println("Masukan berasal dari hardcode :");
        System.out.println("Pemisah kata adalah spasi");
        
        Pattern pattern = Pattern.compile ("\\s*:\\s*");
        String line = "jakarta:adalah:kota:terbesar:seIndonesia";
            
        String words[] = pattern.split(line);
            
        // -1 berarti kita tidak menemukan kata sama sekali
        int longest = -1;
        int longestLength = 0;
        for (int i=0; i<words.length; ++i) {
            System.out.println("words["+i+"] ="+words[i]);
            if (words[i].length() > longestLength) {
                longest = i;
                longestLength = words[i].length();
            }
        }
        System.out.println("Kata terpanjang di : "+line+" ");
        System.out.println(words[longest]);
        System.out.println("");
    }

    static void test03() throws IOException {
        System.out.println("Test 03");
        System.out.println("Masukan berasal dari hardcode :");
        System.out.println("Pemisah kata adalah :");
        
        Pattern pattern = Pattern.compile ("\\s* \\s*");
        String line = "jakarta adalah kota terbesar seIndonesia";
            
        String words[] = pattern.split(line);
            
        // -1 berarti kita tidak menemukan kata sama sekali
        int longest = -1;
        int longestLength = 0;
        for (int i=0; i<words.length; ++i) {
            System.out.println("words["+i+"] ="+words[i]);
            if (words[i].length() > longestLength) {
                longest = i;
                longestLength = words[i].length();
            }
        }
        System.out.println("Kata terpanjang di : "+line+" ");
        System.out.println(words[longest]);
        System.out.println("");
    }

    public static void main (String[] args) throws IOException {
        test02();
        test03();
    }
}
