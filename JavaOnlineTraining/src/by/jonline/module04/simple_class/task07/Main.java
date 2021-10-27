package by.jonline.module04.simple_class.task07;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 5), new Point(3, 5));
		
	
		System.out.println("Площадь треуогльника = " + triangle.calculateArea());
		System.out.println("Периметр треугольника = " + triangle.calculatePerimeter());
		System.out.println("Точка пересечения медиан = " + triangle.medianIntersectionPoint());
	}

}
