/*
 * EulerToy.java
 *
 * Created on May 25, 2003, 4:50 AM
 */

package abook.afield.amath.spcnumberToy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class EulerToy {
    static void test01(){
        E e = new E(100); 
        System.out.println("Sampai 100 suku e = "+e.get());
        System.out.println("Math.E adalah "+Math.E);
        System.out.println("Selisih = "+Math.abs(e.get()-Math.E));
    }
    
    static void test02(){
        EXP exp = new EXP(5.0,100);
        System.out.println("Sampai 100 suku exp(5.0) = "+exp.get());
        System.out.println("Math.exp(5.0) adalah "+Math.exp(5.0));
        System.out.println("Selisih = "+Math.abs(exp.get()-Math.exp(5.0)));
    }
    
    static public void main(String[] args) {
        test01();
        test02();
    }
}

class E{
    private long current=1;
    private double denom=1;
    private double result=1;
    
    public E(int n){
        for(int i=0;i<n;i++) next();
    }
    
    public double get(){
        return result;
    }
    
    public void next(){
        denom *= current;
        double term = 1/denom;
        result += term;
        current++;
    }
}

class EXP{
    private long current=1;
    private double x;
    private double powerX;
    private double denom=1;
    private double result=1;
    
    public EXP(double x, int n){
        this.x = x;
        powerX = x;
        for(int i=0;i<n;i++) next();
    }
    
    public double get(){
        return result;
    }
    
    public void next(){
        denom *= current;
        double term = powerX/denom;
        result += term;
        powerX *= x;
        current++;
    }
}
