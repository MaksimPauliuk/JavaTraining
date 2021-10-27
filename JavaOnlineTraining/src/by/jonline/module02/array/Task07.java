package by.jonline.module02.array;

import java.util.Random;

/* Даны действительные числа a1,a2,...,a2n. 
 * Найти max(a1 + a(2n), a2 + a(2n-1), an + a(n+1))
 */

public class Task07 {

	public static void main(String[] args) {
		int n = 3;
		int leftIndex = 0;
		int rightIndex = 2 * n - 1;
		double[] a = new double[2 * n];
		double sum = 0;
		double max = -Double.MAX_VALUE;

		Random rnd = new Random();

		for (int i = 0; i < 2 * n; i++) {
			a[i] = rnd.nextDouble() * 20 - 10;
		}

		System.out.println("Сгенерированная последовательность:");
		for (int i = 0; i < 2 * n; i++) {
			System.out.printf("a%d = %5.2f%n", i + 1, a[i]);
		}

		while (leftIndex < rightIndex) {
			sum = a[leftIndex] + a[rightIndex];
			if (sum > max) {
				max = sum;
			}
			leftIndex++;
			rightIndex--;
		}

		System.out.printf("max = %5.2f", max);
	}

}
