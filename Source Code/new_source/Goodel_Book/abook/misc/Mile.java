package abook.misc;

public class Mile {
	  public Mile() {
	  }

	  public static void main(String[] args) {
	    demo01();
	    demo02();
	  }


	  public static final double MILE_TO_KM = 1.60935;

	  public void setMile(double mile) {
	    this.mile = mile;
	  }

	  public void setKm(double km) {
	    this.km = km;
	    mile = km / MILE_TO_KM;
	    valid = true;
	  }

	  public double getMile() {
	    return mile;
	  }

	  public double getKm() {
	    return km;
	  }

	  public boolean isValid() {
	    return valid;
	  }

	  private double mile;
	  private double km;
	  private boolean valid = false;
	  /**
	   * Mile
	   *
	   * @param mile double
	   */
	  public Mile(double mile) {
	    this.mile = mile;
	    km = mile * MILE_TO_KM;
	    valid = true;
	  }

	  /**
	   * toString
	   */
	  public String toString() {
	    String str = "";
	    if (valid) {
	      str = mile + " mil = "+ km + " km";
	    }
	    return str;
	  }

	  /**
	   * demo01
	   */
	  public static void demo01() {
	    System.out.println("Demo 01");
	    System.out.println(new Mile(10));
	    System.out.println("Akhir Demo 01");
	  }

	  public static void demo02() {
	    System.out.println("Demo 02");
	    Mile mile = new Mile();
	    mile.setKm(16.0935);
	    System.out.println(mile);
	    System.out.println("Demo 02");
	  }
	}
