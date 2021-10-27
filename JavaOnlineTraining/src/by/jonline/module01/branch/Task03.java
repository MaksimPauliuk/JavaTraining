package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой. 
 */

public class Task03 {

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		x1 = inConsole("x1");
		y1 = inConsole("y1");
		x2 = inConsole("x2");
		y2 = inConsole("y2");
		x3 = inConsole("x3");
		y3 = inConsole("y3");

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("Точки принадлежат одной прямой");
		} else {
			System.out.println("Точки не принадлежат одной прямой");
		}
		
	}
	
	public static double inConsole(String message) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите " + message + " >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("Это не число! Введите " + message + " >> ");
		}
		
		return sc.nextDouble();
	}

}
