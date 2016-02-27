package abook.afield.geographyToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT C. Thomas Wu, An Introduction to Object
 *         Oriented Programming with Java Page 136, exercise 22
 */

public class PopulationToy {
	private double c;

	private double k;

	private double x;

	/** Creates a new instance of PopulationToy */
	public PopulationToy(double c, double k, double x) {
		this.c = c;
		this.k = k;
		this.x = x;
	}

	public double getPopulation() {
		return (c * Math.exp(k * x));
	}

	public String toString() {
		String str = "Populasi \n" + "  C = " + c + "\n" + "  k = " + k + "\n"
				+ "  x = " + x + "\n" + "  y = " + getPopulation();
		return str;
	}

	static void test() {
		PopulationToy t = new PopulationToy(1000000d, 0.03466, 30);
		System.out.println(t);
	}

	public static void main(String[] args) {
		test();
	}

}
