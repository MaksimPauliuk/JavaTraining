package by.jonline.module01.cycle;

/*
 * ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
 */

public class Task08 {

	public static void main(String[] args) {
		int a = 614562510;
		int b = 83244622;
		int numA;
		int numB;

		int i = 0;

		System.out.print("� ��� ����� ������ �����: ");
		while (i < 10) {
			boolean fl = false;
			int tempA = a;
			do {
				numA = tempA % 10;
				if (numA == i) {
					int tempB = b;
					do {
						numB = tempB % 10;
						if (numB == i) {
							System.out.print(i + " ");
							fl = true;
						}
						tempB = tempB / 10;
					} while (tempB != 0 && fl == false);
				}
				tempA = tempA / 10;
			} while (tempA != 0 && fl == false);
			i++;
		}

	}
}
