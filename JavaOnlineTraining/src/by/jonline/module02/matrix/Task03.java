package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */

public class Task03 {

	public static void main(String[] args) {
		int countOfRows = 5;
		int countOfColumns = 7;
		int[][] m = new int[countOfRows][countOfColumns];
		int k;
		int p;

		Random rnd = new Random();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = rnd.nextInt(10);
			}
		}

		System.out.println("Сгенерированная матрица:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		k = rnd.nextInt(countOfRows);
		p = rnd.nextInt(countOfColumns);

		System.out.printf("\n%d-ая строка:\n", k + 1);
		for (int i = 0; i < countOfColumns; i++) {
			System.out.print(m[k][i] + " ");
		}

		System.out.printf("\n\n%d-ый столбец:\n", p + 1);
		for (int i = 0; i < countOfRows; i++) {
			System.out.print(m[i][p] + " ");
		}

	}

}
