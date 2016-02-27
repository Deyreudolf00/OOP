package abook.afield.amath.ag;

public class Point {
	public Point() {
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Point point = new Point(1.0, 2.0);
		System.out.println(point);
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	private double x;

	private double y;

	/**
	 * translate
	 * 
	 * @param a
	 *            double
	 * @param b
	 *            double
	 */
	public void translate(double a, double b) {
		x += a;
		y += b;
	}

	/**
	 * scale
	 * 
	 * @param factor
	 *            double
	 */
	public void scale(double factor) {
		x *= factor;
		y *= factor;
	}

	/**
	 * distance
	 * 
	 * @param p
	 *            Point
	 */
	public double distance(Point p) {
		return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y)
				* (this.y - p.y));
	}

	public String toString() {
		return "(" + x + " , " + y + ")";
	}
}
