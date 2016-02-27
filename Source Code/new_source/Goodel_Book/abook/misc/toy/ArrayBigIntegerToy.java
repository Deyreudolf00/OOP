package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Data structures and program design in Pascal
 *  Larry Nyhoff - Sanford Leestma, page 75
 *  Exersize 15
 */

/*
 * ArrayBigIntegerToy.java
 *
 * Created on May 18, 2003, 8:11 AM
 */

public class ArrayBigIntegerToy {
    private int[] digits;
    private int length = 0;
    private int modPerCell = 1000;
    
    /** Creates a new instance of ArrayBigIntegerToy */
    public ArrayBigIntegerToy() {
    }
    
    public ArrayBigIntegerToy(int[] digits) throws Exception{
        if (digits == null || digits.length <1) throw (new Exception("Array harus berisi, tidak null"));
        if (digits[0] == 0) throw (new Exception("Digit pertama tidak boleh nol"));
        setDigits(digits);
        length = digits.length;
    }
    
    public ArrayBigIntegerToy(int length){
        this.length = length;
        digits = new int[length];
        for (int i=0;i<length;i++) digits[i] = 0;
    }
    
    public ArrayBigIntegerToy(int length, int modPerCell){
        this.length = length;
        this.modPerCell = modPerCell;
        digits = new int[length];
        for (int i=0;i<length;i++) digits[i] = 0;
    }

    public int getLength() {
        return length;
    }
    
    public ArrayBigIntegerToy add(ArrayBigIntegerToy a){
        ArrayBigIntegerToy t;
        int carry = 0;
        if(a.length > this.length) {
            t = new ArrayBigIntegerToy(a.length+1);
            t.digits[0] = (this.digits[0] + a.digits[0]) % modPerCell;
            carry = (this.digits[0] + a.digits[0]) / modPerCell;
            for (int i=1;i<this.length;i++) {
                t.digits[i] = (this.digits[i] + a.digits[i] + carry) % modPerCell;
                carry = (this.digits[i] + a.digits[i] + carry) / modPerCell;
            }
            for (int i=this.length;i<a.length;i++) {
                t.digits[i] = (a.digits[i] + carry) % modPerCell;
                carry = (a.digits[i] + carry) / modPerCell;
            }
            t.digits[t.digits.length-1] = carry;
        } else {
            t = new ArrayBigIntegerToy(this.length+1);
            t.digits[0] = (this.digits[0] + a.digits[0]) % modPerCell;
            carry = (this.digits[0] + a.digits[0]) / modPerCell;
            for (int i=1;i<a.length;i++) {
                t.digits[i] = (this.digits[i] + a.digits[i] + carry) % modPerCell;
                carry = (this.digits[i] + a.digits[i] + carry) / modPerCell;
            }
            for (int i=a.length;i<this.length;i++) {
                t.digits[i] = (this.digits[i] + carry) % modPerCell;
                carry = (this.digits[i] + carry) / modPerCell;
            }
        };
        
        if (t.digits[t.length-1] == 0) {
           ArrayBigIntegerToy t2 = new ArrayBigIntegerToy(t.length-1);
           for (int i=0;i<t2.length;i++) t2.digits[i] = t.digits[i];
           t = t2;
        }
        return t;
    }
    
    public void printDigits(){
        System.out.print(digits[digits.length-1]);
        if (digits.length >1) {
            for(int i=digits.length-2;i>=0;i--){
                System.out.print(".");
                if (digits[i]==0 ) System.out.print("000");
                else if (digits[i]<10) System.out.print("00");
                else if (digits[i]<100) System.out.print("0");
                if (digits[i] != 0) System.out.print(digits[i]);
            }
        }
        System.out.println();
    }
    
    public String toString(){
        String str = "";
        
        str += digits[digits.length-1];
        if (digits.length >1) {
            for(int i=digits.length-2;i>=0;i--){
                str += ".";
                if (digits[i]==0 ) str += "000";
                else if (digits[i]<10) str += "00";
                else if (digits[i]<100) str += "0";
                if (digits[i] != 0) str += digits[i];
            }
        }
        return str;
    }
        
    static void test01() throws Exception {
        int[] digitsA = {1};
        ArrayBigIntegerToy a = new ArrayBigIntegerToy(digitsA);
        System.out.println("a = "+a);

        int[] digitsB = {1,2};
        ArrayBigIntegerToy b = new ArrayBigIntegerToy(digitsB);
        System.out.println("b = "+b);
        
        int[] digitsC = {1,2,3,4,5,6,7,8,9,0};
        ArrayBigIntegerToy c = new ArrayBigIntegerToy(digitsC);
        System.out.println("c = "+c);
    }

    static void test02() throws Exception {
        int[] digitsA = {179, 534, 672, 198};
        ArrayBigIntegerToy a = new ArrayBigIntegerToy(digitsA);
        System.out.println("a = "+a);
        
        int[] digitsB = {1, 0, 0, 0, 0, 0, 0, 0, 0};
        ArrayBigIntegerToy b = new ArrayBigIntegerToy(digitsB);
        System.out.println("b = "+b);
        
        ArrayBigIntegerToy c = a.add(b); 
        System.out.println("A+B ="+c);
    }
    
    static void test03(){
        try{
            ArrayBigIntegerToy t = new ArrayBigIntegerToy(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    static void test() throws Exception {
        test01();
        test02();
        test03();
    }
    
    public static void main(String[] args) throws Exception{
        test();
    }
    
    private void setDigits(int[] digits) {
        this.digits = new int[digits.length];
        for (int i=0;i<digits.length;i++) this.digits[i] = digits[digits.length-1-i];
    }
    
}
