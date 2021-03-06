/*
 * TaxServiceToy.java
 *
 * Created on May 23, 2003, 9:30 PM
 */

package abook.misc.toy;
/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 13
 */

public class TaxServiceToy {
    
    private double amount = 0.0;
    
    private double VATRate = 0.0;
    
    private double finalAmount = 0.0;
    
    private double vat = 0.0;
    
    /** Creates a new instance of TaxServiceToy */
    public TaxServiceToy(double amount, double VATRate) {
        this.amount = amount;
        this.VATRate = VATRate;
        
        calc();
    }
    
    private void calc(){
        vat = VATRate * amount;
        finalAmount = amount + vat;
    }
    
    public double getVATRate() {
        return VATRate;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public double getVAT() {
        return vat;
    }
    
    public double getFinalAmount() {
        return finalAmount;
    }
    
    public String toString(){
        String str = 
            "Jumlah     = "+amount+"\n"+
            "Rate PPN   = "+VATRate+"\n"+
            "PPN        = "+vat+"\n"+
            "Total bayar= "+finalAmount;
        return str;
    }
    
    static void test(){
        TaxServiceToy t = new TaxServiceToy(1000, .10);
        System.out.println(t);
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
