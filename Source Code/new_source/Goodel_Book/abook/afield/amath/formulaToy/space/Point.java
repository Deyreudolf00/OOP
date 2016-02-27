package abook.afield.amath.formulaToy.space;

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
public class Point {
  public Point() {
  }

  public static void main(String[] args) {
    demo01();
    demo02();
    demo03();
  }

  static void demo01() {
    Point pointA = new Point(10.0, 10.0);
    Point pointB = new Point(20.0, 20.0);

    System.out.println("Demo 01 ");
    System.out.println("Titik A = "+pointA);
    System.out.println("Titik B = "+pointB);
    System.out.println("Jarak A - B = "+calcDistance(pointA, pointB));
    System.out.println("Akhir Demo 01");
  }

  static void demo02() {
    Point pointA = new Point(10.0, 10.0);
    Point pointB = new Point(20.0, 20.0);

    System.out.println("Demo 02 ");
    System.out.println("Titik A = "+pointA);
    System.out.println("Titik B = "+pointB);
    System.out.println("Jarak A - B = "+Point.calcDistance(pointA, pointB));
    System.out.println("Akhir Demo 02");
  }

  static void demo03() {
    Point pointA = new Point(10.0, 10.0);
    Point pointB = new Point(20.0, 20.0);

    System.out.println("Demo 03 ");
    System.out.println("Titik A = "+pointA);
    System.out.println("Titik B = "+pointB);
    System.out.println("Jarak A - B = "+pointA.calcDistance(pointB));
    System.out.println("Akhir Demo 03");
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

  private double x = 0.0;
  private double y = 0.0;
  /**
   * Point
   *
   * @param x double
   * @param y double
   */
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * toString
   */
  public String toString() {
    String str = "";
    str += "("+getX()+","+getY()+")";
    return str;
  }

  /**
   * calcDistance
   *
   * @param point1 Point
   * @param point2 Point
   */
  public static double calcDistance(Point point1, Point point2) {
    return Math.sqrt((point1.x - point2.x)*(point1.x - point2.x) +
                     (point1.y - point2.y)*(point1.y - point2.y));
  }

  /**
   * calcDistance
   *
   * @param point Point
   */
  public double calcDistance(Point point) {
    return Math.sqrt((point.x - this.x)*(point.x - this.x) +
                     (point.y - this.y)*(point.y - this.y));
  }

}
