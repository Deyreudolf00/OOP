package abook.misc;

/**
*
* @author  Bambang Hariyanto,Ir.MT
* Inspired by :
*  C++ Program Design : An Introduction to Programming and Object Oriented Design
*  James P Cohon dan Jack W Davidson, page 363-380
*  In subject :  Object as machine
*
*/
public class FractionToy {
   private int num;
   private int denom;
   
   // Class invariant
   // inv: denom > 0
   
   // Constructor
   public FractionToy (int num, int denom) throws IllegalArgumentException {
       // Precondition
       // Pre : denom != 0
       
       if (denom == 0) 
           throw new IllegalArgumentException("Penyebut bernilai nol");
       
       int t = gcd(num, denom);
       if (denom < 0) {
           num = -1 * num;
           denom = -1 * denom;
       }      
           
       this.num = num / t;
       this.denom = denom / t;
       
       // Postcondition
       // Post : num = old::num/gcd(old::num, old::denom)
       // Post : denom > 0
       // Post : denom = old::denom/gcd(old::num, old::denom)
   }
   
   public FractionToy (FractionToy t) {
	// Precondition
       // Pre : -
       
       num = t.num;
       denom = t.denom;
       
       // Postcondition
       // Post : num = t.num
       // Post : denom = t.denom
   }
   
   private boolean invariant () {
       return denom > 0;
   }
   
   // Computation operations
   public FractionToy add(FractionToy f)
   {
	// Precondition
       // Pre : -
       
       int tNum = (num * f.denom) + (f.num * denom);
       int tDenom = denom * f.denom;

       return (new FractionToy(tNum, tDenom));
       // Postcondition
       // add_definition result = 
   }
   
   public FractionToy mul(FractionToy f) {
       
       int tNum = num * f.num;
       int tDenom = denom * f.denom;
       
       return (new FractionToy(tNum, tDenom));
   }

   public String toString () {
       // Precondition
       return num + "/" + denom;
       // Postcondition
   }

   static void testAdd() {
       System.out.println("Penjumlahan Bilangan Pecahan");
       FractionToy a = new FractionToy(2,3);
       FractionToy b = new FractionToy(4,6);
       FractionToy c = a.add(b);
       
       System.out.println(a);
       System.out.println(b);
       System.out.println(a+" + "+b+" = "+c);
   }
   
   static void testMul() {
       System.out.println("Perkalian Bilangan Pecahan");
       FractionToy a = new FractionToy(4,3);
       FractionToy b = new FractionToy(3,4);
       FractionToy c = a.mul(b);
       
       System.out.println(a);
       System.out.println(b);
       System.out.println(a+" + "+b+" = "+c);
   }
   
   private void setDenom(int denom) {
       this.denom = denom;
       assert invariant(): "Penyebut harus lebih besar 0";
   }
   
   static void testNol() {
       FractionToy a;
       System.out.println("Percobaan nol ");
       try {
           a = new FractionToy(4,0);
       } catch (Exception e) {
           System.out.println(e);
       }
       
       try {
           a = new FractionToy(4,4);
           a.setDenom(-4);
       } catch (Exception e) {
           System.out.println("Masuk ***");
           System.out.println(e);
       }
       
   }
   
   static void test(){
	System.out.println("Aplikasi Aritmatika Bilangan Pecahan");
       testAdd();
       testMul();
       testNol();
   }
   
   public static void main (String args[]) {
       test();
   }

   private static int gcd(int m, int n) {
       // Precondition
       // Pre : n != 0
       int t;
       
       m = Math.abs(m);
       n = Math.abs(n);
       
       while ((m % n) != 0) {
           t = m;
           m = n;
           n = t % n;
       }
       
       return n;
       // Postcondition
       // gcd_definition : result = gcd(abs(m), abs(n))
   }
}
