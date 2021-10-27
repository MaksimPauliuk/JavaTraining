package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Вычислить площадь правильного шестиугольника со стороной а, 
 * используя метод вычисления площади треугольника.
 */

public class Task03 {

	public static void main(String[] args) {
		
		double a;

		a = consoleIn();
		System.out.println("Площадь шестиугольника = " + areaHexagon(a));

	}

	public static double consoleIn() {
		
		double value = -1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите сторону правильного шестиугольника");
			System.out.print(">> ");
			
			if (sc.hasNextDouble()) {
				value = sc.nextDouble();			
				if (value <= 0) {
					System.out.println("Сторона не может быть <= 0!");
				}
			} else {
				System.out.println("Введенное значение не число!");
				sc.next();
			}
		} while (value <= 0);
		
		return value;
	}

	public static double areaTriangle(double a) {
		return a * a * Math.sqrt(3) / 4; // площадь равностороннего треугольника
	}

	public static double areaHexagon(double a) {
		return 6 * areaTriangle(a);
	}
}
