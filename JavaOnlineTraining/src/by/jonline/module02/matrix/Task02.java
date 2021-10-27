package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */

public class Task02 {

	public static void main(String[] args) {
		int[][] m = new int[5][5];

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

		System.out.println("Диагональ матрицы:");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i][i] + " ");
		}
	}

}
