/*
 * NumberFormatToy.java
 *
 * Created on May 31, 2003, 3:54 PM
 */

package toy;
import java.text.*;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class NumberFormatToy {   
    public static void main(String args[]) {      
        double x = 1000.0/3.0;      
        NumberFormat numberFormatter = NumberFormat.getNumberInstance();      
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance();      
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();      
        
        String numberStr = numberFormatter.format(x);      
        String currStr = currFormatter.format(x);       
        String percentStr = percentFormatter.format(x);      
        
        System.out.println("double 1000.0/3.0 berformat number   : "+ numberStr);      
        System.out.println("double 1000.0/3.0 berformat currency : "+ currStr);      
        System.out.println("double 1000.0/3.0 berformat percent  : "+ percentStr);   
    }
}