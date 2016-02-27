/*
 * DigitTowerToy.java
 *
 * Created on May 23, 2003, 11:04 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 124
 */

public class DigitTowerToy {
    
    private int height = 0;
    
    /** Creates a new instance of DigitTowerToy */
    public DigitTowerToy(int height) {
        this.height = height;
    }
    
    private int decDigit(int d){
        d--;
        if (d == -1) return 9;
        return d;
    }
    
    private int incDigit(int d) {
        d++;
        if (d==10) return 0;
        return d;
    }
    
  
    public String toString() {
        String str="";
        int digit;
        for(int i=1;i<=height;i++){
            for(int j=0;j<height-i;j++){
                str += " ";
            }
            
            digit = i % 10;
            for(int k=0;k<i-1;k++){
                str += digit;
                digit = incDigit(digit);
            }
            
            str += digit;
            
            for(int k=0;k<i-1;k++){
                digit = decDigit(digit);
                str += digit;
            }
            str += "\n";
            
        }
        return str;
    }
    
    static void test(){
        DigitTowerToy t = new DigitTowerToy(10);
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
