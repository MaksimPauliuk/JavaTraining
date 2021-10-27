package by.jonline.module02.matrix;

/*
 * 
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
  1  1  1 ... 1  1  1
  0  1  1 ... 1  1  0
  0  0  1 ... 1  0  0
  .  .  .  .  .  .  .
  0  1  1 ... 1  1  0
  1  1  1 ... 1  1  1   

 */

public class Task06 {

	public static void main(String[] args) {
		int n = 10;
		int[][] m = new int[n][n];
		int k = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == k || j == n - k - 1) {
					m[i][j] = 0;
				} else {
					m[i][j] = 1;
				}
			}

			if (i < n / 2 - 1) {
				k--;
			} else if (i != n / 2 - 1) {
				k++;
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
