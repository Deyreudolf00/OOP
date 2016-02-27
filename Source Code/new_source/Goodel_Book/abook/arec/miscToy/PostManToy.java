package abook.arec.miscToy;

/**
 * Created on May 17, 2003, 5:37 PM
 *
 * @author  Bambang Hariyanto,Ir.MT
 * Inspired by :
 *  Data structures and program design in Pascal
 *  Larry Nyhoff - Sanford Leestma, page 75
 *  Exersize 14
 */

/*
 * PostManToy.java
 *
 * Created on May 18, 2003, 2:16 AM
 */
public class PostManToy {
    
    private static boolean onOff[] = new boolean[150];
    final static int ADJUST = 1;
    
    /** Creates a new instance of PostManToy */
    public PostManToy() {
    }
    
    public static void initOnOff() {
        System.out.println("Inisialsasi: ");
        for (int i=1-ADJUST;i<150;i++) onOff[i] = false;
    }
    
    public static void doAnyThing() {
        System.out.println("Do Anything: Tunggulah");
        for (int i=1-ADJUST;i<150;i++) {
            System.out.println("Pass : "+i);
            for (int j=i;j<150;j+=i+ADJUST) {
                onOff[j] = !onOff[j];
            }
        }
    }
    
    public static void reportResult() {
        System.out.println("Hasil :");
        for(int i=1-ADJUST;i<150;i++) {
            if (onOff[i]) System.out.println(" | " + (i+ADJUST));
        }
    }
    
    static void test(){
        initOnOff();
        doAnyThing();
        reportResult();
    }
    
    public static void main(String[] args) {
        test();
    }
    
}
