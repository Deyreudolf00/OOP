package abook.old;

/*
 * ForVarianToy.java
 *
 * Created on May 31, 2003, 5:28 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ForVarianToy {
    public static void main(String args[]){
        boolean finish = false;
        
        int i=0;
        for (; !finish;) {
            System.out.println("i = " + i);
            if (i==10) finish = true;
            i++;
        }
    }
}