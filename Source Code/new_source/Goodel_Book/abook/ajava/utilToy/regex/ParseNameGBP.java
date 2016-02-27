/*
 * ParseNameGBP.java
 *
 * Created on January 14, 2004, 12:50 PM
 */

package abook.ajava.utilToy.regex;
import java.io.*;
import java.util.regex.*;

/**
 *
 * @author  Bambang Hariyanto
 */
public class ParseNameGBP {
    
    static void test01() throws IOException {
        System.out.println("Masukan berasal dari keyboard :");
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        
        String patternString = 
            "^\\s*                 # mengabaikan sembarang whitespace di\n"+
            "                      # awal dari baris\n"+
            "(M(s|r|rs)\\:.)       # ketemu Ms, Mrs dan Mr (titel)\n"+
            "\\s+                  # spasi di antara judul dan nama pertama\n"+
            "(\\S+)                # nama pertama\n"+
            "\\s+                  # spasi antara nama pertama dan nama akhir\n"+
            "(\\S+)                # nama akhir\n"+
            "\\s*$                 # setelah nama\n"
        ;
        
        int patternFlag = Pattern.CASE_INSENSITIVE | Pattern.COMMENTS;
        
        Pattern pattern = Pattern.compile (patternString, patternFlag);
        
        while (true) {
            String line = br.readLine();
            
            // Null line berart masukan telah terlampaui
            if (line == null) break;
            
            Matcher matcher = pattern.matcher(line);
            
            System.out.println("String : "+line);
            
            if (matcher.matches()){
                String title = matcher.group(1);
                String firstName = matcher.group(3);
                String lastName = matcher.group(4);
                
                System.out.println(" Gelar        : "+title);
                System.out.println(" Nama pertama : "+firstName);
                System.out.println(" Nama akhir   : "+lastName);
                
                String modernLine = modernize(line);
                
                if (!modernLine.equals(line)) {
                    System.out.println(" Dimodernisasi : "+modernLine);
                } 
            }else {
                System.out.println(" Tidak ketemu ");
            }
        }
    }
    
    static void String modernize(String name) {
    }

    public static void main (String[] args) throws IOException {
        test03();
    }
}
