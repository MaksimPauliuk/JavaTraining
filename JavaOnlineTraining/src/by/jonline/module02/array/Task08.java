package by.jonline.module02.array;

import java.util.Arrays;
import java.util.Random;

/*
 * Дана  последовательность целых чисел a1,a2,...,an. Образовать  новую  
 * последовательность, выбросив из исходной те члены,
 * которые равны min(a1,a2,...,an)
 */

public class Task08 {

	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		int[] newArray;
		
		Random rnd = new Random();

		for (int i = 0; i < n; i++) {
			a[i] = rnd.nextInt(11);
		}

		System.out.println("Сгенерированная последовательность:");
		outArray(a);
		
		newArray = getArray(a);
		
		System.out.println("min = " + calculateMin(a));
		System.out.println("Новая последовательность:");
		outArray(newArray);
		
	}
	
	public static void outArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}

	}
	
	public static int calculateMin(int[] a) {
		int min = a[0];
		
		for(int i = 0; i < a.length; i ++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		return min;
	}
	
	public static int[] getArray(int[] a) {
		int[] tempArray = new int[a.length];
		int j = 0;
		int min;
		
		min = calculateMin(a);
		
		for(int i = 0; i < a.length; i++) {
			if(a[i]!=min) {
				tempArray[j] = a[i];
				j++;
			}
			
		}
		
		return Arrays.copyOf(tempArray, j);
	}

}
