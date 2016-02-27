package abook.afield.amath.randomToy2;
import java.util.Random;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */
public class RandomDemo {

    static void demo01(){
        System.out.println("Demo nextDouble()");
        Random r = new Random();
        for(int i=0;i<1000;i++){
            System.out.print("Random ke "+i+" : "+r.nextDouble()+"\t");
            if (i % 4 == 0) System.out.println();
        }
    }

    static void demo02(){
        System.out.println("Demo nextLong()");
        Random r = new Random();
        for(int i=0;i<1000;i++){
            System.out.print("Random ke "+i+" : "+r.nextLong()+"\t");
            if (i % 4 == 0) System.out.println();
        }
    }

    static void demo03(){
        System.out.println("Demo nextInt(10)");

        Random r = new Random();
        for(int i=0;i<1000;i++){
            System.out.print("Random ke "+i+" : "+(1+r.nextInt(10))+"\t");
            if (i % 4 == 0) System.out.println();
        }
    }

    static void demo04(){
        System.out.println("Demo nextInt(10L)");
        Random r = new Random();
        for(int i=0;i<1000;i++){
            System.out.print("Random ke "+i+" : "+r.nextInt(10)+"\t");
            if (i % 4 == 0) System.out.println();
        }
    }

    static void demo(){
        // demo01();
        // demo02();
        // demo03();
        demo04();
    }

    public static void main(String[] args){
        demo();
    }
}
