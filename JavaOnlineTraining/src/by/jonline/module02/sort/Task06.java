package by.jonline.module02.sort;

import java.util.Random;

/*
 * Сортировка  Шелла. Дан массив n действительных чисел.  
 * Требуется  упорядочить  его  по  возрастанию. Делается это следующим образом: 
 * сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1, то 
 * продвигаются на один элемент вперед. Если ai > ai+1, то производится 
 * перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task06 {

	public static void main(String[] args) {
		int n = 10;
		int i;
		double temp;
		double[] a = new double[n];

		Random rnd = new Random();

		for (i = 0; i < n; i++) {
			a[i] = rnd.nextDouble() * 10;
		}

		System.out.println("Исходный массив");
		outArray(a);

		i = 0;
		while (i < n - 1) {
			if (a[i] <= a[i + 1]) {
				i++;
			} else {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				if (i != 0) {
					i--;
				}
			}
		}

		System.out.println("Отсортированный массив");
		outArray(a);
	}

	public static void outArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%5.2f ", a[i]);
		}
		System.out.println();
	}
}
