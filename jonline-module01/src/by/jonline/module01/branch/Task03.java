package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой. 
 */

public class Task03 {

	public static void main(String[] args) {
		double x1, x2, x3;
		double y1, y2, y3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите x1 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите x1 >> ");
		}
		x1 = sc.nextDouble();

		System.out.print("Введите y1 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите y1 >> ");
		}
		y1 = sc.nextDouble();

		System.out.print("Введите x2 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите x2 >> ");
		}
		x2 = sc.nextDouble();

		System.out.print("Введите y2 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите y2 >> ");
		}
		y2 = sc.nextDouble();

		System.out.print("Введите x3 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите x3 >> ");
		}
		x3 = sc.nextDouble();

		System.out.print("Введите y3 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите y3 >> ");
		}
		y3 = sc.nextDouble();

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки принадлежат одной прямой");
		} else {
			System.out.println("Точки не принадлежат одной прямой");
		}
		
	}

}
