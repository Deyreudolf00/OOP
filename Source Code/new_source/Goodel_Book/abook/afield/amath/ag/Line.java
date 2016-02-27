package abook.afield.amath.ag;

public class Line {
	public Line() {
	}

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	public static void main(String[] args) {
		Line line = new Line(1.0, 1.0, 4.0, 5.0);
		System.out.println(line);
		System.out.println("Panjang garis : " + line.length());
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	private Point p1;

	private Point p2;

	/**
	 * scale
	 * 
	 * @param factor
	 *            double
	 */
	public void scale(double factor) {
		p1.scale(factor);
		p2.scale(factor);
	}

	/**
	 * translate
	 * 
	 * @param a
	 *            double
	 * @param b
	 *            double
	 */
	public void translate(double a, double b) {
		p1.translate(a, b);
		p2.translate(a, b);
	}

	/**
	 * distance
	 * 
	 * @param p
	 *            Point
	 */
	public double distance(Point p) {
		// TODO:
		return 0.0;
	}

	/**
	 * distance
	 * 
	 * @param l
	 *            Line
	 */
	public double distance(Line l) {
		// TODO:
		return 0.0;
	}

	public String toString() {
		return "[" + p1 + " - " + p2 + "]";
	}

	/**
	 * length
	 */
	public double length() {
		return p1.distance(p2);
	}
}
