package by.jonline.module01.cycle;

import java.util.Scanner;

/*
 * ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, 
 * ����� ������� � ������ �����. m � n �������� � ����������.
 */

public class Task07 {

	public static void main(String[] args) {
		int n = -1;
		int m = -1;
		int countDel;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("������� ����������� ����� m");
			System.out.print(">> ");
			if (sc.hasNextInt()) {
				m = sc.nextInt();
				if (m <= 0) {
					System.out.println("����� �� �����������!");
				}
			} else {
				sc.next();
				System.out.println("��� �� �����!");
			}
		} while (m <= 0);

		do {
			System.out.println("������� ����������� ����� n > m");
			System.out.print(">> ");
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				if (n <= 0 || n<=m) {
					System.out.println("����� �� ����������� ��� n <= m!");
				}
			} else {
				sc.next();
				System.out.println("��� �� �����!");
			}
		} while (n <= 0 || n<=m);

		for (int i = m; i <= n; i++) {
			System.out.print("�������� ����� " + i + ": ");
			countDel = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
					countDel++;
				}
			}
			if (countDel == 0) {
				System.out.print("��� ���������");
			}
			System.out.println("");
		}

	}

}
