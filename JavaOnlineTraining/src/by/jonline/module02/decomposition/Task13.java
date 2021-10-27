package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга 
 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» 
 * из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию.
 */

public class Task13 {

	public static void main(String[] args) {
		int n;

		n = inNFromConsole();
		outPairOfNumbers(n);

	}

	public static int inNFromConsole() {
		int n = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите натуральное число n > 2");
			System.out.print(">> ");

			if (sc.hasNextInt()) {
				n = sc.nextInt();

				if (n <= 2) {
					System.out.println("Введенное число не удовлетворяет условию!");
				}
			} else {
				System.out.println("Это не число!");
				sc.next();
			}

		} while (n <= 2);

		return n;
	}

	public static boolean hasPrimeNumber(int number) {
		boolean primeNumber = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				primeNumber = false;
				break;
			}
		}

		return primeNumber;
	}

	public static void outPairOfNumbers(int n) {
		
		System.out.println("Пары чисел:");
		
		for (int i = n; i <= 2 * n - 2; i++) {
			if (hasPrimeNumber(i) && hasPrimeNumber(i + 2)) {
				System.out.print(i + " и " + (i + 2) + "; ");
			}
		}
	}
}
