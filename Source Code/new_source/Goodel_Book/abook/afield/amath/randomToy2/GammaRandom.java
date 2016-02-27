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
 *   Simulation Modeling & Analysis, chapter 8, page 487-490
 * Kegunaan :
 *   Waktu yang diperlukan untuk menyelesaikan suatu tugas, milsanya
 *   pelayanan terhadap customer atau perbaikan mesin
 */

public class GammaRandom  extends AbstractRandom  {
    private double fAlpa=0.0;
    private double fBeta=0.0;

    // Variabel antara alpa > 1.0
    private double fA = 0.0;
    private double fB = 0.0;
    private double fQ = 0.0;
    private double fTeta = 0.0;
    private double fD = 0.0;

    /** Creates a new instance of ExponesialRandom  */
    public GammaRandom () {
        super();
        if (fAlpa > 1.0)
            calcHelpersForAlpaMoreThanOne();
        else if ((fAlpa < 1.0))
            calcHelpersForAlpaLessThanOne();
    }

    public GammaRandom (double alpa, double beta) {
        super();
        fAlpa = alpa;
        fBeta = beta;
        if (fAlpa > 1.0)
            calcHelpersForAlpaMoreThanOne();
        else if ((fAlpa < 1.0))
            calcHelpersForAlpaLessThanOne();
    }

    public GammaRandom (long seed, double alpa, double beta) {
        super(seed);
        fAlpa = alpa;
        fBeta = beta;
        if (fAlpa > 1.0)
            calcHelpersForAlpaMoreThanOne();
        else if ((fAlpa < 1.0))
            calcHelpersForAlpaLessThanOne();
    }

    private void calcHelpersForAlpaMoreThanOne() {
        fA = 1.0/(Math.sqrt(2.0*fAlpa-1.0));
        fB = fAlpa - Math.log(4.0);
        fQ = fAlpa + (1.0/fA);
        fTeta = 4.5;
        fD = 1.0 + Math.log(fTeta);
    }

    private void calcHelpersForAlpaLessThanOne(){
        fB = (Math.E+fAlpa)/Math.E;
    }

    public Object nextObject() {
        return (new Double(nextGamma()));
    }

    public double nextGamma() {
        if (fAlpa > 1.0)
            return calcForAlpaMoreThanOne();
        if (fAlpa < 1.0)
            return calcForAlpaLessThanOne();
        if (fAlpa == 1.0)
            return calcForAlpaEqualsOne();
        return 0.0;
    }

    private double calcForAlpaLessThanOne(){
        for(;;){
            double u1 = r.nextDouble();
            double p = fB * u1;
            if (p > 1.0){
                double y = -(Math.log((fB-p)/fAlpa));
                double u2 = r.nextDouble();
                if (u2 <= Math.pow(y,fAlpa-1))
                    return y;
            } else {
                double y = Math.pow(p, 1/fAlpa);
                double u2 = r.nextDouble();
                if (u2 <= Math.pow(Math.E,-y))
                    return y;
            }
        }
    }

    private double calcForAlpaEqualsOne(){
        // Sama dengan eksponensial dengan mean=1
        return ((-1.0) * Math.log(r.nextDouble()));
    }

    private double calcForAlpaMoreThanOne(){
        for(;;){
            double u1 = r.nextDouble();
            double u2 = r.nextDouble();
            double v = fA * Math.log(u1/(1-u1));
            double y = fAlpa * Math.pow(Math.E,v);
            double z = u1 * u1 * u2;
            double w = fB + fQ*v - y;

            if ((w+fD-fTeta*z)>=0.0)
                return y;
            if(w>=Math.log(z))
                return y;
        }
    }

    static void demo01(){
        System.out.println("Demo GammaRandom ");

        GammaRandom  er = new GammaRandom (1.0, 1.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextGamma();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 8 == 0) System.out.println();
        }
    }

    static void demo02(){
        System.out.println("Demo GammaRandom ");

        GammaRandom  er = new GammaRandom (1.1, 1.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextGamma();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 8 == 0) System.out.println();
        }
    }

    static void demo03(){
        System.out.println("Demo GammaRandom ");

        GammaRandom  er = new GammaRandom (0.5, 1.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextGamma();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 8 == 0) System.out.println();
        }
    }

    static void demo(){
        // demo01();
        // demo02();
        demo03();
    }

    public static void main (String[] args) {
        demo();
    }
}
