
package abook.old;

/**
 * Created on May 17, 2003, 5:37 PM
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Data structures and program design in Pascal
 *  Larry Nyhoff - Sanford Leestma, page 57
 *  Exersize 14
 */

/*
 * FractionConversionToy.java
 *
 * Created on May 17, 2003, 8:11 PM
 * Toy 2       : Number System
 * Description : Konversi dari bagian pecahan menjadi suatu basis tertentu
 *               Basis dapat lebih dari 10, kurang dari 21
 * Batasan     : 
 * Link        : Basis lebih dari 10 dibahas di Toy 2
 * Bahasan     :
 * 1. Parameterisasi
 * 2. Exception handling - ditempatkan di awal, untuk menguji prakondisi
 * 3. Overloading
 * 4. Pemilihan antarmuka
 *    - Jangan campurkan antara format keluaran dengan komputasi
 *    - Mode apakah akan penulisan bahasa Inggris atau Indonesia 
 *    - Diserahkan pada formatter yang dapat dibuat lebih general
 *    - Yang terpenting adalah buat dengan suatu spesifikasi tertentu
 * 5. Cari cara termudah
 *    - Bukan pakai substring, gunakan lebih dulu casting
 * 6. Perluasan sehingga dapat menangani basis sampai <21
 *   
*/

public class FractionConversionToy {
    
    /** Creates a new instance of FractionConversionToy */
    public FractionConversionToy() {
    }
    
    static void test(){
        try{
            System.out.println("Desimal 0,0 untuk basis 2 adalah "+fractionToBaseN(0.0, 2,'I'));
            System.out.println("Desimal 0,5 untuk basis 2 adalah "+fractionToBaseN(0.5, 2,'I'));
            System.out.println("Desimal 0,6875 untuk basis 2 adalah "+fractionToBaseN(0.6875, 2));
            System.out.println("Desimal 0,7 untuk basis 2 adalah "+fractionToBaseN(0.7, 2));

            System.out.println("Desimal 0,0 untuk basis 3 adalah "+fractionToBaseN(0.0, 3,'I'));
            System.out.println("Desimal 0,5 untuk basis 3 adalah "+fractionToBaseN(0.5, 3,'I'));
            System.out.println("Desimal 0,6875 untuk basis 3 adalah "+fractionToBaseN(0.6875, 3));
            System.out.println("Desimal 0,7 untuk basis 3 adalah "+fractionToBaseN(0.7, 3));
            
            System.out.println("Desimal 0,0 untuk basis 4 adalah "+fractionToBaseN(0.0, 4,'I'));
            System.out.println("Desimal 0,5 untuk basis 4 adalah "+fractionToBaseN(0.5, 4,'I'));
            System.out.println("Desimal 0,6875 untuk basis 4 adalah "+fractionToBaseN(0.6875, 4));
            System.out.println("Desimal 0,7 untuk basis 4 adalah "+fractionToBaseN(0.7, 4));
            
            System.out.println("Desimal 0,3 untuk basis 2 adalah ."+fractionToBaseN(0.3, 2,5));
            System.out.println("Desimal 0,3 untuk basis 2 adalah ."+fractionToBaseN(0.3, 2,10));
            System.out.println("Desimal 0,3 untuk basis 2 adalah ."+fractionToBaseN(0.3, 2,20));
            System.out.println("Desimal 0,3 untuk basis 2 adalah ."+fractionToBaseN(0.3, 2,25));
            System.out.println("Desimal 0,3 untuk basis 2 adalah ."+fractionToBaseN(0.3, 2,50));

            System.out.println("Desimal 0,3 untuk basis 16 adalah ."+fractionToBaseNAgain(0.3, 16,5));
            System.out.println("Desimal 0,3 untuk basis 16 adalah ."+fractionToBaseNAgain(0.3, 16,10));
            System.out.println("Desimal 0,3 untuk basis 16 adalah ."+fractionToBaseNAgain(0.3, 16,20));
            System.out.println("Desimal 0,3 untuk basis 16 adalah ."+fractionToBaseNAgain(0.3, 16,25));
            System.out.println("Desimal 0,3 untuk basis 16 adalah ."+fractionToBaseNAgain(0.3, 16,50));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        test();
    }
    
    public static String fractionToBaseN(double number, int baseN) throws Exception {
        if (baseN <1) throw (new Exception("basis harus >0"));
        
        final int PRECISION = 10;
        int itr = 0;
        String str = "0,";
        
        while (itr < PRECISION && number != 0.0) {
            number = number * baseN;
            if (number >= 1) {
                String strTemp = ""+Math.floor(number);
                strTemp = strTemp.substring(0,strTemp.indexOf('.'));
                str = str + strTemp;
                number = number - Math.floor(number);
            } else {
                str = str + "0";
            }
            itr++;
        }
        if (itr == 0) return str+"0";
        return str;
    }

    public static String fractionToBaseN(double number, int baseN, char mode) throws Exception {
        if (baseN <1) throw (new Exception("basis harus >0"));
        
        final int PRECISION = 10;
        int itr = 0;
        String str = "";
        if (mode == 'I') str = "0,";
        else str = "0.";
        
        while (itr < PRECISION && number != 0.0) {
            number = number * baseN;
            if (number >= 1) {
                String strTemp = ""+Math.floor(number);
                strTemp = strTemp.substring(0,strTemp.indexOf('.'));
                str = str + strTemp;
                number = number - Math.floor(number);
            } else {
                str = str + "0";
            }
            itr++;
        }
        if (itr == 0) return str+"0";
        return str;
    }

    public static String fractionToBaseN(double number, int baseN, char mode, int numberOfPrec) throws Exception {
        if (baseN <1) throw (new Exception("basis harus >0"));
        if (numberOfPrec < 1 && numberOfPrec >100) throw (new Exception ("Presisi tidak sah"));
        
        int itr = 0;
        String str = "";
        if (mode == 'I') str = "0,";
        else str = "0.";
        
        while (itr < numberOfPrec && number != 0.0) {
            number = number * baseN;
            if (number >= 1) {
                String strTemp = ""+Math.floor(number);
                strTemp = strTemp.substring(0,strTemp.indexOf('.'));
                str = str + strTemp;
                number = number - Math.floor(number);
            } else {
                str = str + "0";
            }
            itr++;
        }
        if (itr == 0) return str+"0";
        return str;
    }

    public static String fractionToBaseN(double number, int baseN, int numberOfPrec) throws Exception {
        if (baseN <1) throw (new Exception("basis harus >0"));
        if (numberOfPrec < 1 && numberOfPrec >100) throw (new Exception ("Presisi tidak sah"));
        
        int itr = 0;
        String str = "";
        
        while (itr < numberOfPrec && number != 0.0) {
            number = number * baseN;
            if (number >= 1) {
                int intPart = (int)Math.floor(number);
                str = str + intPart;
                number = number - Math.floor(number);
            } else {
                str = str + "0";
            }
            itr++;
        }
        if (itr == 0) return str+"0";
        return str;
    }

    private static String decToBaseN(int number, int baseN) throws Exception {
        if (baseN <1 && baseN >10) throw (new Exception ("Basis harus >0 dan <21"));
        char ch[] = {'A','B','C','D','E','F','G','H','I','J','K'};
        
        switch (number) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 : return ""+number;
            default : return ""+ch[number-10];
        }
    }
    
    public static String fractionToBaseNAgain(double number, int baseN, int numberOfPrec) throws Exception {
        if (baseN <1) throw (new Exception("basis harus >0"));
        if (numberOfPrec < 1 && numberOfPrec >100) throw (new Exception ("Presisi tidak sah"));
        
        int itr = 0;
        String str = "";
        
        while (itr < numberOfPrec && number != 0.0) {
            number = number * baseN;
            if (number >= 1.0) {
                try {
                    int intPart = (int)Math.floor(number);
                    str = str + decToBaseN(intPart, baseN);
                } catch (Exception e) {
                    throw e;
                }
                number = number - Math.floor(number);
            } else {
                str = str + "0";
            }
            itr++;
        }
        if (itr == 0) return str+"0";
        return str;
    }
}
