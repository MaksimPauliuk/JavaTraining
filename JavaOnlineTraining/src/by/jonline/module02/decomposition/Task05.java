package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число 
 * (вывести на печать число, которое меньше максимального элемента массива, 
 * но больше всех других элементов)
 */

public class Task05 {

	public static void main(String[] args) {
		
		int[] A;
		int n;

		n = getDimension();
		A = new int[n];
		
		initArray(A);
		outArray(A);
		
		System.out.println("\nВторое по величине число = " + findSecondMax(A));

	}

	public static int getDimension() {
		int value = -1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите размерность массива");
			System.out.print(">> ");
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				if (value <= 1) {
					System.out.println("Размерность должна быть > 1!");
				}
			} else {
				System.out.println("Введенное значение не число!");
				sc.next();
			}
		} while (value <= 1);
		return value;
	}

	public static void initArray(int[] m) {
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 21);
		}
	}

	public static void outArray(int m[]) {
		
		System.out.println("Сгенерированный массив:");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}

	public static int findSecondMax(int m[]) {
		int max = m[0];
		int secondMax = m[1];
		for (int i = 0; i < m.length; i++) {
			if (m[i] > max) {
				secondMax = max;
				max = m[i];
			}
			if (m[i] > secondMax && m[i] < max) {
				secondMax = m[i];
			}
		}
		return secondMax;
	}

}
