package by.jonline.module01.linear;

/*
 * ���� �������������� ����� R ���� nnn.ddd 
 * (��� �������� ������� � ������� � ����� ������). 
 * �������� ������� ������� � ����� ����� ����� 
 * � ������� ���������� �������� �����.
 */

public class Task04 {

	public static void main(String[] args) {
		double R = 356.918;
		int intPart;
		int fractPart;

		intPart = (int) R;
		fractPart = (int) (R * 1000 - intPart * 1000);

		System.out.println(fractPart + "." + intPart);

	}

}
