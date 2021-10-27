package by.jonline.module02.matrix;

/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[i][j] = sin ((i*i - j*j)/N) и подсчитать количество положительных элементов
 * в ней
 */
public class Task07 {

	public static void main(String[] args) {
		int n = 10;
		int countOfPositeveElements = 0;
		double[][] A = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = Math.sin((i * i - j * j) / n);

				if (A[i][j] > 0) {
					countOfPositeveElements++;
				}
			}
		}

		System.out.println("Сформированная матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%5.2f ", A[i][j]);
			}
			System.out.println();
		}

		System.out.printf("%nКоличество положительных элементов = %d", 
				          countOfPositeveElements);

	}

}
