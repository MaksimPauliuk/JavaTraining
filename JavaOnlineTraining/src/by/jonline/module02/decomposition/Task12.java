package by.jonline.module02.decomposition;

import java.util.Arrays;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 *  элементами которого являются числа, 
 *  сумма цифр которых равна К и которые не большее N
 */

public class Task12 {

	public static void main(String[] args) {
		int[] A;
		int K = 4;
		int N = 1000;

		A = initArray(K, N);

		System.out.println("Полученный массив:");
		for (int i = 0; i < A.length; i ++) {
			System.out.print(A[i] +" ");
		}
	}

	public static int[] initArray(int sumOfDigits, int maxNumber) {
		int[] tempArray = new int[maxNumber];
		int j = 0;

		for (int i = 0; i < maxNumber; i++) {
			if (sumOfDigits(i) == sumOfDigits) {
				tempArray[j] = i;
				j++;
			}
		}

		return Arrays.copyOf(tempArray, j);

	}

	public static int sumOfDigits(int number) {
		int sum = 0;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}

}
