package by.jonline.module02.sort;

import java.util.Random;

/*
 * Сортировка вставками. Дана последовательность чисел a1,a2,...,an. 
 * Требуется переставить числа в порядке возрастания. Делается это следующим образом. 
 * Пусть a1, a2, ..., ai упорядоченная последовательность по возрастанию.
.  Берется  следующее  число ai+1 и  вставляется  в  последовательность  так, 
   чтобы  новая последовательность была тоже возрастающей. Процесс производится 
   до тех пор, пока все элементы от i+1 до n не будут перебраны. 
   Примечание. Место помещения очередного элемента в отсортированную часть 
   производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task05 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int indexOfInsert;
		int value;

		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(10);
		}

		System.out.println("Исходный массив");
		outArray(a);

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				indexOfInsert = binarySearch(a, i, a[i + 1]);
				value = a[i + 1];
				for (int j = i + 1; j > indexOfInsert + 1; j--) {
					a[j] = a[j - 1];
				}
				a[indexOfInsert + 1] = value;
			}
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

	public static int binarySearch(int[] a, int lastIndex, int value) {
		int firstIndex = 0;
		int middleIndex;

		while (firstIndex <= lastIndex) {
			middleIndex = (firstIndex + lastIndex) / 2;
			if (a[middleIndex] == value) {
				return middleIndex;
			} else if (a[middleIndex] < value) {
				firstIndex = middleIndex + 1;
			} else if (a[middleIndex] > value) {
				lastIndex = middleIndex - 1;
			}
		}
		return lastIndex;
	}

}
