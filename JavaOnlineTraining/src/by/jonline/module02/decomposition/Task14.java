package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Натуральное  число,  в  записи  которого  n цифр,  
 * называется  числом  Армстронга,  если  сумма  его  цифр, 
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга 
 * от 1 до k. Для решения задачи использовать декомпозицию
 */

public class Task14 {

	public static void main(String[] args) {
		int k;

		k = inKFromConsole();

		for (int i = 1; i <= k; i++) {
			if (hasArmstrongNumber(i)) {
				System.out.print(i + " ");
			}

		}
	}

	public static int inKFromConsole() {
		int n = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите натуральное число k > 0");
			System.out.print(">> ");

			if (sc.hasNextInt()) {
				n = sc.nextInt();

				if (n <= 0) {
					System.out.println("Введенное число не удовлетворяет условию!");
				}
			} else {
				System.out.println("Это не число!");
				sc.next();
			}

		} while (n <= 0);

		return n;
	}

	public static boolean hasArmstrongNumber(int number) {
		boolean ArmstrongNumber = false;
		int sum = 0;
		int countOfDigits = 0;
		int tempNumber = number;

		while (tempNumber != 0) {
			countOfDigits++;
			tempNumber /= 10;
		}

		tempNumber = number;

		while (tempNumber != 0) {
			sum += (Math.pow(tempNumber % 10, countOfDigits));
			tempNumber /= 10;
		}

		if (sum == number) {
			ArmstrongNumber = true;
		}

		return ArmstrongNumber;
	}

}
