/*
 * ComplexWithEqualsToy.java
 *
 * Created on May 19, 2003, 3:16 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ComplexWithEqualsToy {
    private double re;
    private double im;

    ComplexWithEqualsToy (double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    static void test(){
         ComplexWithEqualsToy t1 = new ComplexWithEqualsToy(1.0, 2.0);
         ComplexWithEqualsToy t2 = new ComplexWithEqualsToy(1.0, 2.0);
         ComplexWithEqualsToy t3 = new ComplexWithEqualsToy(2.0, 1.0);

         if (t1.equals(t2))
            System.out.println("t1 sama dengan t2");
         else
            System.out.println("t1 tidak sama dengan t2");

         System.out.println();

         if (t1.equals(t3))
            System.out.println("t1 sama dengan t3");
         else
            System.out.println("t1 tidak sama dengan t3");
    }

    public static void main (String args[]) {
        test();
    }

    public boolean equals (Object o) {
        if (o == null) // Cautious
            return false;
      
        if (o == this) // Reflexive
            return true;

        if (!(o instanceof ComplexWithEqualsToy))   // Castable to this class?
            return false;

        ComplexWithEqualsToy otherO = (ComplexWithEqualsToy) o;  // Cast to ComplexWithEqualsToy

      // Compare field by field
        if ((re == otherO.re) && (im == otherO.im))
            return true;
        else
            return false;
    }
}
