package abook.misc.toy;

/*
 * ForNestedLoopToy.java
 *
 * Created on May 31, 2003, 5:30 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ForNestedLoopToy {
    public static void main(String args[]){
        for (int i=0; i<10;i++) {
            for (int j=i; j<10; j++) {
                System.out.print("*");}
            System.out.println();
        }
    }
}