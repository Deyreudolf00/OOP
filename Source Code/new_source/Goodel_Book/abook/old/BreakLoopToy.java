package abook.old;

/*
 * BreakLoopToy.java
 *
 * Created on May 31, 2003, 10:47 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class BreakLoopToy {
    public static void main(String args[]){
        int i = 0;
        do {
            i++;
            System.out.println(i);
            if (i == 5) break;
        } while (true);
    }
}
