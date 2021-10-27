package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Написать программу, определяющую сумму n-значных чисел, содержащих только 
 * нечетные  цифры. Определить также, сколько четных цифр в найденной сумме. 
 * Для решения задачи использовать декомпозицию.
 */

public class Task16 {

	public static void main(String[] args) {
		int n;
		long sum;

		n = inNFromConsole();
		sum = calculateSum(n);
		
		System.out.printf("Сумма нечетных цифр всех %d-значных чисел = %d\n",n,sum);
		System.out.printf("Количество четных цифр в сумме = %d",countEvenDigits(sum));

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

	public static boolean hasOnlyOddDigits(int number) {
		boolean OnlyOddNumbers = true;
		int digit;

		while (number != 0) {
			digit = number % 10;

			if (digit % 2 == 0) {
				OnlyOddNumbers = false;
				break;
			}
			number /= 10;
		}

		return OnlyOddNumbers;
	}

	public static long calculateSum(int n) {
		long sum = 0L;

		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (hasOnlyOddDigits(i)) {
				sum += i;
			}

		}
		return sum;
	}

	public static int countEvenDigits(long number) {
		long digit;
		int countEvenDigits = 0;

		while (number != 0L) {
			digit = number % 10L;

			if (digit % 2L == 0L) {
				countEvenDigits++;
			}
			number /= 10L;
		}
		
		return countEvenDigits;
	}

}
