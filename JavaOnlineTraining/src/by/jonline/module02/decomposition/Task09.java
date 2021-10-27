package by.jonline.module02.decomposition;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, 
 * если угол между сторонами длиной X и Y— прямой
 */

public class Task09 {

	public static void main(String[] args) {
		
		double X = 10;
		double Y = 5;
		double Z = 5;
		double T = 10;

		System.out.println("Площадь равна " + calculateAreaRectangle(X, Y, Z, T));

	}

	public static double calculateAreaRectangle(double x, double y, double z, double t) {
		
		double diagonal;
		double areaRightTriangle;
		double areaTriangle;

		diagonal = Math.sqrt(x * x + y * y);
		areaRightTriangle = 0.5 * x * y;
		
		// формула Герона
		areaTriangle = 0.25	* Math.sqrt((z + t - diagonal) * (z - t + diagonal) *
				                        (-z + t + diagonal) * (z + t + diagonal));
		
		return areaRightTriangle + areaTriangle;
	}

}
