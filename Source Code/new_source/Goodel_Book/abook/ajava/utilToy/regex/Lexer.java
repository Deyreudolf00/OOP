/*
 * Lexer.java
 *
 * Created on January 27, 2004, 4:32 AM
 */

package abook.ajava.utilToy.regex;
import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class Lexer {
    // Ekspresi regular untuk parsing terhadap file spesifikasi
    private static final String lxRuleString = "^\\s*(\\S+)\\s+(\\S+)\\s*$";
    // Himpunan aturan untuk lexer
    private LexerRule fRules[] = new LexerRule[0];
    
    // Masukan
    private FileInputStream fCurrentInputStream;
    private LineNumberReader fCurrentReader;
    private String fCurrentFilename;
    private String fCurrentLine;
    private int fCurrentColumn;
    
    /** Creates a new instance of Lexer */
    public Lexer(String specfile) throws IOException {
        loadSpecification(specfile);
    }
    
    // Memuatkan aturan-aturan dari file spesifikasi
    private void loadSpecification(String specfile) throws IOException{
        FileInputStream fin = new FileInputStream(specfile);
        InputStreamReader isr = new InputStreamReader(fin);
        LineNumberReader lnr = new LineNumberReader(isr);
        
        // Pola untuk parsing masing-masing baris file spec
        Pattern lxRule = Pattern.compile(lxRuleString);
        // Disimpan di array
        ArrayList ruleAL = new ArrayList();
        while (true) {
            String line = lnr.readLine();
            if (line==null) break;
            
            Matcher matcher = lxRule.matcher(line);
            if(matcher.matches()){
                // Menambahkan aturan ke list dari aturan-aturan
                // Masing-masing aturan tersusun dari nama kategori leksikal
                // dan ekpresi regularnya
                String name = matcher.group(1);
                String regex = matcher.group(2);
                LexerRule lr = new LexerRule(name, regex);
                ruleAL.add(lr);
            } else {
                // Kesalahan sintaks di file spesifikasi
                System.err.println(
                    "Kesalahan sintaks di "+specfile+
                    " baris "+ lnr.getLineNumber()+": ");
                System.err.println(" "+line);
                System.exit(1);
            }
        }
        // Menutup file spesifikasi
        fin.close();
        // Mengubah list dari aturan-aturan menjadi array
        fRules = (LexerRule[])ruleAL.toArray(fRules);
        System.out.println("File spesifikasi selesai diparse : "+specfile);
    }
    
    // Menyatakan ke Lexer mengenai asal file masukan
    public void setSource(String filename) throws IOException{
        fCurrentInputStream = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fCurrentInputStream);
        fCurrentReader = new LineNumberReader(isr);
        fCurrentFilename = filename;
        fCurrentLine = null;
        fCurrentColumn = 1;
    }
    
    // Mengirim token berikutnya dari stream masukan
    public LexerToken getNextToken() throws IOException{
        // Melakukan pembacaan baris per baris
        if (fCurrentLine==null || fCurrentLine.length()==0){
            fCurrentLine = fCurrentReader.readLine();
            if(fCurrentLine==null){
                fCurrentInputStream.close();
                fCurrentReader = null;
                fCurrentFilename = null;
                return null;
            }
            fCurrentColumn = 1;
        }
        
        LexerToken token = null;
        int tokenEnd = -1;
        int longestMatchLength = -1;
        
        // Menemukan aturan yang cocok dengan substring terpanjang dari masukan
        for(int i=0;i<fRules.length;++i){
            LexerRule rule = fRules[i];
            Pattern pattern = rule.getPattern();
            Matcher matcher = pattern.matcher(fCurrentLine);
            if(matcher.lookingAt()){
                int matchLength = matcher.end();
                if(matchLength > longestMatchLength){
                    // Temuan adalah terpanjang sampai saat ini
                    longestMatchLength = matchLength;
                    String text = matcher.group(0);
                    int lineNumber = fCurrentReader.getLineNumber();
                    token = new LexerToken(rule, text, lineNumber, fCurrentColumn);
                    tokenEnd = matchLength;
                }
            }
        }
        
        // Jika tidak ditemukan, merupakan satu kesalahan
        if(token==null){
            System.err.println(
                "Kesalahan sintaks di "+fCurrentFilename+
                " baris "+ fCurrentReader.getLineNumber()+
                " kolom "+fCurrentColumn+": ");
            System.err.println(" "+fCurrentLine);
            System.exit(1);
            
            // Seharusnya tidak pernah terjadi
            assert false;
            // Untuk kompilator harus mengirim nilai
            return null;
        } else {
            // Kita menemukan sesuatu, kita kirimkan token
            // Kita lebih dulu lompati token saat itu sehingga kita siap
            // membaca token berikutnya
            fCurrentColumn += tokenEnd;
            fCurrentLine = fCurrentLine.substring(tokenEnd);
            
            // Kirimkan token
            return token;
        }
    }
    
    public static void main(String[] args) throws IOException{
        if (args.length != 2) {
            System.err.println("Cara penggunaan : Lexer <lxfile> <masukan>");
            System.exit(1);
        }
        
        String specfile = args[0];
        String inputfile = args[1];

        Lexer lexer = new Lexer(specfile);
        lexer.setSource(inputfile);
        while(true){
            LexerToken token = lexer.getNextToken();
            if(token==null) {
                break;
            }
            System.out.println(token);
        }
    }
}
