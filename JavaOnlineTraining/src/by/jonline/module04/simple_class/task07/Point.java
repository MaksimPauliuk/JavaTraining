package by.jonline.module04.simple_class.task07;

/*
 * Точки с координатами.
 */

public class Point {
	private double x;
	private double y;

	public Point() {
		x = 0.0;
		y = 0.0;
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (" + x + ":" + y + ")";
	}
}
