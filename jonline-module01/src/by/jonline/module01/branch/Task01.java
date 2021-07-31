package by.jonline.module01.branch;

import java.util.Scanner;

/*
 * ���� ��� ���� ������������ (� ��������). ����������, 
 * ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
 */

public class Task01 {

	public static void main(String[] args) {
		double alpha;
		double beta;
		double gamma;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� ���� ������������ (����� ����� �� ������)");
		System.out.print("������� ���� alpha >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� ���� alpha >> ");
		}
		alpha = Math.abs(sc.nextDouble());

		System.out.print("������� ���� beta >> ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("��� �� �����! ������� ���� beta >> ");
		}
		beta = Math.abs(sc.nextDouble());

		gamma = 180 - (alpha + beta);

		if ((alpha + beta + gamma) > 180 || (alpha * beta * gamma) == 0) {
			System.out.println("������ ������������ �� ����������");
		} else if (alpha == 90 || beta == 90 || gamma == 90) {
			System.out.println("����������� �������������");
		} else {
			System.out.println("����������� �� �������������");
		}

	}

}
