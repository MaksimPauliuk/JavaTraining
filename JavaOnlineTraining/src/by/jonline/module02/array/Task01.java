package by.jonline.module02.array;

import java.util.Random;

/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
 *  которые кратны данному К.
 */

public class Task01 {

	public static void main(String[] args) {
		int[] A = new int[20];
		int k = 5;
		int sum = 0;

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			A[i] = rnd.nextInt(45);
			
			if (A[i] % k == 0) {
				sum += A[i];
			}
		}

		System.out.println("Сгенерированный массив");
		for (int i = 0; i < 20; i++) {
			System.out.print(A[i] + " ");	
		}
		
		System.out.printf("\nСумма элементов, кратных %d = %d",k,sum);
	}

}
