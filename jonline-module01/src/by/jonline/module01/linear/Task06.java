package by.jonline.module01.linear;

import java.util.Scanner;

/*
 *  Для данной области составить линейную программу, которая печатает true,
 *  если точка с координатами (х, у) принадлежит закрашенной области, 
 *  и false — в противном случае
 */

public class Task06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x, y;
		boolean res = false;

		System.out.print("Введите координату x >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите координату x >> ");
		}
		x = sc.nextDouble();

		System.out.print("Введите координату y >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите координату y >> ");
		}
		y = sc.nextDouble();

		if (y >= 0 && y <= 4 && Math.abs(x) <= 2) {
			res = true;
		}
		if (y < 0 && y >= -3 && Math.abs(x) <= 4) {
			res = true;
		}

		System.out.println("Рeзультат попадания точки (" + x + ":" + y + ") = " + res);

	}

}
