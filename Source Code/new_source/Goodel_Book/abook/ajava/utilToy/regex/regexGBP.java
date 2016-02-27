/*
 * regexGBP.java
 *
 * Created on January 14, 2004, 8:24 AM
 */

package abook.ajava.utilToy.regex;
import java.util.regex.*;
/**
 *
 * @author  bbhariyanto
 */
public class regexGBP {
    static String s = 
        "Orang yang dapat melepaskan diri dari suatu kebiasaan "+
        "adalah bagaikan mukjizat";
    static String s2 = 
        "Orang yang dapat melepaskan diri dari suatu kebiasaan "+
        "adalah (bagaikan mukjizat)";
    
    static void test01(){
        System.out.println("Test 01");
        //        Pattern pattern = Pattern.compile("\\S+\\s+\\S+\\");
        // Error : java.util.PatternSyntaxException: Unexpected internal error near index 10
        System.out.println("String s = "+s);
        
        //      System.out.println("Pattern.compile(\"\\\S+\\\s+\\\S+\")");
        // Error regex/regexGBP.java : illegal escape character
        
        System.out.println("Pattern.compile(\"\\\\S+\\\\s+\\\\S+\")");
        Pattern pattern = Pattern.compile("\\S+\\s+\\S+");
        Matcher matcher = pattern.matcher(s);
        
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String matched = s.substring(start, end);
            System.out.println("Hasil s.substring(start, end) : "+matched);
        }
    }
    
    static void test02(){
        System.out.println("Test 02 : sama dengan Test 01 hanya menggunakan group");
        System.out.println("String s = "+s);
        
        System.out.println("Pattern.compile(\"\\\\S+\\\\s+(\\\\S+)\\\\S+\")");
        Pattern pattern = Pattern.compile("\\S+\\s+(\\S+)\\S+");
        Matcher matcher = pattern.matcher(s);
        
        if (matcher.find()) {
            String matched = matcher.group();
            String middleWord = matcher.group(1);
            System.out.println("matched = matcher.group(), matched : "+matched);
            System.out.println("middleWord = matcher.group(1), middleWord : "+middleWord);
        }
    }

    static void test03(){
        System.out.println("Test 03 : find and replace");
        System.out.println("String s = "+s);
        
        System.out.println("Pattern.compile(\"\\\\S+\"");
        Pattern pattern = Pattern.compile("\\S+");
        Matcher matcher = pattern.matcher(s);
        
        String newString = matcher.replaceAll("Kata");
        
       System.out.println("Hasil s.matcher.replaceAll(\"Kata\") : "+newString);
    }

    static void test04(){
        System.out.println("Test 04 : context-sensitive find and replace");
        System.out.println("String s = "+s2);
        
        System.out.println("Pattern.compile(\"\\\\((.*)\\\\)\"");
        Pattern pattern = Pattern.compile("\\((.*)\\)");
        StringBuffer sb = new StringBuffer();
        Matcher matcher = pattern.matcher(s2);
        
        while (true) {
            if (!matcher.find()) break;
            matcher.appendReplacement(sb, "[$1]");
        }
        
        matcher.appendTail(sb);
        String newString = sb.toString();
        System.out.println("Hasil s.matcher.appendReplacement(sb, \"[%1]\") : \n"+newString);
    }

    public static void main (String[] args) {
        test01();
        test02();
        test03();
        test04();
    }
}
