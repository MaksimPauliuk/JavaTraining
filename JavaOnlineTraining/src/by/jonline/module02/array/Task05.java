package by.jonline.module02.array;

import java.util.Random;

/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, 
 * для которых аi > i.
 */

public class Task05 {

	public static void main(String[] args) {
		int n = 20;
		int[] a = new int[n];

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextInt(21);
		}

		System.out.println("Сгенерированный массив:");
		for (int i = 0; i < n; i++) {
			System.out.printf("a%d = %d%n", i + 1, a[i]);
		}

		System.out.printf("Элементы массива, которые больше своего индекса:%n");
		for (int i = 0; i < n; i++) {
			if (a[i] > i + 1) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
