/*
 * DateDemo.java
 *
 * Created on January 25, 2004, 1:42 PM
 */

package abook.ajava.utilToy.date2;
import java.util.Date;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class dateDemo {
    static void printToday(){
        System.out.println("DEMO Penggunaan constructor Date()");
        Date today = new Date();
        System.out.println("Hari ini = "+today);
    }
    
    static void printElapsed(){
        System.out.println("DEMO Penggunaan getTime()");
        Date now = new Date();
        System.out.println("Waktu saat ini : "+now);
        
        long msec = now.getTime();
        System.out.println("Milidetik sejak 1 Januari 1970 GMT = "+msec);
    }
    
    static void demo(){
        printToday();
        printElapsed();
    }
    
    public static void main(String[] args){
        demo();
    }
}
