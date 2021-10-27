package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */

public class Task15 {

	public static void main(String[] args) {
		int n = 5;
		int[][] m = new int[n][n];
		int max = Integer.MIN_VALUE;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = rnd.nextInt(10);
				if (m[i][j] > max) {
					max = m[i][j];
				}
			}
		}

		outArray(m, "Сгенерированная матрица:");
		System.out.println("Максимальный элемент матрицы = " + max);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (m[i][j] % 2 != 0) {
					m[i][j] = max;
				}
			}
		}

		outArray(m, "Преобразованная матрица:");
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
