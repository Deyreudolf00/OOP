/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellodate;
import java.util.Date;
/**
 *
 * @author rengga
 */
public class HelloDate {

    /**
     * @param args the command line arguments
     */
    static void  printHello()
    {
        System.out.println("Hello, its : ");
        System.out.println(new Date());
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        printHello();
    }
    
}
