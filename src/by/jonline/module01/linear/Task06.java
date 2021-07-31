package by.jonline.module01.linear;

import java.util.Scanner;

/*
 *  ƒл€ данной области составить линейную программу, котора€ печатает true,
 *  если точка с координатами (х, у) принадлежит закрашенной области, 
 *  и false Ч в противном случае
 */

public class Task06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x, y;
		boolean res = false;

		System.out.print("¬ведите координату x >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ёто не число! ¬ведите координату x >> ");
		}
		x = sc.nextDouble();

		System.out.print("¬ведите координату y >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ёто не число! ¬ведите координату y >> ");
		}
		y = sc.nextDouble();

		if (y >= 0 && y <= 4 && Math.abs(x) <= 2) {
			res = true;
		}
		if (y < 0 && y >= -3 && Math.abs(x) <= 4) {
			res = true;
		}

		System.out.println("–eзультат попадани€ точки (" + x + ":" + y + ") = " + res);

	}

}
