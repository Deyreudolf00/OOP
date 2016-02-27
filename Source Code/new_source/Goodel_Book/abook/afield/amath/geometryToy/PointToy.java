package abook.afield.amath.geometryToy;

public class PointToy {
	private double x, y;

	/** Creates a new instance of PointToy */
	public PointToy() {
		x = 0.0;
		y = 0.0;
	}

	public PointToy(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public PointToy(PointToy p) {
		x = p.x;
		y = p.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void moveBy(double dX, double dY) {
		x = x + dX;
		y = y + dY;
	}

	public void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return ("x = " + x + " y = " + y);
	}

	static void test() {
		System.out.println(new PointToy(2.0, 3.0));
	}

	public static void main(String args[]) {
		test();
	}
}
