/*
 * PhytagoreanTripletToy.java
 *
 * Created on May 18, 2003, 2:50 PM
 */

package abook.misc.toy;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Java : How to Program
 *  Deitel Deitel, page 213, exercise 5.17
 */

public class PhytagoreanTripletToy {
    
    private int number=0;
    private int numberOfTriplet=0;
    final int MAX_OF_TRIPLETS = 100;
    
    private int[] tripletA = new int[MAX_OF_TRIPLETS];
    private int[] tripletB = new int[MAX_OF_TRIPLETS];
    private int[] tripletC = new int[MAX_OF_TRIPLETS];
    
    /** Creates a new instance of PhytagoreanTripletToy */
    public PhytagoreanTripletToy(int number){
        this.number = number;
        bruteForce();
    }
    
    public int getNumberOfTriplet(){
        return numberOfTriplet;
    }
    
    public int getNumber() {
        return number;
    }
    
    public void bruteForce() {
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number;j++){
                for(int k=1;k<=number;k++){
                    if(i*i == (j*j + k*k)) {
                        tripletA[numberOfTriplet] = i;
                        tripletB[numberOfTriplet] = j;
                        tripletC[numberOfTriplet] = k;
                        numberOfTriplet++;
                        if (numberOfTriplet == MAX_OF_TRIPLETS) return;
                    }
                }
            }
        }
    }
    
    public String toString() {
        String str="";
        for(int i=0;i<numberOfTriplet;i++)
            str += tripletA[i]+"\t"+tripletB[i]+"\t"+tripletC[i]+"\n";
        return str;
    }

    static void test(){
        System.out.println(new PhytagoreanTripletToy(10));
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
