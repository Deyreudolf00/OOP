package abook.afield.amath.randomToy2;

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

/**
 * @version 0.1
 * @author Bambang Hariyanto
 * Inspired by :
 *   Averill M. Law & W. David Kelton
 *   Simulation Modeling & Analysis, chapter 8, page 486-487
 */

public class ErlangRandom  extends AbstractRandom  {
    private double fBeta=1.0;
    private int fM = 1;

    /** Creates a new instance of ExponesialRandom  */
    public ErlangRandom () {
        super();
    }

    public ErlangRandom (int m, double beta) {
        super();
        fM = m;
        fBeta = beta;
    }

    public ErlangRandom (long seed, int m, double beta) {
        super(seed);
        fM = m;
        fBeta = beta;
    }

    public Object nextObject() {
        return (new Double(nextErlang()));
    }

    public double nextErlang() {
        double totalMul = 1.0;
        for(int i=0;i<fM;i++)
            totalMul *= r.nextDouble();

        return ((-fBeta/fM) * Math.log(totalMul));
    }


    static void demo(){
        System.out.println("Demo ErlangRandom ");

        ErlangRandom  er = new ErlangRandom (5, 1.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextErlang();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 8 == 0) System.out.println();
        }
    }

    public static void main (String[] args) {
        demo();
    }
}
