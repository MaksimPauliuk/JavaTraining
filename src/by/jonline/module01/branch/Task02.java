package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * Ќайти max{min(a, b), min(c, d)}.
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

		System.out.print("¬ведите a >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ёто не число! ¬ведите a >> ");
		}
		a = sc.nextDouble();

		System.out.print("¬ведите b >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ёто не число! ¬ведите b >> ");
		}
		b = sc.nextDouble();

		System.out.print("¬ведите c >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ёто не число! ¬ведите c >> ");
		}
		c = sc.nextDouble();

		System.out.print("¬ведите d >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Ёто не число! ¬ведите d >> ");
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
