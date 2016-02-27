/*
 * InnerClassBToy.java
 *
 * Created on May 26, 2003, 6:54 AM
 */

package abook.ajava.systemToy;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Core Java 2
 * Page 273
 */

public class InnerClassBToy {
    
    /** Creates a new instance of InnerClassBToy */
    public InnerClassBToy() {
    }
    
   public static void main (String args[]) {
      BankAccount acc = new BankAccount (10000);
      acc.start(10);

      JOptionPane.showMessageDialog(null, "Keluar dari program?");
      System.exit(0);
   }
}

class BankAccount {
   private double balance;

   private class InterestAdder implements ActionListener {
      private double rate;

      public InterestAdder(double theRate) {
         rate = theRate;
      }

      public void actionPerformed(ActionEvent evt) {
         double interest = balance * rate / 100;
         balance += interest;
         NumberFormat formatter = NumberFormat.getCurrencyInstance();
         System.out.println("balance="+formatter.format(balance));
      }
   }

   public BankAccount (double newBalance) {
      balance = newBalance;
   }

   public void start(double rate) {
      ActionListener adder = new InterestAdder(rate);
      Timer t = new Timer(1000, adder);
      t.start();
   }
}
