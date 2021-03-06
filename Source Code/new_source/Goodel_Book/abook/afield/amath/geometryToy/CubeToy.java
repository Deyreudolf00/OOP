package abook.afield.amath.geometryToy;

public class CubeToy {

	private double side = 0;

	/** Creates a new instance of CubeToy */
	public CubeToy() {
	}

	public CubeToy(double side) {
		this.side = side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	public double getCircumference() {
		return calcCircumference();
	}

	public double getArea() {
		return calcArea();
	}

	public double getVolume() {
		return calcVolume();
	}

	private double calcCircumference() {
		return (12 * this.side);
	}

	private double calcArea() {
		return (6 * this.side * this.side);
	}

	private double calcVolume() {
		return (side * side * side);
	}

	static void test() {
		CubeToy c = new CubeToy(10);
		System.out.println(c);
	}

	public static void main(String[] args) {
		test();
	}

	public String toString() {
		String str = "Kubus " + "\n" + "Panjang sisi = " + side + "\n"
				+ "Keliling     = " + calcCircumference() + "\n"
				+ "Luas         = " + calcArea() + "\n" + "Volume       = "
				+ calcVolume() + "\n";
		return str;
	}
}
