/*
 * NumberFormatGermayToy.java
 *
 * Created on May 31, 2003, 3:57 PM
 */

package abook.misc.toy;
import java.text.*;
import java.util.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class NumberFormatGermanyToy {   
    public static void main(String args[]) {      
        double x = 1000.0/3.0;      
        NumberFormat numberFormatter = NumberFormat.getNumberInstance(Locale.GERMANY);      
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);      
        NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.GERMANY);      
        
        String numberStr = numberFormatter.format(x);      
        String currStr = currFormatter.format(x);       
        String percentStr = percentFormatter.format(x);      
        
        System.out.println("double 1000.0/3.0 berformat number   : "+ numberStr);      
        System.out.println("double 1000.0/3.0 berformat currency : "+ currStr);      
        System.out.println("double 1000.0/3.0 berformat percent  : "+ percentStr);   
    }
}