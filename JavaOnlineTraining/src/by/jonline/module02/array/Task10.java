package by.jonline.module02.array;

import java.util.Random;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив,
 * выбросив из него каждый второй элемент 
 * (освободившиеся элементы заполнить нулями). 
 * Примечание. Дополнительный массив не использовать.
 */

public class Task10 {

	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		int countOfReplace;
		int k;
		boolean parityReplaceflag = false;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextInt(9) + 1;
		}

		System.out.println("Сгенерированный массив:");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}

		countOfReplace = 0;

		k = 0;

		while (k < n) {
			if ((!parityReplaceflag && k % 2 != 0) ||
				(parityReplaceflag && k % 2 == 0)) {
				
				countOfReplace++;
				parityReplaceflag = !parityReplaceflag;
				a[n - 1] = 0;

				for (int j = k; j < n - countOfReplace; j++) {
					a[j] = a[j + 1];
				}
			}
			k++;
		}

		System.out.printf("%nПреобразованный массив:%n");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
	}

}
