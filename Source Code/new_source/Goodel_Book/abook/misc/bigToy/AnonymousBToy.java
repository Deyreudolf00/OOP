/*
 * AnonymousBToy.java
 *
 * Created on May 26, 2003, 6:50 AM
 */

package abook.misc.bigToy;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Core Java 2
 * Page 283
 */

public class AnonymousBToy {
    
    /** Creates a new instance of AnonymousBToy */
    public AnonymousBToy() {
    }
    
   public static void main (String args[]) {
      BankAccountClass acc = new BankAccountClass(10000.0);
      acc.start(10);

      JOptionPane.showMessageDialog(null, "Keluar dari program?");
      System.exit(0);
   }
}

class BankAccountClass {
   private double balance;

   public BankAccountClass(double newBalance) {
      balance = newBalance;
   }

   public void start(final double rate) {
      ActionListener adder = new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            double interest = balance * rate / 100;
            balance += interest;
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println("balance="+formatter.format(balance));
         }
      };
      Timer t = new Timer(1000, adder);
      t.start();
   }
}
