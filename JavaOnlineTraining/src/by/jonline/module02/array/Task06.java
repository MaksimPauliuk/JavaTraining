package by.jonline.module02.array;

import java.util.Random;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, 
 * порядковые номера которых являются простыми числами.
 */

public class Task06 {

	public static void main(String[] args) {
		int n = 10;
		double[] a = new double[n];
		double sum = 0;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextDouble() * 20 - 10;
		}

		System.out.println("Сгенерированный массив:");
		for (int i = 0; i < n; i++) {
			System.out.printf("a%d = %5.2f%n",i+1, a[i]);
		}

		for (int i = 0; i < n; i++) {
			if(hasPrimeNumber(i+1)) {
				sum+=a[i];
			}
		}
		
		System.out.printf("Сумма = %f",sum);

	}

	public static boolean hasPrimeNumber(int number) {
		boolean primeNumber = true;
		int divider = number - 1;

		if (number > 1) {
			while (divider > 1) {
				if (number % divider == 0) {
					primeNumber = false;
					break;
				}
				divider--;
			}
		} else {
			primeNumber = false;
		}

		return primeNumber;
	}

}
