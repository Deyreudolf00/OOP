package toy;

/**
 * Created on May 17, 2003, 5:37 PM
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Data structures and program design in Pascal
 *  Larry Nyhoff - Sanford Leestma, page 57
 *  Exersize 11 - 13
 */

/*
 * NumberConversionToy.java
 *
 * Created on May 17, 2003, 5:37 PM
 * Toy 1       : Number System - Integral part conversion
 * Description : Konversi dari bagian utuh menjadi suatu basis tertentu
 * Batasan     : Basis >0 dan Basis <= 10
 * Link        : Basis > 10 dibahas di Toy 2
 * Bahasan  :
 * 1. Perbaikan algoritma yang lebih general
 * 2. Parameterisasi - basis bilangan
 * 3. Penggunaan exception handling
 * 4. Perluasan menjadi basis m ke basis n
 *
*/


public class NumberConversionToy {
    
    /** Creates a new instance of NumberConversionToy */
    public NumberConversionToy() {
    }
    
    static void test01(){
        System.out.println("Konversi 0  = "+toBaseN(0,2));
        System.out.println("Konversi 1  = "+toBaseN(1,2));
        System.out.println("Konversi 2  = "+toBaseN(2,2));        
        System.out.println("Konversi 3  = "+toBaseN(3,2));        
        System.out.println("Konversi 4  = "+toBaseN(4,2));
        System.out.println("Konversi 5  = "+toBaseN(5,2));
        System.out.println("Konversi 6  = "+toBaseN(6,2));
        System.out.println("Konversi 7  = "+toBaseN(7,2));
        System.out.println("Konversi 8  = "+toBaseN(8,2));
        System.out.println("Konversi 9  = "+toBaseN(9,2));
        System.out.println("Konversi 10 = "+toBaseN(10,2));
    }
    
    static void test02(){
        try {
            System.out.println("Konversi 10 ke basis 2  = "+decimalToBaseN(10,2));
            System.out.println("Konversi 10 ke basis 3  = "+decimalToBaseN(10,3));
            System.out.println("Konversi 10 ke basis 4  = "+decimalToBaseN(10,4));
            System.out.println("Konversi 10 ke basis 5  = "+decimalToBaseN(10,5));            
            System.out.println("Konversi 10 ke basis 10  = "+decimalToBaseN(10,10));            
            System.out.println("Konversi 10 ke basis -2 = "+decimalToBaseN(10,-2));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan "+e);
        }
    }
    
    static void test03(){
        try {
            System.out.println("Metode baseMToBaseN");
            System.out.println("Konversi 10 basis 2 ke desimal = "+baseMToBaseN("10",10,2));
            System.out.println("Konversi 10 basis 3 ke desimal = "+baseMToBaseN("10",10,3));
            System.out.println("Konversi 10 basis 4 ke desimal = "+baseMToBaseN("10",10,4));
            System.out.println("Konversi 10 basis 5 ke desimal = "+baseMToBaseN("10",10,5));
            System.out.println("Konversi 10 basis 6 ke desimal = "+baseMToBaseN("10",10,6));
            System.out.println("Konversi 10 basis 10 ke desimal = "+baseMToBaseN("10",10,10));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan "+e);
        }
    }
    
    static void test04(){
        try {
            System.out.println("Metode baseMToBaseNAgain");
            System.out.println("Konversi 10 basis 2 ke desimal = "+baseMToBaseNAgain("10",10,2));
            System.out.println("Konversi 10 basis 3 ke desimal = "+baseMToBaseNAgain("10",10,3));
            System.out.println("Konversi 10 basis 4 ke desimal = "+baseMToBaseNAgain("10",10,4));
            System.out.println("Konversi 10 basis 5 ke desimal = "+baseMToBaseNAgain("10",10,5));
            System.out.println("Konversi 10 basis 6 ke desimal = "+baseMToBaseNAgain("10",10,6));
            System.out.println("Konversi 10 basis 10 ke desimal = "+baseMToBaseNAgain("10",10,10));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan "+e);
        }
    }
    
    static void test(){
        // test01
        // test02
        // test03
        test04();
    }
    
    public static void main(String args[]) {
        test();
    }
    
    public static String convertToBase2(int number) {
        int mod2;
        String str = "";
        if (number == 0) return "0";
        if (number == 1) return "1";
        while ((number / 2) != 0) {
            mod2 = number % 2;
            str = mod2 + str;
            number /= 2;
        }
        if (number == 1) str = number + str;
        return str;
    }
    
    public static String toBase2(int number) {
        int mod2;
        String str = "";
        if (number < 2) return ""+number;
        
        while ((number / 2) != 0) {
            mod2 = number % 2;
            str = mod2 + str;
            number /= 2;
        }
        if (number > 0) str = number + str;
        return str;
    }
    
    public static String toBaseN(int number, int baseN) {
        int modN;
        String str = "";
        if (number < baseN) return ""+number;
        
        while ((number / baseN) != 0) {
            modN = number % baseN;
            str = modN + str;
            number /= baseN;
        }
        if (number > 0) str = number + str;
        return str;
    }
    
    public static String decimalToBaseN(int number, int baseN) throws Exception {
        if (baseN<=0) throw (new Exception("Angka basis harus > 0"));
        if (number<0) throw (new Exception("Angka yang dikonversi >=0"));
        int modN;
        String str = "";
        if (number < baseN) return ""+number;
        
        while ((number / baseN) != 0) {
            modN = number % baseN;
            str = modN + str;
            number /= baseN;
        }
        if (number > 0) str = number + str;
        return str;
    }
    
    private static int baseMToDecimal(String nrStr, int baseM) throws Exception {
        int nr=0;
        for (int i=0; i < nrStr.length();i++) {
            String str = "";
            str = nrStr.substring(i,i+1);
            //System.out.println("Nilai str adalah :: "+str);
            nr = (nr * baseM) + Integer.parseInt(str);
        }
        return nr;
    }

    public static String baseMToBaseN(String nrStr, int baseM, int baseN) throws Exception {
        int number =0;
        
        if (baseN<=0) throw (new Exception("Angka basis harus > 0"));
        if (baseM<=0) throw (new Exception("Angka basis harus > 0"));
        try {
            number = baseMToDecimal(nrStr,baseM);
        } catch (Exception e) {
            throw e;
        }
        
        if (number<0) throw (new Exception("Angka yang dikonversi >=0"));
        int modN;
        String str = "";
        if (number < baseN) return ""+number;
        
        while ((number / baseN) != 0) {
            modN = number % baseN;
            str = modN + str;
            number /= baseN;
        }
        if (number > 0) str = number + str;
        return str;
    }

    public static String baseMToBaseNAgain(String nrStr, int baseM, int baseN) throws Exception {
        int number =0;
        
        if (baseN<=0) throw (new Exception("Angka basis harus > 0"));
        if (baseM<=0) throw (new Exception("Angka basis harus > 0"));
        try {
            number = baseMToDecimal(nrStr,baseM);
        } catch (Exception e) {
            throw e;
        }
        
        if (number<0) throw (new Exception("Angka yang dikonversi >=0"));
        return decimalToBaseN(number,baseN);
    }
}
