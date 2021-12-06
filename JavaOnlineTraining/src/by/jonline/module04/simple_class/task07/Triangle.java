package by.jonline.module04.simple_class.task07;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
		a = new Point(0.0, 0.0);
		b = new Point(1.0, 0.0);
		c = new Point(0.0, 2.2);
	}

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	private double calculateSide(Point a, Point b) {
		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}

	public double calculatePerimeter() {
		double sideAB = calculateSide(a, b);
		double sideBC = calculateSide(b, c);
		double sideAC = calculateSide(a, c);

		return sideAB + sideBC + sideAC;
	}

	public double calculateArea() {
		double pp;
		double sideAB = calculateSide(a, b);
		double sideBC = calculateSide(b, c);
		double sideAC = calculateSide(a, c);

		pp = calculatePerimeter() / 2.0;
		return Math.sqrt(pp * (pp - sideAB) * (pp - sideBC) * (pp - sideAC));
	}

	public Point medianIntersectionPoint() {
		// координаты точки пересечения медиан треугольника есть средние
		// арифметические соответствующих координат вершин треугольника
		double x;
		double y;

		x = (a.getX() + b.getX() + c.getX()) / 3;
		y = (a.getY() + b.getY() + c.getY()) / 3;

		return new Point(x, y);
	}
}
