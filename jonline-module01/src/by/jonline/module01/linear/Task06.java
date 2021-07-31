package by.jonline.module01.linear;

import java.util.Scanner;

/*
 *  ��� ������ ������� ��������� �������� ���������, ������� �������� true,
 *  ���� ����� � ������������ (�, �) ����������� ����������� �������, 
 *  � false � � ��������� ������
 */

public class Task06 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double x, y;
		boolean res = false;

		System.out.print("������� ���������� x >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� ���������� x >> ");
		}
		x = sc.nextDouble();

		System.out.print("������� ���������� y >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� ���������� y >> ");
		}
		y = sc.nextDouble();

		if (y >= 0 && y <= 4 && Math.abs(x) <= 2) {
			res = true;
		}
		if (y < 0 && y >= -3 && Math.abs(x) <= 4) {
			res = true;
		}

		System.out.println("�e������� ��������� ����� (" + x + ":" + y + ") = " + res);

	}

}
