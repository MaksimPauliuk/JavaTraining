package by.jonline.module02.matrix;

import java.util.Random;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, 
 * у которых первый элемент больше последнего
 */

public class Task01 {
	public static void main(String[] args) {
		int[][] m = new int[4][8];

		Random rnd = new Random();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = rnd.nextInt(10);
			}
		}

		outArray(m, "Сгенерированная матрица:");

		System.out.println("Нечетные столбцы, у которых первый элемент > последнего:");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (j % 2 == 0 && m[0][j] > m[m.length - 1][j]) {
					System.out.print(m[i][j] + " ");
				}
			}
			System.out.println();
		}
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
