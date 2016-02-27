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
public class BetaRandom  extends AbstractRandom  {
    private double fAlpa=1.0;
    private double fAlpa2=1.0;

    // Variabel antara
    private GammaRandom  fGamma1;
    private GammaRandom  fGamma2;

    /** Creates a new instance of ExponesialRandom  */
    public BetaRandom () {
        fGamma1 = new GammaRandom (fAlpa, 1.0);
        fGamma2 = new GammaRandom (fAlpa2, 1.0);
    }

    public BetaRandom (double alpa, double alpa2) {
        fAlpa = alpa;
        fAlpa2 = alpa2;
        fGamma1 = new GammaRandom (fAlpa, 1.0);
        fGamma2 = new GammaRandom (fAlpa2, 1.0);
    }

    public BetaRandom (long seed, long seed2, double alpa, double alpa2) {
        fAlpa = alpa;
        fAlpa2 = alpa2;
        fGamma1 = new GammaRandom (seed, fAlpa, 1.0);
        fGamma2 = new GammaRandom (seed2, fAlpa2, 1.0);
    }

    public Object nextObject() {
        return (new Double(nextBeta()));
    }

    public double nextBeta() {
        double y1 = fGamma1.nextGamma();
        double y2 = fGamma2.nextGamma();

        return (y1/(y1+y2));
    }

    public void setSeed(long seed) {
        fGamma1.setSeed(seed);
    }

    public void setSeed2(long seed) {
        fGamma2.setSeed(seed);
    }

    static void demo(){
        System.out.println("Demo BetaRandom ");

        BetaRandom  er = new BetaRandom (0.5, 5.0);
        er.setSeed(100);
        for(long i=0;i<100;i++){
            double nr = er.nextBeta();
            System.out.print(": "+i+" : "+nr+"\t");
            if (i % 8 == 0) System.out.println();
        }
    }

    public static void main (String[] args) {
        demo();
    }
}
