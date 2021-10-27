package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 *  Определить, какой столбец содержит максимальную сумму
 */

public class Task09 {

	public static void main(String[] args) {
		int n = 4;
		int[][] m = new int[n][n];
		int[] arrayOfSum = new int[n];
		int max;
		int numberOfColumn;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = rnd.nextInt(10);
			}
		}

		System.out.println("Сгенерированная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", m[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				arrayOfSum[j] += m[i][j];
			}
		}

		max = arrayOfSum[0];
		numberOfColumn = 1;

		for (int i = 1; i < n; i++) {
			if (arrayOfSum[i] > max) {
				max = arrayOfSum[i];
				numberOfColumn = i + 1;
			}
		}
		
		System.out.printf("Максимальная сумма элементов в столбце %d и равна %d",
				          numberOfColumn, max);
	}

}
