/*
 * SeparateNumberToy.java
 *
 * Created on May 18, 2003, 12:39 PM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 70, exercise 2.32
 */
public class SeparateNumberToy {
    
    private int number;
    
    /** Creates a new instance of SeparateNumberToy */
    public SeparateNumberToy(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String toString(){
        String str = number + "dapat dipisahkan menjadi : " + separate();
        return str;
    }
    
    static void test(){
        System.out.println(new SeparateNumberToy(42339));
        System.out.println(new SeparateNumberToy(0));
    }
    
    public static void main(String args[]) {
        test();
    }
    
    private String separate() {
        String t = ""+number;
        String str = "";
        
        for (int i=0;i<t.length();i++){
            str += t.substring(i,i+1)+"\t";
        }
        
        return str;
    }
}
