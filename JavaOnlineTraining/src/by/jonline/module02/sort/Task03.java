package by.jonline.module02.sort;

/*
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. 
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого,  выбирается наибольший элемент и 
 * ставится на первое место, а первый - на место  наибольшего. Затем, начиная 
 * со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
 */

public class Task03 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,6,7,7,8,9};
		int positionOfMax = 0;
		int max;
		
		System.out.println("Исходный массив");
		outArray(a);

		for (int i = 0; i < a.length; i++) {
			max = a[i];
			positionOfMax = i;
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > max) {
					max = a[j];
					positionOfMax = j;
				}
			}
			a[positionOfMax] = a[i];
			a[i] = max;
		}

		System.out.println("Отсортированный массив");
		outArray(a);

	}

	public static void outArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}

}
