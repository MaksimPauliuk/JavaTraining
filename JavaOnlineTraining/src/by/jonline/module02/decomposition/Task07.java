package by.jonline.module02.decomposition;

/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
 */

public class Task07 {

	public static void main(String[] args) {

		System.out.println("Сумма = " + sum());
	}

	public static int calculateFactorial(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * calculateFactorial(a - 1);
		}
	}

	public static int sum() {
		int sum = 0;
		
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				sum += calculateFactorial(i);
			}
		}
		return sum;
	}

}
