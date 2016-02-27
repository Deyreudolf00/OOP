package abook.afield.physicsToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT C. Thomas Wu, An Introduction to Object
 *         Oriented Programming with Java Page 131, exercise 13
 */

public class YearToy {
	public final double MERCURY = 88d;

	public final double VENUS = 225d;

	public final double JUPITER = 4380d;

	public final double SATURN = 10767d;

	private double year;

	/** Creates a new instance of YearToy */
	public YearToy(double year) {
		this.year = year;
	}

	public double getEarth() {
		return year;
	}

	public double getMercury() {
		return year * 365 / MERCURY;
	}

	public double getVenus() {
		return year * 365 / VENUS;
	}

	public double getJupiter() {
		return year * 365 / JUPITER;
	}

	public double getSaturn() {
		return year * 365 / SATURN;
	}

	public String toString() {
		String str = "Umur \n" + " Di Bumi      = " + getEarth() + " tahun\n"
				+ " Di Merkurius = " + getMercury() + " tahun\n"
				+ " Di Venus     = " + getVenus() + " tahun\n"
				+ " Di Yupiter   = " + getJupiter() + " tahun\n"
				+ " Di Saturnus  = " + getSaturn() + " tahun\n";
		return str;
	}

	static void test() {
		YearToy t = new YearToy(10);
		System.out.println(t);
	}

	public static void main(String[] args) {
		test();
	}
}
