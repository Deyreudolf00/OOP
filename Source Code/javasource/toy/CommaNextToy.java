package toy;

/*
 * CommaNextToy.java
 *
 * Created on May 31, 2003, 5:26 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class CommaNextToy {
    public static void main(String args[]){
        for (int i=1, j=4; i<j; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }
}