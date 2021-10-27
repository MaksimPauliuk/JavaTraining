package by.jonline.module02.decomposition;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task06 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 8;
		int c = 9;

		System.out.print("Числа " + a + " " + b + " " + c);
		if (!hasRelativePrime(a, b, c)) {
			System.out.print(" не");
		}
		System.out.print(" взаимно просты");

	}

	public static int calculateNod(int A, int B) {	
		int maxDivider = A;

		while (maxDivider > 0) {
			if (A % maxDivider == 0 && B % maxDivider == 0) {
				break;
			}
			maxDivider--;
		}
		return maxDivider;
	}

	public static boolean hasRelativePrime(int A, int B, int C) {
		if (calculateNod(A, B) * calculateNod(B, C) * calculateNod(A, C) == 1) {
			return true;
		} else
			return false;
	}

}
