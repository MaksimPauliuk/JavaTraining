package by.jonline.module02.matrix;

/*
 * Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов
 */

import java.util.Random;

public class Task13 {

	public static void main(String[] args) {
		int n = 6;
		int[][] m = new int[n][n];
		int temp;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = rnd.nextInt(10);
			}
		}

		outArray(m, "Сгенерированная матрица:");

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n - 1; i++) {
				for (int k = i + 1; k < n; k++) {
					if (m[i][j] > m[k][j]) {
						temp = m[i][j];
						m[i][j] = m[k][j];
						m[k][j] = temp;
					}
				}
			}
		}

		outArray(m, "Отсортированные столбцы матрицы по возрастанию:");

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n - 1; i++) {
				for (int k = i + 1; k < n; k++) {
					if (m[i][j] < m[k][j]) {
						temp = m[i][j];
						m[i][j] = m[k][j];
						m[k][j] = temp;
					}
				}
			}
		}

		outArray(m, "Отсортированные столбцы матрицы по убыванию:");

	}

	public static void outArray(int[][] m, String message) {
		System.out.println(message);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
