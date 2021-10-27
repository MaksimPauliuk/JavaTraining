package by.jonline.module01.cycle;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

public class Task04 {

	public static void main(String[] args) {
		
		long res = 1L;
		long resPrevious;
		
		for (int i = 2; i <= 200; i++) {
			resPrevious = res;
			res = res * i * i;
			
			if (res / (i * i) != resPrevious) {
				System.out.println("Переполнение при умножении на квадрат числа " + i);
				System.out.println("Последнее корректное значение умножения = " + resPrevious);
				break;
			}
		}

	}

}
