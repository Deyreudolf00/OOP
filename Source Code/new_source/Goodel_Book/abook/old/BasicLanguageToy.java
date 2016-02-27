/*
 * BasicLanguageToy.java
 *
 * Created on May 25, 2003, 4:30 AM
 */

package abook.old;

/**
 *
 * @author  Bambang Hariyanto,Ir.MT
 */
public class BasicLanguageToy {
    
    /** Creates a new instance of BasicLanguageToy */
    public BasicLanguageToy() {
    }
    
    public static void test(){
        System.out.println("Aliran sekuen:");
        SequenceFlow.flow();
        System.out.println();
        
        System.out.println("Aliran keputusan:");
        IFFlow.flow1(10,2);
        IFFlow.flow2(2,10);
        IFFlow.flow3(10,10);
        
        System.out.println("Aliran berulang:");
        FORFlow.flow1(1,10);
        FORFlow.flow2();
        FORFlow.flow3();
        
        WHILEFlow.flow1();
        WHILEFlow.flow2();
        WHILEFlow.flow3();
    }
    
    public static void main(String[] args) {
        test();
    }
}

class SequenceFlow {
    static void flow(){
        System.out.println("Kalimat 1, diikuti langsung dengan ");
        System.out.println("Kalimat 2, diikuti langsung dengan ");
        System.out.println("Kalimat 3, diikuti langsung dengan ");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Kalimat n");
    }
}

class IFFlow {
    static void flow1(int a, int b){
        System.out.println("a = "+a+"   b ="+b);
        if (a>b) {
            System.out.println("a lebih besar daripada b");
        }
    }

    static void flow2(int a, int b){
        System.out.println("a = "+a+"   b ="+b);
        if (a>b) {
            System.out.println("a lebih besar daripada b");
        } else {
            System.out.println("a tidak lebih besar daripada b");
        }
    }

    static void flow3(int a, int b){
        System.out.println("a = "+a+"   b ="+b);
        if (a>b) {
            System.out.println("a lebih besar daripada b");
        } else if (a==b) {
            System.out.println("a sama dengan b");
        } else {
            System.out.println("a lebih kecil daripada b");
        }
    }
}

class FORFlow{
    static void flow1 (int theFrom, int theTo) {
        for (int i=theFrom;i<theTo+1;i++) {
	    System.out.println("Bilangan ke : "+i);
	}
    }
    
    static void flow2(){
        int i=0;
        for(;;){
            System.out.println("Bilangan ke :"+i);
            i++;
            if (i==20) break;
        }
    }
    
    static void flow3(){
        int i=0;
        int j=0;
        
        for(i=0;i<20;i++,j+=3){
            System.out.println("Bilangan i = "+i+" Bilangan j = "+j);
        }
    }
}

class WHILEFlow{
    static void flow1(){
        int i=0;
        while(i<10){
            System.out.println("Bilangan i ="+i);
            i++;
        }
    }
    
    static void flow2(){
        int i=0;
        while (true){
            System.out.println("Bilangan i ="+i);
            i++;
            if(i==20) break;
        }
    }
    
    static void flow3(){
        System.out.println("continue");
        int i=0;
        while (true){
            i++;
            if(i==20) break;
            if(i % 4 == 0) continue;
            System.out.println("Bilangan i="+i);
        }
    }
}