/*
 * RupiahDistributionToy.java
 *
 * Created on May 21, 2003, 6:22 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 84
 */

public class RupiahDistributionToy {
    
    private long amount = 0;
    
    private long rp100ribu = 0;
    
    private long rp50ribu = 0;
    
    private long rp20ribu = 0;
    
    private long rp10ribu = 0;
    
    private long rp5ribu = 0;
    
    private long rp1ribu = 0;
    
    private long rp500 = 0;
    
    private long rp100 = 0;
    
    private long rp50 = 0;
    
    private long rp25 = 0;
    
    private long rp10 = 0;
    
    private long rp5 = 0;
    
    private long rp1;
    
    /** Creates a new instance of RupiahDistributionToy */
    public RupiahDistributionToy() {
    }
    
    public RupiahDistributionToy(long amount){
        this.amount = amount;
        distributeAmount();
    }
    
   
    public void setAmount(long amount) {
        this.amount = amount;
        distributeAmount();
    }
    
    private void distributeAmount(){
        long t = amount;
        
        rp100ribu = t/100000;
        t -= (rp100ribu * 100000);
        
        rp50ribu = t/50000;
        t -=  (rp50ribu * 50000);
        
        rp20ribu = t/20000;
        t -= (rp20ribu * 20000);
        
        rp10ribu = t/10000;
        t -= (rp10ribu * 10000);
        
        rp5ribu = t/50000;
        t -= (rp5ribu * 5000);
        
        rp1ribu = t/1000;
        t -= (rp1ribu * 1000);
        
        rp500 = t/500;
        t -= (rp500 * 500);
        
        rp100 = t/100;
        t -= (rp100 * 100);
        
        rp50 = t/50;
        t -= (rp50 * 50);
        
        rp25 = t/25;
        t -= (rp25*25);
        
        rp10 = t/10;
        t -= (rp10*10);
        
        rp5 = t/5;
        t -= (rp5*5);
        
        rp1 = t/1;
    }
    
    public long getAmount() {
        return amount;
    }
    
    public long getRp100Ribu() {
        return rp100ribu;
    }
    
    public long getRp50ribu() {
        return rp50ribu;
    }
    
    public long getRp20ribu() {
        return rp20ribu;
    }
    
    public long getRp10ribu() {
        return rp10ribu;
    }
    
    public long getRp5ribu() {
        return rp5ribu;
    }
    
    public long getRp1ribu() {
        return rp1ribu;
    }
    
    public long getRp500() {
        return rp500;
    }
    
    public long getRp100() {
        return rp100;
    }
    
    public long getRp50() {
        return rp50;
    }
    
    public long getRp25() {
        return rp25;
    }
    
    public long getRp10() {
        return rp10;
    }
    
    public long getRp5() {
        return rp5;
    }
    
    public long getRp1() {
        return rp1;
    }
    
    public String toString(){
        String str = 
            "Besar rupiah = "+amount+"\n"+
            "Rp 100.000   = "+rp100ribu+" buah \n"+
            "Rp 50.000    = "+rp50ribu+" buah \n"+
            "Rp 20.000    = "+rp20ribu+" buah \n"+
            "Rp 10.000    = "+rp10ribu+" buah \n"+
            "Rp 5.000     = "+rp5ribu+" buah \n"+
            "Rp 1.000     = "+rp1ribu+" buah \n"+
            "Rp 500       = "+rp500+" buah \n"+
            "Rp 100       = "+rp100+" buah \n"+
            "Rp 50        = "+rp50+" buah \n"+
            "Rp 25        = "+rp25+" buah \n"+
            "Rp 10        = "+rp10+" buah \n"+
            "Rp 5         = "+rp5+" buah \n"+
            "Rp 1         = "+rp1+" buah \n";
        return str;
    }
    
    static void test(){
        RupiahDistributionToy t = new RupiahDistributionToy(1234580);
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
