package by.jonline.module01.cycle;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = -1;
		int res = 0;

		do {
			System.out.println("Введите целое положительное число");
			System.out.print(">> ");
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				if (x <= 0) {
					System.out.println("Введенное значение не удовлетворяет условию!");
				}
			} else {
				System.out.println("Введенное значение не удовлетворяет условию!");
				sc.next();
			}
		} while (x <= 0);

		for (int i = 1; i <= x; i++) {
			res += i;
		}

		System.out.println("Сумма чисел от 1 до " + x + " = " + res);

	}

}
