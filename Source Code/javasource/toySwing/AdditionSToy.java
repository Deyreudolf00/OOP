/*
 * AdditionSToy.java
 *
 * Created on May 26, 2003, 5:56 AM
 */

package toySwing;
import javax.swing.JOptionPane;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Deitel, page 47
 */

public class AdditionSToy {
    
    /** Creates a new instance of AdditionSToy */
    public AdditionSToy() {
    }
    
    static void test(){
        String firstNumber;
        String secondNumber;

        int number1;
        int number2;
        int sum;

        firstNumber  = JOptionPane.showInputDialog("Masukkan angka pertama : ");
        secondNumber = JOptionPane.showInputDialog("Masukkan angka kedua   : ");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "Penjumlahan kedua bilangan : "+sum,
            "Hasil", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
    public static void main (String args[]) {
       test();
    }
}
