package by.jonline.module02.array;

import java.util.Random;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . 
 * Поменять местами наибольший и наименьший элементы.
 */

public class Task04 {

	public static void main(String[] args) {
		int n = 20;
		double[] a = new double[n];
		int indexOfMin = 0;
		int indexOfMax = 0;
		double tempElement;
		double min;
		double max;
		
		Random rnd = new Random();
		
		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextDouble()*20 - 10;
		}
		
		System.out.println("Сгенерированный массив:");
		for (int i = 0; i < n; i++) {
			System.out.printf("%6.2f", a[i]);
		}
		
		min = a[0];
		max = a[0];
		
		for(int i = 0; i < n; i++) {
			if(a[i]>max) {
				max = a[i];
				indexOfMax = i;
			}
			if(a[i]<min) {
				min = a[i];
				indexOfMin = i;
			}
		}
		
		tempElement = a[indexOfMax];
		a[indexOfMax] = a[indexOfMin];
		a[indexOfMin] = tempElement;
		
		System.out.printf("%nПолученный массив после замены элементов:%n");
		for (int i = 0; i < n; i++) {
			System.out.printf("%6.2f", a[i]);
		}
		
	}

}
