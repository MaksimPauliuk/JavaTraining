package by.jonline.module02.decomposition;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму 
 * его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? 
 * Для решения задачи использовать декомпозицию.
 */

public class Task17 {

	public static void main(String[] args) {
		int number = 138;
		
		System.out.println("Количество вычитаний = " + getCountOfSubtractions(number));

	}

	public static int calculateSumOfDigits(int number) {
		int sum = 0;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}

	public static int getCountOfSubtractions(int number) {
		int count = 0;

		while (number != 0) {
			number -= calculateSumOfDigits(number);
			count++;
		}

		return count;
	}

}
