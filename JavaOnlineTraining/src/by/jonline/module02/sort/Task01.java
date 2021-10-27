package by.jonline.module02.sort;

import java.util.Random;

/*
 * Заданы два одномерных массива с различным количеством элементов и 
 * натуральное число k. Объединить их в один  массив,  включив  второй  массив  
 * между  k-м  и  (k+1)  - м  элементами  первого,  при  этом  не  используя 
 * дополнительный массив.
 */

public class Task01 {

	public static void main(String[] args) {
		int[] a1 = new int[6];
		int[] a2 = new int[7];
		int k;
		Random rnd = new Random();

		a1 = fillArray(a1);
		a2 = fillArray(a2);

		System.out.println("Первый массив:");
		outArray(a1);

		System.out.println("Второй массив:");
		outArray(a2);

		k = rnd.nextInt(a1.length - 1) + 1;

		System.out.printf("Второй массив включен между %d и %d элементами первого:%n", k, k + 1);
		for (int i = 0; i < a1.length; i++) {
			System.out.printf("%d ", a1[i]);
			if (i + 1 == k) {
				for (int j = 0; j < a2.length; j++) {
					System.out.printf("%d ", a2[j]);
				}
			}
		}
	}

	public static int[] fillArray(int[] a) {
		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(10);
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
