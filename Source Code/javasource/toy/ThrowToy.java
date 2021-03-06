/*
 * ThrowToy.java
 *
 * Created on June 1, 2003, 7:46 AM
 */

package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class ThrowToy {
    
    /** Creates a new instance of ThrowToy */
    public ThrowToy() {
    }
    
    static void throwException() throws Exception{
        try {
            // Dilemparkan exception
            throw new Exception("Demo terhadap kalimat throw");
        } catch (Exception e) {
            System.out.println("Penangkapan exception di test");
            throw e; 
            // Exception kembali dilemparkan}
        }
    }
    
    static void test(){
        try {
            throwException();
        }catch (Exception e) { 
            //menangkap exception
            System.out.println("Kembali ditangkap exception: " + e);}
    }
        
    public static void main (String args[]) {
        test();
    }
}
