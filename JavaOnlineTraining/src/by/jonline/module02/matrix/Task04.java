package by.jonline.module02.matrix;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1  2   3  ... n
 n n-1 n-2 ... 1
 1  2   3  ... n
 n n-1 n-2 ... 1
 .  .   .   .  .
 n n-1 n-2 ... 1
 */

public class Task04 {

	public static void main(String[] args) {
		int n = 8;
		int[][] m = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					m[i][j] = j + 1;
				} else {
					m[i][j] = n - j;
				}
			}
		}

		System.out.println("Сформированная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
