package by.jonline.module02.sort;

import java.util.Random;

/*
 * Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была 
 * неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task02 {

	public static void main(String[] args) {
		int n = 7;
		int m = 9;
		int i = 0;
		int j = 0;
		int[] a = new int[n];
		int[] b = new int[m];
		
		a = fillArray(a);
		b = fillArray(b);
		
		System.out.println("Последовательность an:");
		outArray(a);

		System.out.println("Последовательность bm:");
		outArray(b);

		System.out.println("Результирующая последовательность:");
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				System.out.printf("%d ", a[i]);
				i++;
			}
			else {
				System.out.printf("%d ", b[j]);
				j++;
			}
		}
	}

	public static int[] fillArray(int[] a) {
		int temp;
		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(10);
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static void outArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}

}
