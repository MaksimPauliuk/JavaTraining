package by.jonline.module02.matrix;

import java.util.Random;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. 
 * Вывести на экран саму матрицу и номера строк, 
 * в которых число 5 встречается три и более раз
*/

public class Task11 {

	public static void main(String[] args) {
		int[][] m = new int[10][20];
		int count;

		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				m[i][j] = rnd.nextInt(16);
			}
		}

		System.out.println("Сгенерированная матрица:");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.printf("%2d ", m[i][j]);
			}
			System.out.println();
		}

		System.out.println("Номера строк, в которых число 5 встречается 3 и более раз:");
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < 20; j++) {
				if (m[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.printf("%d ", i + 1);
			}
		}
	}

}
