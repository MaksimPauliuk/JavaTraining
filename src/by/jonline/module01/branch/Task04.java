package by.jonline.module01.branch;

/*
 * ������ ������� �, � �������������� ��������� � ������� �, �, z �������. 
 * ����������, ������� �� ������ ����� ���������.

 */

public class Task04 {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 2.1;
		double x = 2;
		double y = 1;
		double z = 3;
		double minOtv;
		double maxOtv;
		double minStorona = a;
		double sredStorona = b;

		minOtv = Math.min(a, b);
		maxOtv = Math.max(a, b);

		if (x <= y && x <= z) {
			minStorona = x;
			if (y <= z) {
				sredStorona = y;
			} else {
				sredStorona = z;
			}
		}
		if (y <= x && y <= z) {
			minStorona = y;
			if (x <= z) {
				sredStorona = x;
			} else {
				sredStorona = z;
			}
		}
		if (z <= x && z<= y) {
			minStorona = z;
			if (x <= y) {
				sredStorona = x;
			}
			else {
				sredStorona = y;
			}
		}
		
		if(minStorona<minOtv && sredStorona<maxOtv) {
			System.out.println("������ �������");
		}
		else {
			System.out.println("������ �� �������");
		}
		
	}

}
