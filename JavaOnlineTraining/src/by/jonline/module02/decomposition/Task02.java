package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя 
 * четырех натуральных чисел
 */

public class Task02 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int valueOfNOD;

		a = consoleIn("A");
		b = consoleIn("B");
		c = consoleIn("C");
		d = consoleIn("D");

		valueOfNOD = countNOD(countNOD(a, b), countNOD(c, d));
		System.out.println("НОД четырех чисел = " + valueOfNOD);
	}

	public static int consoleIn(String varName) {
		int value = -1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите натуральное число " + varName);
			System.out.print(">> ");		
			if (sc.hasNextInt()) {
				value = sc.nextInt();			
				if (value <= 0) {
					System.out.println("Введенное значение не удовлетворяет условию!");
				}
			} else {
				System.out.println("Введенное значение не удовлетворяет условию!");
				sc.next();
			}
		} while (value <= 0);
		
		return value;
	}

	public static int countNOD(int A, int B) {
		
		int maxDivider;
		maxDivider = Math.min(A, B);

		while (maxDivider > 0) {
			if (A % maxDivider == 0 && B % maxDivider == 0) {
				break;
			}
			maxDivider--;
		}
		
		return maxDivider;
	}

}
