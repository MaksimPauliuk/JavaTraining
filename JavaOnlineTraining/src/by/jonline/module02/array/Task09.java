package by.jonline.module02.array;

import java.util.Random;

/*
 * В массиве целых чисел с количеством элементов n найти 
 * наиболее часто встречающееся число. Если таких чисел несколько, 
 * то определить наименьшее из них.
 */

public class Task09 {

	public static void main(String[] args) {
		int n = 5;
		int[] a = new int[n];
		int countOfNumber = 1;
		int tempCountOfNumber = 0;
		int number;
		int tempNumber;

		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextInt(10);
		}

		System.out.println("Сгенерированный массив:");
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}

		tempNumber = a[0];
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (a[j]<a[i]) {
					tempNumber = a[i];
					a[i] = a[j];
					a[j] = tempNumber;
				}
			}
		}
		
		number = a[0];

		for (int i = 0; i < n; i++) {
			tempCountOfNumber = 0;
			for (int j = i; j < n; j++) {	
				if (a[i] == a[j]) {
					tempCountOfNumber++;
				}
			}
			if (tempCountOfNumber > countOfNumber) {
				countOfNumber = tempCountOfNumber;
				number = a[i];
			}
		}

		System.out.printf("%nНаиболее часто встречающееся число = " + number);
		
	}

}
