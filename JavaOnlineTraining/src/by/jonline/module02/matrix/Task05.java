package by.jonline.module02.matrix;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
  1   1  1 ... 1  1  1
  2   2  2 ... 2  2  0
  3   3  3 ... 3  0  0
  .   .  .  .  .  .  .
 n-1 n-1 0 ... 0  0  0
  n   0  0 ... 0  0  0   
 */

public class Task05 {

	public static void main(String[] args) {
		int n = 8;
		int[][] m = new int[n][n];
		int k = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= k) {
					m[i][j] = 0;
				}
				else {
					m[i][j] = i + 1;
				}
			}
			k--;
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
