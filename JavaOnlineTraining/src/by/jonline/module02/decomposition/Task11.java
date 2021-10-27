package by.jonline.module02.decomposition;

/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
 */

public class Task11 {

	public static void main(String[] args) {
		int a = 298431;
		int b = -522220;
		
		findMaxNumberOfDigits(a, b);

	}

	public static int сountDigits(int Number) {
		int count;

		count = (Number == 0) ? 1 : 0;

		while (Number != 0) {
			count++;
			Number /= 10;
		}
		return count;
	}

	public static void findMaxNumberOfDigits(int number1, int number2) {
		if (сountDigits(number1) > сountDigits(number2)) {
			System.out.printf("В числе %d цифр больше, чем в числе %d", number1, number2);
		}
		else if (сountDigits(number1) == сountDigits(number2)) {
			System.out.printf("В числах %d и %d одинаковое кол-во цифр", number1, number2);
		}
		
		else {
			System.out.printf("В числе %d цифр больше, чем в числе %d", number2, number1);
		}
	}
}