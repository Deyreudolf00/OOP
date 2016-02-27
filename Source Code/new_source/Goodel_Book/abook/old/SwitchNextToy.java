package abook.old;

/*
 * SwitchToy.java
 *
 * Created on May 31, 2003, 5:12 PM
 */

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class SwitchNextToy {    
    static public void main (String args[]) {	
        int a;	
        
        a = 5;	
        switch (a) {	
            case 0: System.out.println("Nol"); break;	
            case 1: System.out.println("Satu"); break;	
            case 2: System.out.println("Dua"); break;	
            case 3: System.out.println("Tiga"); break;	
            case 4: System.out.println("Empat"); break;	
            case 5: System.out.println("Lima");	break;
            case 6: System.out.println("Enam");	break;
            case 7: System.out.println("Tujuh"); break;	
            case 8: System.out.println("Delapan"); break;	
            case 9: System.out.println("Sembilan"); break;	
            default: System.out.println("Bukan karakter digit");	
        }    
    }
}
