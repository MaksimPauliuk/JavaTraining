package by.jonline.module02.matrix;

import java.util.Random;
import java.util.Scanner;

/*
 * В числовой матрице поменять местами два любых столбца, * т. е. 
 * все элементы одного столбца поставить на соответствующие им позиции другого, 
 * а элементы второго переместить в первый. 
 * Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task08 {

	public static void main(String[] args) {
		int n = 6;
		int[][] m = new int[n][n];
		int column1;
		int column2;
		int temp;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m[i][j] = rnd.nextInt(10);
			}
		}

		outArray(m, "Сгенерированная матрица");

		column1 = getNumberOfcolumn(0, n, "первого");
		column2 = getNumberOfcolumn(column1, n, "второго");

		for (int i = 0; i < n; i++) {
			temp = m[i][column1 - 1];
			m[i][column1 - 1] = m[i][column2 - 1];
			m[i][column2 - 1] = temp;
		}

		outArray(m, "Преобразованная матрица");

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

	public static int getNumberOfcolumn(int previousColumn, int dimension, String column) {
		int number = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("%nВведите номер %s столбца (от 1 до %d) - > ", column, dimension);
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Это не число!");
			} else {
				number = sc.nextInt();

				if (number < 1 || number > dimension) {
					System.out.println("Введенное значение некорректно!");
				} else if (number == previousColumn) {
					System.out.println("Номер столбца совпадает с первым!");
				}
			}

		} while (number < 1 || number > dimension || number == previousColumn);

		return number;
	}

}
