package by.jonline.module01.cycle;

/*
 * ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, 
 * ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
 * a(n) = 1/2^n + 1/3^n
 */

public class Task05 {

	public static void main(String[] args) {
		double e = 0.0005;
		double sum = 0;
		double n = 8;
		double an;
		
		for (int i = 1; i<= n; i++) {
			an=1/Math.pow(2, i) + 1/Math.pow(3, i);
			if (Math.abs(an)>=e) {
				sum+=an;
			}
		}
		
		System.out.println("����� ������ ���� = " + sum);

	}

}
