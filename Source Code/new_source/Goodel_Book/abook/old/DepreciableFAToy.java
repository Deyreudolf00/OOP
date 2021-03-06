/*
 * DepreciableFAToy.java
 *
 * Created on May 23, 2003, 10:03 PM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Theory and problems of programming with Pascal
 *  Byron S. Gottriied, page 106
 *
 * Modification
 * 1. Deprecation is viewed as machine
 * 2. Using delegation 
 */

public class DepreciableFAToy {
    private double origin = 0.0;   
    private double value = 0.0;
    private double deprec = 0.0;
    private int nrOfYear = 0;
    private int year = 0;
    
    DepreciationMethod dm;
    
    /** Creates a new instance of DepreciableFAToy */
    public DepreciableFAToy(double origin, int nrOfYear, DepreciationMethod dm) throws Exception{
        this.origin = origin;
        this.nrOfYear = nrOfYear;
        this.value = origin;
        this.dm = dm;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getValue() {
        return value;
    }
    
    public double getDeprec() {
        return deprec;
    }
    
    public int getNumberOfYear() {
        return nrOfYear;
    }
    
    public String toString(){
        String str =
            "Akhir tahun "+year+" Depresiasi = "+deprec+". Nilai sekarang : "+value;
        return str;
    }
    
    public void next() throws Exception{
        year++;
        deprec = dm.calcDeprec(origin, value, nrOfYear, year);
        value -= deprec;
    }
    
    static void test(){
        StraightLineMethod dm = new StraightLineMethod();
        DepreciableFAToy t = new DepreciableFAToy(8000,10,dm);
        
        for(int i=0;i<10;i++){
            System.out.println(t);
            t.next();
        }
    }
    
    public static void main(String[] args) throws Exception{
        test();
    }
}


abstract class DepreciationMethod{
    abstract double calcDeprec(double origin, double value, int nrOfYear, int year) throws Exception;
}

class StraightLineMethod extends DepreciationMethod {
    double calcDeprec(double origin, double value, int nrOfYear, int year) throws Exception{
        if (nrOfYear == 0) throw (new Exception("Jumlah tahun tidak boleh nol"));
        return origin/nrOfYear;
    }
}

class DoubleDecliningBalanceMethod extends DepreciationMethod {
    double calcDeprec(double origin, double value, int nrOfYear, int year) throws Exception{
        if (nrOfYear == 0) throw (new Exception("Jumlah tahun tidak boleh nol"));
        return (2*origin)/nrOfYear;
    }
}

class SumOfTheYearsDigitMethod extends DepreciationMethod {
    double calcDeprec(double origin, double value, int nrOfYear, int year) throws Exception{
        if (nrOfYear == 0) throw (new Exception("Jumlah tahun tidak boleh nol"));
        
        double deprec=0.0;
        for(int i=1;i<=year;i++){
            deprec = (nrOfYear-i+1)*origin/(nrOfYear*(nrOfYear+1)/2);
        }
        return deprec;
    }
}