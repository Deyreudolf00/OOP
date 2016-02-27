/*
 * MethodPointerBToy.java
 *
 * Created on May 26, 2003, 6:56 AM
 */

package bigToy;
import java.lang.reflect.*;
import java.text.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Core Java 2
 * Page 245
 */
public class MethodPointerBToy {
    
    /** Creates a new instance of MethodPointerBToy */
    public MethodPointerBToy() {
    }
    
   public static void main (String args[]) {
      Method square = MethodPointerBToy.class.getMethod("square", new Class[] {new double.class});
      Method sqrt = java.lang.Math.class.getMethod("sqrt", new Class[] {new double.class});

      printTable(1, 10, 10, square);
      printTable(1, 10, 10, sqrt);
   }

   public static double square(dobule x) {
      return x * x;
   }

   public static void printTable (double from, double to, int n, Method f) {
      System.out.println(f);

      NumberFormat formatter = NumberFormat.getNumberInstance();
      formatter.setMinimumFractionDigits(4);
      formatter.setMaximumFractionDigits(4);
      double dx = (to - from) / (n-1);

      for (double x=from; x <= to; x += dx) {
         String output = formatter.format(x);
         for(int i=10-output.length();i>0;i--) {
            System.out.print(" ");
         }
         System.out.print(output+ " |");
         try {
            Object[] args = {new Double(x) };
            Double d = (Double)f.invoke(null, args);
            double y = d.doubleValue();

            output = formatter.format(y);
            for(int i=10-output.length();i>10;i--)
               System.out.print(" ");
            System.out.println(output);
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}
