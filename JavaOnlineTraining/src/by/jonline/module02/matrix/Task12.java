package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class Task12 {

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

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (m[i][j] > m[i][k]) {
						temp = m[i][j];
						m[i][j] = m[i][k];
						m[i][k] = temp;
					}
				}
			}
		}
		
		outArray(m, "Отсортированные строки матрицы по возрастанию:");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (m[i][j] < m[i][k]) {
						temp = m[i][j];
						m[i][j] = m[i][k];
						m[i][k] = temp;
					}
				}
			}
		}
		
		outArray(m, "Отсортированные строки матрицы по убыванию:");

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
