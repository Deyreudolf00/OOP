/*
 * SumSToy.java
 *
 * Created on June 2, 2003, 7:45 AM
 */

package abook.ajava.swingToy;
import javax.swing.JOptionPane;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Deitel
 * Page 176-177
 */
public class SumSToy {
    
    /** Creates a new instance of SumSToy */
    public SumSToy() {
    }
    
   public static void main (String args[]) {
       EvenSumToy theO = new EvenSumToy();
       JOptionPane.showMessageDialog(null,"Jumlah : "+theO,
         "Jumlah Bilangan Bulat dari 2 sampai 100",
         JOptionPane.INFORMATION_MESSAGE);

       GenericEvenSumToy theG = new GenericEvenSumToy(2,100);
       JOptionPane.showMessageDialog(null,"Jumlah : "+theG,
         "Jumlah Bilangan Bulat dari 2 sampai 100",
         JOptionPane.INFORMATION_MESSAGE);

       theG = new GenericEvenSumToy(102, 1000);
       JOptionPane.showMessageDialog(null,"Jumlah : "+theG,
         "Jumlah Bilangan Bulat dari 102 sampai 1000",
         JOptionPane.INFORMATION_MESSAGE);


       System.exit(0);
   }
}

class EvenSumToy{
   int total=0;

   public EvenSumToy() {
      total = 0;
      for (int i=2;i<=100;i+=2) {
          total += i;
      }
   }

   public String toString() {
      return (""+total);
   }
}

class GenericEvenSumToy{
   int total=0;

   public GenericEvenSumToy (int initNr, int endNr) {
       initNr = (initNr / 2) * 2;
       total = 0;
       for(int i=initNr; i<=endNr; i+=2) total += i;
   }

   public String toString() {
      return ""+total;
   }
}
