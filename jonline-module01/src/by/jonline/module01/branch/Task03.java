package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). 
 * ����������, ����� �� ��� ����������� �� ����� ������. 
 */

public class Task03 {

	public static void main(String[] args) {
		double x1, x2, x3;
		double y1, y2, y3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� x1 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� x1 >> ");
		}
		x1 = sc.nextDouble();

		System.out.print("������� y1 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� y1 >> ");
		}
		y1 = sc.nextDouble();

		System.out.print("������� x2 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� x2 >> ");
		}
		x2 = sc.nextDouble();

		System.out.print("������� y2 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� y2 >> ");
		}
		y2 = sc.nextDouble();

		System.out.print("������� x3 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� x3 >> ");
		}
		x3 = sc.nextDouble();

		System.out.print("������� y3 >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� y3 >> ");
		}
		y3 = sc.nextDouble();

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
			System.out.println("����� ����������� ����� ������");
		} else {
			System.out.println("����� �� ����������� ����� ������");
		}
		
	}

}
