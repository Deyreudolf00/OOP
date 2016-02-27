/*
 * IncrementalCalculatorToy.java
 *
 * Created on May 17, 2003, 9:48 PM
 */

package toy;

/**
 *
 * @author  unknown
 * Description : Penghitungan incremental seperti berlaku pada pajak, diskon, dsb
 * Batasan     : 
 * Link        : 
 * Bahasan     :
 * 1. Pembacaan dan penegasan spesifikasi
 * 2. Generalisasi dengan tabel
 * Pertanyaan
 * 1. Apakah memang demikian yang dikehendaki, berapakah pajak pendapatan
 *    bagi yang berpenghasilan 1000?
 * 2. Apakah memang memakai Math.floor()?, bagaimana aturan pembulatan yang
 *    dilakukan berdasarkan peraturan yang ada?
 */

public class IncrementalCalculatorToy {
    
    /** Creates a new instance of IncrementalCalculatorToy */
    public IncrementalCalculatorToy() {
    }
    
    static void test01(){
        System.out.println("Pajak untuk 999    = "+calcTax(999));
        System.out.println("Pajak untuk 1000   = "+calcTax(1000));
        System.out.println("Pajak untuk 9999   = "+calcTax(9999));
        System.out.println("Pajak untuk 10000  = "+calcTax(10000));
        System.out.println("Pajak untuk 19999  = "+calcTax(19999));
        System.out.println("Pajak untuk 20000  = "+calcTax(20000));
        System.out.println("Pajak untuk 39999  = "+calcTax(39999));
        System.out.println("Pajak untuk 40000  = "+calcTax(40000));
        System.out.println("Pajak untuk 100000 = "+calcTax(100000));
        System.out.println("Pajak untuk 200000 = "+calcTax(200000));
        System.out.println("Pajak untuk 500000 = "+calcTax(500000));
        System.out.println("Pajak untuk 1000000= "+calcTax(1000000));
    }
    
    static void test02(){
        System.out.println("Pajak untuk 999    = "+betterCalcTax(999));
        System.out.println("Pajak untuk 1000   = "+betterCalcTax(1000));
        System.out.println("Pajak untuk 9999   = "+betterCalcTax(9999));
        System.out.println("Pajak untuk 10000  = "+betterCalcTax(10000));
        System.out.println("Pajak untuk 19999  = "+betterCalcTax(19999));
        System.out.println("Pajak untuk 20000  = "+betterCalcTax(20000));
        System.out.println("Pajak untuk 39999  = "+betterCalcTax(39999));
        System.out.println("Pajak untuk 40000  = "+betterCalcTax(40000));
        System.out.println("Pajak untuk 100000 = "+betterCalcTax(100000));
        System.out.println("Pajak untuk 200000 = "+betterCalcTax(200000));
        System.out.println("Pajak untuk 500000 = "+betterCalcTax(500000));
        System.out.println("Pajak untuk 1000000= "+betterCalcTax(1000000));
    }
    
    static void test03(){
        double[] upper = {1000,10000,20000,40000,100000};
        double[] rate  = {0.0, 0.10, 0.15, 0.20, 0.25, 0.30};
        try {
            System.out.println("Pajak untuk 999    = "+calcIncomeTax(999, upper, rate));
            System.out.println("Pajak untuk 1000   = "+calcIncomeTax(1000, upper, rate));
            System.out.println("Pajak untuk 9999   = "+calcIncomeTax(9999, upper, rate));
            System.out.println("Pajak untuk 10000  = "+calcIncomeTax(10000, upper, rate));
            System.out.println("Pajak untuk 19999  = "+calcIncomeTax(19999, upper, rate));
            System.out.println("Pajak untuk 20000  = "+calcIncomeTax(20000, upper, rate));
            System.out.println("Pajak untuk 39999  = "+calcIncomeTax(39999, upper, rate));
            System.out.println("Pajak untuk 40000  = "+calcIncomeTax(40000, upper, rate));
            System.out.println("Pajak untuk 100000 = "+calcIncomeTax(100000, upper, rate));
            System.out.println("Pajak untuk 200000 = "+calcIncomeTax(200000, upper, rate));
            System.out.println("Pajak untuk 500000 = "+calcIncomeTax(500000, upper, rate));
            System.out.println("Pajak untuk 1000000= "+calcIncomeTax(1000000, upper, rate));
        } catch (Exception e) {
            System.out.println("Kesalahan : "+e);
        }
    }
    
    public static void main(String[] args) {
        test01();
        test02();
        test03();
    }
    
    public static double calcTax(double income) {
    // < 1000                        ==>0%
    // 1000  <= income <10000        ==>10%
    // 10000 <= income <20000        ==>15%
    // 20000 <= income <40000        ==>20%
    // 40000 <= income <100000       ==>25%
    // >= 100000                     ==>30%
        
        double taxIncome;
        if (income < 1000) return 0;
        if (income < 10000){
            double forRate0 = 1000;
            double forRate1 = income - 1000;
            return (Math.floor(0.10*forRate1));
        }
        
        if (income < 20000){
            double forRate0 = 1000;
            double forRate1 = 10000 - 1000;
            double forRate2 = income - 10000;
            // Benarkah demikian?
             return(Math.floor(0.10*forRate1 + 0.15*forRate2));
             
            // Atau, apakah hasilnya berbeda?
            // return (Math.floor(0.10 * forRate1) + MathFloor(0.15 * forRate2));
        }
        
        if (income <40000) {
            double forRate0  = 1000;
            double forRate1 = 10000 - 1000;
            double forRate2 = 20000 - 10000;
            double forRate3 = income - 20000;
            return (Math.floor(0.10*forRate1 + 0.15*forRate2 + 0.20*forRate3));
        }
        
        if (income <100000) {
            double forRate0  = 1000;
            double forRate1 = 10000 - 1000;
            double forRate2 = 20000 - 10000;
            double forRate3 = 40000 - 20000;
            double forRate4 = income - 60000;
            return (Math.floor(0.10*forRate1 + 0.15*forRate2 + 0.20*forRate3 + 0.25*forRate4));
        }
        
        // Hati-hati bukan 
        //  income > 100000
        if (income >=100000) {
            double forRate0  = 1000;
            double forRate1 = 10000 - 1000;
            double forRate2 = 20000 - 10000;
            double forRate3 = 40000 - 20000;
            double forRate4 = 100000 - 40000;
            double forRate5 = income - 100000;
            return (Math.floor(0.10*forRate1 + 0.15*forRate2 + 0.20*forRate3 + 0.25*forRate4 + 0.30*forRate5));
        }
        return 0.0;
    }


    public static double betterCalcTax(double income) {
    // 1000  <= income <10000        ==>10%
    // 10000 <= income <20000        ==>15%
    // 20000 <= income <40000        ==>20%
    // 40000 <= income <100000       ==>25%
    // >= 100000                     ==>30%
        double taxRate[][]= 
        { 
          {1000    ,0.00},
          {10000   ,0.10},
          {20000   ,0.15},
          {40000   ,0.20},
          {100000  ,0.25}
        };
        
        final double HIGHEST_RATE = 0.30;
        double tax = 0.0;
        double forRate[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        
        // Kasus terbawah
        if (income <= taxRate[0][0]) return 0.0;
        
        // Kasus teratas
        if (income > taxRate[4][0]) {
            for (int i=1;i<5;i++) {
                tax += (taxRate[i][0] - taxRate[i-1][0]) * taxRate[i][1];
            }
            tax += (income - taxRate[4][0]) * HIGHEST_RATE;
            return Math.floor(tax);
        }
        
        int highest=1;
        while (highest <5 && income>taxRate[highest][0]) highest++;
        for (int i=1;i<highest;i++) {
            tax += ((taxRate[i][0] - taxRate[i-1][0]) * taxRate[i][1]);
        }
        tax += ((income - taxRate[highest-1][0])*taxRate[highest][1]);
        return Math.floor(tax);
    }
    
    public static double calcIncomeTax(double income, double[] upper, double[] rate) throws Exception {
        if (rate.length != upper.length+1) throw (new Exception("Array rate harus lebih besar"));
        double tax = 0.0;
        double forRate[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        
        // Kasus terbawah
        if (income <= upper[0]) return 0.0;
        
        // Kasus teratas
        if (income > upper[upper.length-1]){
            for (int i=1;i<upper.length;i++) {
                tax += (upper[i] - upper[i-1]) * rate[i];
            }
            tax += (income - upper[upper.length-1]) * rate[rate.length-1];
            return Math.floor(tax);
        }
        
        int highest=1;
        while (highest <upper.length && income>upper[highest]) highest++;
        for (int i=1;i<highest;i++) {
            tax += ((upper[i] - upper[i-1]) * rate[i]);
        }
        tax += ((income - upper[highest-1])*rate[highest]);
        return Math.floor(tax);
    }
}
