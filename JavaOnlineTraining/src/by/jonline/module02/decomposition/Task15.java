package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Найти все натуральные n-значные числа,   
 * цифры в которых образуют строго возрастающую последовательность 
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task15 {

	public static void main(String[] args) {
		int n;

		n = inNFromConsole();
		outNumbers(n);

	}

	public static int inNFromConsole() {
		int n = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите количество цифр в чиcле - n, 1 < n < 10");
			System.out.print(">> ");

			if (sc.hasNextInt()) {
				n = sc.nextInt();

				if (n <= 1 || n >= 10) {
					System.out.println("Введенное число не удовлетворяет условию!");
				}
			} else {
				System.out.println("Это не число!");
				sc.next();
			}

		} while (n <= 1 || n >= 10);

		return n;
	}

	public static void outNumbers(int n) {

		if (n != 9) {
			for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
				if (hasAscendingSequenceOfDigits(i)) {
					System.out.println(i);
				}
			}

		} else {
			System.out.println(123456789);
		}
	}

	public static boolean hasAscendingSequenceOfDigits(int number) {
		boolean AscendingSeq = true;
		int previousDigit;

		previousDigit = number % 10;
		number /= 10;

		while (number != 0) {
			if (number % 10 >= previousDigit) {
				AscendingSeq = false;
				break;
			}
			previousDigit = number % 10;
			number /= 10;
		}

		return AscendingSeq;
	}
}
