package toy;

/*
 * CommaToy.java
 *
 * Created on May 31, 2003, 5:25 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class CommaToy {
    public static void main(String args[]){
        int j;
        
        j=4;
        for (int i=1; i<j; i++) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            j--;
        }
    }
}
