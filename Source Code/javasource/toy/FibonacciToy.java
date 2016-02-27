package toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Object Oriented Software Construction
 *  In subject :  Object as machine
 *  File ini adalah pengerjaan barisan fibonacci sebagaimana biasanya
 *
 *  Teknik yang disarankan Bertrand Meyer, memandang barisan sebagai mesin
 *  ada di file FibonacciToy.java
 */

/*
 * FibonacciToy.java
 *
 * Created on May 20, 2003, 5:31 PM
 */

public class FibonacciToy {
    
    private int number = 1;
    private long prevResult = 0;
    private long result = 1;
    
    /** Creates a new instance of FibonacciToy */
    public FibonacciToy() {
    }
    
    public FibonacciToy(int number)throws Exception {
        for(int i=0;i<number;i++) next();
    }
    
    public void setNumber(int number) throws Exception {
        this.number = number;
        for (int i=0;i<number;i++) next();
    }
    
    public int getNumber() {
        return number;
    }
    
    public long getFibonacci() {
        return result;
    }
    
    public void next() throws Exception {
        if (number==Integer.MAX_VALUE) throw (new Exception("Tidak bisa maju lagi, telah paling atas"));
        number++;
        long temp = result;
        result += prevResult;
        prevResult = temp;
    }
    
    public void prev() throws Exception {
        if(number==0) throw (new Exception("Sudah di nol, tidak bisa mundur"));
        number--;
        
        long temp = result;
        result = prevResult;
        prevResult = temp - prevResult;
    }
    
    static void test(){
        FibonacciToy f = new FibonacciToy();
        for(int i=0;i<10;i++) {
            System.out.println("Fibonacci ke "+i+" : "+f.getFibonacci());
            f.next();
        }
        
        System.out.println("Bergerak mundur");
        for(int i=f.getNumber();i>0;i--) {
            System.out.println("Fibonacci ke "+i+" : "+f.getFibonacci());
            try {
                f.prev();
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) throws Exception{
        test();
    }
    
}
