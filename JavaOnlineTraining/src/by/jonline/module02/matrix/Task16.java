package by.jonline.module02.matrix;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, 
 * составленная из чисел 1, 2, 3, ...,     так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой. 
 * Построить такой квадрат. 
 */

public class Task16 {

	public static void main(String[] args) {
		int n = 6;
		int[][] magicSquare;

		magicSquare = magicSquare(n);
		outArray(magicSquare, "Магический квадарат:");
	}

	public static int[][] magicSquare(int n) {
		if (n % 2 != 0)
			return magicSquareOfOddOrder(n); // метод для n нечетной размерности)
		else if (n % 4 != 0)
			return magicSquareOfEvenOddOrder(n); // метод для n четно-нечетной размерности (n кратно 2, но не кратно 4)
		return evenMatrixSquare(n); // метод для n четно-четной размерности (n кратно и 2, и 4);
	}

	public static int[][] magicSquareOfOddOrder(int n) {
		// Сиамский метод
		int[][] matrix = new int[n][n];
		int count = 1;
		int i = 0;
		int j = matrix.length / 2;

		while (true) {
			matrix[i][j] = count;

			count++;
			if (((i == 0) && (j >= n - 1)) && (matrix[n - 1][0] != 0)) {
				i++;
			} else {
				i--;
				if (i < 0) {
					i = n - 1;
				}
				j++;
				if (j == n) {
					j = 0;
				}
				if (matrix[i][j] != 0) {
					i += 2;
					j--;
				}
			}

			if (count == n * n + 1)
				break;
		}
		return matrix;
	}

	public static int[][] magicSquareOfEvenOddOrder(int n) {
		// Метод четырех квадратов
		int half = n / 2;
		int x;
		int y;
		int tempValue;
		int move;

		int[][] matrix = new int[n][n];
		int[][] tempMatrix;
		
		tempMatrix = magicSquareOfOddOrder(half);

		// 1/4 матрицы
		for (int i = 0; i < half; i++) {
			for (int j = 0; j < half; j++) {
				matrix[i][j] = tempMatrix[i][j];
			}
		}
		// 2/4 матрицы
		for (int i = 0; i < half; i++) {
			for (int j = half; j < n; j++) {
				x = j - half;
				matrix[i][j] = (tempMatrix[i][x] + 2 * half * half);
			}
		}
		// 3/4 матрицы
		for (int i = half; i < n; i++) {
			for (int j = 0; j < half; j++) {
				x = i - half;
				matrix[i][j] = (tempMatrix[x][j] + 3 * half * half);
			}
		}
		// 4/4 матрицы
		for (int i = half; i < n; i++) {
			for (int j = half; j < n; j++) {
				x = i - half;
				y = j - half;
				matrix[i][j] = (tempMatrix[x][y] + half * half);
			}
		}

		move = 0;

		for (int i = 6; i < n; i++) {
			if ((i % 4 != 0) && (i % 2 == 0)) {
				move++;
			}
		}
		for (int j = matrix.length / 2 - move; j <= matrix.length / 2 + move - 1; j++) {
			for (int i = 0; i < tempMatrix.length; i++) {
				tempValue = matrix[i][j];
				matrix[i][j] = matrix[half + i][j];
				matrix[half + i][j] = tempValue;
			}
		}

		tempValue = matrix[0][0];
		matrix[0][0] = matrix[half][0];
		matrix[half][0] = tempValue;

		tempValue = matrix[half - 1][0];
		matrix[half - 1][0] = matrix[n - 1][0];
		matrix[n - 1][0] = tempValue;

		for (int i = 1; i < half - 1; i++) {
			tempValue = matrix[i][1];
			matrix[i][1] = matrix[half + i][1];
			matrix[half + i][1] = tempValue;
		}
		return matrix;
	}

	public static int[][] evenMatrixSquare(int n) {
		// Метод Раус-Болла
		int[][] matrix = matrixFillingAscending(n);
		int[][] tempMatrix = matrixFillingDescending(n);

		int size = 4; // Размерность каждого квадрата
		int x = 0; // x, y - движение по кадратам
		int y = 0;

		for (int i = 0; i < (n * n / (size * size)); i++) { // Смотрим, сколько квадратов size x size помещается в
															// матрице nxn
			if (x == (int) Math.sqrt(n * n / (size * size))) { // x, y переменные для движения по квадратам size x size
				// х проходит по первому ряду квадратов, достигая последнего
				// обнуляется, а y увеличивается
				x = 0;
				y++;
			}
			// x и y должны лишь обеспечивать проход по квадратам
			for (int j = 0; j < size; j++) {
				matrix[size * y + j][size * x + j] = tempMatrix[size * y + j][size * x + j]; // главная диагональ
																							 // квадратов size x size
				matrix[size * y + j][size * x + size - 1 - j] = tempMatrix[size * y + j][size * x + size - 1 - j]; // побочная
																												   // диагональ
			}
			x++;
		}
		return matrix;
	}

	public static int[][] matrixFillingAscending(int n) {
		int[][] tempMatrix = new int[n][n];
		int value = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tempMatrix[i][j] = value;
				value++;
			}
		}
		return tempMatrix;
	}

	public static int[][] matrixFillingDescending(int n) {
		int[][] tempMatrix = new int[n][n];
		int value = n * n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tempMatrix[i][j] = value;
				value--;
			}
		}
		return tempMatrix;
	}

	public static void outArray(int[][] m, String message) {
		System.out.println(message);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2d ", m[i][j]);
			}
			System.out.println();
		}
	}
}