package by.jonline.module01.cycle;

import java.math.BigInteger;

/*
 * ��������� ��������� ���������� ������������ ��������� ������ ������� �����
 */

public class Task04 {

	public static void main(String[] args) {
		BigInteger res = BigInteger.valueOf(1);

		for(int i = 2; i <= 200; i++) {
		    res = res.multiply(BigInteger.valueOf(i * i));
		}

		System.out.println("������������ ��������� ������� 200 ����� = " + res);
	}

}
