/*
 * LexerRule.java
 *
 * Created on January 27, 2004, 4:21 AM
 */

package abook.ajava.utilToy.regex;
import java.util.regex.*;
/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class LexerRule {
    // nama kategori leksik yang memenuni aturan
    private String fName;
    // ekspresi regular yang digunakan untuk pencocokan
    private String fRegex;
    // Objek pre-compiled, disimpan untuk menghemat waktu
    private Pattern fPattern;

    /** Creates a new instance of LexerRule */
    public LexerRule(String name, String regex) {
        fName = name;
        fRegex = regex;
    }
    public String getName(){
        return fName;
    }
    public String getRegex() {
        return fRegex;
    }
    
    /**
     * Mengirim objek Pattern. 
     * Menciptakannya jika belum diciptakan.
     */
    public Pattern getPattern() {
        if (fPattern == null) fPattern = Pattern.compile(fRegex);
        return fPattern;
    }
    
    /**
     * Mengirim representasi string dari aturan
     */
    public String toString(){
        return "# "+fName+" "+fRegex+" #";
    }
}
