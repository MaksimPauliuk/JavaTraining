package by.jonline.module02.sort;

import java.util.Random;

/*
 * Даны дроби p1/q1, p2/q2,...,pn/qn (pi,qi - натуральные). Составить программу,
 * которая приводит эти дроби к общему знаменателю и упорядочивает их в 
 * порядке возрастания.
 */

public class Task08 {

	public static void main(String[] args) {
		int n = 10;
		int commonDenominator;
		int[] p = new int[n];
		int[] q = new int[n];

		fillArray(p);
		fillArray(q);

		System.out.println("Исходные дроби:");
		outFraction(p, q);

		commonDenominator = q[0];
		for (int i = 1; i < n; i++) {
			if (commonDenominator % q[i] != 0) {
				commonDenominator *= q[i];
			}
		}

		for (int i = 0; i < n; i++) {
			p[i] *= commonDenominator / q[i];
			q[i] = commonDenominator;
		}

		reductionOfFraction(p, q);
		
		System.out.println("Приведенные к общему знаменателю и сокращенные дроби:");
		outFraction(p, q);

		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (p[i] > p[j]) {
					temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}

		System.out.println("Отсортированные дроби:");
		outFraction(p, q);
	}

	public static void fillArray(int[] a) {
		Random rnd = new Random();

		for (int i = 0; i < a.length; i++) {
			a[i] = rnd.nextInt(9) + 1;
		}
	}

	public static void outFraction(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%5d ", a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.printf("----- ");
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.printf("%5d ", b[i]);
		}
		System.out.printf("%n%n");
	}

	public static void reductionOfFraction(int[] p, int[] q) {
		int[] divider = { 2, 3, 5, 7, 11 };//массив простых делителей
		boolean reduction = true; 
		//делятся ли числители и знаменатели на следующее простое число
		boolean divide = true; //можно ли еще сократить дроби

		int i;
		while (reduction) {
			i = divider.length - 1;
			//перебираем простые делители в массиве
			while (i >= 0) {
				divide = true;
				//проверка, сокращается ли знаменатель
				if (q[0] % divider[i] == 0) {
					for (int j = 0; j < p.length; j++) {
						//проверка, сокращается ли каждый числитель
						if (p[j] % divider[i] != 0) {
							divide = false;
							break;
						}
					}
					if (divide) {
						//сокращение дроби
						for (int j = 0; j < p.length; j++) {
							q[j] /= divider[i];
							p[j] /= divider[i];
						}
					}
				} else {
					divide = false;
				}
				if (!divide) {
					i--;
				}
			}
			//все числа перебрали, больше сократить нельзя
			if (i < 0 && !divide) {
				reduction = false;
			}
		}
	}

}
