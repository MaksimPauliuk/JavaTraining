package by.jonline.module02.array;

import java.util.Random;

/*
 * Дан массив  действительных чисел, размерность которого  N. Подсчитать, 
 * сколько в нем отрицательных, положительных и нулевых элементов
 */

public class Task03 {

	public static void main(String[] args) {
		int n = 20;
		double[] m = new double[n];
		int countOfNegative = 0;
		int countOfPositive = 0;
		int countOfZero = 0;

		Random rnd = new Random();
		
		for (int i = 0; i < n; i++) {
			m[i] = rnd.nextDouble()*20 - 10;
		}

		System.out.println("Сгенерированный массив");
		for (int i = 0; i < n; i++) {
			System.out.printf("%6.2f", m[i]);
		}

		for (int i = 0; i < n; i++) {
			if (m[i] > 0) {
				countOfPositive++;
			} else if (m[i] < 0) {
				countOfNegative++;
			} else {
				countOfZero++;
			}
		}

		System.out.printf("%nКоличество элементов больше 0 = %d, меньше 0 = %d, равных 0 = %d",
				           countOfPositive,countOfNegative,countOfZero);
	}

}
