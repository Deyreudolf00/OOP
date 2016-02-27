/*
 * calendarGB.java
 *
 * Created on January 31, 2004, 12:32 PM
 */

package abook.ajava.utilToy.calendar2;
import java.util.Calendar;
/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class GetSetDemo {
    static Calendar cal;
    
    static String months[] = {
            "Jan", "Peb", "Mar", "Apr", "Mei", "Jun",
            "Jul", "Agt", "Sep", "Okt", "Nop", "Des"
        };

    static void initCal() {
        // Menciptakan objek calendar yang diinisialisasi dengan
        // tanggal dan waktu saat itu dalam locale dan timezone yang default
        cal = Calendar.getInstance();
    };
    
    static void doGet() {
        System.out.println("Operasi get()");
        
        // Menampilkan informasi waktu dan tanggal
        System.out.println("Tanggal : "+cal.get(Calendar.DATE)+" "+
            months[cal.get(Calendar.MONTH)]+" "+cal.get(Calendar.YEAR));
        
        System.out.println("Waktu   : "+cal.get(Calendar.HOUR)+":"+
            cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }
    
    static void doSet() {
        System.out.println("Operasi set()");
        
        // Menset informasi waktu dan menampilkannya
        cal.set(Calendar.HOUR, 10);
        cal.set(Calendar.MINUTE, 20);
        cal.set(Calendar.SECOND, 30);
        
        System.out.println("Waktu   : "+cal.get(Calendar.HOUR)+":"+
            cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
    }

    static void demo(){
        System.out.println("DEMO operasi get() dan set() pada Calendar");
        initCal();
        doGet();
        doSet();
    }
    
    public static void main(String[] args){
        demo();
    }
}
