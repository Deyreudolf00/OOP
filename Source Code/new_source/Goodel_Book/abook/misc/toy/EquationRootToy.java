/*
 * EquationRootToy.java
 *
 * Created on May 23, 2003, 3:58 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 101
 */

public class EquationRootToy {
    private static final double GALAT = 0.00001;
    private double guess;
    private double root;
    private long count = 0;
    private Equation f;
    
    private boolean fValid = true;

        /** Creates a new instance of EquationRootToy */
    public EquationRootToy(double guess, Equation f){
        this.guess = guess;
        this.f = f;
        calcRoot();
    }
    
    public void setGuess(double guess) {
        this.guess = guess;
        this.fValid = true;
        calcRoot();
    }
    
    public long getCount(){
        // Precondition : isValid() == true
        return count;
    }
    
    public double getRoot(){
        // Precondition : isValid() == true
        return root;
    }
    
    public boolean isValid(){
        return fValid;
    }
    
    public String toString(){
        String str;
        if (isValid())
            str = 
            "Sampai iterasi ke "+count+"\n"+
            "Akar = "+root;
        else str = "Tebakan awal tidak menyebabkan konvergen";
        return str;
    }
    
    static void test(){
        Equation f = new Equation();
        EquationRootToy t = new EquationRootToy(1.0, f);
        
        if (t.isValid()) System.out.println(t);
        else System.out.println("Kesalahan :: Tebakan tidak divergen");
    }
    
    public static void main(String[] args) {
        test();
    }
    
    private void calcRoot(){
        double probe;
        double error;
        while(true){
            count++;
            if (count > 50) return;
            
            probe = f.calcF1(guess);
            if (probe > 0.0) {
                root = f.calcF2(guess);
                error = Math.abs(root-guess);
                if (error>GALAT) {
                    guess = root;
                } else return;
            } else {
                fValid = false;
                return;
            }
        }
    }
}

class Equation {
    double calcF1(double guess){
        return (10-3*guess*guess);
    }
    
    double calcF2(double guess){
        return Math.pow(calcF1(guess),0.2);
    }
}