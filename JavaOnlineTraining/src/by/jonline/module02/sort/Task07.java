package by.jonline.module02.sort;

import java.util.Random;

/*
 * Пусть даны две неубывающие последовательности действительных чисел 
 * a1<a2<a3<...an и b1<b2<b3<...<bm. Требуется указать те места, 
 * на которые нужно вставлять элементы последовательности b1<b2<b3<...<bm в 
 * первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task07 {

	public static void main(String[] args) {
		int n = 10;
		int m = 12;
		int i = 0;
		int j = 0;
		double[] a = new double[n];
		double[] b = new double[m];

		a = fillArray(a);
		b = fillArray(b);

		System.out.println("Исходная последовательность A:");
		outArray(a);

		System.out.println("Исходная последовательность B:");
		outArray(b);

		System.out.println("Места размещения элементов последовательности B в А:");
		while (i < m) {
			if (b[i] <= a[j]) {
				System.out.printf("%5.2f перед %5.2f%n", b[i], a[j]);
				i++;
			} else if (j < n - 1) {
				j++;
			} else {
				System.out.printf("%5.2f на последнее место%n", b[i]);
				i++;
			}
		}
	}

	public static double[] fillArray(double[] a) {
		double temp;
		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextDouble() * 10;
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

	public static void outArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%5.2f ", a[i]);
		}
		System.out.println();
	}
}
