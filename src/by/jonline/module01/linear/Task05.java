package by.jonline.module01.linear;

/*
 * ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. 
 * ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:
 * ��� ����� SSc.
 */

public class Task05 {

	public static void main(String[] args) {
		int T = 4895;
		int HH;
		int MM;
		int SS;

		HH = T / 3600;
		MM = (T - HH * 3600) / 60;
		SS = T % 60;

		System.out.println(T + " ������ = " + HH + "� " + MM + "��� " + SS + "c");

	}

}
