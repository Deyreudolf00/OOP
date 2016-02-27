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
 *   Simulation Modeling & Analysis, chapter 8, page 486
 * Kegunaan :
 *   Waktu yang diperlukan untuk menyelesaikan suatu tugas (kepadatan serupa
 *   dengan kepadatan Gamma), waktu untuk kegagalan suatu perangkat
 */

public class WeibulRandom  extends AbstractRandom  {
    private double fAlpa=1.0;
    private double fBeta=1.0;

    /** Creates a new instance of ExponesialRandom  */
    public WeibulRandom () {
        super();
    }

    public WeibulRandom (double alpa, double beta) {
        super();
        fAlpa = alpa;
        fBeta = beta;
    }

    public WeibulRandom (long seed, double alpa, double beta) {
        super(seed);
        fAlpa = alpa;
        fBeta = beta;
    }

    public Object nextObject() {
        return (new Double(nextWeibul()));
    }

    public double nextWeibul() {
        return (fBeta * (Math.pow(r.nextDouble(), (1/fAlpa))));
    }

    static void demo(){
        System.out.println("Demo WeibulRandom ");

        WeibulRandom  er = new WeibulRandom (0.5, 1.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextWeibul();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 8 == 0) System.out.println();
        }
    }

    public static void main (String[] args) {
        demo();
    }
}
