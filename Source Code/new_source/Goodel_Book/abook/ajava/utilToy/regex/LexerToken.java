/*
 * LexerToken.java
 *
 * Created on January 27, 2004, 4:27 AM
 */

package abook.ajava.utilToy.regex;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class LexerToken {
    private LexerRule fRule;
    private String fText;
    private int fLine;
    private int fColumn;

    /** Creates a new instance of LexerToken */
    /** LexerToken berisi aturan, teks dan lokasi teks di file */
    public LexerToken(LexerRule rule, String text, int line, int column) {
        fRule = rule;
        fText = text;
        fLine = line;
        fColumn = column;
    }
    
    /**
     * Mengirim aturan yang cocok dengan token
     */
    public LexerRule getRule() {
        return fRule;
    }
    
    /**
     * Mengirim teks yang cocok dengan token
     */
    public String getText() {
        return fText;
    }
    
    /**
     * Mengirim representasi string dari token
     */
    public String toString() {
        return 
            "<<*** "+
            "\""+fText+"\""+
            " di baris : "+fLine+", kolom : "+fColumn +", aturan: "+fRule+
            " ***>>";
    }
}
