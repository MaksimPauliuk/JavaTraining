package by.jonline.module01.cycle;

/*
 * Найти сумму квадратов первых ста чисел
 */

public class Task03 {

	public static void main(String[] args) {
		int sum = 1;

		for (int i = 2; i <= 100; i++) {
			sum += i * i;
		}

		System.out.println("Сумма = " + sum);

	}

}
