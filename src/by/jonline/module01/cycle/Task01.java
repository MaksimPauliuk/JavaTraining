package by.jonline.module01.cycle;

import java.util.Scanner;

/*
 * �������� ���������, ��� ������������ ������ ����� ����� ������������� �����.
 * � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
 */

public class Task01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = -1;
		int res = 0;

		do {
			System.out.println("������� ����� ������������� �����");
			System.out.print(">> ");
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				if (x <= 0) {
					System.out.println("��������� �������� �� ������������� �������!");
				}
			} else {
				System.out.println("��������� �������� �� ������������� �������!");
				sc.next();
			}
		} while (x <= 0);

		for (int i = 1; i <= x; i++) {
			res += i;
		}

		System.out.println("����� ����� �� 1 �� " + x + " = " + res);

	}

}
