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
 *   Simulation Modeling & Analysis, chapter 8, page 490-492
 * Kegunaan
 *   Kesalahan-kesalahan beragam jenis seperti titik akibat dari bom
 */

public class NormalRandom  extends AbstractRandom  {
    private double fMu=1.0;
    private double fSigma =1.0;

    // Variabel antara
    private double fX1 = 0.0;
    private double fX2 = 0.0;
    private boolean fPair = false;

    /** Creates a new instance of ExponesialRandom  */
    public NormalRandom () {
        super();
    }

    public NormalRandom (double mu, double sigma) {
        super();
        fMu = mu;
        fSigma = sigma;
    }

    public NormalRandom (long seed, double mu, double sigma) {
        super(seed);
        fMu = mu;
        fSigma = sigma;
    }

    public Object nextObject() {
        return (new Double(nextNormal()));
    }

    public void setSeed(long seed) {
        r.setSeed(seed);
    }

    public double nextNormal() {
        if (fPair) {
            fPair = false;
            return fX2;
        }
        calcNormalVariatePair();
        return fX1;
    }

    private void calcNormalVariatePair(){
        for(;;){
            double u1 = r.nextDouble();
            double u2 = r.nextDouble();
            double v1 = 2*u1-1;
            double v2 = 2*u2-1;
            double w = v1*v1 + v2*v2;
            if (w<=1) {
                double y=Math.sqrt((-2.0*Math.log(w))/w);
                fX1 = v1 * y;
                fX2 = v2 * y;
                fPair = true;
                return;
            }
        }
    }

    static void demo(){
        System.out.println("Demo NormalRandom ");

        NormalRandom  er = new NormalRandom (0.0, 1.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextNormal();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 6 == 0) System.out.println();
        }
    }

    public static void main (String[] args) {
        demo();
    }
}
