package abook.ajava.syntaxToy;

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
public class Constant {
  public final static double PI = 3.1415926535897932384626433832795028841972;
  public final static double E  = 2.7182818284590452353602874713526624977572;

  public final static double SQRT_2  = 1.4142135623730950488016887242096980785697;
  public final static double SQRT_3  = 1.7320508075688772935274463415058723669428;
  public final static double SQRT_5  = 2.2360679774997896964091736687312762354406;
  public final static double SQRT_10 = 3.1622776601683793319988935444327185337196;

  public final static double SQRT3_2 = 1.2599210498948731647672106072782283505703;
  public final static double SQRT3_3 = 1.4422495703074083823216383107801095883919;
  public final static double SQRT4_2 = 1.1892071150027210667174999705604759152930;

  public final static double SQRT5_2 = 1.148698355;
  public final static double SQRT5_3 = 1.245730940;

  public final static double E_PI    = 23.140692632779269006;
  public final static double PI_E    = 22.45915771836104547342715;
  public final static double E_E     = 15.154262241479264190;

  public final static double LOG10_2 = 0.3010299956639811952137389;
  public final static double LOG10_3 = 0.4771212547196624372950279;
  public final static double LOG10_E = 0.43429448190325182765;
  public final static double LOG10_PI= 0.4971498726941338543512683;
  public final static double LN_10   = 2.3025850929940456840179914546843642076011;
  public final static double LN_2    = 0.6931471805599453094172321214581765680755;
  public final static double LN_3    = 1.0986122886681096913952452369225257046475;

  public final static double GAMMA      = 0.5772156649015328606065120900824024310422;
  public final static double E_GAMMA    = 1.7810724179901979852365041031071795491696;
  public final static double SQRT_GAMMA = 1.6487212707001281468;

  public final static double SQRT_PI     = 1.7724538509055160272981674833411451827975;
  public final static double GAMMA_HALF  = 1.7724538509055160272981674833411451827975;
  public final static double GAMMA_1_THIRD   = 2.6789385347077476336556929409746776441287;
  public final static double GAMMA_1_FOURTH  = 3.625609908221908;

  public final static double RAD_TO_DEGREE  = 57.29577951308232;
  public final static double DEGREE_TO_RAD  = 0.0174532925199432957692369076848861271344;

  public final static double GOLDEN  = 1.6180339887498948482045868343656381177203;

  public static void main(String[] args) {
    demo();
  }

  public static void demo() {
    System.out.println("Konstanta PI dari Math.PI = "+Math.PI);
    System.out.println("Konstanta PI dari Knuth   = "+Constant.PI);

    System.out.println("Konstanta E dari Math.E   = "+Math.E);
    System.out.println("Konstanta E dari Knuth    = "+Constant.E);
  }
}
