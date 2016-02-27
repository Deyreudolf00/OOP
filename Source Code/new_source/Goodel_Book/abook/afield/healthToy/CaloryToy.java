package abook.afield.healthToy;

/**
 * 
 * @author Bambang Hariyanto,Ir.MT C. Thomas Wu, An Introduction to Object
 *         Oriented Programming with Java Page 131, exercise 10
 */
public class CaloryToy {
	// in pounds
	private double weight;

	/** Creates a new instance of CaloryToy */
	public CaloryToy(double weight) {
		this.weight = weight;
	}

	public double getCalory() {
		return (19 * weight);
	}

	public String toString() {
		String str = "Berat   = " + weight + " pound" + "\n"
				+ "Kebutuhan kalori = " + getCalory();
		return str;
	}

	static void test() {
		System.out.println(new CaloryToy(100.0));
	}

	public static void main(String[] args) {
		test();
	}

}
