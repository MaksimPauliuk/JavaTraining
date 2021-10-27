package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {

	public static void main(String[] args) {
		int n = 5;
		int[][] m = new int[n][n];

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

		System.out.println("Положительные элементы главной диагонали:");
		for (int i = 0; i < n; i++) {
			if (m[i][i] > 0) {
				System.out.printf("%d ", m[i][i]);
			}
		}
	}

}
