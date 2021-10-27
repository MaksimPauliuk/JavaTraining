package by.jonline.module02.array;

import java.util.Random;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен
 */

public class Task02 {

	public static void main(String[] args) {
		int n = 20;
		int count = 0;
		double[] A = new double[n];
		double z = 8.9;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			A[i] = rnd.nextDouble() * 15;
		}

		System.out.println("Сгенерированная последовательность:");
		outArray(A);

		for (int i = 0; i < n; i++) {
			if (A[i] > z) {
				A[i] = z;
				count++;
			}
		}

		System.out.println("Измененная последовательность:");
		outArray(A);
		
		System.out.println("Количество замен = " + count);
		
	}

	public static void outArray(double[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%5.2f ", A[i]);
		}
		System.out.printf("%n");
	}

}
