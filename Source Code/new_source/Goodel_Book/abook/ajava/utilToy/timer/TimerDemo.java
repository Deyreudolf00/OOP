/*
 * TimerGB.java
 *
 * Created on January 31, 2004, 5:34 PM
 */

package abook.ajava.utilToy.timer;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @version 0.1
 * @author Bambang Hariyanto
 */
public class TimerDemo {
    static DemoTimerTask tt;
    static Timer t;
    
    static void initTT() {
        tt = new DemoTimerTask();
        t = new Timer();
    }
    
    static void doSchedule() {
        t.schedule(tt, 1000, 500);
    }
    
    static void doSleep() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Tak pernah masuk
            System.out.println(e);
        }
    }
    
    static void demo(){
        initTT();
        doSchedule();
        doSleep();
    }
    
    public static void main (String[] args){
        demo();
    }
}

class DemoTimerTask extends TimerTask {
    public void run() {
        System.out.println("TimerTask dieksekusi ");
    }
}
