package by.jonline.module02.decomposition;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; 
 * D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы 
 * трех последовательно расположенных элементов массива с номерами от k до m
 */

public class Task08 {

	public static void main(String[] args) {
		
		double[] D = new double[10];
		
		initArray(D);
		outArray(D);
		
		System.out.println("D[1] + D[2] + D[3] = " + sum(0,2,D));
		System.out.println("D[3] + D[4] + D[5] = " + sum(2,4,D));
		System.out.println("D[4] + D[5] + D[6] = " + sum(3,5,D));

	}

	public static void initArray(double[] m) {		
		int n = m.length;
		
		for (int i = 0; i < n; i++) {
			m[i] = Math.random() * 21;
		}
	}
	
	public static void outArray(double[] m) {
		int n = m.length;
		
		System.out.println("Сгенерированный массив:");
		
		for (int i = 0; i < n; i++) {
			System.out.println("D[" + (i+1) + "] = " +m[i]);
		}
	}

	public static double sum(int k, int m, double d[]) {
		return d[k] + d[k + 1] + d[m];
	}
}
