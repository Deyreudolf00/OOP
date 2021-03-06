/*
 * SquareEquationToy.java
 *
 * Created on May 20, 2003, 5:19 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 78
 */

public class SquareEquationToy {
    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    
    private boolean fValid = false;
    
    public SquareEquationToy(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        calcX();
    }
    
    private double calcDiscriminant (){
        return b*b - 4*a*c;
    }
    
    private void calcX(){
        double d = calcDiscriminant();
        if (d > 0) {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            fValid = true;
        }
    }
    
    public boolean isValid(){
        return fValid;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    public double getX1(){
        return x1;
    }
    
    public double getX2(){
        return x2;
    }
    
    static void test(){
        SquareEquationToy s = new SquareEquationToy(1.0,6.0,2.0);
        if (s.isValid()){
            System.out.println("Persamaan "+s.getA()+"X^2 "+s.getB()+"X "+s.getC()+"  mempunyai akar "+s.getX1()+" dan "+s.getX2());
        } else {
            System.out.println("Persamaan "+s.getA()+"X^2 "+s.getB()+"X "+s.getC()+"  tidak mempunyai akar-akar riil");
        }
    }
    
    public static void main (String[] args){
        test();
    }
}


