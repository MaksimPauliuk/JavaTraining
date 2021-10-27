package by.jonline.module02.decomposition;

import java.util.Scanner;

/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы), 
 * определяющие, между какими из пар точек самое большое расстояние. 
 * Указание. Координаты точек занести в массив.
 */

public class Task04 {

	public static void main(String[] args) {

		double[][] pointArray;
		int n;

		n = consoleInNumberOfPoint();
		pointArray = new double[n][2];
		
		initArray(n, pointArray);
		consoleOutArray(n, pointArray);
		maxDistance(n, pointArray);

	}

	public static int consoleInNumberOfPoint() {
		int value = -1;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Введите количество точек");
			System.out.print(">> ");
			
			if (sc.hasNextInt()) {
				value = sc.nextInt();
				
				if (value < 3) {
					System.out.println("Количество точек не должо быть < 3!");
				}
			} else {
				System.out.println("Введенное значение не число!");
				sc.next();
			}
		} while (value < 3);
		
		return value;
	}

	public static double consoleInPoint(int i, String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите координату " + message + " " + i + "-ой точки >> ");		
		while (!sc.hasNextDouble()) {
			System.out.println("Введенное значение не число!");
			System.out.print("Введите координату " + message + " " + i + "-ой точки >> ");
			sc.next();
		}
	
		return sc.nextDouble();
	}

	public static void initArray(int n, double[][] m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					m[i][j] = consoleInPoint(i + 1, "x");
				} else {
					m[i][j] = consoleInPoint(i + 1, "y");
				}
			}
		}
	}

	public static void consoleOutArray(int n, double[][] m) {

		System.out.println("Введенный массив точек");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.println("x" + (i + 1) + " = " + m[i][j]);
				} else {
					System.out.println("y" + (i + 1) + " = " + m[i][j]);
				}
			}
		}
	}

	public static double getDistanceBetweenPoints(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public static void maxDistance(int n, double m[][]) {
		
		double maxDistance = 0;
		double maxDistanceTemp = 0;
		int numberOfPoint1 = 1;
		int numberOfPoint2 = 2;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				maxDistanceTemp = getDistanceBetweenPoints(m[i][0], m[i][1], m[j][0], m[j][1]);
				if (maxDistanceTemp > maxDistance) {
					maxDistance = maxDistanceTemp;
					numberOfPoint1 = i;
					numberOfPoint2 = j;
				}
			}
		}

		System.out.println(
				"Максимальное расстояние между парами точек " + (numberOfPoint1 + 1) + " и " + (numberOfPoint2 + 1));

	}
}
