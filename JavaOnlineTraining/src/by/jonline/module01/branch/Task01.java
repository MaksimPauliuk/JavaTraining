package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * Даны два угла треугольника (в градусах). Определить, 
 * существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task01 {

	public static void main(String[] args) {
		
		double alpha;
		double beta;
		double gamma;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите углы треугольника (будут взяты по модулю)");
		
		System.out.print("Введите угол alpha >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите угол alpha >> ");
		}		
		alpha = Math.abs(sc.nextDouble());

		System.out.print("Введите угол beta >> ");	
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите угол beta >> ");
		}	
		beta = Math.abs(sc.nextDouble());
		
		gamma = 180 - (alpha + beta);

		if ((alpha + beta + gamma) > 180 || (alpha * beta * gamma) == 0) {
			System.out.println("Такого треугольника не существует");
		} else if (alpha == 90 || beta == 90 || gamma == 90) {
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
		}

	}

}
