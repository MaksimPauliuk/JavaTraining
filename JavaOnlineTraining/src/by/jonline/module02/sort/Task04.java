package by.jonline.module02.sort;

/*
 * Сортировка обменами. Дана последовательность чисел a1> = a2 >=... >= an. Требуется
переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
ai и ai+1. Если ai > ai+1, то делается перестановка. Так продолжается до тех пор,
 пока все элементы не станут расположены в порядке возрастания.
 Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task04 {

	public static void main(String[] args) {
		int[] a = { 9, 8, 8, 7, 5, 5, 4, 3, 2, 2, 1 };
		int countOfExchanges = 0;
		int temp;

		System.out.println("Исходный массив");
		outArray(a);

		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					countOfExchanges++;
				}
			}
		}

		System.out.println("Отсортированный массив");
		outArray(a);

		System.out.println("Количество перестановок = " + countOfExchanges);

	}

	public static void outArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		System.out.println();
	}

}