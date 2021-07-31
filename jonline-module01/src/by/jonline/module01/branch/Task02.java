package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double min1;
		double min2;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите a >> ");
		}
		a = sc.nextDouble();

		System.out.print("Введите b >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите b >> ");
		}
		b = sc.nextDouble();

		System.out.print("Введите c >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите c >> ");
		}
		c = sc.nextDouble();

		System.out.print("Введите d >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите d >> ");
		}
		d = sc.nextDouble();

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		
		if (min1 > min2) {
			System.out.println("max = " + min1);
		} else {
			System.out.println("max = " + min2);
		}
	}

}
