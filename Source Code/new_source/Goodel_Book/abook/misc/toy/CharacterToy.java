/*
 * CharacterToy.java
 *
 * Created on June 1, 2003, 6:50 AM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class CharacterToy {
    
    /** Creates a new instance of CharacterToy */
    public CharacterToy() {
    }
    
    static void test(){
        char arrChar[] = {'i','Y','s','H','z','R','1','?',' ','*'};		
        for (int i=0;i<arrChar.length; i++) {	    
            if(Character.isDigit(arrChar[i])) 
                System.out.println(arrChar[i] + " adalah Digit");	    
            if(Character.isLetter(arrChar[i])) 
                System.out.println(arrChar[i] + " adalah Abjad");	    
            if(Character.isWhitespace(arrChar[i])) 
                System.out.println(arrChar[i] + " adalah WhiteSpace");	    
            if(Character.isLowerCase(arrChar[i])) 
                System.out.println(arrChar[i] + " adalah LowerCase");	    
            if(Character.isUpperCase(arrChar[i])) 
                System.out.println(arrChar[i] + " adalah UpperCase");	
        }    
    }
    
    static public void main(String args[]) {	
        test();
    }
}