/*
 * EvenMachineToy.java
 *
 * Created on May 20, 2003, 6:51 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class EvenMachineToy extends SequenceMachineToy {
    
    /** Creates a new instance of EvenMachineToy */
    public EvenMachineToy() {
        result = 2;
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
        EvenMachineToy m = new EvenMachineToy();
        
        for(int i=0;i<10;i++) {
            System.out.println("Bilangan ke "+i+" adalah "+m.get());
            m.next();
        }
        
        System.out.println("Bergerak mundur");
        
        for(int i=m.getSequenceNumber();i>0;i--) {
            System.out.println("Bilangan ke "+i+" adalah "+m.get());
            m.prev();
        }
    }
    
    public static void main (String[] args){
        test();
    }
}
