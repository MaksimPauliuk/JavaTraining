package by.jonline.module02.matrix;

import java.util.Random;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
 * причем в каждом столбце число единиц равно номеру столбца
*/
public class Task14 {

	public static void main(String[] args) {
		int m = 8;
		int n;
		int[][] a;
		int temp;
		int randomPosition;

		Random rnd = new Random();

		n = rnd.nextInt(m - 1) + 2;
		a = new int[m][n];

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				if (j < i) {
					a[i][j] = 0;
				} else {
					a[i][j] = 1;
				}
			}
			for (int i = 0; i < m; i++) {
				randomPosition = rnd.nextInt(m);
				temp = a[i][j];
				a[i][j] = a[randomPosition][j];
				a[randomPosition][j] = temp;		
			}
		}

		System.out.println("Сгенерированная матрица:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
