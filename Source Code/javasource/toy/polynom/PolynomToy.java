/*
 * PolynomToy.java
 *
 * Created on June 14, 2003, 10:10 PM
 */

package toy.polynom;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */

public class PolynomToy {
    private int numberOfTerms;
    private double[] coef;
    
    /** Creates a new instance of PolynomToy */
    public PolynomToy(double[] coef) {
        this.numberOfTerms = coef.length;
        this.coef = coef;
    }
    
    public PolynomToy(int numberOfTerms){
        this.numberOfTerms = numberOfTerms;
        coef = new double[numberOfTerms];
    }
    
    public PolynomToy(int[] terms, double coef[]){
        // P = coef[0] x^ terms[0] + ...
        this.numberOfTerms = terms[0]+1;
        this.coef = new double[numberOfTerms];
        for(int i=0;i<terms.length;i++){
            this.coef[terms[i]] = coef[i];
        }
    }
    
    public PolynomToy add(PolynomToy a){
        PolynomToy c;
        if (this.numberOfTerms > a.numberOfTerms) {
            c = new PolynomToy(this.numberOfTerms);
            for(int i=0;i<a.numberOfTerms;i++){
                c.coef[i] = this.coef[i] + a.coef[i];
            }
            for (int i=a.numberOfTerms;i<this.numberOfTerms;i++){
                c.coef[i] = this.coef[i];
            }
        } else {
            c = new PolynomToy(a.numberOfTerms);
            for(int i=0;i<this.numberOfTerms;i++){
                c.coef[i] = this.coef[i] + a.coef[i];
            }
            for (int i=this.numberOfTerms;i<a.numberOfTerms;i++){
                c.coef[i] = a.coef[i];
            }
        }
        return c;
    }
    
    public PolynomToy sub(PolynomToy a){
        PolynomToy c;
        if (this.numberOfTerms > a.numberOfTerms) {
            c = new PolynomToy(this.numberOfTerms);
            for(int i=0;i<a.numberOfTerms;i++){
                c.coef[i] = this.coef[i] - a.coef[i];
            }
            for (int i=a.numberOfTerms;i<this.numberOfTerms;i++){
                c.coef[i] = this.coef[i];
            }
        } else {
            c = new PolynomToy(a.numberOfTerms);
            for(int i=0;i<this.numberOfTerms;i++){
                c.coef[i] = this.coef[i] - a.coef[i];
            }
            for (int i=this.numberOfTerms;i<a.numberOfTerms;i++){
                c.coef[i] = -(a.coef[i]);
            }
        }
        return c;
    }
    
    public PolynomToy mul(PolynomToy a){
        PolynomToy c = new PolynomToy(this.numberOfTerms + a.numberOfTerms);
        for(int i=0;i<this.numberOfTerms;i++){
            for(int j=0;j<a.numberOfTerms;j++){
                c.coef[i+j] += this.coef[i] * a.coef[j];
            }
        }
        return c;
    }
    
    public double get(double x){
        // Using Horner's Rule
        double sum=0.0;
        for(int i=numberOfTerms-1;i>=0;i--){
            sum *= x;
            sum += coef[i];
        }
        return sum;
    }
    
    public String toString(){
        String str = "";
        boolean allZero = true;
        
        for(int i=numberOfTerms-1;i>=0;i--){
            if (coef[i] != 0) {
                allZero = false;
                str += coef[i];
                if(i!=0) {
                    str += "x";
                    if (i!=1) str += "^" + i;
                    str += " + ";
                }
            }
        }
        if (allZero) return "0";
        return str;
    }
    
    static void test01(){
        // Constructor pertama
        // P = 1.0x^2 + 2.0x^1 + 7.0
        double[] coef = {7.0, 2.0, 1.0};
        PolynomToy t = new PolynomToy(coef);
        System.out.println(t);
    }
    
    static void test02(){
        // Constructor pertama
        // Pengujian untuk add() dan sub()
        // P = 1.0x^2 + 2.0x^1 + 7.0
        double[] coefA = {7.0, 2.0, 1.0};
        double[] coefB = {7.0, 2.0, 1.0};
        PolynomToy a = new PolynomToy(coefA);
        PolynomToy b = new PolynomToy(coefB);
        
        PolynomToy c = a.add(b);
        PolynomToy d = a.sub(b);
        
        // Presentasi
        System.out.println("a \t= "+a);
        System.out.println("b \t= "+b);
        System.out.println("c=a+b\t= "+c);
        System.out.println("d=a-b\t= "+d);
    }
    
    static void test03(){
        // Constructor ketiga
        int[] terms = {9, 4, 2, 0};
        double[] coef = {9.0, 4.0, 2.0, 10.0};
        PolynomToy t = new PolynomToy(terms, coef);
        System.out.println(t);
    }
    
    static void test04(){
        // Constructor pertama
        // Pengujian mul()
        // P = 1.0x^2 + 2.0x^1 + 7.0
        double[] coefA = {7.0, 2.0, 1.0};
        double[] coefB = {7.0, 2.0, 1.0};
        PolynomToy a = new PolynomToy(coefA);
        PolynomToy b = new PolynomToy(coefB);
        
        PolynomToy c = a.mul(b);
        
        // Presentasi
        System.out.println("a \t= "+a);
        System.out.println("b \t= "+b);
        System.out.println("c=a x b\t= "+c);
    }
    
    static void test05(){
        // Constructor pertama
        // P = 1.0x^2 + 2.0x^1 + 7.0
        double[] coef = {7.0, 2.0, 1.0};
        PolynomToy t = new PolynomToy(coef);
        System.out.println(t);
        System.out.println("Nilai P(0.0) = "+t.get(0.0));
        System.out.println("Nilai P(1.0) = "+t.get(1.0));
    }
    
    static void test(){
        //test01();
        //test02();
        //test03();
        //test04();
        test05();
    }
    
    public static void main(String[] args){
        test();
    }
}
