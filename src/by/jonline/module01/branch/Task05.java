package by.jonline.module01.branch;

/*
 * ��������� �������� �������: F(x) = {x*x - 3x + 9, ���� x<= 3 
 * 1 / (x^3 + 6), ���� x > 3
 */

public class Task05 {

	public static void main(String[] args) {
		double x = 4;
		double f;

		if (x <= 3) {
			f = x * x - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("F(x) = " + f + ", ��� x = " + x);
	}

}
