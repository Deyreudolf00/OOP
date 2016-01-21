/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringinput;
import javax.swing.*;

/**
 *
 * @author rengga
 */
public class StringInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Whats is your name?");
        System.out.println(name);
        System.exit(0);
    }
    
}
