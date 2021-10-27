package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и 
 * наименьшего общего кратного двух натуральных чисел: 
 * НОК (А,В) = A*B/НОД (А,В)
 */
public class Task01 {

	public static void main(String[] args) {
		
		int a;
		int b;

		a = consoleIn("A");
		b = consoleIn("B");

		System.out.println("НОД(А,В) = " + calculateNod(a, b) + " НОК(А,В) = " + calculateNok(a, b));

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

	public static int calculateNod(int A, int B) {
		
		int maxDivider = A;

		while (maxDivider > 0) {
			if (A % maxDivider == 0 && B % maxDivider == 0) {
				break;
			}
			maxDivider--;
		}
		return maxDivider;
	}

	public static int calculateNok(int A, int B) {
		return (A * B) / calculateNod(A, B);

	}

}
