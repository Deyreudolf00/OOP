/*
 * oddMachineToy.java
 *
 * Created on May 20, 2003, 6:46 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class OddMachineToy extends SequenceMachineToy {
    
    /** Creates a new instance of oddMachineToy */
    public OddMachineToy() {
        result = 1;
    }
    
    public void next() {
        sequenceNr++;
        result += 2;
    }
    
    public void prev() {
        sequenceNr--;
        result -= 2;
    }
    
    static void test(){
        OddMachineToy m = new OddMachineToy();
        
        for(int i=0;i<10;i++) {
            System.out.println("Bilangan ke "+i+" adalah "+m.get());
            m.next();
        }
        
        System.out.println("Bergerak mundur");
        
        for(int i=m.sequenceNr;i>0;i--) {
            System.out.println("Bilangan ke "+i+" adalah "+m.get());
            m.prev();
        }
    }
    
    public static void main (String[] args){
        test();
    }
}
