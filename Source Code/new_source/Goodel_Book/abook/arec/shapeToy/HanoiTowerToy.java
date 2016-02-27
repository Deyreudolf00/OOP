/*
 * HanoiTowerToy.java
 *
 * Created on May 24, 2003, 12:20 AM
 */

package abook.arec.shapeToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 155
 *
 *
 *  Java : How to Program
 *  Deitel Deitel, page 276, exercise 6.37
 *
 */

public class HanoiTowerToy {
    private int nrOfDisk = 0;
    private char originPole = 'A';
    private char destPole = 'B';
    private char otherPole = 'C';
    private String str = "";
    
    /** Creates a new instance of HanoiTowerToy */
    public HanoiTowerToy(int nrOfDisk) {
        this.nrOfDisk = nrOfDisk;
        transfer();
    }
    
    public String toString(){
        str = 
            "Menara Hanoi dengan "+nrOfDisk+" piringan \n" + 
            "Asal : "+originPole+" Tujuan : "+destPole+" Perantara : "+otherPole+"\n"+
            str;
        return str;
    }
   
    static void test(){
        System.out.println(new HanoiTowerToy(3));
    }
    
    public static void main(String[] args) {
        test();
    }
    
    private void diskMove(char originPole, char destPole) {
        str += "Pindahkan piringan dari "+originPole+" ke "+destPole+"\n";
    }
    
    private void blockMove(int nrOfDisk, char originPole, char destPole, char otherPole){
        if (nrOfDisk>0) {
            blockMove(nrOfDisk-1,originPole,otherPole,destPole);
            diskMove(originPole,destPole);
            blockMove(nrOfDisk-1,otherPole,destPole,originPole);
        } 
    }
    
    private void transfer() {
        blockMove(nrOfDisk,originPole,destPole,otherPole);
    }
    
}
